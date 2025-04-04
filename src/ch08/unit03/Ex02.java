package ch08.unit03;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 - up-casting
		  : 상위 클래스의 객체가 하위 클래스의 객체를 참조하는 것
		  : up-casting는 언제나 가능
		  : 형 변환을 하지 않아도 된다.
		 - down-casting 
		  : up-casting 한 객체를 다시 원래 객체로 캐스팅하는 것 == 원상태로 돌려주는 것
		  : down-casting 은 up-casting 한 객체만 가능하다.
		  : down-casting 은 반드시 강제 캐스팅을 해야 한다.
		*/
		
		Test2 t= new Demo2();	// 업캐스팅, 언제나 가능
		// t.write();	// 컴파일 오류   / 컴파일-문법만 검사, 업캐스팅을 컴파일 이후에 하기 때문에 컴파일 오류 발생 <== 값을 넣어주기 전에 문법검사를 하기 때문에
		
		t.print(); 	// 업캐스팅한 객체에서 재정의된 메소드는 숨어 버리기 때문에 하위 클래스의 메소드가 호출된다.
		
		Demo2 dm = (Demo2)t; 	// 다운캐스팅, 업한것만 다운가능
								// 반드시 캐스팅 해야함
		dm.write();
		((Demo2)t).write();	//	다운캐스팅해서 Demo2 메소드 호출	/ 연산우선순위가 .이 더 높아서 ()처리를 해야 함
	}
}


class Test2 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a + ":" + b);
	}
	
	public void disp() {
		System.out.println("disp...");
	}
}

class Demo2 extends Test2 {
	int b = 100;
	int c = 200;
	
	@Override
	public void print() {
		System.out.println("a:"+a+",b:"+b+",super.b:"+super.b+",c:"+c);	// a:10,b:100,super.b:20,c:200  / super.b : 아버지b 가져옴
	}
	
	public void write() {
		System.out.println("write...");
	}
	
}
