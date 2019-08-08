package prob05;

public class Account {
	private String accountNo;
	private int balance;
	public Account(String accountNo) {
//		this 자기 자신을 가르키는 포인터
		this.accountNo = accountNo;
		this.balance=0;
		
		System.out.println(this.accountNo+" 계좌가 개설되었습니다.");
	}
	public void save(int i) {
		//계좌에 입금하는 거 출력
		this.balance=this.balance+i;
		System.out.println(this.accountNo +" 계좌에 "+ i + "만원이 입금되었습니다.");
	}
	public void deposit(int j) {
		this.balance=this.balance-j;
		System.out.println(this.accountNo + " 계좌에"+ j + "만원이 출금되었습니다.");
		
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
