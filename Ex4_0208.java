package if_;

public class Ex4_0208 {

	public static void main(String[] args) {
		// 중첩 if문
		// if문 블록 안에 또 다시 if 문을 사용하여 조건식을 판별 하는 것.
		
//		if(조건식) {		
//			문장 1		// 조건식 1이 true일때 실행
//			if(조건식2) {
//				문장2	// 조건식1이 true이고, 조건식 2도 true일때 실행
//				}else {
//					문장3 // 조건식 1이 true이고, 조건식 2가 flase일때 실행
//			}else if(조건식3){
//			문장4 // 조건식 1이 false이고, 조건식 3이 true일때 실행
//			}
//		}else {
//			문장5 // 조건식 1이 false 일때 실행
//		}
		//Test3_0208에 있는 if문
		int score =-1;
		String grade ="";
		
//		if(score>=0 && score <=100) {
//			System.out.println("점수 입력 완료!");
//			if(score >=90 && score <=100) {
//				grade = "A";
//			}else if(score >=80 && score <=89) {
//				grade = "B";
//			}else if(score >=70 && score <=79) {
//				grade = "C";
//			}else if(score >=60 && score <=69) {
//				grade = "D";
//			}else if(score >=0 && score <=59) {
//				grade = "F";
//			}
//			System.out.println(score+"점의 학점: "+grade);
//		}else{
//			System.out.println("점수 입력 오류!");
//		}
		
		System.out.println("------------------------");
		
		if(score >= 0 && score <= 100) {
			System.out.println("점수입력 완료!");
			if(score >= 90) {		// 90 이상일때, 한칸 위 if블록의 조건문에 의해서 100이하는 이미 달성 되었다 !!
				grade ="A";
			}else if(score >= 80) { // 89 이상인 경우, 위 if문이 이미 실행 되었다 !!
				grade ="B";
			}else if(score >= 70) { // 79 이상인 경우, 위 else if문이 이미 실행 되었다 !!
				grade ="C";
			}else if(score >= 60) { // 69 이상인 경우, 위 else if문이 이미 실행 되었다 !!
				grade ="D";
			}else{					
				// 69 이상인 경우, 위 else if문이 이미 실행 되었고,
				// 위 if블록에 이미 0 이상이 달성 되었다 !!	
				grade ="F";
			}
			System.out.println(score+"점의 학점: "+grade);
		}else {
			System.out.println(score + ": 접수 입력 오류!");
		}
		

	}

}
