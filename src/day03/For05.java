package day03;

public class For05 {

	public static void main(String[] args) {
		/* 약수 : 1부터 자신의 수까지 나누어서 떨어지는 수 (나머지가 0인 수)
		 * 공약수 : 두 수의 공통된 약수
		 * 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12
		 * 공약수 : 1 2 3 6 => 최대공약수 : 6
		 * 
		 * */ 
		
		// 공약수 출력
		
		// 최대 공약수를 찾을경우 숫자가 더 낮은쪽으로 범위를 설정해주는게 좋다.
		// 출력 받을경우는 그냥 신경쓰지않는게 좋다.
		
		int num1 = 12;
		int num2 = 24;
		
		int min = (int)Math.min(num1, num2); // 출력 받을 경우 min || max 를 사용하여 크기비교를 해서 범위를 지정하자
		
		int gcd = 0;
		
		for(int i = 1; i <= min; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.print(i + " ");
				gcd = i;
			}
		}
		System.out.println("\n" + gcd);
		
		System.out.println("---------------------------------------");
		
		// 바로 최대공약수 구하기
		for(int i = num1; i >= 1; num1--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(i + " ");
				break;
			}
		}
		System.out.println("---------------------------------------");
		
		// 바로 최대공약수 구하기
				for(int i = num1; ; num1--) {
					if(num1 % i == 0 && num2 % i == 0) {
						System.out.print(i + " ");
						break;
					}
				}
		
		
	}

}
