package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		/* 과제
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산 결과를 출력
		 * ex) 2 3 + => 2 + 3 = 5
		 * ex) 2 2 * => 2 * 2 = 4
		 * ex) 2 3 ! => 잘못된 연산자
		 * 연산자는 + - * / % 만 가능
		 * 다른 종류의 특수문자가 들어오면 잘못된 연산자로 출력
		 */
		
		// 문자로 받는 케이스 : String == 비교 불가능 
		// 한글자만 받는 케이스 : char == 비교 가능 (charAt)
		// 객체명.next(); : 한단어를 입력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하십시오 :");
		int number1 = sc.nextInt(); // 첫번째 정수
		
		System.out.print("정수를 입력하십시오 :");
		int number2 = sc.nextInt(); // 두번째 정수
			
		
		System.out.print("연산자를 입력하십시오 :");
		char ch = sc.next().charAt(0); // 첫번째 위치를 char 로 리턴 컴퓨터는 첫번째를 0으로 항상 인식함.
		
		
		
		// switch case 조건문에서 계산기 '/', '%'에서 정수가 0일 경우 "0을 입력하셨습니다." 출력
		
		
		switch(ch) {
		case '+':
			System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
			break;
			
		case '-':
			System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
			break;
			
		case '*':
			System.out.println(number1 + " * " + number2 + " = " + (number1*number2));
			break;
			
		case '/':
			if(number2 == 0 || number1 == 0) {
				System.out.println("0을 입력하셨습니다.");
			}else {
				System.out.println(number1 + " / " + number2 + " = " + ((double)number1/number2));
			}
			break;
			
		case '%':
			if(number2 == 0 || number1 == 0) {
				System.out.println("0을 입력하셨습니다.");
			}else {
				System.out.println(number1 + " % " + number2 + " = " + (number1%number2));
			}
			break;
			default:
				System.out.println("잘못된 연산자");
			
		}
		
		
		
		
		//if 문에서 계산기 '/', '%'에서 정수가 0일 경우 "0을 입력하셨습니다." 출력
		
		
//		if(ch == '+') {
//			System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
//			
//		}else if(ch == '-') {
//			System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
//			
//		}else if(ch == '*') {
//			System.out.println(number1 + " * " + number2 + " = " + (number1*number2));
//			
//		}else if(ch == '/') {
//			if(number1 == 0 || number2 ==0){
//		System.out.println("0을 입력하셨습니다.");
//		}else{
//			System.out.println(number1 + " / " + number2 + " = " + ((double)number1/number2));
//		}		
//		
//			
//		}else if(ch == '%') {
//		if(number1 == 0 || number2 ==0){
//			System.out.println("0을 입력하셨습니다.");
//			}else{
//			System.out.println(number1 + " % " + number2 + " = " + (number1%number2));
//			}		
//			
//		}else {
//			System.out.println("잘못된 연산자");
//		}
		
		sc.close();
		
		
	}

}
