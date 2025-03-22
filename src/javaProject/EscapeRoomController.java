package javaProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EscapeRoomController {
	
	private ArrayList<Room> roomList = new ArrayList<>();
	private int roomIndex;
	
	// 방 만들어놓기.
	public void settingRoom() {
		
		roomList.add(new Room(1, "컨셉1", "문제", "정답"));
		roomList.add(new Room(2, "컨셉2", "문제", "정답"));
		roomList.add(new Room(3, "컨셉3", "문제", "정답"));
		roomList.add(new Room(4, "컨셉4", "문제", "정답"));
		roomList.add(new Room(5, "컨셉5", "문제", "정답"));
		roomList.add(new Room(6, "컨셉6", "문제", "정답"));
		
	}
	
	// 방을 클리어 했을경우 넣어주는 메서드. -> 클리어 여부를 true 로 바꿔준다.
	public void clearRoom(int clearRoomNumber) {
		
		roomList.get(clearRoomNumber).setIsclear(true);
		System.out.println(clearRoomNumber + "번 방을 클리어 하셨습니다.");
		
	}
	
	// 캐릭터가 방을 움직일때 움직임을 제한하는 메서드. 
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
				 System.out.println("현재" + (roomIndex+1) + "번 방입니다.");
			 }else {
				 System.out.println("위로 이동했습니다.");
				 roomIndex -= 3; // 3 4 5 에서만 위로 이동이 가능하기 때문에 인덱스를 3 뺀다.
				 System.out.println("현재" + (roomIndex+1) + "번 방입니다.");
				 return roomIndex;
			 }
			 break;
			 
		 case "A":
			 // 왼쪽으로 움직이기. > 인덱스 값을 -1 한다.
			 if(roomIndex == 0 || roomIndex == 3) { // 0 3 에 위치해있을경우 왼쪽으로 가는것을 막는다.
				 System.out.println("왼쪽으로 갈 수 없습니다.");
				 System.out.println("현재" + (roomIndex+1) + "번 방입니다.");
			 }else {
				 System.out.println("왼쪽으로 이동했습니다.");
				 roomIndex -= 1; // 1 2 4 5 에서만 왼쪽으로 이동이 가능하기 때문에 인덱스를 1 뺀다.
				 System.out.println("현재" + (roomIndex+1) + "번 방입니다.");
				 return roomIndex;
			 }
			 break;
			 
		 case "S":
				 // 아래로 움직이기. > 인덱스 값을 +3 한다.
				 if(roomIndex > 2 && roomIndex < 6) { // 3 4 5 에 위치해있을경우 아래로 가는것을 막는다.
					 System.out.println("아래로 갈 수 없습니다.");
					 System.out.println("현재" + (roomIndex+1) + "번 방입니다.");
				 }else {
					 System.out.println("아래로 이동했습니다.");
					 roomIndex += 3; // 0 1 2 에서만 아래로 이동이 가능하기 때문에 인덱스를 3 더한다.
					 System.out.println("현재" + (roomIndex+1) + "번 방입니다.");
					 return roomIndex;
			 }
			 break;
			 
		 case "D":
			 // 오른쪽으로 움직이기. > 인덱스 값을 +1 한다.
			 if(roomIndex == 2 || roomIndex == 5) { // 2 5 에 위치해있을경우 오른쪽으로 가는것을 막는다.
				 System.out.println("오른쪽으로 갈 수 없습니다.");
				 System.out.println("현재" + (roomIndex+1) + "번 방입니다.");
			 }else {
				 System.out.println("오른쪽으로 이동했습니다.");
				 roomIndex += 1; // 0 1 3 4 에서만 오른쪽으로 이동이 가능하기 때문에 인덱스를 1 더한다.
				 System.out.println("현재" + (roomIndex+1) + "번 방입니다.");
				 return roomIndex;
			 }
			 break;
			 
			 default :
				 System.out.println("잘못 입력하셨습니다.");
				 return roomIndex;
		 }
		
		return roomIndex;
		
	}
	
	
	
	
	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}
	
}
