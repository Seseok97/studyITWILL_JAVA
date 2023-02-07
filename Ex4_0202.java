
public class Ex4_0202 {

	public static void main(String[] args) {
		// 
//		비교연산자(관계연산자) (>, >=, <, <=, ==, !=)
//			> 두 피연산자 간의 대소관계 등을 비교하여 true혹은 false값을 리턴
//			> 주의 ! 동등비교 연산자는 수학과 달리 '=='기호 사용.
//			> 연산자의 순서는 바뀔수 없다. ex) =<, => X
//			> 결과값은 바로 사용하거나 boolean타입 변수에 저장 가능.
//			> 데이터타입이 동일해야 연산 수행 가능
		int a = 10, b = 5;
		System.out.println("a > b 인가? " + (a>b)); 	//t
		System.out.println("a >= b 인가? " + (a>=b));	//t
		System.out.println("a <= b 인가? " + (a<=b));	//f
		System.out.println("a < b 인가? " + (a<b));		//f
		System.out.println("a == b 인가? " + (a==b));	//f
		System.out.println("a != b 인가? " + (a!=b));	//t >> 같으면 f, 다르면 t
		
		boolean result = a>b; // true 반환, boolean 타입 데이터.
		System.out.println(result);
		
		System.out.println("===========================================");
		
		//char타입 비교시 int타입으로 변환 후 비교(유니코드값이 비교됨.)
		System.out.println('A'>'B'); // 65 > 66 >> false
		System.out.println('A'==65); // 65 == 65 >> true
		
		//주의사항 !! double타입과 float타입 비교시 근사치표현에 의한 의도치않은 결과를 반환할 수 있음.
		System.out.println(0.1 == 0.1f); // 같은 값이지만, 근사치표현에 의해 다른 값으로 인식됨. >> false
		System.out.println((float)0.1 ==0.1f); // true 출력
		
		System.out.println("===========================================");
		
		//다른 연산과 관계연산자를 결합하여 연산결과의 대소관계 판별 가능.
		System.out.println(a+b > a-b);
		
		
	}
	

}
