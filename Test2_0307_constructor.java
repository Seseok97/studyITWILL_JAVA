package constructor;

public class Test2_0307_constructor {

	public static void main(String[] args) {
		// 은행계좌(Account) 클래스의 인스턴스(acc) 생성
		Account acc = new Account("111-1111-111","홍길동",10000);
		acc.showAccountInfo();
		Account acc2 = new Account("222-2222-222","홍진호홍진호",22222);
		acc2.showAccountInfo();

	}//main() method end

}///public class end

class Account{
	String accountNo;
	String ownerName;
	int balance;
	public Account(String newAccountNo, String newOwnerName, int newBalance) {
		accountNo = newAccountNo;
		ownerName = newOwnerName;
		balance = newBalance;
	}//Account() method end
	
	public void showAccountInfo() {
		System.out.println(accountNo);
		System.out.println(ownerName);
		System.out.println(balance);
	}//showAccountInfo() method end
	
	
}//Accunt class end
