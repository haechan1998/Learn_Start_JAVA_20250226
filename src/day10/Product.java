package day10;

public class Product {
	
	/* Product 클래스 생성 : 상품을 등록하는 클래스
	 * 상품명, 가격 / 멤버변수.
	 * 
	 * 상품명과 가격을 출력하는 메서드
	 * 상품을 추가하는 메서드
	 * 
	 * */
	
	private String productName; // 상품명
	private int productPrice; // 상품 가격
	
	public Product() {} // 기본 생성자.
	
	public Product(String productName, int productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	// 상품명과 가격을 출력하는 메서드.
	public void productInfo() {
				System.out.println("상품명 :" + productName + "/가격 :" + productPrice);
	}
	
	// 기본 출력 메서드
//	@Override // 오버라이드란. 부모 클래스의 메서드를 자식 클래스로 받아 수정해서 쓰는것.
//	public String toString() {
//		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
//	}
	
	
	// 상품을 추가하는 메서드
	public void productInput(String name, int price) { // 여기서 스트링 값과 가격은 스캐너로 입력받는다
			this.productName = name;
			this.productPrice = price;
	}


	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	
}

