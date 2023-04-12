package enum_type;

public class Ex_0412_enum {
		public static void main(String[] args) {
			
			/*
			 * 상수를 사용하여 한정된 데이터를 관리하는 경우, 간편한 선언을 통해 관리할 수 있다는 장점이 있다.
			 * 단, 해당 값의 범위를 벗어나는 값을 사용하는 경우 컴파일시점에서의 오류발견이 불가능하다!
			 * 
			 * > 추가적인 작업을 통해 범위 내의 값인지 판별하는 작업이 별도로 필요하다 !!
			 * 		>> 이를 해결하기위한 열거형(enum type)이 필요!!
			 * 
			 * 열거형이란? > Enumeration Type > Enum 타입!
			 * 	> 상수를 좀 더 확실한 형태로 다루기 위한 객체의 일종!
			 *  > 데이터타입이 일치하면 다른 데이터라도 사용이 가능한 상수의 단점을 해결.
			 *  > enum타입은 내부적으로 java.lang.Enum클래스를 상속받는다.
			 *  
			 *  <열거타입 정의 방법>
			 *  [접근제한자] enum 열거타입명 {
			 *  	// 열거타입에서 사용할 값(상수)을 차례대로 나열한다.
			 *  	상수 1, 상수 2, ... 상수n
			 *  }
			 *  
			 *  > 기본적으로 클래스, 인터페이스 정의 문법과 유사하다!
			 *  	>> 단, 열거타입 중괄호 내에는 상수로 사용될 이름만 지정 !!
			 *  
			 *  <열거타입 사용 방법>
			 *  1. 열거타입 변수 선언방법 (클래스, 인터페이스와 동일!)
			 *  		열거타입명 변수명 
			 *     	ex) Month month
			 * 
			 * 	2. 열거타입 비교방법
			 * 		> if문 사용시, 동등비교연산자 사용 (==)
			 * 		> switch-case문 사용 가능 (단, case문에서 열거타입명 없이 상수만 지정해야한다!)
			 * 		switch(열거타입 변수){
			 * 			case 열거타입상수1: 작업1...;
			 * 			case 열거타입상수2: 작업2...;
			 * 			...
			 * 			case 열거타입상수n: 작업n...;
			 * 		}
			 */
			// 일반 상수를 파라미터로 사용하는 경우
			// > 동일한 데이터타입일 경우, 잘못된 데이터도 전달이 가능해진다!!
			MyCalendar mc = new MyCalendar();
			mc.setMonth(20); // int 타입 데이터 전달 가능! (잘못된 데이터)
			mc.setMonth(WeekClass.WEEK_TUESDAY); // 요일 전달 가능(잘못된 데이터)
			mc.setMonth(MonthClass.JANUARY); // 정상 데이터
			
			System.out.println("-------------------------------------------");
			mc.setWeek(WeekClass.WEEK_TUESDAY); // 화요일을 나타내는 정수형 1 출력
			mc.setWeek(10);						// 문법적인 오류는 발생하지 않으나,
												// 범위를 벗어났기때문에 에러메세지를 출력!
			System.out.println("=============================================");
			// enum 상수를 파라미터로 사용하는 경우
			// > enum 타입 객체의 상수 외에는 그 어떤 값도 전달 불가능하므로 안전!
			MyEnumCalendar mec = new MyEnumCalendar();
//			mec.setEnumWeek(1); // EnumWeek타입 객체(상수값) 외의 다른값 전달 불가!
//			mec.setEnumWeek(WeekClass.WEEK_WEDNESDAY); // WeekClass타입 상수도 전달 불가!
			mec.setEnumWeek(EnumWeek.WEDNESDAY); // 오직 EnumWeek타입 상수만 사용 가능하다.
			
			System.out.println("-------------------------------------------");
			// 열거타입변수 today 선언 및 초기화 후 호출
			EnumWeek today = EnumWeek.WEDNESDAY;
			System.out.println(today);
			
			mec.setEnumWeek(today);
			
			// EnumWeek타입 객체는 Enum 클래스의 서브클래스타입 객체인가?
			if(today instanceof Enum) {
				System.out.println("Enum 클래스의 서브클래스이다!");
			}else{
				System.out.println("아니다.");
			}
			
			if(today instanceof Object) {
				System.out.println("Object 클래스의 서브클래스이다!");
			}else{
				System.out.println("아니다.");
			}
			
			
			
		}// main() method end
} // public class end

