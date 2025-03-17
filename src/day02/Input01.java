package day02;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {

		// Input Class
		// console input : 콘솔에서 값을 입력받는 것을 의미
		// Scanner Class > (console 에서 입력을 받는것) : 반드시 객체를 생성 후 사용 new 키워드
		// 클래스명 객체이름 = new 클래스명(값)
		// String a = "abc";
		// 객체명.next(); : 한단어만 입력(문자)
		// 객체명.nextLine(); : 공백 포함
		// 객체명.nextInt();	: 정수 입력
		// 객체명.next자료형(); : 기본 자료형
		
		
		// Scanner 객체명 = new Scanner(System.in);
		// 객체명.close();
		// 위에 두 구문을 괄호{} 처럼 묶어서 하나의 덩어리로 생각하는것이 차후 Scanner 관리에 용하다.
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자입력 >");
//		int num = sc.nextInt();
//		System.out.println(num);
//		
//		if(num%2 == 0) {
//			System.out.println("짝수");
//		}else if(num%2 > 0) {
//			System.out.println("홀수");
//		}
//		System.out.println("소수점을 포함한 수를 입력>");
//		double d = sc.nextDouble();
//		System.out.println(d);
		
		System.out.println("문자입력 >");
		String str = sc.next();
		System.out.println(str);
		
		sc.nextLine(); // Enter(공백) 처리용 
		
		System.out.println("여러단어입력 >");
		String str1 = sc.nextLine();
		System.out.println(str1);
		
		
		
		
		
		sc.close();

		
		
		
	}

}
