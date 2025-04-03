package ch07.unit05;


import java.util.Calendar;
import java.util.Date;

public class Ex08 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.printf("%tF\n", cal);	// 2025-04-03
		
		// Calendar => java.util.Date로 변경
		Date date = cal.getTime();
		System.out.println(date);	// Thu Apr 03 09:45:56 GMT+09:00 2025
		
		// java.util.Date => Calendar
		cal.setTime(date);
		System.out.printf("%tF\n", cal);	// 2025-04-03
		
		
		// java.util.Date => java.sql.Date로 변환
		/*
		  - java.sql.Date
		  	: 데이터베이스에 날짜를 저장하거나 데이터베이스에 저장된 날짜를 가져올 때 사용
		  	: 날짜는 yyyy-MM-dd 형식으로 출력
		  	: JDK 9 부터는 다음의 모듈을 추가해야 사용 가능
		  	  requires java.se;
		  	
		 */
		
		java.sql.Date date2 = new java.sql.Date(date.getTime());	//	클래스명이 동일한 건  import 못함
		System.out.println(date2);
		
		
	}

}
