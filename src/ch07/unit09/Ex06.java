package ch07.unit09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex06 {

	public static void main(String[] args) {
		// 문자열 <-> LocalDate
		
		DateTimeFormatter dtf;
		LocalDate localDate;
		String s;
		
		// 문자열 => LocalDate
		localDate = LocalDate.parse("2025-05-05");		//	- 형식밖에 안됨
		System.out.println(localDate);					// 2025-05-05
		
		// localDate = LocalDate.parse("2025/05/05");	// 런타임오류
		
		// Formatter를 사용하는 방법1
		dtf = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2025-05-05");
		System.out.println(localDate);
		
		// Formatter를 사용하는 방법2_ .ofPattern 넣기
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");	// .ofPattern  패턴 만드는것
		localDate = LocalDate.parse("2025/05/05", dtf);
		System.out.println(localDate);
		
		dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");	// .ofPattern  패턴 만드는것
		localDate = LocalDate.parse("2025.05.05", dtf);
		System.out.println(localDate);
		System.out.println();
		
		
		// LocalDate -> 문자열 ---
		localDate = LocalDate.now();
		s = localDate.toString();
		System.out.println(s); 	// yyyy-MM-dd
		
		dtf = DateTimeFormatter.ofPattern("yyy/MM/dd");
		s = localDate.format(dtf);
		System.out.println(s);	// yyyy/MM/dd
		
		dtf = DateTimeFormatter.ofPattern("yyyMMdd");
		s = localDate.format(dtf);
		System.out.println(s);	//yyyyMMdd
		
		
		LocalDateTime ldt = LocalDateTime.now();
		dtf = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		s = ldt.format(dtf);
		System.out.println(s);	// yyyy년 MM월 dd일 오전 h시 m분
	
	}

}
