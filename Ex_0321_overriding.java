package overriding;

public class Ex_0321_overriding {

	public static void main(String[] args) {
		/*
		 * 메서드 오버라이딩(Method Overriding) = 메서드 재정의
		 *  > 슈퍼클래스로부터 상속받은 메서드를 서브클래스에서 재정의 하는것.
		 *  > 기본 슈퍼클래스의 메서드와 동일하게 생긴 메서드를 정의하게 되므로,
		 *    서브클래스에서는 더이상 슈퍼클래스의 메서드가 보이지 않는다.
		 *    >> 슈퍼클래스의 메서드를 덮어쓰기 때문에, 자신의 메서드만 보이게 된다.(슈퍼클래스 메서드 은닉)
		 *  > 슈퍼클래스의 메서드에 새로운 기능을 추가하는 등, 기존에 상속된 메서드내용을 변경하는 경우 사용.
		 *  
		 * <오버라이딩 규칙>
		 *  1. 상속관계 필수.
		 *  2. 메서드 시그니처(오버로딩할때 본거) : 메서드명, 리턴타입, 파라미터가 일치해야 한다.
		 *     > 단, 리턴타입은 부모와 같거나 서브클래스 타입으로 변경 가능.
		 *  3. 접근제한자는 같거나 넓은 범위로만 변경 가능. >> 좁아질 수 없다 !
		 *  
		 *  <오버라이딩 단축키>
		 *  Alt + Shift + S > V
		 *  단, 이미 오버라이딩 된 메서드는 표시되지 않는다.
		 */
		
		// Child 클래스의 인스턴스 생성
		
		Child c = new Child();
		c.childPrn(); 	 // 서브클래스에서 정의한 메서드
		c.patentPrn();	 // 슈퍼클래스로부터 상속받은 메서드
		
		System.out.println("================================================");
		
		//Person 클래스의 인스턴스 생성
		Person p = new Person();
		p.sleep();
		
		//Student 클래스의 인스턴스 생성
		Student s = new Student();
		s.eat();
		s.sleep(); // 같은 이름의 메서드이지만, 정의가 다르기때문에 출력문에서 차이가 난다.
				   // 오버라이딩된 sleep() 메서드 호출
		
		//주의!! @Override 어노테이션(Annotation)이 붙어 있을 경우!
		// > 오버로딩을 수행하거나(메서드 시그니처 변경) 오버라이딩 규칙 위반시 컴파일에러가 발생한다.
		// (틀린내용) must override or implement a supertype method
		// 재정의 용도로 사용할때는 @Override를 작성하여 의도하지않은 변경이 발생되지 않도록 할 수 있다.
		
		System.out.println("================================================");
		
		// Dog, Cat 인스턴스 생성 후 cry() 메서드 호출
		Dog dog = new Dog();
		dog.cry();
		Cat cat = new Cat();
		cat.cry();

	}

}// public class end

class Parent{
	public void patentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
	
	public Object parentPrn2() {
		System.out.println("슈퍼클래스의 parentPrn2()");
		return null;
	}
	
	public String parentPrn3() {
		System.out.println("슈퍼클래스의 parentPrn3()");
		return null;
	}
	
}// Parent class end

class Child extends Parent{
	// 오버라이딩이 실행 될 클래스(상속 받는 쪽)
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}
	
	public void patentPrn() {
		System.out.println("서브클래스에서 오버라이딩된 parentPrn()");
	}
	// 슈퍼클래스 Parent로부터 상속받은 patentPrn() 메서드 오버라이딩 !!!!
	// > 슈퍼클래스의 메서드와 이름, 리턴타입, 파라미터가 동일한 메서드 재정의!!
	// >> 슈퍼클래스가 가진 parentPrn() 메서드는 Child 인스턴스에서 보이지 않게된다 !(은닉)
	
	// 오버라이딩 할때, 슈퍼클래스의 접근제한자보다 좁아질 수 없다 !!!!!
	// > 부모가 public일 경우 >> 자식은 무조건 public만 지정 가능.
//	private Object parentPrn2() { 
//		//컴파일에러: Cannot reduce the visibility of the inherited method from Parent
//		System.out.println("서브클래스에서 오버라이딩된 parentPrn2()");
//	}
	// 에러로 인한 주석처리
	
	/////////////////////////////////////////////////////////////////////////////////////////
	
	// 오버라이딩 할 때, 슈퍼클래스의 리턴타입보다 좁은 리턴타입은 명시할 수 있다.
	public String parentPrn2() { // 리턴타입 변경! Object > String
		System.out.println("서브클래스에서 오버라이딩된 parentPrn2()");
		return null;
	}
//	public Object parentPrn3() { // 리턴타입 변경! String > Object
//		// 더 좁은 데이터타입으로 변경하였다.
//		//컴파일에러: The return type is incompatible with Parent.parentPrn3()
//		System.out.println("서브클래스에서 오버라이딩된 parentPrn3()");
//		return null;
//	}
	// 에러로 인한 주석처리

	
	//오버라이딩 단축키
	//alt +shift + s > v
	@Override // 매개변수를 추가하거나 리턴타입을 변경하는 등, 슈퍼클래스의 메서드 시그니처가 변경되는것을 막는다.
	public String parentPrn3() {
		// 정의부분은 변경하여도 문제없다.
		System.out.println("서브클래스에서 오버라이딩된 parentPrn3()");
		return null;
	}
	
}// Child class end

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Person{
	
	public Person() {
		System.out.println("Person() 생성자");
	}
	
	public void eat() {
		System.out.println("밥먹기!");
	}
	public void sleep() {
		System.out.println("잠자기!");
	}
}// class Person end

class Student extends Person{
	
	public Student() {
		System.out.println("Student() 생성자");
	}
	public void study() {
		System.out.println("공부하기!");
	}

	// Person 클래스의 sleep() 메서드를 오버라이딩.
	// >> "엎드려 잠자기!" 출력
	@Override
	public void sleep() {
		System.out.println("엎드려 잠자기!");
	}
	// 단축키 사용 기본형태.
//	@Override
//	public void sleep() {
//		// TODO Auto-generated method stub
//		super.sleep(); // = Person.sleep(); >> 슈퍼클래스의 메서드를 불러온다.
//	}
	
}// class Student end

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//동물(Animal) 클래스 정의

class Animal{
	String name;
	int age;
	public void cry() {
		System.out.println("동물 울음 소리");
	}
}// Animal class end

class Dog extends Animal{

	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	
}// Dog class end

class Cat extends Animal{

	@Override
	public void cry() {
		System.out.println("냐옹");
	}
	
}// Cat class end
