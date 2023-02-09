package for_;

public class Ex2_0209 {

	public static void main(String[] args) {
		// 반복문을 이용한 연산의 누적(합계 계산 등 !!)
		// 1. 연산을 누적할 누적변수 선언 및 초기화(반복문보다 앞서야 함.)
		// 2. 반복문 사용, 특정횟수 반복
		// 3. 반복문 내에서 특정 연산(데이터)을 누적변수에 누적
		// 4. 반복문 종료 후 누적변수 출력
		
		//1~5의 합을 계산하여 변수에 저장 후 출력
		
		int num = 1; 	// 합계에 누적될 변수
		int sum = 0;	// 누적변수(초기화 필수 !!)
		int numWant = 100; // 1~numWant까지 합계 반복
		
		for(num=1;num<=numWant;num++) {
			sum += num;
			System.out.printf("num = %d, sum = %d \n",num,sum);
		}
		System.out.printf("1부터 %d까지의 정수의 합은 %d이다.\n",numWant,sum);
		
		
		
		
	}

}
