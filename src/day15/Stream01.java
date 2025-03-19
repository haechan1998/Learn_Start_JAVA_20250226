package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		
		/* Stream(스트림)
		 * - 자료구조 복사하여 스트림 객체로 생성 
		 * - 스트림을 이용하여 연산을 수행
		 * - 연산을 수행한 스트림은 소모됨.
		 * - 스트림은 기존 자료를 변경할 수 없음.
		 * - 메서드 체이닝 방식은 사용
		 * - 스트림 만의 연산을 가지고 있음.
		 * - 중간연산 / 최종연산
		 * - 중간연산 : 메서드를 이어서 사용가능.
		 *	 - filter() : 조건에 맞는 값만 다음 메서드로 넘김
		 *	 - distinct() : 중복제거
		 *	 - limit() : 스트림의 일부를 잘라냄
		 *	 - sorted() : 정렬
		 *	 - map() : stream 종류를 변경
		 *	 - peek() : 작업수행, - skip() stream 일부를 건너 뜀 ...등등이 있다.
		 * 
		 * - 최종연산 : 반드시 마지막에 하나만. 
		 * 	 - forEach(), count(), sum(), average, max(), min()
		 * 	 - allMatch() : 스트림 요소가 모두 일치하는지
		 * 	 - anyMatch() : 하나라도 일치하는지
		 * 	 - toArray() : 배열로 전환
		 * 	 - toList() : 리스트로 변환
		 * 	 - collect() : 스트림 수집
		 *                       
		 * */
		int[] arr = {1,2,3,4,5,6,7,8,9,};
		int sum = 0;
		// 일반적인 방법
		for(int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("--스트림을 이용한 합계구하기--");
		
		// 배열을 스트림으로 구성
		int arrSum = Arrays.stream(arr).sum();
		System.out.println(arrSum);
		
		long count = Arrays.stream(arr).count();
		System.out.println(count);
		
		OptionalDouble average = Arrays.stream(arr).average();
		System.out.println(average);
		
		// 5이상만 합계
		int sum1 =
		Arrays.stream(arr)
		.filter(n -> n>=5) // 중간연산
		.sum(); // 최종연산
		System.out.println(sum1);
		
		// 점수 배열을 생성 한 후 70점 이상만 필터하여 합계, 평균
		// 가장 높은 점수를 출력
		
		int[] arr2 = {81,95,75,66,91,80,54,68,82,67};
		
		int arr2Sum = Arrays.stream(arr2).filter(f -> f >= 70).sum(); // 70점 이상의 합계
		OptionalDouble average1 = Arrays.stream(arr2).filter(f -> f>= 70).average();
		OptionalInt max = Arrays.stream(arr2).max();
		System.out.println("합계 :" + arr2Sum + " / " + "평균 :" + average1 +" / " +"가장높은 점수 :" + max);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(9);
		list.add(8);
		list.add(1);
		
		list.stream()
		.forEach(n -> System.out.print(n + " ")); // 중복 제거 전
		
		System.out.println();
		
		list.stream()
		.distinct()
		.sorted()
		.forEach(n -> System.out.print(n + " ")); // 중복 제거 후 정렬하고 출력
		
		System.out.println();
		// 중복 제거 후 합계(int 만 가능)
		// map : 스트림 변경 
		int a = list.stream()
		.distinct()
		.mapToInt(n -> n.intValue())
		.sum();
		System.out.println(a);
		
		// 스트림 객체 생성 1회용
		Stream<Integer> stream01 = Stream.of(10, 20, 30, 40, 50);
		
		System.out.println("--스트림의 합계--");
		int b = stream01
		.mapToInt(n -> n.intValue())
		.sum();
		
		System.out.println(b);
		
		
		
		
		
	}

}
