package if_;

public class Test3_0208 {

	public static void main(String[] args) {
		// 문자 ch에 대해서 대문자, 소문자, 숫자를 판별 !
		char ch ='1';
		if(ch>='A' && ch<='Z') {
			System.out.println(ch + " = 대문자");
		}else if(ch>='a' && ch<='z') {
			System.out.println(ch+" = 소문자");
		}else if(ch>='0' && ch<='9') {
			System.out.println(ch+" = 숫자");
		}else {
			System.out.println(ch+" = 기타문자");
		}
		
		//문자 ch가 대문자일때 소문자 변환, 소문자일때 대문자로 변환
		// 대/소문자 아닐경우 변환불가 출력
		
//		if(ch>=65 && ch<=90) {
//			char temCh = (char)(ch+32);
//			System.out.println(ch+" >대문자>소문자> "+temCh);
//		}else if(ch>=97 && ch<=122) {
//			char temCh =(char)(ch-32);
//			System.out.println(ch+" >소문자>대문자> "+temCh);
//		}else {
//			System.out.println(ch+"는 변환 불가!");
//		}
		if(ch>=65 && ch<=90) {
			System.out.println(ch+" >대문자>소문자> "+(ch+=32));
		}else if(ch>=97 && ch<=122) {
			System.out.println(ch+" >소문자>대문자> "+(ch-=32)); // 강사님 하시는거 보니까 이게 더 나아보였다
		}else {
			System.out.println(ch+": 변환 불가!");
		}
		
		System.out.println("================================");
		//학생 점수 입력 > 학점 출력
		// 점수 : 정수형 변수 score
		// 학점 : 문자열 변수 grade, 널스트링 저장
		// if문 사용
		// A : 90~100
		// B : 80~89
		// C : 70~79
		// D : 60~69
		// F : 0~59
		// 결과 예시: 85점의 학점: B
		
		int score =50;
		String grade ="";
		
		if(score >=90 && score <=100) {
			grade = "A";
		}else if(score >=80 && score <=89) {
			grade = "B";
		}else if(score >=70 && score <=79) {
			grade = "C";
		}else if(score >=60 && score <=69) {
			grade = "D";
		}else if(score >=0 && score <=59) {
			grade = "F";
		}else {
			grade = "0부터 100사이의 값을 입력하세요.";
		}
		System.out.println(score+"점의 학점: "+grade);
		
		
		

	}

}
