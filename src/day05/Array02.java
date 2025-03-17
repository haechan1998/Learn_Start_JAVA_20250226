package day05;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력
		 * 
		 * 1. 배열을 생성
		 * 2. 배열에 점수 입력받기
		 * 3. 배열을 출력
		 * 4. 점수의 합계 / 평균
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5]; // 배열 선언 및 생성
		int sum = 0; // 배열의 합을 저장해주는 매개변수
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("점수 입력 >");
			int score = sc.nextInt();
			arr[i] = score; // 입력 받은 값을 배열 arr 에 저장
			sum += arr[i]; // 배열의 값을 sum 에 저장
		}
		for(int i = 0; i < arr.length; i++) { // 배열의 출력
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		System.out.println("합계 :" + sum + " 평균 :" + ((double)sum/arr.length)); // 합계 및 평균		
		
		// -향상된 for 문-
		// 번지(index)로 접근이 불가능한 경우 사용
		// index 를 활용한 기능을 할수 없음
		// 전체 탐색만 가능 (부분 탐색 불가)
		
		for(int num : arr) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
