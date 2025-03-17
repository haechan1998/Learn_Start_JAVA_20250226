package studentManage;

public class Subject {
//	1.
//	수강과목 (Subject class) 
//	-수강과목 정보를 가지고 있는 클래스
//	-하나의 과목에 가져야하는 정보들..
//	-멤버변수 :	
//	-과목코드 String 5자리 ,과목명 String ,학점 integer, 시수 integer ,교수명 String ,시간표(요일 시간라인) String ,강의장 String
	
	private String subjectCode; // 과목코드 5자리 내맘대로 0으로 시작 할 수 있기 때문에 String
	private String subjectName; // 과목명 // 참조.
	private int credit; // 학점
//	String time; //시수 // 총 이수 시간을 받기위해 int 로 하자
	private int time; // 시수 // 2
	private String professorname; // 교수명 교수가 영어 스펠링이 뭐지..;
	private String timeTable; // 시간표 // 요일,시간
	private String room;// 강의실 // room1...
	
	public Subject() {} // 기본 생성자.
	
	public Subject(String code, String subName, int credit, int time, String proName, String table, String room) {
		this.subjectCode = code;
		this.subjectName =subName;
		this.credit = credit;
		this.time = time;
		this.professorname = proName;
		this.timeTable = table;
		this.room = room;
	}
	
	public Subject(String code, String subName) {
		this.subjectCode = code;
		this.subjectName = subName;
	}
	
	public void printSubjectInfo() { // 수강과목의 정포를 출력하는 메서드. 하나면 객체 하나 아니면 컨트롤러에서 객체 배열에 담겠지.
		System.out.println("과목코드 :"+subjectCode);
		System.out.println("과목명 :"+subjectName);
		System.out.println("학점 :"+credit);
		System.out.println("시수 :"+time);
		System.out.println("교수명 :"+professorname);
		System.out.println("시간표 :"+timeTable);
		System.out.println("강의실 :"+room);
		System.out.println("---------------------");
	}
	
	
	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", credit=" + credit + ", time="
				+ time + ", professorname=" + professorname + ", timeTable=" + timeTable + ", room=" + room + "]";
	}

	// getter / setter
	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getProfecerName() {
		return professorname;
	}

	public void setProfecerName(String professorName) {
		this.professorname = professorName;
	}

	public String getTimeTable() {
		return timeTable;
	}

	public void setTimeTable(String timeTable) {
		this.timeTable = timeTable;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}
	
	

	

}
