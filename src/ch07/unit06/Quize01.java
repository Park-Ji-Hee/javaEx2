package ch07.unit06;

import java.util.Random;
import java.util.Scanner;

/*
	Q) 1~100 사이의 난수를 발생하여 20번 안에 알아 맞추는 게임
	20번 안에 맞추지 못하면 실패했습니다. 출력 후 종료
	- 실행 예 : 발생된 난수가 23 인경우
	
	수 ? 3
	3보다 큰수 입니다.
	
	수 ? 50
	50보다 적은 수 입니다.
	
	수 ? 23
	33번에 성공했습니다.
	
*/

public class Quize01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int com = rnd.nextInt(100) +1;
		int input;
		int count = 0;
		
		do {
			System.out.print("input ? ");
			input = sc.nextInt();
			
			if(com > input) {
				System.out.printf("%d보다 큰 수\n", input);
			} else if (com < input) {
				System.out.printf("%d보다 작은 수\n", input);
			}
			count++;
		} while (input != com && count <20);
		
		System.out.println("com : " + com);
		System.out.println("count : " + count);
		if(input != com) {
			System.out.println("실패 했습니다.");
		}
		
		
//		int count = 0;
//		int a, n = 0;
//
//		
//		 n = rnd.nextInt(100) +1;
//		
//		do {
//			System.out.print("수 ? ");
//			a = sc.nextInt();
//			
//			if(a > n) {
//				System.out.println(a + "보다 큰수 입니다.");
//			} else if (a < n) {
//				System.out.println(a + "보다  작은수 입니다.");
//			}else if(a == n) {
//				System.out.println(count + "번에 성공했습니다.");
//			}
//			
//			if(count > 20) {
//				System.out.println("실패했습니다.");
//				break;
//			}
//			
//			count++;
//			
//		} while (a != n || && count <20);
		
		sc.close();

	}

}
