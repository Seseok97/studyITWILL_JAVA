package array_;

public class Test2_0228_array {

	public static void main(String[] args) {
		// 아래 배열의 최대값을 구하는 코드를 작성하라.
		// numbers={3, 2, 14, 21, 100, 4, 2, 1}
		// int max; int min; int sum; int avg;
		
		//출력결과
		
		//최대값 : 100
		//최소값 : 1
		//합계 : 
		//평균 : 
		int[] numbers= {3,2,14,21,100,4,2,1};
		int sum = 0;
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println(i+"번 데이터: "+numbers[i]);
			sum += numbers[i];
				if(max<numbers[i]) {
					max = numbers[i];
				}
				if(min>numbers[i]) {
					min = numbers[i];
				}
		}
		System.out.println("--------------------------------");
		
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		System.out.println("합계: "+sum);
		
//		int avg = sum/numbers.length;		 // 평균값은 소수점이 나올 확률이 있어서 double 처리해야한다 !
//		double avg = sum/numbers.length;	 // 18.0으로 표기 된다. >> 이거 두개 다 놓쳤음 !!!! 오답노트에 기입하기.
		double avg = (double)sum/numbers.length;
		System.out.println("평균: "+avg);
		
		//1트 했을때는 헤맸는데, 다 지우고 천천히 하니까 됐다 !!!

	}

}
