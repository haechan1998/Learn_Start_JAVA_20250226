package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

public class List03 {
	
	public static void main(String[] args) {
		
		/* 오늘 하루 일과를 저장하는 list 를 생성
		 * 출력 => 향상된 for / iterator 두가지로 출력
		 * */
		
		ArrayList<String> list = new ArrayList<>();
		list.add("아침에 일어나서 씻기");
		list.add("옷 입고 강아지 밥주기");
		list.add("버스랑 지하철에서 고통받기");
		list.add("커피 사서 수업듣기");
		list.add("오전 야무지게 보내고 점심먹기");
		list.add("오후 수업 듣고 집가기");
		list.add("더한 고통을 받으며 지하철과 버스 타기");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println("--iterator로 출력하기--");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		System.out.println();
		
		// list 사전 순으로 정렬하기.
		Collections.sort(list);
		
		System.out.println(list);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// compareTo
				// o1.compareTo(o2) : 오름차순
				// o2.compareTo(o1) : 내림차순
				
				return o2.compareTo(o1);
			}
		});
		System.out.println(list);
		
		
	}

}
