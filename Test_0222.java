package class_;

public class Test_0222 {

	public static void main(String[] args) {
		/*
		 * Account 인스턴스(acc) 생성 후 다음과 같이 초기화 및 출력
		 * ------------------------------------------------------
		 * 계좌번호: 111-1111-111
		 * 예금주명: 홍길동
		 * 현재잔고: 10000원
		 * 
		 * */
		Account acc= new Account();
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 10000;
		System.out.println("계좌번호: "+acc.accountNo);
		System.out.println("예금주명: "+acc.ownerName);
		System.out.println("현재잔고: "+acc.balance+"원");
		
		acc.useMoney(3000);		// useMoney() method는 내가 그냥 해본거 !!
		System.out.println("현재잔고: "+acc.balance+"원");
		

	}//main() method end

}//Test_0222 class end

/*
 * 은행계좌(Account) 클래스 정의
 * 멤버변수 - 계좌번호(accountNo, String)
 * 			- 예금주명(ownerName, String)
 * 			- 현재잔고(balance, int)
 * */

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public void useMoney(int money) {
		balance -= money;
		System.out.println("사용하신 금액: "+ money +"원, "+ "현재 잔고: "+ balance+"원");
	}//useMoney() method end
	
}//Account class end
