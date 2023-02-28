package array_;

public class Ex_0228_acmo {

	public static void main(String[] args) {
		// 은행계좌(Account) 클래스 인스턴스 (acc) 생성
		Account acc = new Account();
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
		acc.setBalance(100000);
		
		System.out.println("계좌번호: "+ acc.getAccountNo());
		System.out.println("이름: "+ acc.getOwnerName());
		System.out.println("잔고: "+ acc.getBalance());
		

	}//main() method end

}//Ex_0228_array class end

// Account 클래스 생성
// accountNo, ownerName, balance 멤버변수 접근제한자 private 설정
// Getter/Setter 생성 > 단축키: alt+shift+s > r
// 

class Account{
	private String accountNo;
	private String ownerName;
	private int balance;
	
	//단축키로 작성한 코드
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
	
	//.this의 경우, 아직은 어려운 개념이라 차차 알려 주신다고 했다.
	// 지금은 멤버변수와 로컬변수를 구분해 주는 정도라고 생각하면 됨 !!
	
	//직접 타이핑하여 작성한 코드	
//	public String getAccountNo() {
//		return accountNo;
//	}//getAccountNo() method end
//	
//	public String getOwnerName() {
//		return ownerName;
//	}//getOwnerName() method end
//	
//	public int getBalance() {
//		return balance;
//	}//getBalance() method end
//	
//	public void setAccountNo(String newNo) {
//		accountNo = newNo;
//	}//setAccountNo() method end
//	
//	public void setOwnerName(String newName) {
//		ownerName = newName;
//	}//setOwnerName() method end
//	
//	public void setBalance(int newBal) {
//		balance = newBal;
//	}//setBalance() method end
	
	
}// Account class end
