package day14;

import java.util.HashMap;

public class MapEx01 {
	
	public static void main(String[] args) {
		/* 상품과 가격을 추가하여 합계를 구하시오.
		 * 1. main 에 map 을 생성하고, 메서드로 데이터를 채우는 형태
		 *    매개변수로 map 을 받아 데이터를 채우는 메서드.
		 *    
		 * 2. 메서드 내부에서 map 을 생성하여 map 을 메인으로 리턴하는 형태
		 * 
		 * 
		 * 3. map 을 받아서 출력하는 메서드 >
		 *  
		 * ex) 연필 500, 가위 1000, 물감 3000
		 * 	   합계 : sum;
		 * */
		// 매개변수로 map 을 받아 데이터를 채우는 메서드.
		
		
		HashMap<String, Integer> map = new HashMap<>();
		
		
		MapEx01 ex = new MapEx01();
		ex.makeMap(map); // main 에 있는 map 에 makeMap 메서드에 있는 값을 넣는다.
		System.out.println(map);
		
		System.out.println("-----------------------");
		
		HashMap<String, Integer> map2 = new HashMap<>(ex.makeMap2()); // 메서드 안에 map 을 리턴받는 형태.
		
		System.out.println(map2);
		System.out.println("-----------------------");
		
		ex.printMap(map); // map 을 받아서 메서드 내부에서 출력하는 형태.
		System.out.println("-----------------------");
		ex.printMap(map2);
		
	}
	// 매개변수로 map 을 받아 데이터를 채우는 메서드
	public void makeMap(HashMap<String,Integer> map) {
		map.put("가위", 3000);
		map.put("연필", 2000);
		map.put("지우개", 1500);
	}
	
	// 메서드 내부에서 map 을 생성하여 map 을 메인으로 리턴하는 형태. > map 을 어떻게 리턴하지...
	public HashMap<String, Integer> makeMap2() { // 입력 값으로 key 와 value 를 받는다.
		HashMap<String, Integer> map = new HashMap<>();
		map.put("사과", 2000);
		map.put("바나나", 2000);
		return map;
		
	}
	// map 을 받아서 출력하는 메서드 > 합계포함 // 완료
	public void printMap(HashMap<String, Integer> map) {
		int sum = 0;
		for(String key : map.keySet()) {
			System.out.println(key+"="+map.get(key));
			sum += map.get(key);
		}
		System.out.println("합계" + sum);
	}

}
