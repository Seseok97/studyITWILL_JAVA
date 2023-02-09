package for_;

public class Ex3_0209 {
	public static void main(String[] args) {
		//강사님께서 설명끊길수도있다고 하셔서 14일자 패키지에 미리 만들어둠 !! 0209
		
		//중첩 for문
		// > for문 내부에 또 다른 for 문을 기술하는 것.
		// > 바깥 for문과 안 for문으로 구분
		// >> 바깥 for문이 한바퀴 돌 때, 안 for문은 여러 바퀴 돌리는것이 가능 !
		// >>> 안 for문 반복 횟수 = 안 for문 횟수 * 밖 for문 횟수
		// ex) 시계 분침 > 60번 돌때 ... 시침 > 1번 >> 분침: 안for / 시침: 밖for
		//		초침 > 60 / 분침 > 1 >>> 시침 1 > 분침 60 > 초침 3600(분침60*초침60)
		
		//형태
//		for() { // 밖for
//			문장1
//			for() { // 안for
//				문장2
//				// 반복횟수 = 안for 반복횟수 * 밖for 반복횟수
//			}
//		}
		
		//밖for: i값이 1~3까지 1씩 증가하며 반복
		int i;
		int j; // 보통 i다음 제어변수 j씀(알파벳순)
		
		for(i=1;i<=3;i++) {
			System.out.println("i = "+i);
			for(j=1;j<=2;j++) {
				System.out.println(">> j = "+j);
				//반복횟수 = j(2회) * i(3회) = 6회
			}
			System.out.println("=> 안for 반복종료");
		}
		System.out.println("밖for 반복종료");
		
	}

}
