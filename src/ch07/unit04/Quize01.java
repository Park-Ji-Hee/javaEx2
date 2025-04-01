package ch07.unit04;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		/*
			Q) 정수를 입력 받아 입력 받은 정수가 몇자리 정수인지 출력
			정수 ? -123
			- 123 : 3자리 정리
		*/
		
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.print("정수 ? ");
		input = sc.nextInt();
		
		String s = input > 0 ? Integer.toString(input) : Integer.toString(input * -1);
		System.out.println(input + " - > " + s.length() + "자리수 정수");
		
		sc.close();
	}

}
