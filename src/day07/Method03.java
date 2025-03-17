package day07;

public class Method03 {
	
	// 두 정수의 합을 리턴하는 메서드
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	// 두 정수의 차를 리턴하는 메서드
	public static int sum1(int num1, int num2) {
		return num1 - num2;
	}
	// 두 정수의 곱셈을 리턴하는 메서드
	public static int sum2(int num1, int num2) {
		return num1 * num2;
	// 두 정수의 나숫셈을 리턴하는 메서드	
	}
	public static double sum3(int num1, double num2) {
		
		double result = num1 / num2;
		
		if(num1 == 0 || num2 == 0) {
			result = -99999999;
		}
		return result;
		
	}
	// 두 정수의 나머지를 리턴하는 메서드
	public static int sum4(int num1, int num2) {
		int result = num1 % num2;
		
		if(num1 == 0 || num2 == 0) {
			result = -99999999;
		}
		return result;
	}

	public static void main(String[] args) {
		/* + - * / % 기능을 하는 메서드를 생성
		 * 
		 * main에서 호출 => 출력
		 * 
		 * 
		 * */
		// + sum
		// - sum1
		// * sum2
		// / sum3
		// % sum4
		int num1 = 0, num2 = 20;
		System.out.println(sum(num1, num2)); // 
		System.out.println(sum1(num1, num2)); // 
		System.out.println(sum2(num1, num2)); //
		double result3 = sum3(num1, num2);
		int result4 = sum4(num1, num2);
		if(result3 == -99999999) {
			System.out.println("num = 0");
		}else {
			System.out.println(sum3(num1, num2)); // /
		}
		if(result4 == -99999999) {
			System.out.println("num = 0");
		}else {
			System.out.println(sum4(num1, num2)); // %
		}
		
		System.out.println("-----------------");
		// 다른 클래스에 있는 메서드를 호출할 경우
		// 클래스명.메서드() = static 일 경우
		Method04.gugudan();
		
		
		
		
		
	}

}
