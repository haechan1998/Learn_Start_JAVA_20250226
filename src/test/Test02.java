package test;

public class Test02 {

	public static void main(String[] args) {
		
		//다음 JAVA 언어로 다음 배열 변수 값의 합을 구하는 프로그램을 작성하시오.
		
		int[][] a = {
				{10,20,30},
				{20,30,15},
				{100,110,120}
		};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				sum += a[i][j];
			}
		}
		System.out.println("합계 : " + sum);


	}

}
