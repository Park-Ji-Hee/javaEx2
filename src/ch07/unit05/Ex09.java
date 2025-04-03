package ch07.unit05;

import com.util.DateUtil;

public class Ex09 {

	public static void main(String[] args) {
		DateUtil util = new DateUtil();
		String s;
		
		// s = "2025-02-29";
		s = "2025-04-03";
		System.out.println(util.isValidDate(s));
		System.out.println(util.isValidDate2(s));
		
		System.out.println(util.toDate(s));
		System.out.println(util.toDayOfWeek(s));
		

	}

}
