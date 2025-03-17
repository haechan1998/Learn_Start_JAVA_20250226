package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List02 {

	public static void main(String[] args) {
		/* list 에 1~10까지 채운 후 출력
		 * */
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			list.add(i+1);
		}
		System.out.println(list);
		
		System.out.println("-----------");
		// for 문으로 요소 출력
		System.out.println("for문");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// 향상된 for 문으로 요소 출력
		System.out.println("향상된 for문");
		for(Integer t : list) {
			System.out.print(t + " ");
		}
		System.out.println();
		System.out.println("-----------");
		
		// Iterator : index 가 없는 값을 출력하기 위해 사용
		// list 는 순서를 보장하지만(index 가 있음) Set, Map 은
		// Index 가 없음. 일반 for 문을 사용할 수 없음.
		
		// 순서와 상관없이 값을 가져올 수 있는 구문을 사용
		// Map 은 향상된 for, Iterator 직접 사용 불가. 
		
		System.out.println("Iterator 출력");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) { // hasNext() : 다음 요소가 있는지 체크 T/F 로 리턴.
			Integer tmp = it.next(); // next() : 다음요소 가져오기.
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		// IndexOf(값) : 해당 값의 index 반환.
		
		System.out.println(list.indexOf(8)); // 몇번지에 있는지 확인
		System.out.println(list.indexOf(-1)); // 없으면 -1 리턴
		
		
		list.clear();
		list.add(56);
		list.add(80);
		list.add(71);
		list.add(22);
		list.add(48);
		System.out.println(list);
		
		
		// Collections.sort(list) // 정렬 => 오름차순만 가능.
		Collections.sort(list);
		System.out.println(list);
		
		// list.sort (Comparator 를 구현한 객체) : 정렬
		// Comparator 인터페이스를 구현한 구현체를 넣어야 함.(익명클래스 사용)
		// compareTo 메서드를 구현하여 객체를 정렬
		// - compareTo : 사전상 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1 - o2 : 오름차순 / o2 - o1 : 내림차순
				// 결과가 -면 앞으로 보내고, +면 뒤로 보낸다.
				
				return o2 - o1;
			}
		});
		
		System.out.println(list);
		
		// 랜덤 한 수를 채우는건 add((int)(Math.random()*10)+1); // 1부터 10까지 랜덤한 수 채우기
		
		// 이걸 list 에 5개(for 문을 5번만 돌리면 된다.) 넣으면 1~10까지 랜덤수가 index 에 채워진다.
		
		list.clear(); // list 초기화
		System.out.println("-----------");
		
		for(int i=0; i<5; i++) {
			list.add((int)(Math.random()*10)+1); // 중복된 값이 들어 갈 수 있다.
		}
		System.out.println(list);
		
		// 그리고 list 에 특정한 값이 있을경우 확인하기.
		Integer lucky = 7;
		
		if(list.contains(lucky)) { // contains 활용. > object 를 사용해야하는거 잊지말기.
			System.out.println("운이 좋다!");
		}
		
		
		// 이걸 더 심화하면... 뭐가있지??
		// 여태 했던 배열을 완전 편하게 사용 가능하다!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
