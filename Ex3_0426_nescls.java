package nested_class;

public class Ex3_0426_nescls {

	public static void main(String[] args) {
		/*
		 * 중첩 인터페이스(Nested Interface)
		 * > 클래스의 멤버로 선언된 인터페이스 !
		 * > 클래스 내부에 인터페이스를 선언하는 이유는, 해당 클래스와
		 *   긴밀한 관계를 맺는 구현 클래스를 만들기 위함임!
		 * > 인스턴스멤버 인터페이스와 정적(static) 멤버 인터페이스 모두 구현이 가능하다!
		 * > 인스턴스 멤버 인터페이스는 바깥 클래스 객체가 있어야 사용 가능하며,
		 *   정적 멤버 인터페이스는 바깥 클래스의 객체 없이 ! 바깥 클래스만으로 접근이 가능하다.
		 * > 주로 정적멤버 인터페스를 많이 사용하는데, UI 프로그래밍에서 이벤트를 처리하는 목적으로 많이 활용된다.
		 * 
		 * < 중첩 인터페이스 기본 문법 >
		 * class 바깥클래스명{
		 * 		[static] interface 안쪽인터페이스명{
		 * 		}
		 * }
		 * 
		 */

		Button btn = new Button(); // 바깥쪽 클래스의 인스턴스 생성.
		
		// 다형성을 통한 객체 변경
		btn.setOnClickListener(new CallListener()); // 전화걸기 버튼이 완성됨.
		btn.touch();
		
		btn.setOnClickListener(new MessageListener()); // 문자보내기 버튼이 완성됨.
		btn.touch();
		
		
	}// main() method end

}// public class end

// 중첩인터페이스는 안드로이드 프로그래밍에서 많이 사용한다.
// 클릭시 이벤트를 처리하는 클래스 Button 정의
class Button{
	static interface OnClickListener{ // 중첩 인터페이스 정의
		void onClick(); // 추상메서드	
	}// OnClickListner interface end
	OnClickListener listener; // 인터페이스타입 변수(필드) 선언
	
	public void setOnClickListener(OnClickListener listener) {
		// 다형성을 위한 OnClickListner 매개변수 선언
		this.listener = listener;
	}// setOnClickListner() method end // > 버튼의 역할을 지정하는 메서드.
	
	public void touch() {
		listener.onClick(); // 구현객체(클래스)의 onClick() 메서드 호출!
	}// touch() method end
	
}// Button class end


// OnClickListner 인터페이스를 구현(implements)하는 구현클래스 정의

// 전화걸기 버튼 터치의 경우!
//class CallListner implements OnClickListner{} // 컴파일 에러 !
class CallListener implements  Button.OnClickListener{
	// 중첩 인터페이스(정적 내부 인터페이스) 접근 시, 바깥클래스.안쪽인터페이스로 접근.

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}// onClick() method end
	
}// CallListner class end

// 문자보내기 버튼 터치의 경우.
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("문자를 겁니다.");
	}// onClick() method end
	
}// MessageListner class end














































