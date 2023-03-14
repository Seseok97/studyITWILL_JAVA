package inheritance;

public class Test_0314_inheritance {

	public static void main(String[] args) {
		ItwillBank a = new ItwillBank();
		
		//은행기능
		a.accountNo = "111-1111-111";
		a.ownerName = "홍길동";
		a.balance = 10000;
		
		a.showAccountInfo();
		
		System.out.println("-------------------------------");
		
		a.deposit(30000);
		
		System.out.println("-------------------------------");
		
		a.withdraw(50000);
		
		System.out.println("-------------------------------");
		
		a.withdraw(5000);
		
		System.out.println("-------------------------------");
		
		//보험기능
		a.contract("");
		a.contract("삼성화재생명보험");

	}//main() method end

}//public class end

/*
 * Account 클래스를 상속받는 ItwillBank 클래스 정의
 * - Account의 기본기능 (계좌의 기본 기능)은 그대로 유지
 * - 멤버변수 추가 : 보험명(insureName, String)
 * - 멤버메서드 추가: 보험계약(contract())
 * 		> Parameter : 보험명
 * 		  리턴값 : X
 * 		> 전달받은 보험명을 멤버변수에 저장 후, (XXX 보험 계약 완료!) 출력!
 */

//Parent class
class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println("계좌번호: "+accountNo);
		System.out.println("예금주명: "+ownerName);
		System.out.println("현재잔고: "+balance+"원");
		// 얘를 출금 / 입금에 넣어버리는게 더 나을것같다. 다른 출력문 지워뿌고
	}
	
	public int withdraw(int money) {
		if((balance - money)<0) { // (balance < money) << 이쪽이 좀더 직관적인듯 !
			System.out.println("잔액이 부족합니다! 현재잔고: "+ balance+"원");
			return 0;
			// money = 0;
		}else{
			balance -= money;
			System.out.println("출금금액: "+money+"원");
			System.out.println("현재잔고: "+balance+"원");
			return money;
			//위 리턴 주석처리하면 밖에 빼도 된다.
		}
//		return money
	}// 출금 method end
	
	public void deposit(int money) {
		balance += money;
		System.out.println("입금금액: "+money+"원");
		System.out.println("현재잔고: "+balance+"원");
	}//입금 method end
	
}// Account class end

//Sub class
class ItwillBank extends Account {
	String insureName;
	
	public void contract(String insureName) {
		if(insureName.equals("")) {
			System.out.println("보험명을 입력해주세요.");
		}else {
			this.insureName = insureName;
			System.out.println(insureName+", 보험계약 완료!");
		}
	}
	
}// ItwillBank class end
