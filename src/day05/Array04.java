package day05;

import java.text.DecimalFormat;

public class Array04 {

	public static void main(String[] args) {
		/* 10개의 값을 가지는 배열을 생성
		 * 1부터 50까지의 랜덤 수를 배열에 저장 > 출력
		 * 합계, 평균, 최대, 최소 출력
		 * 
		 * */
		
		int arr[] = new int[10];
		
		DecimalFormat df = new DecimalFormat("#.00"); // #. 뒤에서 나오는 0 의 개수만큼 소수점 뒷자리 표현
		
		int sum = 0;
		int max = 0;
		int min = 1000000;
		int random = 0;
		
		System.out.println("랜덤수 배열");
		for(int i = 0; i < arr.length; i++) {
			
			random = (int)(Math.random()*50)+1; // 랜덤한 수 50 개 선언
			arr[i] = random; // 랜덤한 수를 배열 arr에 입력
			System.out.print(arr[i] + " ");
			sum += arr[i];
			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);
		}
		System.out.println();
		double avg = (double) sum / arr.length;
		System.out.print("합계 :" + sum + " 평균 :" + df.format(avg));
		System.out.println();
		
		System.out.print("최대값 :" + max);
		System.out.println();System.out.print("최소값 :" + min);
		System.out.println();
		
	}

}
