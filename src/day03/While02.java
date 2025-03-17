package day03;

public class While02 {

	public static void main(String[] args) {
		/* 1부터 50까지 짝수 출력
		 * 2 4 6 8 10
		 * 12 14 16 18 20
		 * ...
		 * 42 44 46 48 50
		 * 
		 * while 한개만 사용해서 출력
		 */
		System.out.println("while");
		int i = 1;
		int a = 1;
		
		while(i <= 50) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}else if (i >= 10 * a) {
				System.out.println();
				a++;
			}// if 문
			i++;
		} // while 문
		System.out.println();
		
		// switch 문을 이용한 줄바꿈
		// printf 를 활용해서 정리
		
		System.out.println("--------------");		
		System.out.println("switch");
		
		i = 1; // i 의 값을 초기화
		
		while(i <= 50) {
			if(i % 2 == 0) {
				System.out.printf("%5d",i);
			}switch(i) {
			case 10: case 20: case 30: case 40: case 50:
				System.out.println();
				break;
			}
			i++;
		}
		
		/* println() : 줄바꿈이 있는 출력 > 값이 없을경우 Enter
		 * print() : 줄바꿈이 없는 출력 > 값이 없을경우 컴파일에러
		 * printf() : 지시자를 이용한 출력
		 * 
		 * 지시자 %d(정수형), %f(실수형), %c(문자), %s(문자열), %n(줄바꿈)
		 * 소수점 설정 가능. 
		 */		
		System.out.println("--------------");
		
		double dou = 3.141592;
		
		System.out.printf("%.2f%n", dou); // "%f.정수" > 정수만큼의 소수점을 남기고 다 날린다.
		
		a = 3;
		int b = 5;
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.printf("%d + %d = %d%n", a, b, (a+b));
		
		double score = 89.3333;
		double cnt = 5;
		
		System.out.printf("%.1f / %.0f = %.2f%n", score, cnt, (score / cnt));
		
		
		
		
		
	}

}
