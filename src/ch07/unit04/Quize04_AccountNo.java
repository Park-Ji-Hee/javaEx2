package ch07.unit04;

// 은행 계좌 번호 만들기
public class Quize04_AccountNo {

	public static void main(String[] args) {
		String s;
		Bank obj = new Bank();
		
		s= obj.generateAccountNo();
		System.out.println(s);	// 020-08-0000171
		
		s= obj.generateAccountNo();
		System.out.println(s);	// 020-08-0000172
		
		s= obj.generateAccountNo();
		System.out.println(s);	// 020-08-0000173
		
	}

}

class Bank {
	private String accountNo = "020-08-0000170";
	
	public String generateAccountNo() {
		
		// 쪼개기
		String s1 = accountNo.substring(0, accountNo.lastIndexOf("-")+1);
		// 020-08-
		String s2 = accountNo.substring(accountNo.lastIndexOf("-")+1);
		// 0000170
		
		
		// 숫자로 전환하기
		int n = Integer.parseInt(s2) + 1;
		
		
		// 남는자리 0으로 채우기
		accountNo = s1 + String.format("%07d", n);
		
		return accountNo;
		
	}
}
