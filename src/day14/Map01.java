package day14;

import java.util.HashMap;
import java.util.Iterator;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 쌍으로 저장 key / value
		 * - key (중복불가), value(중복가능).
		 * - HashMap을 가장 많이 사용
		 * 
		 * HashMap<클래스, 클래스> map = new HashMap<클래스, 클래스>();
		 * - 값이 2개이기 때문에 향상된 for 문, Iterator 사용 안됨.
		 * - map => key => set 으로 구성 후 출력
		 * 
		 * list, set => 추가 add() / map => 추가 put()
		 * 
		 * get(key) => value 값을 리턴해준다.
		 * remove(key) => 삭제하면서 value 값을 리턴한다. 
		 * 
		 * */
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("apple", 2000);
		map.put("banana", 3000);
		map.put("orenge", 1000);
		map.put("apple", 5000); // value 를 덮어 씌운다.
		map.put("mango", 4000);
		map.put("kiwi", 30000);
		
		System.out.println(map);
		// *중요*
		System.out.println(map.keySet()); // *key 값을 리턴* / 자주사용
		System.out.println(map.values());
		
		// get(key) => value
		System.out.println(map.get("apple"));
		
		int sum = 0;
		
		// 향상된 for
		for(String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
			sum +=map.get(key);
		}
		System.out.println("sum:"+ sum);
		
		System.out.println("-----------------");
		
		// Iterator 출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":" + map.get(key));
		}
		
		// remove(Object) : key 값을 주면 삭제 => value 리턴
		System.out.println(map.remove("apple"));
		System.out.println(map);
		System.out.println(map.remove("a")); // key 가 없으면. null
		System.out.println(map.remove("banana", 3000)); // boolean 으로 리턴해준다.
		System.out.println(map);
		
		
		
		
	}

}
