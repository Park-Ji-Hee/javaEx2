package ch08.unit04;

public class Ex01_singleton {

	public static void main(String[] args) {
		// Test1 obj = new Test1(); // 컴파일 오류  / class 안에 private 값 밖에 없는 상태이기 때문에
		
		Test1 obj = Test1.getInstance();
		Test1 obj2 = Test1.getInstance();
		
		if(obj == obj2) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체"); 
		}
		
	}

}

// 멀티 스레드 환경에서는 동기화 하지 않아 인스턴스가 두개 만들어질 수 있다.
class Test1 {
	private static Test1 t;
	
	
	private Test1() {
		
	}
	
	public static Test1 getInstance() {
		if(t == null) {
			t = new Test1();
		}
		
		return t;
	}
 }