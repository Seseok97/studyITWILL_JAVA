package for_;

public class Test3_0209 {

	public static void main(String[] args) {
		//강사님께서 설명끊길수도있다고 하셔서 14일자 패키지에 미리 만들어둠 !! 0209
		// 밖for i값 1~10까지 반복할동안
		// 안for j값 1~5까지 반복하며 i와 j값 출력
		int i,j;
		for(i=1;i<=10;i++) {
			System.out.println("i = "+i);
			for(j=1;j<=5;j++) {
				System.out.println("  j = "+j);
			}
			System.out.println(" j STOP");
		}
		System.out.println("i STOP");
		
		
		
	}

}
