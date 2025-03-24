package javaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniGame {
	
	public void bingoGame() {
		
		// bingo ArrayList 생성.
		ArrayList<String> bingo = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		// 빈공간이 9개인 빙고생성.
		for(int i=0; i<9; i++) {
			bingo.add(" ");
		}
		
		int end = -1;
		System.out.println("[1] [2] [3]");
		System.out.println("[4] [5] [6]");
		System.out.println("[7] [8] [9]");
		System.out.println("O를 입력할 빙고판 번호를 입력해주세요 >");
		while(end != 0) {
			
			System.out.println("종료하고싶으면 언제든 [0] 을 누르세요, 계속 할거면 [1]");
			end = sc.nextInt();
			System.out.println("숫자 입력>");
			
			// 플레이어 입력
			for(int i=0; i<bingo.size(); i++) {
				int inputBingo = sc.nextInt();
				if(bingo.get(inputBingo-1).equals(" ")) {
					bingo.set(inputBingo-1, "O");
					break;
				}else {
					System.out.println("이미 자리가 있습니다! 다시입력해주세요.");
					continue;
				}
			}
			// 컴퓨터 입력
			for(int i=0; i<bingo.size(); i++) {
				int random = (int)(Math.random()*9);
				if(bingo.get(random).equals(" ")) {
					bingo.set(random, "X");
					break;
				}else {
					continue;
				}
				
			}
			// 출력.
			printBingo(bingo);
			
			// 승리조건.
		}
		
	}
	
	public void printBingo(ArrayList<String> bingo) {
		
		for(int i=0; i<bingo.size(); i++) {
			System.out.print("["+bingo.get(i)+"]" + " ");
			if(i == 2) {
				System.out.println();
			}else if(i == 5) {
				System.out.println();
			}
		}
		System.out.println();
	}

}
