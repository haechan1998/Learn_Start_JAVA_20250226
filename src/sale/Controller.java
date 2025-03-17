package sale;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	/* --menu--
	 * 1. 메뉴추가 | 2. 메뉴삭제 | 3. 메뉴수정(가격수정)
	 * 4. 메뉴보기(전체메뉴출력) | 5. 주문 | 6. 주문내역출력(영수증) 
	 * 7. 종료
	 * */
	
	ArrayList<Menu> menuArr = new ArrayList<Menu>();
	ArrayList<MenuOrder> menuOrderArr = new ArrayList<MenuOrder>(); // 일단 이게 필요한지 잘 모르겠음. 사람이 주문을 많이하면 필요할듯?
	
	
	// 출력
	@Override
	public String toString() {
		return "Controller [menuArr=" + menuArr + ", menuOrderArr=" + menuOrderArr + "]";
	}
	
	// 필요한 메서드...
	// 1. 메뉴 추가
	public void insetMenu(Scanner sc) { 
		
		// 메뉴명
		String name = sc.next();
		int code = sc.nextInt();
		int price = sc.nextInt();
		
		Menu m = new Menu(name, code, price);
		
		menuArr.add(m); // 입력한걸 메뉴 Arr 에 저장. 
		
	}
	// 2. 메뉴 삭제
	public void deleteMenu(Scanner sc) { 
		
		int code = sc.nextInt(); // 입력받는 코드를 저장할 변수.
		
		for(int i=0; i<menuArr.size(); i++) {
			if(menuArr.get(i).getMenuCode() == code) { // 메뉴 코드와 내가 입력한 코드가 같은경우 삭제.
				menuArr.remove(i);
			}
		}
		
	}
	// 3. 메뉴 수정(가격수정)
	public void rePiceMenu(Scanner sc) { // 가격 수정만 한다.
		
		int code = sc.nextInt(); // 수정받을 메뉴의 코드
		int rePrice = sc.nextInt(); // 수정받을 가격.
		
		for(int i=0; i<menuArr.size(); i++) {
			if(menuArr.get(i).getMenuCode() == code) { 
				Menu m = new Menu(menuArr.get(i).getMenuName(), code, rePrice);
				menuArr.set(i, m); // 좀 생각해보기.
			}
		}
		
		
	}
	
	// 4. 메뉴 보기
	public void printMenu() {
		System.out.println(menuOrderArr);
	}
	
	
	// 5. 주문
	public void order(Scanner sc) {
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// getter/setter
	public ArrayList<Menu> getMenuArr() {
		return menuArr;
	}
	
	public void setMenuArr(ArrayList<Menu> menuArr) {
		this.menuArr = menuArr;
	}
	
	public ArrayList<MenuOrder> getMenuOrderArr() {
		return menuOrderArr;
	}
	
	public void setMenuOrderArr(ArrayList<MenuOrder> menuOrderArr) {
		this.menuOrderArr = menuOrderArr;
	}
	
	
	
	
}
