package if_;

public class Ex3_0208 {

	public static void main(String[] args) {
		//다중 if~else if문
		// >> 두가지 이상의 조건식 활용 >>> 세가지 이상의 경우의 수 판별
		// >> 모든 조건이 만족하지 않을 때 실행할 문장 >>> else
		// >> 위에서 아래로 실행됨 >>> 비교범위가 좁은 조건식부터 비교 해야함 !!
		
//		문장 1
//		if(조건식) {
//			문장 2; 			// 조건식 1이 true일때 실행
//		}else if(조건식 2) {
//			문장 3; 			// 조건식 1이 false이고, 조건식 2가 true일때 실행
//		}else if(조건식 3) {
//			문장 4;				// 조건식 1,2가 false이고, 조건식 3이 true일때 실행
//		} ....{
//			
//		}else {
//			문장 5 				// 모든 조건식이 false일때 실행
//		}
//		문장 6
		
		// 정수 num이 양수일때 "양수!" 출력
		// 음수일때 "음수!" 출력
		// 둘다 아니면 "0" 출력
		int num = 6;
		if(num>0) {
			System.out.println(num+ ": 양수!");
		}else if(num<0) {
			System.out.println(num+ ": 음수!");
		}else {								// else if(num==0) >>의 조건도 가능함!!
			System.out.println(num+ ": 0"); 
		}
		System.out.println("---------------------------");
		//홀짝판별 +0 별도 판별
		if(num==0) {							// 좁은 범위부터 !!
			System.out.println(num+ ": 0");		// 0을 먼저 판별하지 않으면 0이 짝수가 나온다.
		}else if(num%2 == 0) {
			System.out.println(num+ ": 짝수");
		}else {
			System.out.println(num+ ": 홀수"); // 얘가 위로 올라가도 됨. 우짜든둥 0 먼저 판별해야 한다 !!
		}
		System.out.println("---------------------------");
		//num이 5보다 클경우 "5보다 크다"
		//num이 10보다 클경우 "10보다 크다"
		
//		if(num>5) {
//			System.out.println("5보다 크다");
//		}else if(num>10) {
//			System.out.println("10보다 크다"); // num>5 안에 num>10이 포함되는 범위이기 때문에 실행되지 않는다 !!!
//		}
		if(num>10) {
			System.out.println("10보다 크다"); // 범위가 좁은 조건식
		}else if(num>5) {
			System.out.println("5보다 크다"); // 범위가 넓은 조건식
		}
		// 의도대로 작성하기 위해서는 위 방식으로 작성해야 함.
		
		
//a
	}

}
