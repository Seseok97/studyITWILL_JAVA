package static_;

public class Ex_0313_static {

	public static void main(String[] args) {
		/*
		 * <자바 프로그램이 실행되는 과정>
		 * 0. 소스코드 작성(.java) + 컴파일 후 클래스 실행
		 * 1. 클래스 로딩(Stack(literal) - Heap(instance,Array) - Method Area(Class) 세가지 메모리 공간)
		 * 		> static  변수 및 메서드가 메모리에 로딩된다.
		 * 2. main() 메서드 호출(실행)
		 * 3. 인스턴스 생성(new 키워드)
		 * 		> 인스턴스 변수(Heap) 및 메서드(Method Area)가 메모리에 로딩된다.
		 * 4. 인스턴스 메서드 호출(실행)
		 * 		> 로컬변수가 메모리에 로딩된다.
		 * 5. 결과 출력
		 * 6. 프로그램 종료
		 * 
		 * <static 키워드>
		 * - 클래스, 메서드, 변수의 제한자로 사용.
		 * - 메서드 또는 변수에 static 키워드를 사용할 경우, 인스턴스 생성과 상관없이 클래스가 로딩되는 시점에
		 * 	 메모리에 로딩된다.
		 * 	 (클래스가 로딩되는 Method Area에 함께 로딩된다)
		 * 	 > 따라서, 참조변수 없이 클래스명만으로 멤버에 접근이 가능하다.
		 * 	 (= 인스턴스 생성 없이도 접근 가능한 멤버)
		 * - 클래스명.멤버변수명 형태로 접근이 가능하다.
		 * 
		 * 
		 * 
		 */
//		System.out.println("NormalMember: "+NormalMember.a);
		//Err! Cannot make a static reference to the non-static field NormalMember.a
		// 컴파일에러
		// static 미정의 인스턴스 멤버변수 a에 접근 하려고 하면 에러 발생 !!
		
		NormalMember n1 = new NormalMember(); // 인스턴스 생성
		NormalMember n2 = new NormalMember(); // 인스턴스 생성
		// > 두 개의 인스턴스가 생성되며 인스턴스 멤버변수도 각각 두개씩 생성된다.
		System.out.printf("n1.a: %d, n2.a: %d\n",n1.a,n2.a);
		System.out.printf("n1.b: %d, n2.b: %d\n",n1.b,n2.b);
		
		System.out.println("---------------------------------");
		//n1 인스턴스의 인스턴스 멤버변수 a의 값을 99로 변경
		//n1 인스턴스의 인스턴스 멤버변수 b의 값을 999로 변경
		
		n1.a = 99;
		n1.b = 999;
		System.out.printf("n1.a: %d, n2.a: %d\n",n1.a,n2.a);
		System.out.printf("n1.b: %d, n2.b: %d\n",n1.b,n2.b);
		//인스턴스 멤버변수인 a와 b는 인스턴스마다 생성되므로, 
		// 하나의 인스턴스에서 인스턴스 멤버변수 값을 바꾸더라도, 다른 인스턴스 멤버변수에는 아무런 영향이 없다 !!
		// > 생성된 메모리공간이 다르기 때문이다 !!!
		System.out.println("=========================================");
		
		//StaticMember 클래스의 인스턴스 생성 전에 static 멤버 접근
		System.out.println("StaticMember.a: "+StaticMember.a);
		// Heap 메모리 영역이 아니라, Method Area 영역에 저장한다 !!
		// > 인스턴스가 생성되지 않았지만, 이미 메모리에 로딩되어있는 상태이다 !!
		// >> 클래스명만으로 static변수에 접근할 수 있다.
		
//		System.out.println("StaticMember.a: "+StaticMember.b); 
		// err! 바로 사용 못한다! Heap 영역으로 호출해서 사용해야한다!
		System.out.println("---------------------------------");
		
		StaticMember s1 = new StaticMember(); // 인스턴스 생성
		StaticMember s2 = new StaticMember(); // 인스턴스 생성
		// 두개의 인스턴스 생성, 인스턴스 멤버변수도 두개씩 생성됨.
		
		System.out.printf("s1.a:%d, s2.a:%d \n", s1.a, s2.a);
		System.out.printf("s1.b:%d, s2.b:%d \n", s1.b, s2.b);
		s1.a = 99; // static 멤버변수 값을 변경
		s1.b = 999; // 인스턴스 멤버변수 값을 변경
		System.out.println("---------------------------------");
		System.out.printf("s1.a:%d, s2.a:%d \n", s1.a, s2.a);
		System.out.printf("s1.b:%d, s2.b:%d \n", s1.b, s2.b);
		
		// static 멤버변수 값(a)을 s1인스턴스에서 변경하게 되면, s2 인스턴스도 동일한 변수 값을 공유하기 때문에,
		// a를 불러오는 모든 값이 변경된다. > 하나의 인스턴스에서 변경하면 모든 인스턴스가 영향을 받는다 !!
		
		//heap에 들어가는 변수는 주소를 복사해서 사용하는거고, static 제한자가 붙은 변수는 값을 불러와서 사용하는 그거.. 맞나?
		s2.a = 1000;
		System.out.printf("s1.a:%d, s2.a:%d \n", s1.a, s2.a);
		
		//여기서 차이점.
		// static멤버는 참조변수명 대신 클래스명만으로 접근이 가능하다.
		StaticMember.a = 500; // >> a와 관련된 인스턴스의 값이 모두 500으로 변경된다.
//		StaticMember.b = 500; // static 변수가 아니기때문에 에러 !!
		
		//The static field StaticMember.a should be accessed in a static way
		// 이걸로 노란줄이 계속 뜨는데, 자바에서 권장하는 방식이 아니라서 그렇다.
		// 자바 컴파일러: 너 이거 MethodArea에 있는거지않냐. Heap에 새로 불러와서 사용하는건 두번 일하는거다 ~
		// 라고 하는것!
		StaticMember.a = 1226; // 이렇게 쓰면 훈수 안둔다.
		System.out.println("=======================================");
		
		//Static 멤버변수의 대표적인 예시.
		// > java.lang.Math 클래스. > js로 치면 내장함수같은거. 자바에 내장된 클래스임!!
		// java.lang.Math 클래스의 PI 변수!!!
		System.out.println("PI값: " + Math.PI); // Math 인스턴스 생성을 생략하고도 사용이 가능하다 !!
		
		
		
		
	}
	
	public static void method1() {/* main() method보다 먼저 메모리에 등록된다.(위 설명의 2번 참고) */};

}

class NormalMember{
	int a = 10;
	int b = 20;
	// 인스턴스 변수 (= 멤버변수 = 필드)
}

class StaticMember{
	static int a = 10;// static 멤버변수(= 클래스 멤버변수 = 정적 멤버변수)
	int b = 20; // 인스턴스 멤버변수
	
	
}


