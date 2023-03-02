package array_;

public class Ex2_0302_array {

	public static void main(String[] args) {
		/*
		 * 2차원 배열 
		 * >> 1차원 배열 여러개의 묶음을 관리하는 배열
		 * 
		 * >> 행과 열로 이루어진 테이블(표) 구조와 유사한 구조의 배열
		 * 		행과 열의 인덱스는 1차원 배열과 동일하다.
		 * 
		 * <2차원배열 선언 및 생성의 기본 문법>
		 * 데이터타입 [][] 변수명 = new 데이터타입[행크기][열크기];
		 * 
		 * <2차원 배열 접근 기본 문법>
		 * 변수명[행인덱스][열인덱스];
		 * 
		 * <2차원 배열 선언, 생성, 초기화를 한꺼번에 수행하는 방법>
		 * 데이터타입[][] 변수명 ={
		 * 		{값1, 값2, ... 값n}	// 0행
		 * 		{값1, 값2, ... 값n}	// 1행
		 * 		{값1, 값2, ... 값n}	// 2행
		 *		{값1, 값2, ... 값n}	// n행
		 * 
		 * <2차원 배열 크기>
		 * 1. 행의 크기: 변수명.length
		 * 2. 열의 크기: 변수명[행번호].length
		 * 
		 * <2차원 배열의 모든 요소를 차례대로 접근하는 문법>
		 * for(int i = 0; i < 변수명.length; i++){
		 * 		for(int j = 0; j < 변수명[i].length; j++){
		 * 			//변수명 i행의 j열 !!
		 * 			// 변수명 [i][j]로 각 요소에 접근
		 * 		}
		 * }
		 */
		
		//int형 2차원배열 arr 생성(3행 2열 크기)
//		int[][] arr;
//		arr = new int[3][2];
		// 위 두 문장을 한 문장으로 결합. >> 선언과 생성을 동시에 수행.
		int[][] arr = new int[3][2];
		// 위 코드는 아래와 같은 형태이다.
		
		//    0열    		  1열
		//   1(0,0)   		 2(0,1)  // 0행
		//	 3(1,0)   		 4(1,1)	 // 1행
		// 	 5(2,0) 	     6(2,1)	 // 2행
		
		arr[0][0] = 1; arr[0][1] = 2;
		arr[1][0] = 3; arr[1][1] = 4;
		arr[2][0] = 5; arr[2][1] = 6;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[1][0]);
		System.out.println(arr[2][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][1]);
		
		System.out.println("-------------------------------------------");
		
		//배열 크기 알아내기
		//1. 배열의 행 크기 알아내기 : 배열명.length
		System.out.println("배열 arr의 행 크기: "+arr.length);
		//2. 배열의 각 행에 대한 열 크기 알아내기: 배열명[행인덱스].length
		System.out.println("배열 arr의 0번행 열 크기: "+arr[0].length);
		System.out.println("배열 arr의 1번행 열 크기: "+arr[1].length);
		System.out.println("배열 arr의 2번행 열 크기: "+arr[2].length);
		
		// 모든요소 접근하기
		//1. 바깥 for문을 사용하여 행 크기만큼 반복(1차원배열 접근과 동일하다.)
		for(int i = 0;i<arr.length;i++) {
			//2. 안for문을 사용하여 각 행의 크기만큼 반복.
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=============================================");
		
		int[][] arr2 = {
				//전체 블록 내의 중괄호(블록) 개수 = 행의 개수
				// 내부 중괄호(불록) 내의 데이터 개수 = 열의 개수
				{1,2},	// 0행(0열, 1열)
				{3,4},	// 1행(0열, 1열)
				{5,6},	// 2행(0열, 1열)
		};
		//중첩for문을 사용하여 2차원 배열 차례대로 접근
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=============================================");
		
		/*
		 * 이름을 저장하는 배열 names를 생성하고 다음과 같이 초기화
		 * 
		 * 0행 : 홍길동, 이순신, 강감찬
		 * 1행 : 손영신, 강병수, 이소연
		 * 2행 : 이소라, 공진영, 채효진
		 */
		
		String[][] names= {
				{"홍길동","이순신","강감찬"},
				{"손영신","강병수","이소연"},
				{"이소라","공진영","채효진"}
		};
		
		//중첩for문을 사용하여 2차원 배열에 차례대로 접근
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.print(names[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=============================================");
		// 2차원 배열은 행을 먼저 생성한 후, 별도로 열을 각각 생성 가능하다.
		// 데이터타입[][] 배열명 = new 데이터타입[행크기][];
//		int[][] arr3 = new int[3][]; // 3행의 공간이 먼저 생성된다.
		
		//각 행에 접근하여 열을 생성하는 코드를 작성.
//		arr3[0] = new int[3]; // 정수형 배열 3개를 저장하는 공간을 생성
//		arr3[1] = new int[2]; // 정수형 배열 2개를 저장하는 공간을 생성
//		arr3[2] = new int[4]; // 정수형 배열 4개를 저장하는 공간을 생성
		
//		arr3[0][0]=1; arr3[0][1]=2; arr3[0][2]=3;
//		arr3[1][0]=1; arr3[1][1]=2; 
//		arr3[2][0]=1; arr3[2][1]=2; arr3[2][2]=3; arr3[2][3]=4;
		
		//각 행의 공간에 열 공간을 생성하면서 데이터 초기화까지 수행
//		arr3[0] = new int[] {1,2,3};
//		arr3[1] = new int[] {1,2};
//		arr3[2] = new int[] {1,2,3,4};
		// 배열의 크기를 정하지 못한 경우
		int[][] arr3 = {
				{1,2,3},
				{1,2},
				{1,2,3,4}
		};
		//반복문을 사용하여 배열 내의 모든 데이터 출력
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		// 열의 크기가 모두 같아야할 필요는 없다.

	}//main() method end

}//class end
