package day04;

public class StringEx01 {

	public static void main(String[] args) {

		// regNum의 주민등록번호를 참고하여
		// 생년월일과 성별을 출력

		String regNum = "020101-3234567"; // 1=남, 2=여 , // 3=남, 4=여

		System.out.println("생년월일 :" + regNum.substring(0, regNum.indexOf("-"))); // 주민등록번호의 생년월일 부분 출력
		System.out.println(regNum.charAt(7)); // 주민등록번호의 성별 숫자 출력

//		if (regNum.charAt(7) == '1' || regNum.charAt(7) == '3') {
//			System.out.println("남자");
//
//		} else if (regNum.charAt(7) == '2' || regNum.charAt(7) == '4') {
//			System.out.println("여자");
//
//		} else {
//			System.out.println("다시 확인바람");
//		}
		
		switch(regNum.charAt(7)) {
		
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
			default :
			System.out.println("다시 확인바람");
		}
		
		
		
		
	}

}
