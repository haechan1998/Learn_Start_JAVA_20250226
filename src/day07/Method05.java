package day07;

public class Method05 {
	// 두 정수를 입력받아, 최대공약수를 리턴하는 메서드
	/* 리턴타입 : 최대공약수 => int
	 * 매개변수 : 두정수 => int num1, int num2
	 * 메서드명 : sum1
	 * */
	public static int sum1(int num1, int num2) {
		int result = 0;
		int min = (int)(Math.min(num1, num2));
		for(int i=1; i<=min; i++) {
			if(min % i == 0) {
				result = i;
			}
		}
		return result;
	}
	// 두 정수를 입력받아, 최소공배수를 리턴하는 메서드
	/* 리턴타입 : 최소공배수 => int
	 * 매개변수 : 두정수 => int num1, int num2
	 * 매서드명 : sum2
	 * */
	public static int sum2(int num1, int num2) {
		int result = 0;
		for(int i = num1; ; i+=num1) {
			if(i % num1 == 0 &&  i % num2 == 0) {
				result = i;
				return result;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		/* 최대 공약수, 최소 공배수 리턴
		 *
		 * 
		 * */
		int num1 = 6;
		int num2 = 12;
		int result1 = sum1(num1, num2);
		int result2 = sum2(num1, num2);
		System.out.println(result1);
		System.out.println(result2);
		
		
	}

}
