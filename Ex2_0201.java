
public class Ex2_0201 {

	public static void main(String[] args) {
//		자바에서의 형변환(데이터타입 변환)
//		> 어떤 데이터 타입이 다른 데이터 타입으로 변환되는 것.
//		> 기본데이터타입 중 boolean 타입을 제외한 나머지 타입간의 변환
		
//		자바 데이터타입 크기의 관계 (boolean 제외 7개 데이터 타입)
//		byte < short < int < long < float < double
//									(표현범위 특성상 실수를 표현하는 데이터 타입의 크기가 더 큼.)
//			(char)
//		1. 자동 형변환 : 묵(암)시적 형변환
//			> 작은 데이터타입 데이터 >>> 큰 데이터타입 데이터
//			> 자바 컴파일에 의해 자동으로 형변환이 일어남.
//			> 개발자가 신경 쓸 필요 x ex) byte >>> int >>> long ...
//			> 정수 타입보다 실수 타입이 무조건 큰 타입으로 취급받는다 !!
//			> long 의 크기가 float보다 크더라도 !! 무조건 float이 더 큰것으로 간주됨.
		int a1 = 32768; // 큰 데이터 타입
		short a2 = 32767; // 작은 데이터 타입
		
		System.out.printf("변환 전 a1(int) : %d, a2(short) : %d\n", a1,a2); //변환 전 a1(int) : 32768, a2(short) : 32767
		//자동 형변환 !!
		// 작은 데이터타입(a2) 데이터를 큰 데이터타입(a1)의 데이터로 이동
		a1=a2; // short a2를 int a1에 대입 --- 에러 발생 X
		System.out.printf("변환 후 a1(int) : %d, a2(short) : %d\n", a1,a2); //변환 후 a1(int) : 32767, a2(short) : 32767
		// 변환 후에도 원본데이터에 문제가 생기지 않는다.
		System.out.println("=============================================");	
		
//		2. 강제 형변환 : 명시적 형변환
//			> 큰 데이터타입의 데이터를 작은 데이터타입으로 변환하는 것.
//			> 작은 데이터타입의 허용치보다 커서 Overflow가 발생할 수 있다.
//				>> 자바가 자동으로 형변환 해주지 않는 이유(코스 오류)
//			> 반드시 우변의 데이터 앞에 '형변환 연산자'를 사용하여 강제 형변환을 수행해야함.
//			> 형변환 연산자에는 좌변의 작은데이터 타입명 입력.
//			> 강제 형변환으로 인해 오류가 사라지더라도 데이터는 다를 수 있음(Overflow)
//				>> 따라서 ! 형변환 후의 책임을 개발자에 맡김.
//			> 작은데이터타입 허용치 이내의 데이터일 경우, 데이터의 변형은 생기지 않음.
		
		
		int b1 = 9999999; // 큰 데이터 타입
		short b2 = 32767; // 작은 데이터 타입
		System.out.printf("변환 전 b1(int) : %d, b2(short) : %d\n", b1,b2);//변환 전 b1(int) : 9999999, b2(short) : 32767
//		b2=b1; // err , Type mismatch: cannot convert from int to short.
		// 큰데이터타입을 작은데이터타입에 집어넣으려고해서 생기는 에러.(b2<b1)
		b2 = (short)b1;// 강제 형변환 !!
		// 우변데이터 앞에 작은데이터의 데이터타입을 작성 !!
		// 큰 데이터타입(b1) 데이터를 작은 데이터타입(b2)의 데이터로 이동
		System.out.printf("변환 후 b1(int) : %d, b2(short) : %d\n", b1,b2);//변환 후 b1(int) : 9999999, b2(short) : -27009
		// 강제 형변환 후 overflow가 발생하여 저장된 데이터가 달라진 예시.
		
		System.out.println("=============================================");	
		
		byte smallSize = 100;
		short middleSize = 32767;
		int bigSize = 9999999;
		System.out.printf("변환 전 smallSize(short) : %d, middleSize(short) : %d, bigSize(int): %d\n", smallSize,middleSize,bigSize);
		//자동형변환
		middleSize = smallSize;
		System.out.printf("자동형변환 smallSize(short) : %d, middleSize(short) : %d, bigSize(int): %d\n", smallSize,middleSize,bigSize);
		//강제형변환
		middleSize = (short) bigSize;
		System.out.printf("강제형변환 smallSize(short) : %d, middleSize(short) : %d, bigSize(int): %d\n", smallSize,middleSize,bigSize);
		
		System.out.println("=============================================");	
		
//		int c1 = 100;
//		short c2 = c1; // err >> 수의 범위 안에 들어가더라도, 데이터타입으로 인하여 강제형변환을 해줘야 함.
		
//		short c1 = 100;
//		int c2 = (int)c1; // 에러없음, c1의 데이터타입이 c2보다 더 작아서 가능
		
		int c1 = 100;
		short c2 = (short)c1;
		System.out.printf("변환 후 c1(int) : %d, c2(short) : %d\n", c1,c2); // short 데이터타입의 범위 안이기때문에, overflow 발생 x
		
		int cc1 = 50000;
		short cc2 = (short)cc1;
		System.out.printf("변환 후 cc1(int) : %d, cc2(short) : %d\n", cc1,cc2); // short 데이터타입의 범위 밖이기때문에, overflow 발생 o
		System.out.println("=============================================");	
		
		//정수 >>> 실수로 변환하는 경우
		int d1 = 100;
		double d2 = 3.14;
		System.out.printf("변환 전 d1(int) : %d, d2(double) : %f\n", d1,d2);
		d2 =d1; // 자동형변환, double > int 이기때문에 err없이 변환 가능.
		System.out.printf("변환 후 d1(int) : %d, d2(double) : %f\n", d1,d2); //변환 후 d1(int) : 100, d2(double) : 100.000000
		
		System.out.println("-------------------------------------------------");
		
		// 실수 >>> 정수로 변환하는 경우
		int e1 = 100;
		double e2 = 3.14;
		System.out.printf("변환 전 e1(int) : %d, e2(double) : %f\n", e1,e2);
		//e1 = e2 // err int < double 이기 때문 --자동형변환 불가능
		e1 = (int)e2;
		System.out.printf("변환 후 e1(int) : %d, e2(double) : %f\n", e1,e2); //변환 후 e1(int) : 3, e2(double) : 3.140000
		
		System.out.println("-------------------------------------------------");
		
		//long(8B) vs float(4B)
		long l= 100L;
		float f = l; // long >> float : 자동형변환 가능. float > long !!
		//l = f // err, float >> long 불가능.
		l = (long)f; // 강제 형변환 !!! long을 float에 넣기 위해서는 강제형변환을 해야함.
		

		
	}

}
