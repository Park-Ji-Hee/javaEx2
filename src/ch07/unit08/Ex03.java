package ch07.unit08;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String[] ss = new String[] {"서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종"};
		
		// 복사하기
		 String[] ss2 = Arrays.copyOf(ss, ss.length);
		 							//웑본, 길이
		 System.out.println(Arrays.toString(ss2));
		System.out.println(ss == ss2);	// false / 주소가 다르기 때문, 값만 옮겨준거임
		
		String[] ss3 = Arrays.copyOfRange(ss, 1, 4);
					// 원본, from, to-1
		System.out.println(Arrays.toString(ss3));
				// [부산, 대구, 인천]
		
		// System.arraycopy()가 Arrays.copy.Of() 보다 성능이 더 좋음
		String[] ss4 = new String[ss.length];
		System.arraycopy(ss, 0, ss4, 0, ss.length);
		System.out.println(Arrays.toString(ss4));
	}
}
