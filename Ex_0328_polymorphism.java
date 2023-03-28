package polymorphism;

public class Ex_0328_polymorphism {

	public static void main(String[] args) {
		/*
		 * 다형성 ploymorphism
		 * 
		 * 동적 바인딩
		 *  > 상속 관계에서 업캐스팅 후 메서드를 호출 할 때, 컴파일(번역) 단계에서의 실행대상과 실제 실행 단계에서의
		 *    실행 대상이 달라진 것.
		 *  > 참조변수의 타입과 무관하게, 실제 인스턴스의 메서드를 실행하게 됨.
		 */
		
		// super class type instance
		Parent p = new Parent();
		p.parentPrn();
		
		System.out.println("-------------------------------------");
		
		// sub class type instance
		Child c = new Child();
		c.childPrn();	// sub class method
		c.parentPrn();  // super class extended method
		
		System.out.println("-------------------------------------");
		
		// sub class type instance > super class type upcasting
		p = c; // Child >> Parent // = "Parent p = new Child();"
		p.parentPrn();
		// > Child 인스턴스의 오버라이딩 된 메서드가 호출됨!
		//
		// >메서드 호출 코드를 작성하는 시점(= 컴파일 시점)에서는
		//  참조변수 타입인 Parent 클래스의 parentPrn() 메서드를 호출하는 코드지만,
		//  실제 실행하는 시점에서 참조변수에 저장된 인스턴서가 Child 인스턴스이므로,
		//  실제 호출되는 메서드는 Child 타입의 오버라이딩된 메서드가 호출된다 !!
		//
		// > 컴파일 단계에서의 실행대상과 실행 단계에서의 실행 대상이 다를수 있다 !!
		
		
				
		
	}// main() method end

}// public method end

class Parent{
	public void parentPrn() {
		System.out.println("super class - parentPrn();");
		
	}
}

class Child extends Parent{
	public void childPrn() {
		System.out.println("sub class - childPrn();");
	}

	@Override
	// alt shift s > v
	public void parentPrn() {
		System.out.println("sub class -override- parentPrn();");
	}
	
	
}
