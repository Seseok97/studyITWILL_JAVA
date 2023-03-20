package inheritance;

public class EX4_0320_inheritance {

	public static void main(String[] args) {
		/*
		 * 상속에서의 생성자.
		 * > 생성자: 클래스명과 이름이 같고, 리턴타입이 없는 메서드의 일종.
		 * > 생성자는 상속되지 않는다.
		 * >>> 상속을 받을 경우, 자신의 클래스 이름과 생성자 이름이 다르기 때문에, 생성자 정의 규칙을 위반하게 된다.
		 * 
		 * > 상속관계에서 인스턴스를 생성할 때, 서브 클래스의 인스턴스가 생성되기 전
		 *   슈퍼클래스의 인스턴스를 먼저 생성한 후, 서브클래스의 인스턴스를 생성한다.
		 * >>> 서브클래스의 생성자가 호출되면, 가장 먼저 슈퍼클래스의 생성자를 호출하여 슈퍼클래스의 인스턴스를 생성하고,
		 *     그 후에 서브클래스의 인스턴스가 생성되어 생성자 코드가 실행된다.
		 */
		
		Manager m = new Manager();
		/*
		 * Manager 인스턴스를 생성하는 과정.
		 * > 서브클래스의 인스턴스를 생성하는 과정에서, 서브클래스의 생성자에서 인스턴스 생성 전 슈퍼클래스 생성자 호출.
		 * >> 슈퍼클래스의 인스턴스가 먼저 생성된 후에, 서브클래스의 인스턴스가 생성된다.
		 * 
		 * 1) new Manager() 코드에 의해서, Manager() 생성자로 이동한다.
		 * 2) Manager() 생성자에서 슈퍼클래스 Employee 의 생성자 Employee() 호출 > super(); 문장에 의하여 실행됨. > 기본적으로 생략되어 있다 !
		 * 3) Employee() 생성자에서 슈퍼클래스 Object의 생성자 Object() 호출!
		 * 4) Object 인스턴스가 생성되고, Object() 생성자 내의 코드 실행됨.
		 * 5) Employee 인스턴스가 생성되고, 기본생성자 Employee() 내의 코드가 실행된다.
		 * 6) Manager 인스턴스가 생성되고, Manager() 생성자 내의 코드가 실행된다.
		 */
		
		System.out.println("--------------------------");
		
		// Employee 클래스의 이름, 연봉을 전달받는 파라미터 생성자는
		// Manager 클래스에 상속되지 않으므로,(Strinf, int) 형태로는 호출할 수 없다 !!!
//		Manager m2 = new Manager("홍길동",4000);
		// 에러로 인한 주석처리.
		// (String, int, String) 형태로 작성해야 호출이 가능하다 !!
		Manager m2 = new Manager("홍길동",4000,"개발팀");

	}// main() method end

}// public class end


class Employee{ // extends Object가 생략되어있다.
	String name;
	int salary;
	
	public Employee() {		// 기본생성자
		System.out.println("Employee() 생성자 호출됨!");
	} // 파라미터 생성자 코드 작성을 위한 주석처리 
	
	// 만약, 파라미터 생성자를 정의했을 때 기본 생성자가 없을 경우,
	// 서브클래스의 생성자에서 기본적으로 슈퍼클래스의 기본생성자를 호출하므로,
	// 서브클래스의 생성자에서 컴파일에러가 발생할 수 있다.
	// > 슈퍼클래스의 파라미터 생성자를 정의할 때, 기본 생성자도 정의를 해야 한다 !!

	// 이름, 연봉을 전달받아 초기화하는 파라미터 생성자 정의
	// alt+shift+s > o
	public Employee(String name, int salary) {
		super();	// Object 클래스의 기본생성자 호출.
		this.name = name;
		this.salary = salary;
	}
	 // 서브클래스는 부모클래스의 기본생성자를 호출하게 되는데, 파라미터 생성자를 정의하면 기본생성자가 사라지게 된다.
	 // > 해당 경우는 컴파일에러가 발생한다. >> 파라미터 생성자를 정의하는 경우, 기본생성자 정의가 필수적이다.
	
}// Employee class end

// Employee 클래스를 상속받는 서브클래스 Manager 정의
class Manager extends Employee{
	String depart;
	
	public Manager() {
		// 서브클래스의 생성자를 호출하게 되면, 내부적으로 가장 먼저 슈퍼클래스의 기본 생성자를 자동으로 호출한다!
		// > 슈퍼클래스 생성자의 작업이 종료된 후, 서브클래스 생성자의 작업이 수행된다.
		super(); // 슈퍼클래스인 Employee의 기본생성자 호출(원래는 생략된 상태!)
		// 컴파일에러를 방지하기 위해서, 항상 작성하는 편이 좋다.
		System.out.println("Manager() 생성자 호출됨!");
	} //Manager() method end

	public Manager(String name, int salary, String depart) {
		super(); // 가장 위에 위치하여야 한다.
		System.out.println("파라미터(name, salary, depart) 생성자 호출됨!");
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	
}// Manager class end
































