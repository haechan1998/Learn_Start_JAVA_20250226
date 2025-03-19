package day15;

import java.util.Arrays;

public class Stream02 {

	public static void main(String[] args) {
		/* 배열에서 짝수(정렬하여)만 출력
		 * */
		int[] arr = {1,2,3,4,5,6,4,3,2,6,6,7,8,1,4,1,7,7,8,9,7,9,7,6,4,3,3,14,17,32,12,14,25,14,7};
		// 스트림으로 생성하여, 중복제거하고, 정렬하여, 짝수만 출력
		
		Arrays.stream(arr)
		.distinct()
		.sorted()
		.filter(n -> n%2==0)
		.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// 스트림으로 생성하여, 중복제거하고, 정렬하여 홀수만 배열로 리턴
		int[] arr2 = Arrays.stream(arr)
		.distinct()
		.sorted()
		.filter(n -> n%2 == 1)
		.toArray();
		
		Arrays.stream(arr2)
		.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		
	}

}
