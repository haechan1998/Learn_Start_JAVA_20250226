package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ExamCopy {

	public static void main(String[] args) {
		/* ArrayEx01 에서 했던 야구게임을
		 * 메서드 분리 후 실행.
		 * */
		Scanner sc = new Scanner(System.in);
		
		int comNum[] = new int[3]; // 이 배열에 랜덤값을 넣는다.
		int myNum[] = new int[3]; // Scanner 로 배열을 받는다.
		int resultStrike = 0, resultBall = 0, myNumInput = 0, outCount = 0, count = 0;
		// 순서대로 스트라이크 결과값, 볼 결과값, myNum에 입력할 값, 아웃 결과값, 횟수 결과값.
		
		// 메서드를 이용해 comNum 배열에 중복되지 않는 랜덤수(0~9) 저장.
		randomArray(comNum);
		// comNum의 값 확인.
		System.out.println("comNum 값");
		System.out.println(Arrays.toString(comNum));
		
		System.out.println("==야구게임을 시작합니다==");
		System.out.println("중복되지 않는 정수(0~9)를 3개 입력해주세요.");
		System.out.println("ex) 1 2 3");
		// 시작 do-while 문
		sequence1:do {
			System.out.println("==================================");
			System.out.println("정수를 입력해주세요 >");
			
			// myNum에 정수 3개 입력
			for (int i = 0; i < myNum.length; i++) {
				myNumInput = sc.nextInt();
				myNum[i] = myNumInput;
			}
			// 범위를 벗어난 정수 검사
			for (int i = 0; i < myNum.length; i++) {
				if(myNum[i] > 9 || myNum[i] < 0) {
					System.out.println("잘못된 정수를 입력하셨습니다.");
					continue  sequence1; // 범위를 벗어날 경우 다시 do 실행
				}
				// 중복된 정수 검사
				for (int j = 0; j < i; j++) {
					if(myNum[i]==myNum[j]) {
						System.out.println("중복된 정수를 입력하셨습니다.");
						System.out.println("다시 입력해주세요.");
						continue sequence1; // 중복될경우 다시 do 실행
					}
				}
			}
			
			
			System.out.println("당신이 입력한 값은 > " + Arrays.toString(myNum) + "입니다.");
			resultStrike = strike(myNum, comNum);
			resultBall = ball(myNum, comNum);
			System.out.println(resultStrike + "S" + " " + resultBall + "B");
			count++;
			

			if (resultStrike == 3) {
				System.out.println("[승리] 숫자를 맞히셨습니다!! 종료합니다.");
				System.out.println("시도한 횟수 : " + count + "번");
				
				break;
			}else if (resultStrike == 0 && resultBall == 0) {
				outCount++;
				System.out.println(outCount + "OUT");
				if(outCount == 3) {
					System.out.println("[패배] 3OUT 게임 종료!");
					break;
				}
			}

		} while (true);


		sc.close();
			
		}
	/* 1. 중복확인 메서드
	 *    배열과, 랜덤값을 입력받아 배열에 랜덤값이 "존재"하면 true / 없으면 false 를 리턴
	 */
	public static boolean duplicateCheck(int[] arr, int randomNum) { // is 로 시작하면 맞는지 틀린지를 비교하는 메서드 규칙 
		boolean bl = false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==randomNum) { // 배열 arr 과 랜덤수가 같은지 비교한다.
				bl = true; // 같다면 true
			}
		}
		return bl; // 다르다면 false.
	}
	/* true 를 받았을 때 2.의 메서드에서, 반복문의 조건을 감소시켜 for 문 내부에 계속 머무르며
	 * 비교하도록 한다.
	 * 
	 * false 를 받았을 때 2.의 메서드에서, 중복되지 않는 랜덤수의 값을 해당하는 index 에 넣어
	 * 중복되지 않는 배열을 정리한다.  
	 */
	
	/* 2. 배열을 입력받아 랜덤으로 값이 중복되지 않게(중복확인 메서드 활용) 채우기.
	 * 	  랜덤값은 (0~9)
	 */	  
	public static void randomArray(int[] arr) {
		/* (중복되었거나 중복되지 않는) 랜덤수를 가진 배열 생성.
		 * > "중복확인을 위해" 랜덤한 값이 들어있는 배열을 만든다.
		 */
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
		}
		
		for(int i=0; i<arr.length; i++) { // 중복확인 메서드를 이용하여 중복확인.
			int randomNum = (int)(Math.random()*10);
			if(duplicateCheck(arr, randomNum)) {
				i--; // index 에 저장 되어있는 값과 randomNum의 값이 같다면 다시 비교.
			}else {
				arr[i] = randomNum; // index 에 저장 되어있는 값과 다르다면 배열에 randomNum 저장. 
			}
		}
		
	}
			
			
	
	/* 3. 스트라이크 개수를 카운트하는 메서드
	 * comNum, myNum 배열을 입력받아 번호와 위치가 일치하면 count 값을 리턴하는 메서드
	 */
	
	public static int strike(int[] myNum, int[] comNum) {
		
		int strike = 0;
		for(int i=0; i<comNum.length; i++) {
			for(int j=0; j<comNum.length; j++) {
				if(myNum[i] == comNum[j] && i == j) { // 배열의 값과 배열 위치가 같은지 확인.
					strike++;
				}
			}
		}
		return strike;
	}
	
	/* 4. 볼개수 개수를 카운트하는 메서드
	 * comNum, myNum 배열을 입력받아 번호만 일치하면 count 값을 리턴하는 메서드
	 */
	
	public static int ball(int[] myNum, int[] comNum) {
		
		int ball = 0;
		for(int i=0; i<comNum.length; i++) {
			for(int j=0; j<comNum.length; j++) {
				if(myNum[i] == comNum[j] && i != j) { // 배열의 값은 같지만 위치가 다른지 확인.
					ball++;
				}
			}
		}
		return ball;
		
		// 볼개수를 카운트 하는 메서드를 만들때 중복확인 메서드를 활용하고,
		// 그 값과 스트라이크 메서드를 빼서 볼의 카운트를 구할 수 있다.
	}
		
}
