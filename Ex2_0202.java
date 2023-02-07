
public class Ex2_0202 {

	public static void main(String[] args) {
		//
		//문자열에 대한 덧셈 연산자(+) = 연결(결합)연산자
		// > "문자열"+"문자열" = "문자열문자열" >> 강사님이 설명 달아주셨는데, 설명보다 예시가 이해하기 빠를거같아서 예시만 달아둠.
		// > int+"문자열" = "int"+"문자열"="int문자열"
		
		int aa = 10, bb = 20;
		System.out.println(aa+bb);
		System.out.println("aa = "+aa); // 뒤쪽의 정수 aa는 연산 이후 출력간에는 문자열 "aa"로 취급된다 !!
		
		String str = "aa = " + aa;
		System.out.println(str);

		System.out.println("bb = " + bb); // "bb = " + 20 = "bb = " + "20"
		
		int cc = aa+bb;
		System.out.println(aa +"+"+ bb +"="+ cc );
		// 1. aa +"+" 가 우선 수행되어, "10+" 문자열 생성
		// 2. "10+"+ bb가 수행, "10+20" 문자열 생성
		// 3. "10+20"+"="이 수행, "10+20=" 문자열 생성
		// 4. "10+20="+cc가 수행, "10+20=30"문자열 생성.
		
		System.out.println("result = "+cc);
		
		System.out.println("====================================");
		
		System.out.println(10 + 20);   //30	 >>  정수
		System.out.println(10 + "20"); //1020  >>  문자열
		System.out.println("10" + 20); //1020  >>  문자열
		System.out.println("10" + 20 + 30); //102030  >>  문자열
		System.out.println(10 + 20 + "30"); //3030  >>  문자열, 왼쪽에서 오른쪽으로 연산이 실행된 결과.
		System.out.println("10"+ (20 + 30)); //1050  >>  문자열, 우선순위 변경 가능
		
		System.out.println("====================================");
		
		String name = "seseok";
		int age = 27;
		//주민번호를 표현하는 방법
//		int juminNum = 450815-1111111; //뺄셈연산자로 인식되어 의도하지않은 결과 출력.
//		int juminNum = 4508151111111; // 길이가 너무 길어 int타입으로는 출력 불가.
		long juminNum = 4508151111111L; // long으로 표현하면 가능, 근데 -가 안들어감
		String juminStr = "450815-1111111"; // 위 두가지 형태로 표현 가능
		System.out.println("이름: "+name); 
		System.out.println("나이: "+age); 
		System.out.println("주민번호: "+juminStr); 
		
		
	}

}
