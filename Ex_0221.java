package method_;

public class Ex_0221 {

	public static void main(String[] args) {
		// method 이어서
		//5. 파라미터가 2개 이상인 메서드 호출
		String snack ="새우깡";
		int myMoney = 1000;
		System.out.println("현재 과자: "+ snack);
		System.out.println(
				"동생아 ! 새우깡이랑 1000원을 줄테니 쿠크다스로 바꿔와라 !!");
		sister_5(myMoney,snack);
//		sister_5(snack,myMoney); //not applicable 에러, 데이터타입이 다른 경우 사용 불가 !!
//		sister_5(1000,"새우깡"); // 직접 적어서 사용도 가능 !
		System.out.println("---------------");
		System.out.println("현재 과자: "+ snack); 
		// snack을 쿠크다스로 교환 하였으나, 메서드 안에서 작동하는 지역변수이기 때문에 ! 여기서는 새우깡으로 출력된다.
		String mySnack = sister_5(myMoney,snack);
		System.out.println("동생이 바꿔다준것: "+mySnack);
		//snack이 아니라, 별도 변수를 작성해야 리턴받은 값을 저장할 수 있다.

	}//main() method end
	//5. 파라미터가 2개 이상인 메서드 호출
	public static String sister_5(int money,String snack) {
	// int money, String snack이 순서대로 전달 될 것이라, 파라미터 선언 순서도 같아야 한다 !!
		System.out.println("오빠가 준 돈: "+money+"원");
		System.out.println("오빠가 준 과자: " +snack);
		System.out.println(snack +"을 쿠크다스로 교환하였다 !");
		
		snack = "쿠크다스";
		System.out.println("현재 과자: "+ snack);
		//리턴값 데이터타입이 String으로 선언되어 있음 !!
		return snack;
		
		// snack변수값을 리턴 !! 리턴 하는거 중요
		
	}//sister_5() method end
	
	
	
}//Ex3 class end
