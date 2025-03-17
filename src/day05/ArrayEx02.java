package day05;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 숫자배열[10]을 생성 후
		 * 1부터 10까지 저장 후 출력
		 * index 는 0부터 9까지
		 */

		int[] arr = new int[10];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 배열의 값을 섞는 코드
		// 0 => random 번지 => 교환
		// (int)(Math.random()*10)
		// int tmp = arr[0];
		// arr[0] = arr[random]
		// arr[random] = tmp;
	
		int tmp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			// 교환 번지를 랜덤으로 고름.
			int random = (int)(Math.random()*arr.length);
			tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
			
		}
		System.out.println("------------------");
		for(int t : arr) {
			System.out.print(t + " ");
		}
		
		// 섞은 값을 원래대로 정리(정렬)
		// 작은순으로 정렬 => 오름차순 min
		// 큰순으로 정렬 => 내림차순 max
		tmp = 0;
		
		System.out.println();
		System.out.println("--정렬--");
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) { // > 오름차순 / < 내림차순
					 tmp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = tmp;
							
				}
			}
		}
		for(int t : arr) {
			System.out.print(t + " ");
		}
		System.out.println();
		
		

	}

}
