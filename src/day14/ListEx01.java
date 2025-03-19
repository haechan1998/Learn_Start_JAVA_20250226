package day14;

import java.util.ArrayList;
import java.util.Arrays;

public class ListEx01 {

	public static void main(String[] args) {
		/* 숫자를 입력 받아서 입력받은 숫자로 list 를 구성
		 * 전체 출력 => 전체 합계 출력
		 * 
		 * ex) 입력 > 45,89,78,85,96,85,74,52,36 enter
		 * 각각의 값을 숫자로 변환 후 list 에 추가
		 * 그리고 합계를 출력
		 * - 점수가 70점 이상인 인원 수 : 5명.
		 * */
		String score = "45,89,78,58,96,85,74,52,36";
		ArrayList<Integer> list = new ArrayList<>();
		String[] str = score.split(",");
		
		System.out.println(Arrays.toString(str));
		 
		int sum = 0;
		int index = 0;
		System.out.println("점수가 70점 이상인 값");
		for(int i=0; i<str.length; i++) { // list 의 list.size() 와 str의 length 값은 같다.
			int num = Integer.parseInt(str[i]); // int 로 변환 후 list 에 add()
			list.add(i, num);
			
			sum += list.get(i); // 합계
			if(list.get(i)>=70) {
				index++;
				System.out.print(list.get(i) + " ");
				
			}
		}
		System.out.println();
		System.out.println("인원 수 : "+ index);
		System.out.println("합계 : " + sum);
		
		
	}

}
