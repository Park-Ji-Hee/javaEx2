package ch06.unit03;

public class Ex02 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		int s;
		String result;
		char c;
		
		s = t.sum(100);
		System.out.println("결과 : " + s);
		
		s = 10;
		result = t.isEven(s) ? "짝수" : "홀수";
		System.out.println(s + ":" + result);
		
		c = 'c';
		System.out.println(c + " -> " + t.upper(c));
		
		System.out.println(t.isLeapYear(2025));	// false
		System.out.println(t.isLeapYear(2024) ? "윤년" : "평년");	// 윤년
		
		System.out.println(t.max(5, 7));
		
		t.gugudan(3);
		
		System.out.println(t.grade(88));
		System.out.println(t.hakjeom(85));
	}

}

class Test2 {
	// 1~n 까지 합구하기
	public int sum(int n) {
		int s = 0;
		
		for(int i = 0 ; i <= n ; i ++) {
			s += i;
		}
		
		return s;
	}
	
	// n이 짝수이면 true, 홀수이면 false를 반환하는 메소드
	public boolean isEven(int n) {
		return n % 2 == 0;	
	}
	
	// 문자가 소문자 이면 true, 그렇지 않으면 false
	public boolean isLower(char c) {
		return c >= 'a' && c <= 'z';
	}
	
	public boolean isUpper(char c) {
		return c >= 'A' && c <= 'Z';
	}	
	
	// 소문자이면 대문자로 변환
	public char upper(char c) {
		// 방법1
		// return c >= 'a' && c <= 'z' ? (char) (c-32) : c; // 아스키 코드 소문자-대문자 차이 = 32
		// 방법2
		// return c >= 'a' && c <= 'z' ? c-=32 : c; // 형변환 안해도 됨
		return isLower(c) ? (char) (c-32) : c; 	// 위에 짠 함수 이용할 수 있음
		
	}
	
	// 윤년 판단
	 public boolean isLeapYear(int y) {
		 return y%4==0 && y%100!=0 || y%400==0;
	 }
	 
	 // 두 정수 중 큰 수 구하기
	 public int max(int a, int b) { // 자료형 생략 불가능->무조건 다 써줘야함
		 return a >b ? a : b;
	 }
	 
	 // n단의 구구단 출력. 단n이 1~9사이가 아니면 출력하지 않음
	 // void : 메소드 실행 후 값을 되돌려 받을 필요가 없는 경우 사용
	 public void gugudan(int n) {
		 if(n < 1 || n > 9) {
			 return;
		 }
		 
		 System.out.println("** " + n + "단 **");
		 for(int i = 1; i <=9; i++) {
			 System.out.printf("%d * %d = %2d\n", n, i, n*i);
		 }
		 
		 return;	// void 인 경우 return;은 생략 가능
	 }
	 
	 // 정수에 따른 평점(95~100:4.5; 90~94:4.0 .. 59~0:0)
	 public double grade(int n) {
		 double g;
		 
		 if(n >= 95) g = 4.5;
		else if (n >= 90) g = 4.0;
		else if (n >= 85) g = 3.5;
		else if (n >= 80) g = 3.0;
		else if (n >= 75) g = 2.5;
		else if (n >= 70) g = 2.0;
		else if (n >= 65) g = 1.5;
		else if (n >= 60) g = 1.0;
		else if (n >= 60) g = 0.5;
		else g = 0.0;
		return g;
		 
//		    double[] scores = {95, 90, 85, 80, 75, 70, 65, 60};
//		    double[] grades = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0};
//
//		    for (int i = 0; i < scores.length; i++) {
//		        if (n >= scores[i]) return grades[i];
//		    }
//		    return 0.0;
		 
	 }
		// 학점
		public String hakjeom(int n) {
			String s = null;
			
			switch(n/10) {
			case 10: 
			case 9: s= "A"; break;
			case 8: s= "B"; break;
			case 7: s= "C"; break;
			case 6: s= "D"; break;
			default: s = "F"; break;
			}
			
			return s;
		
	 }
	
}
