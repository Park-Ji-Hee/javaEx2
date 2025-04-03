package ch07.unit05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07 {

	public static void main(String[] args) {
		// 1999.04.03 ~ 오늘까지 날수 계산하기
		Date today = new Date();
		
		String birth = "1999-04-03";
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");	// 날짜계산을 위해
		
		try {
			Date birthDate = sdf.parse(birth);
			
			// 두 날짜 사이의 간격
			long dif = (today.getTime() - birthDate.getTime()) / (1000 * 60 * 60 * 24);	// 차이 단위 : 밀리세컨즈 // getTime 단위는 밀리세컨즈
							// (1000 * 60 * 60 * 24) => 1000 : 초 변환 / 60 : 분, 시간 변환 / 24 : 날짜 변환
			System.out.println("날수 : " + dif);
			
		} catch (Exception e) {
			e.printStackTrace(); 	// 오류가 있을 때 error 메시지 출력
		}
		

	}

}
