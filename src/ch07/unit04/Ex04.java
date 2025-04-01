package ch07.unit04;

import java.util.Scanner;

/*
	- 이름을 입력 받아 김씨 인원수를 출력
	- 입력 받은 이름이 end, End, END이면 김씨 인원수를 출력하고 종료
	- 실행 예
		이름 ? 김자바
		이름 ? 나자바
		이름 ? 너자바
		이름 ? 김씨
		이름 ? end
		김씨 : 2
*/

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int count=0;
		
		do {
			System.out.print("이름 ? ");
			s = sc.next();
			
			if(s.startsWith("김")) {
				count++;
			}

		} while(! s.equalsIgnoreCase("end"));
		
		System.out.println("김씨 : " + count);
		
		sc.close();
	}

}
