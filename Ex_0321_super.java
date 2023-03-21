package super_;

public class Ex_0321_super {

	public static void main(String[] args) {
		/*
		 * 메서드 오버라이딩 및 멤버변수에 대한 오버라이딩
		 *  > 슈퍼클래스의 멤버변수와 메서드는 은닉되어 보이지 않게 된다.
		 *  > 서브클래스의 인스턴스를 통한 슈퍼클래스 멤버에 접근 불가능 !!!!
		 * 
		 * <레퍼런스 super>
		 * 슈퍼클래스의 멤버에 접근하기 위한 키워드(= 레퍼런스 변수!)
		 * > 레퍼런스 this와 마찬가지로, 서브클래스 인스턴스를 생성할 때 생성되며,
		 * >> 이때 자동으로 생성되는 슈퍼클래스의 인스턴스 주소를 저장하는 변수
		 * 
		 * > 주로 오버라이딩에 의해 은닉된 멤버변수 또는 메서드 접근 시 사용.
		 * > 기본문법: super.부모의 멤버변수 또는 super.부모의 메서드()
		 * 
		 */
		
		//Child2 class의 인스턴스 생성
		Child2 c = new Child2();
		System.out.println("우리집 TV: " +c.tv);
		c.watchTv();
		
		System.out.println("-----------------------------");
		
		// 레퍼런스 super를 통해 슈퍼클래스의 멤버에 접근한 메서드 호출
		c.watchParentTv();
		
		System.out.println("-----------------------------");
		
		ChildClass cc = new ChildClass();
		cc.method();
		

	}

}// public class end

class Parent2{
	String tv = "부모님이 구입한 TV";
	
	public void watchTv() {
		System.out.println("부모님 집에서 "+tv+" 보기!");
	}
}// Parent2 class end


//Parent2 class를 상속받는 Child2 클래스 정의
class Child2 extends Parent2{
	//슈퍼클래스로부터 상속받은 멤버변수와 동일한 이름의 변수를 선언하면,
	// 슈퍼클래스의 멤버변수는 은닉된다 !!
	String tv="내가 구입한 TV";
	
	// 슈퍼클래스로부터 상속받은 watchTV() 메서드 오버라이딩
	// 슈퍼클래스의 멤버메서드는 은닉된다 !!
	@Override
	public void watchTv() {
		System.out.println("서브클래스에서 오버라이딩된 watchTv() 메서드!");
		System.out.println("독립한 나의 집에서 "+tv+" 보기!");
	}
	
	public void watchParentTv() {
		// 현재 인스턴스 내에서 오버라이딩으로 인해 은닉된 슈퍼클래스의 멤버는
		// 레퍼런스 super를 통해 접근하면 사용이 가능하다 !!
		// >> 레퍼런스 this와 사용방법이 동일하다 !!
		
		// 1. 슈퍼클래스의 은닉된 멤버변수에 접근할 때.
		System.out.println("부모님 TV: "+super.tv);
		System.out.println("우리집 TV: "+this.tv);
		
		// 2. 슈퍼클래스의 은닉된 멤버메서드에 접근할 때.
		super.watchTv();
		this.watchTv();
		
	}
	
}// Child2 class end

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * 슈퍼클래스와 서브클래스 존재시!!
 * 서브클래스의 메서드 내에서 동일한 이름의 변수가 존재할 때 탐색과정
 * > 메서드 내에서 접근할 변수 종류 : 로컬변수, 자신의 멤버변수, 부모의 멤버변수
 * > 메서드 내에서 접근 순서
 * 	 >> 로컬변수 -> 서브클래스 멤버변수 -> 슈퍼클래스 멤버변수
 * > 최종적으로 Object 클래스까지 거슬러 올라가면서 탐색하여 없으면 오류 발생!!!
 * 
 * 
 * 
 * 
 */

class ParentClass{
	String X = "Parent"; // 슈퍼클래스의 멤버변수
}//ParentClass class end

class ChildClass extends ParentClass{
	String X = "Child"; // 서브클래스의 멤버변수 (오버라이딩)
	
	public void method() {
		String X = "method"; // 서브클래스의 메서드 내의 로컬변수.
		
		System.out.println("X= "+X); // 로컬변수
		// >> 만약, 로컬변수를 선언하지 않을경우 ! this.X와 동일하다.
		//(String X 주석처리 해보기!) >> 로컬변수가 아닌, ChildClass의 멤버변수 X가 지정이 된다.
		
		System.out.println("this.X= "+this.X); // 서브클래스 멤버변수 X
		// >>만약, ChildClass 클래스의 멤버변수를 선언하지 않을 경우, super.X와 동일하다.
		//(멤버변수 String X 주석처리 해보기 !!) >> 서브클래스의 멤버변수가 아닌, 슈퍼클래스의 멤버변수 X가 지정된다.
		
		System.out.println("super.X= "+super.X); // 슈퍼클래스 멤버변수 X
		// 이 때 super 클래스의 주석처리를 하게되면 에러가 발생한다.
		// > ParentClass 클래스에 String X가 선언되지 않은것으로 보기 때문 !!(ParentClass의 parent class인 Object class에도 없는것 ~~)
		
	}
	
}//ChildClass class end

































