package while_;

public class Ex3_0214 {

	public static void main(String[] args) {
		// 중첩 while문 // Test_0214 클래스 참조,,  모를때 한번 해봤는데 전역변수라 그런가 안됐음 !!!!
		// > 중첩 for문과 마찬가지로, while문 내부에 또 다른 while문을 기술하는 것.
		
		//초기식 1;
		//while(조건식 1){
		//		실행문 1;
		//		초기식2;
		//		while(조건식2){
		//		실행문2;
		//		증감식2;
		//		}
		//		증감식 1;
		//}
		
		//for문을 사용하여 i값이 1~5가 반복할 동안
		//j값이 1~3까지 반복하는 중첩 for 문을 작성
		for(int i = 1; i<=5;i++) {
			for(int j = 1;j<=3;j++) {
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("----------------------");
		//중첩 while문
		int i=1; // for 안에 들어간 i는 지역변수임.			//초기식 1
		while(i<=5) {										//조건식 1
			int j=1;										//초기식 2
			while(j<=3) {									//조건식 2
				System.out.println("i="+i+", j="+j);		//반복문
				j++;										//증감식 2 
			}
			i++;											//증감식 1
		}
		// 위 for문과 while문의 결과는 같다.
		
		
		
		// Test_0214 클래스 중간의 중첩 while문 시도한것
		
//		dan=2;
//		i=1;
//		while(dan<=9) {
//			System.out.println("< "+dan+"  단 >");
//			while(i<=9) {
//				System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
//				i++;	
//			}
//			dan++;
//		} // 2단 출력 후 정지한다 !! >> 아마도?? i값이 외부에서 선언되어서 그런거 아닐까 ??
		// 							 >> for문은 식 안에서 i값이 선언되니까 ,,
		
		// 왜 틀린건지 알겠지요 ?? >> i=1; 초기식 2를 밖while문 안으로 넣어야 한다 !! 
		
		
	}//end

}
