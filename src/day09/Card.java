package day09;

public class Card {
		
		/* 숫자 : 1~10, J(11), Q(12), K(13)
		 * 모양 : ♥, ◆, ♠, ♣
		 * 한장의 카드 모양을 출력하는 기능 => print()
		 * ex) ♥3,  ♥12 => ♥Q, #5 => ♥5, $15 => ♥1
		 * 
		 * - 멤버변수 : 숫자(num), 모양(shape) => private => getter/setter
		 * - 메서드 : print()
		 * - 생성자 : 기본생성자만 생성 => ♥1
		 * */
		
		private int num;
		private String shape;
		
		public Card() { // 생성자로 기본값 정하기.
			
			this.num = 1;
			this.shape = "♥";
			
		}
		
		public void cardPrint() {
			System.out.print(shape);
			switch(num) {
			case 1:
				System.out.print("A ");
				break;
			case 11:
				System.out.print("J ");
				break;
			case 12:
				System.out.print("Q ");
				break;
			case 13:
				System.out.print("K ");
				break;
				default:
					System.out.print(num+ " "); // num이 범위내 값이면 그대로 출력.
				
			}
//			System.out.println();
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			
			if(num < 1 || num > 13) {
				this.num = 1;
			}else {
				this.num = num;
			}
		}

		public String getShape() {
			return shape;
		}

		public void setShape(String shape) {
			// 모양 : ♥, ◆, ♠, ♣ 이 아니면 무조건 ♥
			switch(shape) { //  ♥, ◆, ♠, ♣
			case "♥": case "◆": case "♠": case "♣":
				this.shape = shape;
				break;
				default :
					this.shape = "♥";
			}
			
		}
		
}
