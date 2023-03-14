package static_;

public class Test_0314_static {

	public static void main(String[] args) {
//		Account acc = new Account();
		// > 생성자호출 불가 > 인스턴스 생성 불가
		
		//acc1
		Account acc = Account.getAcc(); // static 설정이 되어서 사용 가능한 접근 형태.
		// Account 타입의 acc 인스턴스 생성, Account class 안의 getAcc() 메서드 활용 !
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
		acc.setBalance(50000);
		acc.showAccountInfo();
		
		System.out.println("-----------------------");
		
		// acc2
		Account acc2 = Account.getAcc();
		acc2.setAccountNo("222-2222-222");
		acc2.setOwnerName("홍진호");
		acc2.setBalance(20000);
		acc2.showAccountInfo();
		
		System.out.println("-----------------------");
		
		// acc 인스턴스의 값이 바뀌어버림. > class안의 변수 값이 완전히 바뀌었다는 것 !!
		acc.showAccountInfo();
		
	}// main() method end
}// public class end


/*
 * Account clsss
 * > 싱글톤패턴 구현
 * > 멤버변수 : 계좌번호(accountNo), 예금주명(ownerName), 현재잔고(balance)
 * > showAccountInfo() 메서드 정의
 * >> 계좌번호, 예금주명, 현재잔고 출력
 */

class Account{
//	String accountNo;
//	String ownerName;
//	int balance;
	private String accountNo;
	private String ownerName;
	private int balance;
	
	// 생성자 private
	private Account() {}
	
	// private static 인스턴스
	private static Account acc = new Account();
	
	// public static Getter
	public static Account getAcc() {
		return acc;
	}
	
	//정보 출력
	public void showAccountInfo() {
		System.out.println("계좌번호: "+accountNo);
		System.out.println("예금주명: "+ownerName);
		System.out.println("현재잔고: "+balance+"원");
	}
	
	//변수 getter / setter
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}// Account class end