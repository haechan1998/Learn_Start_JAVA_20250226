package javaProject;

public class Quiz {
	
//			1. [수수께끼]
//			문제: 못 사온다고 해놓고 사온 것은?
//			정답: 못
//			2. [속담]
//			문제: 아무리 작은 것이라도 모이고 모이면 나중에 큰 것이 되는 것이라는 뜻의 속담으로  "티끌 모아 __" 에서의 __ 에 들어갈 단어는?
//			정답: 태산
//			3. [넌센스]
//			문제: 세상에서 가장 쉬운 숫자는?
//			정답: 십구만 (190,000)
//			4. [영단어 맞히기] (자바)
//			문제: 자바에서 정수형 데이터를 나타내는 영어 단어는?
//			정답: int, integer
//			5. [기본적인 자바 개념]
//			문제: 자바에서 객체를 만들 때 사용하는 키워드는?
//			정답: new
//			- 중간 난이도 (5개)
//			6. [수수께끼]
//			문제: 무가 자기소개를 할 때 하는 말은?
//			정답: 나무
//			7. [속담]
//			문제: 철모르고 함부로 덤비는 것을 뜻하는 속담으로 "하룻강아지 _ 무서운 줄 모른다" 에서의 _가 뜻하는 단어는?
//			정답: 범
//			8. [넌센스]
//			문제: 소가 계단을 오르면?
//			정답: 소오름
//			9. [숫자 암호 (규칙찾기)]
//			문제: 다음 숫자의 규칙을 찾아 빈칸에 알맞은 숫자를 넣으시오.
//			1, 3, 6, 10, __
//			정답: 15 (1+2, 3+3, 6+4의 규칙으로)
//			10. [영단어 맞히기] (자바)
//			문제: 자바에서 리턴할 값이 없다는 의미의 리턴 타입의 영어 단어는?
//			정답: void
			
//			-어려운 난이도 (5개)
//			11. [자바]
//			문제: 같은 패키지에서만 가능 (나 + 패키지)한 접근제어자는?
//			정답: default
//			12. [기본적인 자바 개념]
//			문제: 자바 프로그램이 실행되면 OS로부터 메모리를 할당받아 실제 작업을 수행하는 단위를 나타내는 영어 단어는?
//			정답: Thread(쓰레드)
//			13. [숫자 암호 (규칙찾기)]
//			문제: 2, 3, 5, 7, 11, __ 빈칸에 들어갈 다음 숫자는?
//			정답: 13 (소수의 나열)
//			14. [속담]
//			문제: 전체를 포괄적으로 보지 못하는 매우 좁은 소견이나 관찰을 비꼬는 말을 뜻하는 속담으로 "바늘구멍으로 __보기" 에 들어갈 __ 단어는?
//			정답: 하늘
//			15. [수수께끼]
//			문제: 깨뜨리고 칭찬 받는 것은?
//			정답: 신기록
	
	// 위 문제들을 랜덤으로 담는게 좋겠다.
	
	// 컨셉, 문제, 정답.
	private int quizNumber;
	private String quizConcept;
	private String quiz;
	private String answer;
	
	public Quiz() {}
	
	public Quiz(int quizNumber, String quiz) {
        this.quizNumber = quizNumber;
        this.quiz = quiz;
    }

	
	public Quiz(String quizConcept, String quiz, String answer) {
		super();
		this.quizConcept = quizConcept;
		this.quiz = quiz;
		this.answer = answer;
	}

	public String getQuizConcept() {
		return quizConcept;
	}

	public void setQuizConcept(String quizConcept) {
		this.quizConcept = quizConcept;
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

	public int getQuizNumber() {
		return quizNumber;
	}

	public void setQuizNumber(int quizNumber) {
		this.quizNumber = quizNumber;
	}

}
