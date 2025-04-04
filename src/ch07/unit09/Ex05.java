package ch07.unit09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex05 {

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2025, 3, 1, 9, 0, 0);
		LocalDateTime end = LocalDateTime.of(2025, 7, 1, 18, 0, 0);
		
		// 날짜 및 시간 비교
		if(start.isBefore(end)) {	// before : start < end
			System.out.println("진행중..");
		} else if (start.isEqual(end)) {
			System.out.println("종료합니다..");
		} else if (start.isAfter(end)) {
			System.out.println("종료했습니다.");
		}
		
		
		// 종료까지 남은 시간
		System.out.println("\n종료까지 남은 시간");
		long y = start.until(end, ChronoUnit.YEARS);
		long m = start.until(end, ChronoUnit.MONTHS);
		long d = start.until(end, ChronoUnit.DAYS);
		long h = start.until(end, ChronoUnit.HOURS);
		long mi = start.until(end, ChronoUnit.MINUTES);
		long s = start.until(end, ChronoUnit.SECONDS);
		
		System.out.println("남은해 : " + y);
		System.out.println("남은월 : " + m);
		System.out.println("남은일 : " + d);
		System.out.println("남은시간 : " + h);
		System.out.println("남은분 : " + mi);
		System.out.println("남은초 : " + s);
		
		LocalDate stateDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		System.out.println("\n남은 기간...");
		Period p = Period.between(stateDate, endDate);
		int y1 = p.getYears();	// 2025-2025
		int m1 = p.getMonths();	// 7-3
		int d1 = p.getDays();	// 1-1
		System.out.println("년도 : " + y1);
		System.out.println("월 : " + m1);
		System.out.println("일 : " + d1);
		
		
	}

}
