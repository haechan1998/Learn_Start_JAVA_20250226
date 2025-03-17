package day05;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 배열 10개 => 1부터 100까지의 랜덤수 저장
		// 출력 후 정렬
		// 오름차순 정렬 후 출력
		
		int[] arr = new int[10];
		
		System.out.println("1부터 100까지 랜덤수 배열에 저장");
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()*100)+1;
			arr[i] = random;
		}
		for(int t : arr) {
			System.out.print(t + " ");
		}
		System.out.println();
		System.out.println("--Arrays.sort를 활용한 오름차순 정렬--");
		Arrays.sort(arr); // 배열을 오름차순으로 정렬하는 Arrays 메서드
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				}
			}
		}
		System.out.println("정렬");
		for(int t : arr) {
			System.out.print(t + " ");
		}
		
	}

}
