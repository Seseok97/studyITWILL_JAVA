package java_time_package;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Ex_0412_jtp {

	public static void main(String[] args) {
		/*
		 * java.time 패키지
		 * 	> 날짜와 시각정보를 관리하는 기능의 패키지, JDK 8부터 제공된다.
		 * 	> LocalDate 클래스 : 날짜 관련 기능 제공
		 * 	> LocalTime 클래스 : 시각 관련 기능 제공
		 * 	> LocalDateTime 클래스 : 날짜와 시각 관련 기능 제공
		 * 	> toString() 메서드 오버라이딩 되어있음 !!
		 * 	> 각 클래스의 now() 메서드를 호출하여 현재 시스템의 정보를 가져오고,
		 * 	  of() 메서드를 호출하여 항목별 정보 가져오기.
		 * 	> getXXX() 메서드를 호출하여 항목별 정보 가져오기.
		 * 		>> XXX : 가져올 정보의 종류. ex) 년도는 getYear(), 시각은 getHour() 
		 * 
		 */
		
		// now() 메서드를 사용하여 정보 가져오기
		LocalDate date = LocalDate.now(); // 시스템의 날짜정보를 리턴받는다.
		System.out.println("오늘 날짜: "+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("현재 시각: "+time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("오늘 날짜, 현재 시각: "+dateTime);
		
		System.out.println("---------------------------------------------");
		
		LocalDate date2 = LocalDate.of(2000,1,1); // 년,월,일
		System.out.println(date2);
		
		LocalTime time2 = LocalTime.of(17,50,1); // 시,분,초
		System.out.println(time2);
		
		LocalDateTime dateTime2 = LocalDateTime.of(date2,time2);
		System.out.println(dateTime2);
		
		System.out.println("---------------------------------------------");
		// getXXX() 메서드를 통해 항목별 정보 가져오기
		int year = date.getYear();
//		int month = date.getMonth();// 타입 미스매치
		// 주의 !! getMonth() 메서드는 Month타입 객체가 리턴된다 !
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		
		System.out.println(year+ "/" +month+ "/" +day);
		
		// Month타입 객체 활용
		// > enum타입 객체인 Month 타입 으로 관리된다. (각 월 이름이 상수로 제공)
		Month enumMonth = date.getMonth();
		System.out.println(enumMonth); // toString() 생략됨
		String monthName = enumMonth.name(); // 변수 저장시 String으로 저장해야한다!
		System.out.println(monthName);
		
		// Month 객체를 "n월"로 표현할 경우
		System.out.println(enumMonth.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));  // 영어식
		System.out.println(enumMonth.getDisplayName(TextStyle.SHORT, Locale.KOREAN));	// 한국어식
		System.out.println(enumMonth.getDisplayName(TextStyle.FULL, Locale.ENGLISH));	// 영어식, 전체 이름
		
		// Time
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		System.out.println(hour+ "시" +min+ "분" +sec+ "초");
		
		System.out.println("===========================================================");
		
		// 날짜 또는 시각정보에 대한 연산.
		// 해당 객체는 plusXXX() 또는 minusXXX() 메서드를 사용하여 연산 가능.
		LocalDate today = LocalDate.now();
		System.out.println("today: "+today);
		
		// plusXXX() 메서드 > 덧셈연산
		System.out.println("After 8 Months: "+today.plusMonths(8)); // 8개월 뒤 날짜 설정
		System.out.println("After 30 Days: "+today.plusDays(30)); // 30일 뒤 날짜 설정
		
		// 빌더 패턴 (Builder Pattern) 을 활용,
		// 리턴타입이 자기자신인 객체의 다음메서드를 차례대로 연결하여 수행 가능!
		System.out.println("After 1 Month 15 Days: "+today.plusMonths(1).plusDays(15)); // 1개월 15일 후
		
		System.out.println("===========================================================");
		
		LocalDate date3 = LocalDate.of(2000, 1, 1);
		LocalDate date4 = LocalDate.now();
		
		// 날짜와 시각정보 비교를 위해,
		// compareTo(), isAfter(), isBefore(), isEqual() 등의 메서드가 제공된다.
		System.out.println(date3);
		System.out.println(date4);
		
		// 1. compareTo()
		//		>> 현재 객체 날짜가 비교대상 객체보다 이전이면 음수, 이후면 양수! 같으면 0.
		// 		>> 년, 월, 일 순으로 비교하며, 년도가 다르면 년도만 비교하여 리턴한다.
		//		>> 년도가 같다면 월을, 월도 같다면 일 을 비교한다!!
		System.out.println(date3.compareTo(date4)); // -23
		
		LocalDate dateEx = LocalDate.of(2000, 1, 2);
		System.out.println(date3.compareTo(dateEx)); // -1
		
		// 2. isAfter()
		System.out.println("현재 날짜가 더 미래인가?: "+date3.isAfter(date4));
		
		// 3. isBefore()
		System.out.println("현재 날짜가 더 과거인가?: "+date3.isBefore(date4));
		
		// 4. isEqual()
		System.out.println("현재 날짜와 동일한가?: "+date3.isEqual(date4));
		
		// 5. until()
		// 		>> 두 객체간의 날짜 및 시간차이 계산.
		// 		>> 파라미터로 대상객체와 항목정보 지정. 항목정보는 ChronoUnit객체(enum타입!)의 XXX 상수 사용
		//												ex) ChronoUnit.YEARS 연도, ChronoUnit.DAYS 일
		long result = date3.until(date4,ChronoUnit.YEARS);
		System.out.println(result);
		if(result > 0) {
			System.out.println(result+"년 남았습니다.");
		}else if(result < 0) {
			System.out.println(result+"년 지났습니다.");
		}else {
			System.out.println("올 해 입니다.");
		}

		result = date3.until(dateEx,ChronoUnit.DAYS);
		System.out.println(result);
		if(result > 0) {
			System.out.println(result+"일 남았습니다.");
		}else if(result < 0) {
			System.out.println(result+"일 지났습니다.");
		}else {
			System.out.println("오늘 입니다.");
		}
		
		
		

	}// main() method end

}// public class end


































