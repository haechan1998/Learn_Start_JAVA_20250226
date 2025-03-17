package day13;

public class Anonymous01 {

	public static void main(String[] args) {
		/* 익명클래스 (Anonymous Class) : 내부클래스의 일종.
		 * 나중에 다시 객체를 생성할 일이 없는 것을 의미.
		 * 한번 쓰고 버려지는 개체 (1회용 클래스)
		 * 
		 * 인터페이스를 사용하여 객체를 생성할 경우 
		 * - 인터페이스의 구현 외 다른 구현이 없고, 해당 객체를 하나만 사용하는 경우.
		 * - 인터페이스의 기능이 적은 경우. 
		 * - 메서드의 매개변수로 객체가 사용되는 케이스.
		 * 
		 * */
		Anonymous01 an = new Anonymous01();
//		Tv t = new Tv();
//		an.product(t);
		
		System.out.println("----------------");
		
		// 익명클래스로 작업하는 경우
		an.product(new Power() {

			@Override
			public void trunOn() {
				System.out.println("전원 On");
			}

			@Override
			public void trunOff() {
				System.out.println("전원 Off");
				
			}
			
		});
		
	} // main
	
	public void product(Power p) {
		p.trunOn();
		System.out.println("정상 작동중...");
		p.trunOff();
	}

}



interface Power{
	void trunOn();
	void trunOff();
}

//class Tv implements Power{
//
//	@Override
//	public void trunOn() {
//		System.out.println("전원이 켜집니다.");
//	}
//
//	@Override
//	public void trunOff() {
//		System.out.println("전원이 꺼집니다.");
//		
//	}
//	
//}