package day04;

public class String02 {

	public static void main(String[] args) {
		/*
		 * String 메서드
		 * 
		 */

		String str = "홍길동~~~!!!";
		String str2 = "";

		// toLowerCase() / toUpperCase() : 대소문자 변환

		System.out.println("--toLowerCase() / toUpperCase()--");

		System.out.println("toLowerCase".toLowerCase()); // 전부 소문자로 변환
		System.out.println("toLowerCase".toUpperCase()); // 전부 대문자로 변환

		// isEmpty() : 값이 비었는지 확인

		System.out.println("--isEmpty()--");
		System.out.println(str.isEmpty()); // false
		System.out.println(str2.isEmpty()); // true

		// trim() : 불필요한 공백제거(다듬기)

		System.out.println("      HelloWorld    ".trim());

		// replace() : 글자를 치환(변환)
		System.out.println("--replace()--");

		String str3 = "apple, banana, orenge";
		System.out.println(str3.replace(",", "/")); // .replace("from", "to") > from 을 to 로 변환

		// split() : 특정값을 기준으로 나누기 => 배열로 리턴

		System.out.println("--split--");

		String[] arr = str3.split(","); // ,를 기준으로 배열에 나누어 담아줌.

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 문자를 숫자로. Integer.parsInt()
		
		String num1 = "1";
		int num2 = Integer.parseInt(num1);
		System.out.println(num2); // integer 1
		
		// 숫자를 문자로. String.valueOf()
		// instanceof : 객체의 형이 일치하는지 체크하는 연산자(클래스 자료형만 가능)
		
		String as = String.valueOf(num2);
		
		System.out.println(as); // String "1"
		System.out.println(as instanceof String); // true, false 로 return
		

	}

}
