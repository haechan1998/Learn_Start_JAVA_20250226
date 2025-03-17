package sale;

public class Menu {
	/* kisok
	 * 
	 * 메뉴(메뉴명, 메뉴코드, 가격) / 주문(메뉴명, 메뉴코드, 가격, 수량, 금액)
	 * 주문 class 는 메뉴 class 를 상속받아 확장.
	 * 
	 * ex) ArrayList<클래스명>
	 * 
	 * --menu--
	 * 1. 메뉴추가 | 2. 메뉴삭제 | 3. 메뉴수정(가격수정)
	 * 4. 메뉴보기(전체메뉴출력) | 5. 주문 | 6. 주문내역출력(영수증) 
	 * 7. 종료
	 * */
	
	private String menuName; // 메뉴명
	private int menuCode; // 메뉴코드
	private int menuPrice; // 메뉴가격
	
	// 생성자
	public Menu() {}

	public Menu(String menuName, int menuCode, int menuPrice) {
		this.menuName = menuName;
		this.menuCode = menuCode;
		this.menuPrice = menuPrice;
	}

	// 출력
	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", menuCode=" + menuCode + ", menuPrice=" + menuPrice + "]";
	}
	
	// getter/setter
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(int menuCode) {
		this.menuCode = menuCode;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
	
}
