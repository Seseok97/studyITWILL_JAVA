package static_;

public class Ex2_0313_static {

	public static void main(String[] args) {
		/*
		 * static 메서드 (=정적 메서드)
		 * - 메서드 정의 시, 리턴타입 앞에 static 키워드를 붙여서 정의.
		 * - 클래스가 메모리에 로딩될 때, static변수와 함께 메모리에 로딩되므로, 인스턴스 생성과는 무관함.
		 * - 클래스명만으로 접근 가능 (클래스명.변수명() 의 형태로 접근 가능!)
		 * 
		 * <static메서드 정의시 주의사항>
		 * - 인스턴스 생성 시점에서 생성되는 것은 static 메서드 내에서 접근이 불가하다!
		 * 1. 인스턴스 변수 사용 불가.
		 * 		> 원인: static 메서드가 로딩되는 시점은 클래스가 로딩되는 시점이며, 
		 * 				인스턴스변수는 인스턴스 생성 시점에 로딩되므로, static 메서드가 로딩되는 시점에는 존재하지 않는다!
		 * 				(인스턴스 변수보다 static메서드가 먼저 로딩되어, 
		 * 				static메서드 로딩 시점에는 인스턴스변수가 존재하지 않기 때문.)
		 * 2. 레퍼런스 this 또는 super 사용 불가.
		 * 		> 원인: static 메서드가 this,super보다 먼저 생성되기 때문.(위와 같다!!)
		 * 		> this >> 인스턴스와 같이 Heap메모리에 this()의 형태로 포함되어 있다. > '인스턴스와 같이' > static보다 늦게 생성됨.
		 * 
		 * 		>> 해결책! this.XXX / super.XXX 대신, 클래스명.XXX의 형태로 접근.
		 * 
		 * 3. 메서드 오버라이딩 불가(상속단원에서 배울것 !)
		 */
	}
}

class StaticMethod{
	
	//인스턴스 멤버변수 normalVar 선언(int형) > 10 초기화
	private int normalVar = 10;
	//정적 멤버변수 staticVar 선언(int형) > 20 초기화
	private static int staticVar = 20;
	
	//일반 메서드 normalMethod() method 정의 > 파라미터, 리턴값 X
	public void normalMethod() {
		System.out.println("일반메서드 normalMethod()");
		
		// 일반 메서드는 인스턴스가 생성되는 시점에 메모리에 로딩된다.
		System.out.println("일반 메서드에서 인스턴스변수 접근: "+normalVar);
		System.out.println("일반 메서드에서 static 변수 접근: "+staticVar);
	}
	
	//static 메서드 staticMethod() method 정의 > 파라미터, 리턴값 X
	public static void staticMethod() {
		System.out.println("정적메서드 staticMethod()");
		
		// static 메서드는 클래스가 생성되는 시점에 메모리에 로딩된다.
//		System.out.println("static 메서드에서 인스턴스변수 접근: "+normalVar); //에러로 인한 주석처리
		//컴파일에러 발생
		// > Cannot make a static reference to the non-static field normalVar
		// 인스턴스변수는 아직 메모리에 로딩되기 전이므로 접근이 불가능하다.
		System.out.println("정적 메서드에서 static 변수 접근: "+staticVar);
		
		//static 메서드에서 일반메서드 호출 불가 !! (변수와 원인 동일함)
//		normalMethod();//에러로 인하여 주석처리
		
		
		
	}
	//Getter / Setter  >>  alt shift s > r
	
	//인스턴스변수 normalVar에 대한 Setter 정의
	public void setNormalVar(int normalVar) {
		this.normalVar = normalVar;
	}
	//static변수 staticVar에 대한 Setter 정의
	public static void setStaticVar(int staticVar) {
//		this.staticVar = staticVar; // Err
		//Cannot use this in a static context
		// 레퍼런스 this는 인스턴스 생성시점에 생성되지만, 
		// static메서드가 로딩되는 시점에서는 레퍼런스 this가 존재하지 않기 때문!!
		
		StaticMethod.staticVar = staticVar;
		//레퍼런스 this 대신, 클래스명으로 static변수에 접근한다 !
	}
	
	
	
}





























