package ch07.unit04;

public class Quize03 {

	public static void main(String[] args) {
		int n = 100;
		
		String s;
		for(int i =1; i <=n; i++) {
			s = Integer.toString(i);
			// s = s.replaceAll("(3|6|9)", "*");
			s = s.replaceAll("[369]", "*");
			
			if(s.indexOf("*") != -1) {
				s = s.replaceAll("\\d", "");
			}
			
			System.out.printf("%5s", s);
			
			if(i%10 == 0) {
				System.out.println();
			}
		}
		
		

	}

}
