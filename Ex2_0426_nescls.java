package nested_class;

public class Ex2_0426_nescls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer2 out = new Outer2();
		out.method();

	}// main() method end

}// public class end


class Outer2{
	private int num = 10; // 인스턴스 멤버변수
	
	public void method() { // 멤버 메서드
		System.out.println(num);
		
//		public int num2 = 20; // 컴파일에러!
		// > 로컬변수에서는 접근제한자를 사용할 수 없다.
		// 외부에서 접근이 불가능하기 때문에, 접근제한자의 의미가 없기 때문!!
		
//		static int num3 = 30; // 컴파일에러 !
		// > 로컬변수에서는 static 키워드 사용이 불가능하다!
		
		
		// 로컬 내부클래스에 접근하기 위해서는, 클래스 선언부보다 아래쪽에서 접근해야 한다.
//		LocalInner localInner new LocalInner(); // 컴파일에러!
		// >> 아직 존재하지않는 메서드이기 때문!
		
		// 로컬 내부클래스 정의
		class LocalInner {
			String name = "LocalInnerClass"; // 로컬 내부 클래스의 인스턴스 변수
			
//			static int staticMember;
			// => 로컬 내부클래스에서는 static 변수를 사용할 수 없음
			// => The field staticMember cannot be declared static in a non-static inner type, 
			//    unless initialized with a constant expression
			
//			public static void staticMethod() {}
			// => 마찬가지로 로컬 내부클래스에서는 static 메서드를 사용할 수 없음
			
			public LocalInner() {
				System.out.println("LocalInner() 생성자 호출됨!");
			}
			public void print() {
				System.out.println("로컬 내부클래스의 인스턴스 멤버 메서드!");
			}
		} // LocalInner class end
		
		// 로컬내부 클래스의 인스턴스 생성 (일반 클래스처럼 사용이 가능하다 !)
		// >> 로컬 내부 클래스는 메서드 내에서 객체를 생성하고 사용해야 한다.
		LocalInner localInner = new LocalInner();
		System.out.println(localInner.name);
		
	}// method() end
	
	
	
}// Outer2 class end