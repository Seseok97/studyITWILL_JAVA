package anonymous;

public class Ex3_0503_anonymous {

	public static void main(String[] args) {
		Window w = new Window(); // 버튼 2개를 가지는 Window 인스턴스 생성.
		w.button1.touch();
		w.button2.touch();

	}// main() method end

}// public class end

// 버튼의 클릭이벤트 처리

// Button 클래스 정의
class Button{
	static interface onClickListner{// 중첩 인터페이스 선언
		void onClick(); // 추상메서드 선언
	}//onClickListner end
	
	onClickListner listner; // 인터페이스타입 변수(필드) 선언
	public void setOnClickListener(onClickListner listner) { // 매개변수의 다형성
		this.listner = listner;
	}
	// > 외부에서 구현객체를 받아 필드에 대입!
	
	public void touch() {
		listner.onClick(); // 현재 설정되어 있는 구현객체의 onClick() 메서드 호출
	}
	// > 버튼 이벤트가 발생했을때( touch() 메서드가 호출 되었을때)
	// > 인터페이스를 통해 구현객체의 메서드를 호출(listener.onClick())
	
}// Button class end

// Window 클래스를 Button 2개를 가지고있는 창이라고 가정.
class Window{
	// 버튼 2개를 생성.
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입(익명객체를 활용!!!!)
	Button.onClickListner listener = new Button.onClickListner() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다!"); // 전화를 거는 동작 !
		}
	};
	
	public Window() { // 생성자 정의
		button1.setOnClickListener(listener); 
		
		//onClick() 메서드에 "전화를 겁니다!"가 오버라이딩 되어 있는
		// 익명객체를 매개변수를 통하여 전달.
		
		button2.setOnClickListener(new Button.onClickListner() {
		@Override
		public void onClick() {
			System.out.println("메세지를 겁니다!"); // 문자를 보내는 동작 !
			}
		});
	} // Window() method end
	
	
	
}// Window class end

// 기존 방식. 해당 방식은 재사용이 가능하기 때문에 메모리 낭비가 발생할 수 있다.
// >>> 익명객체로 대체!
//class CallButton implements onClickListner{
//	@Override
//	public void onClick() {}
//}




































