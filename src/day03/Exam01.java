package day03;

import java.util.Scanner;
import java.util.Random;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * up / down game
		 * 
		 * 1부터 50까지의 랜덤 수 생성하여 맞추는 게임 // Math.random(); 활용
		 * 컴퓨터가 랜덤 수 생성 : 23 : 사용자는 확인 X
		 * 입력 : 10 // Scanner 활용
		 * U P!!
		 * 입력 : 20 U P!!
		 * 입력 : 30 DOWN!!
		 * 입력 : 25 DOWN!!
		 * 입력 :
		 * 23 정답!!
		 * 
		 * while 조건문을 이용하거나, while 문 내부에 조건을 달아서 반복문을 종료시킬 수 있다. 
		 */
		Scanner sc = new Scanner(System.in);

		int input = 0; // 기본 입력값 초기화

		int random = (int) (Math.random() * 50) + 1; // 랜덤한 수 출력

		int money = 10000; // 지갑

		int price1St, price2St, gameStart; // 상금 변수선언, 게임 비용 변수선언

		price1St = 50000; // 1등상금
		price2St = 30000; // 2등상금
		gameStart = 1000; // 게임 시작 비용

		for (int i = 0;; i++) {
			System.out.println("보유하신 금액은 " + money + "원 입니다");
			System.out.println("게임을 시작하시려면 1000원을 지불해주세요!");
			System.out.println("시작하기 [1] : 종료하기[2] > "); // 1은 시작 / 2는 종료
			int count = 0; // 반복 횟수

			int select = sc.nextInt();

			if (select == 1 && money >= 1000) {
				System.out.println("게임을 시작합니다!");
				System.out.println("1000원을 차감합니다.");
				money -= gameStart;
				System.out.println("남은잔액 " + (money) + "원");

				System.out.println("1부터 50까지의 랜덤수를 맞춰라!");
				while (true) {
					System.out.print("입력 >");
					input = sc.nextInt();
					count++;

					if (input < random) {
						System.out.println("U P!!");
					} else if (input > random) {
						System.out.println("DOWN!!");
					} else {
						System.out.println("정답!!");
						System.out.println("정답을 " + count + "번째에 맞추셨습니다.");
						if (count == 1) {
							System.out.println("운이 정말 좋으시네요!");
							System.out.println("상금" + price1St + " 원 얻었습니다!");
							money += price1St;
						} else if (count <= 5) {
							System.out.println("감이 좋으신 편이네요!");
							System.out.println("상금" + price2St + " 원 얻었습니다!");
							money += price2St;
						} else {
							System.out.println("운이 좀 없으시네요 ㅎㅎ!");
						}
						break;
					}
				}
				continue;

			} else if (select == 2) {
				System.out.println("종료되었습니다.");
				break;
			}

			sc.close();

		} // for

		// for 문을 사용해서 만든 UP / DOWN 게임
//		Scanner sc = new Scanner(System.in);
//		
//		int random = (int)(Math.random() * 50) + 1;
//		
//		int input = 0;
//		
//		for(int i = 1; ; i++) {
//			System.out.print("입력 >");
//			input = sc.nextInt();
//			if(input < random) {
//				System.out.println("U P!!");
//			}else if(input > random) {
//				System.out.println("DOWN!!");
//			}else {
//				System.out.println("정답!");
//				System.out.println("정답을 " + i + "번째에 맞추셨습니다.");
//				break;
//			}
//		}
//		sc.close();

	}

}
