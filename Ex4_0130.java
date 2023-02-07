
public class Ex4_0130 {

	public static void main(String[] args) {
		// 문자형 데이터타입: char
		// -내부적으로, 정수형 데이터타입으로 처리됨.
		// -2Byte(16bit) 크기의 메모리 사용, 정수 범위는 0~65535(음수 X)
		// -문자 표현 시 1개의 문자를 작은따옴표''로 표현. ex) 'A' = 정수 65
		// -유니코드 사용 >>> Unicode, 전 세계의 문자를 표현하기 위한 방법
		// 아스키코드를 기반으로 함(ASCII, 7bit) > 'A' = 65, 'a'= 97, '0'= 48
		// >>> 10진수의 코드값을 사용하지만, 입력시 16진수 4자리 사용
		// '\'+'u'+'XXXX(16진수)'

		// char타입변수 ch 선언, 대문자 A 저장 후 출력
		char ch = 'A'; // 'AA' 저장시 에러, char은 1개의 문자만 !! 저장가능한 데이터타입.
		System.out.println("'A' >>" + ch);
//		ch = ''; //값 없을시 에러
		ch = ' '; // 공백 사용 가능
		System.out.println("' ' >> " + ch + "<< 여기에 있음 space ");
		ch = 65; // 정수 65 = 'A'(10진수 언어코드값.)
		System.out.println("정수65 >>" + ch);
		ch = '\u0041';
		System.out.println("'백슬래시' + 'u' + '0041' >> " + ch);
		ch = '가';
		System.out.println(" '가' >> " + ch);
		ch = '\uAC00';
		System.out.println("'백슬래시' + 'u' + 'AC00' >> " + ch);
		ch = '\uAC01';
		System.out.println("'백슬래시' + 'u' + 'AC01' >> " + ch);

		System.out.println("----------------------------------------------------");

//		문자열을 저장하기 위한 데이터타입 : String
//		-기본 데이터타입이 아닌, 참조 데이터타입(메모리 크기가 모두 4Byte)
//		-큰따옴표""로 둘러싸서 표현 ex "ABCD"
//		-아무 문자도 포함하지않는 ""문자열을 널스트링(null string)이라고 함.
		String str = "Hello,world!";
		System.out.println("\"Hello,world!\" >> " + str);
		str = ""; // 0개의 문자가 포함된 문자열, 널스트링
		System.out.println(str + " << 공백으로 몬가 .. 들어와있음(nullstring)");
		str = "A"; // char타입 대문자 A와는 완전히 다른 값으로 인식됨 !!
		System.out.println(str);

	}

}
