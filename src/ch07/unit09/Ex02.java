package ch07.unit09;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex02 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);								// 2025-04-03T17:16:20.758279500
		
		int y = now.getYear();
		int m = now.getMonthValue();
		int d = now.getDayOfMonth();
		DayOfWeek week = now.getDayOfWeek();
		String w = week.toString();	// 영어요일
		int h = now.getHour();
		int mi = now.getMinute();
		int s = now.getSecond();
		int n = now.getNano();
		
		System.out.printf("%4d-%02d-%02d %s\n", y, m, d, w);	// 2025-04-03 THURSDAY
		System.out.printf("%4d:%02d:%02d.%s\n", y, m, d, w);	// 2025:04:03.THURSDAY
		System.out.println();
		
		LocalDate nowDate = now.toLocalDate();					// 올해는 평년입니다.
		if(nowDate.isLeapYear()) {
			System.out.println("올해는 윤년입니다.");
		} else {
			System.out.println("올해는 평년입니다.");
		}
		
		LocalDate date = LocalDate.of(2023, 3, 10);
		int diff = nowDate.compareTo(date);
			// 년도가 다르면 년도차이, 년도가 같으면 월차이, 월이 같으면 일차이
		System.out.println("차이 : " + diff);						// 차이 : 2
		
	}

}
