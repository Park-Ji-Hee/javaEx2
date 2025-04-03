package ch07.unit09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex01_LocalDate {

	public static void main(String[] args) {
		// 시스템 날짜
		String s;
		
		LocalDate today = LocalDate.now();
		System.out.println("현재 날짜 : " + today);
		
		s = today.toString();
		System.out.println(s);

		// 날짜 설정(2025-05-05)
		LocalDate targetDate = LocalDate.of(2025, 5, 5); 	// 월에 1 안빼도 됨		
		// LocalDate targetDate = LocalDate.of(2025, 2, 29); 	// 런타임 에러, 캘린더처럼 달이 넘어가지 않음
		// LocalDate targetDate = LocalDate.of(2025, 5, 32); 	// 런타임 에러, 캘린더처럼 달이 넘어가지 않음
		System.out.println("설정날짜 : " + targetDate);

		// 시스템 시간
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간 : " + currTime);
		
		// 시간 설정
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("설정 시간 : " + targetTime); 			// 06:30 / 초와 나노초는 0이면 출력 안됨 ***
		
		// 시스템날짜와 시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);								// 2025-04-03T17:03:47.803905500 ***
			
		String []ss = now.toString().split("T");
		System.out.println(ss[0] + " " + ss[1]);
		
		// 날짜와 시간 설정
		LocalDateTime targetDateTime = LocalDateTime.of(2025, 5,5,10,10,0,0);
		System.out.println("설정날짜및시간 : " + targetDateTime);	// 초와 나노초는 0이면 출력안됨
	}

}
