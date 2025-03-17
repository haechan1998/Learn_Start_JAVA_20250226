package day12;

public class Polymorphism {

	public static void main(String[] args) {
		/* 객체지향 프로그램의 4가지 특징
		 * 
		 * - 프로그램을 독립적인 단위인 객체들을 모아서 처리하는 모임
		 * - 각각의 객체는 메시지를 주고 받으면서 데이터를 처리
		 * - 추상화, 캡슐화(정보은닉), 상속, 다형성
		 * 
		 * - 추상화(Abstraction) - 공통적인 코드만 제공
		 * - 구현된 부분과(공통코드), 구현되지 않은 부분(개별코드) 분리한다.
		 * - 개별적인 부분은 표현되지 않는 기능.
		 * 
		 * - 캡슐화(Encapsulation) - 데이터를 보호(정보은닉)하는 역할
		 * - 멤버변수는 숨기고, 메서드를 통해 접근.
		 * - 멤버변수와 메서드를 하나로 묶어서 처리
		 * - 은닉 : 객체 내부의 정보는 숨기고, 외부로 드러나지 않게 하는 것.
		 * - 은닉의 이유 : 외부에서 데이터에 직접 접근하는것을 막음.
		 * 
		 * - 상속(Inheritance) - 코드 재사용
		 * - 클래스가 상속 받아서 수정하면 중복 코드를 줄일 수 있다.
		 * - 유지보수가 편함.
		 * 
		 * - 다형성(Polymorphism) - 객체의 형반환 용이
		 * - 하나의 코드(부모객체)가 여러 자료(자식객체)형으로 구현되어 실행되는 것.
		 * - 코드는 같은데, 들어오는 객체에 따라 다른 실행결과를 얻을 수 있음.
		 * - 다형성을 잘 활용하면 유연하고, 확장성있는, 유지보수가 편리한 프로그램을 만들 수 있다.
		 * 
		 * 
		 * 
		 * */
		
		// Human, tiger, eagle, dog 객체를 각자 생성
		
		Human h = new Human();
		h.move();
		h.hands();
		
		Tiger t = new Tiger();
		t.move();
		t.hunting();
		
		Eagle e =  new Eagle();
		e.move();
		e.flying();
		
		Dog d = new Dog();
		d.move();
		System.out.println();
		System.out.println("--부모 객체로 자식 객체를 생성--");
		
		// upCasting : 자동으로 가능
		Animal h1 = new Human(); 
		h1.move();
//		h1.hands(); > 자식객체가 독립적으로 가지고있는 메서드는 사용하지 못한다.
		Animal t1 = new Tiger();
		t1.move();
		Animal e1 = new Eagle();
		e1.move();
		
//		Animal d1 = new Dog(); > Animal 객체와 상속관계가 아닌 Dog 객체로는 형변환이 안된다.
		
		// moverAnimal 메서드 실행
		System.out.println();
		System.out.println("--메서드 실행--");
		
		Polymorphism poly = new Polymorphism();
		poly.moveAnimal(h); // human
		poly.moveAnimal2(t); // tiger
		poly.moveAnimal3(e); // eagle
		
		System.out.println();
		System.out.println("--다형성을 활용한 메서드 실행--");
		// 부모의 객체로 생성된(상속받은) 객체는 모두 메서드 사용가능.
		// 부모 객체로 생성된 객체이기 때문에 당연히 가능
		
		poly.moveAnimal4(h1); // 부모 객체로 생성된 객체
		poly.moveAnimal4(t1);
		poly.moveAnimal4(e1);
		// 자식 객체로 생성된 객체도 형변환이 자동으로 이루어져 출력 가능.
		
		poly.moveAnimal4(h); // 자식객체로 생성된 객체
		
		System.out.println();
		System.out.println("--Animal 배열 생성 예시--");
		
		Animal[] animalArr = new Animal[5];
		int cnt = 0;
		animalArr[cnt] = h1;
		cnt++;
		animalArr[cnt] = t1;
		cnt++;
		animalArr[cnt] = e1;
		cnt++;
		
		for(int i=0; i<cnt; i++) {
			animalArr[i].move();
		}
		
		// 자식 객체가 가지고 있는 고유 메서드를 사용 하려면 downCasting
		
		System.out.println();
		System.out.println("--downCasting 예제--");
		
		// downCasting 은 자동으로 형변환 해주지 않는다.
		// 
		Human human = (Human)/*형변환을 해줘야한다.*/animalArr[0]; 
		human.move();
		human.hands();
		
		// downCasting 은 Animal 을 상속받은 객체라면 downCasting 에서 에러는 나지 않는다.
		// 컴파일 실행시 해당 객체가 잘못 되었다면, ClassCastException
		
		// downCasting 오류 예시. 
//		Human human = (Human)animalArr[1]; index 1번의 객체는 Tiger.
//		human.move();
//		human.hands();
		
		//instanceOf : 객체가 해당 클래스 형에 맞는지 체크하는 연산자. boolean 으로 값을 반환 해준다.
		System.out.println(animalArr[0] instanceof Human);
		System.out.println(animalArr[1] instanceof Human);
		
		int humanIndex = -1;
		int tigerIndex = -1;
		int eagleIndex = -1;
		for(int i=0; i<cnt; i++) {
			if(animalArr[i] instanceof Human) {
				Human downCastHuman = (Human)animalArr[i];
				downCastHuman.hands();
				humanIndex = i;
			}else if(animalArr[i] instanceof Tiger) {
				Tiger downCastTiger = (Tiger)animalArr[i];
				downCastTiger.hunting();
				tigerIndex = i;
				
			}else if(animalArr[i] instanceof Eagle) {
				Eagle downCastEagle = (Eagle)animalArr[i];
				downCastEagle.flying();
				eagleIndex = i;
			}else {
				System.out.println("안됨");
			}
		}
		System.out.println("Human index" + humanIndex);
		System.out.println("Tiger index" + eagleIndex);
		System.out.println("Eagle index" + tigerIndex);
		
		
		// downCasting : 조건부 가능
		
	}
	
	// 각 객체의 move 를 실행해주는 메서드
	public void moveAnimal(Human human) {
		human.move();
	}
	public void moveAnimal2(Tiger tiger) {
		tiger.move();
	}
	public void moveAnimal3(Eagle eagle) {
		eagle.move();
	}
	// 다형성을 활용한 메서드로 변경
	public void moveAnimal4(Animal animal) {
		animal.move();
	}
	

}

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람은 뚜벅뚜벅 걷습니다.");
	}
	public void hands() {
		System.out.println("사람은 손을 자유롭게 쓸 수 있다.");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 독독거리며 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 하늘에서 사냥을 합니다.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 호랑호랑 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Dog{

	public void move() {
		System.out.println("강아지가 아장아장 걷습니다.");
	}
	
}
























