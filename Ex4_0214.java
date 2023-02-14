package break_continue;

public class Ex4_0214 {

	public static void main(String[] args) {
		// break문과 continue문
		// > 반복문 내에서 특정 조건식과 결합하여 반복문의 실행 흐름을 제어한다.
		
		//1. break문
		// > 반복문 내에서 조건식에 따른 반복종료 용도로 사용
		// > 주로 if문과 조합 !!
		
		//for(초기식;조건식;증감식){
		//		if(조건){
		//		break; > 현재 소속된 반복문의 블록문알 빠져나감(종료)
		//	}
		//}
		int i;
		for(i=1; i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				System.out.println("i=5, for반복문 종료 !");
				break;
			} // 5까지만 출력된다.
		}
		System.out.println("--------------------------");
		
		i=1;
		while(i<=10) {
			System.out.println(i);
			if(i==5) {
				System.out.println("i=5, while반복문 종료 !");
				break;
			}
			i++;
		}
		System.out.println("while문 종료 이후 i의 값: "+i);
		System.out.println("--------------------------");
		// 2. continue문
		// > 반복문 내에서 조건식에 따라 반복문의 다음 문장 실행을 생략하고, 다음 반복을 진행하는 용도로 사용.
		
		//for(초기식;조건식;증감식) || while(조건식){
		// if(조건){
		//		continue;
		//		현재 반복문의 continue문 아래쪽 문장의 실행을 생략하고
		//		다음 반복 실행을 위해 for문의 증감식, 또는 while문의 조건식으로 이동한다.
		// 		}
		// 문장 x; // continue문에 의하여 실행이 생략되는 문장
		//}
		
		for(i=1;i<=10;i++) {
			//i==5일때, 출력문 실행을 생략하고 다음반복 실행
			if(i==5) {
				System.out.println("i=5, 출력문 실행 생략 !!");
				continue;
			}
			System.out.println(i); //continue에 의하여, i값이 5일때 출력문이 실행되지 못한다.
		}
		System.out.println("for문 종료후 i의 값: "+i);
		

	} // end

}
