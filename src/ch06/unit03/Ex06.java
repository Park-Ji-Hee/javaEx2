package ch06.unit03;

// 파라미터 전달법
public class Ex06 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		
		int a = 10; // 지역변수
		t.sub1(a);  // a:실매개변수 
		System.out.println("a:" + a); // 10 => 변수 이름만 동일하지 다른 값임
		
		
		t.sub2(t); // 객체를 인수로 전달(주소전달)
		System.out.println("t.x:" + t.x); // 20 => 값을 보낸 것이 아닌 주소(리퍼런스)를 보냄 == 참조함 => 
	
		int []num = {1,2,3,4,5};
		System.out.println("num[1] : " + num[1]);	// 2
		t.sub3(num); // // 배열명(=주소)를 인수로 전달(주소전달)
		System.out.println("sub() 메소드 호출 후 num[1] : " + num[1]);	// 12
	}

}


class Test6 {
	int x = 10;
	
	// call by value : 실매개변수(보내는인수)와 형식매개변수(받는인수)가 기억공간을 따로 확보
	public void sub1(int a) { // a:형식매개변수
		a += 5; 
	}
	
	// call by reference : 객체
	public void sub2(Test6 obj) {
		obj.x += 10;
	}
	
	public void sub3(int[] a) {
		a[1] += 10;
		
	}
	
	
	
	
}