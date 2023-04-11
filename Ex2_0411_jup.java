package java_util_pacakge;

import java.util.Date;

public class Ex2_0411_jup {

	public static void main(String[] args) {
		/*
		 * [날짜 및 시각 관련 클래스}
		 * 1. Date 클래스
		 * 		> 날짜 및 시각 관련 기능을 제공하는 클래스.
		 * 		> 대부분의 생성자 및 메서드가 deprecate 처리 되어있다.
		 * 										>> deprecate: 아직 사용되고 있으나 사라질 기능
		 * 			>> 다양한 API 들이 여전히 Date 타입을 사용하는 경우가 많다.
		 * 		> toString() 메서드가 오버라이딩 되어있다.
		 * 			>> 쉽게 출력할수 있다 !!
		 */
		
		Date d1 = new Date(); // sql.Date는 엄연히 다른 메서드임 !!
		System.out.println(d1);
		
		// 생성자에 long타입값을 전달시, 해당 값에 맞는 Date 객체가 생성된다.
		Date d2 = new Date(0);
		System.out.println(d2);
		Date dl = new Date(2000000000000l); // 밀리초 단위 long타입 값을 전달
		// > 기준시각으로부터 지정된 밀리초만큼 지난 시각으로 설정한다.
		System.out.println(dl);
		
		// Date 객체의 getTime() 메서드를 호출하면, 해당 객체의 날짜정보가 long타입으로 리턴된다.
		// >> 두 Date 객체의 getTime() 결과를 연산하면 두 날짜간의 차이 계산이 가능하다.
		// 목표날짜 - 현재날짜 > 0 : 남은 일 수(미래)
		// 목표날짜 - 현재날짜 < 0 : 지난 일 수(과거)
		long differentDate= dl.getTime() - d1.getTime();
		System.out.println(differentDate); // > long타입 값(밀리초 단위) 출력.
		// > 사용하기 편하게 특정 단위로 변환작업이 필요하다.
		// > ms > s > m > h > d 변환
		System.out.println("s:"+differentDate/1000);
		System.out.println("m:"+differentDate/1000/60);
		System.out.println("h:"+differentDate/1000/60/60);
		System.out.println("d:"+differentDate/1000/60/60/24); // 남은 일수
		System.out.println("y:"+differentDate/1000/60/60/24/365); // 남은 년수
		
		if(differentDate > 0) {
			System.out.println(differentDate/1000/60/60/24+"일 남았습니다!");
		}else if(differentDate < 0) {
			System.out.println(-(differentDate/1000/60/60/24)+"일 지났습니다!");
		}else {
			System.out.println("같은 날입니다!");
		}
		

	}// main() method end

}// public class end
