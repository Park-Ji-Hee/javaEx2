package ch07.unit03;

public class Ex02_Long {

	public static void main(String[] args) {
		long a = 10;	// 10d은 int형으로 long로 변환되어 a에 저장
		
		// Long b = 10;	// 컴파일 오류

		Long b = 10L;	// 10L : long형 리터널
		
		// int x = a;	// 컴오류
		int x = (int)a;
		
		// Integer y = (Integer)b;	// 컴오류
		// 클래스는 상하관계만 형변환이 가능하여
		// Integer과 Long는 상하관계가 아니므로 형변환 불가
		
		String s = "123";
		long y = Long.parseLong(s);	// 문자열을 long로
		
		Integer m = 10;
		long n = m;	// 가능
		
		System.out.println(a + ", " + b);
		System.out.println(x);
		System.out.println(m + ", " + n);
	}

}
