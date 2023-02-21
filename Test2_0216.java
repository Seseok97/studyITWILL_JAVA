package method_;

public class Test2_0216 {

	public static void main(String[] args) {
		//3. 파라미터만 있고, 리턴값은 없는 메서드 호출 예제
		
		// > 문자열을 1개 전달하면 해당 문자열을 출력하는 print() 메서드
		print("아이티윌 부산교육센터");
		
		System.out.println("-----------------------");
		// 입력 정수 홀짝판별.
		checkNumber(1);
		checkNumber(0);
		checkNumber(4);
		
		//4. 파라미터도 있고, 리턴값도 있는 메서드 호출 예제
		// 입력정수 홀짝판별, 판별결과의 문자열을 리턴하는 메서드
		System.out.println("-----------------------");
		System.out.println(checkNumber2(0));

	}// main() end
	
	public static void print(String input) {
		System.out.println(input);
	}//print() end
	
	public static void checkNumber(int i) {
		if(i==0) {
			System.out.println("0");
		}else if(i%2 ==1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		return;
	}//checkNumber() end
	
	public static String checkNumber2(int i) {
		String str = "";
		if(i==0) {
			str = "0";
		}else if(i%2 ==1) {
			str = "홀수";
		}else {
			str = "짝수";
		}
		System.out.println("입력하신 정수값: "+i);
		return  str;	// return문은 모든경우에 실행되어야 에러가 발생하지 않는다.
		
	}//checkNumber2() end
	

}
