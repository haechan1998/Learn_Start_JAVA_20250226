package day05;

import java.text.DecimalFormat;

public class Array03 {

	public static void main(String[] args) {
		// arr 배열의 합계와 평균을 출력
		// 최대값 / 최소값 출력

		int arr[] = { 56, 50, 68, 71, 94, 80, 24, 81, 34, 56, 89 };
		
		// 정수의 형식을 변경 (#, 0)
		
		DecimalFormat df = new DecimalFormat("#.00");

		int sum = 0; // 합계 저장 변수
		int max = 0; // Math 매서드를 사용하여 최대를 구할때 필요한 변수 max 의 값을 낮게 잡아(보통 0으로 설정한다) 비교한다.
		int min = 1000000; // Math 매서드를 사용하여 최소를 구할때 필요한 변수 min 의 값을 높게 잡아 비교한다.

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			max = Math.max(arr[i], max); // 반복문 내에서 최대값 구하기
			min = Math.min(arr[i], min); // 반복문 내에서 최소값 구하기

		}
		double avg = (double) sum / arr.length;
		System.out.print("최대값 :" + max);
		System.out.println();
		System.out.print("최소값 :" + min);
		System.out.println();
		System.out.print("합계 :" + sum + " 평균 :" + df.format(avg));

	}

}
