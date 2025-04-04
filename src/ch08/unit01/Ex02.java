package ch08.unit01;

public class Ex02 {

	public static void main(String[] args) {

		Demo2 obj = new Demo2();
		
		obj.disp();
	}
}

class Test2 {
	int a = 10;
	int b = 20;
	
	public void print() {
		// System.out.println(this.a+ ":" + this.b);	
		System.out.println(a+ ":" + b);	//this 생략 가능
	}
}

class Demo2 extends Test2 {
	int b = 100;
	int x = 200;
	int y = 300;
	
	public void disp( ) {
		System.out.println("a: " + a); // 10, super 클래스의 a 필드
		System.out.println("this.a: " + this.a); // 10, super 클래스의 a 필드
		System.out.println("super.a: " + super.a); // 10, super 클래스의 a 필드

		System.out.println("b: " + b); // 100, 자신 클래스의 b
		System.out.println("super.b: " + super.b); // 20, 자신 클래스의 b	
		// 이름이 동일한 부모거를 가지고 싶으면 super 넣기, 동일한 이름이 아닐경우 super 생략가능
		// this도 지역변수랑 매개변수랑 동일한 경우에 작성해야됨 => super 비슷
		
		System.out.println("x :" + x);	// 200, 지역변수
		System.out.println("this.x: " + this.x); 	// 200, 자신의 클래스의 x필드
		
		System.out.println("y :" + y); // 300, 자신 클래스의 y 필드
		System.out.println("this.y :" + this.y); // 300, 자신 클래스의 y 필드
		 
	}
}


