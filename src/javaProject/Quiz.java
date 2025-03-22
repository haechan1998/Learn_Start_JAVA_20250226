package javaProject;

public class Quiz {
	
	private int quizNumber;
	private String quiz;
	
	public Quiz() {}

	public Quiz(int quizNumber, String quiz) {
		this.quizNumber = quizNumber;
		this.quiz = quiz;
	}
	
	// 문제 메서드 구현.
	public void room01Quiz01() {
		System.out.println("방 1에 배정된 문제 1번.");
	}
	
	public void room01Quiz02() {
		
		System.out.println("방 1에 배정된 문제 2번.");
	}
	
	public void room02Quiz01() {
		System.out.println("방 2에 배정된 문제 1번.");
	}
	
	public void room02Quiz02() {
		System.out.println("방 2에 배정된 문제 2번.");
	}
	
	public void room03Quiz01() {
		System.out.println("방 3에 배정된 문제 1번.");
	}
	
	public void room03Quiz02() {
		System.out.println("방 3에 배정된 문제 2번.");
	}
	
	public void room04Quiz01() {
		System.out.println("방 4에 배정된 문제 1번.");
	}
	
	public void room04Quiz02() {
		System.out.println("방 4에 배정된 문제 2번.");
	}
	
	public void room05Quiz01() {
		System.out.println("방 5에 배정된 문제 1번.");
	}
	
	public void room05Quiz02() {
		System.out.println("방 5에 배정된 문제 2번.");
	}
	
	public void finalRoomQuiz() {
		System.out.println("마지막 방에 배정된 문제");
	}
	
	
	
	
	
	
	
	
	

	public int getQuizNumber() {
		return quizNumber;
	}

	public void setQuizNumber(int quizNumber) {
		this.quizNumber = quizNumber;
	}

	public String getQuiz() {
		return quiz;
	}

	public void setQuiz(String quiz) {
		this.quiz = quiz;
	};
	
	
}
