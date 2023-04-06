package wrapper_class;

public class Ex2_0405_wrpcls {

	public static void main(String[] args) {
		/*
		 * 오토 박싱 (Auto Boxing)
		 * > 기본 데이터타입 > Wrapper 클래스타입 객체로 '자동으로' 변환하는 기능. > 자동아니면 그냥 박싱이라고 한다.
		 * 		>> ex) int > Integer, char > Character ...
		 * 
		 * > Java 1.5버전부터 변환과정을 생략해도 자동으로 변환을 수행하도록 변경되었다.
		 * 
		 * 오토 언박싱(Auto Unboxing)
		 * > Wrapper 클래스타입 객체 > 기본 데이터타입 으로 자동으로 변환하는 기능
		 * 		>> ex) Integer > int, Character > char ...
		 * 
		 */
		
		// 기본데이터타입 변수 선언
		int num1 = 10; // 정수 데이터 10을 기본 데이터타입 변수 num1에 저장!
		int num2;
		
		// 기본데이터타입 변수는 그대로 출력하면, 저장된 정수데이터가 출력된다.
		// >> 변수에 저장된 데이터가 실제 사용하는 데이터 !!
		System.out.println("기본 데이터타입 변수 num1의 값 ="+num1);
		
		// Integer 타입 변수 선언 및 객체 생성
		Integer n1;
//		Integer n2 = new Integer(20); 
		// 정수 20을 갖는 인스턴스를 생성하고, 해당 주소값을 Integer타입 참조변수 n2에 저장.
		
		Integer n2 = new Integer("20");
		// 문자열로 된 정수를 실제 정수로 변환.(데이터타입은 String이다.)
		
		System.out.println("참조타입 변수 n2의 값 = "+n2); // toString() 메서드 생략되어있음 !!
		// 참조데이터타입 변수는 그대로 출력하면 원래 주소값이 출력되어야 하지만, 
		// Wrapper 클래스에는 toString() 메서드가 오버라이딩 되어 있어, 객체가 저장한 값을
		// 문자열로 리턴하기때문에 데이터 출력이 가능하다!
		
		System.out.println("----------------------------------------------------------");
		
		// 기본 데이터타입은 Stack 공간에 실제 데이터 형태를 직접 관리하지만,
		// 객체는 Heap 공간에 실제 데이터가 저장되고,
		// 해당 주소값을 Stack 공간에서 관리한다.
		// > 기본 데이터타입 변수(Heap)와 참조 데이터타입 변수(Stack)는 호환이 불가능하다!
		// 따라서 !! 기본 데이터타입 <<--->> 참조 데이터타입 메서드를 활용해야 했다!
		
		n1 = Integer.valueOf(num1); // 해당 메서드는 static  키워드를 가지고 있다.
		// int형 데이터를 Integer타입 객체로 변환하여 저장.
		System.out.println(num1+", "+n1);
		System.out.println("num1 + n1 = "+num1 + n1);
		
		// 오토박싱 기능이 없을때 하던 방식.(인듯??? n1 선언 위에 n1 = num1 대입하니까 값 잘 나왔음. 버전 올라가면서 안해도 되는거 아닐까?)
		
		
		// 0405
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// 0406
		
		// Java 1.5부터 기본형 > Wrapper 클래스 타입으로 변환시,
		// 메서드 호출 > 변환 과정을 생략하고, 자동으로 변환을 수행하도록 변경되었다.
		// >> 대입연산자를 통한 직접 대입이 가능하게 되었다 !
		
		n1 = num1; // 기본 데이터타입을 자동으로 Integer 타입으로 변환하여 대입하였음. >> 오토박싱 (Auto Boxing)
		
		// Heap 공간에 저장된 Wrapper 클래스타입 객체를 기본형 변수에 저장할 경우
		num2 = n2.intValue(); // Integer객체 > int 타입으로 변환하는 메서드 (예전 방식)
		// > 오토 언박싱을 활용할 경우, 자동으로 변환을 수행해 준다.
		num2 = n2; // > 오토언박싱.
		
		System.out.println(num2+" , "+n2);
		
		System.out.println("-----------------------------------------");
		
		int num3 = 10;
		Integer n3 = 20;
		System.out.println(num3+n3);
		// >> 기본데이터타입과 Wrapper 클래스타입간의 연산을 수행할 경우, Wrapper 클래스 타입 객체를 오토언박싱 후 연산을 수행한다.
		
		// Object타입 변수에 기본 데이터타입도 저장 가능하다.
		// > 단, 기본 데이터타입 >> Wrapper 클래스 타입으로 오토박싱 후
		// 	 다시 Wrapper 클래스타입 객체 > Object타입으로 업캐스팅이 일어난다!
		Object o = 10; // > 원래는 10이라는 값은 참조변수에 넣을수 없다! > 오토박싱이 실행되었기 때문에 가능해진 것.
		System.out.println(o); // o.toString() < 이게 생략된 상태인 것.
		
		
		
		
		
		
		
	}// main() method end

}// public class end






































