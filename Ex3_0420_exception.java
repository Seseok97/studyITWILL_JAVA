package exception;

public class Ex3_0420_exception {

	public static void main(String[] args) {
		/*
		 * 예외 처리의 위임(전달) : throws 
		 *  > 예외가 발생한 곳에서 try-catch를 통하여 직접 처리할 수 있지만,
		 *    자신이 직접 처리하지 않고, 메서드를 호출한 곳에서 예외를 위임받아 처리하는것.
		 *    
		 *  > throws 키워드를 사용.
		 *  > 예외처리를 위임받은 메서드는 다시 예외처리에 대한 책임이 발생하고,
		 *    직접 처리하거나 또 다른곳으로 위임 가능.
		 *    
		 *  > 최종적으로 마지막 단계의 메서드에서는 try-catch를 사용하여 예외를 직접 처리해야 한다.(ex: main())
		 *  > throws 키워드를 사용하여 지정하는 예외는 복수개 지정이 가능하다.
		 *  
		 *  <예외 위임 기본 문법>
		 *  > 메서드 정의 시, 메서드 선언부 마지막에 throws 키워드를 쓰고,
		 *    뒤에 예외를 위임할 클래스명을 기술(복수개의 경우 콤마로 구분)
		 *    
		 *  [접근제한자] 리턴타입 메서드명([파라미터...]) throws 예외클래스명 ...{
		 *  		//예외가 발생하는 코드 ...
		 *  }
		 *  
		 *  // 미루기로 표현되기도 한다.
		 */
		
		// Example
		
		// 팀장()으로부터 위임 받았을때, 현재 메서드가 사장(main()) 메서드 인 경우 !!
		// >> 더이상 위임 할 수 없다!! (사실 할 수는 있음, main() 메서드에는 예외 잘 안붙임.)
		// >> 따라서, 사장(main())이 모든 예외를 처리해야 한다.
		try {
			팀장();
		} catch (Exception e) {
			System.out.println("사장이 모든 예외 처리!");
		} // t-c end


	} // main() method end
	
	public static void 팀장() throws Exception{
		// 1. 대리로부터 위임받은 예외를 직접 처리하는 경우
//		try {
//			대리();
//		} catch (ClassNotFoundException e) {
//		} catch (RuntimeException e) {
//		}

		// 2. 팀장이 위임받은 예외를 사장(main())에게 위임하는 경우.
		// throws RuntimeException,ClassNotFoundException  을 명시하거나,
		// Exception타입으로 위임 가능.
		대리();
	}// 팀장() end
	
	public static void 대리() throws RuntimeException,ClassNotFoundException { // (ArithmeticException,NullPointerException),ClassNotFoundException
		// 사원, 사원2로부터 3개의 예외를 위임받음.
		// > 처리해보자.
		// 1. 대리가 직접 처리
//			try {
//				사원();
//				사원2();
//			} catch (ArithmeticException e) { // 사원의 예외
//				System.out.println("대리가 사원의 ArithmeticException를 직접 처리."); // >> 순차적으로 실행되기 때문에, 얘만 실행된다.
//			}catch (NullPointerException e) { // 사원의 예외
//				System.out.println("대리가 사원의 NullPointerException를 직접 처리.");
//			}catch (ClassNotFoundException e) { // 사원2의 예외
//				System.out.println("대리가 사원2의 ClassNotFoundException를 직접 처리.");
//			}
		// 2. 팀장에게 넘기기
		// >> 발생가능성이 있는 모든 예외를 throws 키워드 뒤에 명시. 혹은 상위타입으로 결합(업캐스팅 해서) 명시 가능.
		사원();
		사원2();
	}// 대리() end
	
	public static void 사원() throws ArithmeticException,NullPointerException { // 이거 적는다고 끝나지는 않는다.
		// 예외 처리 방법
		// 1. 예외가 발생한 곳에서 try-catch로 직접 예외처리
	//		try {
	//			System.out.println("사원() 에서 예외발생!!!!");
	//			System.out.println(3/0); // ArithmeticException 발생 코드
	//		}catch (ArithmeticException e) {
	//			System.out.println("사원()이 직접 예외 처리!");
	//		}// t-c end
		// >> 예외위임 상황을 위하여 주석처리.
		// 2. 호출한 곳으로 throws 키워드로 예외를 위임.
		// > 현재 사원() 메서드를 호출한 곳(대리())으로 예외를 던진다!
		// > 사원() 메서드 선언부 마지막에 throws 키워드를 작성하고, 뒤에 예외클래스를 명시.
		System.out.println("사원()에서 예외 발생!");
		System.out.println(3/0); // ArithmeticException
		
		String str = null;
		System.out.println(str.length()); // NullPointerException
		
	}// 사원() end
	
	public static void 사원2() throws ClassNotFoundException {
		System.out.println("사원2()에서 예외 발생!");
		Class.forName(null); // ClassNotFoundException
		// 에러줄 생김. > Compile Checked Exception > 예외처리 필수!
		
	}// 사원2() end

}// public class end
