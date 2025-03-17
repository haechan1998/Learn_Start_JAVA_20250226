package day03;

import java.util.Random;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 주사위 게임 주사위를 던져서 총 30칸을 이동하는 게임
		 * 
		 * 주사위는 랜덤으로 생성(1부터 6까지)해서 1번만 던진다. 주사위를 던지기 위한 입력값 생성.
		 * 
		 * ex) 주사위 : 3 3칸전진 => 27칸 남았습니다. 주사위 : 1 1칸전진 => 26칸 남았습니다. 주사위 : 6 6칸전진 => 20칸
		 * 남았습니다.
		 * 
		 * ...
		 * 
		 * 도착~!! 총 이동횟수 : 10번 => 주사위를 던진 횟수
		 * 
		 */

		// while 문

		Scanner sc = new Scanner(System.in);

		int sum = 0; // 거리 누적 값 (주사위 누적)
		int count = 0; // 주사위 던진 횟수(이동횟수)
		int last = 30; // 최종 목표 이동 수

		System.out.println("게임 시작 주사위를 던져주세요.(enter)");

		while (sum < last) { // while 문 안에서 변수를 선언 할 경우 계속 초기화 되어야 가능한 상황에서만 사용

			sc.nextLine(); // enter 를 이용해서 주사위를 던질 수 있게 해줌

			int random = (int) (Math.random() * 6) + 1; // 랜덤수가 계속 변해야 하는 경우면 반복문 내부에, 아닌 경우에는 반복문 외부로 뺀다.

			System.out.println("주사위 :" + random);
			sum += random; // 발생거리 합산
			count++;
			System.out.println(random + "칸 전진 => " + (last - sum) + "칸 남았습니다.");

		}
		System.out.println("도착!, 이동횟수 :" + count);
		sc.close();

		// for 문

//		Scanner sc = new Scanner(System.in);
//		
//		int starter = 0;
//
//		int resultScore = 30;
//
//		System.out.println("주사위 던지기 게임");
//		
//		for (; resultScore > 0;) { // resultScore <= 0 일경우 반복문 종료
//			System.out.println("주사위를 던지려면 [1]");
//			starter = sc.nextInt();
//			if (starter == 1) {
//				System.out.println("주사위를 던졌습니다.");
//				int random = (int)(Math.random() * 6) + 1;
//				
//					System.out.println("주사위가 " + random + "칸 나왔습니다"); // 주사위 random
//					resultScore -= random;
//					System.out.println("<남은 거리가 " + resultScore + "칸 남았습니다.>");
//			
//			}
//		}
//		System.out.println("게임이 끝났습니다!!");
//		sc.close();

	}

}
