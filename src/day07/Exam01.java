package day07;

import java.util.Arrays;

public class Exam01 {
	
	/* 1. 중복확인 메서드
	 *    배열과, 랜덤값을 입력받아 배열에 랜덤값이 "존재"하면 true / 없으면 false 를 리턴
	 */
	public static boolean randomserch(int[] arr, int random) { // 2차원 배열의 값을 중복 확인하는 메서드. t/f
		boolean trueAndFalse = false; 
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == random) { // random 은 main 에서 랜덤수를 받아 돌린다. 
				trueAndFalse = true;
			}else {
				trueAndFalse = false;
			}
		}
		
		return trueAndFalse; // 중복이 된다면 true 출력 / 안된다면 false 출력
	}
	
	/* 2. 배열을 입력받아 랜덤으로 값이 중복되지 않게(중복확인 메서드 활용) 채우기.
	 * 	  랜덤값은 (0~9)
	 */	
	public static int[] randomArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				randomserch(arr, random);
				if(true) {
					i--;
				}
			}
		}
		return arr;
	}
	
	/* 3. 스트라이크 개수를 카운트하는 메서드
	 * comNum, myNum 배열을 입력받아 번호와 위치가 일치하면 count 값을 리턴하는 메서드
	 */
		public static int strike(int[] myNum, int[] comNum) {
			int strike = 0;
			for(int i=0; i<comNum.length; i++) {
				for(int j=0; j<comNum.length; j++) {
					if(myNum[i] == comNum[j] && i == j) {
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
					if(myNum[i] == comNum[j] && i != j) {
						ball++;
					}
				}
			}
			return ball;
		}
			
			
	
	public static void main(String[] args) {
		/* ArrayEx01 에서 했던 야구게임을
		 * 메서드 분리 후 실행.
		 * */
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		for(int i=0; i<comNum.length; i++) {
			randomArray(comNum);
			System.out.println(Arrays.toString(comNum));
			
		}
		
		
	}
	
	
	/* 1. 중복확인 메서드
	 *    배열과, 랜덤값을 입력받아 배열에 랜덤값이 "존재"하면 true / 없으면 false 를 리턴
	 */
	
	/* 2. 배열을 입력받아 랜덤으로 값이 중복되지 않게(중복확인 메서드 활용) 채우기.
	 * 	  랜덤값은 (0~9)
	 */	  
	
	/* 3. 스트라이크 개수를 카운트하는 메서드
	 * comNum, myNum 배열을 입력받아 번호와 위치가 일치하면 count 값을 리턴하는 메서드
	 * 
	 * 4. 볼개수 개수를 카운트하는 메서드
	 * comNum, myNum 배열을 입력받아 번호만 일치하면 count 값을 리턴하는 메서드
	 */

}
