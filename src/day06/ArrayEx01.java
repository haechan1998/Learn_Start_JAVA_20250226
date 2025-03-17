package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 (각 자리수는 0~9 의 수)
		 * => 배열로 저장 (랜덤) (중복 불가능)
		 * 유저는 3자리 숫자를 입력하여 맞추는 게임
		 * => 중복되지 않게 3자리 입력
		 * 자리와 숫자가 일치하면 strike
		 * 자리는 일치x 숫자만 일치하면 ball
		 * 아무것도 맞지 않으면 out
		 * 
		 * ex) com : 1 2 3
		 * 		me : 1 8 9 strike 1개
		 * 		me : 9 8 7 out
		 * 		me : 1 3 2 strike 1개 ball 2개
		 * 		me : 1 2 3 strike 3개 정답
		 * */
		
		// 입력받아야 하는 게임 Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("야구게임!!");
		System.out.println("컴퓨터가 생성한 3개의 랜덤수(1~9)를 맞추세요");


		// 컴퓨터가 출력할 랜덤수 for 문
//		for(int i = 0; i < com.length; i++) {
//			// 컴퓨터가 가질 랜덤수 1~9
//			com[i] = (int) (Math.random() * 9) + 1; // 랜덤수를 배열에 저장
//			// 랜덤수 중 같은수가 중복으로 나올경우.
//			for(int j = 0; j < i; j++) {
//				if(com[i] == com[j]) {
//					i--; // i를 for 조건문에 만족하지 않기때문에 if 문을 탈출할때까지 계속 반복해서 중복되는 값을 피한다.
//				}
//			}
//			System.out.print(com[i]+ " ");
//		}
		
		System.out.println();
		// 셔플로 랜덤 중복 피하기
		int ranNum[] = new int[9];
		for(int i = 0; i < ranNum.length; i++) {
			ranNum[i] = i + 1;
		}
		
		int r = 0;
		int tmp = 0;
		
		for(int i =0; i < ranNum.length; i++) {
			r = (int)(Math.random()*9);
			tmp = ranNum[i];
			ranNum[i] = ranNum[r];
			ranNum[r] = tmp;
		}
		// 컴퓨터 배열
		int[] com = new int[3];
		for(int i = 0; i<com.length; i++) {
			com[i] = ranNum[i];
		}
		System.out.println(Arrays.toString(com));
		
		while (true) {

			int strike = 0, ball = 0, out = 0;
			int[] user = new int[3];
			System.out.print("중복되지 않는 숫자 3개를(1~9) 입력하세요 >");

			for (int i = 0; i < user.length; i++) {
				user[i] = sc.nextInt();
				for (int j = 0; j < com.length; j++) {
					if (user[i] == com[j] && i == j) {
						strike++;
					}else if (user[i] == com[j] && i != j) {
						ball++;
					}
				}

			}if (strike == 0 && ball == 0) {
				System.out.println("out");
			}else {
				System.out.println(strike + "s" + ball + "b");

			}if (strike == 3) {
				System.err.println("종료");
				break;

			}
		}

		sc.close();
		
			
			
		
		
	}

}
