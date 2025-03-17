package day09;

public class CardPack {
	/* Card 클래스의 객체를 묶은 pack
	 * ♥A~♥K ◆A~◆K ♠A ♠K ♣A ♣K
	 * 
	 *  메서드()
	 *  - 카드 출력기능 => (Card class print())
	 *  - 카드 초기화 기능 => 생성자
	 *  - 카드 셔플
	 *  - 카드 한장을 빼내는 기능
	 * */
	
	// Card 클래스를 담는 pack 배열 (52장)
	// 자료형 배열명[] = new 자료형[개수];
	private Card pack[] = new Card[52];
	private int cnt; // 카드 배열의 index 표시
	
	public CardPack() {
		String shape = "";
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: shape = "♥"; break;
			case 2: shape = "◆"; break;
			case 3: shape = "♠"; break;
			case 4: shape = "♣"; break;
			}
			for(int j=1; j<=13; j++) {
				Card card = new Card();
				card.setShape(shape);
				card.setNum(j);
				pack[cnt] = card;
				cnt++;
			}
		}
	}
	
	// 카드 섞는 기능
	// 매개변수 : / 리턴타입 void
	public void shuffle() {
		for(int i=0; i<pack.length; i++) {
			int random = (int)(Math.random()*pack.length);
			Card card = pack[i];
			pack[i] = pack[random];
			pack[random] = card;
		}
	}
	
	// 카드 한장을 빼내는 기능
	public Card pick() {
		if(cnt == 0) {
			return null;
		}
		cnt--;
		return pack[cnt];
	}
	
	// 카드를 다시 모으는 기능
	public void initialization() {
		cnt = 52;
	}

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
