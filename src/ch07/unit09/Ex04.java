package ch07.unit09;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ex04 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println("현재 : " + today);		// 현재 : 2025-04-04T09:08:43.341483200

		// 년도 변경
		LocalDateTime localDate2 = today.withYear(2026);
		
		// 월변경
		localDate2 = localDate2.withMonth(5);
		
		// 일변경
		localDate2 = localDate2.withDayOfMonth(5);
		System.out.println(localDate2);				// 2026-05-05T09:08:43.341483200
		
		// 직접 변경
		LocalDateTime localDate3 = today
				.withYear(2025)
				.withMonth(6)
				.withDayOfMonth(10)
				.withHour(10)
				.withMinute(15)
				.withSecond(10);
		System.out.println("변경 후 : " + localDate3);	// 변경 후 : 2025-06-10T10:15:10.341483200
		
		
		// 상대 변경
		// 이번해의 첫일
		localDate3 = today.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번해의 첫일 : " + localDate3);
		
		// 이번해의 마지막일
		localDate3 = today.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번해의 마지막일 : " + localDate3);
		
		// 다음해의 첫일
		localDate3 = today.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음해의 첫일 : " + localDate3);
		
		// 이달의 첫일
		localDate3 = today.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이달의 첫일 : " + localDate3);
		
		// 이달의 첫 월요일
		localDate3 = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이달의 첫 월요일 : " + localDate3);
		
		// 돌아오는 월요일
		localDate3 = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일 : " + localDate3);
		
		localDate3 = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일(오늘포함) : " + localDate3);
		
		// 지난 월요일
		localDate3 = today.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일 : " + localDate3);
		
		localDate3 = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println("지난 월요일(오늘포함) : " + localDate3);
	}

}
