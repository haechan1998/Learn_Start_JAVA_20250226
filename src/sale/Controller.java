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
	public void insertMenu(Scanner sc) { 
		// 메뉴명
		System.out.print("메뉴명 :");
		String name = sc.next();
		System.out.print("메뉴코드 :");
		int code = sc.nextInt();
		System.out.print("메뉴가격 :");
		int price = sc.nextInt();
		
		Menu m = new Menu(name, code, price);
		
		menuArr.add(m); // 입력한걸 메뉴 Arr 에 저장. 
		
	}
	// 2. 메뉴 삭제
	public void deleteMenu(Scanner sc) { 
		if(menuArr.isEmpty()) {
			System.out.println("삭제할 메뉴가 없습니다.");
		}else {
			System.out.println("삭제할 메뉴의 코드를 입력하세요.");
			int code = sc.nextInt(); // 입력받는 코드를 저장할 변수.
			
			for(int i=0; i<menuArr.size(); i++) {
				if(menuArr.get(i).getMenuCode() == code) { // 메뉴 코드와 내가 입력한 코드가 같은경우 삭제.
					menuArr.remove(i);
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("삭제코드가 잘못되었습니다.");
					break; // 메뉴 숫자가 증가하면 반복이 증가하기 때문에 break 걸어준다.
				}
			}
		}
		
	}
	// 3. 메뉴 수정(가격수정)
	public void rePiceMenu(Scanner sc) { // 가격 수정만 한다.
		System.out.println("수정할 메뉴의 코드를 입력하세요.");
		int code = sc.nextInt(); // 수정받을 메뉴의 코드
		System.out.println("수정할 가격을 입력하세요.");
		int rePrice = sc.nextInt(); // 수정받을 가격.
		
		for(int i=0; i<menuArr.size(); i++) {
			if(menuArr.get(i).getMenuCode() == code) { 
				Menu m = new Menu(menuArr.get(i).getMenuName(), code, rePrice);
				menuArr.set(i, m); // 좀 생각해보기.
			}
		}
		System.out.println("수정이 완료되었습니다.");
		
	}
	
	// 4. 메뉴 보기
	public void printMenu() {
		if(menuArr.isEmpty()) {
			System.out.println("현재 메뉴가 없습니다.");
		}
		
		for(int i=0; i<menuArr.size(); i++) {
			String name = menuArr.get(i).getMenuName();
			int code = menuArr.get(i).getMenuCode();
			int price = menuArr.get(i).getMenuPrice();
			System.out.println("메뉴명 : " + name + " | 메뉴코드 : " + code + " | 가격 : " + price);
			
		}
	}
	
	
	// 5. 주문
	public void order(Scanner sc) {
		int index = 0;
		System.out.println("메뉴 코드와 수량을 입력하면 주문합니다.(종료 : 0)");
		for(int i=0; i<menuArr.size(); i++) {
			System.out.print("메뉴코드 >");
			int code = sc.nextInt();
			if(code == 0) {
				break;
			}
			System.out.print("수량 >");
			int count = sc.nextInt();
			if(menuArr.get(i).getMenuCode() == code) {
				MenuOrder od = new MenuOrder(menuArr.get(i).getMenuName(), code, 
						menuArr.get(i).getMenuPrice(), count);
				menuOrderArr.add(index, od);
				index++;
			}
		}
		System.out.println("주문이 완료되었습니다.");
	}
	
	// 6. 주문내역출력(영수증)
	public void printOrder() {
		int total = 0;
		for(int i=0; i<menuOrderArr.size(); i++) {
			System.out.println("메뉴명 : " + menuOrderArr.get(i).getMenuName() + " 메뉴코드 : " + 
		menuOrderArr.get(i).getMenuCode() + " 가격 : " + menuOrderArr.get(i).getMenuPrice()
		+ " 수량 : " + menuOrderArr.get(i).getMenuCount() + 
		" 금액 : " + menuOrderArr.get(i).getMenuMutiPrice());
			total += menuOrderArr.get(i).getMenuMutiPrice();
		}
		System.out.println("총 액 : " + total);
		menuOrderArr.clear(); // 주문 확정 찍으면 담아둔 주문을 초기화.
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
