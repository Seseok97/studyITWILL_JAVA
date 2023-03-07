package constructor;

public class Ex_0307_constructor {

	public static void main(String[] args) {
		/*
		 * 파라미터 생성자
		 * > 생성자 호출 시점에서 전달해야 할 데이터가 있을 경우, 생성자 파라미터(매개변수)를 선언 할 수 있다.
		 * >> 메서드와 동일 !!
		 * > 전달받은 데이터는 인스턴스 변수를 초기화하는 용도로 사용 > 객체마다 다른 데이터를 가진 채로 인스턴스를 생성하기 위한 용도
		 * 
		 * <파라미터 생성자 정의 기본 문법>
		 * <생성자 정의 기본문법>
		 * [접근제한자] 클래스명(매개변수 선언 ..){
		 * 			// 생성자 호출 시점에 파라미터에 데이터를 전달하여, 인스턴스 내의 인스턴스 변수를 초기화 한다.
		 * 			인스턴스변수명 = 데이터;
		 * }
		 * 
		 * 파라미터 생성자 자동 생성 단축키 > alt + shift + s > o
		 * (단, 멤버변수가 하나도 없을 경우 자동생성창은 실행되지 않는다.)
		 * 
		 * 
		 * 
		 */
		
		Person p = new Person("홍길동", 20);
		p.showPersonInfo();
		
		Person p2 = new Person("이순신",44);
		p2.showPersonInfo();
		
//		Person p3 = new Person(); 
		// Err, The constructor Person() is undefined
		// 파라미터 생성자를 하나라도 정의할 경우, 컴파일러에 의해 기본 생성자가 자동으로 생성되지 않는다. > 기본생성자 호출 불가능!
		// 해결책: 기본 생성자를 따로 정의 하는 것 !!
		

	}//main() method end

}//public class end

class Person{
	String nation;
	String name;
	int age;
	
	// 생성자를 정의하지 않으면, 기본 생성자가 자동으로 생성된다.
//	public Person() {} // 기본생성자
	// 파라미터가 생길 경우, 기본생성자는 생기지 않는다.
	
	// String, int 타입 데이터를 전달받을 파라미터 생성자 정의
	public Person(String newName, int newAge) { 
		System.out.println("Person(String,int) 생성자 호출됨!");
		
		// 전달받은 파라미터값을 인스턴스변수에 저장
		name = newName;
		age = newAge;
		
		//국가명(nation)을 무조건 '한국'으로 고정하는 경우, 별도의 파라미터값을 전달받지 않고, 생성자 내에서 '한국'으로 초기화.
		nation = "대한민국";
	}//Person() method end
	public void showPersonInfo() {
		System.out.println("국적: "+nation);
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		
	}//showPersonInfo() method end
	
	// 단축키를 통하여 생성한 파라미터 생성자.(alt + shift + s > o)
//	public Person(String nation, String name, int age) {
//		super();
//		this.nation = nation;
//		this.name = name;
//		this.age = age;
//	}
	
}//Person class end
