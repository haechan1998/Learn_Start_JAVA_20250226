package day04;

public class For07 {

	public static void main(String[] args) {
		// for / while

		/*
		 * for 문을 이용하여 구구단 5단을 출력
		 * 
		 */
		int dan = 5; // 2부터 9까지 반복

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}

		System.out.println("-----------------------");

//		int j;
//		for (j = 1; j <= 9; j++) {
//			System.out.println(dan + "*" + j + "=" + (dan * j));
//		}

		// 이중 for 문
		for (int i = 1; i <= 9; i++) {
		
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + " ");
			}
			System.out.println();
		}

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
