package day04;

public class StringEx02 {

	public static void main(String[] args) {
		
		// file > 파일명.확장자
		// 파일명과 확장자로 분리하여 출력
		// 확장자가 java 면 "자바파일입니다." 출력
		// 아닐경우 "기타파일입니다." 출력
		
		// ex
		
		// contains 를 이용한 비교
		
		String file = "자바의정석.java";
		
		System.out.println("이름 : " + file);
		System.out.println("파일명 : " + file.substring(0, file.indexOf(".")));
		System.out.println("확장자명 : " + file.substring(file.indexOf(".")+1));
		
		
		if(file.contains(".java") == true) {
			System.out.println("자바파일입니다.");
		}else {
			System.out.println("기타파일입니다.");
		}
		
		// equals 를 이용한 비교
		
		String containsJava = file.substring(file.indexOf(".")+1);
		String java = "java";
		
		if(containsJava.equals(java) == true) {
			System.out.println("자바파일");
		}else {
			System.out.println("기타파일");
		}
		
		
	}

}
