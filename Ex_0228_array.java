package array_;

public class Ex_0228_array {

	public static void main(String[] args) {
		/*
		 * 배열(array)
		 *  > 같은 타입의 테이터 여러개를 하나의 묶음(변수)로 다루는 메모리 공간
		 *  
		 * 특징
		 *  1. 같은 타입 데이터만 저장 가능
		 *  2. 여러 변수에 해당하는 메모리 공간이 연속된 공간에 차례대로 생성됨.
		 *  	>> 한번 생성된 배열은 크기 변경 불가능!
		 *  3. 기본 데이터타입과 참조 데이터타입 모두 배열로 사용 가능!
		 *  4. 배열은 선언, 생성, 초기화의 3단계 과정을 거쳐서 사용
		 *  5. 배열생성시 각 공간에 해당하는 인덱스(번호)가 자동으루 부여됨
		 *  	>>0부터 시작하며, 배열크기-1까지 부여됨
		 *  6. 배열이 생성될 경우, 배열의 데이터 저장 공간은 배열의 데이터 타입에 해당하는 기본값으로, 자동 초기화.
		 *  (byte, short, int = 0, long = 0L, float = 0.0f, double = 0.0, char = '\u0000' 또는 0, boolean = false, String = null) >> 미입력시 해당 기본값이 자동으로 초기화된다.
		 *  7. 배열의 이름(변수명)을 사용하여 배열에 접근 가능 (인덱스 필요)
		 *  8. 배열의 크기는 배열명.length 속성을 통해 알아낼 수 있음.
		 *  
		 * <배열 선언 기본 문법>
		 *  데이터타입[] 변수명;
		 *  > 변수선언과 유사하나, 데이터타입 뒤에 []대괄호 기호를 붙여 배열임을 표시한다.
		 *  > 배열 공간이 생성되기 전이므로, 아직 데이터 저장은 불가하다.
		 *  > 선언된 배열의 변수는 참조형 변수로 취급된다.(int a != int[] a)
		 *  	(주의! int는 기본형(리터럴값)이지만, int[]는 참조형이다.(주소값))
		 *  
		 * <배열 생성 기본 문법>
		 *  변수명 = new 데이터타입[배열크기];
		 *  > new 키워드를 사용하여 배열공간을 생성하며, 데이터타입 뒤의 대괄호 안에 생성할 배열의 크기를 명시한다.
		 *  > 생성되는 배열의 위치(주소값)를 선언된 배열 타입의 변수명에 저장.
		 *  > 이제, 실제 메모리 공간에 배열이 생성되었으므로 데이터 저장이 가능해 진다.
		 *  > 생성된 배열에는 자동을 인덱스 번호가 부여된다.
		 *  (인덱스 번호는 0~배열크기-1 까지 자동으로 부여된다.)
		 *  
		 *  <배열 선언 및 생성을 하나의 문장으로 결합>
		 *  데이터타입[] 변수명 = new 데이터타입[배열크기];
		 *  
		 *  <배열 접근 기본문법>
		 *  변수명[인덱스]
		 *  > 변수명에 해당하는 주소(배열 공간)에 접근한 뒤, 인덱스에 해당하는 데이터 저장공간에 접근 !!
		 *  > 배열에 데이터 초기화(저장)시
		 *  변수명[인덱스] = 데이터;
		 *  
		 *  <반복문을 사용한 배열의 모든 인덱스 접근 기본 공식>
		 *  for(int i=0;i<배열명.length;i++){
		 *  //배열명[i] 형태로 접근.
		 *  }
		 *  
		 *  
		 */
		
		
		//배열은 왜 필요한가 ?
		// 학생 점수 5개를 별도의 변수에 저장하고 관리하는 경우
		int score1 = 90, score2 = 60, score3 = 70, score4 = 100, score5 = 50;
		int scoreTotal = score1+score2+score3+score4+score5;
		//... 만약 점수가 200개면 .. 너무 힘들어진다 !!!!
		
		// 학생 점수 5개를 배열로 저장하고 관리하는 경우
		// 학생점수 5개(정수)를 저장할 배열(score) 선언 및 생성, 초기화
		// 1. 배열 선언: 데이터타입[] 배열명;
		int[] score; // int형 정수 여러개를 저장할 배열 score를 선언 > 아직 데이터를 저장할 수 있는 메모리 공간은 없음 !!!!
//		score = 90;//err, type mismatch! score은 참조형 array, 90은 기본형 int타입이기때문 !
		
		// 2. 배열 생성 : 배열명 = new 데이터타입[배열크기];
		score = new int[5];
		// 연속적인 int형 배열 공간 5개를 생성하고, 해당 공간의 메모리 주소를 int[] 타입 변수 score에 저장!
		// > 이때, 5개의 메모리 공간에는 각각의 인덱스 번호가 자동으로 부여된다.(0~4)
		
		//배열 선언 및 생성을 하나의 문장으로 결합
		// int[] score = new int[5];
		
		//배열에 접근하여 각 배열 공간의 데이터 출력
		// > 배열명이 score 이므로 score[인덱스] 형식으로 접근
		System.out.println(score); //[I@4361bd48 >> 주소값 !! , 배열명 그대로 출력시 heap메모리 주소값이 튀어나온다 !!
		System.out.println(score[0]); //0  출력, 배열의 0번째 인덱스데이터 값!
		System.out.println(score[1]); //0  출력, 배열의 1번째 인덱스데이터 값!
		System.out.println(score[2]); //0  출력, 배열의 2번째 인덱스데이터 값!
		System.out.println(score[3]); //0  출력, 배열의 3번째 인덱스데이터 값!
		System.out.println(score[4]); //0  출력, 배열의 4번째 인덱스데이터 값!
		// 0만 5개가 출력되는데, 각 인덱스에 값을 넣지 않았기때문에 int타입의 기본값인 0이 출력되는 것!!
		
		//주의 ! 생성된 배열의 인덱스 범위를 벗어나는 배열 접근시 오류 발생!
		// > 문법적인 오류가 아니다 !!! > 컴파일에러(빨간줄뜨는 친구)가 아니라고 인식함.
		// > 프로그램 실행 시점에서 오류가 발생한다.

//		System.out.println(score[5]); //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 >> 5번 인덱스가 범위를 벗어났다.
									  //at array_.Ex_0228_array.main(Ex_0228_array.java:78) >> 어레이 위치는 78번줄에 있다 !
		//에러 라인으로 인한 주석처리
		
		System.out.println("-----------------------------------");
		// 베열에 데이터 저장(초기화)
		score[0]=90;
		score[1]=60;
		score[2]=70;
		score[3]=100;
		score[4]=50;
//		score[10] = 30; // err, 인덱스 범위를 벗어나있기 때문 !!(위 예시)
		
		System.out.println("---직접 입력---");
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		System.out.println("---for반복문---");
		//배열의 모든 인덱스에 접근 시 조건식에 배열크기를 직접 지정할 경우, 배열크기가 변경되면 조건식 코드도 변경되어야 한다.
		// "배열명.length" 속성을 사용하여 배열의 크기(길이)를 알아낼 수 있다.
		System.out.println("score의 크기: "+score.length);
		
		for(int i=0;i<score.length;i++) { // 배열 전체길이 접근의 기본 공식
			System.out.println(i+"번 인덱스: "+score[i]);
		}
		// > 만약 배열의 크기가 변경되어도 동적으로 대응이 가능해진다.
		
		System.out.println("=============================================");
		
		// 배열 선언시 []대괄호 기호의 위치에 따른 차이점.
		int[] arr1,arr2; // arr1, arr2 모두 array로 선언됨.
		int arr3,arr4[]; // arr4만 array로 선언됨. arr3은 int로 선언된다.
		// JAVA는 int[] arr1,arr2의 형태로 배열 선언하는것을 권장하고 있다.
		
		
		
		
		
		
		
		

	}//main() method end

}//Ex_0228_array class end