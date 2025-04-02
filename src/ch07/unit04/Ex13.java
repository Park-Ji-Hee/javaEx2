package ch07.unit04;

public class Ex13 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("123456789");
		
		String s = sb.substring(3, 6);
		System.out.println(s); // 456
		
		sb.replace(1, 3, "korea");	// 치환
		System.out.println(sb); 	// 1korea456789
		
		sb.delete(1, 5).replace(1, 3, "23");
		System.out.println(sb); 	// 123456789
		
		

	}

}
