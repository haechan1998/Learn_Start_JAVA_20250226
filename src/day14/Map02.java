package day14;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 Scanner 로 입력받아 map 에 저장
		 * 출력 / 합계 / 평균
		 * 종료 키워드가 나올때까지 반복 (1 계속 / 0 종료)
		 * 국어 78
		 * 수학 99
		 * 0 종료
		 * 합계,평균 출력
		 * map.size() : 전체 개수
		 * */
		
		
		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int done = 1, sum = 0;
		double avg = 0;
		i:while(true) {
			System.out.println("1 = 계속 / 0 = 종료");
			done = sc.nextInt();
			if(done == 0) {
				break;
			}else if(done == 1){
				
				System.out.println("과목명 >");
				String subName = sc.next();
				System.out.println("점수 >");
				int subScore = sc.nextInt();
				if(subScore > 100 || subScore < 0) {
					System.out.println("다시 입력하세요.");
					continue i;
				}
				
				map.put(subName, subScore); // map 에 과목명, 점수 저장.
				for(String key : map.keySet()) {
					System.out.println(key+"="+map.get(key));
				}
				
				sum += map.get(subName); // 점수 합계 저장
				avg = sum/(double)map.size(); // 평균 구하기.
			}else {
				System.out.println("다시 입력하세요.");
			}
			
		}
		System.out.println("총점:"+sum+"/ 평균:"+avg);
		
		sc.close();
		
	}

}
