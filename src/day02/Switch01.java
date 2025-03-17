package day02;

public class Switch01 {

	public static void main(String[] args) {
		
		// switch (변수 / 식){
		// case 값1 : 실행문; break;
		// case 값2 : 실행문; break;
		// case 값3 : 실행문; break;
		// case 값4 : 실행문; break;
		// default: 실행문;
		// }
		// break; 구문을 빠져나갈때 사용 > 조건문을 포함한다. (switch문은 조건문을 포함하기 때문에 실행문 뒤에 쓴다.)
		
		// 짝수 홀수 switch 구문으로 실행
		
		int num = 10;
		int mod = num % 2;
		System.out.println(mod);
		
		switch(num % 2) {
		//값이 문자면 ""을 써줘야한다.
		case 0: 
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
			default :
				System.out.println("잘못된 값입니다.");
		}
		System.out.println("--------------------------------------");
		// num1 의 값이 1, 2, 3이라고 가정하고,
		// num1 의 값에 따라 1이면 1칸전진, 2면 2칸전진, 3이면 3칸전진
		// 나머지 값은 다시 입력하세요.
		
		int num1 = 3;
		
		switch(num1){
			
			case 1:
				System.out.println("1칸전진");
				break;
			case 2:
				System.out.println("2칸전진");
				break;
			case 3:
				System.out.println("3칸전진");
				break;
				default:
					System.out.println("다시 입력하세요.");
		}
		
		System.out.println("-----------------------------------");
		
		switch(num1){
		
		case 1:
			System.out.println(num1 + "칸전진");
			break;
		case 2:
			System.out.println(num1 + "칸전진");
			break;
		case 3:
			System.out.println(num1 + "칸전진");
			break;
			default:
				System.out.println("다시 입력하세요.");
		}
		System.out.println("-------------------------------------");
		
		num1 = 1;
		
		switch(num1){
		
		case 1: case 2: case 3: // 출력문이 공통된 하나의 변수를 사용하는경우 합쳐도 문제없다.
			System.out.println(num1 + "칸전진");
			break;
			default:
				System.out.println("다시 입력하세요.");
		}
		
		System.out.println("-------------------------------------");
		
		// 3, 4, 5 = 봄 / 6, 7, 8 = 여름 / 9, 10, 11 = 가을 / 12, 1, 2겨울
		// 잘못된 월입니다.
		
		int month = 3;
		
		switch(month){
			case 3: case 4: case 5:
				System.out.println(month + "월 입니다. (봄)");
				break;
			case 6: case 7: case 8:
				System.out.println(month + "월 입니다. (여름)");
				break;
			case 9: case 10: case 11:
				System.out.println(month + "월 입니다. (가을)");
				break;
			case 12: case 1: case 2:
				System.out.println(month + "월 입니다. (겨울)");
				break;
				default:
					System.out.println("잘못된 월입니다.");
		}
		
		
					
	
		
	}

}
