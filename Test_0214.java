package while_;

public class Test_0214 {

	public static void main(String[] args) {
		// while문을 사용하여 구구단 2단 출력
		int dan =2;
		int i =1;
		while(i<=9) {
			System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
			i++;
		}
		// 자꾸 증감식 놓쳐서 에러나니까 조심하기
		System.out.println("--------------------------------------");
//		dan=2;
//		i=1;
//		while(dan<=9) {
//			System.out.println("< "+dan+"  단 >");
//			while(i<=9) {
//				System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
//				i++;	
//			}
//			dan++;
//		} // 2단 출력 후 정지한다 !! >> 아마도?? i값이 외부에서 선언되어서 그런거 아닐까 ??
		// 							 >> for문은 식 안에서 i값이 선언되니까 ,,
		System.out.println("--------------------------------------");
		// while문을 활용하여 정수 1~10까지의 합 계산
		i=1;
		int sum =0; 
		while(i<=10) {
			sum += i;
			System.out.println("i="+i+", sum= "+sum);
			i++;
		}

	}//end

}
