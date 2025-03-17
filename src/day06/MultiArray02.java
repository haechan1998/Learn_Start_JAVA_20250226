package day06;

import java.util.Arrays;

public class MultiArray02 {

	public static void main(String[] args) {
		/* 2차원 배열
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 10 11 12
		 * 13 14 15
		 * 자료형 배열명[][] = new 자료형[5][3]; //5행 3열
		 * 
		 * */
		// 2차원 배열에 1부터 15까지 출력
		int arr[][] = new int[5][3];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				sum++;
				arr[i][j] += sum;
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("------------");
		
		// 2차원 배열에 랜덤수 넣기
		int arr1[][] = new int[5][3];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = (int)(Math.random()*50)+1;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		// 2차원 배열 정렬 // Arrays.sort는 일차원 배열 정렬. > 2차원 배열 정렬은?
		int tmp = 0;
		
		int arr2[][] = new int[5][3];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = (int) (Math.random() * 50) + 1;
				tmp = arr2[i][j]; // 미완
				
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
