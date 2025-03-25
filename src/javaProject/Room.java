package javaProject;

public class Room {
	
	// 방의 넘버
	private int roomNumber;
	// 방의 컨셉
	private String roomConcept;
	// 문제(간단히)
	private String quiz;
	// 정답
	private String answer;
	// 방 클리어 여부
	private boolean isClear;
	
	public Room() {}

	public Room(int roomNumber, String roomConcept, String quiz, String answer) {
		
		this.roomNumber = roomNumber;
		this.roomConcept = roomConcept;
		this.quiz = quiz;
		this.answer = answer;
		this.isClear = false; // 클리어 하면 컨트롤러에서 true 로 변경.
	}
	
	// 방의 정보.
	public void infomationRoom(int index) {
		System.out.print("		<<"+(index+1)+"."+" "+roomConcept+"의 방>> ");
		if(isClear) {
			System.out.println("Clear");
		}else {
			System.out.println("방을 살펴보자..");
		}
		return;
	}
	

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", roomConcept=" + roomConcept + ", quiz=" + quiz + ", answer="
				+ answer + ", isClear=" + isClear + "]";
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomConcept() {
		return roomConcept;
	}

	public void setRoomConcept(String roomConcept) {
		this.roomConcept = roomConcept;
	}

	public String getQuiz() {
		return quiz;
	}

	public void setQuiz(String quiz) {
		this.quiz = quiz;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public boolean getIsClear() {
		return isClear;
	}

	public void setIsClear(boolean isClear) {
		this.isClear = isClear;
	}
	
}