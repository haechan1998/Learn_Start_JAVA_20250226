package javaProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EscapeRoomController {
	
	private ArrayList<Room> roomList = new ArrayList<>();
	private ArrayList<Quiz> quizList = new ArrayList<>();
	private int roomIndex;
	private Screen screen = new Screen();
	private MiniGame miniGame = new MiniGame();
	
	
	// 방 만들어놓기.
	public void settingRoom() {
		// 퀴즈List를 가져와서 배정된 퀴즈를 컨셉, 문제에 넣는걸 구현하자.. 랜덤하게!
		quizSettingRoom();
		shuffleQuiz();
		// 방에 퀴즈를 배정해서 6개 만든다.
		for(int i=0; i<6; i++) {
			roomList.add(new Room(i+1, quizList.get(i).getQuizConcept(), quizList.get(i).getQuiz(), quizList.get(i).getAnswer()));
			
		}
//		roomList.add(new Room(1, "컨셉1", "문제1", "정답1"));
//		roomList.add(new Room(2, "컨셉2", "문제2", "정답2"));
//		roomList.add(new Room(3, "컨셉3", "문제3", "정답3"));
//		roomList.add(new Room(4, "컨셉4", "문제4", "정답4"));
//		roomList.add(new Room(5, "컨셉5", "문제5", "정답5"));
//		roomList.add(new Room(6, "컨셉6", "문제6", "정답6"));
		
	}
	
	public void quizSettingRoom() {
		// 예시
		quizList.add(new Quiz("[수수께끼]", "못 사온다고 해놓고 사온 것은?", "못"));
		quizList.add(new Quiz("[속담]", "아무리 작은 것이라도 모이고 모이면 나중에 큰 것이 되는 것이라는 뜻의 속담으로  \"티끌 모아 __\" 에서의 __ 에 들어갈 단어는?", "태산"));
		quizList.add(new Quiz("[넌센스]","세상에서 가장 쉬운 숫자는?(한글)", "십구만"));
		quizList.add(new Quiz("[영단어 맞히기]", "자바에서 정수형 데이터를 나타내는 영어 단어는?","integer"));
		quizList.add(new Quiz("[기본적인 자바 개념]", "자바에서 객체를 만들 때 사용하는 키워드는?","new"));
		quizList.add(new Quiz("[수수께끼]", "무가 자기소개를 할 때 하는 말은?","나무"));
		
	}
	
	// 로딩화면 만들기.
	public void loadingRoom() {
		// 방이 생성된다는 메세지와 함께 로딩 화면 출력...
		try {
			System.out.println();
			System.out.print("방을 생성하고있습니다.");
			Thread.sleep(700);
			System.out.print(".");
			Thread.sleep(700);
			System.out.print(".");
			Thread.sleep(700);
			System.out.print(".");
			Thread.sleep(700);
			System.out.print(".");
			System.out.println();
			System.out.println();
			System.out.print("방을 섞는중입니다.");
			Thread.sleep(700);
			System.out.print(".");
			Thread.sleep(700);
			System.out.print(".");
			Thread.sleep(700);
			System.out.print(".");
			Thread.sleep(700);
			System.out.print(".");
			System.out.println();
			System.out.println();
			System.out.println("로딩 완료!!");
			System.out.println();
			randomPrintRoom();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void randomPrintRoom() {
		int random = (int)(Math.random()*3)+1;
		switch(random) {
		case 1: screen.room1(); break;
		case 2: screen.room2(); break;
		case 3: screen.room3(); break;
		}
			
	}
	public void movementplayer() {
		try {
			int millis = 500;
			Thread.sleep(millis);
			System.out.println("다른 방으로 이동하고 있습니다.");
			Thread.sleep(millis);
			System.out.println();
			System.out.println("뚜벅");
			Thread.sleep(millis);
			System.out.println();
			System.out.println("뚜벅");
			Thread.sleep(millis);
			System.out.println();
			System.out.println("뚜벅");
			Thread.sleep(millis);
			System.out.println();
			System.out.println("뚜벅");
			Thread.sleep(millis);
			System.out.println();
			System.out.println("뚜벅");
			Thread.sleep(millis);
			System.out.println();
			System.out.println("뚜벅");
			Thread.sleep(millis);
			System.out.println();
			System.out.println("뚜벅...");
			Thread.sleep(millis);
			System.out.println();
			System.out.print(".");
			Thread.sleep(millis);
			System.out.print(".");
			Thread.sleep(millis);
			System.out.print(".");
			Thread.sleep(600);
			System.out.print(" 도착!");
			System.out.println();
			System.out.println();
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	// 퀴즈 랜덤으로 섞기.
	public void shuffleQuiz() {
		
		Collections.shuffle(quizList);
	}
	// 방 배열 랜덤으로 섞기
	public void shuffleRoom() {
		
		Collections.shuffle(roomList);
	}
	
	// 1. 방을 클리어 했을경우 넣어주는 메서드. -> 클리어 여부를 true 로 바꿔준다.
	public void clearRoom(int clearRoomIndex) {
		
		roomList.get(clearRoomIndex).setIsClear(true);
		System.out.println((clearRoomIndex+1) + "번 방을 클리어 하셨습니다.");
		
	}
	
	// 2. 캐릭터가 방을 움직일때 움직임을 제한하는 메서드. 
	public int directionRoom(Scanner sc) throws IOException {
		// 움직일때 방 인덱스를 리턴해서 캐릭터가 어디방에 있는지 연동.
		// 방의 구조는 이렇게 되어있다.
		/* [0] [1] [2]
		 * [3] [4] [6]
		 * 
		 * */
		
		String direction = sc.next().toUpperCase();
		movementplayer();
		switch(direction) {
		 case "W":
			 // 위로 움직이기. -> 인덱스 값을 -3 한다.
			 if(roomIndex < 3) { // 0 1 2 에 위치해있을경우 위로 가는것을 막는다.
				 System.out.println("위로 갈 수 없습니다.");
			 }else {
				 System.out.println("위로 이동했습니다.");
				 roomIndex -= 3; // 3 4 5 에서만 위로 이동이 가능하기 때문에 인덱스를 3 뺀다.
				 return roomIndex;
			 }
			 break;
			 
		 case "A":
			 // 왼쪽으로 움직이기. > 인덱스 값을 -1 한다.
			 if(roomIndex == 0 || roomIndex == 3) { // 0 3 에 위치해있을경우 왼쪽으로 가는것을 막는다.
				 System.out.println("왼쪽으로 갈 수 없습니다.");
			 }else {
				 System.out.println("왼쪽으로 이동했습니다.");
				 roomIndex -= 1; // 1 2 4 5 에서만 왼쪽으로 이동이 가능하기 때문에 인덱스를 1 뺀다.
				 return roomIndex;
			 }
			 break;
			 
		 case "S":
				 // 아래로 움직이기. > 인덱스 값을 +3 한다.
				 if(roomIndex > 2 && roomIndex < 6) { // 3 4 5 에 위치해있을경우 아래로 가는것을 막는다.
					 System.out.println("아래로 갈 수 없습니다.");
				 }else {
					 System.out.println("아래로 이동했습니다.");
					 roomIndex += 3; // 0 1 2 에서만 아래로 이동이 가능하기 때문에 인덱스를 3 더한다.
					 return roomIndex;
			 }
			 break;
			 
		 case "D":
			 // 오른쪽으로 움직이기. > 인덱스 값을 +1 한다.
			 if(roomIndex == 2 || roomIndex == 5) { // 2 5 에 위치해있을경우 오른쪽으로 가는것을 막는다.
				 System.out.println("오른쪽으로 갈 수 없습니다.");
			 }else {
				 System.out.println("오른쪽으로 이동했습니다.");
				 roomIndex += 1; // 0 1 3 4 에서만 오른쪽으로 이동이 가능하기 때문에 인덱스를 1 더한다.
				 return roomIndex;
			 }
			 break;
			 
			 default :
				 System.out.println("잘못 입력하셨습니다.");
				 return roomIndex;
		 }
		
		return roomIndex;
		
	}
	
	// 3. 움직인 위치를 기반으로 해당하는 방의 인덱스를 가지는 메서드
	// 방의 대한 정보 출력.
	public void infomationRoom(int index) {
		
		// 1.번 메서드를 참조하여 인덱스를 가져온다.
		roomList.get(index).infomationRoom(index);
		
		
	}
	
	// 4. 방을 클리어 했을경우 리워드
	public void PrintRewordItem(int roomIndex) {
		
		String item1 = "소지품 1";
		String item2 = "소지품 2";
		String item3 = "소지품 3";
		String item4 = "소지품 4";
		String item5 = "소지품 5";
		String item6 = "소지품 6";
				
		switch(roomIndex+1) {
			case 1:
				System.out.println("["+ item1 + "] 을 얻었다!!");
				return;
			case 2:
				System.out.println("["+ item2 + "] 을 얻었다!!");
				return;
			case 3:
				System.out.println("["+ item3 + "] 을 얻었다!!");
				return;
			case 4:
				System.out.println("["+ item4 + "] 을 얻었다!!");
				return;
			case 5:
				System.out.println("["+ item5 + "] 을 얻었다!!");
				return;
			case 6:
				System.out.println("["+ item6 + "] 을 얻었다!!");
				return;
			default:
				System.out.println("이게 출력 된다면 뭔가 잘못된거다.");
				break;
			}
	}
	
	public String rewordItem(int roomIndex) {
		
		String item1 = "소지품 1";
		String item2 = "소지품 2";
		String item3 = "소지품 3";
		String item4 = "소지품 4";
		String item5 = "소지품 5";
		String item6 = "소지품 6";
				
		switch(roomIndex+1) {
			case 1:
				return item1;
			case 2:
				return item2;
			case 3:
				return item3;
			case 4:
				return item4;
			case 5:
				return item5;
			case 6:
				return item6;
			default:
				return null;
			}
	}
	
	// 5. 방 둘러보기를 통한 문제 출제.
	public void searchRoom(int index) { // 방 번호를 입력 받는다.
		
		if(!roomList.get(index).getIsClear()) {
			System.out.println("여기 뭔가 있다...");
			System.out.println();
			System.out.println("문제: " + roomList.get(index).getQuiz()); 
		}else {
			System.out.println("이미 문제를 풀었다...");
		}
		
	}
	// 6. 정답 입력받기.
	public String isCorrect(/*메서드 구현시 여기에 문제넘버와 정답을 준다.*/int roomNumber, Scanner sc) {
		
		String correctAnswer = "정답";
		String inCorrectAnswer = "오답";
		String answer = sc.next();
		
		// 입력받은 정답이 방에 배정된 문제의 정답과 같은지 비교.
		if(answer.equalsIgnoreCase(quizList.get(roomNumber-1).getAnswer())) {
			return correctAnswer;
		}else if (!answer.equalsIgnoreCase(quizList.get(roomNumber-1).getAnswer())) {
			return inCorrectAnswer;
		}
		return null;
	}
	// 7. 방출력 메서드
	public void printRoom(int roomIndex) {
		switch(roomIndex) {
		case 0: screen.printRoom1(); break;
		case 1: screen.printRoom2(); break;
		case 2: screen.printRoom3(); break;
		case 3: screen.printRoom4(); break;
		case 4: screen.printRoom5(); break;
		case 5: screen.printRoom6(); break;
		default: screen.defaultRoom(); break;
		}
	}
	// 8. 최종방 넘어가는 메서드 // 메인 케이스 추가 .
	public void lastRoom() {
		
	}
	
	// 9. 최종방 문제.
	public boolean miniGame() throws IOException {
		
		int random = (int)(Math.random()*3)+1;
		int isWin = -1;
		switch(random) {
		
		case 1:
			isWin = miniGame.bingoGame();
			if(isWin == 1) {
				return true;
			}else if(isWin == 0) {
				return false;
			}
			
		case 2:
			isWin = miniGame.memoryGame();
			if(isWin == 1) {
				return true;
			}else if(isWin == 0) {
				return false;
			}
			
		case 3:
			System.out.println("미니게임 아직 안넣음");
			return true;
			
		default:
			return false;
		}
	}
	
	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}
	
}
