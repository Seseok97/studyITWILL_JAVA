package for_;

public class Ex_0209 {

	public static void main(String[] args) {
		// 반복문
		// > 특정 조건에 따라 지정된 범위의 문장들을 반복 실행하는 문.
		// > for문, while문 >> if문과 switch문 처럼, 둘 다 서로비슷하게 만들 수 있음!!
		// for문 >> 밥을 10번 먹어라!
		// while문 >> 밥을 다 먹을때 까지 먹어라 >>> 와 같이 사용함(둘다 가능은 함 !!)
		
		// 1. for문
		// > 가장 기본적인 반복문
		// > 반복 횟수가 정해져 있는 경우에 주로 사용 
		// > 초기식, 조건식, 증감식의 위치가 정해져 있어 처음 익히기 쉬움
		// >> 초기식: 반복횟수 판별에 사용됨.
		// >> 조건식: 반복여부 판별에 사용됨.
		// >> 증감식: 제어변수를 증가 또는 감소 시키는 문장
		
//		for(초기식;조건식;증감식) {
//			문장 // 조건식 결과가 true 일때 반복 실행할 문장들
//		}
		
		// "n: Hello, world!" 를 5번 출력하기.(강사님은 10으로 하심)
		System.out.println("1: Hello, world!");
		System.out.println("2: Hello, world!");
		System.out.println("3: Hello, world!");
		System.out.println("4: Hello, world!");
		System.out.println("5: Hello, world!");
		// 5번, 10번같은 횟수는 복붙으로 해결 가능하지만, 반복 횟수가 커지면???
		
	System.out.println("=======================================");
	
		//위 출력문을 for문으로 표현하기
		int i;	//제어변수 i 선언(달라질수 있으나, 제어변수는 i로 설정을 많이 함.)
		//int i를 밖에서 선언 할 수도 있고, for문 초기식 안에서 선언 할 수도 있음.
		for(i=1;i<=5;i++) {
			// i는 1부터 시작하고,
			// i가 5보다 작거나 같을때 까지 실행되며
			// i는 1씩 증가한다.(i++가 일반적임. 몬가 다들 i++로 쓴다고 ..)
			System.out.printf("%s: Hello, world!\n",i); // 조건식 결과가 true일때 실행될 문장 
														// >> 실행 이후 조건식으로 돌아감 > true인 경우, 증감식 실행 후 문장 출력
		}
		System.out.println("\n for문 종료 후 i의 값: "+i); // for문 안에서 int i를 선언하면. for문 종료후 사용할수 없다 !!!!(존재하지 않기 때문)
													 	// 그래서 위에서 int i; 선언하는거로 수정했음 (for문보다 위에서 선언해야한다 !!)
		
		//위 for문에 대한 디버깅
		 
		// 초기식(i)  조건식(i<=5)  실행결과("%s: Hello, world!\n",i)  증감식 (i++)
		// ------------------------------------------------------------------------
		// 		1	  	 true				1: Hello, world! 			i=1 >> i=2
		// 		2	  	 true				2: Hello, world! 			i=2 >> i=3
		// 		3	  	 true				3: Hello, world! 			i=3 >> i=4
		// 		4	  	 true				4: Hello, world! 			i=4 >> i=5
		// 		5	  	 true				5: Hello, world! 			i=5 >> i=6
		// 		6	  	 false				[for문 종료]					-
		System.out.println("=======================================");
		
		// for문 예제 제어변수 i가 1~10까지 1씩 증가하면서 출력됨
		// 출력형태 1 2 3 4 5 6 7 8 9 10
		for(i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------");
		
		//for문 예제 제어변수 i가 1~10까지 2씩 증가하면서 홀수 i값 출력 !!
		//출력형태 1 3 5 7 9 
		for(i=1;i<=10;i++) {
			System.out.print((i++)+" ");
		}
		System.out.println();
		for(i=1;i<=10;i+=2) {
			System.out.print(i+" "); // 강사님 코드
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		
		//for문 예제 제어변수 i가 1~10까지 2씩 증가하면서 짝수 i값 출력 !!
		//출력형태 2 4 6 8 10
		for(i=2;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		
		//for문 예제 제어변수 i가 10부터 1까지 1씩 감소하면서 i값 출력	
		// 출력형태 10 9 8 7 6 5 4 3 2 1
		for(i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------");

	}

}
