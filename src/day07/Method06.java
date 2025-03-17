package day07;

public class Method06 {
		/* 1. 랜덤 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
		 * 매개변수 : 없음.
		 * 리턴타입 : 배열 => int[]
		 */
	public static int[] randomArrays() { // 리턴값이 많은경우 배열에 담아서 원하는 배열을 출력.
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		return arr; // 리턴타입에 배열을 주었을경우, 리턴할때 배열기호를 빼도된다.
	}
		/* 2. 그 배열을 입력 받아서 "평균" 을 리턴하는 메서드
		 * 매개변수 : 정수배열 => int[] arr
		 * 리턴타입 : 평균 => double
		 * */
	public static double average(int[] arr) {
		double avg = 0;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			avg = sum/(double)5;
		}
		return avg;
	}
	
	/* 3. 1번에서 만든 배열을 출력하고, > void
	 *    2번에서 만든 평균을 출력하는 메서드 > void
	 * 매개변수 : 두가지 케이스 가능. (배열, 평균을 받는  케이스) (안받는 케이스)
	 * */
	public static void arrayPrint(int[] arr, double avg) {
		
//		arr = randomArrays(); // 주소값만 복사된다.
//		System.out.println("배열 : "+Arrays.toString(arr)); // 이렇게 하는거 아닌거같은데...
//		avg = average(arr);
//		System.out.println("배열의 평균 : " + avg);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("평균 :"+avg);
	}
	
	public static void arrayPrint() { // 오버로딩. 매개변수의 개수 || 매개변수의 타입 을 다르게 한다.
		//매개변수 안받는 케이스
		int arr[] = randomArrays();
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		double avg = average(arr);
		System.out.println("평균 :"+avg);

	}
		
		
		

	public static void main(String[] args) {
					// 메서드에서의 배열활용
					/* 1. 랜덤 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
					 * 2. 그 배열을 입력 받아서 "평균" 을 리턴하는 메서드
					 * 3. 1번에서 만든 배열을 출력하고,
					 *	  2번에서 만든 평균을 출력하는 메서드
					 *	  main에서는 메서드 호출만 하기.
					 * */
		int arr[] = randomArrays();
		double avg = average(arr);
		arrayPrint(arr, avg);
		System.out.println("--다른케이스--");
		arrayPrint();
		
	}

}
