package studentManageUpgrade;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
	/*- 학번, 이름, 나이, 전화번호, 주소
	  - 과목 클래스 리스트(신청하면 추가)
	*/
	private int code;
	private String name;
	private int age;
	private String phone;
	private String address;
	private ArrayList<Subject> studentSubList = new ArrayList<>();
	
	public Student() {}
	
	public Student(int code, String name, int age, String phone, String address) {
		this.code = code;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	//과목별 신청자 리스트 (과목 리스트에서 학생 정보 비교하기)
//	public void subRegistList(int subCode) { // 과목코드
//		for(int i=0; i<studentSubList.size(); i++) {
//			if(studentSubList.get(i).getSubCode() == subCode) {
//				
//			}
//		}
//		
//	}
	
	//학생의 성적표 출력
	public void printScore(int subCode) {
		
		for(int i=0; i<studentSubList.size(); i++) {
			if(studentSubList.get(i).getSubCode() == subCode) {
				
				if(studentSubList.get(i).getScore() >= 90) {
					System.out.println("A");
				}else if(studentSubList.get(i).getScore() >= 80) {
					System.out.println("B");
				}else if(studentSubList.get(i).getScore() >= 70) {
					System.out.println("C");
				}else if(studentSubList.get(i).getScore() >= 60) {
					System.out.println("D");
				}else {
					System.out.println("F");
				}
			}
		}
	}
	
	//수강과목 점수입력
	public void inputScore(int code, int score) { // 수강과목번호, 점수.
		if(!studentSubList.isEmpty()) {
			for(int i=0; i<studentSubList.size(); i++) {
				if(studentSubList.get(i).getSubCode() == code) {
					studentSubList.get(i).setScore(score);
					return;
				}
			}
		}
		
	}
	
	public void deleteSubject(int code) { // 수강철회.
		for(int i=0; i<studentSubList.size(); i++) {
			if(code == studentSubList.get(i).getSubCode()) {
				studentSubList.remove(i);
			}
		}
		
	}
	
	public void studentInfo() { // 학생정보.
		System.out.println("=================================================");
		System.out.println("학번 :" + code + " / 이름 :" + name + " / 나이" + age);
		System.out.println("전화번호 :" + phone + " / 주소 :" + address);
		System.out.println("=================================================");
		System.out.println();
		if(studentSubList == null) {
			System.out.println("수강과목이 없습니다.");
		}else {
			
		}for(int i=0; i<studentSubList.size(); i++) {
			studentSubList.get(i).subjectInfo();
		}

	}
	
	@Override
	public String toString() {
		return "학번>" + code + "이름>" + name + "나이>" + age + "전화번호>" + phone + "주소>" + address
				+ "수강과목>" + studentSubList + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return code == other.code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Subject> getList() {
		return studentSubList;
	}

	public void setList(ArrayList<Subject> list) {
		this.studentSubList = list;
	}
	

}
