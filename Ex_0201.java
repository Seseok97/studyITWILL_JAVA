
public class Ex_0201 {

	public static void main(String[] args) {
//		화면에 데이터를 출력하는
//		print(),printf(),println() 메서드 >> 뒤에 소괄호 붙은거 !! 결과를 보여주는 (출력하는) 일을 해준다.
//		 - System.out.XXXX() 의 형태.

//		1. println() 메서드
//		 - 소괄호() 내부에 출력할 데이터를 전달하면 화면에 출력 !
//		 - 화면에 데이터를 출력한 뒤 줄바꿈을 수행. (아무 값도 없으면 그냥 줄바꾸기만 한다.)

//		2. print() 메서드
//		- 소괄호() 내부에 출력할 데이터를 전달하면 화면에 출력 !
//		- 화면에 데이터를 출력한다. 줄바꿈 하지 않는다. (아무 값도 없으면 에러가 발생 한다.)

//		3. printf() 메서드
//		- 출력할 데이터가 변수 및 여러가지 타입이 복합적으로 사용될 경우
//		  출력할 데이터의 모양을 유지하기 위한 용도로 사용됨.
//		- 화면에 데이터를 출력한다. 줄바꿈 하지 않는다. (아무 값도 없으면 에러가 발생 한다.)
//		- printf() 메서드의 특징.
//							> 소괄호 내부에 문자열 데이터를 첫번째로 사용하고,
//							> 화면에 출력할 데이터 형식을 문자열 내부에서 지정한다.
//							> 이때, 변수 등을 사용할 경우 해당변수가 표시될 자리를
//							> '형식 지정 문자'를 사용하여 표시만 하고,
//							> 문자열이 끝난 후 콤마 기호 뒤에 형식 지정 문자에 들어갈
//							> 데이터를 각각 표시한다.
//							> ex) System.out.println("%d세입니다.", %d);

		System.out.println("println()");
		System.out.println("println()");

		int age = 27;
		System.out.println("나이는 age세 입니다."); // age >>문자열로 취급됨.
		// age라는 변수를 활용 하려면 ?? >> 문자열 바깥에 +기호.
		System.out.println("나이는 " + age + "세 입니다.");

		System.out.println("--------------------------");// ---...--- 출력 후 줄바꿈 !!

		System.out.print("print()");
		System.out.print("print()");
		System.out.println(); // 줄바꿈 수행
		System.out.print("print()");
		System.out.print("print()");
		System.out.print(1);
		System.out.println(); // 줄바꿈 수행
		System.out.println("--------------------------");
		
		String name = "seseok";

		System.out.println("나이는 "+age+"세, 이름은 "+name+"입니다.\n");
		System.out.printf("나이는 %d세, 이름은 %s입니다.\n",age,name);
		
		//형식 지정문자를 사용한 printf()메서드
		// %d: 10진수 1개를 표현
		// %xd: x자릿수만큼 자리를 차지 //잘안씀
		// %0xd : x자릿수 만큼 차지하고, 빈자리를 0으로 채움.
		
		// "%d" 예시
		System.out.printf("%d\n",1); // System.out.println("1"); 과 같은 결과 !!
		System.out.printf("나이는 %d세 입니다.\n",27); // \n: 이스케이프 !! 줄바꿈 명령어
		System.out.printf("나이는 %d세 입니다.\n",age);
		//"%0xd\n" 예시
		System.out.printf("현재 시각은 \n %02d시 %02d분 %02d초 입니다.\n",14,3,5); // 빈자리에 0이 들어감. >> 14시 03분 05초 입니다 출력.
		// >> %d기호가 3개 !! >> 데이터 3개가 순서대로 대입된다.
		
		// %f : 실수 표현
		// %.xf: 소수점x자리 만큼만 표시하는 실수
		System.out.printf("나이는 %.2f세 입니다.\n",27.555); // >> 27.56세로 출력 !! 반올림된다.
		
		//%c : 문자 표현
		System.out.printf("정수 65에 해당하는 문자는 %c 입니다.\n",'A');
		System.out.printf("정수 65에 해당하는 문자는 %c 입니다.\n",65); // ASCII코드
		//char 타입 변수 ch에 문자 'r'저장
		char ch = 'r';
		System.out.printf("%c\n",ch);
		
		//%s : 문자열 표현 
		// String 타입 변수 str에 문자열 "양세석" 저장
		String str = "양세석";
		System.out.printf("이름은 %s입니다.\n", str);
		int classNum = 7;
		System.out.printf("저는 %d강의실에 있고, 이름은 %s입니다.\n",classNum, str);


	}

}
