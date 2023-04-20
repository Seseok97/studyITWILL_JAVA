package exception;

public class Ex_0420_exception {

	public static void main(String[] args) {
		/*
		 * 예외 (Exception)
		 * > 개발자가 의도하지않은 상황에서 발생하는 문제. 프로그램이 비정상적으로 종료된다.
		 * 		>> 예외가 발생한 위치부터 아래쪽의 코드들은 실행되지 못한다.
		 * 
		 * > 오류(Error)와 달리 심각도가 낮으며, 예외 처리(Exception Handling)을 통해 
		 * 	 해결책을 기술하여, 비정상적인 종료를 막을 수 있다.
		 * 
		 * > 예외 처리를 위해 try - catch 문을 사용하여 처리한다.
		 * 		>> 예외가 발생할 것으로 예상되는 코드들을 try코드 블록 내에 기술하고,
		 * 		   예외가 발생한 경우 JVM에 의해 해당 예외 객체를 전달받아
		 * 		   catch 블록 중 일치하는 타입에 대한 블록을 실행하여 예외를 처리하게 된다.
		 * 		>> 일치하는 catch블록이 없을경우, 프로그램은 비정상적으로 종료된다!!
		 * 
		 * > Exception 클래스 및 하위 클래스를 사용하여 예외 처리!
		 * > 컴파일 시점에서 예외 발생 여부를 체크하는 Compile Checked Exception과,
		 * 	 실행 시점에서 예외 발생 여부를 알 수 있는 Compile Uncheked Exception 계열로 나뉜다.
		 * 		>>  Compile Checked Exception 계열: IOException, SQLException 등!
		 * 		>>	Compile Uncheked Exception계열: RuntimeException 계열 (어레이 인덱스 바운드 , 널포인터 ...)
		 * 
		 * <예외 처리 기본 문법>
		 * 
		 * try{
		 * 	// 예외가 발생할 것으로 예상되는 범위의 코드들 ...
		 * 
		 * 	// 예외 발생코드 아래쪽의 나머지 코드들은 실행되지 못한다!
		 * 		// 코드 1
		 * 		// 코드 2 < 예외 발생!!! 하면 catch 블록으로 바로 넘어간다.
		 * 		// 코드 3 X
		 * 		// 코드 4 X
		 * 
		 * 	// >> 코드 1,2만 실행된 것 !!
		 * 
		 * }catch(예외클래스명1 변수명){
		 * 	// 예외클래스명1에 해당하는 예외 발생시 처리할 코드들 ...
		 * 
		 * }catch(예외클래스명n 변수명){
		 * 	// 예외클래스명n에 해당하는 예외 발생시 처리할 코드들 ...
		 * }finally{
		 * 	// 예외 발생여부와 관계없이 무조건 실행 할 문장.
		 * 	// ex) DB 자원반환, I/O 자원 반환 등~
		 * }
		 */
		
		System.out.println("프로그램 시작! \n");
		/////////////////////////////////////////////////////////
		
		// RuntimeException 클래스 계열들(Compile Unchecked Exception 계열)
		
		// ArithmeticException
//		int num = 0;
//		System.out.println(3/num); // java.lang.ArithmeticException: / by zero >> 3을 0으로 어케나눔?
								   // 나눗셈의 피연산자가 0인 경우.
								   // (Ex_0420_exception.java:53) > 파일의 53번 라인에서 예외 발생!
		
		// ArrayIndexOutOfBoundsException
//		int[] arr = {1,2,3};
//		System.out.println(arr[5]); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
									// 배열에 존재하지 않는 인덱스 접근시.			> 인덱스 5번 은 길이가 3이라서 없는데?
									// (Ex_0420_exception.java:62) > 파일의 62번 라인에서 예외 발생!
		
//		String str = null; // 메모리에 올라가지 않는다.
//		System.out.println(str); // 컴파일러가 아무것도 없다고 알려준다.(null을 출력하는 것)
//		System.out.println(str.length()); // java.lang.NullPointerException >해석> 아무것도 없는데 무슨 길이???
										  // 객체의 주소를 참조하지 않는 참조변수(null)에 접근시 발생한다.
										  // (Ex_0420_exception.java:69) > 파일의 69번 라인에서 예외 발생!

		/////////////////////////////////////////////////////////
		System.out.println(" \n 프로그램 끝!");
		
		System.out.println("==============================================================");
		System.out.println("프로그램 시작! \n");
		/////////////////////////////////////////////////////////
		try {
			// 예외가 발생할 것으로 예상되는 코드들을 try블록 내에 위치시킨다.
//			int num = 0; // 예외 코드
			int num = 1;
			System.out.println(3/num); // ArithmeticException 발생 위치
			
//			int[] arr = {1,2,3};
			int[] arr = {1,2,3,4,5,6};
			System.out.println(arr[5]); // ArrayIndexOutOfBoundsException 발생 위치
			// 여러개의 catch문을 통하여 예외를 다룰 수 있다.
			// 해당 경우, catch문은 순차적으로 실행된다.
			
			String str = null;
			System.out.println(str.length()); // NullPointerException 발생 위치
			// 예외가 복수개일때 > 예외를 각각 처리하는것도 가능하다.
			// 하지만 너무 길어진다 !!!!!! > 예외 또한 클래스로 처리되고 있기 때문에, 업캐스팅을 통하여
			// 상위 예외타입으로 묶어서 처리가 가능하다.
			// ex ) NullPointerException + ArithmeticException
			//			>> RuntimeException 또는 Exception으로 간단하게 처리할 수 있다.
			
			
			
			System.out.println("#### try 블록 끝 ####"); // 예외가 발생하는 이상 계속 실행되지 못한다.
		}catch(ArithmeticException e){
			// ArithmeticException이 발생했을 경우 처리할 코드
			System.out.println(" catch :0으로 나눠서 에러 발생!(ArithmeticException)");
			// 예외가 발생하지 않으면, 이 블록은 실행되지 않는다.
//			e.printStackTrace(); // 예외에 대한 정보를 출력시켜주는 메서드.(길다!)
			
			// e.getMessage() : 예외발생 원인 메세지를 문자열로 리턴.
			System.out.println("0으로 나눌수 없습니다 !!: "+e.getMessage());
			
		}catch(ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException이 발생했을 경우 처리할 코드
			System.out.println("배열 인덱스가 잘못 지정되었습니다 !!: "+ e.getMessage());
		}catch(Exception e){ // NullPointerException이 발생하지만, 처리가 가능하다 (UPCASTING)
			// 위쪽의 catch 블록에서 지정되지 않은 나머지 예외들은
			// Exception이 기술된 catch 블록에서 모두 처리 가능하다.
			// >> 단, 각 예외에 대한 처리방법 구분은 불가능하다 ㅠㅠ
			System.out.println("나머지 모든 예외를 처리 !! : "+ e.getMessage());
		}
//		catch(NullPointerException e ) { 
//		System.out.println("null 값을 참조할 수 없음! : "+ e.getMessage());
//			 // ERR !!Unreachable catch block for NullPointerException. It is already handled by the catch block for Exception
//			 // > 위에서 이미 핸들링 중이기 때문에 에러가 발생한다.
//			 // 해결 > 위 catch문(Exception e를 다루는...)을 아래로 내린다 !!!
//			 // >>> catch문은 if문과 마찬가지로 순차적으로 진행되기 때문이다 !!
//		}
		
		// >> Exception e를 가지는 catch문은 항상 가장 아래에 위치해야 한다.

		/////////////////////////////////////////////////////////
		System.out.println(" \n 프로그램 끝!");

	}// main() method end

}// public class end
