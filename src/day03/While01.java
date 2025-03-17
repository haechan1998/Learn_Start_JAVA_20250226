package day03;

public class While01 {

	public static void main(String[] args) {
		// while 문
		
		/* while 문은 for 문과 순서가 동일한 구문
		 * for : 실행 횟수가 정해져있는 경우 많이 사용
		 * while : 실행 횟수가 일정치 않은 경우 많이 사용
		 * 
		 * while 문을 조건식 없이 계속 반복하고 싶을 경우에는 조건식에 / "true" 를 사용하면 된다.
		 * 
		 * while(조건식) { // 조건식이 true 일 때 반복
		 * 	실행문;
		 * }
		 * 실행문 안에 조건식이 바뀔 수 있는 증감, 변화가 있어야한다.
		 * 
		 */
		
		// for 1부터 10까지 출력
		System.out.println("for");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		// 1부터 10까지 출력
		
		System.out.println("while");
		
		int i = 1;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		} // i == 11 > i 를 다시 사용하려면 값을 초기화
		System.out.println("---------------");
		// 1부터 10까지 짝수만 출력
		
		System.out.println("짝수 구하기");
		i = 1; // 값을 초기화해서 사용해야한다. 
		
		while(i <= 10) {
			i++;
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("---------------");
		
		
		
		
		
//		int j = 2;
//		
//		while(j <= 10 && j % 2 == 0) {
//			System.out.println(j);
//			j += 2;
//		} // while 안에 조건문만 넣어서 짝수 구하기
		
		
		
		
		
		
		
	}

}
