package day10;

import java.util.Scanner;

public class ClassEx01 {

	public static void main(String[] args) {
		
		/* Product 클래스 생성 : 상품을 등록하는 클래스
		 * 상품명, 가격 / 멤버변수.
		 * 
		 * 상품명과 가격을 출력하는 메서드
		 * 상품을 추가하는 메서드
		 * 
		 * */
		
		/* main 클래스에서 처리
		 * 상품 10개를 등록 가능한 배열 생성.
		 * 스캐너를 통해서 상품을 등록받기
		 * 등록한 상품을 출력
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		Product[] pArr = new Product[10]; // 클래스 배열을 만들경우 배열에 클래스 객체가 담긴다.
		// 그 배열에 들어가는 객체를 반복문에서 매번 새롭게 선언 한다면, 객체명은 신경쓰지 않아도 된다.
		// but, 반복문 밖에서 클래스 객체를 선언하는 경우에는 매 객체마다 이름이 달라야한다.
		
		System.out.println("상품등록 10가지.");
		
			String pName = "";
			int pPrice = 0;
			int sum = 0, count = 0;
			
			for(int i=0; i<pArr.length; i++) {
				System.out.println("상품의 이름과 가격을 입력해주세요.");
				Product p = new Product();
				
				pName = sc.nextLine(); // Line 이 엔터를 먹어서 한줄로 쭉 작성하는 경우가 아니라면 next()
				if(pName.equals("종료")) {
					break;
				}
				pPrice = sc.nextInt();
				
				p.productInput(pName, pPrice);
				pArr[i] = p;
				count++; // 횟수만큼 배열값 지정. // 추가로 반복문 벗어날 키워드를 줘야한다.
				sc.nextLine();
				System.out.println("----배열 확인용----");
				
			}
			
			for(int i=0; i<count; i++) {
				pArr[i].productInfo();
				sum += pArr[i].getProductPrice();
			}
			System.out.println(sum);
			
		sc.close();
		
		
		
	}

}
