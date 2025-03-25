package javaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniGame {
	private String answer;
	
	// 1. 빙고게임
	public int bingoGame() throws IndexOutOfBoundsException {
		
		// bingo ArrayList 생성.
		ArrayList<String> bingo = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		// 빈공간이 9개인 빙고생성.
		for(int i=0; i<9; i++) {
			bingo.add(" ");
		}
		
		int end = -1;
		System.out.println();
		System.out.println("	       << 빙고 게임!! >>");
		System.out.println();
		System.out.println("		[1] [2] [3]");
		System.out.println();
		System.out.println("		[4] [5] [6]");
		System.out.println();
		System.out.println("		[7] [8] [9]");
		System.out.println();
		System.out.println("< O를 그릴 번호를 입력해주세요! >");
		while(true) {
			if(end == 1 || end == 0) {
				break;
			}
			System.out.println();
			System.out.println("입력 >");
			
			// 플레이어 입력
			for(int i=0; i<bingo.size(); i++) {
				int inputBingo = sc.nextInt();
				if(inputBingo > bingo.size() || inputBingo < 0) {
					System.out.println("숫자를 다시 입력해주세요.");
				}else {
					if(bingo.get(inputBingo-1).equals(" ")) {
						bingo.set(inputBingo-1, "O");
						break;
					}else {
						System.out.println("이미 자리가 있습니다! 다시입력해주세요.");
						continue;
					}
				}
			}
			// 컴퓨터 입력 / 다 만들고 쓰레드로 딜레이 걸어보자.
			for(int i=0; i<bingo.size(); i++) {
				int random = (int)(Math.random()*9);
				if(bingo.get(random).equals(" ")) {
					deleyBingo();
					bingo.set(random, "X");
					break;
				}else {
					continue;
				}
				
			}
			// 출력.
			printBingo(bingo);
			
			// 승리조건.
			// 0 1 2
			// 3 4 5
			// 6 7 8
			int w = 0;
			
			// 돌다가 인덱스 범위를 초과하니
			for(int i=0; i<3; i++) {
				// 플레이어가 승리면 1, 패배면 0
				// 세로.
				if(bingo.get(i).equals("O") && bingo.get(i+3).equals("O") && bingo.get(i+6).equals("O")) {
					end = 1;
				}else if(bingo.get(i).equals("X") && bingo.get(i+3).equals("X") && bingo.get(i+6).equals("X")) {
					end = 0;
				}
				// 가로.
				if(bingo.get(w).equals("O") && bingo.get(w+1).equals("O") && bingo.get(w+2).equals("O")) {
					end = 1;
				}else if(bingo.get(w).equals("X") && bingo.get(w+1).equals("X") && bingo.get(w+2).equals("X")) {
					end = 0;
				}
				// 반복문마다 증가.
				w += 3;
				// 오른쪽 대각선.
				if(bingo.get(0).equals("O") && bingo.get(4).equals("O") && bingo.get(8).equals("O")) {
					end = 1;
				}else if(bingo.get(0).equals("X") && bingo.get(4).equals("X") && bingo.get(8).equals("X")) {
					end = 0;
				}
				// 왼쪽 대각선.
				if(bingo.get(2).equals("O") && bingo.get(4).equals("O") && bingo.get(6).equals("O")) {
					end = 1;
				}else if(bingo.get(2).equals("X") && bingo.get(4).equals("X") && bingo.get(6).equals("X")) {
					end = 0;
				}
			}
		}
		if(end == 1) {
			System.out.println();
			System.out.println("<<플레이어 승리!!>>");
		}else if(end == 0 || bingo.size() == 9) {
			System.out.println();
			System.out.println("<<플레이어 패배...>>");
		}
		System.out.println("게임종료.");
		// 승리일경우 1, 패배일경우 0을 리턴
		return end;
	}
	// 빙고출력
	public void printBingo(ArrayList<String> bingo) {
		
		for(int i=0; i<bingo.size(); i++) {
			System.out.print("["+bingo.get(i)+"]" + " ");
			if(i == 2) {
				System.out.println();
				System.out.println();
			}else if(i == 5) {
				System.out.println();
				System.out.println();
			}
		}
		System.out.println();
	}
	// 컴퓨터 차례..
	public void deleyBingo() {
		try {
			System.out.println("상대가 고민하고 있습니다.");
			Thread.sleep(1000);
			System.out.println("상대가 고민하고 있습니다..");
			Thread.sleep(1000);
			System.out.println("상대가 고민하고 있습니다...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("입력 완료!");
		System.out.println();
	}
	
	
	
	// 2. 기억력테스트
	public int memoryGame() {
		int end = 0;
		String input = "";
        System.out.println("\n << 기억력 테스트 >>\n");

        answer = generateRandomCode(5); // 5자리 랜덤 문자열 생성
        System.out.println("3초 동안 아래 문자열을 외우세요!");
        System.out.println("> " + answer); // 사용자에게 정답 문자열 보여주기

        waitSeconds(3); // 3초 대기
        clearScreen();  // 화면 지우기 효과

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 >> ");
        input = sc.next();
      
        // 입력값과 정답 비교
        if (input.equalsIgnoreCase(answer)) {
        	end = 1;
        	System.out.println("\n 정답입니다! 축하합니다, 게임 탈출 성공! ");
        	return end;
            
        } else {
            System.out.println("\n 틀렸습니다! 정답은 [" + answer + "] 이었습니다.");
            return end;
            //System.out.println("아쉽지만 탈출 실패입니다...");
        }
    }

    // 랜덤한 문자열 생성 메서드
    private String generateRandomCode(int length) { //대문자/숫자 조합 랜덤 생성
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // 사용할 문자 목록
        StringBuilder sb = new StringBuilder(); // 문자열을 하나씩 추가할 StringBuilder
        for (int i = 0; i < length; i++) {
            int index = (int)(Math.random() * chars.length()); // 랜덤 인덱스 선택
            sb.append(chars.charAt(index)); // 랜덤 문자 추가
        }
        return sb.toString(); // 완성된 문자열 반환
    }

    // 일정 시간 대기시키는 메서드
    private void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // 밀리초 단위로 변환 후 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 화면을 지우는 듯한 효과를 주기 위한 메서드 (줄바꿈 반복)
    private void clearScreen() {
        for (int i = 0; i < 200; i++) {
            System.out.println(); // 줄바꿈 여러 번 출력해서 이전 내용 밀어냄
            if(i == 140) {
            	System.out.println("설마 기억 안나서 올려보는건 아니죠???????????????");
            }else if(i == 100) {
            	System.out.println("아직도 올려보시나요???????");
            }else if(i == 80) {
            	System.out.println("당신의 기억력에 실망했습니다....");
            }else if(i == 40) {
            	System.out.println("진짜 이걸 찾아서 보시네요!!");
            }else if(i == 0) {
            	System.out.println("자 답을 보세요~!");
            	System.out.println();
            	System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
            	System.out.println("*/*/*/*/*/*/당신은 금붕어!!*/*/*/*/*/*/*");
            	System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
            }
        }
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

