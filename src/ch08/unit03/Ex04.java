package ch08.unit03;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		Object obj = "korea";	// 업캐스팅		/ object라는 최상위에 string을 넣음 (obeject > String)
		// System.out.println(obj.length()); 	// 컴파일 오류
		int n = ((String)obj).length();	// 다운캐스팅
		System.out.println("길이: "+ n);

		Object n1 = 10;
		Object n2 = 5;
		// Object n3 = n1 + n2;	// 컴파일 오류
		int n3 = (Integer)n1 + (Integer)n2;	// 다운캐스팅		/ obeject > Integer
		System.out.println("결과: " + n3);
		
		// Object[] oo = {"자바", 90, 80, "오라클"};
		// Arrays.sort(oo); 	// 런타임오류, 서로다른 타입은 비교불가
		Object[] oo = {"seoul", "korea", "jeju"};
		Arrays.sort(oo);
		for(Object o : oo) {
			System.out.println(o + " ");
		}
		System.out.println();
	}
}
