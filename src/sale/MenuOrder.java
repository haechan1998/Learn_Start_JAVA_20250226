package sale;

// Menu 클래스를 상속 받자

/* kisok
	 * 
	 * 메뉴(메뉴명, 메뉴코드, 가격) / 주문(메뉴명, 메뉴코드, 가격, 수량, 금액(가격 * 수량))
	 * 주문 class 는 메뉴 class 를 상속받아 확장.
	 * 
	 * ex) ArrayList<클래스명>
	 * 
	 * --menu--
	 * 1. 메뉴추가 | 2. 메뉴삭제 | 3. 메뉴수정(가격수정)
	 * 4. 메뉴보기(전체메뉴출력) | 5. 주문 | 6. 주문내역출력(영수증) 
	 * 7. 종료
	 * */

public class MenuOrder extends Menu{
	
	private int MenuCount; // 수량
	private int MenuMutiPrice; // (가격 * 수량)
	
	public MenuOrder() {}
	
	public MenuOrder(String menuName, int menuCode, int menuCount) {
		this.MenuCount = menuCount;
		
		
	}

	public MenuOrder(String menuName, int menuCode, int menuPrice, int MenuCount) { // 주문시 필요한 것.
		super(menuName, menuCode, menuPrice);
		this.MenuCount = MenuCount;
		this.MenuMutiPrice = menuPrice * MenuCount; // (가격*수량)
	}

	// 출력
	@Override
	public String toString() {
		return "MenuOrder [MenuCount=" + MenuCount + ", MenuMutiPrice=" + MenuMutiPrice + "]";
	}

	// getter/setter
	public int getMenuCount() {
		return MenuCount;
	}

	public void setMenuCount(int menuCount) {
		MenuCount = menuCount;
	}

	public int getMenuMutiPrice() {
		return MenuMutiPrice;
	}

	public void setMenuMutiPrice(int menuMutiPrice) {
		MenuMutiPrice = menuMutiPrice;
	}

	
	
	
	
	

}
