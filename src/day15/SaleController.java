package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleController {
	
	// 멤버변수로 Sale 클래스 리스트를 생성
	// 제네릭 클래스 객체 생성
	
	private ArrayList<Sale<String, Integer>> list = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> orderList = new ArrayList<>();
	
//	private ArrayList<Sale<Integer, String>> list1 = new ArrayList<>(); // 정해지지 않아서 값을 바꿀 수 있다.
	
	public void add(Scanner sc) {
		// 메뉴추가
		System.out.println("메뉴명 :");
		String menu = sc.next();
		System.out.println("가격 :");
		int price = sc.nextInt();
		
		// 객체 생성 후 추가
		Sale<String, Integer> s = new Sale<String, Integer>(menu, price);
		list.add(s);
		System.out.println("메뉴추가 완료");
		
	}
	
	public void print() {
		for(Sale<String, Integer> s : list) { // list => Sale<String, Integer> 
			System.out.println(s);
//			int price = s.getPrice();
			
		}
	}
	
	public void order(Scanner sc) {
		// 주문
		/* 주문은 메뉴와 수량을 입력받아 list 에서 메뉴의 가격을 찾아와
		 * order 메뉴 / 수량*list 의 가격을 price 에 저장
		 */

		System.out.println("주문 할 메뉴명 :");
		String menu = sc.next();
		System.out.println("수량 :");
		int count = sc.nextInt();
		
		for (Sale<String, Integer> s : list) {
			if(s.getMenu().equals(menu)) { // if 문으로 조건식을 달아서 입력한 menu 와 list 의 getMenu 가 일치하는지 확인.
				Sale<String, Integer> order = new Sale<>(menu, s.getPrice() * count);
				orderList.add(order);
				System.out.println("주문 추가 완료");
				return;
			}
		}
		System.out.println("찾는 메뉴가 없습니다.");

	}
	
	public void orderPrint() {
		System.out.println("영수증");
		// order 출력
		// 마지막에 총 지불금액
		int total = 0;
		for(Sale<String,Integer> order : orderList) {
			System.out.println(order);
			total += order.getPrice(); // orderList 의 price 에는 total 값이 저장되어있다.
		}
		System.out.println("합계 :" + total);
		
			
		
	}
	
}











