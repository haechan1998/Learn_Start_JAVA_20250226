package studentManage;

import java.util.Scanner;

public interface Program {
//	학생관리프로그램 2.
//	학생 등록(Student class) insertStudent(Scanner scan);
//	- 학번 String , 이름 String, 나이 integer, 전화번호 String, 주소 String, 수강과목/s String
//
//	1.
//	수강과목 (Subject class) 
//	-수강과목 정보를 가지고 있는 클래스
//	-하나의 과목에 가져야하는 정보들..
//	-과목코드,과목명,학점,시수,교수명,시간표,강의장
//
//	메뉴 (studentController) => implements Program 3.
//	1. 학생등록 => void insertStudent(Scanner scan);
//	2. 학생리스트 출력 => void printSudent();  
//	3. 학생검색(학생정보, 수강정보) => void searchStudent(Scanner scan);
//	4. 수강신청(한 학생에 대한) -학생.set신청 => void insertSubject(Scanner scan);
//	5. 수강철회(한 삭생에 대한) -초기화? 메서드 하나 해보기 void deleteSubject(Scanner scan);
//	6. 종료
//	-
//  main => 출력	
	
// 메서드 명 규칙 is(T?F) insert delete update 
	
	void insetStudent(Scanner scan);
	
	void printStudent();
	
	void searchStudent(Scanner scan);
	
	void insertSubject(Scanner scan);
	
	void deleteSubject(Scanner scan);

}
