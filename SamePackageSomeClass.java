package access_modifier_p1;

public class SamePackageSomeClass { // extends 없다 !! 상속 아님
	
	public void useMember() {
		// 같은 패키지 내의 다른 클래스(ParentClass)의 멤버 접근
		// >> 인스턴스 생성 후 참조변수를 통해 접근해야 한다 !! >> has-a 관계
		// >> 같은 패키지이므로, import문 필요 없음.
		ParentClass p = new ParentClass();
		p.publicVar = 10;	 //public O
		p.protectedVar = 20; //protected O
		p.defaultVar = 30;	 //default O
//		p.privateVar = 40;	 //private X > 다른 클래스 접근 불가.
		// 에러로 인한 주석처리
	}

}// public class end
