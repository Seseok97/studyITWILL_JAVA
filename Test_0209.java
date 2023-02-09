package for_;

public class Test_0209 {

	public static void main(String[] args) {
		// for문을 활용하여 특정 단에 해당하는 구구단 출력
		// 출력형태
//		<2단>
//		2 * 1 = 2
//		2 * 2 = 4
//		2 * 3 = 6
//		2 * 4 = 8
//		2 * 5 = 10
//		2 * 6 = 12
//		2 * 7 = 14
//		2 * 8 = 16
//		2 * 9 = 18
		
		int i;
		int dan=1;
		System.out.printf("< %d 단 >\n",dan);
		for(i=1;i<=9;i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i)); //구구단의 dan단 출력
			}
		
		for(dan=1;dan<=9;dan++) {
			System.out.printf("< %d 단 >\n",dan);
			for(i=1;i<=9;i++) {
				System.out.println(dan+" * "+i+" = "+(dan*i)); // 1단부터 9단까지
//				System.out.printf("%d * %d = %d \n",dan,i,dan*i); // >> 윗줄 출력결과와 같음
			}
		}
		

	}

}
