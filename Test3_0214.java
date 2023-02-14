package break_continue;

public class Test3_0214 {

	public static void main(String[] args) {
		// 1~100 까지 정수의 합을 계산한다.
		// 이때, 합계가 1000보다 클 경우 반복문을 종료하고 빠져나간 뒤, 1000보다 커지는 시점의 정수x를 출력한다.
		int i=0;
		int sum=0;
		
		for(i=1;i<=100;i++) {
			sum += i;
			System.out.println(sum);
			if(sum >= 1000) {
			System.out.println("1000보다 커지는 시점에서의 정수 x="+i);
				break;
			}
		}
		System.out.println("1~"+i+"까지 정수의 합 = "+sum);
		System.out.println("----------------------------------------------------");
		// 1 + (-2) + 3 + (-4) ... 의 형태로 더할때,
		// 총 합이 100 이상이 되는 x의 값을 출력하라.
		
		i=1;
		sum=0;
		int m =-1;
		
//		for(i=1;i<=100; i++,m = -m) {
//			i = i*m;
//			System.out.println(i);
//			if(sum>=100) {
//				System.out.println("i: "+i);
//				break;
//			} // 너무 어렵게 접근하려고 한 듯.
//			
//		}
		while(true) { // true 대신에 sum < 100 을 조건으로 잡으면 break문 없이도 가능하다 !!
			if(i%2 ==0) {
				sum += -i;
				System.out.println("짝수i :"+(-i));
			}else{
				sum+= i;
				System.out.println("홀수i :"+i);
			}
			if(sum>=100) {
				System.out.println("sum: "+sum+" i: "+i);
				break;
			}
			i++; // 만약 i=0으로 잡으면 while문 바로 밑에 증감식을 넣어도 되겠지요 ??
			
		} // 새로 해서 성공했다 !!!

	}//end

}
