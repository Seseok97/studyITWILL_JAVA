
public class Ex_0130 {

	public static void main(String[] args) {
		/*
		 * 변수(Variables)
		 * - 데이터를 저장하는 메모리공간.
		 * - 변수 공간에는 한번에 하나의 데이터만 저장 가능하고,
		 *   새로운 데이터를 저장하면 기존의 데이터는 제거된다.
		 * - 변수명은 식별자작성 규칙을 따름.
		 * 
		 * <변수 선언 기본문법>
		 * 데이터타입 변수명;
		 * String sayHello;
		 * 
		 * <변수 초기화 기본 문법>
		 * 변수명 = 데이터 //문자열: "", 문자: '', 숫자(정수,실수 ..) : 그냥 적음, L/F숫자 : 숫자 뒤에 데이터타입 표시
		 * sayHello = "Hello,world!"
		 * 
		 * <변수 사용법>
		 * 특정 작업에 변수명을 지정하면 해당 변수에 저장돤 값을 사용 할 수 있다.
		 * System.out.println(sayHello);
		 */
		
		//방금 찾아본거 : print() / println()의 차이 !! 
		// >> print는 줄띄우기 없이 그냥 출력 // println은 줄 띄우고 출력 

		//변수 선언
		int age; // int(정수)형 데이터를 저장할 공간 age 생성
		//변수 초기화
		age = 27; // a = 3.14; || 'A'; ||"Hi"; >> Error
		//변수 사용 // 위 둘중 하나라도 빼먹으면 실행 안됨. 에러메세지를 통해서 원인파악 가능
		System.out.println(age);
		System.out.println("age"); //"", '' 안에 넣으면 문자열/문자로 인식함 !!
		
		//변수에 새로운 값(데이터)을 저장(대입)하면, 기존의 값은 제거됨.
		//int age;    >>> 에러발생, Rename 하라고 나올거임
		age = 24; //기존에 저장된 정수 27을 24로 바꾼것.
		System.out.println(age); // 24 >>> 출력값.
		
		
	}

}


