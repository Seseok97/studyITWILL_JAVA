
public class Ex5_0202 {

	public static void main(String[] args) {
		// 
		//논리연산자 (&&, ||, !, ^)
//			> 두 피연산자간의 논리적인 판별을 수행하는 연산자
//			> 피연산자는 모두 boolean타입 데이터(true, false)만 가능하며, 결과값도 동일
		
		// AND 연산자(& 또는 &&) - 논리곱
//			> 두 피연산자가 모두 true일때만 true를 반환하고, 하나라도 false일 경우 false 반환.
//			> 그리고, ~이고 등의 접속사에 해당하는 의미로 사용. 
//			> 주로 A~B사이 범위를 판별하는데 사용. (?)
		
		// OR 연산자 (| 또는 ||) - 논리합
//			> 두 피연산자중 하나라도 true일 경우 true를 반환하고, 둘 다 false일때만 false 반환.
//			> 또는, ~이거나 등의 접속사에 해당하는 의미로 사용됨.
//			> 주로 A조건과 B조건을 동시에 만족하는 조건을 판별하는데 사용.
		
		// NOT 연산자(!) - 논리 부정
//			> 단항연산자로, 피연산자 앞에 !기호를 붙임. (AND, OR연산자가 이항연산자 !)
//			> 현재 boolean값을 반전. !true = false, !false = true
		
		// XOR 연산자(^) - 배타적 논리합(exclusive OR) >> 잘 안쓴다고 ..
//			>두 피연산자가 서로 다를 경우 결과값이 true이고, 같을 경우 false. >> ex) t^t=f, t^f=t
		
		boolean a = false;
		boolean b = true;
		
		System.out.println("AND(&&)연산의 진리표"); // &&와 &중 구조상 &&이 더 빠름. (&&: false를 발견하면 false를 반환하고 연산을 중지함.)
		System.out.println("a(false) && a(false) = "+ (a && a));	//f
		System.out.println("a(false) && b(true ) = "+ (a && b));	//f
		System.out.println("b(true ) && a(false) = "+ (b && a));	//f
		System.out.println("b(true ) && b(true ) = "+ (b && b));	//t

		System.out.println("--------------------------------------");
		
		System.out.println("OR(||)연산의 진리표"); 
		System.out.println("a(false) || a(false) = "+ (a || a));	//f
		System.out.println("a(false) || b(true ) = "+ (a || b));	//t
		System.out.println("b(true ) || a(false) = "+ (b || a));	//t
		System.out.println("b(true ) || b(true ) = "+ (b || b));	//t
		
		System.out.println("--------------------------------------");
		
		System.out.println("NOT(!)연산의 진리표");
		System.out.println("!a(false) = "+(!a)); //t
		System.out.println("!b(true) = "+(!b)); //f
		
		System.out.println("--------------------------------------");
		
		System.out.println("XOR(^)연산의 진리표");
		System.out.println("a(false) ^ a(false) = "+ (a^a)); //f
		System.out.println("a(false) ^ b(true ) = "+ (a^b)); //t
		System.out.println("b(true ) ^ a(false) = "+ (b^a)); //t
		System.out.println("b(true ) ^ b(true ) = "+ (b^b)); //f
		
		System.out.println("--------------------------------------");
		
		//두가지 조건을 한 코드에 작성하고자 할 때.
		int num = 1;
		
		// num이 5보다 크고 10보다 작은가?
		System.out.println(num>5); // f
		System.out.println(num<10); // t >> 따로 하는 방법. 의도대로 나온게 아님 ,,
		// 방법
		// num이 5보다 크고(AND) 10보다 작은가?
		System.out.println(num>5 && num<10); // f >> t를 출력하기 위해서는 num = 6~9사이의 숫자여야 함.
		
		//예제) num이 0보다 작거나(OR) 100보다 큰가?
		System.out.println(num < 0 || num > 100); // f >> t를 출력하기 위해서는 num이 0보다 작거나 / 100보다 큰 수여야 함.
		
		num = 150;
		
		//NOT 연산자 >> 현재 조건을 만족하는가 판별.
		// ex) num이 0보다 작거나(OR), 100보다 크지 않은가? >> num이 0이상이고(AND) 100이하인가?
		System.out.println(!(num < 0 || num > 100));
		System.out.println(num>=0 && num <=100); //위 코드와 같음.
		
		
		
			
		
		

	}

}
