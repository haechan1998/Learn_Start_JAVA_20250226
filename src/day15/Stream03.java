package day15;

import java.util.ArrayList;
import java.util.Comparator;

public class Stream03 {

	public static void main(String[] args) {
		// Student class List 생성
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("김박수",90));
		list.add(new Student("박수김",84));
		list.add(new Student("양수박",71));
		list.add(new Student("최민수",88));
		list.add(new Student("원철수",91));
		list.add(new Student("이김철",64));
		list.add(new Student("수원철",85));
		list.add(new Student("박양김",77));
		list.add(new Student("최원수",66));
		
		
		// 스트림을 이용하여 출력 => 사람1 : 90
		// toString 사용
		list.stream().forEach(n -> System.out.println(n));
		
		System.out.println("--------------------");
		// toString 미사용
		list.stream()
			.forEach(l -> {
				String name = l.getName();
				int score = l.getScore();
				System.out.println(name+ ":" +score);
			});
		// list 의 점수 합계
		int sum = list.stream()
			.mapToInt(n -> n.getScore())
			.sum();
		
		// list 의 인원수
		long count = list.stream()
			.count();
		System.out.println("합계 :" + sum + " 인원 수 :" + count);
		
		// 정렬 : 가나다 순으로 (오름차순) 정렬
		
		list.stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		}).forEach(n -> System.out.println(n));
		
		System.out.println("------------------------");
		// 정렬 : 점수가 높은 순으로 정렬 (점수 기준 내림차순)
		
		list.stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.getScore() - o1.getScore();
			}
			
		}).forEach(n -> System.out.println(n));
		
		System.out.println("------------------------");
		// Comparable<Student> 클래스에서 구현한 정렬
		list.stream().sorted().forEach(n->System.out.println(n));
		
		
	}

}
