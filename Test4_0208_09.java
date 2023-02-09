package switch_;

public class Test4_0208_09 {

	public static void main(String[] args) {
		// 점수에 따른 학점 계산을 switch문으로 수행할 경우
		// case문에서 값만 지정 가능 >> 범위 지정 불가능 !!
		// 각각 점수 모두 지정
		
		int score =99;
//		switch(score) {
//		case 100: System.out.println("A학점");
//		case 99: System.out.println("A학점");
//		case 98: System.out.println("A학점");
//		case 97: System.out.println("A학점");
//
//		....
//		
//		case 1: System.out.println("F학점");
//		case 0: System.out.println("F학점");
//		}       								// 100줄이나 작성하기 어렵다!!
		String grade = "X";
//		if(score>=100) { 		// 101~109점도 A학점으로 취급됨. >> if문을 같이 사용해야 한다.
//			score = 100;
//		}
		if(score >=0 && score <= 100) {
			switch(score/10) {  // 나누기 연산자는 어차피 몫만 반환하니까 형변환 안했음
				case 10: 
				case 9: grade ="A";break;
				case 8: grade ="B";break;
				case 7: grade ="C";break;
				case 6: grade ="D";break;
				default : grade ="F";
				}
				System.out.printf("%d점은 %s학점입니다.\n",score,grade); //f에 스트링 넣으려먼 %s
		}else {
			System.out.printf("%d는 입력할수 없는 값입니다.\n",score);
		}
		

	}

}
