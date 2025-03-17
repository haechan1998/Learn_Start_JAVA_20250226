package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 컴퓨터와 가위바위보 게임.
		 * 컴퓨터는 랜덤으로 가위 / 바위 / 보 중 하나를 선택
		 * (0 = 가위, 1 = 바위, 2 = 보)
		 * 
		 * 내가 가위바위보 중 하나를 선택하여 입력
		 * 
		 * ex)
		 * com = 0(가위) me = 보(2)
		 * com 승리~!!
		 * 패배 / 무승부 / 승리 중 하나 출력
		 * */
		Scanner scan = new Scanner(System.in);
		
		String choice[] = new String[] {"가위","바위","보"};
		 // String 배열을 이용해서, 배열 index 에 숫자를 부여하여 원하는/랜덤 의 배열값을 받아 출력함
		
		System.out.println("가위바위보 게임 시작>");
		int comNum = (int)(Math.random()*3); //0 1 2
		System.out.println("컴퓨터 결정 완료!!"+comNum);
		
		System.out.println("가위(0)/바위(1)/보(2) 중 선택 >");
//		String myChoice = scan.next(); //가위, 바위, 보 중 하나
//		String comChoice = (comNum == 0) ? "가위" : 
//			(comNum == 1) ? "바위" : "보";
		int myNum = scan.nextInt();
		String comChoice = choice[comNum];
		String myChoice = choice[myNum];
		
		System.out.println("comChoice > "+ comChoice);
		System.out.println("myChoice > "+myChoice);
		
		//비교
		if(!(myChoice.equals("가위")|| myChoice.equals("바위") || myChoice.equals("보"))){
			System.out.println("입력오류입니다.");
		}else {
			if(comChoice.equals(myChoice)) {
				System.out.println("무승부");
			}else {
				//승 / 패
				if(comChoice.equals("가위")) {
					// 바위 
					System.out.println(myChoice.equals("바위")? "승" : "패");
					
				}else if(comChoice.equals("바위")) {
					// 보
					System.out.println(myChoice.equals("보")? "승" : "패");
					
				}else {
					//가위
					System.out.println(myChoice.equals("가위")? "승" : "패");
				}
			}
		}
		
		System.out.println("종료");
		
		scan.close();
		
		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("가위바위보 게임 시작>");
//		int comNum = (int) (Math.random() * 3);
//		System.out.println("컴퓨터 결정 완료!" + comNum);
//
//		System.out.println("가위/바위/보 중 선택 >");
//		String myChoice = sc.next();
//		String comChoice = (comNum == 0) ? "가위" : (comNum == 1) ? "바위" : "보";
//
//		System.out.println("comChoice > " + comChoice);
//		System.out.println("myChoice > " + myChoice);
//		if (!(myChoice.equals("가위") || myChoice.equals("바위") || myChoice.equals("보"))) {
//			System.out.println("입력오류");
//		} else {
//
//			if (comChoice.equals(myChoice)) {
//				System.out.println("무승부");
//			} else {
//				if (comChoice.equals("가위")) {
//					System.out.println(myChoice.equals("바위") ? "승" : "패"); // 3항연산자를 이용한 출력
//																											
//				} else if (comChoice.equals("바위")) {
//					System.out.println(myChoice.equals("보") ? "승" : "패");
//
//				} else if (comChoice.equals("보")) {
//					System.out.println(myChoice.equals("가위") ? "승" : "패");
//				}
//			}
//		}
//		System.out.println("종료");
//
//		sc.close();
		
		
	
		
		//switch case
		
//		Scanner sc = new Scanner(System.in);
//		
//		int randomCom = (int)(Math.random()*3); // 컴퓨터가 정하는 랜덤한 값
//		
//		System.out.println("가위바위보");
//		System.out.println("|0 = 가위|1 = 바위|2 =  보|");
//		System.out.println("입력 > ");
//		int player = sc.nextInt();
//		
//		switch(randomCom) {
//		case 0: // 컴퓨터 가위
//			System.out.println("컴퓨터는 가위를 냈습니다.");
//			switch(player) {
//			case 0: // 플레이어 가위
//				System.out.println("무승부");
//				break;
//			case 1: // 플레이어 바위
//				System.out.println("승리");
//				break;
//			case 2: // 플레이어 보
//				System.out.println("패배");
//				break;
//				default :
//					System.out.println("잘못입력");
//			} // 중첩 switch 종료
//					break;
//					
//		case 1: // 컴퓨터 바위
//			System.out.println("컴퓨터는 바위를 냈습니다.");
//			switch(player) {
//			case 0: // 플레이어 가위
//				System.out.println("패배");
//				break;
//			case 1: // 플레이어 바위
//				System.out.println("무승부");
//				break;
//			case 2: // 플레이어 보
//				System.out.println("승리");
//				break;
//				default :
//					System.out.println("잘못입력");
//			} // 중첩 switch 종료
//					break;
//		case 2: // 컴퓨터 보
//			System.out.println("컴퓨터는 보를 냈습니다.");
//			switch(player) {
//			case 0: // 플레이어 가위
//				System.out.println("승리");
//				break;
//			case 1: // 플레이어 바위
//				System.out.println("패배");
//				break;
//			case 2: // 플레이어 보
//				System.out.println("무승부");
//				break;
//				default :
//					System.out.println("잘못입력");
//			} // 중첩 switch 종료
//					break;
//		} // main switch 문 종료
//		
//		sc.close();
		
		
	}

}
