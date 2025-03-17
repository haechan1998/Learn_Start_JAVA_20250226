package day09;

public class CardMain {

	public static void main(String[] args) {
		
		Card card = new Card();
		
//		card.cardPrint(); // 기본값 ♥A
//		card.setNum(11);
//		card.setShape("♠");
//		card.cardPrint(); // 세터로 받은 값 ♠J
//		card.setNum(16);
//		card.setShape("y"); // 범위를 벗어난 값을 기본값으로 받는다. ♥A
//		card.cardPrint();
//		card.setNum(4);
//		card.cardPrint();
		
//		card.setShape("♠");
//		for (int i = 1; i <= 4; i++) {
//			switch (i) {
//			case 1:
//				card.setShape("♥");
//				break;
//			case 2:
//				card.setShape("◆");
//				break;
//			case 3:
//				card.setShape("♠");
//				break;
//			case 4:
//				card.setShape("♣");
//				break;
//			}
//			
//			for (int j = 1; j <= 13; j++) {
//				card.setNum(j);
//				card.cardPrint();
//			}
//			System.out.println();
//			
//		}
		
		CardPack pack = new CardPack();
		int cnt=0;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				pack.getPack()[cnt].cardPrint();
				cnt++;
			}
			System.out.println();
		}
		System.out.println("----------------------");
		pack.shuffle();
		cnt = 0;
		for(Card c1 : pack.getPack()) {
			c1.cardPrint();
		}
		
		System.out.println("----------------------");
		
		System.out.println("딜러가 카드를 섞고 있습니다.");
		pack.shuffle();
		cnt = 0;
		for(Card c1 : pack.getPack()) {
			c1.cardPrint();
		}
		System.out.println("딜러가 카드를 나누고 있습니다.");
		Card player1 = pack.pick();
		Card player2 = pack.pick();
		Card player3 = pack.pick();
		
		System.out.println("----------------------");
		System.out.println("player1 card open");
		player1.cardPrint();
		System.out.println();
		System.out.println("player2 card open");
		player2.cardPrint();
		System.out.println();
		System.out.println("player3 card open");
		player3.cardPrint();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}