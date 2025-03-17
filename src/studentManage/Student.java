package studentManage;

import java.util.Arrays;

public class Student {
//	학생관리프로그램 2.
//	학생 등록(Student class) insertStudent(Scanner scan);
//	매개변수 :
//	- 학번 String , 이름 String, 나이 integer, 전화번호 String, 주소 String, 수강과목/s
//
	private String myCode; // 학번
	private String myName; // 이름
	private int age; // 나이
	private String myPhone; // 전화번호
	private String myResidence; // 거주지
	private Subject[] subArr = new Subject[3]; // 수강과목
	private int cnt;
	
	public Student() {}

	public Student(String myCode, String myName, int age, String myPhone, String myResidence) {
		this.myCode = myCode;
		this.myName = myName;
		this.age = age;
		this.myPhone = myPhone;
		this.myResidence = myResidence;
	}
	
	public Student(String code, String name) {
		this.myCode = code;
		this.myName = name;
	}
	
	
	// 필요한 메서드...
	public void insertSub(Subject sub) {
		if(cnt == subArr.length) {
			// 배열복사 배열 늘리기
			Subject[] tmp = new Subject[subArr.length + 5];
			// 배열복사
			System.arraycopy(subArr, 0, tmp, 0, subArr.length);
			// 기존 객체명에 객체 바꾸기
			subArr = tmp;
			
		}
		subArr[cnt] = sub;
		cnt++;
	}
	public void deleteSubject(String subNum) { //5
	
	// 그냥 해당하는 배열을 초기화.
	// subArr 배열에서 subNum가 몇번지에 있는지 찾기.
	int index = -1;
	if(subNum == null) {
		return;
	}
	for(int i=0; i<cnt; i++) {
		if(subArr[i].getSubjectCode().equals(subNum)) {
			index = i;
			break;
		}
	}
	
	if(index == -1) {
		// 찾는 값이 없으면
		System.out.println("삭제 과목 없음.");
		return;
	}
	// 삭제 : index 번지부터 뒷번지를 앞으로 옮기는 작업.
	for(int i=index; i<cnt-1; i++) {
		subArr[i] = subArr[i+1];
	}
	
	// 마지막 끝번지는 null
	subArr[cnt-1] = null;
	cnt--;
	System.out.println("과목 삭제 완료");
	
}
//	
//	public void studentSub() {
//		Subject sub = new Subject();
//		
//		for(int i=0; i<3; i++) {
//			subArr[i] = sub; 
//		}
//	}

	
//	@Override
//	// 학생정보
//	public String toString() {
//		return "학번 :" + myCode + ", 이름 :" + myName + ", 나이 :" + age + ", 전화번호 :" + myPhone
//				+ ", 주소 :" + myResidence;
//	}

	
	@Override
	public String toString() {
		return "Student [myCode=" + myCode + ", myName=" + myName + ", age=" + age + ", myPhone=" + myPhone
				+ ", myResidence=" + myResidence + ", subArr="
				+ Arrays.toString(subArr) + "]";
	}
	
	
	public String getMyCode() {
		return myCode;
	}


	public void setMyCode(String myCode) {
		this.myCode = myCode;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMyPhone() {
		return myPhone;
	}

	public void setMyPhone(String myPhone) {
		this.myPhone = myPhone;
	}

	public String getMyResidence() {
		return myResidence;
	}

	public void setMyResidence(String myResidence) {
		this.myResidence = myResidence;
	}

	public Subject[] getSubArr() {
		return subArr;
	}

	public void setSubArr(Subject[] subArr) {
		this.subArr = subArr;
	}

	

}
