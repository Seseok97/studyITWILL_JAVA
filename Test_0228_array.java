package array_;

public class Test_0228_array {

	public static void main(String[] args) {
		// int형 배열공간 5개를 생성(arr)하고, 임의의 정수 5개로 초기화 후 출력.
		int[] arr = new int[5]; // Heap메모리에 변수 5개만큼의 공간을 만들고
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;				
		// Heap메모리에 생긴 5개의 공간에 찾아갈수 있는 주소값을 Stack메모리에 저장하고
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"번 인덱스: "+arr[i]);
		}						// 값을 불러온 것.
		
		
		System.out.println("--------------------------------------");
		
		// boolean형 배열공간 3개를 생성(arr2)하고, 임의의 boolean타입 데이터 초기화 후 출력.
		boolean[] arr2 = new boolean[3];
		arr2[0] = true;
		arr2[1] = false;
//		arr2[2] = XXX; //초기화 x!! >> 기본값인 false가 출력된다.
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(i+"번 인덱스: "+arr2[i]);
		}
		
		System.out.println("--------------------------------------");
		
		//String타입 배열 3개를 생성하고, 0번 "홍길동", 1번 "이순신" 문자열로 초기화 후 출력
		String[] arr3 = new String[3];
		arr3[0] = "홍길동";
		arr3[1] = "이순신";
//		arr3[2] = XXX; //초기화 x!! >> 기본값인 null이 출력된다.
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println(i+"번 인덱스: "+arr3[i]);
		}
		
		System.out.println("--------------------------------------");
		
		double[] arr4 = new double[5];
		arr4[0]=1.1;
		arr4[1]=2.2;
		arr4[2]=3.3;
		arr4[3]=4.4;
//		arr4[4]=n.n; // 초기화 x !! >> 기본값인 0.0이 출력된다.
		
		for(int i=0;i<arr4.length;i++) {
			System.out.println(i+"번 인덱스: "+arr4[i]);
		}
		
		

	}//main() method end

}//Test_0228_array class end
