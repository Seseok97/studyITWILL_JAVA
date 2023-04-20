package exception;

public class Ex4_0420_exception {

	public static void main(String[] args) {
		/*
		 * 사용자에 의해 예외 발생(의도적으로 발생시키는 경우)
		 * > throw 키워드 사용.
		 * > 자바 기준으로, 예외가 아닌 상황임에도 개발자(사용자)의 의도대로 예외를 직접 발생 시키는 것!
		 * > throw 키워드를 사용하여 발생시킬 예외 클래스 객체를 지정.
		 * 		>> 예외 클래스의 인스턴스를 생성하여, 강제로 해당 예외를 발생시킨다.
		 * 
		 * <기본 문법>
		 * 예외를 발생시킬 코드 위치에서
		 * throw 예외객체;
		 * 
		 * [추가!]
		 * > 예외클래스 인스턴스를 변수에 저장하여 발생시켜도 되지만, 
		 * 	 주로 일회성으로 예외를 발생시키고, 재사용할 일이 없기 때문에 !!
		 * 	 별도의 변수 없이 임시객체 형태로 사용하는 경우가 많다.
		 * 	 (new 예외클래스명() 형태로 객체를 생성하여 전달!)
		 * -----------------------------------------------------------------------
		 * 사용자 정의 예외 클래스
		 * > 기존의 예외클래스가 발생시킨 예외와 일치하지 않을 경우!
		 * 		>> Exception 클래스로 예외처리시 발생한 예외를 파악하기 어렵다.
		 * 
		 * > 사용자가 직접 예외클래스를 작성하여 발생시킬 예외에 맞는
		 *   객체로 만들어서 전달하면! 예외 파악이 쉬워진다.
		 *   
		 * > 사용자 정의 예외클래스 정의 시, 예외클래스를 상속받아 정의한다.
		 * 		>> ex) Exception 클래스를 상속받은 서브클래스 정의
		 * 		>> 주로 Exception 클래스를 상속받아 정의한다.
		 * 
		 * > 보통, 생성자를 정의하여 슈퍼클래스에 예외메세지만 초기화.
		 * 
		 */
		
//		printScore(150); // 0~100 사이의 정수를 입력해야 하나, 150을 입력한 경우.
		
		try {
			printScore(150);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 메세지:"+e.getMessage());
		}// t-c end
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		try {
			userExceptionMethod(150);
		} catch (InvalidScoreException e) {
			e.printStackTrace();
		} // t-c end

	}// main() method end
	
	public static void printScore(int score) throws Exception {
		/*
		 * 점수를 입력받아 학점을 계산 후 출력하는 메서드.
		 * 단, 점수 범위는 0~100 사이의 정수이다.
		 * 만약, 0과 100사이가 아닐경우! 비정상적인 점수이므로 오류발생이 필요하다.
		 * 
		 * 그러나 ! 150을 입력한 경우 int형 범위를 벗어나지 않아, 자바 기준으로 예외가 되지는 않는다.
		 * >> 따라서, 원하는 시점에 특정조건 발생 시 강제로 예외를 발생 시켜야 한다.
		 */
		if(score < 0 || score > 100) {
//			System.out.println(score+"점 : 점수 입력 오류!"); // > 오류임을 나타낼 수는 있으나, 프로그램을 종료시키지 못한다.
			// throw 키워드를 사용하여, 해당 예외클래스의 객체를 생성.
			// >> 단, 점수입력 오류에 대한 별도의 예외클래스가 없기 때문에, 기존의 클래스를 활용한다.
			//    일치하는 키워드가 없는 경우, 보통 Exception 클래스를 사용한다.
//			Exception e = new Exception("점수 입력 오류! : "+ score); // Exception 타입 e 생성 (인스턴스 생성: Heap메모리)
			// >> 예외 발생시 표시할 예외 메세지를 파라미터 생성자로 전달.
			
			// throw 키워드 뒤에 예외객체를 지정하여 해당 예외를 발생시킨다. 
//			throw e;
			
			//[추가!]
			throw new Exception("점수입력 오류! : "+score);
			// 일회성으로 사용하고, GC가 지우게 둔다. >> 메모리 낭비를 줄이는 방법!
			
		}// if end

	}// printScore() method end
	
	public static void userExceptionMethod(int score) throws InvalidScoreException {
		if(score < 0 || score > 100) {
			// Exception 클래스 대신 사용자 정의 예외클래스인 
			// InvalidScoreException 클래스를 사용하여 예외를 발생시킬 수 있다!
			throw new InvalidScoreException("(user)점수 입력오류!: "+ score);
		}// if end
	}// userExceptionMethod() method end

}// public class end

// 사용자정의 예외클래스 작성.
// > 원하는 이름의 서브클래스를 정의, 예외클래스를 상속받는다.
// > 주로 Exception 클래스를 상속받아 정의한다.
class InvalidScoreException extends Exception{
	// 생성자를 정의하여, 예외 메세지를 슈퍼클래스의 생성자에 전달!
	public InvalidScoreException(String message) {
		super(message);
	}// InvalidScoreException, 기본생성자
	
} // InvalidScoreException class end









































