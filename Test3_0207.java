package if_;

public class Test3_0207 {

	public static void main(String[] args) {
		System.out.println("아이티윌로 걸어서 출발!");
		
		// 창원씨가 주운 돈 5000원을 int형 변수 money에 저장
		// 돈이 5000원 이상 = 택시타고 가기 출력 
		// 돈이 5000원 미만 = 버스타고 가기 출력
		
		int changMoney = 1000;
		int gettodaze = 2000;
		if (changMoney+gettodaze>=5000) {
			System.out.println("택시타고 가기");
		}
		if (changMoney+gettodaze<5000) {
			System.out.println("버스타고 가기");
		}
		
		System.out.println("아이티윌 도착!");
		System.out.println("=============================");
		
		//if문 조건식에 비교연산자, 논리연산자 등을 조합하여 활용
		//1. 나이를 입력받아 20대인지 판별(age는 정해둠)
		//   > 20대 : 20세 이상 29세 이하
		// 나이가 20대일경우 당신은 20대입니다 출력
		
		int age = 100;
		if(20<=age && age<=29) {
			System.out.println("당신은 20대입니다.");
		}
		if(age<20 || 30<age) {
			System.out.println("당신은 20대가 아닙니다.");
		}
		// 조건문이 바로 떠오르지 않으면 한글로 먼저 써보고 생각하는것도 좋음
		System.out.println("----------------------------------");
		//2. 나이를 입력받아 놀이동산 무료입장 여부 판별
		// 무료입장 : 5세 미만, 65세 이상
		
		if(5<=age && age<65) {
			System.out.printf("%d세는 무료입장 대상이 아닙니다.\n",age);
		}
		if(age<5 || 65<=age) {
			System.out.printf("%d세는 무료입장이 가능합니다. \n",age);
		}
		
	}

}
