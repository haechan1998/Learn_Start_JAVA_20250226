package day12;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		/* 날짜, 시간 클래스.
		 * Date 클래스 => Depercated(비권장) / Calendar 클래스 / LocalDateTime 클래스
		 * 
		 * Calendar : 추상클래스 => 객체를 생성할 수 없음.
		 * new 키워드로 객체를 생성할 수 없음.
		 * 싱글턴. > 하나 생성해서 계속 돌려서 쓴다. (싱글턴 패턴) 
		 * 
		 * getInstance() 메서드를 이용하여 객체를 얻어옴. 
		 * */
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		
		// Calendar rightNow = Calendar.getInstance();

		Calendar c = Calendar.getInstance();
		System.out.println(c);
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		// 월
		System.out.println(c.get(Calendar.MONTH)+1); // 해당 값에 +1을 해줘야한다.
		// 일
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		// 요일 1(일) ~ 7(토)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		String d1 = "";
		// 2025-03-14(금)
		int day = c.get(Calendar.DAY_OF_WEEK);
		switch(day) {
		case 1: d1="(일)"; break;
		case 2: d1="(월)"; break;
		case 3: d1="(화)"; break;
		case 4: d1="(수)"; break;
		case 5: d1="(목)"; break;
		case 6: d1="(금)"; break;
		case 7: d1="(토)"; break;
		default : break;
		}
		System.out.print(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH)+1) + "-" + c.get(Calendar.DAY_OF_MONTH) + d1 );
		
		System.out.println();
		
		int hour = c.get(Calendar.HOUR);
		int mimute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int ampm = c.get(Calendar.AM_PM);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	
		
	}

}
