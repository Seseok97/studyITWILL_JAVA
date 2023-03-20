package access_modifier_p2;

import access_modifier_p1.ParentClass;

public class OtherPackageChildClass extends ParentClass{
	public void useMember() {
		// 다른 패키지의 상속관계인 부모 클래스(ParentClass)의 멤버에 접근!
		//  >> 슈퍼클래스의 멤버에 접근할때는 참조변수 없이 접근 해야한다! 
		//  >> 다른패키지이므로, import문이 필요하다.
		this.publicVar = 10;	//public O
		this.protectedVar = 20;	//protected X > 다른패키지이지만, 상속관계이므로 접근 가능!!
//		this.defaultVar = 30;	//default X > 다른패키지 접근 불가
//		this.privateVar = 40;	//private X > 다른 클래스 접근 불가.
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 서브클래스에서 슈퍼클래스의 인스턴스 생성 후 참조변수를 통해 접근 시.
		// is-a 관계가 아닌, has-a 관계가 되어버린다 !! >> protect 접근 불가 !
		// > 즉, 상속관계가 아닌 별도의 인스턴스로 취급된다.(상속관계가 끊어지는 것.)
		
		ParentClass p = new ParentClass(); // 슈퍼클래스의 인스턴스 생성 후 참조변수를 사용하여 접근.
		
		p.publicVar = 10;	 
//		p.protectedVar = 20; // 상속관계가 사라지면서 접근이 불가능해졌다.
//		p.defaultVar = 30;
//		p.privateVar = 40;
	}

}// public class end
