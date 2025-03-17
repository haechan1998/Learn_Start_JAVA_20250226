package day02;

import java.nio.file.spi.FileSystemProvider;

public class For05 {

	public static void main(String[] args) {
		
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법 
		 * for, while, do ~ while 
		 * - for, while 문은 동작방식이 같음.
		 * => 조건에 따라 조건이 맞지 않으면 한번도 실행되지 않을 수 있음 
		 * 
		 * do ~ while  문 : 조건에 맞지 않아도 무조건 1번은 실행함.
		 * 
		 * for(초기화; 조건식; 증감식) {
		 * 	실행문;
		 * }
		 * 
		 * - 초기화 : 실행문을 반복하기위한 변수를 초기화하는 기능, 처음 한번만 실행 / 생략가능
		 * - 조건식 : 반복을 경정하는 기능을 한다. ( true => 반복, false => 정지) / 생략가능
		 * - 증감식 : 조건식에서 사용할 변수를 증가 / 감소시켜 반복횟수를 조절 / 생략가능
		 * 
		 * 전부 생략하였을경우 for(;;)
		 * 
		 */		
		
		
		
		
//		for(int i = 0; i <= 9; i++) {
//			System.out.println("안녕하세요");
//			System.out.println(i);
//		}
		
		
		
		
		System.out.println("-----------------------------");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		// 1 ~ 10중 짝수만 출력
		System.out.println("-----------------------------");
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("-----------------------------");
		
		for(int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
//		System.out.println("-----------------------------");
//		int even = 0;
//		for(int i = 1; i <= 5; i++) {
//			even = even + 2;
//			System.out.println(even);
//		}
		System.out.println("-----------------------------");
		
		int even = 0;
		
		outer :for(int i = 1; ; i++) { // 중첩 for 문일경우 네이밍을 할 수 있
			even = even + 2;
			System.out.println(even);
			if(even == 10) {
				break;
			}
		}
		
		
		
		
//		System.out.println("-----------------------------");
//		// 10 ~ 1 까지 출력
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//		}
//		
		System.out.println("-----------------------------");
		
		
		// 1 ~ 10까지의 랜덤수 5개 출력
		System.out.println("(1~10까지 랜덤수)");
		for(int i = 0; i < 5; i++) {
			int random = (int)(Math.random() * 10) + 1;
			System.out.println(random);
		}
		System.out.println("-----------------------------");
		
		// 1 ~ 10까지의 합계 출력
		
		int num = 0;
		
		for(int i = 1; i <= 10; i++) {
			
		num += i; // 왼쪽 값에 오른쪽을 저장~ for 문을 사용할시 반복 횟수만큼 num에 누적
		}
		System.out.println(num);
		
		
		
		
	}

}
