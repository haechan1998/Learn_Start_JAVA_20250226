package day12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		// LocalDateTime 클래스
		LocalDateTime today = LocalDateTime.now(); // 오늘날짜 리턴.
		System.out.println(today);
		System.out.println(today.getYear());
		// LocalDate > 날짜 / LocalTime > 시간.
		
		// 객체를 스트링으로 형변환.
		
		// substring 을 사용하여 출력...
		String date = today.toString();
		System.out.println("날짜 "+date.substring(0, date.indexOf("T")));
		System.out.println("시간 "+date.substring(date.indexOf("T")+1, date.indexOf(".")));
		
		// DateTimeFormatter.ofPattern(String)을 이용해서 출력...
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		// 생일 출력...
		LocalDateTime birth = LocalDateTime.of(1998, 8, 24, 04, 30);
		System.out.println(birth);
		System.out.println(dtf.format(birth));
		
	}

}
