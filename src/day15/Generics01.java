package day15;

import java.util.Scanner;

public class Generics01 {

	public static void main(String[] args) {
		/* 제네릭(Generic) : 데이터 타입을 나중에 확정하는 기법.
		 * 클래스나 메서드를 생성할 때 어떤 데이터가 들어올지 확신이 없다면...
		 * 제네릭 타입으로 구현 => 나중에 객체를 생성할 때 타입을 확정하여 구현.
		 * 
		 * 객체의 타입을 컴파일 할 때 체크가 가능하여 타입의 안정성을 해치치 않는
		 * 선에서 적당히 형변환이 가능함.
		 * 
		 * 안정성 - 의도하지 않은 타입의 객체가 저장되는 것을 막는 의미
		 * 
		 * 
		 * */
		
//		ArrayList<E> name = new ArrayList<E>(); // 이런식으로 사용한다. E 에 해당 객체가 들어가 있어야한다.
//		HashMap<K, V> map = new HashMap<K, V>();
		
		/* Sale 클래스 생성 => 제네릭으로 생성.
		 * main
		 * 1. 메뉴추가 | 2. 메뉴보기 | 3. 제품주문 | 4. 주문내역보기 | 5. 종료
		 * */
		
		Scanner sc = new Scanner(System.in);
		SaleController c = new SaleController();
		int select = 0;
		do {
			System.out.println("1. 메뉴추가 | 2. 메뉴보기 | 3. 제품주문 | 4. 주문내역보기 | 5. 종료");
			System.out.print("입력 >");
			select = sc.nextInt();
			switch(select) {
			case 1: c.add(sc); break;
			case 2: c.print(); break;
			case 3: c.order(sc); break;
			case 4: c.orderPrint(); break;
			case 5: System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다."); break;
				
			}
			
		}while(select != 5);
		
		
	}

}
