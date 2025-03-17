package day01;

public class Variable {

	public static void main(String[] args) {
		
													/* 변수 선언
													 * 자료형 변수명;
													 * 
													 * 변수 선언 + 초기화
													 * 자료형 변수명 = 값;
													 * 
													 * 
													 * 
													 * 기본데이터 타입은 초기화 해야 사용할 수 있다.
													 * 
													 */		
		
		int num = 1;  								// 선언 및 초기화
		int a = 0, b = 1, c = 2; 					// 한줄 선언 가능
													// int num = 2;  중복 선언 불가능
	
		System.out.println(num);
		
		
		char ch = 'a';
		
		System.out.println(ch);
		System.out.println((int)ch); 				// (int 로 형 변환 할 경우 아스키 코드의 숫자가 나타난다.
		
		//double
		
		double doubleNum = 3.14; 					// double 의 경우는 float 와는 다르게 레터럴 뒤에 접미사를 붙히지 않아도 된다.
		
		float floatNum = 3.14f;
		
		System.out.println(doubleNum);
		System.out.println(floatNum);
		
													// 8진수 인식 010 > 8, 16진수 인식 0x10 > 16
		
//		---------------------------------------------------------------------------------------------------------------------------------------
		
		int number = 100; 						// 중복 선언 X
		number = 200; 							// = number += 100; (기존 number 에 + 100), 기존 변수값은 덮어쓴다.
		
		int num1 , num2, num3;
			
		num1 = 10;
		num2 = 20;
		num3 = 30;
			
		int total = num1 + num2 + num3;
			
		System.out.println(total);
		
													// 기본 자료형 8가지 지역변수범위 {} *중요
													// 조건문 알고리즘 이해하는 것에 큰 도움이 될것
		
		
		// 그러면 퍼블릭 클래스에 있는 메인 메서드로 
		// 다른 프라이빗 메써드를 리턴으로 끌고오는?? > JRE 라이브러리에 있는 메써드를 호출???
			
		
		}

	}