// 요일정보를 관리하는 enum타입 Week 정의 (아래 WeekClass의 일반상수와 비교해보기.)
// enum 클래스의 상수들은 Heap 메모리 영역에 저장된다.
// (딥하게 > 기본적으로 method area에 클래스 전체가 저장됨, Heap메모리에 method area와 연결된 상수값을 생성하고,
// 인스턴스를 생성하면서 stack메모리가 method area 주소값을 받아두는것.) >> new키워드를 통한 인스턴스생성과 약간 다른느낌임!!
enum EnumWeek{
	// 열거형 정의시, 중괄호 내에는 값을 갖는 상수 이름만 나열한다. (별도의 값 지정 X)
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}// EnumWeek enum end

enum EnumMonth{
	JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
} // EnumMonth enum end

class MyEnumCalendar{
	public void setEnumWeek(EnumWeek week) {
		System.out.println("요일 : "+week);
	}// setEnumWeek() method end
	public void setEnumMonth(EnumMonth month) {
		System.out.println("월 : "+month);
	}// setEnumMonth() method end
	
}// MyEnumCalendar class end


// ========================================================================================
// 요일 정보를 관리하는 WeekClass 정의
// 열거타입을 사용하지 않고, 상수만 사용하는 경우!
// 요일은 7가지로 정해져 있기때문에, 상수로 처리가 가능하다.

class WeekClass{
	// 요일 정보를 상수로 관리
	// > 외부에서 실제 데이터를 정확하게 알지 못해도, 상수명(변수명)만으로 값을 사용 가능!
	//	 클래스명만으로 접근이 가능하여 접근이 쉽고, 값 변경이 불가능하여 안전하다.
	public static final int WEEK_MONDAY = 0;
	public static final int WEEK_TUESDAY = 1;
	public static final int WEEK_WEDNESDAY = 2;
	public static final int WEEK_THURSDAY = 3;
	public static final int WEEK_FRIDAY = 4;
	public static final int WEEK_SATURDAY = 5;
	public static final int WEEK_SUNDAY = 6;
}// WeekClass end

// 월 정보를 관리하는 MonthClass 정의
class MonthClass{
	public static final int JANUARY = 1;
	
}// MonthClass class end

class MyCalendar {
	// 요일에 대한 정상범위 판별 없이 저장 작업을 수행할 경우,
	// 실제 저장된 요일을 꺼내서 사용하는 시점에서 문제가 발생할 수 있다.
	// 따라서, 조건문 등을 사용하여 전달받은 파라미터에 대한 검증이 추가적으로 필요하다.
	public void setWeek(int week) {
		if(week >= WeekClass.WEEK_MONDAY && week <= WeekClass.WEEK_SUNDAY) {
			System.out.println(week);
		}else {
			System.out.println("요일 입력 에러!");
		}// i-e end
	}// setWeek() method end
	
	//setMonth() 메서드 파라미터로 int타입을 전달할 경우
	// MonthClass.JANUARY 값과 WeekClass.TUESDAY값이 동일한데,
	// WeekClass.TUESDAY를 전달하면 문법적으로 잘못되지는 않으나, 정상적인 값이라고 볼 수 없다.
	// 하지만 일반 상수를 사용하는 경우, 외부에서 전달하는 값에 대한 제한을 할 수 없다. (일반 상수 문제점)
	public void setMonth(int month) {
		System.out.println(month+"월");
	}// setMonth() method end
}// MyCalendar class end
