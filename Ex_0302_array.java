package array_;

public class Ex_0302_array {

	public static void main(String[] args) {
		/*
		 * 배열 내의 데이터에 대한 연산 누적
		 * 0. 연산을 누적할 변수 선언 및 초기화
		 * 1. 배열 생성 및 데이터 저장
		 * 2. for문을 사용하여 배열 내의 모든 인덱스에 차례대로 접근 !
		 *  >> 배열의 인덱스 번호를 제어변수로 지정하여 해당 배열 내의 데이터를 누적 변수에 누적 !
		 * 3. for문 종료 후 누적 변수값 사용
		 */

		// 0. 합계를 누적할 누적변수(int total) 선언 및 초기화
			int total = 0;
			
			// 1. 정수형 데이터 1~10까지 저장하는 배열 arr 생성
			int[] arr = {1,2,3,4,5,6,7,8,9,10};
			
			// 2. for문을 사용하여 배열 내의 모든 인덱스에 차례대로 접근
			for(int i = 0;i<arr.length;i++) {
				System.out.println(arr[i]);		// 배열 내의 모든 데이터 출력
				
				//배열 내의 모든 데이터를 total 변수에 누적
				total += arr[i];	// arr의 i번 인덱스를 total에 누적시킨다.
			}
			//3. 누적된값 출력
			System.out.println(total);
		
		System.out.println("=============================");
		
		// 짝수 / 홀수합 구하기
			int oddTotal = 0;	// 홀수합
			int evenTotal = 0;	// 짝수합
			
			for(int i = 0;i < arr.length;i++) {
				if(arr[i]%2 == 1) {
					oddTotal += arr[i];
				}
				if(arr[i]%2 == 0) {
					evenTotal += arr[i];
				}
			}
			System.out.println("홀수 합: "+oddTotal);
			System.out.println("짝수 합: "+evenTotal);
		
		System.out.println("=============================");
		
		//배열 내의 정수중 최대값을 max에 저장 후 출력
		
			int max = 0;
			int[] array = {1,5,3,8,7};
			
			for(int i=0;i<array.length;i++) {
				if(max<array[i]) {
					System.out.println(array[i]+" 은 "+max+" 보다 크다.");
					max = array[i];
				}else {
					System.out.println(array[i]+" 은 "+max+" 보다 작다.");
				}
			}
			System.out.println("최대값: "+max);
			
		System.out.println("=============================");
		
		//주의사항!! 최대값 등의 비교시, 비교 대상을 변수에 직접 저장할 경우, 조건을 만족하지않는 데이터가 있을 수 있다.
		// 따라서, 배열 내의 데이터를 비교하는 경우 비교대상의 값으로 배열내의 데이터를 갖고 시작하는 것이 좋다.
		int[] arr2 = {-8,-2,-3,-4,-5};
		// ex) 음수끼리의 최대값을 비교 하는 경우, 초기값이 0이면 의도하지않은 결과를 출력할 수도 있다 !!!!
		// 	   위와같은 경우, 초기값을 0이 아니라 배열의 첫번째값이 되도록 한다.
		int num = arr2[0];
		// 초기값을 0번 인덱스로 설정 한 경우, 제어문의 초기식은 0일 필요가 없어진다.
		for(int i = 1;i<arr2.length;i++) {
			if(arr2[i]>num) {
				num = arr2[i];
			}
		}
		System.out.println(num);
		
	}//main() method end

}//Ex_0302_array class end
