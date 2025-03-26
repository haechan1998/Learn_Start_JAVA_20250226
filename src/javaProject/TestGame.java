package javaProject;

import java.io.IOException;
import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) throws IOException {
		EscapeRoomController c = new EscapeRoomController();
		Screen screen = new Screen();
		Scanner sc = new Scanner(System.in);
		c.printMessage();
		System.out.println("입력해주세요!!!!! >");
		String credit = sc.next();
		if(credit.equalsIgnoreCase("escape")) {
			screen.endingCreditsPrint();
		}else {
			System.out.println("힝... 그거 아닌뎅...");
		}

		MiniGame m = new MiniGame();
//		m.mazeGame();
		//m.mazeGame();
		//m.diseGame(); // 주사위게임
//		m.memoryGame();
//		m.bingoGame();
	}

}
