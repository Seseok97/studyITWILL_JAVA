package this_;

public class Test2_0307_this {

	public static void main(String[] args) {
		
		System.out.println("---------------------------------------");
		Account2 acc1 = new Account2();
		System.out.println("계좌번호: "+acc1.accountNo);
		System.out.println("예금주명: "+acc1.ownerName);
		System.out.println("현재잔고: "+acc1.balance+"원");
		
		System.out.println("---------------------------------------");
		Account2 acc2 = new Account2("222-2222-222");
		System.out.println("계좌번호: "+acc2.accountNo);
		System.out.println("예금주명: "+acc2.ownerName);
		System.out.println("현재잔고: "+acc2.balance+"원");
		
		System.out.println("---------------------------------------");
		Account2 acc3 = new Account2("333-3333-333","이순신");
		System.out.println("계좌번호: "+acc3.accountNo);
		System.out.println("예금주명: "+acc3.ownerName);
		System.out.println("현재잔고: "+acc3.balance+"원");
		
		System.out.println("---------------------------------------");
		Account2 acc4 = new Account2("444-4444-444","강감찬",50000);
		System.out.println("계좌번호: "+acc4.accountNo);
		System.out.println("예금주명: "+acc4.ownerName);
		System.out.println("현재잔고: "+acc4.balance+"원");
		
		System.out.println("---------------------------------------");

	}

}//public class end

/*
 * Account 클래스(계좌번호, 예금주명, 현재잔고 정의)
 * > 기본생성자 : 계좌번호 
 * 				/ 계좌번호, 예금주명 
 * 				/ 계좌번호, 예금주명, 현재잔고
 */

class Account2{
	String accountNo;
	String ownerName;
	int balance;
	public Account2() {
		this("111-1111-111","홍길동",0);
	}
	public Account2(String newAccountNo) {
		this(newAccountNo,"홍길동",0);
	}
	public Account2(String newAccountNo,String newOwnerName) {
		this(newAccountNo,newOwnerName,0);
	}
	public Account2(String newAccountNo,String newOwnerName,int newBalance) {
		accountNo =newAccountNo;
		ownerName =newOwnerName;
		balance = newBalance;
	}
}//Account2 class end