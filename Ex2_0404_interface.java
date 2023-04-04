package interface_;

public class Ex2_0404_interface {

	public static void main(String[] args) {
		고래상어 고래상어 = new 고래상어();
		고래상어.번식();
		
		동물 동물 = 고래상어; // 업캐스팅
		동물.번식();
		
	}// main() method end

}// public class end

// 고래와 상어의 특징을 추상화 하여, "동물" 인터페이스로 정의
interface 동물{
	// 인터페이스 내의 모든 메서드는 추상메서드이다.
	public abstract void 번식();
	
} // 동물 interface end

// 헤엄을 칠수있는 특징을 갖는 인터페이스 "헤엄칠수있는" 정의
interface 헤엄칠수있는{}

// 동물 인터페이스를 상속받는 서브인터페이스 고래,상어 정의
// >> 인터페이스간의 상속은 implements가 아닌 extends 사용
// >> 인터페이스간의 상속은 다중상속이 가능하다.

interface 고래 extends 동물, 헤엄칠수있는{}
interface 상어 extends 동물, 헤엄칠수있는{}

// 고래와 상어 인터페이스를 동시에 상속받아 구현하는 서브클래스 고래상어 정의
// > 클래스에서 인터페이스 상속(구현) 받을 경우, implements 키워드를 사용하며,
//	 반드시 인터페이스가 가진 추상메서드를 오버라이딩하여 구현해야 한다.
// > 또한, 복수개의 인터페이스를 상속받을 수 있다!
class 고래상어 implements 고래, 상어{
	// 인터페이스 내에서는 슈퍼클래스(인터페이스)의 모든 메서드가 추상메서드이다!
	// >> 중복되는 메서드에 대한 구별 없이 직접 구현하면 된다.
	//  ++ 중복되는 메서드로 인한 혼란이 없다 ! > 다이아몬드 상속의 문제점이 사라진다.
	@Override
	public void 번식() {
		System.out.println("알을 낳아 번식!");
	} 
}// 고래상어 class end

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// <다이아몬드 상속에서의 문제점!!>

// 번식() 메서드를 갖는 슈퍼클래스 "동물2" 클래스를 정의하고,
// 고래와 상어클래스에서 동물클래스를 상속받기.

/*
abstract class 동물2{
	public abstract void 번식();
}// abstract class 동물2 end

class 상어2 extends 동물2{
	@Override
	public void 번식() {
		System.out.println("알을 낳아 번식");
	}
	
}// 상어2 class end

class 고래2 extends 동물2{
	@Override
	public void 번식() {
		System.out.println("새끼를 낳아 번식");
		
	}
}// 고래2 class end

// 다중상속을 허용하는 경우의 문제점
// >> 고래와 상어 클래스를 동시에 상속받는 "고래상어" 클래스 정의
class 고래상어2 extends 고래2, 상어2{
	// 외부, 또는 내부에서 고래와 상어 클래스가 공통적으로 갖는
	// 번식() 메서드를 호출하게 되면, 어느 객체의 번식() 메서드를 호출하는지
	// 분명하지 않기 때문에 !! 자바에서는 다중상속을 금지하고 있다 !!
}
*/
