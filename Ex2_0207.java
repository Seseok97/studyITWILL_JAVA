package if_ ;

public class Ex2_0207 {

	public static void main(String[] args) {
		// 조건문
		// - 조건식의 결과에 따라 실행문이 달라지는 문(Statement)
		// - if / switch
		
		// if문
		// 1. 단일 if문
		//	   > 가장 단순한 if문
		// 	   > 조건식의 결과가 true 일때 특정 문장(블록!!)을 추가로 실행
		
		
//		문장1
//		 if(조건식){
//			조건식의 결과가 true일때 실행문
//		문장2
//			}
//		문장3
		
		// 조건식 == true : 문장1 > 문장2 > 문장3
		// 조건식 == false : 문장1 > 문장3
		
		//예시
		System.out.println("프로그램 시작"); 		   // 문장 1
		int num = 10; 							  	   // 문장 1
		
		if(num>5) { 	//정수 num이 5보다 작은가? >> true/false 둘중 하나만 반환하겠죠?
			// 조건식 결과가 true일때 수행할 문장들
			System.out.println("num이 5보다 작다 !");  // 문장 2 // false이기때문에 실행되지 않음
		}
		// if문이 종료된 후 실행할 문장
		System.out.println("프로그램 종료!"); 		   // 문장 3
		
		System.out.println("=============================");
		//정수 num2의 절대값을 계산하여 출력
		int num2 = -5; // 문장 1
		if(num2<0) { // num2가 0보다 작을때
			num2 = -num2; // 문장 2
			System.out.println("음수를 양수로 변환하였습니다."); // 문장 2
		}
		System.out.println("num2의 절대값은 "+num2+"입니다."); // 문장 3
	}

}
