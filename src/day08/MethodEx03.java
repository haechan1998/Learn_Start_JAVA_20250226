package day08;

import java.util.Scanner;

public class MethodEx03 {

	public static void main(String[] args) {
		/* 로또번호 생성
		 * 
		 * 1~45까지중 6개 번호 생성.
		 * 당첨번호와 사용자 번호 비교해서 등수 추출.
		 * 
		 * 1등 : 6개 모두 일치
		 * 2등 : 5개 일치 + 보너스
		 * 3등 : 5개 일치
		 * 4등 : 4개 일치
		 * 5등 : 3개 일치
		 * */
		int lotto[] = new int[7]; // 당첨번호
		int user[] = new int[6]; // 사용자 로또 번호
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			arrayLotto(lotto, 45, 1);
			lottoPrint(user, lotto);
			for(int i=0; i<user.length; i++) {
				user[i]=sc.nextInt();
			}
			lottoPrint(user, lotto);
			elseraking(user, lotto);
//			int rank = raking(user, lotto);
//			if(rank == -9999) {
//				System.out.println("오류");
//			}else {
//				if(rank == -1) {
//					System.out.println("꽝");
//				}else {
//					System.out.println(rank + "등");
//				}
//			}
			
			
		}
		
		
	}
	/* 원하는 범위만큼 랜덤수를 추출해주는 메서드
	 * (int)(Math.random()*개수)+시작값;
	 * 1~10 50~100
	 * start
	 * */
	
	/* 랜덤 배열 채우기(1~45)까지
	 * 배열을 받아서 랜덤 수를 채우는 메서드 // 배열 정렬도 해야된다.
	 */ 
	public static void arrayLotto(int[] arr, int end, int start) {
		int tmp = 0;
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*end)+start;
			if(isContain(arr, random)) {
				i--;
			}else {
				arr[i] = random;
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	/* 중복 확인 메서드
	 * 배열과, 랜덤값을 입력받아
	 * 배열에 랜덤값이 존재하면 true / 없으면 false 를 리턴
	 * */
	public static boolean isContain(int[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	/* 배열 출력 메서드
	 * user : 1 2 3 4 5 6
	 * 당첨번호 : 1 2 3 4 5 6 [7]
	 * */
	public static void lottoPrint(int[] user, int[] lotto) {
		System.out.print("user : ");
		for(int i=0; i<user.length; i++) {
			System.out.print(user[i]+" ");
		}
		System.out.println();
		System.out.print("당첨번호 : ");
		for(int i=0; i<lotto.length-1; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.print("["+(lotto[lotto.length-1])+"]");
		System.out.println();
	}
	
	/* 등수 확인 메서드
	 * 당첨번호와 사용자번호 비교 등수 추출
	 * 1등 : 6개 모두 일치
	 * 2등 : 5개 일치 + 보너스
	 * 3등 : 5개 일치
	 * 4등 : 4개 일치
	 * 5등 : 3개 일치
	 * 나머지 꽝
	 * 
	 * */
	
	public static int raking(int[] user, int[] lotto) {
		// lotto / user 배열의 위치가 바뀌어서 들어온다면...
		if(lotto.length <= user.length) {
			return -9999;
		}
		int cnt=0; // 일치 개수 카운트 (보너스는 제외)
		for(int i=0; i<user.length; i++) {
			if(isContain(user, lotto[i])) {
				cnt++;
			}
		}
		
		int b = lotto[lotto.length-1]; // 보너스 번호 추출
		
		switch(cnt) {
		case 6: return 1;
		case 5: // 보너스 번호 일치 여부 확인.
			if(isContain(user, b)) {
				return 2;
			}else {
				return 3;
			}
		case 4: return 4;
		case 3: return 5;
		default :
			return -1;
			
		}
		
	}
	// 보너스 번호가 당첨에 영향이 있을경우...
	
		public static void elseraking(int[] user, int[] lotto) {
			
			int count = 0;
			for(int i=0; i<user.length; i++) {
				if(isContain(user, lotto[i])) { // 보너스 번호가 2등을 제외하고도 당첨에 영향이 있는줄 알았다........
					count++;
				}
			}
			switch(count) {
			
			case 0: case 1: case 2:
				System.out.println("꽝");
				break;
			case 3:
				System.out.println("5등");
				break;
			case 4:
				System.out.println("4등");
				break;
			case 5:
				
				if(isContain(user, lotto[lotto.length-1])) {
					System.out.println("2등");
				}else {
					System.out.println("3등");
				}
				break;
			case 6:
					System.out.println("1등");
				
				break;
			}
			
		
		
			
		
		
		
	}
}
