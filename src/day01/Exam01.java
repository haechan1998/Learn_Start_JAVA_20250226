package day01;

public class Exam01 {

	public static void main(String[] args) {
		/* 카페에 제출
		 * 국어, 영어, 수학 입력
		 * 합계와 평균을 출력
		 * 
		 * 조건선택 연산자를 이용하여
		 * 평균이 80점 이상이면 합격, 아니면 불합격 출력
		 */
		int kor = 81;
		int eng = 94;
		int math = 77;
		
		int total = kor + eng + math;
		float avg = total/3.0f; // 실수처럼 보이게 n.0을 붙혀야한다. 아니면 형변환을 해서 표현.
		
		int sum1 = 10;
		int sum2 = 3;
		double sum3 = sum1/(double)sum2; // 이렇게 형변환을 한다.
		
		
		System.out.println((sum3));
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + avg);
		System.out.println((avg >= 80)? "합격" : "불합격");
		
		System.out.println("-----------------------------");
		// if(조건식){실행문;} else {실행문;}
		if(avg >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("-----------------------------");
		
		// 80이상이면 합격, 60이상이면 보텅, 나머지는 불합격
		if(avg >= 80) {
			System.out.println("합격");
		}else if(avg >= 60) {
			System.out.println("보통");
		}else {
			System.out.println("불합격");
		} // 거름망이라고 생각하면 편하다.
			
		System.out.println("-----------------------------");
		
		// 평균이 100 이상이거나, 0보다 작다면 오류
		
		if(avg > 100 || avg < 0) {
			System.out.println("error");
		}if(avg >= 80) {
			System.out.println("합격");
		}else if(avg >= 60) {
			System.out.println("보통");
		}else {
			System.out.println("불합격");
		}
		
		System.out.println("-----------------------------");
		
		//가독성 향상 ver
		
		if(avg > 100 || avg < 0) {
			System.out.println("error");
		}else {
			if(avg >= 80) {
				System.out.println("합격");
			}else if(avg >= 60) {
				System.out.println("보통");
			}else {
				System.out.println("불합격");
			}
		}
		
	}

}
