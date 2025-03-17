package day06;

import java.util.Arrays;

class MultiArray01 {

	public static void main(String[] args) {
		/* 다차원 배열 - 2차원 배열
		 * 배열명[x] - 1차원 배열 {1,2,3}
		 * 배열명[x][y] - 2차원 배열 { {1,2,3}, {1,2,3} }
		 * 배열명[x][y][z] - 3차원 배열 { { {}, {} }, { {}, {} }, { {}, {} } }
		 * 
		 * { {1,2,3} , {1,2,3} }
		 * int[][] arr = new int[2][3];
		 * 1 2 3 //1 = [0][0], 2 = [0][1], 3 = [0][2] 
		 * 4 5 6 //4 = [1][0], 5 = [1][1], 6 = [1][2]
		 * 
		 * 배열의 길이
		 * 1차원 배열 = arr.length => for 1개
		 * 2차원 배열 = arr[i].length => for 2개
		 * 3차원 배열 = arr[i][j].length => for 3개
		 *  
		 *  
		 *  
		 * */
		int arr[][] = {
				{1,2,3},
				{4,5,6}
		};
		
		System.out.println(Arrays.deepToString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i+10; // 2차원 배열의 값 넣기
				System.out.print(arr[i][j] + " "); // 2차원 배열의 값 출력
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		System.out.println(arr[0][0]); // 1
		System.out.println(arr[0][1]); // 2
		System.out.println(arr[0][2]); // 3
		System.out.println(arr[1][0]); // 4
		System.out.println(arr[1][1]); // 5
		System.out.println(arr[1][2]); // 6
		
		
		
	}

}
