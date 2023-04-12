package enum_type;

public class Ex2_0412_enum {

	public static void main(String[] args) {
		/*
		 * enum 상수 연산 및 메서드
		 * > enum 상수 값은 동등비교연산자(==)로 일치여부 비교가 가능하며, switch-case문에서도 enum타입 비교가 가능하다.
		 * 
		 * > enum타입 상수에는 각각 ordinal(순서번호) 값이 자동 부여된다
		 * 		>> 0부터 시작한다.
		 * 		>> enum 객체의 ordinal() 메서드를 통해 얻을수 있다. 
		 * 
		 * 
		 */
		EnumWeek today = EnumWeek.WEDNESDAY;
		if(today == EnumWeek.WEDNESDAY) {
			System.out.println("수요일입니다.");
		}else {
			System.out.println("수요일이 아닙니다!");
		} // i-e end
		
		// enum타입 객체는 switch문에 전달 가능하다.
		switch(today) {
			// case문을 사용하여, enum상수를 지정하면 비교가 가능하다.
			// >> 주의! enum타입명.상수 가 아닌, 그냥 상수 자체를 비교한다.
//		case EnumWeek.MONDAY: ; // 컴파일에러!
		case MONDAY: System.out.println("월요일"); break;
		case TUESDAY: System.out.println("화요일"); break;
		case WEDNESDAY: System.out.println("수요일"); break;
		case THURSDAY: System.out.println("목요일"); break;
		case FRIDAY: System.out.println("금요일"); break;
		case SATURDAY: System.out.println("토요일"); break;
		case SUNDAY: System.out.println("일요일"); break;
		}// switch end
		
		System.out.println("====================================================");
		
		// ordinal() : 상수의 순서번호를 정수로 리턴!
		System.out.println("오늘의 ordinal값 : "+today.ordinal());
		if(today.ordinal() < 4) {
			System.out.println("주말은 언제오나");
		}else if(today.ordinal() == 4) {
			System.out.println("앗사 금요일");
		}else {
			System.out.println("주말 ~");
		}
		
		// name() : 상수명을 문자열로 리턴해준다.
		String strToday = today.name();
		System.out.println(strToday);
		
		
		

	}// main() method end

}// public class end
