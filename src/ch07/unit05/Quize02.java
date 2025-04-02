package ch07.unit05;

import java.util.Calendar;
import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 생년월일을 입력 받아 나이 구하기
		// 생년월일은 2004-10-10, 2004.10.10, 2004/10/10 형식으로 입력 가능
		
		String birth;
		
		do {
			System.out.print("생년월일 ? ");
			birth = sc.next();
			
			birth = birth.replaceAll("(\\-|]].|\\/)", "");
		} while(! birth.matches("^\\d{8}$"));
		
		
		int a = toAge(birth);
		System.out.println("나이는 " + a + " 입니다.");
		
		int a2 = toAge2(birth);
		System.out.println("나이는 " + a + " 입니다.");
		
		sc.close();
	}
	
	public static int toAge(String birth) {
		int age = 0;
		
		int y = Integer.parseInt(birth.substring(0, 4));
		int m = Integer.parseInt(birth.substring(4, 6));
		int d = Integer.parseInt(birth.substring(6));
		
		Calendar cal = Calendar.getInstance();
		int ty = cal.get(Calendar.YEAR);
		int tm = cal.get(Calendar.MONTH) + 1;
		int td = cal.get(Calendar.DATE);
		
		
		age = ty - y;
		if(m > tm || (m== tm && d >td)) {
			age--;
		}
		
		
//		birth = birth.replaceAll("(\\-|]].|\\/)", "");
//		Calendar cal = Calendar.getInstance();
//		
//		int y = Integer.parseInt(birth.substring(0,4));
//		age = cal.get(Calendar.YEAR) - y;
//		
//		// 생일이 현재와 같은 달이거나 더 늦은 달일 때
//		
//		int m1 = Integer.parseInt(birth.substring(5,6));
//		int m2 = cal.get(Calendar.MONTH);
//		
//		int d1 = Integer.parseInt(birth.substring(7,8));
//		int d2 = cal.get(Calendar.DATE);
//		
//		if(d1 > d2 || m1 > m2) {
//			age--;
//		}
//		
		return age;
	}
	
	
	public static int toAge2(String birth) {
		int age = 0;
		birth = birth.replaceAll("(\\-|]].|\\/)", "");
		
		Calendar today = Calendar.getInstance();
		String todayMonthDate = String.format("%02d%02d", today.get(Calendar.MONTH)+1, today.get(Calendar.DATE));
		
		int y = Integer.parseInt(birth.substring(0, 4));
		age = today.get(Calendar.YEAR) - y;
		
		if(birth.substring(4).compareTo(todayMonthDate) > 0) {
			age--;
		}
		
		return age;
	}
	

}
