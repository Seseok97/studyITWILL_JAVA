package method_;

public class Test_0221 {

	public static void main(String[] args) {
		// 파라미터가 2개 이상인 메서드 호출 연습
		// 정수 2개를 전달하면 두 정수의 합을 리턴하는 메서드 sum을 호출하고, 리턴값을 출력하라.
		// ex) 10,20 >> 10+20=30 리턴
		
		int num1 = 10;
		int num2 = 20;
		////////////////////////////////////////////////////
		result(num1,num2); // return int
		sum(num1,num2); // void
		
		System.out.println("===============================");
		
		int result2 = cal('+',num1,num2);
		System.out.println(num1+"+"+num2+"="+result2);// return int + if-else if
		result2 = cal('-',num1,num2);
		System.out.println(num1+"-"+num2+"="+result2);
		//////////////////////////////////////////////////////////////////////////
		result2 = cal('-',num2,num1);
		System.out.println(num2+"-"+num1+"="+result2);
		//////////////////////////////////////////////////////////////////////////
		result2 = cal('*',num2,num1);
		System.out.println(num2+"*"+num1+"="+result2); // wrong inputValue case
		//////////////////////////////////////////////////////////////////////////
		int result22=cal2('+',num1,num2);
		System.out.println(result22); // return int + switch-case
		//////////////////////////////////////////////////////////////////////////
		cal3('+',num1,num2);//void + switch-case
		
		
		
	}//main() method end
	
	public static int result(int a,int b) {
		int result = a+b;
		System.out.println(a+"+"+b+"="+result);
		return result;
	}//result() method end
	
	public static void sum(int a,int b) {
		int sum1 = a+b;
		System.out.println(a+"+"+b+"="+sum1);
	}//sum() method end // void로 처리하는 방법, 뒷자리사나이들이 하는거 보고 한거 !!
	
	
	//연산자 문자 1개와 정수 2개를 전달하면 두 정수에 대한 어떤 연산을 수행 한 후,
	// 결과값을 리턴하는 메서드를 호출하고 리턴값을 출력하라.
	
	public static int cal(char op, int a, int b) { // 강사님 코드랑 약간 차이 있음(return값 위치) 한번 확인해보자.
		int cal = 0;
		if(op == '+') {
			cal = a+b;
		}else if(op =='-') {
			cal = a-b;
		}else {
			System.out.println("input again");
		};	
		return cal;
	}//cal() method end
	public static int cal2(char op, int a, int b) {
		int cal2 = 0;
		switch(op) {
		case '+': cal2 = a+b; break;
		case '-': cal2 = a-b; break;
		default: System.out.println("Nope");
		};
		return cal2;
	}//cal2() method end
	public static void cal3(char op, int a, int b) {
		int cal3 = 0;
		switch(op) {
		case '+': cal3 = a+b;
		System.out.println(a+"+"+b+"="+cal3);
		break;
		case '-': cal3 = a-b;
		System.out.println(a+"-"+b+"="+cal3);
		break;
		default: System.out.println("No");
		};
	}//cal3() method end
	
//	public static int operation(char opr, int num1, int num2) {
//		if(opr == '+') {
//			return num1 + num2;
//		}else if(opr == '-') {
//			return num1 - num2;
//		}else {
//			System.out.println("연산자가 올바르지 않습니다 !");
//			return 0;
//		}
//	}//operation()method end // 강사님 코드
	

}//Test class end
