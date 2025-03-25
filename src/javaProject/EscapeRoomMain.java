package javaProject;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EscapeRoomMain {

	public static void main(String[] args) throws IOException, InputMismatchException {

		Scanner sc = new Scanner(System.in);
		Character player = new Character();
		EscapeRoomController roomController = new EscapeRoomController();
		Screen screen = new Screen();
		

		String starter = ""; // 게임 시작 여부
		int menuSelect = 0, shouldSolveProblem = 0, roomIndex = 0, itemIndex = 0;
		String answer = "";
		boolean gameClear = false;

		// 기본 방 구성 세팅
		roomController.settingRoom();
		roomController.shuffleRoom();
		
		// 시작화면.
		screen.printMain();

		start: while (true) {
			System.out.println("게임을 시작하시겠습니까? (Y/N)");
			starter = sc.next();

			if (starter.equalsIgnoreCase("Y")) {
				screen.printVoid();
				System.out.println("방탈출을 시작합니다.");
				roomController.loadingRoom();
				

				escapeGame: do {
					// 방 인덱스 마다 화면 위치 표현.
					System.out.println();
					roomController.infomationRoom(roomIndex);
					roomController.printRoom(roomIndex);
					player.printCharacterLife();
					System.out.println("==============================================================");
					System.out.println("	 1.움직이기 | 2.소지품확인 | 3.방둘러보기 | 4.지상으로가기");
					System.out.println("==============================================================");
					
					while(true) {
						try {
						menuSelect = sc.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("<정수가 아닙니다>");
							menuSelect = 0;
							sc = new Scanner(System.in);
						}
						break;
					}
					
					switch (menuSelect) {
					case 1:
						System.out.println("==============================================================");
						System.out.println("	     이동할 방향을 선택하세요 ( W | A | S | D ) ");
						System.out.println("==============================================================");
						
						roomIndex = roomController.directionRoom(sc);
						break;

					case 2:
						player.printCharacterItem();
						break;

					case 3:
						roomController.searchRoom(roomIndex);

						if (roomController.getRoomList().get(roomIndex).getIsClear()) {
							System.out.println("이미 문제를 클리어한 방입니다.");
							continue escapeGame;
						} else {
							System.out.println("1.문제풀기 / 2.돌아가기");
							while(true) {
								try {
								shouldSolveProblem = sc.nextInt();
								} catch (InputMismatchException e) {
									System.out.println("<정수가 아닙니다>");
									shouldSolveProblem = 0;
									sc = new Scanner(System.in);
								}
								break;
							}

							switch (shouldSolveProblem) {
							case 1:
								System.out.println("정답을 입력하세요:");
								answer = roomController.isCorrect(roomController.getRoomList().get(roomIndex).getRoomNumber(), sc);

								if (answer.equals("정답")) {
									screen.correctPrint();
									System.out.println();
									roomController.clearRoom(roomIndex);
									System.out.println();
									roomController.PrintRewordItem(roomIndex);
									player.getItem().add(itemIndex, roomController.rewordItem(roomIndex));
									itemIndex++;
								} else if (answer.equals("오답")) {
									screen.wrongPrint();
									System.out.println();
									System.out.println("틀렸습니다! (체력 -1)");
									player.setCharaterLife(player.getCharaterLife() - 1);
									player.printCharacterLife();
								}
								answer = null;
								break;

							case 2:
								System.out.println("다른 방을 더 둘러보자.");
								System.out.println();
								continue escapeGame;

							default:
								System.out.println("다시 입력해주세요.");
								System.out.println();
								break;
							}
						}
						break;
					// 마지막 방 넘어가기.
					case 4:
						// 테스트
						player.getItem().add("1");
						player.getItem().add("1");
						player.getItem().add("1");
						player.getItem().add("1");
						player.getItem().add("1");
						player.getItem().add("1");
						// 테스트 지우기 //
						
						if(player.getItem().size() < 6) {
							System.out.println("아직은 갈 수 없다...");
							System.out.println();
						}else {
							gameClear = roomController.miniGame();
							
							// 최종방을 클리어 했을경우.
							if(gameClear) {
								screen.printVoid();
								screen.gameClearPrint();
								break start;
							// 최종방을 클리어 하지 못한경우.
							}else {
								System.out.println("실패했습니다.. (체력 -3)");
								player.setCharaterLife(player.getCharaterLife() - 3);
								player.printCharacterLife();
							}
						}
						break;
						
						default:
							System.out.println("다시 입력해주세요.");
						break;
					}

					if (player.getCharaterLife() <= 0) {
						screen.gameOverPrint();
						System.out.println("체력이 다 떨어졌습니다...");
						break start;
						
						// 모든 방을 클리어 했을시 최종 문제 출력.(소지품 6개 보유)
					}

				} while (true);

			} else if (starter.equalsIgnoreCase("N")) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
		sc.close();
	}
}