package anonymous;

public class Ex_0426_anonymous {

	public static void main(String[] args) {
		/*
		 * 익명(anonymous) 객체
		 * 	> 클래스 이름이 없는 객체.
		 * 	> 클래스 선언과 객체의 생성을 동시에 하기 때문에, 단 한번만 사용될 수 있다!!
		 * 	> 오직 하나의 객체만을 생성할 수 있는 일회용 클래스이다 !!
		 * 	> 이름이 없기때문에, 생성자도 가질수 없다.
		 * 	> 익명객체를 만들기 위해서는, 어떤 클래스를 상속하거나 인터페이스를 구현해야 한다.
		 * 	> 부모클래스의 이름이나, 구현하고자 하는 인터페이스의 이름을 사용하여 정의해야 하기 때문에,
		 * 	  한번에 하나의 클래스로 상속받는 동시에 인터페이스를 구현하거나, 하나 이상의 인터페이를 구현할 수 없다!
		 * 	> 단 하나의 클래스를 상속받거나, 단 하나의 인터페이스만을 구현할 수 있다.
		 * 
		 * < 익명객체 문법 >
		 * new 슈퍼클래스이름(){
		 * 		// 멤버선언
		 * };
		 * 
		 * 또는
		 * 
		 * new 구현인터페이스이름(){
		 * 		// 멤버 선언
		 * };
		 * 
		 * // 둘 다 new 키워드와 세미콜론을 통하여 식별이 가능하다.
		 *
		 */

	}// main() method end

}// public class end

////////////////////////////////////////////////////////////////////////////////////////////
// 익명객체를 사용하지 않는 일반적인 상속관계
class NormalParents{
	public void wake() {
		System.out.println("7시에 일어남.");
	}// wake() method end
}// NormalParents class end

class NormalChild extends NormalParents{
	public void work() {
		System.out.println("출근함.");
	}// work() method end

	@Override
	public void wake() {
		System.out.println("6시에 일어남.");
		work();
	}// wake() method end
	
}// NormalChild class end















































