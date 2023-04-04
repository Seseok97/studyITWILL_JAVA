package interface_;

public class Ex_0404_interface {

	public static void main(String[] args) {
		/*
		 * 인터페이스(Interface)
		 * > 클래스가 아니다 !! > 선언시 class 키워드 사용x, interface 키워드를 사용하여 정의한다.
		 * > 인터페이스는 상수와 추상메서드만 가질 수 있다.
		 * 		>> 모든 멤버변수는 public static final이 붙은 상수로 취급된다.
		 * 		   > public static final 생략 가능!! > final  > 값 변경 불가
		 * 											   static > 클래스명만으로 접근 가능
		 * 											   public > 누구나 접근 가능 
		 * 		>> 모든 메서드는 public abstract가 붙은 추상메서드로 취급된다.
		 * 		   > public abstract 생략 가능!	     > abstract > 메서드 바디 x
		 * 											   public   > 누구나 접근 가능
		 *  > 추상클래스와 마찬가지로, 추상메서드를 포함하므로 객체 생성이 불가능하다!
		 *  	>> 단, 참조변수 타입으로 사용이 가능하다. >> 다형성을 활용한 업캐스팅 가능!
		 *  > 서브클래스(구현클래스)에서 인터페이스를 상속받아 구현해야하는 경우
		 *  	>> extends 키워드 대신 implements 키워드 사용!
		 *  	>> 클래스는 상속받아 확장(extends) 개념이 강하지만,
		 *  	>> 인터페이스는 상속받아 추상메서드들을 구현(implements)의 개념이 강하다.
		 *  > 클래스는 서브클래스에서 다중 상속이 불가능하지만, 인터페이스는 서브클래스에서 다중 상속(구현)이 가능하다!
		 *  	>> implements 키워드 뒤에 복수개의 인터페이스 지정이 가능하다.
		 *  
		 *  <인터페이스 정의 기본 문법>
		 *  [접근제한자] interface 인터페이스명{
		 *  	// 상수
		 *  	publid static final datatype memberName;
		 *  	// 추상메서드
		 *  	public abstract methodName();
		 *  }
		 *  <인터페이스를 상속받은(구현하는) 서브클래스(구현클래스) 선언 방법>
		 *  [접근제한자] class 클래스명 implements 인터페이스명{
		 *  	// 클래스 내용
		 *  }
		 *  
		 *  추가내용
		 *  > 만약, 인터페이스끼리 상속을 받는 경우 > ?
		 *  > 클래스는 서브클래스에서 다중 상속이 불가능하지만,
		 *  > 인터페이스는 서브클래스에서 다중상속(구현이 가능하다.)
		 *  
		 *  
		 *  
		 */
		
		// 왜 필요한가?? (자바의 정석)
		// 예시
		// > 테란 > 건물 > 배럭 
		//				 > 팩토리
		// 				 > 커맨드센터 // 공중에 뜨는 건물들
		//				 > 벙커 // 얘는 공중에 안뜸
		//
		// >> 일부 건물만 공중에 뜨는 속성을 부여받아야 하는데, 인터페이스를 통하여 구현을 강제하는것!
		//
		// >> 상속은 변수, 메서드를 상속받아 사용하는것이고,
		// >> 인터페이스는 상수, 추상메서드를 상속받아 구현하는것 !!
		
		// 추상클래스는 인스턴스 생성이 불가능하다.
//		MyClass mc = new MyClass(); // 자동완성(ctrl+space)로 만들면 익명객체가 생성된다.
									// > 인스턴스가 없는 추상객체를 자동으로 생성한다. (안드로이드에서 사용하는 개념!)
		//Err! Cannot instantiate the type MyClass
		// abstract class MyClass는 인스턴스 생성이 불가능!
		
		// 인터페이스도 인스턴스 생성이 불가능하다.
//		MyExInterface ni = new MyExInterface(); // 얘도 자동완성하면 익명객체 생성됨. 학습중이라서 생성 X
		//Err! Cannot instantiate the type MyExInterface
		// interface MyExInterface도 인스턴스 생성이 불가능!
		
		// 인터페이스를 수현한 서브클래스 (구현클래스) 인스턴스 생성
		MySubClass msc = new MySubClass();
		msc.method1();
		msc.method2();
		msc.method3();
		// 인스턴스 생성 가능!
		
		// 인터페이스 내의 모든 변수는 상수이므로, 값 변경이 불가하다!
		// >> 구현 클래스도 동일한 상수가 상속된다!
//		MyExInterface.NUM1 = 99; //상수
//		MySubClass.NUM2 = 99;	 //변경		//The final field MyExInterface.NUM2 cannot be assigned
//		msc.NUM1 = 99;			 //불가!!
		
		System.out.println("============================================================");
		
		// 인터페이스는 인스턴스 생성이 불가능하지만, 참조변수 타입으로 사용이 가능하다.
		// 구현 클래스의 인스턴스를 인터페이스 타입으로 업캐스팅이 가능하다.
		// >> 다형성 활용이 가능하다 !!
		MyExInterface mi2 = new MySubClass(); // 업캐스팅
		// 업캐스팅 후에는 참조영역이 축소된다 ! > 상속메서드만 호출 가능.
		// >> 인터페이스의 추상메서드를 모두 오버라이딩 했기 때문에,
		// >> 인터페이스가 가진 모든 메서드는 참조영역 축소 후에도 호출이 가능하다!
		mi2.method1();
		mi2.method2();
		mi2.method3(); // 단, 호출되는 메서드는 모두 MySubClass의 메서드이다!
		
		// 상수도 인터페이스에서 선언하였기 때문에, 업캐스팅 후에도 접근이 가능하다.
		System.out.println(mi2.NUM1);
		System.out.println(mi2.NUM2);
		
		// 상수는 인스턴스 참조변수를 통한 접근보다,
		// 클래스명 또는 인터페이스명으로 접근해야한다!
		System.out.println(MyExInterface.NUM1);
		System.out.println(MyExInterface.NUM2);

	} // main() method end

}// public class end


