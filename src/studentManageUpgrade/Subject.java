package studentManageUpgrade;

public class Subject {
	/*
	 * - 과목코드, 과목명, 학점, 교수명, 시수, 시간표, 강의장
	 * - 점수(마지막에 추가)
	 * 
	 */
	
	private int subCode;
	private String subName;
	private int credit;
	private String professor;
	private int time;
	private String timeTable;
	private String room;
	private int score; // 점수를 가지고 이 점수로 등급을 나타낼 것이다. 예) A+, A, A- ...
	
	public Subject() {}
	
	public Subject(Subject s) {
		
		this.subCode = s.subCode;
		this.subName = s.subName;
		this.credit = s.credit ;
		this.professor = s.professor;
		this.time = s.time;
		this.timeTable = s.timeTable;
		this.room = s.room;
		
	}

	public Subject(int subCode, String subName, int credit, String professor, int time, String timeTable,
			String room) {
		
		this.subCode = subCode;
		this.subName = subName;
		this.credit = credit;
		this.professor = professor;
		this.time = time;
		this.timeTable = timeTable;
		this.room = room;
	}
	
	
	public void subjectInfo() {
		System.out.println("과목코드 :" + subCode + " 과목명 :" + subName + " 학점" + credit);
		System.out.println("교수명 :" + professor + " 시수" + time + " 시간표 :" + timeTable + " 강의실 :" + room);
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + ", credit=" + credit + ", professor="
				+ professor + ", Time=" + time + ", TimeTable=" + timeTable + ", room=" + room + ", score=" + score
				+ "]";
	}

	public int getSubCode() {
		return subCode;
	}

	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	

}
