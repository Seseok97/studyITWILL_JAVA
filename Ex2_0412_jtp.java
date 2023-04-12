package java_time_package;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex2_0412_jtp {

	public static void main(String[] args) {
		/*
		 * 날짜 및 시각정보에 대한 형식화(Formatting)
		 * 	> 날짜 또는 시각 정보를 원하는 형식으로 변환하는 과정!
		 * 	> SimpleDateFormat 클래스와 DateTimeFormatter 클래스 사용!
		 * 		1) SimpleDateFormat : Date타입 객체에 대한 형식화
		 * 		2) DateTimeFormatter : LocalXXX타입 객체에 대한 형식화
		 * 
		 * < 형식 문자>
		 * 
		 * 		기호		의미 			 표현 			 예
		 * --------------------------------------------------------------
		 * 		 y			연도			yyyy, yy		2023, 23
		 * 		 M			월				MMM, MM			04월, 04
		 * 		 d			일				dd				12
		 * 		 E			요일			EEEE, E			수요일, 수
		 * 		 H			시(24)			HH				17
		 * 		 K			시(12)			KK				5
		 * 		 m			분				mm				59
		 * 		 s			초				ss				50
		 * 		 a			오전/오후		a				오전, 오후
		 * ---------------------------------------------------------------
		 */
		// 1. SimpleDateFormat 클래스 사용 > Date타입 객체
		Date today = new Date();
		System.out.println("Date 타입 기본 출력값: "+today); 
		// 기본표현방식 >> Wed Apr 12 12:15:20 KST 2023
		
		System.out.println("\n [패턴적용] \n");
		
		// 형식 적용을 위한 패턴문자열 생성!(형식 지정문자 활용)
		String pattern = "yyyy년 MM월 dd일 EEEE";
		
		// SimpleDateFormat 클래스 인스턴스 생성 >> 파라미터로 패턴 문자열 전달
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// SimpleDateFormat 객체의 format() 메서드를 호출, Date 객체 전달
		System.out.println("바로 출력: "+sdf.format(today));  // 결과값을 문자열로 출력하거나,
		String formatToday = sdf.format(today); // String 타입 변수에 저장 가능!
		System.out.println("변수 저장후 출력: "+formatToday);
		
		System.out.println("\n [패턴변경] \n");
		
		pattern = "yy/MM/dd(E) a HH:m:s";
		SimpleDateFormat sdf2 = new SimpleDateFormat(pattern);
		System.out.println("바로 출력: "+sdf2.format(today)); 
		String formatToday2 = sdf2.format(today);
		System.out.println("변수 저장후 출력: "+formatToday2);
		
		System.out.println("=====================================================================");
		
		//2. DateTimeFormatter 클래스 사용 > LocalXXX타입 객체
		LocalDateTime now = LocalDateTime.now();
		System.out.println("LocalXXX 타입 기본 출력값: "+now);
		//기본표현방식 >> 2023-04-12T12:26:51.872605900
		
		// DateTimeFormatter 클래스의 ofPattern() 메서드를 호출하여 파라미터로 패턴문자열 전달!
		// 		>> 패턴 문자열은 SimpleDateFormat 클래스와 동일하게 사용.
		//		>> 주의 ! LocalTime과 LocalDate 클래스를 사용하는 경우,
		//				  패턴문자열이 존재하지않는 정보를 포함하지 않도록 주의해야 한다!!
		//				  ex) LocalTime 객체는 시각 정보만 형식으로 지정해야 한다!!
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		// LocalDate 등의 날짜 및 시각객체의 format() 메서드를 호출하여,
		// 파라미터로 DateTimeFormatter 전달!
		System.out.println("\n [패턴적용] \n");
		System.out.println(now.format(dtf));
		

	}// main() method end

}// public class end