// 인터페이스 정의 (클래스 안에 인터페이스 정의 가능)
interface MyExInterface{ // 맨 앞에 접근제한자 default가 생략되어 있음.
	// 인터페이스 내의 모든 멤버변수는 상수(public static final)이다 !
	public static final int NUM1 = 10;
//	int NUM2;   // 값을 선언하지 않으면, 상수 선언이 불가능하기때문에 에러 발생!!
	int NUM2 = 20; 
	// public static final을 생략한 모습
	
//	public MyExInterface() {}
	// Err! Interfaces cannot have constructors
	// 인터페이스는 생성자를 가질수 없다!
	
	// 인터페이스 내의 모든 메서드는 추상메서드(abstract Method)이다!
	public abstract void method1();
//	public void method2() {}
	//Err! Abstract methods do not specify a body
	// 추상메서드는 바디{}를 가질수 없다!
	public void method2();
	// abstract 키워드를 생략한 모습.
	void method3();
	//public abstract 키워드를 생략한 모습.
	// method2(),method3() 둘 다 추상메서드임!!
	
}// MyExInterface interface end

// interface를 상속받아 구현하는 서브클래스(구현클래스) MySubClass 정의
// >> 서브클래스 정의시 클래스명 뒤에 implements 키워드를 쓰고, 인터페이스명 지정!
class MySubClass implements MyExInterface{
	// MySubClass는 추상메서드를 상속하기 때문에, 강제적으로 오버라이딩을 해줘야 함!!
	@Override
	public void method1() {
		System.out.println("서브클래스에서 구현한 추상메서드 method1()");
	}
	@Override
	public void method2() {
		System.out.println("서브클래스에서 구현한 추상메서드 method2()");
	}
	@Override
	public void method3() {
		System.out.println("서브클래스에서 구현한 추상메서드 method3()");
	}
	// Override end
	// 인터페이스에서는 method3() 메서드 정의시 접근제한자를 생략하였으나,
	// 오버라이딩을 통한 구현시 무조건 public 접근제한자만 사용 가능하다 !
	
}//MySubClass class end

abstract class MyClass{
	// 클래스의 모든 멤버변수는 상수가 아니며, 선언 방법에 따라 달라진다.
	
	// 인터페이스 <<차이점>> 추상클래스
	
	// 변수
	public static final int NUM1 = 10; // > 상수
	public int num2 = 20; // 인스턴스 멤버변수(상수 x)
	// 추상클래스는 멤버변수를 가질수 있다!
	
	// 생성자
	public MyClass() {} // 기본생성자
	// 추상클래스는 생성자를 가질수 있다!
	
	// 메서드
	public abstract void method1(); // 추상메서드
	// 추상메서드를 갖는 클래스는 반드시 추상클래스로 선언해야 한다!
	public void method2() {}; // 일반메서드
	// 추상클래스는 일반메서드를 가질수 있다!
	
}//MyClass class end
