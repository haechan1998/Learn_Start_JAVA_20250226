package day13;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx01 {

	public static void main(String[] args) {
		// 두 배열을 합쳐 하나의 list 로 생성
		// 정렬해서 출력
		String[] arr1 = new String[] {"c", "f", "a", "d"};
		String[] arr2 = new String[] {"e", "b", "g", "f"};
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<arr1.length; i++) {
			list.add(arr1[i]);
			list.add(arr2[i]); // 이런식으로 같이 담아도 list 배열은 계속 생기기 때문에 겹쳐서 들어가지 않는다.
		}
		
		System.out.println(list);
		
		System.out.println("오름차순으로 정렬 한 후");
		
		// 정렬 오름차순
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
		});
		System.out.println(list);
		
	}

}
