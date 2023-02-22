package class_;

public class Test2_0222_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 10000;
		acc.showAccountInfo();

	}//main() method end

}//Test2_0222_class end


/*
 *은행계좌(Account) 클래스 정의
 * 계좌번호 > 111-1111-111
 * 예금주명 > 홍길동
 * 현재잔고 > 10000원
 * 
 * 메서드
 * showAccountInfo()
 * > 리턴값x, 매개변수 x
 * > 계좌번호, 예금주명, 현재잔고를 출력하는 메서드 정의
 * 
 * 	ex)	계좌번호: 111-1111-111
 * 		예금주명: 홍길동
 * 		현재잔고: 10000원
 * */

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println("계좌번호: "+accountNo);
		System.out.println("예금주명: "+ownerName);
		System.out.println("현재잔고: "+balance+"원");
	}//showAccountInfo() method end
	
}//Account class end

