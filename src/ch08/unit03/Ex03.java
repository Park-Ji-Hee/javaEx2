package ch08.unit03;

public class Ex03 {

	public static void main(String[] args) {
		Test3 t1 = new Test3();
		Test3 t2 = new Sample3();
		Test3 t3 = new Demo3();
		
		t1.disp();	// Test3의 print...
		t2.disp();	// Sample3의 print... 	// 오버라이드로 재정의 되서어서 아버지꺼 사라짐
		t3.disp();	// Test3의 print...	 	// 자기꺼가 없어서 아버지꺼 불러옴
	}
}

class Test3 {
	public void print() {
		System.out.println("Test3의 print...");
	}
	
	public void disp() {
		// write(); // 컴파일 오류
		print();
	}
}

class Sample3 extends Test3 {
	public void print() {
		System.out.println("Sample3의 print...");
	}
	
	public void write() {
		System.out.println("Sample3의 write...");
	}
}

class Demo3 extends Test3 {
	public void sub() {
		System.out.println("Demo3의 sub...");
	}
}