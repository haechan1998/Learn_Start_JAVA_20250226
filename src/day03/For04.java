package day03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		/* 약수 : 나누어서 떨어지는 수의 집합
		 * 6의 약수 : 1~6까지 나누어 떨어지는 수 
		 * 6의 약수 : 6/1=0 / 6/2=0, 6/3=0, 6/4=2, 6/5=1, 6/6=0
		 * 1 2 3 6
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		
		//6의 약수 구하기
		
//		int num = 6;
//		
//		for(int i = 1; i <= 6; i++) {
//			if(num % i == 0) {
//				System.out.print(i + " ");
//			}else {
//			} // if 문
//		} // for 문
		
		// 값을 입력받아서 약수 구하기
		
		System.out.println("\n-------------------------------");
		
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				System.out.print(i + " ");
			}else {
			} // if 문
		} // for 문
		
		sc.close();
		
		
	}
}
