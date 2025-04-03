package ch07.unit05;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		// 2026년 12월 25일로 날짜 변경
		cal.set(2026, 12-1, 25); 	// 넣을 때는 1 빼고 가져올 때는 1개 더하기
		System.out.printf("%tF %tA\n", cal, cal);

		
		// 2026년 5월 33일로 변경
		cal.set(2026, 5-1, 33); 	// 날짜 넘긴거 다음달로 넘겨서 알려줌
		System.out.printf("%tF %tA\n", cal, cal);
		
		
		// 2023년 2월 30일로 변경
		cal.set(Calendar. YEAR, 2023); 	
		cal.set(Calendar. MONTH, 2-1);
		cal.set(Calendar. DATE, 30);	// 2023-03-02 목요일
		System.out.printf("%tF %tA\n", cal, cal);
		
		
		// 홍길동은 2025년 3월 20일에 여자친구를 만났다. 100일 후는?
		cal.set(2025,  3-1, 20);
		cal.add(Calendar.DATE , 100);
		System.out.printf("%tF %tA\n", cal, cal); // 2025-06-28 토요일
		
	}

}
