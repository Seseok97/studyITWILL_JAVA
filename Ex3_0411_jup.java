package java_util_pacakge;

import java.util.Calendar;
import java.util.Date;

public class Ex3_0411_jup {

	public static void main(String[] args) {
		/*
		 * Calendar 클래스
		 * 	> 주로 날짜 및 시각을 조작하는 용도의 클래스(표현도 가능!)
		 * 	> 추상클래스이므로, 인스턴스 생성 없이 제공되는 인스턴스를 static 메서드인 getInstance() 메서드로 리턴받아 사용.
		 * 	> get() 메서드 > 날짜 및 시각 정보 조회
		 * 	  set() 메서드 > 날짜 및 시각 정보 설정(조작)
		 * 		>> 파라미터로 날짜 및 시각 모두 설정을 위한 상수 사용!!
		 */
		
//		Calendar cal = new Calendar(); // 추상(abstract) 클래스 > 인스턴스 생성 불가!
									  // 에러로 인한 주석처리
		Calendar cal = Calendar.getInstance(); // 현재 시스템 날짜 및 시각정보 리턴!
		// toString() method가 오버라이딩 되어 있다! (식별이 어렵다.)
		System.out.println(cal);
		
		// Calendar 인스턴스의 get() 메서드를 사용하여 정보 조회!
		// >> 파라미터로 Calendar.XXX 상수를 통해 가저올 정보의 종류 지정.
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1; // 0~11을 사용한다 !!! +1 필수!
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		int hour = cal.get(Calendar.HOUR_OF_DAY); // 24시간 (그냥 HOUR은 12시간제)
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(hour+"시 "+min+"분 "+sec+"초");
		
		System.out.println("====================================================");
		
		// Calendar <<-->> Date 상호변환
		// 1. Calendar > Date의 경우
		//		> Calendar 객체의 getTime() 메서드를 호출하여, Date타입 리턴.
		System.out.println(cal.getTime());
		// >> "Tue Apr 11 12:42:44 KST 2023"
		Date date = cal.getTime();
		System.out.println(date);
		
		// 2. Date > Calendar의 경우
		// 		> Calendar 객체가 존재하는 상태에서 setTime() 메서드를 호출, Date타입 객체를 파라미터로 전달
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date);
		System.out.println(cal2.getTime());
		
		System.out.println("====================================================");
		
		// set() 메서드를 사용하여 날짜 및 시각 정보를 설정!
		cal2.set(1999, 0,31); // 년, 월, 일을 직접 전달!
		// > 월은 0~11 값을 사용, 설정은 -1을 생각하고 해야함!
		System.out.println(cal2.getTime()); // Sun Jan 31 12:47:38 KST 1999
		
		// 각 항목을 별도로 변경할때는 set(int field, int value) 메서드 사용
		// >> field 항목은 get() 메서드와 마찬가지로 Calendar.XXX 상수 사용
		 cal2.set(Calendar.YEAR, 2077);
		 cal2.set(Calendar.MONTH, 0);
		 cal2.set(Calendar.DAY_OF_MONTH, 1);
		 Date date2 = cal2.getTime();
	 	 System.out.println(date2);
	}// main() method end

}// public class end