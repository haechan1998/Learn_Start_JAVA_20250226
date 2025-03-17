package day04;

public class For08 {

	public static void main(String[] args) {
		// 이중 for 문
		// for 문의 조건식 만큼 반복하기 때문에 그걸 이용하는것이 이중 for 문과 for 문의 사용에 용이하다.
		//
		for (int i = 1; i <= 5; i++) { // i = 1 2 3 4 5
			for (int j = 1; j <= 5; j++) { // j = 1~5 1~5 1~5 1~5 1~5
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		/*
		 * 별찍기 => 5개씩 5줄
		 * 
		 * ***** ***** ***** ***** *****
		 * 
		 */

		for (int i = 1; i <= 5; i++) { // i(줄) = 1 2 3 4 5
			for (int j = 1; j <= 5; j++) { // j(*) = 1~5 1~5 1~5 1~5 1~5
				System.out.print("*"); // 5개의 별이 찍히고
			}
			System.out.println(); // enter
		}

		System.out.println("-----------------");

		/*
		 * * ** *** **** *****
		 */

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------");

		/*
		 * ***** **** *** ** *
		 * 
		 */

		for (int i = 1; i <= 5; i++) { // 부등호의 방향과 변수 갑, 감소로 표현하기
			for (int j = 5; i <= j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------");

		for (int i = 1; i <= 5; i++) { // 조건식의 변화로 표현하기
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------");

		/*
		 * * i(줄) = 1 2 3 4 5 ** j(*) 1~1 1~2 1~3 1~4 1~5 *** 공백 1~4 1~3 1~2 1~1 0 ****
		 * *****
		 * 
		 */

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int s = 1; s <= i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		/*
		 * * i(줄) = 1 2 3 4 5 *** k(공백) 1~4 1~3 1~2 1~1 0 (5-i) ***** j(*) 1~1 1~3 1~5
		 * 1~7 1~9 () ******* *********
		 * 
		 */

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		int cnt = 1;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= cnt; k++) {
				System.out.print("*");
			}
			cnt += 2;
			System.out.println();
		}

		/*
		 * 1 2 3 4 5 6 7 8 9
		 * 
		 * 3줄씩 3개의 숫자 (2중 for 문)
		 * 
		 * 값을 출력하는 별도의 변수 지정
		 * 
		 */
		System.out.println("-----------------");

		cnt = 1;

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(cnt);
				cnt++;
				System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println("-----------------");

		cnt = 9;

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(cnt);
				cnt--;
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");

	}

}
