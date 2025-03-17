package day06;

import java.util.Arrays;

public class Ex01Plus {

	public static void main(String[] args) {
		/* 성적표
		 * 
		 * 몇명의 성적을 출력할지 결정 > 3
		 * 이름	국어	영어	수학	총점	평균	석차 syso 출력
		 * null 89	90	85	00	00	0
		 * null 89	90	85	00	00	0
		 * null 89	90	85	00	00	0
		 * "\t" : tap 
		 * */
		System.out.print("이름\t국어\t영어\t수학\t총점\t평균\t순위");
		System.out.println();
		// 점수표
		int[][] score = new int[3][3];
		// 합계 배열
		int[] scoreSum = new int[3];
		// 평균 배열
		// 순위 배열
		int[] ranking = new int[3];
		
		
		// score의 합계 / 평균 을 저장하고 배열 복사해서 scoreSumCopy에 저장할 for 문
		String[] name = {"홍길동", "김영희", "김철수"};
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%s", name[i]);
			int sum = 0;
			double avg = 0;
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = (int)(Math.random()*50)+50; // 50~100 랜덤수
				sum += score[i][j]; // sum에 score[0][j], score[1][j] ... 합계가 저장된다.
				avg = (double)sum/3;
				System.out.printf("\t%d",score[i][j]);
			}
			scoreSum[i] = sum; // 배열 scoreSum 에 합계를 저장.
			
			System.out.printf("\t%d    %5.1f%n", scoreSum[i], avg);
		}
		for(int i = 0; i < score.length; i++) {
			int count = 1;
			for(int j = 0; j < score[i].length; j++) {
				if(scoreSum[i] < scoreSum[j]) {
					count++;
				}
				ranking[i]=count;
			}
			System.out.printf("%d", ranking[i]); // 순위를 출력문 뒤에 쓰고싶을경우 싹 갈아서 정리해야한다.
		}
		
		
		
		
		
	}
}