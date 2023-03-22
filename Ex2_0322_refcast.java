package reference_casting;

public class Ex2_0322_refcast {

	public static void main(String[] args) {
		/*
		 * instanceof 연산자
		 * 	> 좌변의 객체(참조변수)가 우변 클래스의 타입인지 판별하는 연산자 !!
		 *  > 판별 결과가 true이면 > 형 변환이 가능한 관계(업 or 다운 캐스팅)
		 *  > 판별 결과가 false이면 > 형 변환 절대불가 !
		 *  > 우변의 클래스 타입과 같거나, 우변 클래스 타입의 자식 타입 모두 가능!
		 *  > A is a B = A instanceof B
		 *  > 판별 결과를 boolean 타입 변수에 저장하거나, if문에 판별하는 문장을 직접 사용 가능.
		 *  
		 *  <기본 문법>
		 *  if(A instanceof B) {// A는 참조변수(객체), B는 클래스명(타입)
		 *  		// 형변환이 가능한 관계이므로 변환 수행
		 *  }else{
		 *  		// 절대로 형변환이 불가능한 관계이므로 변환 수행 X
		 *  }
		 */

		//SmartPhone 인스턴스 생성
		SmartPhone sp =
				new SmartPhone("갤럭시23", "010-1234-5678", "안드로이드");
		// sp의 호출 가능한메서드 : 3개
		sp.call();
		sp.sms();
		sp.kakaoTalk();
		// sp는 SmartPhone 입니까?? YES
		// >> sp is a SmartPhone? > sp instanceof SmartPhone?
		if(sp instanceof SmartPhone) {
			System.out.println("sp는 SmartPhone이다!");
			// sp는 SmartPhone 타입 변수에 저장이 가능하다 !
			SmartPhone phone = sp;
		}
		System.out.println("---------------------------------------------------");
		// 업캐스팅 가능 대상 확인
		// sp는 HandPhone 입니까? YES
		if(sp instanceof HandPhone) {
			System.out.println("sp는 HandPhone이다!");
			System.out.println("따라서 sp는 HandPhone으로 형변환이 가능하다 !!");
			
			// sp >> HandPhone 타입(hp)으로 변환
			HandPhone hp = sp; // 자동 형변환!(업캐스팅)
			System.out.println("sp는 HandPhone이 가진 모든 기능을 포함한다 !!");
			System.out.println("따라서 업캐스팅 후에도 HandPhone의 기능 사용 가능!");
			
			hp.call(); 		// HandPhone의 기능인 전화와
			hp.sms();		// 문자는 사용할 수 있으나,
//			hp.kakaoTalk();	// SmartPhone의 기능은 포기해야 한다!
		}else {
			System.out.println("sp는 HandPhone이 아니다 !");
		}

		System.out.println("---------------------------------------------------");
		//다운캐스팅 가능 대상 확인
		//슈퍼클래스 타입 인스턴스 생성
		HandPhone hp = new HandPhone("애니콜","016-225-1243");
		
		//hp는 SmartPhone 입니까? NO!
		if(hp instanceof SmartPhone) {
			System.out.println("hp는 SmartPhone이다!");
		}else {
			System.out.println("hp는 SmartPhone이 아니다!");
			System.out.println("그러므로, SmartPhone으로 변환 불가능!");
			System.out.println("hp는 SmartPhone이 가진 기능을 모두 포함하지 못한다!");
		}
		
		System.out.println("---------------------------------------------------");
		
		// 다운캐스팅 가능 대상 확인(가능한 경우)
		// SmartPhone > HandPhone타입(hp2)으로 업캐스팅
		HandPhone hp2 = 
				new SmartPhone("갤럭시23", "010-1234-5678", "안드로이드");
		// 업캐스팅 후에는 참조영역 축소로 인하여 접근범위가 줄어들게 된다!
		hp.call();
		hp.sms();
//		hp.kakaoTalk(); // 접근불가!
		
		// hp2는 SmartPhone입니까? YES
		if(hp2 instanceof SmartPhone) {
			System.out.println("hp2는 SmartPhone이다!");
			// 기능에 제한은 있으나, 인스턴스 주소는 SmartPhone에 할당되어있다!
			System.out.println("그러므로, hp2는 SmartPhone으로 형변환이 가능하다!");
			SmartPhone sp2 = (SmartPhone)hp2;
			System.out.println("sp2는 SmartPhone이 가진 모든 기능을 포함한다!!");
			sp2.call();			// HandPhone의 기능인 전화기능과
			sp2.sms();			// 문자기능을 사용할 수 있으며,
			sp2.kakaoTalk();	// SmartPhone의 기능도 다시 사용이 가능해 진다!
		}else {
			System.out.println("hp2는 SmartPhone이 아니다!");
		}

		
	}// main() method end

}// public class end

class HandPhone{
	String modelName;
	String phoneNumber;
	
//	public HandPhone() {}; // 기본생성자가 없는경우 상속받는 서브클래스에서 에러가 발생한다.
	  // super 생성자 사용 예정으로 주석처리
	
	// 파라미터 생성자
	public HandPhone(String modelName, String phoneNumber) {
		super();
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;
	} // 기본생성자가 없는경우 상속받는 서브클래스에서 에러가 발생한다.
	
	public void call() {
		System.out.println("전화기능!");
	}
	public void sms() {
		System.out.println("문자기능!");
	}

} // class end

class SmartPhone extends HandPhone{
	String osName;
	
	// 모델명, 전화번호, 운영체제명을 전달받아 초기화 하는 파라미터생성자 정의
	//  >> 모델명과 전화번호는 슈퍼클래스의 생성자를 통하여 대신 초기화 수행!
	public SmartPhone(String modelName, String phoneNumber, String osName) {
		super(modelName, phoneNumber); // 슈퍼클래스 생성자, 기본생성자가 없어도 상속이 가능해진다. (0321super 참고)
		this.osName = osName;
	}
	
	public void kakaoTalk() {
		System.out.println("카톡기능!");
	}

} // class end






















