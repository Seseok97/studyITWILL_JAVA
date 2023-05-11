package lambda;

public class Ex_0503_lambda {

	public static void main(String[] args) {
		/*
		 * 람다식(Lambda Expressions)
		 * > 자바 8에 추가된 가장 큰 특징. 
		 * > "함수형" 프로그래밍 형태를 받아들인 결과 !
		 * 
		 * "함수형" 프로그래밍이란? (함수형 vs 객체지향)
		 * > 함수형 : 1950년대, 객체지향 : 1990년대!
		 * > 기능 위주의 프로그래밍 기법.
		 * > 매개변수만을 사용하여 만드는 함수(순수 함수, pure function)를 구현하고,
		 * 	 호출함으로써 외부자료에 부수적인 영향을 주지 않도록 구현하는 방식.
		 * > 객체지향 : 객체를 기반으로 구현, 클래스에 속성과 기능을 정의!
		 * > 함수형   : 함수를 기반으로 자료를 입력받아 구현 & 기능, 함수가 따로 존재한다.
		 * 
		 * 람다식 : 함수 이름이 없는, '익명함수'를 만드는 것.
		 * 	> 메서드의 이름과 리턴타입을 빼고, '->'를 활용하여 람다식 구현.
		 * ex) int add(int x, int y){
		 * 			return x + y ;
		 * 		}
		 * 
		 * 		[람다식으로 표현하는 경우]
		 * 		(int x, int y) -> {return x + y ;}
		 * 
		 * <기본 문법>
		 * (데이터타입, 매개변수, ... ) -> {실행문, ... };
		 * 
		 * 1. 기본형
		 *  (int x) -> { System.out.println(x); }
		 *  
		 * 2. 매개변수의 타입을 추론할 수 있는 경우, 타입생략 가능.
		 * (x) -> {System.out.println(x);} // 코드 해석하기 어려워져서 좀 ,, 안쓰는게 좋은듯
		 * 
		 * 3. 매개변수나 실행문이 하나라면, 소괄호() 와 중괄호{} 생략 가능. 이때, 세미콜론 생략 가능.
		 * x -> System.out.println(x)
		 * 	!주의 > 매개변수가 두개 이상이면 소괄호 생략 불가. 콤마(,)로 분리해야 함.
		 * 
		 * 4. 매개변수가 없을 경우, 소괄호()를 반드시 작성해야 한다.
		 * () -> System.out.print(x)
		 * 
		 * 5. 리턴이 필요한 경우! return 키워드를 사용한다.
		 * (x,y) -> {return x + y; }
		 *  !주의 > return 키워드를 사용할 경우, 중괄호를 생략할 수 없다!
		 *  
		 * 6. 실행문이 단순히 return문 하나로 표현되는 경우
		 * 	> 표현식만 사용할 수 있고, 이때 리턴 값은 표현식의 결과값이 된다.(주의! 세미콜론을 생략해야 한다.)
		 * (x,y) -> x+y
		 *  
		 */
		// 구현클래스를 활용한 getMax 메서드 호출
		MyNumber max = new MyNumberClass();
		System.out.println(max.getMax(10, 20));
		
		//람다식 lambda 구현과 호출
		MyNumber max2 = (x, y) -> (x>=y)? x:y ;
		// > 람다식을 인터페이스형 max2 변수에 대입.
		// 	 람다식으로 표현한 추상메서드를 호출할 수 있다.
		System.out.println(max2.getMax(10, 20));
		
		// MyNumber 인터페이스에 add() 메서드를 추가하면 컴파일에러가 발생한다.
		// 람다식으로는 2개 이상의 메서드를 구분하기가 어렵기 때문이다. (기능만 들고오기 때문!)
		
	}// main() method end

}// public class end

// 함수형 인터페이스 선언하기
// > 자바에서는 참조변수 없이 메서드를 구현할 수 없다!
// > 람다식을 구현하기 위해 함수형 인터페이스를 만들고, 인터페이스에 람다식으로 구현할 메서드를 선언하는 형태로 사용.
// > 주의 ! 람다식은 하나의 메서드를 구현하여 인터페이스형 변수에 대입하기 때문에, 인터페이스가 두개 이상의 메서드를 가지면 안된다.
@FunctionalInterface // 함수형 인터페이스로 사용될 것을 알림
interface MyNumber{
	int getMax(int num1, int num2); // 추상메서드 선언
//	int add(int num1, int num2); // 추상메서드를 추가 선언시, 에러가 발생한다.
}// i end

// MyNumber 인터페이스를 구현한 MyNumberClass 정의
class MyNumberClass implements MyNumber{

	@Override
	public int getMax(int num1, int num2) {
		if(num1 >= num2) {
			return num1;
		}else {
			return num2;
		}// i-e end
	}// getMax() method end
	
}// MyMethod class end



































