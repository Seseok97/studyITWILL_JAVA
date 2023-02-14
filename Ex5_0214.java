package break_continue;

public class Ex5_0214 {

	public static void main(String[] args) {
		// 중첩for문을 활용하여 구구단을 출력했었는데,
		// 5단일때 중단하도록 만들어 보자.
		
		int dan = 2;
		int i = 1;
		
		for(dan=2;dan<=9;dan++) {
			System.out.println("< "+dan+"  단 >");
			
			for(i=1;i<=9;i++) {

				if(dan==5) {
					// 안for의 break문: 현재 단이 5단일때 반복을 종료하지 않고,
					// 안for를 빠져나가고, 밖for의 다음반복을 진행한다.
					break;
				} // 5단만 빼고 다 출력한다. continue같을지도?
				
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}//안for끝
			
			// 밖for의 break문: 현재 단이 5단일때 반복문 종료
//			if(dan==5) {
//				System.out.println("5단, 종료");
//				break;
//			}

			
			System.out.println();
		}//밖 for 끝
		
		//Label 기능
		
		// 반복문의 앞에 위치하여, break 또는 continue의 동작지점을 지정한다.
		// break문 또는 continue문 뒤에 해당 레이블의 이름을 지정하는 경우,
		// Label 위치의 다음 반복문에 break 또는 continue문 이적용됨.
		// 보통, 중첩 반복문에서 반복문을 한꺼번에 빠져나갈때 사용된다.
		
		// >>> 그러니까 지정한 곳에서 break 혹은 continue를 실행 시킨다는 것.
		
		//레이블명:
		// 밖반복문(){
		//		안 반복문(){
		//			break 레이블명 혹은 continue 레이블명
		//		}
		//}
		
		EXIT_FOR: // 레이블명, 가독성을 위하여 보통 위로 빼서 쓴다.
		for(dan=2;dan<=9;dan++) {
			System.out.println("< "+dan+"  단 >");
			for(i=1;i<=9;i++) {
				if(dan==5) {
					break EXIT_FOR; // EXIT_FOR 레이블을 찾아 전체 반복문을 종료
				} 
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}//안for끝
			System.out.println();
		}//밖 for 끝
		
		// 위 아래 예시 모두 Lable 사용법인데, 두 예시 모두 가장 위 예제와 다른 결과가 출력 된다.
		
		EXIT_FOR: 
		for(dan=2;dan<=9;dan++) {
			System.out.println("< "+dan+"  단 >");
			for(i=1;i<=9;i++) {
				if(dan==5) {
					continue EXIT_FOR; // EXIT_FOR 레이블을 찾아 해당 반복문을 종료 후 다음 반복문을 실행
				} 
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}//안for끝
			System.out.println();
		}//밖 for 끝
		
		// 이해 하는것이 더 중요한 내용이다 !! 집가서 함 더보자.
		
		
		
		
		
	}

}
