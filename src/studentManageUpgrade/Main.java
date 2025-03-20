package studentManageUpgrade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*- main
			- 1학생등록, 2학생리스트출력, 3학생검색(학생정보)
			- 4학생정보수정, 5학생삭제, 6수강신청, 7수강철회
			- 8과목별 신청자리스트
			- 9학생별 성적표 출력(학생의 수강정보 + 성적) => 성적 평균
			- 10종료
		*/
		Controller c = new Controller();
		
		Scanner sc = new Scanner(System.in);
		int select = -1;
		c.baseSubject();
		c.baseStudent();
		
		do {
			System.out.println();
			System.out.println("============================================");
			System.out.println("1.학생등록		2.학생리스트출력	3.학생검색(학생정보)");
			System.out.println("4.학생정보수정	5.학생삭제		6.수강신청");
			System.out.println("7.수강철회		8.과목별 신청자리스트");
			System.out.println("9.학생별 성적표 출력(학생의 수강정보 + 성적) => 성적 평균");
			System.out.println("10.과목리스트	11.학생성적등록");
			System.out.println("0.종료");
			System.out.println("============================================");
			System.out.println();
			System.out.println("입력>");
		
			select = sc.nextInt();
			
			switch(select) {
			
			case 1: c.addStudent(sc); break;
			case 2: c.studentList(); break;
			case 3: c.searchStudent(sc); break;
			case 4: c.studentUpdate(sc); break;
			case 5: c.deleteStudent(sc); break;
			case 6: c.registSubject(sc); break;
			case 7: c.deleteSubject(sc); break;
			case 8: c.subjectStudentList(sc); break;
			case 9: c.studentScore(sc); break;
			case 10: c.subPrint(); break;
			case 11: c.inputScore(sc); break;
			
			case 0:System.out.println("종료"); break;
			
			}
			
		
			
		}while(select != 0);
		
		
		
	}

}
