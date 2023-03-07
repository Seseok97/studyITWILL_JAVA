package constructor;

public class Test_0307_constructor {

	public static void main(String[] args) {
		//Account 클래스의 인스턴스 생성
		Account acc = new Account();
		
		
		//기존 방식
//		acc.accountNo = "111-1111-111";
//		acc.ownerName = "홍길동";
//		acc.balance = 0;

	}

}//public class end

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		System.out.println("Account() 생성자 호출됨");
		
		//인스턴스 생성시 기본값으로 가져야할 데이터를 멤버변수에 저장
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
		
		//인스턴스 생성 시 초기화 후 계좌정보 출력을 위한 showAccountInfo() 메서드 호출
		showAccountInfo();
	}//Account() method end
	
	//계좌정보를 출력하는 showAccountInfo() 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호: "+accountNo);
		System.out.println("예금주명: "+ownerName);
		System.out.println("잔액: "+balance+"원");
	}//showAccountInfo() method end
	
}//Account class end
