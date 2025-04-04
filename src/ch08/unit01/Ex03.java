package ch08.unit01;

// 생성자 안만든 버전 (Ex04는 생성자 만든 버전)
public class Ex03 {

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		
		obj.disp();

	}

}

class Test3 {
	int a = 10;
	
	public Test3() {
		System.out.println("Test3 생성자...");
	}
	
	public void print() {
		System.out.println(a);
	}
	
}

class Demo3 extends Test3 {
	int x = 100;
	
	/*
	// 생성자를 만들지 않으면 다음의 디폴트 생성자가 컴파일할때 만들어진다.
		public Demo3() {
			super();	// 상위클래스의 생성자 몸체를 호출
		}
	*/
	
	public void disp() {
		System.out.println(a + "," + x);
	}
}

