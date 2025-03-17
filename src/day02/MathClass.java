package day02;

import java.nio.file.spi.FileSystemProvider;

public class MathClass {

	public static void main(String[] args) {
		// 수학관련 기능이 있는 클래스
		// Math.method > 그 안에 있는 기능을 의미
		// Math.round(반올림) / Math.ceil(올림) / Math.floor(버림) >>> 소수 자리수는 무조건 0
		
		double num = 3.141592;
		
		//long roundNum = Math.round(num);
		//long roundNum = Math.round(num); // return long
		int roundNum = (int)Math.round(num); // return int 
		System.out.println(roundNum);

		//double ceilNum = Math.ceil(num); // return double
		int ceilNum = (int)Math.ceil(num); // 올림
		System.out.println(ceilNum);
		
		int floorNum = (int)Math.floor(num); // 반올림
		System.out.println(floorNum);
		
		//Math.max(최대값) / Math.min(최소값
		int a, b, c, d;
		
		a = 10;
		b = 20;
		c = 17;
		d = 15;
		
		int max = Math.max(Math.max(Math.max(a,b),c),d); // 비교정수가 3개 이상일경우 Math.max(Math.max(변수, 변수),변수); > 이런식으로 연장해서 사용한다.
		
		System.out.println(max);
		
		System.out.println("------------------------------");
		
		int result = Math.max(a,b);
		
		System.out.println(result);
		
		System.out.println("-----------random-------------");
		
		int random = (int)(Math.random() * 10) + 1; // 1 ~ 10 까지 랜덤한 수 출력
		//Math.random은 자동으로 (실수)로 형변환 하기 때문에 (int)가 짝꿍이다.
		
		System.out.println(random);
		
		System.out.println((int)(Math.random() * 6 + 1)); // 1 ~ 6 까지 랜덤한 수 출력	
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
