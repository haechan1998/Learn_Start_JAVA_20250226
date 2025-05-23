package day16;

public class Customer {

	// 필요한 매개변수는 이름, 나이, 비용
	
	private String name;
	private int age;
	private int price;
	
	public Customer() {}

	public Customer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "  나이 : "  + age + "  비용 : " + price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
