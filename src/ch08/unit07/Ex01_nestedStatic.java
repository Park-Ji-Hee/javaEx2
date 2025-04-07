package ch08.unit07;

public class Ex01_nestedStatic {

	public static void main(String[] args) {
		Test1.User1 obj = new Test1.User1();
		obj.write();
	}

}

class Test1 {
	int a = 10;
	static int b = 0;
	
	//static 중첩 클래스 / 내부 클래스 안에서는 접근제어자 사용 가능
	// : 외부 클래스의 객체 생성 여부와 상관 없이 객체를 생성하여 사용 가능  => Test1.User1 obj = new Test1.User1();
	// : 컴파일 하면 Test1$User1.class파일이 생성
	static class User1 {
		int x = 100;
		
		public void write() {
			System.out.println("x:" + x + "b:"+b); // b: static이라 객체 생성없이 쓸 수 있음 
			// System.out.println(a); 	// 컴파일 오류	/ 다른 클래스이므로 객체 생성없이 쓸 수 없기 때문
		}
		
		public void sub() {
			Test1 t = new Test1();
			System.out.println(t.a);	// 객체 생성했으므로 쓸 수 있음
		}
	}
	
	public void print() {
		System.out.println("a:"+ a + ", b:" + b);
	}
	
	public static void disp() {
		System.out.println(b);
		// System.out.println(a); // 컴파일 오류
	}
}