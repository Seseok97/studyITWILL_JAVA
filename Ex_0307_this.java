package this_;

public class Ex_0307_this {

	public static void main(String[] args) {
		/*
		 * this 키워드
		 * > 자신의 인스턴스 주소값을 저장하는 참조 변수
		 * >> 자바에 의해서 자동으로 생성된다. 개발자 생성 X
		 * > 모든 인스턴스 내에는 this가 존재하며, 자신의 인스턴스 주소가 저장되어 있다!
		 * > 즉, 인스턴스마다 this에 저장된 값이 다르다.
		 * 
		 * 1. 레퍼런스 this
		 * 	> 자신의 인스턴스 내의 멤버에 접근(멤버변수, 멤버메서드)
		 * 	> 주로, 로컬변수와 인스턴스(멤버) 변수의 이름이 같을 때, 인스턴스 변수를 지정하는 용도로 사용한다.
		 * 
		 * 	< 레퍼런스 this 사용 기본 문법>
		 * 	자신의 클래스 내의 생성자, 또는 메서드 내에서
		 * 	this.인스턴스 변수명 또는 this.메서드명 의 형태로 사용한다.
		 */
		
		Person p = new Person("홍길동",20);
		p.showPersonInfo();
//		p.name = "이순신"; // err, private 접근제한자!
		
		p.setName("이순신");
		p.setAge(44);
		p.showPersonInfo();		
		
		
		
	}//main() method end

}// public class end

class Person{
	private String name;
	private int age;
	
	// 생성자 단축키(alt+shift+s > o)
	public Person(String name, int age) {
//		super(); // 아직 학습하지 않아서 주석처리 !
		this.name = name;
		this.age = age;
		//왜 this.~~ 으로 지정을 해야하나?
//		name.name = name; // err
//		name = name; // err은 아니지만 의도대로 작동하지 않는다.
		// > this로 지정하지 않으면 class안의 멤버변수가 아니라 로컬변수로 먼저 인식해버린다! 
		// 그러니까 this.은 멤버변수, 멤버메서드임을 자바 컴파일러에게 알리는 것 !!
		// 변수명이 서로 다른경우에는 필요없다!
		
		
		
	}//Person() method end
	
	// getter/setter 단축키(alt+shift+s > r)
	// 멤버변수 name에 대한 Gettrt 메서드 정의
	public String getName() {
		// 로컬변수와 멤버변수의 이름이 중복되지 않는다!
		// > 레퍼런스 this는 생략이 가능해진다.
		return name; // return this.name과 동일한 것 !!
	}
	
	//멤버변수 name 에 대한 Setter 메서드 정의
	public void setName(String name) {
		// 메서드 내의 로컬변수와 클래스 내의 멤버변수의 이름이 동일 할 경우, 메서드 내에서 변수 지정 시 로컬변수가 지정되어 버린다.
		// 그러니까 아래 식이 name = name; 이라면, 로컬변수 name의 값을 다시 로컬변수 name에 저장한 것과 같다.
		
		// 로컬변수와 멤버변수를 구별하기 위해서, 멤버변수 옆에 레퍼런스 this를 사용하여 해당 인스턴스에 접근하는 코드로 사용해야 한다.
		// 외부에서 멤버변수 name 에 접근 시 참조변수명.name 형태로 접근하듯이, 내부에서 멤버변수 name에 접근 시 this.name 형태로 접근하는 것!
		
		this.name = name; // 로컬변수 name 의 값을 멤버변수 name의 값에 저장하는 것!!.
		name = name;
		// 자세히보면 색도 다르다.
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//showPersonInfo() 메서드를 정의하여 이름과 나이를 출력!
	public void showPersonInfo() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
	
	
}//Person class end
