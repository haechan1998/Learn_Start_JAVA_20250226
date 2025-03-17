package day01;

public class Operater {

	public static void main(String[] args) {
		
		//연산자
		
		/* 대입 연산자 :  =  +=  -=.... / = 을 기준으로 오른쪽에 있는 값을 왼쪽 변수에 저장
		 * *왼쪽은 반드시 변수여야함*
		 * 
		 * 
		 */		
		
		int a = 1;
		int b = 5;
		
		a += b;
		
		System.out.println(a); // 6
		
		// 변수 a 를 다시 1로 초기화
		
		a = 1;
		a += 20;
		
		System.out.println(a); // 21
		
		// 증감 연산자
		// a++ = 출력 후 증가, ++a 증가 후 출력 /단항 연산자라 순서에 차이가 있다.
		
		// 산술 연산자 : + - * / %(나머지 연산자는 기본적으로 나누기를 포함하고있음)
		/*
		 * 정수 / 정수 = 정수
		 * 정수 / 실수 = 실수
		 * 실수 / 정수 = 실수
		 * 실수 / 실수 = 실수
		 * 
		 * 정수 / 0 > 예외발생 (Exception)
		 * 실수 / 0 > infinity 발생
		 */		
		
		/* 비교연산자 : 비교연산의 결과는 반드시 true / false
		 *  >  <  >=  <=  !=  ==
		 * 
		 * a && b : a 와 b 둘다 참이여야 true
		 * a || b : a 또는 b 둘중 하나가 참이여야 true	
		 * !a 	  : a 조건의 결과 반대
		 */		
		System.out.println(!(3>2)); // 2<3
		
		int number = 1;
		int number2 = 2;
		
		System.out.println(number + number2);
		System.out.println(number + number2 + " 하이 나는 꼽사리"); // 괄호 없이 연결 연산자가 나온 뒤부터 전부 문자처리
		System.out.println(number + number2 + " 하이 나는 꼽사리" + number); // 3 하이 나는 꼽사리1
		System.out.println(number + number2 + " 하이 나는 꼽사리" + number + number2); // 3 하이 나는 꼽사리12
		// 정상적으로 출력하고 싶으면 괄호 처리
		
		// 조건선택 연산자(삼항연산자) : (조건식)? true : false
		System.out.println((3>2)? "3이 더 크다." : "3이 더 작다.");
		
		/* 문제
		 * num 변수를 선언하고, 값을 입력
		 * num 이 짝수인지 홀수인지 판별.
		 * 조건석택 연산자 사용
		 */
		
		int num = 1010102341; 
		int num2 = num%2; // 홀수일경우 1남는다. 짝수일경우 0
		System.out.println((num2 <= 0)? "짝수" : "홀수"); // 작동은 잘 되지만 음수일경우? 해당사항은 틀릴 수 있음!
		
	}
	
}