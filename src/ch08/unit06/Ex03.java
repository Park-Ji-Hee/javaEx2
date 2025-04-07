package ch08.unit06;

public class Ex03 {

	public static void main(String[] args) {
		Demo3 t = new Test3();	// Demo3가 test의 할아버지 급임 -> up-casting 가능
		t.print();
	}

}

interface Demo3 {
	public void print();
	public void disp();
}

// 추상클래스는 인터페이스의 모든 메소드를 재정의하지 않아도 된다.
abstract class DemoImpl3 implements Demo3 { // 인터페이스는 아버지 개념으로 보면됨
	@Override
	public void print() {
		System.out.println("print...");
	}
}

class Test3 extends DemoImpl3 {

	@Override
	public void disp() {
		System.out.println("disp...");
	}
}
