
public class Ex2_0130 {
	public static void main(String[] args) {
		// <식별자(~명) 작성 규칙>
		// [필수]
		// 1.첫 글자 숫자 X
		// 2. 특수문자는 $(달러) 또는 _(언더스코어)만 사용 가능
		// 3. 대소문자 구별 (int a != int A)
		// 4. 키워드(예약어) 사용 불가
		// 5. 공백 사용 불가, _(언더스코어)로 표현(ex:data_Value)
		//---------------------------------------------------------
		// [권장사항]
		// 6. 의미가 있는 단어 사용(int a < int total)
		// 7. 변수명의 첫 단어는 소문자, 두번째단어 부터는 첫글자를 대문자로. >> Camel-case 표기법
		//    ex) int dataValueTotal             Class명은 첫글자가 대문자 !! >> Pascal-case 표기법
		// 8. 길이제한 없음
		// 9. 한글 사용이 가능하지만 !! 사용 하지않음(에러가능성) ex)int 숫자; >>> int num;
		//
		
		// 1. 첫 글자 숫자 X
//		int 7eleven; //Err
		int sevenEleven; //ok
		
		// 2. 특수문자는 $(달러) 또는 _(언더스코어)만 사용 가능
		int $ystem_Num; //ok
//		int hashtag#; //Err (Invalid Character)
		
		// 3. 대소문자 구별 (int a != int A)
		int age;
		int Age; // 중복 X!! 다른 식별자로 취급됨
		
		// 4. 키워드(예약어) 사용 불가
		
//		int int; //Err 하다보면 알거임 이거는
//		int char; // Err
		
		// 5. 공백 사용 불가, _(언더스코어)로 표현(ex:data_Value)
//		int my Number; // Err
		int my, Number; // int형 변수 my와 Number을 동시에 선언
		
		// 9.  한글 사용이 가능하지만 !! 사용 하지않음(에러가능성) ex)int 숫자; >>> int num;
		int 숫자; // 사용가능하지만 안씀
		int num; // 편안~
	}

}
