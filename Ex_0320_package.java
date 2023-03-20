package pack_one;

import java.util.ArrayList;
import java.util.Random;
import pack_two.ExPack_0320_package;
//import pack_three.ExPack_0320_package;

public class Ex_0320_package {

	public static void main(String[] args) {
		/*
		 * package(패키지)
		 *  > 윈도우의 폴더, 리눅스의 디렉터리에 해당하는 개념.
		 *  > 자바의 클래스파일둘울 모아놓는 공간 !
		 *  >> 서로 다른 패키지에는 같은 이름의 클래스가 각각 존재할 수 있다.
		 *     ( 다른 폴더에 같은이름의 파일이 있어도 되는것과 같음)
		 *     > !! 같은이름의 클래스는 같은 패키지 안에 존재할 수 없다 !
		 *  > 자바에서 패키지를 생성하면, 실제 폴더 구조로 된 패키지가 생성된다.
		 *  > 특정 클래스 파일을 하나의 패키지에만 소속될 수 있다.
		 *  > 자바의 모든 클래스는 클래스명 앞에 패키지명을 기술하여 표기한다.
		 *  >> 상위패키지명.하위패키지명.클래스명 형태로 지정.
		 *  >> 패키지명 중목을 피하기 위해, 도메인을 뒤집은 형태로 흔히 사용한다.( ex > com.naver.className)
		 *  
		 *  package 키워드
		 *  > 클래스 파일의 첫번째 라인(가장 위!!)에 위치하여야 한다. 주석은 예외!
		 *  > 실제 클래스 파일의 위치와 패키지명이 다를 경우 오류가 발생한다.
		 *  > 클래스 내에서 단 한번만 사용 가능하다.
		 *  > 패키지 키워드 사용 기본문법
		 *  	(소스코드 첫번째 라인)
		 *  	package 패키지명;
		 *  
		 *  
		 *  import 키워드
		 *  > 원래 클래스 이름 지정시, 패키지명.클래스명 형태로 지정해야 한다.
		 *  > 특정 패키지를 자주 사용하는 경우, import문을 사용하여 해당 패키지와 클래스명을 지정하여 패키지명 생략이 가능해진다!
		 *    (단, 같은 패키지 내의 클래스는 패키지명 생략이 가능하다!)
		 *  > java.lang 패키지는 유일하게 import 없이 생략이 가능한 패키지이다.
		 *  >>> 이말인 즉슨 ~ 다른 패키지는 반드시 위치정보가 필요하다!!
		 *  
		 *  > import문은 패키지명보다 아래, 클래스선언보다 위에 위치하며, package문과 달리 여러번 작성이 가능하다.
		 *  > import 문 뒤에 패키지명과 클래스명을 지정하여 등록하며, 클래스명 대신 만능문자(*)를 지정할 경우!
		 *  >> 해당 패키지 내의 모든 클래스를 다포함시킨다.
		 *  > 자동 import 단축키: ctrl + shift + o
		 *  >> 만약, 중복되는 이름이 서로 다른 패키지에 존재할 경우, 클래스를 선택하는 창이 표시되므로, 클래스를 선택하면 된다.
		 *  
		 *  <import 키워드 사용 기분 문법>
		 *  
		 *  1) import 패키지명.클래스명;  >> 패키지 내의 지정클래스 호출
		 *  2) import 패키지명.*; 		  >> 패키지 내의 모든 클래스 호출
		 * 
		 */
		
		Random r;
		// import 키워드 미사용시 컴파일 에러가 발생한다.
		// java.util 패키지의 Random 클래스는 생략 불가능한 패키지명이다.
		// 1. 클래스명 앞에 java.util 패키지명을 명시한다.
//		java.util.Random r2;
		
		// 2. 클래스가 포함된 패키지를 import문으로 지정할 경우,
		// 	  패키지명을 생략하고 클래스만으로 사용이 가능하다.
		Random r3; // 3번라인에 import문을 통하여 에러가 발생하지 않는 상태.
		
		// java.lang 패키지 안의 클래스는 자바에서 유일하게 위치작성이 생략되어있다.
		String str;
		java.lang.String str2;
		Math m;
		java.lang.Math m2;
		
		// 실습
//		ArrayList list; // import키워드 X >> err
		ArrayList<String> list; // import키워드로 ArrayList 불러오기!
		
//		ExPack_0320_package ex2 = new ExPack_0320_package(); 
		// pack_two, pack_three에 둘 다 존재하는 클래스명 >> 호출 불가!
		pack_two.ExPack_0320_package ex1 = new pack_two.ExPack_0320_package(); 
		// pack_two 패키지명을 명시 >> 호출 가능!
		//해당 과정을 생략하기 위해서는
		ExPack_0320_package ex2 = new ExPack_0320_package();
		// pack_two에 있는 클래스임을 확인시켰다 !!
		
		//단, 같은 이름의 클래스를 가진 다른 패키지의 클래스를 불러온다면 ..
		pack_three.ExPack_0320_package ex3; // 짠, 이렇게 돼버린다 !!
		// import 키워드를 사용하면 에러가 발생한다 !! (위에가서 참고)
		
		// 만약, 서로 다른 패키지에 동일한 클래스가 존재할 경우, import문을 통해 포함시키더라도 각 클래스 구분을 위해
		// 최소 하나의 클래스는 패키지명까지 명시하여야 한다 !!
		// >> 단, 실제 작성시에는 명확한 구분을 위해 둘 다 패키지명을 명시하는것이 좋다.
		
		// ex2 >> pack_two , ex3 >> pack_three
		
		
		

	}

}// public class end






















