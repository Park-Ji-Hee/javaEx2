package ch06.unit04;

public class Ex11_singleton {

	public static void main(String[] args) {
		// Test11 t = new Test11();	//컴파일 오류 -> 생성자를 private로 만들어씩 때문

		Test11 t1 = Test11.getInstance();
		int n = t1.add();
		System.out.println(n);	//	11
		
		Test11 t2 = Test11.getInstance();
		n = t2.add();
		System.out.println(n);	//	12
		
		System.out.println(t1 == t2);	//	true : 동일객체
		System.out.println(t1);	// 해쉬코드 똑같음
		System.out.println(t2);	// ch06.unit04.Test11@5305068a
	}

}

// singleton 패턴 : 하나의 객체만 생성되는 패턴/구조  (스프링 : 싱글턴패턴임)
class Test11 {
	private static Test11 tt = null;
	
	private int n = 10;
	
	// 생성자가 private이면 외부에서 객체를 생성할 수 없다.
	private Test11() {		
	}
	
	// 클레스 메소드
	public static Test11 getInstance() {
		if(tt == null) {
			tt = new Test11();
		}
		return tt;
	}
	
	public int add() {
		return ++n;
	}
	
	public int sub() {
		return --n;
	}
	
} 