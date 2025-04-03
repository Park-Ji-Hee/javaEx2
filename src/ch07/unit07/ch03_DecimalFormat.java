package ch07.unit07;

import java.text.DecimalFormat;

public class ch03_DecimalFormat {

	public static void main(String[] args) {
		String s;
		// DecimalFormat : 패턴형식으로 숫자를 문자열로 변환
		DecimalFormat df = new DecimalFormat("#,##0"); // # : 숫자가 있으면 숫자가 나오게 함, 공백이 있으면 공백이 나오게 함
		s = df.format(12345.536895);
		System.out.println(s);		// "12,346" 반올림
		
		s = df.format(3); // 3
		System.out.println(s);
		
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		s = df2.format(12345.678);
		System.out.println(s);		// "12,345.68"
		
		s = df2.format(0);
		System.out.println(s);		// 0
		
		s = df2.format(0.5);
		System.out.println(s);		// 0.5	/ 소수점 있으면 나오고, 없으면 안나옴
		
		
		DecimalFormat df3 = new DecimalFormat("0.##");
		s = df3.format(12345.678);
		System.out.println(s);		// 12345.68 / 소수점 최대 2자리
		s = df3.format(0.5);
		System.out.println(s);		// 0.5
		s = df3.format(0.0);
		System.out.println(s);		// 0
		System.out.println();
		
		
		DecimalFormat df4 = new DecimalFormat("#,##0.0#");
		s = df4.format(12345.678);
		System.out.println(s);		// 12,345.68
		s = df4.format(3.0);
		System.out.println(s);		// 3.0
		
		
		DecimalFormat df5 = new DecimalFormat("#,###.0#");
		s = df5.format(0.0);
		System.out.println(s);		// .0  / #은 없으면 글자가 안나오기 때문에 없음
		
		
		DecimalFormat df6 = new DecimalFormat("000.##");
		s = df6.format(1234.4);
		System.out.println(s);		// 1234.4
		s = df6.format(5);
		System.out.println(s);		// 005
		s = df6.format(0.5);
		System.out.println(s);		// 000.5
	}

}
