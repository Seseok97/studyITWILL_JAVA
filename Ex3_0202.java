
public class Ex3_0202 {

	public static void main(String[] args) {
		// 대입연산자 '='
//			> 우변의 데이터를 좌변의 변수에 대입(저장!!)
//				>> 연산 방향은 우 >> 좌로 진행됨 ex) x = y = 3 >> 3을 y에 대입하고, y를 x에 대입하는 순서로 진행됨
//			> 모든 연산자 중에서 우선순위가 가장 낮음. >> 다른작업 다 ~ 하고 실행된다 !!
		
		//확장(복합)대입연산자(+=, -=, *=, /=, %=)
//			> 대입연산자와 산술연산자를 조합한 연산자.
//			> 좌변과 우변의 데이터끼리 산술연산을 먼저 수행 하고, 결과값을 좌변에 대입(저장)
		int a = 10; // 우변의 데이터 10을 좌변의 변수 a에 대입(저장)
		int b;
		
		b = a; // 우변의 변수 a의 값을 우변의 변수 b에 대입(저장)
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("--------------------");
		
		// b + a의 값을 다시 b에 저장 >> b에 a값을 누적 >> +=
		b = b+a;
		System.out.println(b); // 20
		b += a; // b = b+a; 와 동일 !
		System.out.println(b); // 30
		
		// -=
		b = b-a;
		System.out.println(b); // 20
		b -= a; // b = b-a;
		System.out.println(b); // 10
		
		// *=
		b = b*a;
		System.out.println(b); // 100
		b *= a; // b = b*a;
		System.out.println(b); // 1000
		
		// /=
		b = b/a;
		System.out.println(b); // 100
		b /= a; // b = b/a;
		System.out.println(b); // 10
		
		// %=
		b = b%a;
		System.out.println(b); // 0
		b %= a; // b = b%a;
		System.out.println(b); // 0
		
		System.out.println("=====================");
		
		byte b1 = 10;
		//+=
//		b1 = b1 + 10; //err!! byte + int, type mismatch >> 형변환 필요
		b1 = (byte)(b1+10);
		
//		b1 +=(byte)10;
		b1 +=10; // 확장대입연산자를 사용하면 강제형변환 필요없음 (?)
		
		//char 변수값을 변화시킬때 확장대입연산자를 많이 사용한다. + 암호화할때도 많이 사용한다고 하심
		char ch = 'A';
//		ch = ch+3; // err, type mismatch
		ch += 3; // 확장대입연산자 사용
		System.out.println(ch);

		
	}

}
