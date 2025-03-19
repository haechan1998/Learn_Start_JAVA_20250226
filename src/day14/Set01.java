package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/* Set : 순서보장X (index 가 없음), 중복불가능.
		 * 순서가 없다는건 정렬이 안된다는 것. 정렬X
		 * HashSet(대표적인 구현 클래스) / TreeSet(정렬이 가능한 Set)
		 * */
		HashSet<String> hs = new HashSet<>();
		
		// add() : Set 에 객체 추가
		hs.add("banana");
		hs.add("apple");
		hs.add("orenge");
		hs.add("apple");
		hs.add("mango");
		
		System.out.println(hs); // 중복되는 값은 자동으로 삭제한다. / 순서 보장X
		
		// get(i) / set(i, value) : index 가 없어서
		// index 를 사용하는 메서드가 없음
		
		System.out.println("--향상된 for문을 이용한 출력--");
		for(String str : hs) {
			System.out.println(str);
		}
		
		System.out.println("--Iterater를 이용한 출력--");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String t = it.next();
			System.out.println(t);
		}
		
		// 정렬 : Set 은 순서가 없기 때문에 정렬 불가능.
		// Set => list 로 변환하여 정렬
		System.out.println("--set을 list로 변환--");
		List<String> list = new ArrayList<String>(hs);
		System.out.println(list);
		
//		Collections.sort(list);
//		System.out.println(list);
		
		//list.sort() 로 내림차순 정렬하여 출력
		System.out.println("--list.sort(new Comparator<E>(){}) 를 이용해서 정렬 후 출력--");
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		System.out.println(list);
		System.out.println(hs.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
