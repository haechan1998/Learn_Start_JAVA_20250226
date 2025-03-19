package day15;

import java.util.HashMap;

public class Lanbda02 {
	
	public static void main(String[] args) {
		/* map 을 구성하여 forEach 로 출력
		 * */
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("사람1", 78);
		map.put("사람2", 87);
		map.put("사람3", 91);
		map.put("사람4", 65);
		map.put("사람5", 99);
		map.put("사람6", 68);
		map.put("사람7", 81);
		map.put("사람8", 93);
		
		map.forEach((s, i) -> {
			System.out.println(s + ":" + i);
		});
		
		Number sum = (a,b) -> {
			return a+b;
		};
		
//		int hap = sum.add(10, 30);
//		System.out.println(hap);
		
		Number max = (a,b) -> (a>=b)? a : b;
		
		System.out.println(max.add(35, 33));
			
		
		
	}

}

// 람다용 함수형 인터페이스 생성
// 메서드는 1개 여야만 함
@FunctionalInterface
interface Number{
	// 메서드 추가
	
	int add(int a, int b);
//	int max(int a, int b); 메서드가 2개면 error
	
}