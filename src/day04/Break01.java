package day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		/* break; : 반복문을 빠져나오게 하는 키워드
		 * - 반복문에서 조건문(if)을 동반하여 조건이 맞을 때 반복문을
		 * 벗어나게 하는 역할
		 * 
		 * for, while 
		 * 
		 * */
		
		// 1부터 10까지 출력
		// for 문에서 무한루프를 생성, break 로 빠져나옴
		for(int i=1; ; i++) {
			System.out.println(i+" ");
			if(i==10) {
				break;
			}
		}
		
		// 한글자를 입력받아 출력 (반복해서 출력)
		// y 를 입력 받으면 종료
		
		System.out.println("--------------------");
		Scanner sc = new Scanner(System.in);
		
		do {
			char ch = sc.next().charAt(0);
			System.out.println(ch);
			if(ch == 'y') {
				System.out.println("종료");
				break;
			}
			
		}while(true);
		
		sc.close();
		
		// 중첩 반복문 경우 break; 는 나를 감싸고 있는 가장 안쪽 for 문만 벗이남.
		
		int i = 0, j = 0, k = 0;
		
		a: for(;;) {
			j++;
			for(;;) {
				k++;
				for(;;) {
					i++;
					System.out.println("i : "+i);
					System.out.println("k : "+k);
					System.out.println("j : "+j);
					if(i==10) {
						break a;
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
