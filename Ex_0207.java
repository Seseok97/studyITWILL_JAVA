package operator;

public class Ex_0207 {

	public static void main(String[] args) {
		// 삼항연산자(조건연산자)
		// - 피연산자가 3개인 연산자 !!!!
		// - 조건식의 판별 결과가 true일때와 false일때
		//	 서로다른 위치의 값, 또는 식을 선택하는 연산자
		// - 조건식은 결과가 true거나 false가 되는 식을 사용해야 함.
		
		// 형태
		// 조건식? 값1(true일때 실행) : 값2(false일때 실행)
		
		int num = 0;
		//num이 0 이상인지 판별하는 식
		System.out.println(num >= 0? "num은 양수!":"num은 음수!"); // num은 양수! 출력됨.
		// num이 0 이상일 경우 true를 반환 >> 값1을 선택 >> 출력
		// System.out.println("num은 양수!"); 와 결과 동일
		
		String result = num >= 0? "num은 양수!":"num은 음수!"; // 해당 형태로도 사용 가능 > 연산자의 우선순위로 인하여 가능!!
		System.out.println(result); // num은 양수! 출력됨.
		
		System.out.println("============================");
		
		result = num>0 ? "num은 양수~":num<0 ? "num은 음수~":"num은 0이다~"; //괄호 안쳐도 됨 ㅋㅋ;;
		System.out.println(result); // num은 0이다~ 출력됨!
		
		
		
		
	}

}
