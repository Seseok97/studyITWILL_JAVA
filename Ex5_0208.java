package switch_;

public class Ex5_0208 {

	public static void main(String[] args) {
		//switch문
		// >  if문 처럼, 특정 조건에 대해 여려가지 판별을 수행하는 조건문.
		// >> 단, if문과 달리 범위 판별이 불가능하다. 값의 동등비교만 가능.
		
		// switch문의 조건식에는 연산식, 변수, 리터럴 등이 사용 가능하나
		// 반드시 정수 또는 문자열, enum타입 상수(아직 안배움 !!)만 사용 가능하다.
		// 이중 정수는 byte, short, char, int 까지만 사용 가능하다. long X
		
		// switch문에서 지정한 조건에 맞는 값을 case문에서 탐색하여,
		// 일치하는 값을 갖는 case 문의 문장을 실행함.
		// 이때, case문에는 조건식 결과를 비교할 리터럴 1개만 명시 가능함.
		
		// case문에서 조건식 결과 비교 리터럴은 대소관계에 의해 정렬되지 않아도 정상적으로 실행 가능하다.
		// 단, 위에서 아래로 실행된다.
		
		
//		switch(조건식) {
//			case 값1:
//				문장 1 // 조건식 결과가 값1과 일치하는 경우 실행
//			case 값2:
//				문장 2
//			case 값n:
//				문장n //조건식 결과가 값n 과 일치하는 경우 실행 될 문장
//		}
		int num =2;
		
//		switch(num) {
//			case 1:
//				System.out.println("num=1"); // num=1인 경우, case 2까지 실행됨.
//			case 2:
//				System.out.println("num=2");
//				break;		// 실행문 밑에 break를 적어서 원하는 위치에서 실행을 중단시킬 수 있음.
							//  >>> 여기서 중단된다 !! 출력결과: num=2
//			case 3:
//				System.out.println("num=3");
//				break;
//		}
		num = 5;
		switch(num) {
			case 1:
				System.out.println("num=1");
			case 2:
				System.out.println("num=1");
			case 3:
				System.out.println("num=1");
			default:
				System.out.println("일치하는 case문이 없다 !"); // 일치하는 case문이 없는 경우 실행되는 문장
				// break문이 없을때, case문부터 default문까지 모두 실행된다.
		}
		
		System.out.println("----------------------------------");
		
		num =2;
		switch(num) {
			case 1:
				System.out.println("num=1");
				break;
			case 2:
				System.out.println("num=2"); // num은 2이고, case문과 일치하기 때문에 num=2를 출력한다.
				break;						 // case문의 실행문 출력 후 break문을 만났다 !! >> 중괄호 밖으로 날라감.
			case 3:
				System.out.println("num=3");
				break;
			default:
				System.out.println("일치하는 case문 없음 !!"); // default문은 어차피 마지막이라 break;는 안적는다.
		}
		System.out.println("----------------------------------");
		
		//switch문에 문자열 데이터 전달 가능
		switch("KOREA") {
			case "한국": System.out.println("한국!");break;
			case "KOREA": System.out.println("KOREA!");break;
			case "대한민국": System.out.println("대한민국!");break;
			default: System.out.println("다른나라");
		}
		System.out.println("----------------------------------");
		
		//switch문에는 연산식도 사용 가능하지만, 결과는 정수 혹은 문자열 타입이어야 한다.
//		switch(1+1) {}		//사용가능
//		switch(1+"1") {}	//사용가능
//		switch(1+1.0) {}	//err. 2.0은 더블형이라서 그렇다 ~
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
