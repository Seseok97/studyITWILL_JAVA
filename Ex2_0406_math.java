package math_class;

public class Ex2_0406_math {

	public static void main(String[] args) {
		/*
		 * Math.random()
		 * > 난수 발생 메서드
		 * - 0.0 < x<  1.0 double 타입의 난수가 발생한다.
		 * 
		 * <난수 발생 기본 공식>
		 * 1. (정수화)(Math.random()*상한값)	: 0 ~ 상한값 -1 (0<= x <상한값)
		 * 2. (정수화)(Math.randon()*상한값 +1) : 1 ~ 상한값	(1<= x <=상한값)
		 * 
		 */
		
		// 랜덤의 기본형
		for(int i=0;i<10;i++) {
			System.out.println("기본형: "+Math.random());
		}// for end
		
		System.out.println("------------------------------------");
		
		// 정수 1자리범위 난수 발생시키기
		for(int i=0;i<10;i++) {
			System.out.println("정수형: "+(int)((Math.random())*10));
		}// for end
		
		System.out.println("------------------------------------");
		
		// 상한값 제한
		for(int i=0;i<10;i++) {
			System.out.println("상한값 = 10: "+(int)(Math.random() * 10 + 1));
		} // for end
		
		System.out.println("------------------------------------");
		
		// 1~20 사이의 난수
		for(int i=0;i<10;i++) {
			System.out.println("상한값 = 20: "+(int)((Math.random() * 20) + 1));
		} // for end
		
	}// main() method end

}// public class end
