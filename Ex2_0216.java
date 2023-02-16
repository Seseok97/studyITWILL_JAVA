package method_;

public class Ex2_0216 {

	public static void main(String[] args) {
		// <메서드 정의 기본 문법>
		// [제한자] 리턴타입 메서드명([매개변수선언]){
		//	 		//메서드 호출시 실행할 코드들
		//			[return[리턴값];]
		//	}
		
		// <메서드의 4가지 형태>
		// 1. 파라미터 X, 리턴값 X	>> Ex_0216 클래스에서 다뤘음.
		// 2. 파라미터 X, 리턴값 O	>> Ex_0216 클래스에서 다뤘음.
		// 3. 파라미터 O, 리턴값 X
		// 4. 파라미터 O, 리턴값 O
		
		// 3. 파라미터만 있고, 리턴값은 없는 메서드 호출
		System.out.println("동생아! 돈 줄테니 과자 사먹어라 !!");
		// >> 메서드 호출시 전달할 데이터는 메서드명 뒤의 소괄호 내에 기술.
//		sister_3(); // err
//		sister_3(1000); //메서드 선언할때 (int money), int 데이터타입으로 정하였으니, 여기 괄호에도 데이터타입이 동일하여야 한다 !!
		int myMoney = 1000;
		sister_3(myMoney); // 변수 저장 가능
		
		System.out.println("===================");
		// 4. 파라미터도 있고, 리턴값도 있는 메서드 호출
		System.out.println("동생아 ! 3000원 줄테니 내 과자도 사줘라 !");
		String snack = sister_4(3000);
		System.out.println("동생이 사다준 것은 "+snack+" 이다!!");
		
	}//main() end
	
	// 3. 파라미터만 있고, 리턴값은 없는 메서드 정의
	// >> 파라미터가 있으므로, 메서드 선언부 ()소괄호 안에 외부로부터 호출시 전달받는 데이터를 저장할 변수(매개변수) 선언
	// >> 리턴값은 없으므로, 리턴타입은 void.
	
	public static void sister_3(int money) {
		//파라미터로 선언된 int형 변수 money에 메서드 호출시 전달된 값 저장됨.
		// sister_3(1000) 호출시 int money = 1000 과 동일한 코드로 취급된다.
		System.out.println("오빠가 준 돈은 "+money+"원 이다.");
		// 현재 메서드 내에서는 money변수를 자유롭게 사용할 수 있으나, 메서드를 벗어나면 존재하지않는 변수로 취급된다.
		money -= 500;
		
		if(money>0) {
			//현재 수행중인 메서드를 종료하고 빠져 나가기 위해서는, 특정조건에서 return문이 실행되도록 해야 한다.
			System.out.println("동생: 새우깡을 사먹고 "+money+"원이 남았다.");
			return; // 메서드를 끝내고 호출자로 돌아가는 코드. 정수값 리턴의 경우 0이나 1을 표기하여 종료를 알리기도 한다.
		}
	}//sister_3() end
	
	// 4. 파라미터도 있고, 리턴값도 있는 메서드 정의
	public static String sister_4(int money) {
		System.out.println("동생: 오빠가 준 돈 = "+money+"원");
		money -= 1300;
		String gwaja = "새우깡";
		System.out.println("동생: "+gwaja+"을 사먹고 "+money+"원이 남았다.");
		return gwaja;
//		return "새우깡" "쿠크다스" // err, return문 뒤의 값은 하나만 !!
	}//sister_4() end

}// Ex2_0216 Class end
