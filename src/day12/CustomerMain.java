package day12;

public class CustomerMain {

	public static void main(String[] args) {
		/* 백화점
		 * - 일반고객 / Gold 고객(할인) / VIP 고객(할인)
		 * 
		 * 고객 => Customer 부모클래스.
		 * - 멤버변수
		 * 고객ID : int customerID
		 * 고객이름 : Stirng customerName
		 * 고객등급 : String customerGrade
		 * 보너스포인트 : int bonusPoint
		 * 보너스포인트 적립비율 : double bonusRatio
		 * 
		 * 
		 * 등급
		 * Silver (기본) / Gold / VIP
		 * - 기본 customerGrade = Silver
		 * - bonusRatio = 0.01% => 1% 적립
		 * 
		 * 클래스 생성
		 * -메서드
		 * 1. 보너스 적립 계산 메서드 (메서드명 : calcPrice)
		 *	  - 구매금액의 적립 보너스를 계산 => bonusPoint 누적.
		 *	  - 보너스 적립, 할인여부를 체크해서 구매 price 를 리턴.
		 *
		 * 2. 출력메서드 (메서드명 : customerInfo())
		 * 	  - 홍길동님은 VIP고객이며, 보너스 포인트는 1000점 입니다. <- 모든 customer
		 * 	  - 전담 상담사는 OOO 이고, 번호는 1111 입니다. <- VIP 한정.
		 * 
		 * 3. 등급별 할인 적립 여부
		 * 	  - Silver 등급
		 *	  - 제품을 구입할 때 0% 할인 / 보너스 포인트 1% 적립
		 * 	  - Gold 등급
		 * 	  - 제품을 구힙할 때 10% 할인 / 보너스 포인트 2% 적립
		 * 	  - VIP 등급
		 *	  - 제품을 구입할 때 10% 할인 / 보너스 포인트 3% 적립
		 *	  - 전담 상담사를 멤버변수에 추가하여 (agentName, agentNum)
		 *
		 * Customer => Silver 기본
		 * 
		 * GoldCustomer extends Customer{
		 * 	  기본 메서드 오버라이딩 해서 사용
		 * }
		 * 
		 * VIPCustomer extends Customer{
		 * 	  추가 + 기본 메서드 오버라이딩 해서 사용
		 * */

		
		Customer[] customerArr = new Customer[10];
		
		int cnt = 0;
		Customer aaa = new Customer(1111, "aaa");
		Customer bbb = new GoldCustomer(2222, "bbb");
		Customer ccc = new VIPCustomer(3333, "ccc", "직원", "0001");
		
		customerArr[cnt] = aaa;
		cnt++;
		customerArr[cnt] = bbb;
		cnt++;
		customerArr[cnt] = ccc;
		cnt++;
		
		int price = 100000;
		
		for(int i=0; i<cnt; i++) {
			int salsPrice = customerArr[i].calcPrice(price);
			System.out.println(customerArr[i].getCustomerName() + "님의 지불 금액은"
					+ salsPrice + " / 보너스 포인트" + customerArr[i].getBonusPoint()+ "입니다.");
			System.out.println("------------------------");
		}
		System.out.println();
		System.out.println("--고객 정보 리스트--");
		for(int i=0; i<cnt; i++) {
			customerArr[i].printInfo();
			System.out.println("------------------------");
		}
		System.out.println();
		
		// 다운캐스팅 사용
		// agentNum = 0001 (퇴사) => 0003 변경.
		for(int i=0; i<cnt; i++) {
			if(customerArr[i] instanceof VIPCustomer) { // VIP 가 여러명일경우 getName.equals로 name 을 비교한다.
				VIPCustomer vip = (VIPCustomer)customerArr[i]; // 다운캐스팅
				vip.setAgentNumer("0003");
				vip.setAgentName("직원3");
			}
		}
		System.out.println("--고객 정보 리스트--");
		for(int i=0; i<cnt; i++) {
			customerArr[i].printInfo();
			System.out.println("------------------------");
		}
		System.out.println();
		System.out.println(ccc);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
