package day02;

public class Disegame {

	public static void main(String[] args) {

		// <주사위 놀이>.  반복해서 총 50 칸을 달성해야한다 for 문 활용
				// 주사위 세개가 있다. > 주사위 변수 3개 생성 / 이 주사위는 Math.random을 활용한 1~6 까지의 랜덤수 생성
				// 주사위가 세개가 전부 같은 수일 경우 (같은 수 * 3)칸 전진. 조건식 if 문을 사용해서 조건에 && 을 포함한 다 같은수인 하나의 경우를 생성
				// 주사위가 두개만 같은 수일경우 (같은 수 * 2) 칸 전진.
				// 주사위가 하나도 같은 수가 없을경우 '제일 낮은 수'만큼 후진. 위에 경우가 다 아니니 else 를 사용해서 나머지 생성 / 후진 할 경우 세가지의 주사위 수중 제일 낮은 수를 Math.min을 활용하여 최소값을 구한다.
				// dise1 dise2 dise3 

				System.out.println("-----------------------------");
				
				int dise1, dise2, dise3;
				
				dise1 = (int)(Math.random()*6)+1;
				dise2 = (int)(Math.random()*6)+1;
				dise3 = (int)(Math.random()*6)+1;
				int score = 0;
				
				System.out.printf("%d " + "%d " + "%d%n", dise1, dise2, dise3);

				
					
				if(dise1 == dise2 && dise2 == dise3 && dise1 == dise3) {
					System.out.println(dise1 * 3 + "3칸전진"); // * 3칸
					score += (dise1 * 3);
					
		    	}else if(dise1 == dise2) {
					System.out.println((dise1 * 2) + "칸전진");
					score += (dise1 * 2);
					
		    	}else if(dise1 == dise3) {
					System.out.println((dise1 * 2) + "칸전진");
					score += (dise1 * 2);
					
		    	}else if(dise2 == dise3) {
		    		System.out.println((dise3 * 2) + "칸전진");
		    		score += (dise2 * 2);
		    		
				}else {
					System.out.println((int)(Math.min(Math.min(dise1, dise2),dise3)) + "칸 "+ "후진");
				}
				
	}

}
