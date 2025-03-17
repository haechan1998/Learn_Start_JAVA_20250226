package day10;

public class Super02 {

	public static void main(String[] args) {
		
		Dog dog = new Dog("토리", "비숑");
		dog.printInfo();
		dog.howl();
		
		System.out.println("--------------");
		
		Cat cat = new Cat("치즈", "코리안숏헤어");
		cat.printInfo();
		cat.howl();
		
	}

}

class Cat extends Animal{
	
	public Cat(String name, String category) {
		
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		
		super.howl();
		System.out.println("애옹");
	}
	
	
}

class Dog extends Animal{
	
	public Dog(String name, String category) {
		// 부모의 생성자 호출
		super(name, category);
		
		// 부모의 메서드를 호출하여 setter
//		super.setName(name);
//		super.setCategory(category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("멍멍");
	}
	
}

class Animal{ // 부모클래스
	private String name; // 이름
	private String category; // 종
	
	//생성자
	public Animal() {}
	public Animal(String name, String category) {
		
		this.name = name;
		this.category = category;
	}
	
	// 출력 메서드
	public void printInfo() {
		System.out.println("이름:"+name);
		System.out.println("종:"+category);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	// 울음소리출력 메서드
	public void howl() {
		System.out.println("--"+ name + "--울음소리--");
	}
	
	
}