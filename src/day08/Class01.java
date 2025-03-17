package day08;

public class Class01 {

	/* 클래스의 구성요소 : 멤버변수, 메서드, (생성자)
	 * 멤버변수 먼저, 메서드가 뒤에 선언
	 * 
	 * 클래스 - 객체를 생성하기 위한 설계도.
	 * 객체 - 제품(클래스로 부터 생성된 제품)
	 * 메서드 - 기능.
	 * 멤버변수 - 속성(메서드의 기능에 필요한). 정보
	 * 
	 * 프린트 클래스
	 * - 속성(멤버변수) : 크기, 색, 제조사, 제품명, 종류
	 * - 기능(메서드) : 인쇄, 복사, 스캔, 팩스
	 * 
	 * 클래스는 다른 클래스와 겹쳐지지 않게 정의
	 * 
	 * <클래스를 선언>
	 * 
	 * class 클래스명
	 * -public class => 파일명과 같은 이름의 클래스에게만 부여 (한 파일에 하나밖에 못붙힌다.) / 2개 있음 error.
	 * 
	 * 객체 선언 > 객체 생성
	 * 클래스명 객체명 = new 클래스명(); => [ new 생성자(); ] 
	 * 
	 * 객체 선언
	 * 클래스명 객체명; => 값은 null
	 * 객체명 = new 클래스명();
	 * 
	 * 메서드 사용방법(static 이 안붙은 일반 메서드)
	 * - 다른 클래스에서 호출 할 경우 => 객체를 선언 후 객체명.메서드명();
	 * - 같은 클래스 안에서 메서드를 호출 할 경우 => 메서드명();
	 * 
	 * 접근제어자(제한자)
	 * public : 모두 사용가능
	 * protected : 나 + 패키지 + 자식클래스 (상속을 위함)
	 * (default) : 나 + 패키지
	 * private : 나
	 * 
	 * private < default < protected < public
	 * 
	 * - 하나의 파일 안에 하나의 클래스만 있을 수 있는건 아님.
	 * - 하지만 일반적으로 하나의 파일에 하나의 클래스를 사용
	 * - 클래스에서 public 을 붙일 수 있는건 파일명 == 클래스명 같을 경우만 가능
	 * - 멤버변수나, 메서드에서는 public 가능.
	 * - 멤버변수는 private, 메서드는 public 선언이 일반적.
	 * - 멤버변수는 private 이면 다른 클래스에서 접근 불가능.
	 * - private 으로 선언된 멤버변수는 getter / setter 메서드를 만들어서
	 *   해당 변수로 접근 가능하도록 만들어줌.
	 *   
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Point p = new Point(); // x=0, y=0
		
		p.print(); // (0,0)
//		p.x = 10;
//		p.y = 20;
		p.setX(10);
		p.setY(5);
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		p.print();
		
		Point p2 = new Point(); // 새로운 객체. p1 != p2
		
		System.out.println("---------------");
		p2.print();
//		p2.x = 5;
//		p2.y = 3;
		p2.setX(20);
		p2.setY(50);
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		p2.print();
		
		// x+y x 값으로 설정
		p2.setX(p2.getX()+p2.getY());
		
		p2.print();
		
		p.print();
		
	}

}

// (0,1) => (x,y)

class Point{
	// 멤버변수 위치
	// 멤버변수는 초기값을 설정하지 않아도 자동 설정.
	// int = 0, String = null
	private int x;
	private int y;
	
	
//	void test() { // 같은 패키지 안에 있는 클래스에서 사용 가능하다.
//		print(); // 이런식으로 같은 클래스일 경우 매서드명만 써서 호출 할 수 있다.
//	}
	
	// 멤버변수 선언 후 메서드 / 멤버변수가 있는경우 매개변수를 추가로 받을 필요 없다(이미 메서드 안에 있다고 생각한다).
	// 멤버변수에 this.멤버변수 (내 클래스는 this, 상속 클래스는 super)
	// 멤버변수 선언 후 메서드
	// x,y 출력 메서드
	public void print() {
		System.out.println("("+x+","+y+")");
		
	}
	
	// getter / setter 메서드 생성 // 가장 마지막에 위치한다.(양이 많음)
	
	public int getX() {
		return x;
	} // x 의 값을 주는 메서드 
	
	public int getY() {
		return y;
	} // y 의 값을 주는 메서드
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
}
