
public class Ex_0202 {

	public static void main(String[] args) {
		// JAVA0201의 Ex3 + Ex4의 내용
		
		//산술 연산 시 자동 형변환
//			> 연산 수행 전 피연산자 끼리의 데이터타입을 같게하여 연산 수행
//			> 규칙 1. int보다 작은 타입(byte, short, char)의 연산은 모두 int타입으로 자동 형변환 후에 연산 수행
//				>> 결과값이 무조건 int타입이 된다 !!
//					>>> byte+byte = (int)byte+(int)byte = int+int = int
//					>>> char + int = (int)char+int = int+int = int
//			> 규칙 2. int보다 큰 타입과의 연산은 큰 타입으로 변환 후 수행
//				>> 결과값은 큰 타입쪽의 데이터타입으로 형변환된다 !!
//					>>> int+long = (long)int+long = long+long = long
//					>>> 1+3.14(float) = 1.00+3.14 = 4.14 >> 1+3.14를 4라고 안하는것과 같은 원리다.
		
		byte b1 = 10, b2 = 20, b3;
		System.out.println(b1 + b2);
		
//		b3 = b1 + b2;//err !!!! byte+byte = int+int = int  // Type mismatch에러문
		// b3이 byte타입이라서 발생하는 문제 !! > int >> byte의 강제 형변환 필요.
//		b3 = (byte)b1+(byte)b2 //err, 형변환은 연산 직전에 진행됨 !! 강제 형변환이 연산 전에 일어났기 때문에 말짱도루묵이다~
		b3 = (byte)(b1 + b2); // 해결: 연산 결과에 대하여 형변환을 실행 해야함 !!
		System.out.println(b1+"+"+b2+" = "+b3);
		
		//만약 b3가 처음부터 int면 저럴필요 없음.
		
//		short s = b1+b2; //err, b3의 경우와 같음.
		short s = (short)(b1+b2); // short보다 작은 데이터타입도 가능하더라~
		System.out.println("s = "+s);
		
		//char타입변수 ch2에 ch+2의 결과 저장
		char ch = 'A';
//		char ch2 = ch+2; // err. char+int >>type mismatch
		char ch2 =(char)(ch+2);
		System.out.println(ch2); // A(65) +2 =C(67)(아스키코드 따라가면 이런식으로 나오던데 ,,)
		System.out.println(ch+2); // ch를 int로 자동형변환 !!!! >> 67
		System.out.println((char)(ch+2)); // C
		
		System.out.println("------------------------------------");
		
		int i = 100;
		long l = 200;
		//int형 변수 i2에 i+l결과값을 저장
//		int i2 = i+l; // long은 int보다 더 큰 개념이기때문에 !!! 연산은 되더라도 i2에 대입을 못한다!!
					  // >> int+long = long+long = long .. i2 = int라서 안됨
		
		int i2 = (int)(i+l); //기본적으로 오류가 발생하지 않기 위해서는 양쪽의 데이터타입이 같아야함. 
		System.out.println(i2); // 300
		
		float f = 3.14f;
//		long l2 = l+f; // long+float = float+float = float !!! long != float >> 강제형변환 필요
		long l2 =(long)(l+f);
		System.out.println(l2); // 203, 203.14가 아닌 이유는 >> float를 long으로 강제 형변환 하면서 소수점 자리는 버렸기때문 !!
		
		System.out.println("------------------------------------");
		
		System.out.println(3 / 2); // 나눗셈 연산은 몫을 계산한다. int / int = int 형식으로 출력하기 때문에 !! >> 1 출력하는것.
		// >>> 그래도 대충 1.5인거는 알고 있으니까 ,, 1.5를 출력하고 싶다면 ? >> 피연산자중 하나를 실수로 변환해보자.
		System.out.println((double)3 / 2); // double / int = double / double = double결과 출력 >> 1.5 출력.
		System.out.println(3.0 / 2); // 위와 같음 >> 1.5 출력.
		// 주로 수치데이터는 .0을 붙여서 실수로 변환하고, 실수형변수는 형변환 연산자를 사용하여 변환한다.
		
		System.out.println("====================================");
		
		//실수끼리의 연산
		
		float f1 = 0.1f;
		double d1 = 0.1;
		
		System.out.println(f1); //0.1
		System.out.println(d1); //0.1
		System.out.println(f1+f1); //0.2
		System.out.println(d1+d1); //0.2
		System.out.println(f1+d1); //0.20000000149011612 >>> ??????
		// float >> double 형변환. = double+double 형태가 됨.
		// = 0.1f + 0.1의 형태인데, 근사치표현에 의한 의도치않은 결과가 출력 된 것.(float >> double의 과정에서, 4byte 짜리를 어거지로 8byte로 늘리면서 발생함.)
		// double >> float으로 형변환 후 연산하거나, 둘 다 정수로 변환 후 연산, 다시 실수로 변환하는 과정을 거쳐야 함.
		
		//전자 예시
		System.out.println(f1+(float)d1); // float+float >> 0.2 출력
		//후자 예시
		System.out.println((double)(((int)(f1*10) + (int)(d1*10))/10.0)); // (double)((int)+(int)) >> 0.2 출력
		
		System.out.println("====================================");
		
		//리터럴끼리의 연산에는 자동 형변환이 일어나지 않는다.
		
		byte b4 = 10+20; // byte타입 범위내의 정수는 byte타입 그대로 연산된다.
		System.out.println(b4); // 30 출력
		
//		b4 = 10 + 5000; //err, type mismatch오류, 타입의 범위를 벗어나면 오류 발생 !!
		
		
		
		
				
				
		
	}

}
