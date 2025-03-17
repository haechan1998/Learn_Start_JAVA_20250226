package day05;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 폴더에 있는 파일 찾기.
		 * 
		 * 파일명을 저장하고 있는 배열이 주어졌을 때
		 * 검색어를 입력하면 해당 검색어를 포함하는 파일을 출력
		 * 만약 검색결과가 없으면 => "검색결과가 없습니다." 출력
		 * 대소문자 구분없이 /contains 활용
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		String str = ""; 
		int count = 0;
		boolean a = true; // boolean 을 이용해서 true / false 로 구분하기
				
		String[] fileName = {"이것이자바다.java", "java의 정석.java"
				, "Array.txt", "array.java", "String Method.txt"
				, "Array method.jpg", "method.png", "java Method.java"}; // 8개의 배열
		
		System.out.print("파일명을 입력해주세요 >");
		String scan = sc.nextLine();
		System.out.println();
			for(int i = 0; i < fileName.length; i++) {
				str = fileName[i];
				
				if(str.toLowerCase().contains(scan) == true) {
					System.out.println(str);
					count++; // for 문을 한번도 타지 못했을경우 결과 없음 출력
					a = false; // for 문을 탔을경우 a가 false로 변환
				}
			}if(count == 0) {
				System.out.println("검색결과가 없습니다."); // 한번도 타지 못했을때.
			}if(a == true) { // a 가 for 문을 한번도 타지 못했을경우 true
				System.out.println("검색결과가 없습니다.");
			}
		
			// CRUD
			/* Create (생성)
			 * Read (읽기 검색)
			 * Update (수정)
			 * Delete (삭제)
			 * */
			
		sc.close();
		
	}

}
