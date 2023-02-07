
public class Ex3_0201 {

	public static void main(String[] args) {
//		char 타입과 byte & short 타입간의 관계
//			> byte(1B = 8bit): -128 ~ +127
//			> short(2B = 16bit): -32768 ~ +32767
//			> char(2B = 16bit): 0 ~ 65535
//				>> char의 경우, 문자 표현을 위해 양수로만 표현.
//				>> byte와 short에 비해 양수 표현범위가 크다 !!
//				>> char은 음수 표현을 하지 못한다 !!
//					>>> char - byte,short 간의 자동형변환 불가능 -- 강제형변환 필수
		
		byte b = 100;
		short s = 65;
		
		char ch;
		
//		byte >> char으로 변환
//		ch = b; //err. 강제형변환 필수 !!
		ch = (char)b; // b를 char타입으로 강제 변환.
		System.out.println(ch); //d 출력(문자코드)
		
//		char >> byte으로 변환
//		b = ch; //err. 강제형변환 필수 !!
		b = (byte)ch; // ch를 byte 타입으로 강제 변환
		System.out.println(b); // 100
		
		System.out.println("---------------------------");
		
//		short >> char 으로 변환
//		ch = s; // err. 강제형변환 필수 !!
		ch = (char)s; //s를 char 타입으로 강제 형변환
		System.out.println(ch); //A
		
//		char >> short 로 변환
//		s = ch; //err. 강제형변환 필수 !!
		s = (short)ch; // ch를 short 타입으로 강제 변환
		System.out.println(s);//65
		
		System.out.println("=============================");
		
//		int > char 이다 !! // int의 양수 표현범위가 char보다 크기 때문. 
		int i = ch; // 에러 없음.
		ch = (char)i;
		System.out.println(i); //65
	}

}
