package day17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class File04 {

	public static void main(String[] args) throws IOException {
		/* test.txt 파일을 읽어들여
		 * map 에 저장
		 * 명단 출력 / 합계 / 평균 출력
		 * 읽어 들이는 파일은 모두 String
		 * 점수는 => int => 계산이 가능.
		 * Integer.parseInt()
		 * 
		 * */
		String[] arr = new String[7];
		BufferedReader br = new BufferedReader(new FileReader("D:\\web_java_chc\\memo\\text.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		int n = 0;
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			System.out.println(line);
			arr[n] = line;
			n++;
		}
		br.close();
		
		System.out.println("--------------");
		int sum = 0;
		double avg = 0;
		for(int i=0; i<arr.length; i++) {
			map.put(arr[i].substring(0, 3), Integer.parseInt(arr[i].substring(4, 6)));
		}
		
		System.out.println(map);
		for(String key : map.keySet()) {
			sum += map.get(key);
			avg = sum / map.size();
		}
		System.out.println("합계" + sum + "/" + "평균" + avg );
		
		
		
		
	}

}
