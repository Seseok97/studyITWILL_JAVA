package while_;

public class Ex_0214 {

	public static void main(String[] args) {
		// while문
		// > for문과 마찬가지로, 조건식의 판별 결과가 true 일 동안 반복수행된다.
		// > 초기식과 증감식의 위치가 유동적이다 !!
		// > for문은 반복 횟수가 정해져 있는 경우, while문은 반복 횟수가 정해져있지 않은 경우에 사용한다.
		// for -- while문은 서로 상호변환이 가능하다 !!
		
		// 초기식; //while문보다 위에 위치해야함. 생략 가능
		//while(조건식){
		//		증감식; // 증감식의 위치는
		//		실행문
		//		증감식; // 유동적이다 !!
		//}
		
		//while문을 활용한 "Hello, world!" 10회 반복하기.
		int i=1;		 // 초기식
		while(i<=10) {	 // 조건식
			System.out.println(i+": Hello,world!");
			i++;		 // 증감식
		}
		// 제어변수 i가 while문보다 먼저 선언되었다 !!
		// >> while문 종료 후에도 i값에 접근 가능하다
		System.out.println("while문 종료 이후 제어변수 i의 값: "+i);
		
		//i가 1~10까지 1씩 증가하면서 i값 출력
		// 1 2 3 4 5 6 7 8 9 10
		i = 1;				//위에서 i써먹었다 !!! int i 재선언 불가능. 재활용은 가능
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println("-------------------");
		
		//i가 1~10까지 2씩 증가하며 i값 출력
		// 1 3 5 7 9
		i=1; // 초기식 >> i=2로 두면 짝수 출력
		while(i<=10) {
			System.out.print(i+" ");
			i += 2; //증감식
		}
		System.out.println();
		System.out.println("-------------------");
		//i가 10~1까지 감소하며 i값 출력
		// 10 9 8 7 6 5 4 3 2 1
		i=10;
		while(i>=1) {
			System.out.print((i--)+" ");
			//i--
		}// while문 종료후 i=0
		System.out.println();
		System.out.println("-------------------");
		
		//증감식 위치에 따라 초기식, 조건식이 바뀔 수 있다.
		// 위 예시의 경우, 아래 예시와 같다.
		i=11;
		while(i>1) {
			i--; // --i도 같게 나옴
			System.out.print(i+" ");
		}//while문 종료후 i=1
		System.out.println();
		System.out.println("-------------------");
		
		

	} //end

}
