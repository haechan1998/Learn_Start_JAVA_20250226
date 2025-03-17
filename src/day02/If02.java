package day02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		//return : 메서드 종료
		//break; : 구문 종료
		
		/* 국어, 영어, 수학점수를 입력받아
		 * 합계, 평균, pass 여부를 출력
		 * pass 여부는 80이상이면 합력 - if
		 * 100점보다 크거나 0점보다 작으면 error
		 * 점수가 하나라도 틀릴경우 전부 error 처리
		*/				
		Scanner sc = new Scanner(System.in);
		
		// 조건문 안에 return 을 응용해서 종료하기
		
		System.out.println("본인의 점수(1과 100사이의 정수)로 입력해주세요");
		System.out.print("국어점수 >");
		int kor = sc.nextInt();
		
		if(kor > 100 || kor < 0) {
			System.out.println("error");
			System.out.println("프로그램이 종료되었습니다.");
			sc.close();
			return;
		}
		
		System.out.print("영어점수 >");
		int eng = sc.nextInt();
		
		if(eng > 100 || eng < 0) {
			System.out.println("error");
			System.out.println("프로그램이 종료되었습니다.");
			sc.close();
			return;
		}
		
		System.out.print("수학점수 >");
		int math = sc.nextInt();
		if(math > 100 || math < 0) {
			System.out.println("error");
			System.out.println("프로그램이 종료되었습니다.");
			sc.close();
			return;
		}
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		
		if(kor > 100 || eng > 100 || math > 100) { // 입력받은 값이 하나라도 100을 넘을때 "error" 출력) > return 을 사용했기 때문에 쓸모없는 코드가 됐다.
			System.out.println("error");
		}else if(kor < 0 || eng < 0 || math < 0) { // 입력받은 값이 하나라도 음수일때 "error" 출력) > return 을 사용했기 때문에 쓸모없는 코드가 됐다.
			System.out.println("error");												
		}else if(avg >= 80) { // 위에 두 조건을 모두 해당하지 않을경우 정상 진행					// 깔끔하게 if 문으로 정리 권장;
			System.out.println("총점" + total);
			System.out.println("평균" + avg);
			System.out.println("합격"); // 합격라인
		}else {
			System.out.println("총점" + total);
			System.out.println("평균" + avg);
			System.out.println("불합격"); // 불합격라인
		}
		
		
		
		sc.close(); // 빼먹지 말자
		
	}

}
