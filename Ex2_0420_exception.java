package exception;

public class Ex2_0420_exception {

	public static void main(String[] args) {
		/*
		 * finally 블록
		 * > 예외 발생 여부와 관계없이 무조건 수행해야하는 문장을 기술.
		 * > 심지어 ! return문을 만나 메서드를 종료하게 되더라도,
		 * 	 호출 위치로 돌아가기 전 finally 블록을 실행한 후에 돌아간다.
		 */
		/////////////////////////////////////////////////////////////////////////
		System.out.println("프로그램 시작! \n");
		
		try {
			String str = null;
//			String str = "";
			System.out.println(str.length());
			
			System.out.println("try 블록 끝!");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 예외 처리!");
		}finally {
			System.out.println("finally > 예외 발생여부와 관계없이 실행된다 !!");
		}
		
		System.out.println("\n 프로그램 종료!");
		///////////////////////////////////////////////////////////////////////////
		System.out.println("------------------------------------------------------------");
		
		method1();
		
	}// main() method end
	
	public static void method1() { // static 선언 없음 > 인스턴스 생성 하고, 참조변수를 통해야 이용 가능.
								   // 근데 얘는 static이니까 그냥 메서드 쓰듯이 하면된다.
		/////////////////////////////////////////////////////////////////////////
		System.out.println("method1() 메서드 시작! \n");
		
		try {
//			String str = null;
			String str = "";
			System.out.println(str.length());
			
			System.out.println("try 블록 끝!");
			return; // 호출한 곳으로 바로 되돌아가는 코드. (아래 코드들은 실행이 안될것!!!!: ?)
			// >> ? : finally블록이 존재하는 경우, 해당 블록을 실행한 후에 돌아가게 된다.
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 예외 처리!");
		}finally {
			System.out.println("finally > 예외와 return에 관계없이 실행된다 !!");
		}
		
		System.out.println("\n method1() 메서드 종료!");
		///////////////////////////////////////////////////////////////////////////
		
	} // method1() method end

}// public class end
