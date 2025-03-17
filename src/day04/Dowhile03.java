package day04;

import java.util.Scanner;

public class Dowhile03 {

	public static void main(String[] args) {
		/*
		 * 숫자 2개를 입력받고. num1 =2, num2 = 3 menu 1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료 menu 에
		 * 따라서 두 수의 연산 결과를 출력 1=> 2+3=5 2=> 2-3=-1 ... 4=> 2/0= num2를 다시 입력해주세요. 5=>
		 * 2%0= num2를 다시 입력해주세요.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int menuSelect = 0;

		do {
			System.out.print("(number1) 정수를 입력하십시오 :");
			int number1 = sc.nextInt(); // 첫번째 정수

			System.out.print("(number2) 정수를 입력하십시오 :");
			int number2 = sc.nextInt(); // 두번째 정수

			System.out.print("1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료 >>");

			menuSelect = sc.nextInt(); // 메뉴 선택

			switch (menuSelect) {

			case 1:
				System.out.println(number1 + " + " + number2 + " = " + (number1 + number2)); // 더하기
				break;

			case 2:
				System.out.println(number1 + " - " + number2 + " = " + (number1 - number2)); // 빼기
				break;

			case 3:
				System.out.println(number1 + " * " + number2 + " = " + (number1 * number2)); // 곱하기
				break;

			case 4:
				if (number1 == 0) {
					System.out.println("(number1) 0을 입력하셨습니다.");
					System.out.println("number1을 다시 입력해주세요");
				} else if (number2 == 0) {
					System.out.println("(number2) 0을 입력하셨습니다.");
					System.out.println("number2를 다시 입력해주세요");
				} else {
					System.out.println(number1 + " / " + number2 + " = " + ((double) number1 / number2)); // 나누기
				}
				break;

			case 5:
				if (number1 == 0) {
					System.out.println("(number1) 0을 입력하셨습니다.");
					System.out.println("number1을 다시 입력해주세요");
				} else if (number2 == 0) {
					System.out.println("(number2) 0을 입력하셨습니다.");
					System.out.println("number2를 다시 입력해주세요");
				} else {
					System.out.println(number1 + " % " + number2 + " = " + (number1 % number2)); // 나머지
				}
				break;

			case 6:
				System.out.println("종료");
				break;

			default:
				System.out.println("잘못된 연산자");

			}

		} while (menuSelect != 6);

		sc.close();

	}

}
