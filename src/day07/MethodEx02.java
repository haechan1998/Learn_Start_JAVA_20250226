package day07;

// import java.util.Arrays;

public class MethodEx02 {
	
			// 입력되는 정수 배열을 출력하는 메서드 // 출력만
	
	public static void arrayPrint(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
			// 입력되는 정수 배열을 오름차순 정렬하는 메서드 / 정렬만
	
	public static void arrays(int[] arr) {
		// Array.sort 도 되나?
		// Arrays.sort(arr); // 오 된다! / 내림차순은 모르니까 밑에걸로 하자.
		
		int tmp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					 tmp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = tmp;			
				}
			}
		}
	}
	
	public static int[] randomArray() {
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	

	public static void main(String[] args) {
		
		int[] arr = new int[] {2,8,7,4,5,6,9,11,10,3,1,12,13}; // 일단 한번 출력하기
		arrayPrint(arr);
		arrays(arr);
		arrayPrint(arr);
		System.out.println("----------------------------------");
		// 기존에 있던 메서드를 호출
		// int[] arr1 = Method06.randomArrays(); // 계속 랜덤으로 돌기 때문에 배열을 정해서 복사.
		
		// 직접 메서드를 새로 만들어서 호출
		int[] arr1 = randomArray();
		arrayPrint(arr1);
		arrays(arr1);
		arrayPrint(arr1);
		
		
	}

}
