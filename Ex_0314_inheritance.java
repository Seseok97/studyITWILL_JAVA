package inheritance;

public class Ex_0314_inheritance {

	public static void main(String[] args) {
		/*
		 * 상속(Inheritance)
		 * - is - a 관계가 성립하는 객체간의 관계
		 * - 슈퍼클래스(부모)의 모든 멤버를 서브클래스(자식)에서 물려받아,
		 * 	 !! 선언 없이 !! 사용하는 것.
		 * - 슈퍼클래스(Super class) = 부모클래스, 상위클래스, 조상클래스
		 * 	 서브클래스(Sub class) = 자식 클래스, 하위클래스, 자손클래스
		 *  - private 접근제한자가 지정되는 멤버는 상속 대상에서 제외된다.
		 *  - 생성자는 상속대상에서 제외된다.
		 *  	> 생성자의 이름은 자신의 클래스 이름이어야 하지만, 
		 *  	  상속받은 생성자는 부모 클래스의 이름이므로, 규칙에 위반된다.
		 *  	  (생성자는 클래스의 이름과 같아야한다!!)
		 *  - JAVA는 단일 상속만 지원한다.
		 *  	> 두 개 이상의 슈퍼클래스(부모)를 지정할 수 없다.
		 *  - 별도의 상속대상을 지정하지 않을 경우, java.lang.Object 클래스를 자동으로 상속받는다.
		 *  
		 *  <상속 기본 문법>
		 *  class 서브클래스명 [extends 슈퍼클래스명] {}
		 *  
		 *  - 상속대상 미지정의 경우, 자동으로 java.lang.Object 클래스를 상속받는 것 !!
		 *  	> java.lang.Object를 자바의 최상위 클래스라고 한다 !!
		 */
		
		//Sub class Child 인스턴스 생성.
		Child c = new Child();
		c.childPrn(); // Subclass에서 직접 정의한 메서드.
		// Child 클래스는 자신의 클래스 내의 멤버 뿐만 아니라,
		// 슈퍼클래스인 Parent 클래스의 멤버도 아무런 선언없이 사용이 가능하다 !!
		c.num = 10;			//Superclass Parent로부터 상속받은 멤버변수
		c.parentPrn();		//Superclass Parent로부터 상속받은 멤버메서드
		
		c.showNum();
		
		System.out.println("=========================================");
		
		// 아버지 클래스의 인스턴스 생성
		아버지 아버지 = new 아버지();
		System.out.println("아버지의 자동차: "+아버지.자동차);
		아버지.노래하기();
		// 할아버지 클래스로부터 상속받은 멤버
		System.out.println("------");
		System.out.println("아버지의 집: "+아버지.집);
		아버지.그림그리기();
		
		System.out.println("------------------------------------------");
		
		//나 클래스의 인스턴스 생성
		나 나 = new 나();
		
		// 나 클래스 자신의 멤버
		System.out.println("폰: "+나.폰);
		나.프로그래밍();
		// 아버지 클래스로부터 상속받은 멤버
		System.out.println("------");
		System.out.println("내 자동차: "+나.자동차);
		나.노래하기();
		// 할아버지 클래스로부터 상속받은 아버지 클래스로부터 상속받은 멤버
		System.out.println("------");
		System.out.println("내 집: "+나.집);
		나.그림그리기();
		

		
	}//main() method end

}//public class end

//Super class에 해당하는 Parent class 정의
class Parent{	// class Perent extend Object와 동일함.
	int num; // Super class의 멤버 변수
	
	// Super class의 멤버 메서드
	public void parentPrn() {
		System.out.println("Super class의 patentPrn()");
	}
	
	private int p_num;
	// private 접근제한자로 인하여 상속 불가!
}

//Super class인 Parent class를 상속받는 Sub class, Child 정의.
class Child extends Parent{
	//Parent class를 상속받게 되면,
	// Child class에서 선언하지 않은 멤버(=Parent의 멤버)도 사용 가능해진다.
	public void childPrn() {
		System.out.println("Sub class의 childPrn()");
	}
	public void showNum() {
		System.out.println("부모로부터 상속받은 멤버변수 num = "+num);
	}
	
//	public void showP_num() {
//			System.out.println("부모로부터 상속받은 멤버변수 p_num = "+p_num);
//	}
	
}

class 할아버지 {
	String 집 = "고층아파트";
	String 티비 = "최신형 티비";
	
	public void 그림그리기() {
		System.out.println("그림을 잘 그린다 !");
	}
}

//할아버지 클래스를 상속받는 아버지 클래스 정의
// 멤버변수: 자동차("스포츠카")
// 메서드: 노래하기("노래를 잘 하신다 !") 출력
class 아버지 extends 할아버지{
	String 자동차 = "스포츠카";
	
	public void 노래하기() {
		System.out.println("노래를 잘 한다!");
	}
}
//아버지 클래스를 상속받는 나 클래스 정의
// 멤버변수, 메서드 하나씩 정의
class 나 extends 아버지{
	String 폰 = "스마트폰";
	
	public void 프로그래밍() {
		System.out.println("프로그래밍을 잘 한다!");
	}
	
	
	
}


























