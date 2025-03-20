package day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class streamEx01 {

	public static void main(String[] args) {
		
		/* 여행사 상품
		 * 여행비용이 15세 이상은 100만원, 15세 미만은 50만원으로 계산
		 * 
		 * 고객 5명이 패키지 여행을 떠난다고 했을 경우
		 * 1. 비용을 계산 => 출력
		 * 2. 고객명단 출력
		 * 
		 * 고객(Customer) 클래스 생성 ArrayList로 관리
		 * 
		 * 예)
		 * 이름 : 홍길동  나이 : 40  비용 : 100
		 * 이름 : 홍길동1  나이 : 14  비용 : 50
		 * 이름 : 홍길동2  나이 : 20  비용 : 100
		 * 이름 : 홍길동3  나이 : 15  비용 : 100
		 * 
		 * 3. 20세 이상의 고객 명단 => 이름순으로 정렬
		 * 
		 * */
		ArrayList<Customer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int select = 0;
		while(select != 4) {
			
			System.out.println("1. 고객등록 | 2. 명단출력 | 3. 20세이상 명단 (종료 : 4)");
			System.out.println("입력 >");
			select = sc.nextInt();
			switch(select) {
			
			case 1: // 고객 등록
				Customer customer = new Customer();
				System.out.println("고객 등록.");
				System.out.println("이름 >");
				String setName = sc.next();
				customer.setName(setName);
				System.out.println("나이 >");
				int setAge = sc.nextInt();
				customer.setAge(setAge);
				int price = 100;
				if(setAge < 15) {
					price -= 50;
				}
				customer.setPrice(price);
				list.add(customer);
				System.out.println("고객 등록 완료");
				break;
				
			case 2: // 명단 출력 // list.size() 가 5 미만이면 출력 안되게 해야하나?
				System.out.println("명단출력 및 총 경비");
				list.stream()
				.forEach(n -> System.out.println(n));
				int sum = list.stream()
				.mapToInt(n -> n.getPrice())
				.sum();
				System.out.println("총액 : " + sum);
				break;
				
			case 3: // 20세 이상 고객명단 출력
				System.out.println("20세 이상 고객명단");
				list.stream()
				.filter(n -> n.getAge() >= 20)
				.sorted(new Comparator<Customer>(){
					
					@Override
					public int compare(Customer o1, Customer o2) {
						return o1.getName().compareTo(o2.getName());
					}
				})
				.forEach(n -> System.out.println(n));
				break;
				
			case 4:
				System.out.println("종료");
				break;
				
				default :
					System.out.println("잘못입력");
					break;
			}
			
		}
		
		sc.close();
		
		
	}
	
}
