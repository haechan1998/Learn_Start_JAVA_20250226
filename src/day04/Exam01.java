package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 숫자를 입력받아 (Scanner) (0이나 - 숫자를 입력하면 종료) > do while
		
		// 입력받은 숫자의 합계와 평균을 출력 > 입력받은 숫자의 평균을 낼 변수 필요
		// ex) 3 + 5 + 4 + 8 + 9  0 = 합, 평균 출력 (0, - 를 입력하기 전까지)
		

		Scanner sc = new Scanner(System.in);
		
		
		int number = 0;
		int sum = 0;
		int average = 0;
		
		do {
			System.out.println("숫자를 입력해주세요 >");
			number = sc.nextInt();
			
			if(number > 0) {
				sum += number; // 입력받은 수 합계
				System.out.println("합계 :" + sum);
			}else if(number <= 0) {
				System.out.println(number + "을 입력하셨습니다");
				System.out.println("종료합니다.");
				break;
			}
			average++;
			System.out.println("평균 :" + (double)sum / average); // 평균값
			
		}while(true);
		
		// concat 을 이용해서 계산식 출력	
//		
//		int number = 0, sum = 0, count = 0;
//		
//		String total = "";
//		
//		do {
//			System.out.println("숫자입력 >");
//			number = sc.nextInt();
//			total = total.concat("+").concat(String.valueOf(number));
//			sum += number;
//			count++;
//			
//		}while(number > 0);
//		
//		if(count == 1) {
//			System.out.println("입력한 숫자가 없습니다.");
//		}else {
//			System.out.println("계산식"+total.substring(1));
//			System.out.println("합계:" + sum +", + 평균:"+((double)sum/(count-1)));
//		}
		
		sc.close();
	}

}
