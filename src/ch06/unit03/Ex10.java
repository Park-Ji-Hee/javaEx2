package ch06.unit03;

public class Ex10 {

	public static void main(String[] args) {
		Test10 t = new Test10();
		
		t.write(5);

	}

}


// STACK : LIFO(last in first out) 구조
// 재귀호출(recursion) : 재귀호출은 종료 조건을 주지 않으면 StackOverflowErr가 발생
class Test10 {
	public void write(int n) { // n은 스택메모리에 저장
		if(n>1) {
			write(n-1); // 재귀호출: 자기가 자기를 호출
		}
		
		System.out.printf("%5d", n);
	}
}


