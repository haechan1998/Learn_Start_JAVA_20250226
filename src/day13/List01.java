package day13;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// List = ArrayList
		// List<클래스명> 객체명 = new 구현클래스<클래스명>();
		
		List<Integer> list = new ArrayList<>();
		
		// add() : 요소를 추가
		
		list.add(1); // 오토 박싱 : int 의 자료형 값이 Integer 로 박싱되어서 저장
		list.add(new Integer(2)); // deprecated / 자동으로 박싱 언박싱 해주기 때문에 안쓴다.
		list.add(3);
		System.out.println(list);
		
		// get(index) : index 번지의 값을 가져오기
		System.out.println(list.get(0)); // arr[0] 같은 의미
		System.out.println(list.get(1)); // arr[0] 같은 의미
		System.out.println(list.get(2)); // arr[0] 같은 의미
		
		System.out.println("-----------------");
		
		// set(index, 값) : index 번지에 값 변경하기
		list.set(0, 5); // 0번지에 5를 넣는다.
		
		// size() : 리스트의 총 개수
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// remove(index) : index 번지의 값을 삭제
		// remove(object) : object 요소를 삭제
		
		list.remove(0);
		System.out.println(list);
		Integer r = 3; // 오토박싱
		list.remove(r);
		System.err.println(list);
		
		// list1 을  생성하여, 1~10까지 추가(for 문)하고 출력
		
		System.out.println("-----------------");
		
		List<Integer>list1 = new ArrayList<>();
		
		
		for(int i=1; i<=10; i++) {
			list1.add(i);
		}
		
		System.out.println(list1);
		
		// index 4에 있는 값을 11 로 변경
		list1.set(4, 11); // 4번지의 값을 11로 변경.
		
		// index 0번지에 있는 값을 삭제
		list1.remove(0); // 0번지를 삭제.
		System.out.println(list1);
		
		list1.remove(r);
		System.out.println(list1);
		
		// contains(object) : list에 object 값이 있는지 체크
		
		System.out.println(list1.contains(r)); // T/F 로 값을 리턴해준다. r=3
		
		// clear() : 리스트 비우기 (요소 전부 삭제)
		list1.clear();
		System.out.println(list1); // 전부 삭제.
		
		//isEmpty() : 리스트가 비어있는지 체크 // T/F로 리턴
		System.out.println(list1.isEmpty()); // 요소가 없는 list1
		System.out.println(list.isEmpty()); // 요소가 아직 남아있는 list
				
		
	}

}
