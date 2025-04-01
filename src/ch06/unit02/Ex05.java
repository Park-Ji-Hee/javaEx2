package ch06.unit02;

public class Ex05 {

	public static void main(String[] args) {
		/*
		Test5 t;
		t.a = 10; //컴파일 오류.(초기화 하지 않음)
		*/
		
		/*
		Test5 t = null;	// null로 초기화 => 메모리 할당 안함(메모리 할당 방법 == new Test();)
		t.a = 10; 		// 런타임 오류. => NullPointerException
		*/
		
		/*
		Tst5 t = new Test5();
		t.a = 10;
		t.disp();	// == System.out.println(t.a + ":"  + t.b); // 10:0
		*/
		
		Test5 []tt = new Test5[5];
			// Test5 객체를 5개 저장할 수 있는 배열
			// 각각의 객체가 메모리를 할당 받은 것은 아님
			// 클래스의 객체 메모리 할당은 생성자를 호출할 경우만 가능
			// Test5 t1 = null, t2 = null, t3 = null, t4 = null, t5 = null;과 유사
		
		/*
		tt[0].a = 10;	// 런타임 오류 => 객체 : 생성자가 있어야만 만들어짐
		tt[0].disp();
		*/
		
		// 배열의 각 요소에 메모리 할당
		for(int i=0; i <tt.length; i++) {
			tt[i] = new Test5();
		}
		
		tt[0].a = 10;
		tt[0].disp();
		
		
		
		
	}

}


class Test5 {
	int a;
	int b;
	
	public void disp() {
		System.out.println(a + ":" + b);
	}
		
}