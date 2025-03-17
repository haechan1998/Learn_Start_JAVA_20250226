package day13;

public class Exception02 {

	public static void main(String[] args) {
		/* 자주 발생하는 예외 코드들
		 * - ArothmmeticException : 0으로 나누었을때.
		 * 
		 * - ArrayIndexOutOfBoundsException :
		 * 배열에 index 가 범위를 넘어갔을 때 발생.
		 * 
		 * -NullPointException : 객체의 값이 null 일 경우 발생.
		 * 
		 * - ClassCastException : 다운 캐스팅이 잘못 되었을 때 발생. 
		 * 
		 * */
		
//		int[] arr = new int[5];
//		System.out.println(arr[6]);
		
		int[] arr2 = null;
		System.out.println(arr2[0]);
	}

}
