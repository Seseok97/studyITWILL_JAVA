package class_;

public class Test3_0222_class_2 {

	public static void main(String[] args) {
		Account2 acc = new Account2();
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 10000;
		
		acc.showAccountInfo();
		acc.deposit(30000);
		System.out.println("---------------------");
		
		acc.showAccountInfo();
		acc.withdraw(20000);
		System.out.println("---------------------");
		
		acc.showAccountInfo();
		acc.withdraw(60000);
		System.out.println("---------------------");
		
		acc.showAccountInfo();
		acc.withdraw(20000);
		System.out.println("---------------------");
		
		acc.showAccountInfo();
		acc.deposit(10000);
		System.out.println("---------------------");
		
		acc.showAccountInfo();
		
		System.out.println("---------------------");
		//출금결과 출력(return 활용)
		int withdrawMoney = acc.withdraw(10000);
		System.out.println("출금된 금액: "+withdrawMoney+"원"); // 출금가능 !
		System.out.println("---------------------");
		withdrawMoney = acc.withdraw(20000);
		System.out.println("출금된 금액: "+withdrawMoney+"원"); // 출금불가 !
		
		

	}//main() method end

}//Test3_0222_class_2 class end

/*은행계좌(Account) 클래스 정의
 * [멤버변수 선언]
 * > 계좌번호(accountNo, String)
 * > 예금주명(ownerName, String)
 * > 현재잔고(balance,int)
 * 
 * [메서드 정의]
 * -계좌번호, 예금주명, 현재잔고를 출력하는 showAccountInfo() 메서드
 * ex) 계좌번호: 111-1111-111
 * 	   예금주명: 홍길동
 *     현재잔고: 10000원
 *     
 * -입급기능을 수행하는 deposit() 메서드
 *  > 입급할 금액(amount,int)을 전달받아 현재잔고(balance)에 누적한 후, 입금된 금액과 입금 후 현재잔고를 출력.
 *  ex) " 입금하신 금액: nnnn원"
 *  	" 입금 후 현재 잔고: nnnn원"
 *  > 리턴값 없음.
 *  
 *  -출금기능을 수행하는 withdraw() 메서드
 *  > 출금할 금액(amount,int)을 전달받아 현재잔고(balance)에서 차감한 후, 출금한 금액고 출금 후 현재 잔고를 출력.
 *  ex) " 출금하신 금액: nnnn원"
 *  	" 출금 후 현재 잔고: nnnn원"
 *  > 단, 출금기능을 수행하기 전 현재잔고와 출금할 금액을 비교하여, 현재잔고가 출금할 금액보다 적을 경우,
 *  > 출금을 수행하지 않고 다음 문장을 출력한다.
 *  ex) "잔고가 부족하여 출금이 불가능합니다."
 *  	"출금할 금액: nnnn원, 현재잔고: nnnn원."
 *  > 리턴값이 존재한다.
 */

class Account2{
	String accountNo;
	String ownerName;
	int balance;
	
	//계좌상황
	public void showAccountInfo() {
		System.out.println("계좌번호: "+accountNo);
		System.out.println("예금주명: "+ownerName);
		System.out.println("현재잔고: "+balance+"원");
	}//showAccountInfo() method end
	
	//입금기능
	public void deposit(int ammount) {
		balance += ammount;
		System.out.println("입금하신 금액: "+ammount+"원");
		System.out.println("입금 후 현재 잔고: "+balance+"원");
	}//deposit() method end
	
	//출금기능
	public int withdraw(int ammount) {
		if(balance<ammount) {
			System.out.println("잔고가 부족하여 출금이 불가능합니다.");
			System.out.println("출금할 금액: "+ammount+"원, "+"현재잔고: "+balance+"원");
//			return ammount;
			return 0;
		}else {
			balance -= ammount;
			System.out.println("출금하신 금액: "+ammount+"원");
			System.out.println("출금 후 현재 잔고: "+balance+"원");
//			return 0;
			return ammount; // return문이 없으면 ... ATM에서 출금 했는데 돈이 안나오는 ,, 그런거다!!
		}
		//강사님이 이 메소드에는 출금요청금액 리턴값을 넣으라고 하셨는데, 이유를 모르겠다 ..;; >> 나중에 쓸 일이 있다고 하시네 !!
		// return을 왜 넣었냐 !! >> ATM 생각하면 됨, 출금 요청 했으니까 돈을 뱉어야한다 !!
		// ammount를 리턴해서 현금으로 뽑거나 다른사람 계좌로 날라가는것을 상정한것 !! >> 이렇게 생각하면 반대로 해야하는 이유 알게될것 !
		
		//return문이 if문 안에 있는 경우, 어차피 메서드가 종료된다. > else문이 필수가 아님 !!

	}//withdraw() method end
}//Account2 class end
