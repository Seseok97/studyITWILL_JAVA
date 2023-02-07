
public class Ex3_0130 {

	public static void main(String[] args) {
//		데이터타입(Data Type) = 자료형
//		기본 데이터타입 (Primitive Type) = 기본형
//		참조 데이터타입 (Reference Type) = 참조형
		
//		1. 기본 데이터타입 (8가지)
//		---------------------------------------------------------------
//		       |1Byte(8bit)  |2Byte(16bit) |4Byte(32bit) |8Byte(64bit)|
//		---------------------------------------------------------------
//		논리형 |boolean		 |			   |             |			  |
//		정수형 |byte 	     |short	       | int         |long		  |
//		실수형 |             |             | float       |double      |
//		문자형 |             |char         |             |            |
//		---------------------------------------------------------------
//		정수형 데이터타입의 표현범위
//		- 메모리 크기에 따라 표현가능한 정수의 범위가 달라짐. 정수(-1,0,1,2,...) !! 실수(1.2,3.14,-5.5 ..) 아님 !!
//		#byte(1Byte = 8bit) : 2^8 >>> -128 ~ +127 표현 가능
//		#short(2Byte = 16bit): 2^16 >>> -32768 ~ +32767 표현가능
//		#int(4Byte = 32bit): 2^32 >>> 약 -21억 ~ +21억 표현가능, 정수의 기본형이 되는 데이터타입.
//		#long(8Byte = 64bit): 2^64 >>> 약 -922경 ~ +922경
		
//		정수형 데이터타입
//		byte b; //byte타입 변수 선언
//		b = 100; // byte타입 변수 b에 정수 100을 저장(변수명 = 데이터)
		byte b = 100; // 위 두줄의 코드를 줄인것(선언+초기화)
		System.out.println(b);
		
		b = 127;
//		b = 128; //에러발생 코드 byte type= -128~127
		b = -128; //err x
		
		short s = 128;
		System.out.println(s);
		
		s = 32767;
//		s = 32768; //에러발생 코드 short type= -32768~32767
		
		int i = 32767;
		System.out.println(i);
		
		i = 2147483647;
//		i = 2147483648; //에러발생 코드 int type = 21억 쯤 ~~~
		
		//정수에 접미사가 없으면 기본적으로 int, 최대지 2,147,483,647.
		//int타입을 벗어나면, long표기가 필요하다 !!
		//i = 2147483648L >>> i는 타입이 int이기때문에 에러발생 !!
		
		long l = 2147483648L; 
		//숫자 뒤에 대문자'L'표기 필수, int타입보다 작은 정수도 L을 붙이면 long으로 취급됨.
		System.out.println(l);
		l =5L; //i =5L은 에러발생 !! 정수 5는 int타입 안에 들어가지만, long의 5라서 에러
		System.out.println(l);
		
		System.out.println("----------------------------------");
		
//		실수형 데이터타입
		double d = 3.14; // 실수형 데이터타입 double 변수 d에 3.14 초기화
		System.out.println(d);
//		float f = 3.14; //에러발생 !!
		// 실수형 데이터타입 float은 long처럼 접미사로 'f'붙여줘야함. 없으면 double로 인식 >>> float에 저장불가.
		float f = 3.14f; //관례적으로 소문자 'f' 사용 
		System.out.println(f);
		
		System.out.println("----------------------------------");
		
//		논리형 데이터타입
//		boolean 데이터타입 : true/false만 사용
		boolean bool = true;
//		bool = 1; true/false이외에 사용 불가능.
//		bool = TRUE / True /FALSE 이런거 다 안됨.
		System.out.println(bool);
		bool = false;
		System.out.println(bool);
		
		System.out.println("----------------------------------");
		//2, 8, 10, 16진수 표현방법
		
		//1. 10진수
		int num = 10; // 10진수의 정수 10
		System.out.println("10진수 10 = "+num);
		
		//2. 2진수 : 접두사 0b
		num = 0b1010;
		//num = 0b1012 >>>Err! 0,1 이외 사용 불가 !!
		System.out.println("2진수 0b1010 = "+num);
		
		//3. 8진수: 접두사 0
		num = 012;
		System.out.println("8진수 012 = "+num);
		//num = 018 >>> Err! 8 사용 불가.
		
		//4. 16진수 : 접두사 0x
		num = 0xA; // A~F, 대소문자 구분 x
		System.out.println("16진수 0xA = "+num);
		//num = 0xG >>> Err! G사용불가.
		
		
		
		
	}

}
