package lambda;

public class Ex3_0509_lambda {

	public static void main(String[] args) {
		/*
		 * 함수형인터페이스 (Functional Interface) 또는 타겟타입(target type)
		 * > 람다식은 결과적으로, 인터페이스타입의 클래스를 손쉽게 구현하는 방법 정도이다.
		 * > 반드시 하나의 abstract 메서드만 존제.
		 * > 만약, 추상메서드가 없거나, 두개이상 존재한다면 ? > 람다식 사용 불가!
		 * > 함수형인터페이스 어노테이션 (@FunctionalInterface)선언.
		 */
		
		useFIMethodA(new MyFunc1() { // 익명 구현클래스 > MyFunc1 인터페이스를 구현하는 익명 클래스이다.
			@Override
			public void methodA() {
				System.out.println("익명 내부클래스 형태!");
			}// methodA() method end
		});// anony class end
		
		System.out.println("-----------------------------------------------------------------------");
		// 1. 파라미터와 리턴타입이 없는 경우 (파라미터 X, 리턴타입 X)
		System.out.println("(파라미터 X, 리턴타입 X)");
		
		// 정적메서드 useFIMethodA의 파라미터가 MyFunc1의 인터페이스 타입이기 때문에,
		// 람다식으로 만들어지는 익명객체가 파라미터값으로 사용된다.
		
		// 표현방식 1
//		useFIMethodA(); // 소괄호 안에 람다식 표현.
		useFIMethodA( () -> {
			System.out.println("람다식1");
		});
		
		// 표현방식 2
		useFIMethodA( () -> System.out.println("람다식2") );
		
		System.out.println("-----------------------------------------------------------------------");
		// 2. 파라미터가 있는 람다식 (파라미터 O, 리턴타입 X)
		System.out.println("(파라미터 O, 리턴타입 X)");
		
		// 표현방식 1
		useFIMethodB( (String s) -> {
			System.out.println("람다식1 : "+s);
			});

		// 표현방식 2
		useFIMethodB( s -> System.out.println("람다식2 : "+s));
		// 파라미터와 실행문이 각각 1개일 경우, 소괄호, 중괄호 생략이 가능하다.
		System.out.println("-----------------------------------------------------------------------");
		// 3. 리턴타입이 있는 람다식(파라미터 O, 리턴타입 O)
		System.out.println("(파라미터 O, 리턴타입 O)");
		
		// 표현방식 1
		String result = useFIMethodC( (String s) -> {
			return "람다식1 : "+ s;
		});
		System.out.println(result); // 리턴으로 받기때문에 받아올 변수가 필요함.

		// 표현방식 2
		System.out.println(useFIMethodC( s -> "람다식2 : "+s )); // 리턴문을 생략하면 중괄호 삭제.

	}// main() method end
	
	// 함수형 인터페이스를 사용하는 람다식 유형
	// 1. 파라미터와 리턴타입이 없는 경우 (파라미터 X, 리턴타입 X)
	public static void useFIMethodA(MyFunc1 fi) {
		// 매개변수로 MyFunc1 타입을 설정
		// 매개변수로 인터페이스 구현클래스, 익명 구현클래스, 람다식이 올 수 있다.
		// > 람다식 사용시, 내부적으로 익명구현클래스가 생성된다.
		fi.methodA();
		
	}// method end
	
	// 2. 파라미터가 있는 람다식 (파라미터 O, 리턴타입 X)
	public static void useFIMethodB(MyFunc2 fi) {
		fi.methodB("홍길동");
	}// method end
	
	// 3. 리턴타입이 있는 람다식(파라미터 O, 리턴타입 O)
	public static String useFIMethodC(MyFunc3 fi) {
		return fi.methodC("홍길동");
	}// method end

}// public class end

// 함수형 인터페이스를 사용하는 람다식 유형
// 1. 파라미터와 리턴타입이 없는 경우 (파라미터 X, 리턴타입 X)
@FunctionalInterface
interface MyFunc1{
	
	// 함수형 인터페이스 어노테이션 (@FunctionalInterface) 선언 시 에러 발생.
	// >> 함수형 인터페이스는 반드시 하나의 추상메서드를 가져야 함.
	void methodA();
//	void methodB(); // 에러
	
}// interface end

// 2. 파라미터가 있는 람다식 (파라미터 O, 리턴타입 X)
@FunctionalInterface
interface MyFunc2{
	void methodB(String msg);
}// interface end

// 3. 리턴타입이 있는 람다식(파라미터 O, 리턴타입 O)
@FunctionalInterface
interface MyFunc3{
	String methodC(String msg);
}// interface end




































