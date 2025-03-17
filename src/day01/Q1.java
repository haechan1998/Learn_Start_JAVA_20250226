package day01;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		//오늘 배운 과제 응용
		//if 함수로 짝수, 홀수 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int a = num % 2;
		if(a > 0 ) {
			System.out.println("홀수");
		}else if(a == 0){
			System.out.println("짝수");
		}sc.close();
		
		
	}

}
