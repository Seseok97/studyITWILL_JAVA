package java_util_pacakge;

import java.util.Random;

public class Ex_0411_jup {

	public static void main(String[] args) {
		/*
		 * java.util 패키지!
		 * 	> 다양한 기능을 제공하는 유틸리티 클래스들의 모음.
		 * 	> 난수 생성, 날짜 및 시각 관리, 자료구조 등
		 * 
		 * 1) Random 클래스(Math할때 한거랑 약간 다름.)
		 * 	> 난수 발생 기능 전용 클래스.
		 *  > static 메서드가 아닌 메서드 형태로 제공한다. > 인스턴스 생성이 필수!
		 * 	> 정수뿐만 아니라, 다양한 타입의 난수를 제공한다.
		 * 		>> nextXXX() 메서드를 호출하여, 각 기본 데이터타입 난수 발생.
		 * 		>> 특히, nextInt() 메서드를 활용하여 정수화과정 없이 정수형 난수 발생.
		 * 
		 * 
		 * 
		 */
		// Random 클래스 인스턴스 생성
		/*java.util.*/Random r = new Random();
		
		for(int i=1;i <= 5;i++) {
			System.out.println("count: "+i);
			// nextInt() 메서드: int타입 범위(-21억 ~ 21억) 난수 발생
			System.out.println("int형 범위의 난수: "+r.nextInt());
			
			// nextDouble() 메서드: double형 범위의 난수 발생
			// >> Math.random() 메서드와 동일한 결과.
			System.out.println("double형 범위의 난수: "+r.nextDouble());
			
			// nextBoolean() 메서드: true 또는 false 난수 발생
			System.out.println("boolean형 범위의 난수: "+r.nextBoolean());
			
			// nextInt(int) 메서드를 활용하여 원하는 범위의 난수 발생
			// >> 파라미터로 최대값(x) 전달시 0 ~ x-1 범위의 난수 발생
			System.out.println("0~9사이의 난수: "+r.nextInt(10));
			System.out.println("1~10사이의 난수: "+(r.nextInt(10)+1)); // 괄호가 없으면 String+int 처럼 나오던데 왜?
			
			System.out.println("------------------------------------------------");
		}// for end
		
		

	}// main() method end

}// public class end
