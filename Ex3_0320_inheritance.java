package inheritance;

public class Ex3_0320_inheritance {

	public static void main(String[] args) {
		/*
		 * has - a 관계(포함) vs is - a 관계(상속)
		 * 1. has-a 관계(포함)
		 *  > A has a B, A가 B를 포함한다로 표현 가능한 관계.
		 *  > 가장 일반적인 객체간의 관계
		 *  > 특정 클래스내에서 다른 클래스의 인스턴스를 생성하여 해당 인스턴스를 다루는 관계.
		 *  >> 예) 자동차 - 엔진, 스마트폰 - 카메라
		 *  
		 *  2. is-a 관계(상속)
		 *   > A is a B, A는 B이다로 표현 가능한 관계.
		 *   > 특정 클래스가 다른 클래스를 상속받아, 해당 클래스의 멤버를 선언없이 다루는 관계.
		 *   >> 예) 자동차 - 소방차, 폴더폰 - 스마트폰
		 * 
		 */

	}// Main() method end

}// public class end

class Engine{
	int cc = 3000; // 배기량
}// Engine class end

// 자동차(Car) 와 엔진(Engine)의 관계는 ?? >> has-a(포함) 관계이다!
// Car has a Engine.

class Car{
	// 포함관계일 경우, 해당 클래스의 인스턴스를 통해 접근 가능한 관계.
	Engine engine = new Engine();
	// >> Engine 클래스의 인스턴스 생성
	
	String modelName = "그랜져";
	
	public void showCarInfo() {
		// 자신의 멤버변수에 접근시, 변수명만으로 접근 가능.
		System.out.println("모델명: "+modelName);
		
		//포함관계에 있는 클래스의 멤버에 접근 시, 참조변수를 통해 접근 가능.
		System.out.println("배기량: "+engine.cc);
//		System.out.println("배기량: "+cc); // Err!!
		
	}//showCarInfo() method end
	
}// Car class end

// 소방차와 자동차의 관계는 ?? >> is-a(상속) 관계이다!!
// FireEngine is a Car.

class FireEngine extends Car{
	int supplyLimit = 10000; // 급수량
	
	public void showFireEngineInfo() {
		//자신의 멤버에 접근
		System.out.println("급수량: "+supplyLimit);
		
		//부모의 멤버에 접근
		System.out.println("모델명: "+modelName);
		
		//부모와 포함관계인 Engine 객체의 멤버에도 접근 가능하다.
		System.out.println("배기량: "+engine.cc);
		
	}// showFireEngineInfo() method end
}// FireEngine class end

















