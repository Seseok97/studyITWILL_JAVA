package if_;

public class Ex_0208 {

	public static void main(String[] args) {
		// 2. if~else문
		// 	  >> 조건식 판별 결과가 true일 때와 false일때 서로 다른 블록을 수행
		//	  >> 삼항연산자와 유사하나, 더 유연함. > 조건식 결과에 따라 실행 가능한 문장이 더 다양하다 !!
		//    >> if문 블록 : true, else문 블록: false일때 실행

		//문장 1;	
		//if(조건식){
		//	문장 2; // true일때 실행
		// }else{
		//	문장 3; // false일때 실행
		// }
		//문장 4;
		
		// 조건식이 true일때: 문장 1 > 문장 2 > 문장 4
		// 조건식이 false일때: 문장 1> 문장 3> 문장 4
		
	
		// 정수 num에 대한 절대값 계산
		int num = 100;					//문장1
		if(num <0) { 				//조건식 > t/f반환
			System.out.println("절대값 변환 실행");
			num = -num;				//문장2 t
		}else {
			System.out.println("num은 양수.");;				//문장3 f
		}
		System.out.println("num의 절대값 = "+num); 	//문장4 t/f와 관계없이 실행
		System.out.println("====================================");
		
		//정수 num에 대해 홀수, 짝수 판별
		if(num%2 ==1) {							//(num%2>0)도 사용 가능함 !!
			System.out.println("num: 홀수");
		}else {
			System.out.println("num: 짝수");
		}

	}

}
