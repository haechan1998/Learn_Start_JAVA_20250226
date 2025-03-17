package day01;

public class Helloworld {

	public static void main(String[] args) {

							// 	주석 : 프로글매이 읽지 않는 라인 단축기 : ctrl + /
							/*	여러줄 주석 : 단축기 : ctrl + shift + / 
							 * 	console : 출력
							 * 	println : 줄바꿈을 포함하는 출력
							 * 	print : 줄바꿈을 포함하지 않는 출력
							 * 	printf : 형식을 가지는 출력 (주로 c언어에서 주로 사용)
							 * 	
							 * 	문자열(String)은 "" , 한글자(char) '' , 숫자는 안씀
							 * 	
							 * */
		
		String str = "string";
		
		System.out.println("Hello world!"); // 기본 출력 구문
		System.out.println(123);
		System.out.println('a');
		System.out.println(str);
		
							// 기본 자료형 > 초기값을 가지지 않으면 컴파일에러가 난다.
							/* 변수 (variable)
							 * 
							 * 정수
							 * byte = 1byte > 8bit (-128 ~ 127)
							 * char = 2byte > 16bit   
							 * short = 2byte > 16bit 
							 * int = 4byte > 32bit
							 * long = 8byte > 64bit
							 * 
							 * 실수
							 * float = 4byte > 32bit 표현할때 0.0f 처럼 접미사 f를 붙힌다. 
							 * double = 8byte > 64bit 표현할때 0.0L 을 붙여도 되지만 안붙혀도 된다. 
							 *  
							 * 논리
							 * boolean = 1byte > 8bit ture, false
							 *  
							 *  
							 *  */
		
//	-----------------------------------------------------------------------
		
		int number = 100; // 중복 선언 X
		number = 200; // = number += 100; (기존 number 에 + 100), 기존 변수값은 덮어쓴다.
		
		int num1 , num2, num3;
		
		num1 = 10;
		num2 = 20;
		num3 = 30;
		
		int total = num1 + num2 + num3;
		
		System.out.println(total);
		
		// 기본 자료형 8가지 지역변수범위 {} *중요
		// 조건문 알고리즘 이해하는 것에 큰 도움이 될것
		
		
		
	}

}
