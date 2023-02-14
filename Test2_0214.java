package while_;

public class Test2_0214 {

	public static void main(String[] args) {
		// 중첩 while문을 활용한 구구단 출력
		
		int dan = 2;
		while(dan<=9) {
			System.out.println("< "+dan+"  단 >");
			int su = 1;
			while(su<=9) {
				System.out.printf("%d * %d = %d\n",dan,su,(dan*su));
				su++;
			}
			System.out.println();
			dan++;
		}
		
		System.out.println(dan);// while문 밖에서 선언되었다. 전역변수 >> 10
//		System.out.println(su); // 중첩 while문 안에 들어가버렸다. 지역변수 >> 에러발생함
	}//end

}
