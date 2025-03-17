package day05;

public class Array01 {

	public static void main(String[] args) {
		/* 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집합 (참조 변수)
		 * 객체를 생성하는 키워드 => new
		 * 
		 * - 배열을 선언하는 방법
		 * 타입[] 배열명; (선언)
		 * 타입 배열명[];
		 * 
		 * - 생성 후 초기화 : 객체는 생성하면 자동 초기화 함.
		 * 타입[] 배열명 = new 타입[길이]; // 가장 많이 사용하는 방법.
		 * 타입[] 배열명 = new 타입[]{값, 값, 값, 값, 값};
		 * 타입[] 배열명 = {값, 값, 값, 값, 값}; // 연습용
		 * 
		 * - 배열의 길이는 0 이상이여야 한다.
		 * - 배열의 번지(index) 0부터 시작
		 * - 배열명[5] => 0 1 2 3 4
		 * - 배열의 총길이 => length(총길이)
		 * */
		
		int arr[]; // 배열이 선언만 된 상태(null) > 외부에서 배열을 가져올 경우에만 사용한다.
		arr = new int[5]; // 선언한 객체를 생성(초기값 0)
		
		int arr1[] = new int[5]; // 선언 + 생성 + 자동초기화 // 일반적으로 많이 사용
		int arr2[] = new int[] {1, 2, 3, 4 ,5};
		int arr3[] = {1, 2, 3, 4, 5};
		
		/* 배열의 길이가 5 => 0 1 2 3 4
		 * - 항상 모든 배열의 마지막 index = length - 1;
		 * 배열을 사용하는 이유
		 * - 관리가 편함.
		 * - 반복문을 사용할 수 있기 때문에 많은 양의 데이터를 쉽게 관리할 수 있음.
		 * 
		 * */
		
		arr[0] = 10; // arr[] {10, 0, 0, 0, 0}
		arr[1] = 20; // arr[] {10, 20, 0, 0, 0}
		arr[2] = 30; //	arr[] {10, 20, 30, 0, 0}
		arr[3] = 40; //	arr[] {10, 20, 30, 40, 0}
		arr[4] = 50; //	arr[] {10, 20, 30, 40, 0}
//		arr[5] = 60; // Exception error 발생 / 정해진 배열의 길이보다 길어 발생
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("-----------------");
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		System.out.println("--for문을 이용한 array출력--");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 10 20 30 40 50
		}
		System.out.println();
		
		System.out.println("--arr3 출력--");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr3[i] + " "); // 1 2 3 4 5
		}
		System.out.println();
		
		System.out.println("-----------------");
		
		arr[0] = 99; // 다시 대입하면 덮어쓰기 10 > 99
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 99 20 30 40 50
		}
		System.out.println();
		
		// arr1 에 1 2 3 4 5 값을 입력하고 출력
		System.out.println("--arr1에 값을 넣고 출력--");
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1; // {1, 2, 3, 4, 5,}
			System.out.println(arr1[i]); // 1 2 3 4 5
		}
		
		// arr4 배열을 생성 [10]
		// 1부터 10까지 저장 후 출력
		System.out.println("--arr4에 값을 넣고 출력--");
		
		int arr4[] = new int[10];
		
		for(int i = 0; i < arr4.length; i++) {
			arr4[i] = i + 1;
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		
		
		
		
		
		
		
	}

}
