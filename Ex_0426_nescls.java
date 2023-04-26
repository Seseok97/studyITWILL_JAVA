package nested_class;

import nested_class.Outer.StaticInner;

public class Ex_0426_nescls {

	public static void main(String[] args) {
		/*
		 * 중첩 클래스 (Nested Class)
		 *  > 클래스 내에서 정의한 클래스.
		 *  > 중첩 클래스 사용은 두 클래스의 멤버들을 서로 쉽게 접근할 수 있고, 
		 *    외부에는 불필요한 관계 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있다.
		 *  > 독립적인 일반 클래스 형태로 작성할 필요는 없지만, 클래스의 형태를 갖춰야 할 때 사용한다.
		 *  > 보통, 자신의 클래스 내에서만 접근 가능하도록 전용 클래스를 정의할 때 사용한다.
		 *  	>> 주로 GUI 구현간에 이벤트 처리를 위한 핸들러클래스 정의시 사용 !!
		 *  > 외부 클래스와 내부 클래스로 구분된다.
		 *  > 내부 클래스는 클래스 정의 위치에따라 구분되며, 클래스의 멤버로서 선언되는 중첩클래스를 [멤버 클래스],
		 *    생성자 또는 메서드 내부에서 선언되는 중첩 클래스를 [로컬 클래스]라고 한다.
		 *  > 다시 멤버 클래스는 객체를 생성해야만 하는 인스턴스 멤버 클래스와 정적 멤버 클래스로 구분할 수 있다.
		 *  
		 *  1) 인스턴스 멤버 (내부) 클래스
		 * 		> 멤버변수 및 메서드와 동일한 레벨에서 정의된 클래스.
		 * 		> static 키워드를 지정하지않은 클래스.
		 * 		> 인스턴스멤버 변수 (필드)와 메서드만 선언이 가능하고, 정적 변수(필드)와 메서드는 선언 불가!
		 * 		> 반드시 외부클래스 인스턴스 생성 후 접근 가능!!
		 * 
		 * 	2) 정적 멤버(내부) 클래스
		 * 		> 멤버변수 및 메서드와 동일한 레벨에서 정의된 클래스.
		 * 		> static 키워드를 지정한 클래스.
		 * 		> 모든 종류의 필드의 메서드를 선언 가능.
		 * 		> 외부 클래스명만으로 접근 가능!
		 * 
		 * 	3) 로컬 멤버(내부) 클래스
		 * 		> 클래스 내의 메서드 내에서 정의한 클래스!
		 * 
		 * > 멤버클래스의 경우 : [바깥클래스$멤버클래스.class] 파일 생성
		 * > 로컬클래스의 경우 : [바깥클래스$1로컬클래스.class] 파일 생성
		 */
		
		// 1. 인스턴스 내부 클래스에 접근 // > 반드시 외부 클래스의 인스턴스를 생성하고 !! 참조변수를 통하여 내부 클래스로 접근!!
//		Inner inner = new Inner(); // > 내부클래스명 만으로는 접근할 수 없다 !!
		Outer outer = new Outer();
		
		//외부 클래스를 통해 내부 클래스의 인스턴스를 생성할 경우,
		// 반드시 외부클래스명.내부클래스명 타입으로 변수를 지정하고,
		// 외부클래스참조변수명.new 내부클래스명() 형태로 인스턴스 생성
		nested_class.Outer.Inner inner = outer.new Inner();
		//			< 패키지명은 생략 가능!
		inner.innerMetnod();
		System.out.println("innerNum = "+ inner.innerNum);
		
		//-----------------------------------------------------------------------
		// 2. 정적 내부클래스에 접근
		//		> 정적 내부클래스에는 static 키워드가 적용되어 있기 때문에,
		//		> 클래스가 메모리에 로딩 될 때, 정적내부클래스가 같이 로딩된다 !!
		// 		> 따라서 ! 내부클래스 접근 문법은 외부클래스 인스턴스 생성 없이 외부 클래스명만으로 접근이 가능하다.
		Outer.StaticInner staticInner = new Outer.StaticInner();
		System.out.println("innerStaticNum = "+StaticInner.innerStaticNum);

	}// main() method end

}// public class end

class Outer{ // 외부 클래스
	private int num = 10; // 인스턴스 멤버변수
	int num2 = 20; // 인스턴스 멤버변수
	static int num3 = 30; // 정적 멤버변수
	
	public void method() { // 인스턴스 멤버메서드
		// 인스턴스 멤버메서드에서는 인스턴스 멤버변수 및 메서드에 대해
		// 자유로운 접근이 가능하다.
		System.out.println("인스턴스 멤버변수 num = "+num);
		method2();
	}// method() method end
	
	public void method2() {
		System.out.println("인스턴스 메서드 method2()");
	}// method3() method end
	
	public static void method3() {
		//정적메서드 내에서는 인스턴스 멤버에 대한 접근이 불가하다.
//		System.out.println("인스턴스 멤버변수 num = "+ num); // 접근불가 !!
		// static키워드가 붙은 메서드가 멤버변수보다 앞서서 메모리에 등록되기 때문임.
		System.out.println("정적 멤버변수 num3 = "+num3); // static이 붙은 멤버변수에는 접근이 가능하다.
	}// method3() method end
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// 인스턴스 멤버 내부클래스 정의
	class Inner{// 중첩클래스 !! (인스턴스 멤버 내부클래스)
		int innerNum = 200;
//		static int innerNum2 = 200; // static 키워드 사용이 불가능하다.
		// >> static은 인스턴스 멤버 내부클래스보다 먼저 메모리에 올라가기 때문임!!
		public void innerMetnod() {
			// 인스턴스 멤버 내부클래스에서는 외부 클래스의 멤버에 자유롭게 접근이 가능하다.
			// >> 인스턴스 멤버 메서드에서의 접근 범위와 동일하다.
			method2();
		}// innerMetnod() method end
//		public static void innerMethod2() { // static 키워드 사용불가!! 컴파일 에러 !!
//		}// innerMethod2() method end
		
	}// Inner class end
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// 정적 멤버 내부클래스 정의
	static class StaticInner{
		int innerNum = 100;
		static int innerStaticNum = 200;
		public void innerMethod() {
//			System.out.println("외부 클래스의 인스턴스 멤버변수 num = "+num);
			// > 외부 클래스의 멤버변수에 접근 불가능!
			// > 정적멤버 내부클래스에서는 외부 클래스의 인스턴스 멤버에 접근 불가 !!
			//		>> 메모리 로딩시점이 다르기때문.
//			method2(); // 외부클래스의 멤버메서드도 호출 불가!
			System.out.println("외부클래스의 정적 멤버변수 num3 = "+num3); // static 키워드가 붙은 멤버변수는 호출 가능.
		}// innerMethod() method end
		
		public static void innerStaticMethod() {
//			System.out.println("내부 클래스의 인스턴스 멤버변수 innerNum = "+innerNum); 
			System.out.println("내부 클래스의 인스턴스 멤버변수 innerStaticNum = "+innerStaticNum); // static에는 접근 가능하다.
		}// innerStaticMethod() method end
		
	}// StaticInner class end
	
}// Outer class end
