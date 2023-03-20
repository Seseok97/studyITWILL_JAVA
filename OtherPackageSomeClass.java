package access_modifier_p2;

import access_modifier_p1.ParentClass;

public class OtherPackageSomeClass {
	public void useMember() {
		// 다른 패키지의 상속관계가 아닌 다른 클래스에 접근!
		//  >> 인스턴스 생성 후 참조변수를 통해 접근해야 함!! >> has-a 관계 
		//  >> 다른패키지이므로, import문이 필요하다.
//		access_modifier_p1.ParentClass p = new ParentClass(); // import문 미사용
		ParentClass p = new ParentClass(); 					  // import문 사용.
		p.publicVar = 10;	 //public O
//		p.protectedVar = 20; //protected X > 다른패키지이고, 미상속이라 접근 불가.
//		p.defaultVar = 30;	 //default X > 다른패키지 접근 불가
//		p.privateVar = 40;	 //private X > 다른 클래스 접근 불가.
		// 에러로 인한 주석처리
	}

} // public class end
