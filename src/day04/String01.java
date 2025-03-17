package day04;

public class String01 {

	public static void main(String[] args) {
		/*
		 * String class : 문자열을 다루기 위한 클래스 => 기본 자료형 X
		 * class : 해당 클래스 안에 여러가지 기능을 담고 있음. 
		 * class : 클래스명 객체명 = new 클래스명();
		 * String str = new String();
		 * 
		 */
		
//		String str = new String(); // 클래스 기본 사용법
//		str = "12345";
//		System.out.println(str);
		String str2 = "123456789"; // 일반 자료형처럼 사용
		System.out.println();
		
		// str == str2 // 각 객체의 연결된 주소가 같은지 물어보는 것과 동인
		// String 은 배열처럼 작용
		
		
		// length : 전체 글자수 (글자의 길이)
		
		System.out.println("--length--");
		System.out.println(str2.length());
		
		//charAt(index) : index 번지에 있는 문자 반환 char
		
		System.out.println("--charAt()--");
		System.out.println(str2.charAt(2));
		
		//subString : 문자열 추출
		System.out.println("--subString()--");
		System.out.println(str2.substring(2)); // 2번지 부터 끝까지 // 3456789
		System.out.println(str2.substring(2, 4)); // subString(from, to) // from 부터 to 까지(to 미포함) // 34
		
		// str.compareTo(str2) : str, str2를 비교하여 사전순으로 앞이면 -1, 같으면 0, 뒤면 1
		// 문자 정렬시 사용
		System.out.println("--compareTo()--");
		System.out.println("a".compareTo("b")); // -1
		System.out.println("apple".compareTo("banana")); // -1
		
		// equals() : 두 문자가 같은지 비교(대소문자구분)
		// 같으면 true, 다르면 false
		// * 참조자료형 == 로 비교 불가 *
		
		System.out.println("--equals()--");
		System.out.println("apple".equals("apple")); // true
		System.out.println("Hello".equals("Java")); // false
		
		// indexOf() : 문자의 위치(index)를 찾아주는 기능.
		// 찾는 문자가 없으면 -1 을 return
		
		System.out.println("--indexOf()--");
		System.out.println("Hello world!!".indexOf("o")); // 4
		System.out.println("Hello world!!".indexOf("f")); // -1
		System.out.println("Hello world!!".lastIndexOf("o")); // 7, 뒤에서 부터 위치한 o 의 값을 integer 로 return
		
		// substring indexOf를 사용하여 id 를 추출
		
		System.out.println("--substring + indexOf--");
		String email = "abcabc12345@naver.com";
		
		System.out.println(email.substring(0, email.indexOf("@"))); // 0부터 @ 전까지 문자 추출
		
		// 주민등록번호의 생년월일만 추출
		
		String regNumber = "990101-1234567";
		
		System.out.println(regNumber.substring(0, regNumber.indexOf("-"))); // 0부터 - 전까지 문자 추출
		
		// contains : 해당 문자를 포함하고 있는지
		
		System.out.println("--contains--");
		String file = "HelloWorldJava.html";
		System.out.println(file.contains("Java")); // 포함하면 true, 포함하지 않으면 false
		
		// concat : 이어붙이기 ("+" 연결연산자와 같은 의미) // DB, JS에서 사용한다./ (JAVA에서는 연결연산자가 있어 사용안한다.)
		
		System.out.println("--concat--");
		System.out.println("abc".concat("def"));
		
		
	}

}
