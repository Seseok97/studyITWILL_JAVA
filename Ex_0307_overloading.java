package overloading_;

public class Ex_0307_overloading {

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩(Method Overloading) = 메서드 다중정의
		 *  > 동일한 이름의 파라미터가 다른 메서드를 여러번 정의하는 것.
		 *  > 비슷한 기능을 수행 하지만, 전달받은 데이터의 타입이 다른 경우,
		 *    메서드 이름을 따로 정의하지 않고, 동일한 이름의 파라미터만으로 구분되는 메서드를 여러개 정의 하는 것.
		 *  > 주의!
		 * 	>> 메서드 시그니처 파라미터(이름, 리턴타입, 접근제한자)를 제외한 나머지는 동일하게 정의한다.
		 *  >>> 외부에서 메서드를 호출하는 시점에 이름이 동일한 메서드간에 전달되는 데이터(파라미터)만으로 각 메서드가 구분 되어야 한다.
		 * 
		 */
		System.out.println();
		// println() 메서드는 가장 흔하게 사용되는 오버로딩 메서드이다!!
		
		// Method Overloading이 적용되지 않은 경우
		NormalMethod nm = new NormalMethod();
		nm.add(10, 20);
//		nm.add(10.1, 20.2); //Err!! double타입은 전달불가.
		nm.addDouble(10.1, 20.2); 
		// 이와같이, add() 메서드는 같은 역할을 하지만 파라미터의 데이터타입으로 인하여 두 방법을 나누어 사용해야 한다. 
		
		System.out.println("-----------------------------------");
		
		// Method Overloading이 적용된 경우
		OverloadingMethod om = new OverloadingMethod();
		om.add(10,20);
		om.add(10.1,20.1);
		om.add(10,20,30);
		
		
	}//main() method end

}//public class end

//Method Overloading이 적용되지 않은 경우
class NormalMethod{
	//두 수를 전달받아 덧셈 결과를 출력하는 메서드를 정의!
	// 1. int형 정수 2개를 전달받을 경우
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}//add() method end
	
	// 2. double형 정수 2개를 전달 받을 경우
	public void addDouble(double num1, double num2) {
		System.out.println(num1+num2);
	}//addDouble() method end
	
	// 일반적으로 메서드명도 식별자에 해당된다 !! > 중복이 불가능하다.
	// >> 따라서, add() 와 addDouble() 메서드는 하는 일을 같지만 파라미터가 다르기 때문에, 다른이름으로 정의하였다.
	//  메서드 정의시 메서드명을 달리해야한다 !! >> 불편함을 초래함.
	public void printInt(int num) {
		System.out.println(num);
	}// printInt() method end
	public void printString(String str) {
		System.out.println(str);
	}// printString() method end
} //NormalMethod class end

//Method Overloading이 적용된 경우
class OverloadingMethod{
	//두 수를 전달받아 덧셈 결과를 출력하는, 오버로딩이 적용된 메서드를 정의!
	// 1. int형 정수 2개를 전달받을 경우
	public void add(int num1, int num2) {
		System.out.println("DATA TYPE: int");
		System.out.println(num1+num2);
	}//add() method end
	
	// 2. double형 실수 2개를 전달 받을 경우
	public void add(double num1, double num2) {
		System.out.println("DATA TYPE: double");
		System.out.println(num1+num2);
	}//add() method end
	
	// 3. int형 정수 3개를 전달받을 경우
	public void add(int num1, int num2, int num3) {
		System.out.println("DATA TYPE: int*3");
		System.out.println(num1+num2+num3);
	}//add() method end
	
//	//주의! 리턴타입만 다른 경우, 오버로딩 불가능!
//	public int add (int num1, int num2) {
//		//Duplicate method add(int, int) in type OverloadingMethod
//	}
//	//주의! 변수명만 다른 경우, 오버로딩 불가능!
//	public void add (int n, int n) {
//		//Duplicate method add(int, int) in type OverloadingMethod
//	}
	
	// println() 메소드 생각하면 된다 !!
	
}//OverloadingMethod class end




