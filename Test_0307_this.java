package this_;

public class Test_0307_this {

	public static void main(String[] args) {
		Account acc = new Account("111-1111-111","홍길동",10000);
		acc.showAccountInfo();
		

	}

}//public class end

/*
 * Account 클래스 생성
 * 멤버변수: accountNo, ownerName, balance 선언 (private 접근제한자 사용)
 * 생성자: 파라미터 3개를 전달받아 초기화하는 생성자 정의
 * Getter/Setter 정의
 * showAccountInfo() 메서드 정의 > 계좌번호, 예금주명, 현재잔고 출력
 */


class Account{
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
//		super(); // 아직 안배워서 주석처리
		// 인스턴스 변수명 == 로컬변수명 이기 때문에, 인스턴스변수명 앞에  this로 구별시켜준다!!!!
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}//Account() method end
	
	//Getter / Setter
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
	//getter / setter end
	
	public void showAccountInfo() {
		System.out.println("계좌번호: "+ accountNo);
		System.out.println("예금주명: "+ ownerName);
		System.out.println("현재잔고: "+ balance);
	}//showAccountInfo() method end
	
	
}// Account class end
