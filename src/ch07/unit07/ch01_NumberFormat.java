package ch07.unit07;


// 숫자를 문자열로 바꾸는 방법
import java.text.NumberFormat;
import java.util.Locale;

public class ch01_NumberFormat {

	public static void main(String[] args) {
		String s;
		
		// 숫자 => 문자열
		int n = 12345;
		
		s = Integer.toString(n);
		System.out.println(n); 	// 12345
		
		s= String.format("%,d", n);
		System.out.println(s);
		
		s = String.format("%.2f", 12345.56789);
		System.out.println(s); 	// 12345.57
		
		s = String.format(Locale.ITALY, "%.2f", 12345.56789);
		System.out.println(s); 	// 12345.57
		System.out.println();
		
		// 숫자에 대한 포멧
		NumberFormat nf = NumberFormat.getInstance();	// 3자리마다 ,나옴 / 소숫점 이하 기본으로 3자리
		
		// 숫자 => 문자열로
		s = nf.format(12345);
		System.out.println(s); 	// 12,345
		
		s = nf.format(12345.2567); // 소숫점 이하 기본으로 3자리
		System.out.println(s); 	// 12,345.257
		
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(4); 	// 소수점 이하 최대 4자리 / 기본 소수점 3자리 인걸 최대 4자리로 고침
		nf2.setMinimumFractionDigits(2); 	// 소수점 이하 최대 2자리 / 기본 소수점 3자리 인걸 최소 2자리로 고침
		
		s = nf2.format(12345.456789);
		System.out.println(s); 	// 12,456.4568
		
		s = nf2.format(12345);
		System.out.println(s); 	// 12,345.00
		
		s = nf2.format(12345.7);
		System.out.println(s); 	// 12,345.70
		System.out.println();
		
		
		
		// 통화에 대한 서식
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		s = nf3.format(12345);
		System.out.println(s); 	// ₩12,345
		
		//국가별 설정을 미국으로
		// 한국 : Locale.KOREA
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);
		s = nf4.format(12345);
		System.out.println(s); 	// $12,345.00
		
		
		// %에 대한 서식
		NumberFormat nf5 = NumberFormat.getPercentInstance();
		s = nf5.format(0.23);
		System.out.println(s); 	//23%
		
		
	}

}
