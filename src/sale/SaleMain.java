package sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
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
		Scanner sc = new Scanner(System.in);
		Controller c = new Controller();
		int menuSelect = 0;
		
		do {
			System.out.println("메뉴를 선택해주세요. (종료 : 7)");
			System.out.println("| 1. 메뉴추가 | 2. 메뉴삭제 | 3. 메뉴수정(가격) |");
			System.out.println("| 4. 메뉴보기 | 5. 주문하기 | 6. 주문내역출력   |");
			System.out.print("menu :");
			menuSelect = sc.nextInt();
			//System.out.println();
			switch(menuSelect) {
			case 1:
				c.insertMenu(sc);
				break;
			case 2:
				c.deleteMenu(sc);
				break;
			case 3:
				c.rePiceMenu(sc);
				break;
			case 4:
				c.printMenu();
				break;
			case 5:
				c.order(sc);
				break;
			case 6:
				c.printOrder();
				break;
				default :
					System.out.println("다시입력해주세요.");
					break;
			}
			
		}while(menuSelect != 7);
		System.out.println("종료되었습니다.");
		
	}

}

