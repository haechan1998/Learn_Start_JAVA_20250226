package day02;

public class If01 {

	public static void main(String[] args) {
		/*
		 * 조건문 if문 : switch문
		 * if문 : 조건식을 주고, 조건식이 참이면 / 거짓이면 값을 주는 구조
		 * if(조건식) {실행문;} if
		 * 
		 * 
		 * 실행문이 한줄이면 중괄호 생략가능. / 그냥 중괄호 써버릇 하는게 습관에 좋다.
		 */
		// num 가 0보다 크면 양수 / 0보다 작으면 음수 / 0이면 0입니다. 출력
		
		// num 가 짝수인지 홀수인지 출력
		
		int num = -11;
		
		if(num > 0) {
			System.out.println("양수");
		}else if(num < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0입니다.");
		}	
		if(num%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		// 출력해야하는 조건이 많은경우 if문을 분할해서 사용하는게 편리하다.
		
	
			
	}
}