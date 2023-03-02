package array_;

public class Test2_0302_array {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				//array 배열 내의 모든 요소를 누적변수 sum에 누적
				sum += array[i][j];
				count++;
				
			}
		}//for문 end
		avg = (double)sum/count;
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
		
		System.out.println("====================================");
		
		/*
		 * 거스름돈을 몇개의 동전으로 지불할 수 있는지 계산하는 문제 !!
		 * 변수 money의 금액을 동전으로 바꾸었을 때, 각각 몇개의 동전이 필요한지 계산하여 출력하라.
		 * 
		 * 단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다.
		 * 
		 * [출력예시]
		 * money = 2680
		 * 일때,
		 * 
		 * 500원 = 5
		 * 100원 = 1
		 * 50원 = 1
		 * 10원 = 3
		 */
		
		int money = 2680;
		
		int[] coins = {500,100,50,10};
		
		System.out.println("money = "+money+"원");
		for(int i=0;i<coins.length;i++) {
			System.out.println(coins[i]+"원 = "+money/coins[i]+"개");
//			money = money%coins[i];
			money %= coins[i];
			System.out.println("남은 거스름돈: "+money+"원");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main() method end

}//class end
