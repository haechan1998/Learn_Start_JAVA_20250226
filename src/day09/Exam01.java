package day09;

public class Exam01 {

	public static void main(String[] args) {
		/* 메서드로 작업
		 * 두 정수의 값이 주어졌을 때
		 * 두 정수 사이의 모든 정수의 합을 리턴하는 메서드
		 * ex) a=3, b=5 => 3+4+5
		 * a=10, b=5 => 5+6+7+8+9+10
		 * a=10, b=10
		 * */
		
		Exam01 ex = new Exam01();
		System.out.println(ex.sum(10, 10));
		System.out.println(ex.sum(1, 10));
		System.out.println(ex.sum(5, 10));
		
	}
	
	public int sum(int num1, int num2) {
		int result = 0;
		if(num1 == num2) {
			return num1;
		}
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
				
		for(int i = min; i<=max; i++) {
			result += i;
		}
		return result;
	}

}
