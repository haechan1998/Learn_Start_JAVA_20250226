package day06;

import java.text.DecimalFormat;

public class MultiArrayEx01 {

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
		System.out.print("이름"+"\t국어"+"\t영어"+"\t수학"+"\t총점"+"\t평균"+"\t순위");
		System.out.println();
		int tmp = 0;
		// 상단배열
		String[] head = {"이름","국어","영어","수학","총점","평균"+"순위"};
		
		// 점수배열
		int[][] arr = {
				{95, 90, 78},
				{95, 93, 81},
				{22, 100, 94}
		};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++){
				//System.out.print(arr[i][j] + " ");
			}
			//System.out.println();
		}
		// 출력시 printf 로 이름배열, 성적배열, 
		
		// 총점배열
		int[] sum = new int[3];
		for(int i=0; i<sum.length; i++) {
			tmp =0;
			for(int j=0; j<sum.length; j++) {
				tmp += arr[i][j]; 
				sum[i] = tmp;
			}
			//System.out.println(sum[i]); // 합계
		}
		double avgTmp = 0;
		
		// 평균배열 / 소수점 2자리로 맞추기
		double[] avg = new double[3];
		for(int i=0; i<avg.length; i++) {
			avgTmp = sum[i]/3.0;
			avg[i] = avgTmp;
			//System.out.println(avg[i]);
		}
		
		// 이름배열		
		String[] arrName = {"홍길동","김철수","김영희"}; // 0 1 2
		
		// 최종 간판 출력
		int[] ranking = new int[3];
		
		
		
		DecimalFormat df = new DecimalFormat("#.00");
		//System.out.println("=========");
//		System.out.println(arrName[0]+"\t"+arr[0][0]+"\t"
//				+arr[0][1]+"\t"+arr[0][2]+"\t"+sum[0]+"\t"+avg[0]);
		for(int i=0; i<3; i++) {
			System.out.print(arrName[i]+"\t");
			for(int j =0; j<3; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			int rankTmp = 1;
			for(int j = 0; j < ranking.length; j++) {
				if(sum[i] < sum[j]) { // sum[0] > sum[0], sum[0] > sum[1], sum[0] > sum[2]
					// sum[0]의 값이 가장 작은 경우 rankTmp의 값이 변하지않는다 .
					rankTmp++;
				}
				ranking[i] = rankTmp;
			}
			
			System.out.print(sum[i]+"\t"+df.format(avg[i]));
			System.out.print("\t" +ranking[i]);
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
