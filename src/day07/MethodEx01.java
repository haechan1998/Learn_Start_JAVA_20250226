package day07;

import java.util.Scanner;

public class MethodEx01 {
	//덧셈 메서드
	public static int sum1(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	//뺄셈 메서드
	public static int sum2(int num1, int num2) {
		int result = num1 - num2;
		
		return result;
	}
	//곱셈 메서드
	public static int sum3(int num1, int num2) {
		int result = num1 * num2;
		
		return result;
	}
	//나누기 메서드
	public static double sum4(int num1, int num2) {
		double result = num1 / (double)num2;
		
		if(num1 == 0 || num2 == 0) {
			result = -199999999;
		}
		return result;
	}
	//나머지 메서드
	public static int sum5(int num1, int num2) {
		int result = num1 % num2;
		
		if(num1 == 0 || num2 == 0) {
			result = -199999999;
		}
		return result;
	}
	//실행 메서드
//	public static void start(int num1, int num2, char ch) {
//		switch(ch) {
//		case '+':
//			sum1(num1, num2);
//			break;
//		case '-':
//			sum2(num1, num2);1
//			break;
//		case '*':
//			sum3(num1, num2);
//			break;
//		case '/':
//			sum4(num1, num2);
//			break;
//		case '%':
//			sum4(num1, num2);
//			break;
//			
//		}
//		
//		
//	}
		
	

	public static void main(String[] args) {
		/* 계산기 만들기
		 * 
		 * --menu--
		 * 1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나누기 | 5.나머지 | 6.종료
		 * >> 메뉴선택 1
		 * >> 숫자 입력 1 5
		 * 결과 : 1 + 5 = 6
		 * 
		 * 덧셈, 뺄셈, 곱셈, 나누기, 나머지는 메서드로 호출하여
		 * 연산결과를 출력
		 * */
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나누기 | 5.나머지 | 6.종료 >>");
			int starter = sc.nextInt();
			
			if(starter == 6) {
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.println("정수를 입력해주세요 >");
			int input1 = sc.nextInt();
			
			System.out.println("정수를 입력해주세요 >");
			int input2 = sc.nextInt();
			switch(starter) {
			case 1:
				System.out.println(input1+"+"+input2+"="+sum1(input1,input2));
				break;
			case 2:
				System.out.println(input1+"-"+input2+"="+sum2(input1,input2));
				break;
			case 3:
				System.out.println(input1+"*"+input2+"="+sum3(input1,input2));
				break;
			case 4:
				if(sum4(input1,input2) == -199999999) {
					System.out.println("num = 0 / 다시입력해주세요.");
				}else {
					System.out.println(sum4(input1,input2)); // 나눗셈
					System.out.println(input1+"/"+input2+"="+sum4(input1,input2));
				}
				break;
			case 5:
				if(sum5(input1,input2) == -199999999) {
					System.out.println("num = 0 / 다시입력해주세요.");
				}else {
					System.out.println(sum5(input1,input2)); // 나머지
					System.out.println(input1+"%"+input2+"="+sum5(input1,input2));
				}
				break;
			}
			System.out.println("=========================================");
			
		}while(true);
		sc.close();
	}

}
