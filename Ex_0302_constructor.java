package constructor;

public class Ex_0302_constructor {

	public static void main(String[] args) {
		/*
		 * 생성자(constructor)
		 * > 클래스를 사용하여 인스턴스를 생성할 때 호출되는 메서드의 형태!!
		 * > new 키워드 뒤에 생성자 호출 코드가 기술된다.
		 * 
		 * 		 Person p = new Person();
		 * 					    | 얘가 생성자임.
		 * 
		 * > 주로 인스턴스 변수를 초기화 하는 용도, 또는 인스턴스 생성 시 초기에 수행할 작업을 기술하는 용도.
		 * > 메서드와 형태는 유사하나 차이점이 두가지 존재.
		 * 	1) 선언부에 리턴 타입이 없다. (없는것 보다는 적지 않는것.)
		 * 	2) 생성자 이름이 클래스 이름과 동일하다.
		 * > 개발자가 클래스 정의시 생성자를 하나도 정의하지 않으면, 컴파일러에 의해 자동으로 기본 생성자(default)로 정해진다.
		 * > 생성자를 별도로 호출할 수 없으며, 반드시 new 키워드 뒤에만 지정 가능.
		 * 
		 * <생성자 정의 기본 문법>
		 * [접근제한자] 클래스명([매개변수 선언 ..]){
		 * 	// 생성자 호출 시점(인스턴스 생성 시점)에 수행할 작업 기술
		 *  // >> 인스턴스 변수 초기화 등
		 * }
		 * 
		 * <인스턴스 생성 기본 문법>
		 * 클래스명 참조변수명 = new 생성자명([데이터 ..]);
		 * 
		 */
		System.out.println("Person 인스턴스 생성 전");
		Person p = new Person();// Person 인스턴스 생성
		// new키워드에 의해 인스턴스가 생성될 때, Person() 형태의 생성자를 자동으로 호출하게 된다.
		
		//주의!
//		p.Person(); //err, 생성자를 별도로 호출할 수는 없다.
		
		System.out.println("Person 인스턴스 생성 후");
		
		//기존방식
		// p.name="홍길동";
		// p.age=20;
		// 생성자에서 미리 설정했기 때문에 필요없어짐.
		
		System.out.println("이름: " + p.name);
		System.out.println("나이: " + p.age);
		
		System.out.println("-----------------------------");
		
		Person p2 = new Person();
		
		p2.name = "이순신";
		p2.age = 44;
		
		System.out.println("이름: " + p2.name);
		System.out.println("나이: " + p2.age);
		
		System.out.println("-----------------------------");
		
		
		
		
		
		
		}// main() method end

}// Ex_0302_constructor class end

class Person{
	// 멤버변수
	String name;
	int age;
	
	// 생성자
	// 클래스 정의시 개발자가 별도의 생성자를 하나도 정의하지 않을 경우, 자바 컴파일러에 의해 기본 생성자가 자동으로 생성된다.
	// 	> 기본 생성자는 접근제한자가 클래스와 같고, 리턴타입은 없고, 이름은 클래스 이름과 같다.
	// 	> 매개변수도 없으며, 중괄호 블록{} 내에 수행할 코드가 없다.
//	public Person() {} // 기본 생성자(Default Constructor)
	
//	public Person() {
//		// 기본 생성자 내에서 생성자 호출 확인을 위한 출력문 작성
//		System.out.println("생성자 person() 호출됨!");
//	}
	
	//생성자의 기본 역할 = 주로 인스턴스 변수 초기화!
	// > 객체(인스턴스) 생성 시 기본적으로 가져야 하는 값을 설정하는 역할.
	// > 기본 생성자 내에서 멤버변수에 특정 값을 지정하여 객체 생성시 해당 데이터를 가진 채로 사용 가능하도록 한다.
	// >> 즉, 객체가 기본적으로 가져야 할 공통적인 없을 설정 하는 것 !!
	public Person() {
		System.out.println("생성자 Person() 호출됨!");
		// 인스턴스변수 name에 "홍길동" 저장, age에 20 저장
		name = "홍길동";
		age = 20;
		// 다른 클래스로 넘어갔을때, 호출해야할 필요가 사라진다.
	}
	
	
	
}//Person class end


