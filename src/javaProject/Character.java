package javaProject;

import java.util.ArrayList;

public class Character {
	
	private int charaterCode; // 캐릭터를 호출할 코드.
	private String chareterName; // 캐릭터의 이름.
	private int charaterLife; // 캐릭터의 남은 생명.
	private Screen screen = new Screen();
	
	// 캐릭터가 소지한 아이템.
	private ArrayList<String> item = new ArrayList<>();
	
//	// 캐릭터가 흭득한 힌트만 가지고 있다..
//	private ArrayList<Hint> hint = new ArrayList<>(); // 일단 보류
	
	public Character() {
		charaterLife = 10;
	}
	
	// 캐릭터의 남은 생명.
	public void printCharacterLife() {
		switch(charaterLife) {
		case 10: screen.healthPointPrint10(); break;
		case 9: screen.healthPointPrint9(); break;
		case 8: screen.healthPointPrint8(); break;
		case 7: screen.healthPointPrint7(); break;
		case 6: screen.healthPointPrint6(); break;
		case 5: screen.healthPointPrint5(); break;
		case 4: screen.healthPointPrint4(); break;
		case 3: screen.healthPointPrint3(); break;
		case 2: screen.healthPointPrint2(); break;
		case 1: screen.healthPointPrint1(); break;
		}
		System.out.println("남은 하트의 개수 : " + charaterLife + "개");
		System.out.println();
	}
	
	// 캐릭터의 소지품 확인.
	public void printCharacterItem() {
		if(item.size() == 0) {
			System.out.println("소지품이 없습니다.");
		}else{
			System.out.println("-- 소지품 목록 --");
			System.out.println();
			
			if(item.size() == 6) {
				System.out.println("소지품을 다 모았다!!");
				System.out.println("지상으로 나가보자");
				System.out.println("(물건들의 이름을 자세히 살펴보자..)");
			}
			
			for(int i=0; i<item.size(); i++) {
				System.out.println((i+1)+". "+item.get(i));
				
			}
		}
			
	}
	public void lastRoom() {
		System.out.println();
		System.out.println("모든 방을 클리어 했습니다!!");
		try {
			Thread.sleep(1000);
			System.out.println();
			System.out.println("지상으로 가는 문앞으로 갑니다...");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("물건들을 올려놓기 시작합니다...");
			Thread.sleep(1000);
			for(int i=0; i<item.size(); i++) {
				System.out.println();
				System.out.println("["+item.get(i)+"]"+ "을(를) 올려놓았습니다.");
				Thread.sleep(1000);
			}
			System.out.println();
			System.out.println("모든 물건을 올려놨습니다.");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("문제가 나옵니다. 준비하세요!!");
			Thread.sleep(1500);
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public int getCharaterCode() {
		return charaterCode;
	}

	public void setCharaterCode(int charaterCode) {
		this.charaterCode = charaterCode;
	}

	public String getChareterName() {
		return chareterName;
	}

	public void setChareterName(String chareterName) {
		this.chareterName = chareterName;
	}

	public int getCharaterLife() {
		return charaterLife;
	}

	public void setCharaterLife(int charaterLife) {
		this.charaterLife = charaterLife;
	}

	public ArrayList<String> getItem() {
		return item;
	}

	public void setItem(ArrayList<String> item) {
		this.item = item;
	}

	
	// 아직 toString 을 만들지 않았다.
	
	// 아직 getter / setter 를 만들지 않았다.
	
	
	
	
	
}
