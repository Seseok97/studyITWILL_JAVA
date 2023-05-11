package lambda;

public class Ex2_0509_lambda {

	public static void main(String[] args) {
		/*
		 * 익명 객체를 생성하는 람다식.
		 * > 자바는 객체지향 언어 ! 객체없이 메서드 호출이 가능.
		 * > 람다식은 객체 없이, 인터페이스 구현만으로 메서드 호출이 가능하다. > 익명내부 클래스 덕분!
		 * > 익명내부 클래스 > 클래스 이름 없이, 인터페이스 자료형 변수에 
		 *   메서드 구현부를 생성하여 대입할 수 있다.
		 *   
		 * > 람다식으로 메서드를 구현해서 호출 > 컴퓨터 내부에서는 익명 클래스가 생성되고,
		 *   이를 통해 익명 객체가 생성되는 것.
		 */
		
		StringConcat concat = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
			}// makeString() method end
		};// StringConcat() end
		// > 내부적으로 익명객체가 생성되어, 메서드 호출이 가능!
		concat.makeString("Hello", "World!");
		
		/*
		 * 람다식으로 사용하는 지역변수
		 * > 람다식 코드에서는 외부 메서드의 지역변수를 수정할 수 없다.
		 *   >> 지역변수는 메서드 호출이 끝나면 메모리에서 사라지기 때문.
		 *      익명 내부 클래스에서 사용하는 경우, 지역 변수가 상수로 변하기 때문이다!
		 * 
		 */
		int i=100; // main() 메서드의 지역변수.
		
		StringConcat concat2 = (s,v) ->{
//			i = 200; // main() 메서드의 지역변수 i의 값을 수정하는 경우.
			// Local variable i defined in an enclosing scope must be final or effectively final.
			// final 취급을 받는 상황, 값 변경 불가. 사용은 가능하다.
			System.out.println(i);
			System.out.println(s+", "+v);
		}; 
		// > 내부적으로 익명객체가 생성되었고, 람다식으로 makeString()을 표현.
		concat2.makeString("Hello", "JAVA!");
		
		System.out.println("================================================================");
			
		/*
		 * 람다식의 실행 블록에서 변수참조(this)
		 * 
		 * > 람다식은 컴파일러에 의해 익명의 내부 클래스로 처리되기 때문에, 변수에 대한 참조규칙이 동일함.
		 * >> 외부클래스의 멤버를 자유롭게 사용할 수 있다.
		 * >> 자바 8 부터는 일반 로컬변수도 사용할 수 있는데, final 키워드가 적용된 것과 같이 새로운 값을 할당할 수 없다.
		 * 
		 * >> this의 사용법이 약간 다름.
		 * >>> 람다식의 this는 타겟 인터페이스가 아닌 외부 클래스를 나타낸다.
		 * >>> 따라서, 람다식 내에서의 this와 외부클래스의 this는 같은 값을 가진다.
		 */
		
		VariableUseTest vut = new VariableUseTest();
		vut.lambdaTest();
		
	}// main() method end

}// public class end

//===================================================================================================
@FunctionalInterface
interface MyFuncInterface{
	// 인터페이스는 상수와 추상메서드만 가질수 있다.
	int interfaceMember = 20; // 상수
	String method(String msg); // 추상메서드 (String을 리턴한다.)
}// interface end

class VariableUseTest{
	private int memberVar = 10; // 인스턴스 멤버변수
	
	public void useFIMethod(MyFuncInterface mi) { // 매개변수로 인터페이스형을 설정
		System.out.println(mi.method("홍길동"));
	}// method end
	
	public void lambdaTest() {
		int localVar = 20; // 로컬변수
		/*
		 * 출력결과 비교
		 * > 람다식 내부에서 this와 외부클래스.this는 같음을 알 수 있다.
		 * > 람다식에서의 this는 마치 해당되는 클래스(여기서는 VariableUseTest) 처럼 접근된다.
		 * > 익명의 내부클래스에서의 this는 해당 인터페이스 (여기서는 MyFuncInterface)처럼 접근된다.
		 */
		
		// 람다식을 사용한 경우
		useFIMethod((String msg) -> {
			System.out.println(this.memberVar); // 접근 가능.
			System.out.println(memberVar); // 접근 가능.
			
//			System.out.println(interfaceMember); // 접근 불가능.
//			System.out.println(this.interfaceMember); // 접근불가능.
			
			System.out.println("lambda.this: "+this);
			System.out.println("외부클래스.this: "+VariableUseTest.this); // 람다식의 this는 외부클래스의 this와 동일하다.
			System.out.println("변수참조 : "+localVar+" : "+memberVar);
//			localVar++;
			//Local variable localVar defined in an enclosing scope must be final or effectively final
			// 로컬변수의 수정은 불가하다.
			return "람다식: "+msg+", "+(++memberVar);
		});// lambda end
		
		System.out.println("====================================================================");
		
		// 익명객체를 사용한 경우(익명 구현객체)
		useFIMethod(new MyFuncInterface() {
			@Override
			public String method(String msg) {
//				System.out.println(this.memberVar); // 접근 불가능
				System.out.println(memberVar); // 접근 가능
				// >> 람다식을 사용한 경우의 this는 외부클래스의 this를 가리키기때문에 this.memberVar에 접근이 가능하지만,
				// >> 현재의 this 키워드의 경우(익명객체를 사용한 경우)  .. 는 아직 이해 못함
				
				System.out.println(interfaceMember);
				System.out.println(this.interfaceMember);
				
				
				System.out.println("익명객체.this: "+this);
				System.out.println("외부클래스.this: "+VariableUseTest.this);// 익명객체의 this는 외부클래스의 this와 다르다.
				System.out.println("변수참조 : "+localVar+" : "+memberVar);
//				localVar++;
				//Local variable localVar defined in an enclosing scope must be final or effectively final
				// 로컬변수의 수정은 불가하다.
				return "익명객체: "+msg+", "+(++memberVar);
			}// method end
		}); // useFIMethod method end
		
	}// method end
	
	
}// class end































