package day05;

public class ArrayCopy {

	public static void main(String[] args) {
		/* 배열 복사
		 * 같은 배열을 2개 생성
		 * 배열의 길이는 정해져 있음.
		 * 
		 * 배열의 길이가 변해야 할 경우 사용한다.
		 * ex) 길이가 4인 배열에서 길이가 10으로 바뀌어야하는 경우가 생길 때
		 * 
		 * */
		
		int arr[] = new int[] { 1, 2, 3, 4 };
		int arr1[] = arr;
		int arr2[] = new int[10];
		System.out.println(arr); // 같은주소 같은 배열을 공유하고 있음.
		System.out.println(arr1); // 같은주소
		System.out.println(arr2);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		arr[0] = 10;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		// arr > arr2을 복사

		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		// arraycopy arr => arr3 복사
		// System.arraycopy(이전배열,시작번지,새배열,시작번지,개수)
		int arr3[] = new int[7];
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		
		for (int tmp : arr3) {
			System.out.print(tmp + " ");
		}

	}

}
