package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx01Answer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int comNum[] = new int [3];
		int myNum[] = new int[3];
		//comNum를 중복없이 생성(랜덤)
		for(int i=0; i<comNum.length; i++) {
			int r = (int)(Math.random()*9)+1;
			comNum[i] = r;
			//배열에 r이 존재하는지 확인하기 위한 반복
			for(int j=0; j<i; j++) {
				if(comNum[i] == comNum[j]) {
					i--;
					break;
				}
			}
					
		}
		System.out.println(Arrays.toString(comNum));
		System.out.println();
		System.out.println("----------");
		
		while(true) {
			// mynum 입력
			System.out.println("숫자입력 >");
			// 숫자를 하나의 문자로 받아 myNum에 나누어 저장(숫자로)
			String myStr = scan.next();
			String[] myStrTemp = myStr.split(""); // 한글자씩 배열로 저장
			
			// 숫자로 변환해서 저장
			for(int i = 0; i<myNum.length; i++) {
				myNum[i] = Integer.parseInt(myStrTemp[i]);
			}
			
			// 숫자 비교
			int stk = 0;
			int ball = 0;
			
			for(int i=0; i<comNum.length; i++) {
				for(int j=0; j<myNum.length; j++) {
					if(comNum[i] == myNum[j] && i == j) {
						//값도 같고, 위치도 같다면..
						stk++;
					}else if(comNum[i] == myNum[j] && i != j) {
						//값만 같다면..
						ball++;
					}
				}
			}
			
			// 출력
			if(stk==0 && ball==0) {
				System.out.println("out");
			}else {
				System.out.println(">"+stk+"s"+ball+"b");
			}
			
			//종료조건
			if(stk == 3) {
				System.out.println("성공! 종료");
				break;
			}
		}
		scan.close();
	}

}
