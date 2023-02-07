
public class Test2_0207 {

	public static void main(String[] args) {
		// 삼항연산자 사용 !!
		// char ch에 대해 "대문자"와"소문자" 판별
		// 외 나머지는 "기타문자"
		
		char ch = 'A';
		String str = 65<=ch && ch<=90? "대문자":
					 97<=ch && ch <=122? "소문자":
					 48<=ch && ch<=57? "숫자":"기타문자" ;
		// 다른분들꺼 보고 안건데, 그냥 문자 적어도 됨 !! ex) 'A'<=ch && ch<='Z' 의 형태로 !!
		System.out.println(ch+" >ASCII코드> "+(int)ch);
		System.out.println(str); 
		// 아스키코드가 먼저 생각나서 저렇게 했는데, 강사님이 뒤에서 아스키코드 유니코드 몰라도 쓰는 방법 있다고 하실때,
		// 그게 오히려 생각이 안나서 다른분이 하신거 눈치챘음 ;;;; 
		
		System.out.println("------------------------");
		//뷔페 요금 계산
		//1. 기본요금(price) 30,000원
		//2. 손놈의 나이(age)에 따라 할인
		//   > 5세 이하 70% 할인
		//	   65세 이상 50%할인
		
		int bufPrice = 30000;
		int guestAge = 1;
		double lastPrice =  guestAge<=5? bufPrice*0.3:
							guestAge>=65? bufPrice*0.5:bufPrice;
							
		System.out.printf("%d세 요금은 %d원입니다.\n",guestAge,(int)lastPrice); // 내코드 >> 형변환 코드
		
//		lastPrice = guestAge<=5? bufPrice*=0.3:
//					guestAge>=65? bufPrice*=0.5:bufPrice;
//		System.out.printf("%d세 요금은 %d원입니다.\n",guestAge,lastPrice);  // >> 복합연산자 사용시 형변환 필요 없음.
		
//		bufPrice *= guestAge <= 5? 0.3:  // 5세 이하
//				    guestAge >= 65? 0.5: // 65세 이상
//				    1; 					 //기본 요금
//		System.out.println(bufPrice); // 복합연산자 활용 코드
		System.out.println("------------------------");
		
		
		
						
		
		
	}

}
