package while_;

public class Ex2_0214 {

	public static void main(String[] args) {
		// do-while문
		// while문: 조건을 먼저 검사하고 반복 여부를 결정.
		// do-while문: 반복을 먼저 1회 실행하고 조건을 검사하여 반복 여부를 결정
		
		// while문은 조건식에 따라 반복문 실행이 없을수도 있으나,
		// do-while문은 최소 1번, 반복문이 실행 된다.
		
		//do{
		//	실행문;
		//}while(조건식);
		// !주의! >> while문 뒤에 반드시 이스케이프 입력해야한다 !!
		
		int i=11;
		while(i<=10) { // i <=10 == false이기때문에 반복문은 실행되지 않는다.
			System.out.println("i= "+i);
			i++;
		}
		System.out.println("while문 종료후 i의 값: "+i );
		System.out.println("-----------------------------------");
		
		do {
			System.out.println("i= "+i); // 아래 while문의 조건식은 false이지만 ! 실행은 된다.
			i++;
		}while(i<=10);// false, 여기서 걸림
		System.out.println("do-while문 종료후 i의 값: "+i );
		System.out.println("-----------------------------------");


	}//end

}
