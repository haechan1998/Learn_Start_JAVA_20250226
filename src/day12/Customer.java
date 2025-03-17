package day12;

public class Customer {
	
	int customerID; // 고객ID
	String customerName; // 고객이름
	String customerGrade; // 고객등급
	int bonusPoint; // 보너스포인트
	double bonusRatio; // 보너스포인트 적립비율
	
	// 생성자.
	public Customer() {}
	
	public Customer(int ID, String name) {
		this.customerID = ID;
		this.customerName = name;
		this.customerGrade = "Sliver"; // 고객 객체가 생성될 시 기본 등급 Silver.
		this.bonusRatio = 0.01; // 고객 객체가 생성될 시 기본 적립비율 0.01.
		
	}
	
	public Customer(int ID, String name, String grade, int point, double ratio) {
		this();
		this.customerGrade = grade;
		this.bonusPoint = point;
		this.bonusRatio = ratio;
	}
	
	// 필요한 메서드...
	
	// 보너스 적립 계산 메서드.
	public int calcPrice(int price) {
		this.bonusPoint += (int)(price * this.bonusRatio); 
		
		return price;
	}
	
	// 출력메서드
	public void printInfo() {
		System.out.println(customerName+"님은 "+customerGrade+"고객이며,");
		System.out.println("보너스 포인트는"+bonusPoint+"점 입니다.");
	}
	
	// 고객정보.
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}
	
	// g/s

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
} // 부모 클래스

// Gold 클래스
class GoldCustomer extends Customer{
	
	private double saleRatio;
	
	public GoldCustomer() {}
	
	public GoldCustomer(int id, String name) {
		super(id, name);
		this.customerGrade = "Gold"; // 등급을 Gold 로 변환
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}

	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += (int)(price * this.bonusRatio); 
		
		return price - (int)(price * saleRatio);
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
}

// VIP 클래스
class VIPCustomer extends Customer{
	
	double saleRatio;
	String agentName;
	String agentNumber;
	
	public VIPCustomer() {}
	
	public VIPCustomer(int id, String name, String agentName, String agentNumber) {
		super(id, name);
		this.customerGrade = "VIP"; // 등급을 VIP 로 변환
		this.bonusRatio = 0.03;
		this.saleRatio = 0.1;
		this.agentName = agentName;
		this.agentNumber = agentNumber;
	}

	@Override
	public int calcPrice(int price) {
		this.bonusPoint += (int)(price * this.bonusRatio); 
		
		return price - (int)(price * saleRatio);
	}
	
	@Override
	public void printInfo() {
		System.out.println(customerName+"님은 "+customerGrade+"고객이며,");
		System.out.println("보너스 포인트는"+bonusPoint+"점 입니다.");
		System.out.println("전담 상담사는 "+agentName+"이고,"+" 번호는 "+agentNumber+"입니다.");
		
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentNumer() {
		return agentNumber;
	}

	public void setAgentNumer(String agentNumer) {
		this.agentNumber = agentNumer;
	}
	
	
	
	
}






















