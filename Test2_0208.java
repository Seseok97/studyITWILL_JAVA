package if_;

public class Test2_0208 {

	public static void main(String[] args) {
		//창원씨가 주운 돈
		System.out.println("학원 가기");
		int money = 0;
		
		//if~else문을 사용하여, 돈이 5000원 이상 있으면 택시, 없으면 버스.
		if(money>=5000) {
			System.out.println("택시");
		}else {
			System.out.println("버스");
		}
		System.out.println("도착");
		System.out.println("---------------------------");
		
		//if~else문
		// 나이 > 20대인가?
		// t: 당신은 20대입니다
		// f: 당신은 20대가 아닙니다.
		int age = 3;
//		if(20<=age && age <=29) { // 보기 편하다고 생각해서 변수가 중간에 가도록 만들었는데
		if(age>=20 && age<=29) { // 스타일 차이는 있어도 보통 이렇게 작성 한다고 하심.
			System.out.printf("당신의 나이는 %d세로, 20대입니다.\n",age);
		}else {
			System.out.printf("당신의 나이는 %d세로, 20대가 아닙니다.\n",age);
		}
		System.out.println("---------------------------");
		//무료입장
		// 5세 미만, 65세 이상 무료
		if(age<5 || 65<=age) {
			System.out.printf("%d세는 무료입장 대상입니다.\n",age);
		}else {
			System.out.printf("%d세는 무료입장 대상이 아닙니다.\n",age);
		}
		System.out.println("---------------------------");
		//대소문자 판별
		char ch ='a';
		if(ch>=65 && ch<=90) {
			System.out.println("ch는 대문자");
		}else {
			System.out.println("ch는 소문자거나 기타문자.");
		}
		System.out.println("---------------------------");
		//소문자 변환 // 32차이
		if(ch>=97 && ch<=122) {
			char ch1 = (char)(ch - 32);
			System.out.println(ch+"는 소문자로, 대문자 변환 실행 --- " +ch1);
		}else {
			System.out.println(ch+"는 대문자이거나 기타문자임.");
		}
		
		
		
		

	}

}
