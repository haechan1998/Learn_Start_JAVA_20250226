package studentManageUpgrade;

import java.util.ArrayList;
import java.util.Scanner;


public class Controller{
	
	private ArrayList<Student> stuList = new ArrayList<>();
	private ArrayList<Subject> subList = new ArrayList<>();
	private int codeCount;
	
	
	
	/*- 1학생등록, 2학생리스트출력, 3학생검색(학생정보)
	  - 4학생정보수정, 5학생삭제, 6수강신청, 7수강철회
	  - 8과목별 신청자리스트
	  - 9학생별 성적표 출력(학생의 수강정보 + 성적) => 성적 평균
	*/
	
	public void baseSubject() {
	//기본 수강과목.	
		Subject sub1 = new Subject(1001, "과목1", 2, "김철수", 1, "월-수 15~16", "1번강의실");
		codeCount++;
		subList.add(sub1);
		Subject sub2 = new Subject(1001+codeCount, "과목2", 3, "이철수", 2, "월-수 09~11", "1번강의실");
		codeCount++;
		subList.add(sub2);
		Subject sub3 = new Subject(1001+codeCount, "과목3", 4, "박철수", 3, "화-목 13~16", "2번강의실");
		codeCount++;
		subList.add(sub3);
		Subject sub4 = new Subject(1001+codeCount, "과목4", 2, "최철수", 2, "월-수 14~16", "2번강의실");
		codeCount++;
		subList.add(sub4);
		Subject sub5 = new Subject(1001+codeCount, "과목5", 3, "원철수", 2, "금 14~16", "3번강의실");
		codeCount++;
		subList.add(sub5);
	}
	
	public void baseStudent() {
	//기본 학생	
		stuList.add(new Student(1,"홍길동",24,"01012341111","관악구"));
		stuList.add(new Student(2,"김철수",22,"01012342222","구로구"));
		stuList.add(new Student(3,"박남동",25,"01012343333","강북구"));
		stuList.add(new Student(4,"길철남",20,"01012344444","강남구"));
		stuList.add(new Student(5,"동길박",21,"01012345555","김포시"));
	}
	
	public void addStudent(Scanner sc) {
	//학생 등록
		
		System.out.println("학번>");
		int code = sc.nextInt();
		System.out.println("이름>");
		String name = sc.next();
		System.out.println("나이>");
		int age = sc.nextInt();
		System.out.println("전화번호>");
		String phone = sc.next();
		System.out.println("주소>");
		sc.nextLine();
		String address = sc.nextLine();
		
		for(int i=0; i<stuList.size(); i++) {
			if(stuList.get(i).getCode() == code) {
				System.out.println("이미 존재하는 학번입니다.");
				return;
			}
			if(stuList.get(i).getCode() != code) {
				Student stu = new Student(code, name, age, phone, address);
				stuList.add(stu);
				System.out.println("학생 추가 완료.");
				return;
			}
		}
	}

	public void studentList() {
	//학생 리스트 출력	
		stuList.stream()
		.forEach(n -> n.studentInfo());
		
	}

	public void searchStudent(Scanner sc) {
	//학생 검색
		System.out.println("학번을 입력해주세요.");
		int search = sc.nextInt();
		stuList.stream()
		.filter(n -> n.getCode() == search)
		.forEach(n -> n.studentInfo());
		System.out.println("검색이 완료되었습니다.");
		
	}

	public void studentUpdate(Scanner sc) {
	//학생정보수정 // 나이는 Date 클래스로 1년마다 자동으로 증가로 빼고, 전화번호와 주소만 업데이트. // 개명 한 경우까지 하진 말자...ㅎ
		
		System.out.println("학번을 입력해주세요.");
		int code = sc.nextInt();
		
		for(int i=0; i<stuList.size(); i++) {
			if(stuList.get(i).getCode() == code) {
				
				String name = stuList.get(i).getName();
				int age = stuList.get(i).getAge();
				System.out.println("수정할 전화번호를 입력하세요.");
				String phone = sc.next();
				System.out.println("수정할 주소를 입력하세요.");
				sc.nextLine();
				String address = sc.nextLine();
				
				stuList.set(i, new Student(code, name, age, phone, address));
				System.out.println("정보수정이 완료되었습니다.");
				return;
			}
			
		}
		System.out.println("찾으시는 학번이 없습니다.");
		
	}

