package lambda;

public class Test_0503_lambda {

	public static void main(String[] args) {
		/*
		 * 문자열을 입력받아 두 문자열을 연결하여 출력하는 프로그램.
		 * 람다식을 사용하여 만들기.
		 * 
		 */
		concat c = (str1,str2) -> (str1 +", "+ str2); // method 메서드의 리턴값을 void로 하고, 표현식에 출력메서드를 넣어도 된다.
		System.out.println(c.method("Hello", "World"));
		
		concat2 c2 = new concat2();
		System.out.println(c2.method("Hello", "world"));
	}// main() method end

}// public class end

@FunctionalInterface
interface concat{
	String method(String str1 , String str2);
}// i end

class concat2 implements concat{
	public String method(String str1, String str2) {
		String strCon = str1 +", "+str2 ;
		return strCon;
	}// method end
}// class end
