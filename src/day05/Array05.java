package day05;

public class Array05 {

	public static void main(String[] args) {
		/*
		 * 문자 배열 생성
		 * 
		 * 
		 */
		String arr[] = new String[5]; // String 배열은 값에 하나씩 지정 해주어야 한다.
		arr[0] = "홍길동";
		arr[1] = "김영이";
		arr[2] = "박영철";
		arr[3] = "최순철";
		arr[4] = "이순이";

		// 향상된 for 문으로 출력 // 배열에 맞는 자료형이어야한다.
		System.out.println("--향상된 for문--");
		for (String str : arr) {
			System.out.println(str);
		}
		
	}

}
