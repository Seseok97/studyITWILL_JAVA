package string_class;

public class Ex2_0411_strcls {

	public static void main(String[] args) {
		/*
		 * StringBuffer 와 StringBuilder
		 * > String 클래스는 한번 생성되면 그 내부의 문자열이 변경되지 않는다.
		 * > String 클래스를 사용하여 문자열을 계속 연결하고나 변경하는 프로그램을 작성하면 메모리 낭비가 심해진다!
		 * 
		 * > 이때 사용하는것이 StringBuffer / StringBuilder이다.
		 * > 두 클래스는 큰 차이는 없으나,
		 * 		>> 쓰레드가 동작하는 멀티쓰레드 프로그램인 경우 문자열의 안전한 변경을 보장하는 StringBuffer를 사용한다.
		 * 		>> 쓰레드가 동작하지 않는 프로그램이라면 실행속도가 좀 더 빠른 StringBuilder를 사용한다.
		 */
		String str = new String("Java");
//		System.out.println("str 문자열 주소: "+ System.identityHashCode(str));
//		// 인스턴스가 생성되었을때 메모리 주소: 1130478920
//		System.out.println(str);
//		
//		str = str+" and";
//		System.out.println("str+\"and\" 문자열 주소: "+ System.identityHashCode(str));
//		// 결합연산자로 문자열을 저장 후 참조하는 메모리주소: 1982791261
//		System.out.println(str);
//		// >> "Java and"의 문자열을 갖는 메모리 영역이 새로 생성되었다!!
//		
//		str = str+" JSP";
//		System.out.println("str+\"and\"+\"JSP\" 문자열 주소: "+ System.identityHashCode(str));
//		// 결합연산자로 문자열을 저장 후 참조하는 메모리주소: 1562557367
//		System.out.println(str);
//		// >> "Java and JSP"의 문자열을 갖는 메모리 영역이 또 새로 생성되었다!!
		
		// 주소가 계속 달라진다 > 서로 다른 메모리영역 참조한다 !!! > 메성비가 떨어진다~ 이말이야!
		System.out.println("------------------------------------------------");
		
		StringBuilder buffer = new StringBuilder(str);
		// String으로부터 StringBuilder 생성
		System.out.println("연산 전 buffer 메모리 주소: "+ System.identityHashCode(buffer));
		// 연산 전 메모리 주소: 1227229563
		buffer = buffer.append(" and");
		System.out.println("1회차 연산 후 buffer 메모리 주소: "+ System.identityHashCode(buffer));
		// 연산 후 메모리 주소: 1227229563
		buffer = buffer.append(" JSP");
		System.out.println("2회차 연산 후 buffer 메모리 주소: "+ System.identityHashCode(buffer));
		// 연산 후 메모리 주소: 1227229563
		buffer = buffer.append(", Programming is fun!");
		System.out.println("3회차 연산 후 buffer 메모리 주소: "+ System.identityHashCode(buffer));
		// 연산 후 메모리 주소: 1227229563
		System.out.println(buffer);
		
		// toString()을 통해 String 클래스로 변환!
		str = buffer.toString();
		System.out.println(str);
		System.out.println("새로 만들어진 str 문자열의 주소: "+System.identityHashCode(str)); //1982791261
		
		

	}// main() method end

}// public class







































