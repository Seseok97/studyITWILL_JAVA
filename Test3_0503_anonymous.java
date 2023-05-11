package anonymous;

public class Test3_0503_anonymous {

	public static void main(String[] args) {
		// CheckBox 클래스의 인스턴스 생성
		// 인스턴스의 setOnSelectListener를 호출 시, 매개변수로
		// 익명객체를 전달
		// > select()가 호출되면, '배경을 변경합니다!' 가 출력.
		CheckBox checkBox = new CheckBox();
		
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다!");
			}
		});
		
		checkBox.select();

	}// main() method end

}// public class end

/*
 * CheckBox 버튼 생성
 * > class명: CheckBox
 * > 클래스 내부에 중첩인터페이스 OnSelectListener 정의
 * 	>> onSelect() 메서드 정의
 * > 다형성을 위해 선언된 중첩인터페이스 OnSelectListener의 listener 변수 선언.
 * > setOnSelectListener() 메서드 선언
 * 	>> 매개변수 onSelectListener 타입의 로컬변수를 사용.
 * > select() 메서드를 정의
 * 	>> select() 메서드를 호출하면, onSelet() 메서드가 호출되도록 구현!!
 */

class CheckBox {
	static interface OnSelectListener {
		void onSelect();
	}
	
	OnSelectListener listener;
	
	public void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	public void select() {
		listener.onSelect();
	}
}// CheckBox class end
