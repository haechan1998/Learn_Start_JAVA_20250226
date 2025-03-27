package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
// 		for문 이용하여 0부터 99사이의 난수(random)의 합을 계산하는 프로그램을 Java 언어로 작성하시오.
		
//		- 난수(random)의 개수를 입력받아 입력받은 개수만큼 난수를 생성하고, 생성한 난수의 합을 출력하시오. 
//		- 하단의 실행결과는 예시임. 
//		- 난수의 개수는 사용자가 입력한다. 
//		코드의 작성 내용 / 결과 화면 캡쳐 제출
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("난수의 개수를 입력하세요. : ");
		int num = sc.nextInt();
		
		for(int i=1; i<= num; i++) {
			int random = (int)(Math.random()*99);
			sum += random;
		}
		System.out.println("난수 "+num+"개의 합은 " +sum);
		
	}

}
