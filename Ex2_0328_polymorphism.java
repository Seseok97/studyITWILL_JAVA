package polymorphism;

public class Ex2_0328_polymorphism {

	public static void main(String[] args) {
		/*
		 * 다형성 (polymorhpism)
		 *  > 하나의 데이터타입 (참조변수) 로 여러 인스턴스를 참조하는 특성.
		 *  > 어떤 인스턴스를 업캐스팅 하여 슈퍼클래스 타입 변수로 다루면,
		 *    하나의 슈퍼클래스를 통하여 여러 서브클래스를 컨트롤 할 수 있다 !!
		 */
		
		// Circle instance c 생성
		Circle c = new Circle();
		c.circlePaint();
		
		//Rectangle instance r 생성
		Rectangle r = new Rectangle();
		r.rDraw();
		
		// Triangle instance t 생성
		Triangle t = new Triangle();
		t.design();
		
		System.out.println("-----------------------------------");
		
		// super class method 상속, + overriding
		// > 코드의 통일성 향상!!
		c.draw();
		r.draw();
		t.draw();
		
		System.out.println("====================================");
		
		// 코드의 통일성을 더 향상시키는 방법
		// 업캐스팅 활용
		// > Circle, Rectangle, Triangle의 공통 슈퍼클래스인 Shape 타입으로 세 인스턴스 컨트롤.
		// Circle > Shape 업캐스팅
		Shape s = new Circle();
		s.draw();// Circle 인스턴스의 draw() 메서드 호출
		// Triangle > Shape 업캐스팅
		s = new Triangle();
		s.draw();
		// Rectangle > Shape 업캐스팅
		s = new Rectangle();
		s.draw();
		
		System.out.println("-----------------------------------");
		
		// 다형성polymorphism을 배열에 적용시키는 경우
		// >> 슈퍼클래스 타입으로 배열을 생성하여, 배열의 각 인덱스에 각각의 서브클래스 인스턴스 저장 가능!
//		Shape[] sArr = new Shape[3]; // Shape타입 배열 3개 생성.
		// 0번 인덱스 > Circle instance 생성, 저장-
//		sArr[0] = new Circle(); 	// Circle 	 > Shape : UPCASTING!
		// 1번 인덱스 > Rectangle instance 생성, 저장
//		sArr[1] = new Rectangle();  // Rectangle > Shape : UPCASTING!
		// 2번 인덱스 > Triangle instance 생성, 저장
//		sArr[2] = new Triangle();   // Triangle  > Shape : UPCASTING!
		
		Shape[] sArr = {new Circle(), new Rectangle(), new Triangle()};
		
		// 배열의 각 인덱스에는 인스턴스 주소가 저장되므로,
		// 참조변수와 마찬가지로 배열명[인덱스].메서드명() 으로 호출이 가능하다 !
//		sArr[0].draw();
//		sArr[1].draw();
//		sArr[2].draw();
		
		// 반복문을 사용하여 draw() 메서드 호출
		for(int i=0;i<sArr.length;i++) {
			sArr[i].draw();
		} // for end
		
		System.out.println("-----------------------------------");
		
		// 메서드에 다형성 활용

		System.out.println(""
		+ "1. 이미 다형성이 적용된 배열을 메서드 파라미터로 전달");
		polymorphismDraw(sArr);

		System.out.println(""
		+ "2. 메서드 파라미터로 인스턴스 전달.");
		polymorphismDraw2(new Circle());
		polymorphismDraw2(new Rectangle());
		polymorphismDraw2(new Triangle());

	}// main() method end
	
	public static void polymorphismDraw(Shape[] sArr) {
		// 반복문을 사용하여, 배열 내의 모든 인스턴스의 draw() 메서드 호출
		for(int i=0;i<sArr.length;i++) {
			sArr[i].draw();
		} // for end
	}// method end
	
	public static void polymorphismDraw2(Shape s) {
		// 어떤 인스턴스가 전달 되더라도, Shape을 상속받는 instance인 경우 draw() 메서드는 공통으로 호출이 가능하다.
		s.draw();
	}// method end
	

}// public class end

// 여러 도형의 특징을 공통적으로 표현하는 Shape 정의

class Shape{
	// 여러 도형의 공통점인 '그리다' 기능을 수행하는 draw() 메서드 정의
	public void draw() {
		System.out.println("도형 그리기!");
	}
}// class end

// Shape class를 상속받는 Circle class.
// > draw() 메서드를 오버라이딩, "원 그리기" 출력!
class Circle extends Shape{
	public void circlePaint() {
		System.out.println("원 그리기!");				// Override를 사용하지 않는 경우.
	}

	@Override
	public void draw() {
		System.out.println("원 그리기!");
	}
	
}// class end

//Shape class를 상속받는 Rectangle class.
//> draw() 메서드를 오버라이딩, "사각형 그리기" 출력!
class Rectangle extends Shape{
	public void rDraw() {
		System.out.println("사각형 그리기!");			// Override를 사용하지 않는 경우.
	}
	
	@Override
	public void draw() {
		System.out.println("사각형 그리기!");
	}
	
}// class end

//Shape class를 상속받는 Triangle class.
//> draw() 메서드를 오버라이딩, "삼각형 그리기" 출력!
class Triangle extends Shape{
	public void design(){
		System.out.println("삼각형 그리기!");			// Override를 사용하지 않는 경우.
	}													//  통일성 X! >> 매번 메서드를 확인해야 하는 번거로움 발생.

	@Override
	public void draw() {
		System.out.println("삼각형 그리기!");
	}
	
}// class end
