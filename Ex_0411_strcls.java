package string_class;

import java.util.Arrays;

public class Ex_0411_strcls {

	public static void main(String[] args) {
		/*
		 * String 클래스
		 * 
		 * > 문자열데이터를 처리하는 클래스
		 * 
		 * > 리터럴을 사용하여 문자열을 직접 생성하거나 (추천)
		 * 		>> new 연산자를 사용한 인스턴스 생성시, 생성자에 문자열을 전달하여 생성 !
		 * 		  	> 리터럴 사용시 해당 문자열 존재 여부를 상수 풀에서 검사한 수, 중복되는 문자열이 없으면 생성하고,
		 * 			  중복될 경우 주소값을 리턴하기 때문에 메모리 공간 낭비가 줄어들게 된다.
		 * 		>> new 연산자 사용 시 문자열 중복여부와 무관하게 문자열 객체가 생성된다.
		 * 
		 * > 문자열 내용 비교시 동등비교연산(==)보다 equals() 메서드를 사용한다.
		 * 
		 * > 문자열을 생성하면 String 클래스 내부적으로 char[] 으로 관리된다.
		 * 		>> 개발자의 편의를 위해, 별도의 String 클래스를 만들어서 제공한다.
		 * 		>> 배열 형태 > 배열과 동일한 인덱스 번호를 사용한다. [0],[1]...
		 * 
		 * <String 클래스의 메서드>
		 * > 문자열 수정, 검색, 치환 등 다양한 작업을 수행하는 메서드를 제공.
		 * > String 객체는 불변객체이므로, 원본 문자열을 수정하지 않고 각종 작업을 수행할 경우
		 *   수정된 데이터를 문자열로 새로 생상한다.
		 *   	>> 문자열 수정이 빈번할 경우 메모리 낭비가 심하다!! > StringBuilder 또는 StringBuffer 클래스 활용.
		 * 
		 */
		
		String s1 = "Java Programming";
		String s2 = "        아이티윌           부산 교육센터       ";
		String s3 = "자바/JSP/클라우드";
		
		System.out.println(s1); // toString() 메서드 생략되어있음 !
		System.out.println(s1.toString()); // 저장된 문자열을 리턴
		
		System.out.println("--------------------------------------------------------");
		
		// length(): 문자열 길이(문자열을 분리해놓은 배열크기)리턴
		System.out.println("s1.length(): "+s1.length());
		
		// equals(): 문자열을 비교(대소문자 구별 O)
		System.out.println("s1.equals(\"JAVA PROGRAMMING\"): "+s1.equals("JAVA PROGRAMMING"));
		
		// equalsIgnoreCase(): 문자열 비교(대소문자 구별 X)
		System.out.println("s1.equalsIgnoreCase(\"JAVA PROGRAMMING\"): "+s1.equalsIgnoreCase("JAVA PROGRAMMING"));
		
		// charAt(): 특정 인덱스에 위치한 문자 1개 리턴.
		System.out.println("s1.charAt(5): "+s1.charAt(5));
		
		// substring(): 특정 범위의 문자열을 추출
		// 1) substring(int beginIndex): 시작 인덱스부터 끝까지 문자열 추출
		System.out.println("s1.substring(5): "+s1.substring(5)); // 5번 인덱스부터 마지막 문자열까지 추철
		// 2) substring(int beginIndex, int endIndex): 시작인덱스 ~ 끝인덱스-1 까지
		System.out.println("s1.substring(5, 11): "+s1.substring(5, 11)); // 5번 인덱스부터  10번 인덱스까지 추출
		
		// concat() : 문자열 결합(결합연산자(+)보다 속도가 빠르다.)
		System.out.println("s1.concat(\"!\"): "+s1.concat("!"));
		System.out.println("s1+\"!\": "+s1+"!");
		
		// indexOf(): 특정 문자 또는 문자열의 인덱스를 리턴한다.
		// > 문자열의 앞(0번 인덱스) 부터 탐색.
		// > 팀색할 문자, 혹은 문자열이 존재하지 않을 경우 -1을 리턴한다.
		System.out.println("s1.indexOf(\"a\"): "+s1.indexOf("a"));
		System.out.println("s1.indexOf(\"x\"): "+s1.indexOf("x"));
		
		System.out.println("s1.indexOf(\"Java\"): "+s1.indexOf("Java"));  // 시작인덱스가 리턴된다.
		System.out.println("s1.lastIndexOf(\"a\"): "+s1.lastIndexOf("a"));// 문자열의 뒤에서부터 탐색하여, 가장 뒤의 a의 인덱스넘버가 반환된다.
																		  // 탐색만 역순으로 진행한다. 인덱스넘버가 변경되는것은 아니다!!
		// replace(): 특정 문자 또는 문자열을 치환 > 동일한 문자, 또는 문자열이 존재하는경우 모두 치환한다.
		System.out.println("s1.replace('a', '@'): "+s1.replace('a', '@'));
		System.out.println("s1.replace(\"Java\", \"C\"): "+s1.replace("Java", "C"));
		
		// toUpperCase(), toLowerCase(): 알파벳 영문자를 대,소문자로 변환
		System.out.println("s1.toUpperCase(): "+s1.toUpperCase());
		System.out.println("s1.toLowerCase(): "+s1.toLowerCase());

		
		System.out.println(s2);
		// trim(): 문자열 앞뒤의 공백 제거, 문자열 사이의 공백은 제거하지 않는다.
		System.out.println("교육기관: "+s2.trim());
		
		// contains(): 문자열 포함여부를 리턴한다.
		System.out.println("s2.contains(\"부산\"): "+s2.contains("부산"));
		System.out.println("s2.contains(\"강남\"): "+s2.contains("강남"));
		
		System.out.println("-------------------------------------------------------------");
		
		// split(): 특정 기준으로 문자열 분리.
		// > 분리된 문자열은 배열로 분리된다.
		// > 분리에 사용되는 기준 문자열을 구분자 (분리자, Delimeter) 라고 한다.
		// > 구분자를 지정하는 규칙은 정규표현식을 따른다. (정규표현식? 나중에 배울거임.)
		System.out.println(s3);
//		String s3 = "자바/JSP/클라우드";
		// > 문자열을 "/"기호를 기준으로 분리하여 배열로 관리 가능.
		String[] subjectArr = s3.split("/");
		for(int i=0;i<subjectArr.length;i++) {
			System.out.println("subjectArr["+i+"]: "+subjectArr[i]);
		}
		// "." 기호를 구분자로 지정하는 경우,
		// > 정규표현식에서 특수기호로 사용되어 모든 문자를 구분자로 지정하게 된다.
		// >> 모든 문자가 분리기준이 되어 제거된다!
		String s4 = "안녕하세요. 자바 공부중입니다.";
		String[] strArr = s4.split(".");
		for(int i=0;i<strArr.length;i++) {
			System.out.println("strArr["+i+"]: "+strArr[i]);
		}
		// 모든 문자열이 제거되어 사용이 불가하다!
		
		// 정규표현식 규칙에 따라 "\\." 으로 작성.
		String[] strArr2 = s4.split("\\.");
		for(int i=0;i<strArr2.length;i++) {
			System.out.println("strArr2["+i+"]: "+strArr2[i]);
		}
		System.out.println("-------------------------------------------------------------");
		// String.format() 메서드
		// 특정 문자열을 형식 지정문자(%?)와 결합하여 형식을 갖춘 문자열로 리턴.
		// > printf() 메서드와 형식지정문자 동일
		String name = "양세석";
		int age = 27;
		double height = 171.3;
		// 위 세가지 데이터를 형식 지정문자를 사용하여 출력!
		System.out.printf("이름: %s, 나이: %d, 키: %.1f \n",name,age,height);
		
		String formatStr = String.format("이름: %s, 나이: %d, 키: %.1f ",name,age,height);
		System.out.println("생성된 회원정보: "+formatStr);
		
		System.out.println("===========================================================");
		
		//toCharArray(): 문자열을 char[] 배열로 리턴!
		String s5 = "admin123";
		char[] chArr = s5.toCharArray();
		for(int i=0;i<chArr.length;i++) {
			System.out.println("chArr["+i+"]: "+chArr[i]);
		}
		// Arrays.toString(): 배열 내의 모든 데이터를 문자열로 결합하여 리턴!
		System.out.println(Arrays.toString(chArr));
		
		
		
		
		

	}// main() method end

}// public class end



















































