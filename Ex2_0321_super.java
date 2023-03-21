package super_;

public class Ex2_0321_super {

	public static void main(String[] args) {
		/*
		 * <상속에서의 생성자>
		 *  > 생성자는 상속되지 않는다.
		 *  	>> 생성자 이름은 자신의 클래스 이름과 동일한데, 만약 상속 받을 경우
		 *  	   생성자 이름이 부모클래스 이름이기 때문에, 생성자 규칙에 위배된다!!
		 *  
		 *  > 서브클래스의 인스턴스를 생성할때는, 자동으로 슈퍼클래스의 인스턴스를 먼저 생성한 후 서브클래스의 인스턴스가 생성됨.
		 *  	>> 이때, 서브클래스 생성자에서 슈퍼클래스 기본생성자를 자동 호출.
		 *  	>> 만약, 슈퍼클래스에 파라미터 생성자만 존재할경우, 서브클래스 생성자에서 컴파일 에러가 발생하게 된다 !!
		 *  
		 *  <생성자 super()>
		 *   > 슈퍼클래스의 생성자를 명시적으로 호출할 때 사용한다.
		 *   	>> 생성자 this()와 사용 방법 및 목적은 동일하다.
		 *   > 기본문법: super([데이터...]);
		 *   
		 *   	>> 목적 !!
		 *   	>>> 1) 슈퍼클래스 생성자 중 특정 생성자를 명시적으로 호출할 경우
		 *   		 > ex) 슈퍼클래스에 기본생성자 없이 파라미터 생성자만 정의 할 경우,
		 *   			   서브클래스 생성자에서 슈퍼클래스 기본 생성자 호출불가로 컴파일에러 발생!
		 *   			   > 이때, 슈퍼클래스의 파라미터 생성자를 명시적으로 호출하기 위해 사용.
		 *   
		 *   	>>> 2) 슈퍼클래스의 생성자에 멤버변수 초기화 코드가 존재할 경우
		 *   		 > ex) 서브클래스 생성자에서 슈퍼클래스의 멤버까지 초기화 하면 초기화 코드의 중복이 발생한다 !!
		 *   			   > 이 때, 슈퍼클래스의 멤버는 슈퍼클래스의 생성자에서, 서브클래스의 멤버는 서브클래스의 생성자에서
		 *   				 초기화 하여, 코드 중복을 제거하기 위해 사용한다.
		 *   
		 *   	>>> 주의 !! 생성자 super()은 반드시 생성자의 첫 문장에서 실행되어야 한다 !!
		 *   		> 따라서, 생성자 내에서 super() 과 this()를 동시에 사용할 수 없다 !
		 * 
		 */
		
		//Student 클래스의 인스턴스 생성
		Student s = new Student();

	}

}// public class end

class Person{
	String name;
	int age;
	
	public Person() {} // 기본생성자 정의(1)

	public Person(String name, int age) { // 파라미터 생성저 alt shift s > o
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person(String,int)생성자 호출됨!");
	}
	
}// Person class end

class Student extends Person{
	boolean isStudyMode;
	
	public Student() {
		// 서브클래스의 기본 생성자에서 슈퍼클래스인 Person 클래스의 기본 생성자를 자동으로 호출하게 된다.
		// > 만약 슈퍼클래스 생성자가 파라미터 생성자만 존재할 경우, 오류가 발생한다.
//		super(); // 그렇기때문에 << 얘는 보이지 않지만, 생성자 내에 포함되어 있다.
				 // 그래서 Person() 생성자 없이 파라미터 생성자만 존재한다면 오류가 발생한다!!
		// 해결! 1) 슈퍼클래스에 별도로 기본생성자를 정의한다.
		//       2) 서브클래스에서 슈퍼클래스의 파라미터 생성자를 명시적으로 호출.
		
//		super("홍길동",20); // 서브클래스에서 슈퍼클래스 파라미터 생성자 호출(2)
//		// 슈퍼클래스의 Person(String,int) 생성자를 호출하여 데이터를 전달함 !!
//		isStudyMode = true;
		
		// 슈퍼클래스의 생성자를 호출하지 않고, 자신의 다른 생성자를 호출하여 해당 생성자 내에서 다시 슈퍼클래스의 생성자를 호출해도 된다.
		this("홍길동",20,true); // 초기화 코드 중복 제거.
		
		System.out.println("Student() 생성자 호출됨!");
		
		// 생성자 super() 는 생성자 this()와 마찬가지로, 생성자 내에서 가장 먼저 실행되어야 한다 !!!!
//		super("홍길동",20); // 여기다가 하면 컴파일에러 발생 !!
	}
	
//	public Student(String name, int age, boolean isStudyMode) {
//		// Student 클래스 생성자에서 모든 멤버변수를 직접 초기화 하는경우
////		this.name = name;
////		this.age = age;
////		this.isStudyMode = isStudyMode;
//		
//		// name과 age 멤버변수를 초기화하는 코드는 이미 슈퍼클래스인 Person 클래스의 생성자의 초기화코드와 중복된다 !!
//		// >> 따라서!! 슈퍼클래스로부터 상속받은 멤버변수 초기화는 슈퍼클래스 내의 생성자에서 초기화 하고, 서브클래스의 멤버만 초기화를 직접 수행
//		// > 이때, 슈퍼클래스의 파라미터생성자를 호출하여 대신 초기화를 수행
//		
//		super(name,age); // 초기화코드 중복 제거 !! >> 슈퍼클래스 생성자에 name,age를 전달하여 초기화 시키고,
//		this.isStudyMode = isStudyMode;				// 자신의 멤버변수만 직접 초기화 시킨다.
//		
//		// 상속되는 멤버변수가 적으면 하나하나 기입해도 문제 없지만, 많아지는경우 !!! 사용해야 한다.
//	}
	
	// 단축키를 통하여 생성한 파라미터 생성자 (alt shift s > o > select super constructor(젤 위쪽 선택칸)을 Person(String,int)로 하면 됨)
	// 왜 단축키는 이렇게 만들어주는가 ???? >> 위에 작성해 본것을 토대로 이해 해야한다 !!
	public Student(String name, int age, boolean isStudyMode) {
		super(name, age);
		this.isStudyMode = isStudyMode;
	}
}// Student class end

































