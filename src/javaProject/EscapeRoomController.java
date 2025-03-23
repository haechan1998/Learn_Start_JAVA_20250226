package javaProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EscapeRoomController {
	
	private ArrayList<Room> roomList = new ArrayList<>();
	private int roomIndex;
	
	// 방 만들어놓기.
	public void settingRoom() {
		
		roomList.add(new Room(1, "컨셉1", "문제1", "정답1"));
		roomList.add(new Room(2, "컨셉2", "문제2", "정답2"));
		roomList.add(new Room(3, "컨셉3", "문제3", "정답3"));
		roomList.add(new Room(4, "컨셉4", "문제4", "정답4"));
		roomList.add(new Room(5, "컨셉5", "문제5", "정답5"));
		roomList.add(new Room(6, "컨셉6", "문제6", "정답6"));
		
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
		roomList.get(index).infomationRoom();
		
		
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
	
	// 방 둘러보기를 통한 문제 출제.
	public void searchRoom(int index) { // 방 번호를 입력 받는다.
		if(!roomList.get(index).getIsClear()) {
			System.out.println("여기 뭔가 있다...");
			System.out.println(roomList.get(index).getQuiz()); 
		}else {
			System.out.println("이미 문제를 풀었다...");
		}
		
	}
	
	public String isCorrect(/*메서드 구현시 여기에 문제넘버와 정답을 준다.*/Scanner sc) {
		// 일단 정답일 경우 1, 아닐경우 0
		String correctAnswer = "정답";
		String inCorrectAnswer = "오답";
		int answer = sc.nextInt();
		// 정답 1, 오답 0
		if(answer == 1) {
			return correctAnswer;
		}else if (answer == 0) {
			return inCorrectAnswer;
		}
		return null;
	}
	
	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}
	
}
