package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 구구단 2단 출력
		// 2*1=2 / 2*2=4/ 2*3=6.... 2*9=18
		
		// Scanner 클래스로 정수 입력 받아서 구구단 출력 
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(number + "*" + i + "=" + (number * i));
		}
		
		System.out.println("----------------------------");
		
		sc.close();
		
		
		// 중첩 for 문을 사용하여 구구단 만들기
		
		for(int i = 1; i <= 9; i++) {
			
		for(int j = 1; j <= 9; j++) {
			System.out.println(i + "*" + j + "=" + (i * j));
			if(j == 9) {
				System.out.println("----------------------------");
			} // if 문
			} // 중첩 for 문
		} // for 문
		
		
		
		
//		for(int i = 1; i <= 5; i++) {
//		System.out.println(); // 첫번째 for 문의 출력값을 비워야 중첩 for 문의 출력값이 계속 나온다.!!
//		for(int j = 1; j <= i;  j++) {
//			System.out.print("*"); // 중첩 for문 / i가 1일경우 i for 문의 실행문을 i번 만큼 실행하고나서, j for 문의 실행문을 i번 만큼 실행한다.
//		}
//	} 
		
		
		
		
		
		
		
		
		
	}

}
