package class_;

public class Ex3_0221_class {
	//main() 메서드는 자바 프로그램의 시작점이다.
	// main() 메서드에서부터 객체를 생성하고 사용할 수 있다 !
	// 단, main() 메서드에서만 가능한 것은 아니고, main()메서드가 호출하는 다른 메서드에서도 사용 가능하다.
	public static void main(String[] args) {
		//정의한 클래스는 설계도에 해당한다 !!!!!!
		// 실제 사용을 위해서는 반드시 실체(객체)를 생성 하여야 한다.
		//
		//<클래스에 대한 인스턴스 생성 기본 문법>
		//클래스명 변수명 = new 클래스명();
		
		//<인스턴스 접근 기본 문법(멤버변수 접근 및 메서드 호출)>
		//참조변수명.멤버변수 또는 참조변수명.메서드()
		
		//Animal 클래스의 인스턴스 생성 과정
		// 1. Animal클래스 타입 참조변수 선언
//		Animal_0221 ani;
		// 2. Animal 클래스 인스턴스 생성 및 주소값(16진수) 저장
//		ani = new Animal_0221();
		
		// 위 두 문장을 한 문장으로 결합
		Animal_0221 ani = new Animal_0221();
		
		//Animal 인스턴스에 접근하여 멤버변수 사용 및 메서드 호출
		// > 인스턴스 접근을 위해서는 반드시 인스턴스 주소가 필요하다 !!
		// >> 인스턴스 주소를 담고 있는 참조변수(ani)를 통하여 접근이 가능하다.
		
		//1. Animal 인스턴스의 멤버변수 name에 접근하는 방법
//		name="알쥐"; // err
		// 참조변수명.멤버변수명
		ani.name = "알쥐";
		//ani 변수에 저장된 주소값을 가지는 인스턴스의 멤버변수 name에 "알쥐" 저장
		System.out.println("이름: "+ani.name);
		ani.age = 2;
		System.out.println("나이: "+ani.age+"살");
		//2. Animal 인스턴스 메서드 cry() 호출
		// > 리턴값,파라미터가 없는 메서드 !!
		ani.cry();
	


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() method end

}//Ex3 class end
