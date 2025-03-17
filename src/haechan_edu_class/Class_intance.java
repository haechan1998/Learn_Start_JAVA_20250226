package haechan_edu_class;

public class Class_intance {

	public static void main(String[] args) {
		
		System.out.println("Card.width =" + Card.width);
		System.out.println("Card.heigt =" + Card.heigt);
		
		Card c1 = new Card(); // Card 인스턴스를 참조하기 위한 변수 c1을 선언하고 생성한다.
		c1.kind/* 클래스에서 가져온 String 값 멤버변수이다. */ = "heart";
		c1.number/* 클래스에서 가져온 int 값 */ = 7; 
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " +c1.number + "이며, 크기는 (" + Card.width +","+ Card.heigt + ")으로 변경합니다.");
		System.out.println("c2은 " + c2.kind + ", " +c2.number + "이며, 크기는 (" + Card.width +","+ Card.heigt + ")으로 변경합니다.");
		
		c1.width = 50; // 인스턴스 변수를 여기에서 변경 가능.
		c2.heigt = 80;
		System.out.println("c1의 width와 heigt를 각각 50, 80으로 변경합니다.");
		
		
		
		
	}

}
class Card {
	String kind; // 인스턴스 변수
	int number; // 인스턴스 변수
	static int width = 100; // 인스턴스 변수 / 상수(final)은 아니다.
	static int heigt = 250; // 인스턴스 변수
}

