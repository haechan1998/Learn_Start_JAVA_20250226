package day14;

import java.util.HashSet;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/* Set 에 로또번호 6개.
		 * */
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 6) { // size 가 작아야 랜덤을 돌리게 해야 하는데 바보바보
			int random = (int)(Math.random()*45)+1;
			set.add(random);
		}
		System.out.println(set);
		
		System.out.println("--TreeSet--");
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>(); // TreeSet은 작으면 앞에 크면 뒤에 저장한다.
		
		while(treeSet.size() < 6) { // size 가 작아야 랜덤을 돌리게 해야 하는데 바보바보
			int random = (int)(Math.random()*45)+1;
			treeSet.add(random);
		}
		System.out.println(treeSet);
		
		// first() : 가장 앞에 있는 값 / last() : 가장 뒤에 있는 값.
		
		System.out.println(treeSet.first()); // 앞
		System.out.println(treeSet.last()); // 뒤
		
		// headSet() / tailSet : 기준값의 앞쪽 전부 / 뒷쪽 전부 값을 출력
		System.out.println(treeSet.headSet(20));
		System.out.println(treeSet.tailSet(20));
		
		// subSet() : 검색 범위 출력 (시작값은 포함, 끝 값은 미포함) / subSet(to,from)
		System.out.println(treeSet.subSet(10, 20)); // 10부터 19까지. (from 미포함)
		
		
		
		
		
		
		
		
		
		
		
	}

}
