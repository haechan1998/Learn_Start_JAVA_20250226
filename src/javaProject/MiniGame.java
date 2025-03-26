package javaProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniGame {
	private String answer;
	private Screen screen = new Screen();
	
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
    
    // 3. 미로 게임
    public int mazeGame() {
    	int end = 0;
    	System.out.println();
    	System.out.println("			<< 미로 게임 >>");
    	System.out.println("		       탈출구를 찾으세요!!");
    	Scanner sc = new Scanner(System.in);
    	
    	screen.mazePrint();
    	while(true) {
    		System.out.println("탈출구는? >");
    		String exit= sc.next();
    		if(exit.equals("1")) {
    			System.out.println();
    			System.out.println("실패...");
    			return end;
    		}else if(exit.equals("2")) {
    			System.out.println();
    			System.out.println("탈출!!!!!!");
    			end = 1;
    			return end;
    		}else if(exit.equals("3")) {
    			System.out.println();
    			System.out.println("실패...");
    			return end;
    		}else {
    			System.out.println("잘못입력하셨습니다.");
    			continue;
    		}
    	}
    	
    }
    
    // 4. 반응속도 게임
    public int reactionGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n<< 반응 속도 테스트 >>\n");
        System.out.println("곧 '지금!' 이라는 단어가 나옵니다. 보이자마자 Enter 키를 누르세요!");

        int end=0;
        
        
        try {
            int delay = (int) (Math.random() * 3000 + 2000); // 3~5초 랜덤 대기
            Thread.sleep(delay);

            System.err.println("지금!");
            long startTime = System.nanoTime(); // 반응 시작 시간 측정

            sc.nextLine(); // 사용자 입력 대기

            long endTime = System.nanoTime(); // 반응 끝 시간 측정
            double reactionTime = (endTime - startTime) / 1_000_000_000.0; // 초 단위 변환

            System.out.println(String.format("당신의 반응 속도: %.3f초", reactionTime));

            if (reactionTime <= 0.7) {
                System.out.println("시간 안에 성공하셨습니다!");
                end=1;
                return end;
            } else {
                System.out.println("아쉽네요~ 좀 더 빠르게 반응해보세요!");
                return end;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return end;
    }
    
    // 5. 주사위 게임
    public int diseGame() {
    	// 예전에 만둔 주사위 게임을 가져와보자
    	// 주사위 3개가 같은수로 나올경우. 주사위 수 *3 / 주사위 2개가 같은수로 나올경우. 주사위 수 / 주사위 하나만 나올경우 - 주사위수의 가장 높은 수.
    	// 스코어가 100점일경우 승리. 스코어가 -20 일경우 패배.
    	System.out.println("		<< 주사위 게임!! >>");
    	System.out.println();
    	int score = 0 , count = 0, end = 0;
    	int dise1 = 0, dise2 = 0, dise3 = 0;
    	int max = 0;
    	Scanner sc = new Scanner(System.in);
    	int start = 0;
    	diseGame:while(true) {
    		
    		System.out.println("	<< [1] 주사위 굴리기 | [2] 룰 >>");
    		System.out.print("입력 >");
    		while(true) {
    			try {
    				start = sc.nextInt();
    			} catch (InputMismatchException e) {
    				System.out.println();
    				System.out.println("정수를 입력해주세요.");
    				sc = new Scanner(System.in);
    			}
    			break;
    		}
    		
    		switch(start) {
    		case 1:
    			System.out.println("주사위를 굴립니다.");
    			try {
					Thread.sleep(500);
					System.out.println();
					System.out.println("데굴");
					Thread.sleep(500);
					System.out.println();
					System.out.println("데굴");
					Thread.sleep(500);
					System.out.println();
					System.out.println("데굴");
					Thread.sleep(1000);
					System.out.println();
					System.out.println("짠!!");
					System.out.println();
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
    			dise1 = (int)(Math.random()*6)+1;
    			dise2 = (int)(Math.random()*6)+1;
    			dise3 = (int)(Math.random()*6)+1;
    			System.out.println("=============================================");
    			System.out.println("		[" + dise1 + "]"+" "+"[" + dise2 + "]"+" "+ "[" + dise3 + "]");
    			System.out.println("=============================================");
    			// 주사위 3개중 가장 큰수 찾기.
    			max = (Math.max(dise1, (Math.max(dise2, dise3))));
    			
    			if(dise1 == dise3 && dise1 == dise2) {
    				// 주사위의 수가 3개 전부 일치할경우.
    				System.out.println();
    				System.out.println("주사위의 수가 전부 일치합니다!!");
    				System.out.println();
    				System.out.println("+"+dise1*5+"점");
    				score += dise1*10;
    			}else if(dise1 == dise3 || dise2 == dise3 || dise1 == dise2) {
    				// 주사위의 수가 2개만 일치할경우.
    				System.out.println();
    				System.out.println("주사위의 수가 2개 일치합니다!!");
    				System.out.println();
    				if(dise1 == dise3) {
    					score += dise1*5;
    					System.out.println("+"+dise1*5+"점");
    				}else if(dise2 == dise3) {
    					score += dise2*5;
    					System.out.println("+"+dise2*5+"점");
    				}else {
    					score += dise1*5;
    					System.out.println("+"+dise1*5+"점");
    				}
    			}else {
    				System.out.println();
    				System.out.println("주사위의 수가 일치하지않습니다.");
    				score -= max;
    				System.out.println();
    				System.out.println("-"+max+"점");
    			}
    			System.out.println();
    			System.out.println("	현재 점수 : " + score + "점");
    			System.out.println();
    			count++;
    			// 종료 키워드.
    			if(score >= 100) {
    				System.out.println();
    				System.out.println(count+"번의 시도끝에 "+"점수를 "+score+"점 달성했습니다.");
    				System.out.println("승리!!");
    				end = 1;
    				break diseGame;
    			}else if(score <= -20) {
    				System.out.println();
    				System.out.println(count + "번의 시도끝에  " + "점수가 "+score+"점입니다....");
    				System.out.println();
    				System.out.println("패배...");
    				break diseGame;
    			}
    			break;
    			
    		case 2:
    			System.out.println("		<규칙>");
    			System.out.println("1. 주사위 3개가 같은수로 나올경우. 주사위 수 * 10점 \n2. 주사위 2개가 같은수로 나올경우. 주사위 수 * 5점\n3. 주사위 하나만 나올경우. -(주사위수의 가장 높은 수)점");
    			System.out.println();
    			System.out.println("점수 100점 : 승리");
    			System.out.println("점수 -20점 : 패배");
    			
    			System.out.println();
    			break;
    			
    			default:
    				System.out.println("잘못입력하셨습니다.");
    				break;
    		}
    	}
    	
		return end;
    }
    
    
}