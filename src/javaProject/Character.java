package javaProject;

import java.util.ArrayList;

public class Character {
	
	private int charaterCode; // 캐릭터를 호출할 코드.
	private String chareterName; // 캐릭터의 이름.
	private int charaterLife; // 캐릭터의 남은 생명.
	
	// 캐릭터가 소지한 아이템.
	private ArrayList<String> item = new ArrayList<>();
	
//	// 캐릭터가 흭득한 힌트만 가지고 있다..
//	private ArrayList<Hint> hint = new ArrayList<>(); // 일단 보류
	
	public Character() {
		charaterLife = 10;
	}
	
	// 캐릭터의 남은 생명.
	public void characterLifePrint() {
		System.out.println("남은 하트의 개수 : " + charaterLife + "개");
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
