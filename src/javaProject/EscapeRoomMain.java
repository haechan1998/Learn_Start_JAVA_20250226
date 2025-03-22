package javaProject;

import java.io.IOException;
import java.util.Scanner;

public class EscapeRoomMain {

	public static void main(String[] args) throws IOException{
		
		/*
		 * <화면> // 방탈출 게임 (escape room) -> 화면에서 글자 모양 출력. -> 시작 여부 출력.
		 * 
		 * 1. 메인에서 입장하고 있습니다. 출력..
		 * 
		 * 2. 입장시 규칙 소개글.
		 * 
		 * 3. 행동 리스트 출력
		 * 		
		 * 		1.움직이기 / 2.소지품확인 / 3.방둘러보기 (일단 이정도만 정하고 해보자...)
		 *		
		 *		2.소지품확인 (메인에서 진행)
		 *			-a 방을 클리어 했을경우 주는 소지품. -> 모든 방을 클리어 하고 나온 소지품을 소지해야 마지막 방 클리어 가능.
		 *			-b 마지막방은 룸에 배정하지 않고 메인에서 조건문으로 통하여 문제를 출력한다.
		 *
		 *		3.방둘러보기
		 *			-a 방을 둘러봐야 문제가 나오는 형식.(-- 에서 무언갈 발견했다.)
		 * 
		 * 4. 방 클리어 출력
		 * 
		 * 5. 탈출 출력
		 * 
		 * 이런식으로 흘러가는 구조로 진행하고, 추가할것이 있다면 차후 추가.
		 * 
		 */	
		 Scanner sc = new Scanner(System.in);
		 Character player = new Character();
		 EscapeRoomController roomController = new EscapeRoomController();
		 String starter = ""; // 게임 시작 여부
		 int menu = 0;
		 
		 // 기본 방 구성 세팅
		 roomController.settingRoom();
		 
		 while(true) {
			 System.out.println("게임을 시작하시겠습니까? (Y/N)");
			 starter = sc.next();
			 if(starter.equalsIgnoreCase("Y")) {
				 System.out.println("방탈출 게임을 시작."); // 화면 메서드 받기. 진행 방식은 반복문으로. 탈출 조건은 소지품 배열이 정해진 숫자 이상인경우.
				 
				 do {
					 
					 System.out.println("1.움직이기 / 2.소지품확인 / 3.방둘러보기");
					 System.out.println("아직 움직이는거 밖에 못한다.");
					 menu = sc.nextInt();
					 switch(menu) {
					 // 1.움직이기 / 2.소지품확인 / 3.방둘러보기 (일단 이정도만 정하고 해보자...)
					 case 1:
						 System.out.println("이동할 방향을 선택하세요.");
						 roomController.directionRoom(sc);
						 break;
					 case 2:
						 break;
					 case 3:
						 break;
						 
					 }
					 
				 }while(player.getCharaterLife() != 0);
				 // player 의 남은 체력이 0이 되는경우 게임 종료. 기본 체력은 10. 게임 진행동안 체력 회복요소 존재.
				 
			 }else if(starter.equalsIgnoreCase("N")) {
				 break;
			 }else {
				 System.out.println("다시입력해주세요");
			 }
		 }
		 
		 if(player.getCharaterLife() == 0) {
			 System.out.println("체력이 다 떨어졌습니다...");
		 }else{
			 System.out.println("게임이 종료되었습니다.");
		 }
		 sc.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
