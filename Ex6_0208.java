package switch_;

public class Ex6_0208 {

	public static void main(String[] args) {
		// 입력받은 월이 다음과 같을때, 해당 월의 일수 출력
		
		//1,3,5,7,8,10,12 >> "한 달 =31일"
		//4,6,9,11 >> "한 달 = 30일"
		//2 >> "한 달 = 28일"
		
		int month =1;
		switch(month) {
			case 1:
			case 3:
			case 5: 
			case 7: 
			case 8:
			case 10:
			case 12:
				System.out.println(month+"월의 일수는 31일이다.");
				break; // 출력문 중복을 줄인 코드
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month+"월의 일수는 30일이다.");
				break;
			case 2:
				System.out.println(month+"월의 일수는 28일이다.");
				break;
			default:
				System.out.println("1~12사이의 값을 입력해 주세요.");
				
		}
	}

}
