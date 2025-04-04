package ch08.unit02;

public class Ex01_override {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.disp();
		obj.write();
	}
}


class Test1 {
	int a= 10;
	
	public void disp() {
		System.out.println("a: " + a);
	}
}

/*
	- 메소드 override
	: 상위 클래스의 메소드를 하위 클래스에서 재정의
	: override는 상관관계에서만 가능 한다.
	: 메소드의 시그너처가 동일해야 한다.
		 ==> 메서드 쓰여있는 부분이 동일해야함(ex. public void disp())
	: 접근 제어자는 크거나 같아야 한다.
	: 예외는 뺄수는 있지만 추가할수는 없다.
	: 상위 클래스의 메소드를 재정의(override)하면 상위 클래스의 메소드는 숨는다.
	: @Override 애노테이션
	  메소드가 override 규칙에 맞는지 검증하며 맞지 않으면 에러가 발생
*/


class Demo1 extends Test1 {
	int x = 100;
	
	public void write() {
		// disp()	  // 자신의 disp() 호출
		super.disp(); // super 클래스의 disp() 호출 == 아버지의 disp() 호출
	}
	
	// override
	@Override
	public void disp() { // 아버지가 만든 메서드를 재정의함, 상속관계여야 함
		System.out.println("a: "+ a + ", x:" + x);
	}
	
	// overloading (매개변수의 형이나 갯수가 다른것)
	public void disp(int n) {
		System.out.println("n : " + n);
	}
}