	public void deleteStudent(Scanner sc) {
	//학생삭제	
		System.out.println("학번을 입력해주세요.");
		int code = sc.nextInt();
		for(int i=0; i<stuList.size(); i++) {
			if(stuList.get(i).getCode() == code) {
				stuList.remove(i);
				System.out.println("삭제가 완료되었습니다.");
				return;
			}
		}
		System.out.println("찾으시는 학번이 없습니다.");
	}

	public void addSubject(Scanner sc) {
	//수강과목 추가	
	}
	
	public void registSubject(Scanner sc) {
	//수강신청
		//stuList.get(i).getList().get(index).getSubName()
		//- 과목코드, 과목명, 학점, 교수명, 시수, 시간표, 강의장
		
		System.out.println("학번을 입력해주세요.");
		int code = sc.nextInt();
		System.out.println("등록하려는 수강과목의 과목코드를 입력해주세요.");
		int subCode = sc.nextInt();
		for(int i=0; i<stuList.size(); i++) {
			if(stuList.get(i).getCode() == code) {
				for(int j=0; j<subList.size(); j++) {
					if(subList.get(j).getSubCode() == subCode) {
							stuList.get(i).getList().add(new Subject(subList.get(j)));
							System.out.println("수강신청이 완료되었습니다.");
							return;
					}
				}
			}
		}
		System.out.println("수강신청 할 과목이 없습니다.");
			
	}

	public void deleteSubject(Scanner sc) {
	//수강철회
			if(stuList.isEmpty()) {
				System.out.println("학생등록을 해주세요.");
				return;
			}
		
			System.out.println("학번을 입력해주세요.");
			int code = sc.nextInt();
			for(int i=0; i<stuList.size(); i++) {
				if(stuList.get(i).getCode() == code) {
					System.out.println("철회하려는 수강과목의 과목코드를 입력해주세요.");
					int subCode = sc.nextInt();
					stuList.get(i).deleteSubject(subCode);
					System.out.println("수강철회가 완료되었습니다.");
				}
			}
		
	}

	public void subjectStudentList(Scanner sc) {
	//과목별 신청자 리스트
		System.out.println("과목코드를 입력해주세요.");
		int subCode = sc.nextInt();
		for(Student s : stuList) {
			for(int i=0; i<s.getList().size(); i++) {
				if(s.getList().get(i).getSubCode() == subCode) {
//					System.out.println(s.studentInfo());
					s.studentInfo();
				}
				
			}
				
		}
		
		
	}

	public void studentScore(Scanner sc) {
	//학생별 성적표 출력
		System.out.println("과목코드를 입력해주세요.");
		int subCode = sc.nextInt();
		for(int i=0; i<stuList.size(); i++) {
			for(int j=0; j<stuList.get(i).getList().size(); i++) {
				if(stuList.get(i).getList().get(j).getSubCode() == subCode) {
					System.out.println("--성적--");
					System.out.print(stuList.get(i).getName() + " "); 
					stuList.get(i).printScore(subCode);
					System.out.println();
					return;
				}
			}
		}
		
		
	}

	public void subPrint() {
	// 과목리스트 출력
		System.out.println("--과목 목록--");
		System.out.println();
		subList.stream()
		.forEach(n -> n.subjectInfo());
	}

	public void inputScore(Scanner sc) {
	//학생 성적 입력
		// 학생 학번, 과목코드, 점수
		System.out.println("학번을 입력해주세요.");
		int stuCode = sc.nextInt();
		System.out.println("과목코드를 입력해주세요.");
		int subCode = sc.nextInt();
		System.out.println("부여 할 점수를 입력해주세요.");
		int subScore = sc.nextInt();
		if(subScore > 100 || subScore < 0) {
			System.out.println("점수를 다시 입력해주세요");
		}
		
		for(int i=0; i<stuList.size(); i++) {
			if(stuList.get(i).getCode() == stuCode) {
				stuList.get(i).inputScore(subCode, subScore); // 과목코드, 점수를 입력한다.
				System.out.println("점수 입력이 완료되었습니다.");
				return;
			}
		}
		
	}
	
}
