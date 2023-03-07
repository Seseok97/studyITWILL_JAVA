package overloading_;

public class Test2_2_0307_overloading {

	public static void main(String[] args) {
		/*
		 * 1.Account() 생성자 호출시 다음과같이 초기화 후 출력
		 * - 계좌번호 : 111-111-111
		 * 	 예금주명 : 홍길동
		 *   현재잔고 : 0원
		 *   
		 * 2.Account(String) 생성자 호출 시 다음과 같이 초기화 후 출력
		 * - 계좌번호 : 입력받은 계좌번호
		 * 	 예금주명 : 홍길동
		 *   현재잔고 : 0원  
		 *   
		 * 3.Account(String,String) 생성자 호출 시 다음과 같이 초기화 후 출력
		 * - 계좌번호 : 입력받은 계좌번호
		 * 	 예금주명 : 입력받은 예금주명
		 *   현재잔고 : 0원  
		 *   
		 * 4.Account(String,String,int) 생성자 호출 시 다음과 같이 초기화 후 출력
		 * - 계좌번호 : 입력받은 계좌번호
		 * 	 예금주명 : 입력받은 계좌번호
		 *   현재잔고 : 입력받은 현재 잔고 
		 */
		//1
		Account a1 = new Account();
		a1.showAccountInfo();	
		//2
		Account a2 = new Account("222-2222-222");
		a2.showAccountInfo();
		//3
		Account a3 = new Account("333-3333-333","이순신");
		a3.showAccountInfo();
		//4
		Account a4 = new Account("444-4444-4444","강감찬",10000);
		a4.showAccountInfo();

	}

}//public class end

class Account{
	String accountNo;
	String ownerName;
	int balance;
	public Account() {
		System.out.println("기본생성자");
	}
	public Account(String newAccountNo) {
		accountNo = newAccountNo;
		ownerName = "홍길동";
		balance = 0;
	}
	public Account(String newAccountNo, String newOwnerName) {
		accountNo = newAccountNo;
		ownerName = newOwnerName;
		balance = 0;
	}
		public Account(String newAccountNo, String newOwnerName, int newBalance ) {
			accountNo = newAccountNo;
			ownerName = newOwnerName;
			balance = newBalance;
		}
		public void showAccountInfo() {
			System.out.println("계좌번호: " + accountNo);
			System.out.println("예금주명: " + ownerName);
			System.out.println("현재잔고: " + balance);
		}

}
