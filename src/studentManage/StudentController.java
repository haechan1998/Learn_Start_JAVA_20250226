package studentManage;

import java.util.Scanner;

public class StudentController implements Program {
	
//	메뉴 (studentController) => implements Program 3.
//	1. 학생등록 => void insertStudent(Scanner scan);
//	2. 학생리스트 출력 => void printSudent();  
//	3. 학생검색(학생정보, 수강정보) => void searchStudent(Scanner scan);
//	4. 수강신청(한 학생에 대한) -학생.set신청 => void insertSubject(Scanner scan);
//	5. 수강철회(한 삭생에 대한) -초기화? 메서드 하나 해보기 void deleteSubject(Scanner scan);
//	6. 종료
	private Student[] stuArr = new Student[3]; // 학생의 목록 매개변수로 설정
	private int cnt;
	
	//... 수강신청 가능한 모든 과목의 목록.
	private Subject[] subArr = new Subject[3]; // 과목의 목록 매개변수로 설정
	
	
	public void addSubArr() {
		subArr[0] = new Subject("1111", "java", 4, 3, "김철득", "월수/3시~6시", "1강의실");
		subArr[1] = new Subject("2222", "DB", 2, 2, "곽철용", "목금/4시~6시", "2강의실");
		subArr[2] = new Subject("3333", "CSS", 3, 1, "마득팔", "월수/4시~5시", "1강의실");
//		subArr[3] = new Subject("1111", "HTML", 4, 3, "김철득", "월/3시~6시", "3강의실");
//		subArr[4] = new Subject("0002", "javaScript", 4, 2, "김철득", "수금/4시~6시", "1강의실");
	}
	
	public void printsub() {
		for(int i=0; i<subArr.length; i++) {
			subArr[i].printSubjectInfo();
		}
	}

	@Override
	public void printStudent() { //2
		for(int i=0; i<cnt; i++) {
			System.out.println(stuArr[i]);
		}
			
	}
	
	@Override
	public void searchStudent(Scanner scan) { //3
		String searchName = scan.next();
		for(int i=0; i<cnt; i++) {
				if(stuArr[i].getMyName().equals(searchName)) {
					System.out.println(stuArr[i]);
					//stuArr[i].getSubArr()[i].printSubjectInfo();
				}
		}
	}

	@Override
	public void insertSubject(Scanner scan) { //4
		// 수강신청
		// 누가? 무슨 과목을 추가할지 설정
		System.out.println("수강신청 학번 >");
		String studentCode = scan.next();
		int index = -1; // 학생의 번지를 저장하기 위한 변수
		
		for(int i=0; i<cnt; i++) {
			if(stuArr[i].getMyCode().equals(studentCode)) {
				index = i;
				break;
			}
			
			if(index == -1) {
				System.out.println("학생정보가 없습니다.");
				return;
			}
			//학생을 찾았다면 .. 수강신청 목록 보여주기.
		}
			printsub();
			int subIndex = -1;
			System.out.println("선택과목 번호>");
			String subNum = scan.next();
			for(int i=0; i<subArr.length; i++) {
				if(subArr[i].getSubjectCode().equals(subNum)) {
					subIndex = i;
					break;
			}
		}
			if(subIndex == -1) {
				System.out.println("과목이 없습니다.");
				return;
			}
			
			stuArr[index].insertSub(subArr[subIndex]);
			System.out.println("수강신청 완료");
	}



	@Override
	public void insetStudent(Scanner scan) { //1
			stuArr[0] = new Student("1111", "홍길동", 23, "01012341234","집");
			cnt++;
			stuArr[1] = new Student("2222", "김민수", 23, "01012341234","집");
			cnt++;
			
			// 한명은 스캔으로 받자
//			- 학번 String , 이름 String, 나이 integer, 전화번호 String, 주소 String
			System.out.println("학번>");
			String code = scan.next();
			System.out.println("이름>");
			String name = scan.next();
			System.out.println("나이>");
			int age = scan.nextInt();
			System.out.println("전화번호>");
			String phone = scan.next();
			System.out.println("주소>");
			String rg = scan.next();
			
			Student stu = new Student(code, name, age, phone, rg);
			stuArr[cnt] = stu;
			cnt++;		
			
			
			
			
			// 스캔으로 받아서 넣을경우 스캔 값을 저장할 변수를 추가한다.
			
//			Student student2 = new Student(scan.next(), scan.next(), scan.nextInt(), scan.next(), scan.next());
//			stuArr[2] = student2;
		
	}

	public Student[] getStuArr() {
		return stuArr;
	}

	public void setStuArr(Student[] stuArr) {
		this.stuArr = stuArr;
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강삭제
				// 수강신청
				// 누가? (학생) 무슨과목을 취소할지 설정
				System.out.println("수강취소 학번>");
				String stdNum = scan.next();
				int index = -1; //학생의 번지를 저장하기 위한 변수
				
				//학생위치 탐색
				for(int i=0; i<cnt; i++) {
					if(stuArr[i].getMyCode().equals(stdNum)) {
						index = i;
						break;
					}
				}
				
				// 학생을 못찾았다면...  -1
				if(index == -1) {
					System.out.println("학생정보가 없습니다.");
					return;
				}
				// 내 수강정보 출력 후 취소할 번호 선택
				System.out.println(stuArr[index]);
				
				System.out.println("수강삭제 번호>");
				String subNum = scan.next();
				
				stuArr[index].deleteSubject(subNum);
		
	}
	
	
	

}
