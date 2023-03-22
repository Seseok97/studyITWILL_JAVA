package final_;

public class Ex_0322_final {

	public static void main(String[] args) {
		/*
		 * final 키워드
		 * > 대상의 변경이 불가능 하도록 저장. 변경의 최종을 의미한다.
		 * 
		 * 1) 변수에 final이 붙을 경우
		 * 		> 변수값 변경 불가! >> 저장된 값만 사용 가능. >>> 상수로 취급된다. (원주율'PI'가 대표적임.)
		 * 		> 일반 변수와 구별하기 위해 이름을 보통 대문자로 사용하며, 단어사이의 구분은 언더스코어(_)를 사용한다.
		 * 		(ex: MAX_NUM)
		 * 		> 초기화가 필수이다. 초기화를 하지 않으면 blank final 상수라고 하며, 생성자를 통해 초기화하면 사용이 가능하다.
		 * 		>> 목적: 객체마다 다른 상수 값을 가지기 위해서 !!
		 * 
		 * 2) 메서드에 final이 붙을 경우
		 * 		> 메서드 변경 불가 !! > 오버라이딩 금지.
		 * 
		 * 3) 클래스에 final이 붙을 경우
		 * 		> 클래스 변경 불가 !! > 상속 금지.(확장을 막는 것.)
		 * 
		 */
		
		//final 변수의 대표적인 예 : Math 클래스의 PI 상수.
		System.out.println("PI값 = "+Math.PI);
		// Math 클래스의 PI 상수값은 변경이 불가능하다.
//		Math.PI = 5.0; // 컴파일에러 !! 값 변경 불가.
		
		//final 클래스는 상속은 불가하나 사용은 가능하다.
		String str = new String();
		
		SubFinalClass sfc = new SubFinalClass();
		System.out.println(sfc.fc.num);

	}

}// public class end

//1. 변수에 final 키워드를 사용하는 경우
class FinalMember{
	// final 상수는 반드시 초기화가 필수다 !!
	final int finalMember = 10;
	
	// 만약 final상수를 초기화하지 않을경우 !!
	final int blankFinalMember; // 컴파일에러! The blank final field blankFinalMember may not have been initialized
								// 단, 생성자를 통해 초기화하는 경우 사용 가능하다 !!
	
	//blank final 상수를 초기화하는 생성자 정의 필수 !!
	public FinalMember(int blankFinalMember) {
		super();
		this.blankFinalMember = blankFinalMember; // blank final 상수 초기화.
	}
	
	public void change() {
//		finalMember = 99; // Err! The final field FinalMember.finalMember cannot be assigned
						  // final 키워드가 붙은 변수는 값 변경이 불가하다!
		// 에러로인한 주석처리
		System.out.println("finalMember: "+ finalMember); // 사용은 가능하다.
		
		final int finalLocalVar = 20; // 로컬변수에도 final 사용 가능.
//		finalLocalVar = 99; // 마찬가지로, 값 변경 불가.

	} // change() method end
	
	// 기존 값 변경은 불가능하지만, 사용은 가능하다 !
	public int getFinalMember() {
		return finalMember;
	}
}// FinalMember class end

//////////////////////////////////////////////////////////////////////////////////////////////////////

//2. 메서드에 final 키워드를 사용하는 경우
class FinalMethod{
	public final void finalMethod() { // 접근제한자와 리턴타입 사이에 final 키워드 작성
		// final method >> Overriding 불가 !!
		System.out.println("슈퍼클래스의 finalMethod()");
	}
	// 비교를 위한 일반 메서드 생성
	public void normalMethod() {
		System.out.println("슈퍼클래스의 normalMethod()");
	}
}// FinalMethod class end
// FinalMethod 클래스를 상속받는 SubFinalMethod 클래스 정의
// >> 메서드 오버라이딩을 테스트 해보자.

class SubFinalMethod extends FinalMethod{
	//alt shift s > v >> 메서드 오버라이드 단축키
	// >> normalMethod밖에 안나온다 !!
	// 직접 쳐보자.
	
//	@Override
//	public void finalMethod{
//		System.out.println("서브클래스에서 오버라이딩 된 finalMethod()");
//	}
	// 사용불가 !
	// 에러로 인하여 주석처리
	
	@Override
	public void normalMethod() {
		System.out.println("서브클래스에서 오버라이딩 된 normalMethod()");
		finalMethod(); // > 사용은 가능하다.
	}
}//SubFinalMethod class end

//////////////////////////////////////////////////////////////////////////////////////////////////////

//3. 클래스에 final 키워드를 사용할 경우

final class FinalClass{
	// final클래스 >> 상속 불가 !!
	int num = 10;
	
	public void method() {
		System.out.println("슈퍼클래스의 method()");
	}
	
}// FinalClass class end

// FinalClass 클래스를 상속받는 SubFinalClass 정의

//class SubFinalClass extends FinalClass {}
// The type SubFinalClass cannot subclass the final class FinalClass
// 컴파일에러가 발생한다 !! >> final 클래스는 상속받을 수 없다.

class SubFinalClass{
	// final 클래스는 상속관계(is-a) 형태 사용은 불가능하지만,
	// 포함관계(has-a) 형태로 인스턴스를 생성하여 사용하는것은 가능하다.
	FinalClass fc = new FinalClass();
//	fc.num;
}//SubFinalClass class end

//////////////////////////////////////////////////////////////////////////////////////////////////////

// final 클래스의 대표적인 예시 : java.lang.String, java.lang.Math 등!!
//class SubString extends String{} // String 클래스 상속 불가 !!
//class SubMath extends Math{} // Math 클래스 상속 불가 !!





























