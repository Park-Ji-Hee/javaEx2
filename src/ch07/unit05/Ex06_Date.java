package ch07.unit05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06_Date {

	public static void main(String[] args) {
		// 컴퓨터 시스템으로 Date 객체 생성
		Date date = new Date();
		System.out.println(date);
			// Thu Apr 03 09:05:56 GMT+09:00 2025
		
		// 1970.01.01 0:0:0.0를 기준으로 밀리초 단위로 환산하여 반환
		long t = date.getTime();
		System.out.println(t);	// 1743639268459

		
		Date date2 = new Date(1743639977944L);
		System.out.println(date2);	// Thu Apr 03 09:26:17 GMT+09:00 2025
		
		// SimpleDateFormat : Date <-> 문자열
		
		// Date를 문자열로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String s = sdf.format(date);
		System.out.println(s);	// 2025년 04월 03일 09:14:28
		
		// 문자열을 Date로 변환
		s = "2025-12-25";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");	// 문자열하고 형식이 일치해야함
		
		
		 try {	// 문제가 있는 코드 예외처리 한는 방법 - > 코드가 죽지 않게 함
			 // 예외를 내포하고 있는 코드
			 Date date3 = sdf2.parse(s);	// 문제가 야기되는 코드 위치 // .parse() : 값을 바꾸는 메소드
			 System.out.println(date3);	// Thu Dec 25 00:00:00 GMT+09:00 2025
			 
			 // s = sdf.format(date3);	// Thu Dec 25 00:00:00 GMT+09:00 2025
			 s = sdf2.format(date3);	// 2025-12-25
			 System.out.println(s);
			 
		} catch (Exception e) { // ParseException위치 인데 이의 아버지인 Exception 그냥 써도 됨
			// 예외가 발생한 경우 실행 할 코드
			e.printStackTrace();
		}
		 
		 
	}

}
