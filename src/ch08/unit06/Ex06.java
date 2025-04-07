package ch08.unit06;

public class Ex06 {

	public static void main(String[] args) {
		int  n = 10;
		int s = Demo6.sum(n);
		System.out.println(s);

		Demo6 obj = new DempIml6();
		n = obj.max(10, 5);
		obj.wirte(n);
	}
}

interface Demo6 {
	public void wirte(final int n);
	
	//static 메소드(객체 생성 상관없이 불러올 수 있음) : JDK 8 부터 가능
	// 인터페이스를 이용하여 바로 접근 가능
	public static int sum(final int n) {
		int s = 0;
		for(int i = 1; i <= n; i++) {
			s += i;
		}		
		return s;
	}
	
	// default 키워드를 이요하여 메서드 구현 : JDK 8부터 가능
	// 구현 클래스에서 재정의 가능
	public default int max(int m, int n) {
		return m >n ? m: n;
	}
}


class DempIml6 implements Demo6 {

	@Override
	public void wirte(final int n) {
		System.out.println("결과 : " + n);
	}	
}