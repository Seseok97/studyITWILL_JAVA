package class_;

//자동차 클래스의 정의
// 1. 구성요소(속성) - 멤버변수
//	1) 제조사(company, String)
//  2) 모델명(modelName, String)
//  3) 배기량(cc, int)

// 2. 동작(기능) - 메서드
//	1) 속력증가(speedUp()) - "자동차 속력 증가!" 출력 // 파라미터를 넣어서 증가값을 조절할 수 있지만, 지금은 여기까지만 !!
//  2) 속력감소(speedDown()) - "자동차 속력 감소!" 출력


public class Car_0221 {
	//멤버변수 선언
	String company;
	String modelName;
	int cc;
	
	// 메서드 정의
	public void speedUp() {
		System.out.println("자동차 속력 증가 !");
	}
	public void speedDown() {
		System.out.println("자동차 속력 감소 !");
	}

}
