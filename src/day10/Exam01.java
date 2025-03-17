package day10;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 성적표
		 * 
		 * 몇명의 성적을 출력할지 결정 >
		 * 이름	국어	영어	수학	총점	평균	석차
		 * null 89	90	85	00	00	0
		 * null 89	90	85	00	00	0
		 * null 89	90	85	00	00	0
		 * "\t" : tap 
		 * */
		
		/* Report 클래스 생성
		 * 이름	국어	영어	수학	총점	평균	석차 => 멤버변수
		 * 메서드 체크
		 * */
		
		/* main Report 객체의 배열 생성
		 * 석차 구하기.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		// 5명의 리포트를 받아서 성적표 산출하기
		Report[] reportArr = new Report[5];
		for(int i=0; i<reportArr.length; i++) {
			System.out.println("이름 입력>");
			String name = sc.next();
			Report report = new Report(name);
			report.randomInput();
			reportArr[i] = report;
		}
		
		// 석차 구하기
		for(int i=0; i<reportArr.length; i++) {
			int rank = 1;
			for(int j=0; j<reportArr.length; j++) {
				if(reportArr[i].getSum() < reportArr[j].getSum()) {
					
					rank++;
				}
			}
			reportArr[i].setRank(rank);
		}
		
		// 최종 출력
		for(int i=0; i<reportArr.length; i++) {
			System.out.print(reportArr[i] + " "); //성적
			System.out.println(); // 줄넘기
		
		}
		
		sc.close();
		
		// 깨달았다... 객체의 속해있는 값을 객체의 배열로 불러오는것.
		// 그 사이에 없는 멤버변수의 값은 setter 로 입력 받아서 중간에 채워 넣어줄 수 있다.
		// 그거 말고는 별거 없는 편인거 같다. 처음 클래스를 생성할 때 멤버변수를 지정하는것이 중요하며,
		// 그 멤버변수를 이용하기 용이하게 클래스를 간단하게 짜는것이 중요.
		// 향상된 for 문은 원본 배열에서 복사해서 원소를 추출하기 때문에
		// 원래 원본 배열에서는 값이 변하지 않는다. > 기존 i 번지 length 를 이용해서 값을 입력해줘야한다. 
		
		
		
	}

}
