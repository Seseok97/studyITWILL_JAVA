package anonymous;

public class Ex4_0503_anonymous {

	public static void main(String[] args) {
		/*
		 * 익명객체의 로컬변수 사용
		 * > 메서드의 매개변수나 로컬변수를 익명객체 내부에서 사용할 때 제한이 있다.
		 * > 익명객체는 메서드실행이 종료되면 없어지는것이 일반적이지만,
		 * 	 메서드가 종료되어도 계속 실행상태로 존재할 수 있다.(ex. 익명 쓰레드객체 사용)
		 * > 메서드의 매개변수나 로컬변수를 익명객체 내부에서 사용할 때, 매개변수나
		 *   로컬변수는 메서드 실행이 끝나면 스택메모리에서 사라지기 때문에,
		 *   익명 객체에서 지속적으로 사용할 수 없다.
		 * > 해당 문제의 해결을 위해, 자바는 컴파일 시점에서 익명객체에서 사용하는 매개변수나
		 * 	 로컬변수의 값을 익명객체 내부에 복사해두고 사용한다.
		 * > 매개변수나 로컬변수가 수정되어 값이 변경되면, 수정된 값과 익명객체에 복사해 둔 값이 달라진다!
		 * 	>> 매개변수나 로컬변수를 static으로 선언할 것을 요구하게 되어있다.
		 * > 자바 7 이전까지는 final키워드 없이 선언된 매개변수나 로컬변수를 익명객체에 사용 시,
		 *   컴파일 에러가 발생했었다.(자바 8부터 final키워드 생략!! > 생략된 것. 없어진거 아님!)
		 * > final 선언없이도 값이 수정 될 수 없도록, final의 특성이 부여되어 있다!
		 *   
		 */
		AnonymousClass ac = new AnonymousClass();
		ac.method(0,0);
	}// main() method end
	

}// public class end

interface Calculatable{
	public int sum(); // 추상메서드 선언
} // Calculatable end

class AnonymousClass{
	private int num;
	
	public void method(final int arg1, int arg2) { // 매개변수 arg1, arg2
		final int num1 = 0; // 로컬변수, final이라 초기값 부여함.
		int num2 = 0; // 로컬변수
		
		num = 10; // 필드변수
		
//		arg1 = 20; // final이라서 변경 불가. (매개변수)
//		num1 = 20; // final이라서 변경 불가.(로컬)
		
//		arg2 = 20; // 매개변수
		// 해당 매개변수를 익명객체에서 사용하려고 하는 경우, 에러가 발생한다.
//		num2 = 20; // 로컬변수
		
		// method() 내부에 익명구현객체 생성!
		// 위에서 정의한 Calculatable 인터페이스 활용!
		Calculatable cal = new Calculatable() {
			@Override
			public int sum() { // 추상메서드 구현
				int result = num + arg1 + arg2+ num1 + num2;
				return result;
			}
			// > 익명객체 사용간에 값의 변경이 발생하는 경우!!!! 에러발생!
			// 매개변수의 값을 변경한 코드를 지우면 된다.
		};
		
		System.out.println(cal.sum());
		
		
	}// method end
	
}// AnonymousClass end
