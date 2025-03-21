package javaProject;

import java.util.ArrayList;

public class Room {
	
	// 모든 힌트의 리스트를 가지고있다.
	private ArrayList<Hint> hintList = new ArrayList<>();
	// 모든 기믹의 리스트를 가지고있다.
	private ArrayList<Gimmick> gimmickList = new ArrayList<>(); 
	// 방 넘버를 가지고 있는 리스트.
	private ArrayList<Integer> room = new ArrayList<>(); // 이건 메서드로 따로 구현하는거로 생각해보자.
	
	// roomNumber 를 메인에서 받아 해당하는 방에 힌트를 제공.
	// failCount 를 메인에서 받아 횟수가 올라가면 힌트 순차적으로 제공.
	public void hint(int failCount, int roomNumber) {
		if(roomNumber == 1) {
			
			switch(failCount) {
			// 방 1에대한 힌트
			case 1:
				hintList.add(0, new Hint(1, "힌트1"));
				break;
			case 2:
				hintList.add(1, new Hint(2, "힌트2"));
				break;
			case 3:
				hintList.add(2, new Hint(3, "힌트3"));
				break;
			}
		}else if(roomNumber == 2) {
			
			switch(failCount) {
			// 방 2에대한 힌트
			case 1:
				hintList.add(3, new Hint(4, "힌트4"));
				break;
			case 2:
				hintList.add(4, new Hint(5, "힌트5"));
				break;
			case 3:
				hintList.add(5, new Hint(6, "힌트6"));
				break;
			}
		}else if(roomNumber == 3) {
			// 방 3에대한 힌트
			switch(failCount) {
			case 1:
				hintList.add(6, new Hint(7, "힌트7"));
				break;
			case 2:
				hintList.add(7, new Hint(8, "힌트8"));
				break;
			case 3:
				hintList.add(8, new Hint(9, "힌트9"));
				break;
			}
		}else if(roomNumber == 4) {
			// 방 4에대한 힌트
			switch(failCount) {
			case 1:
				hintList.add(9, new Hint(10, "힌트10"));
				break;
			case 2:
				hintList.add(10, new Hint(11, "힌트11"));
				break;
			case 3:
				hintList.add(11, new Hint(12, "힌트12"));
				break;
			}
		}
		
	}
	
	// 방 생성.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
