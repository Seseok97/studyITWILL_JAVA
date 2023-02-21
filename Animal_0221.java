package class_;

// 동물(Animal)에 해당하는 Animal 클래스 정의
//
// 1. 분석
//		> 속성 : 이름(name,String),나이(age,int)
//		> 기능 : 짖다(cry)
//
// 2. 설계 - 클래스의 정의
//<클래스 정의 기본 문법>
// [접근제한자] class 클래스명{
//			// 멤버변수 (name, age)
//			// 메서드	(cry())
//			// 생성자 // 조금있다가
//}

public class Animal_0221 {
	// 1) 멤버변수 선언
	String name; // 이름
	int age;	 // 나이
	// 2) 메서드 정의
	// 짖다(cry): 매게변수 없고, 리턴값도 없는 메서드로 보인다.
	// > "동물 울음소리" 문자열 출력
	public void cry(){ // static이 어디갔노 !!
		System.out.println("멍멍");
	}

}
