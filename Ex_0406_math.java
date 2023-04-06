package math_class;

public class Ex_0406_math {

	public static void main(String[] args) {
		/*
		 * java.lang.Math 클래스
		 * > 수학적인 다양한 기능을 상수와 메서드로 제공!
		 * > 모든 상수와 메서드는 클래스명만으로 접근 가능!
		 * 		>> ex) Math.PI, Math.random()
		 * 
		 */
		
		System.out.println("PI 값 = "+Math.PI);
		
		System.out.println("---------------------------------");
		int num = -10;
		System.out.println("num의 값: " + num);
		System.out.println("num의 절대값: " + Math.abs(num));
		System.out.println("num과 20중 큰 값은? " + Math.max(num, 20));
		System.out.println("num과 20중 작은 값은? " + Math.min(num, 20));
		System.out.println("16의 제곱근 : "+ Math.sqrt(16));
		
		System.out.println("---------------------------------");
		
		double dNum = 3.141592;
		System.out.println("dNum의 값: "+ dNum);
		System.out.println("dNum의 소수점 첫째자리에서 올림 값: "+Math.ceil(dNum));
		System.out.println("dNum의 소수점 첫째자리에서 버림 값: "+Math.floor(dNum));
		System.out.println("dNum의 소수점 첫째자리에서 반올림 값: "+Math.round(dNum)); // 정수값을 리턴한다.
		
		/*
		 * round() 메서드는 항상 소수점 첫째자리에서 반올림을 수행한다.
		 * x번째 자리 반올림을 수행하기 위해서는 반올림할 숫자가 소수점 첫째자리에 위치하도록 변형해야 한다!!
		 */
			// ex )
		System.out.println("dNum의 소수점 셋째자리에서 반올림 값: "+(Math.round(dNum * Math.pow(10, 2))) / (Math.pow(10, 2)));
		//															// 반올림		  // 100, 두자리      // 100, 되돌리기.
		// n^m 을 사용하지않고 Math.pow(n,m) 을 사용하는 이유 > '^' 기호의 사용법때문 !! (정규표현식)
		// Math.round() 메서드는 long타입을 리턴함 !!
		// Math.pow() 메서드는 double타입을 리턴함 !!!!!!!! << 위에 식 안바꿔도 실수형으로 표현되는 이유 !!!
		
		// 원하는 소수점자리에서 버림을 하는 경우
		// 3.141592 > 3.1415
		System.out.println("dNum의 소수점 다섯째자리에서 버림 값: "+(Math.floor(dNum*10000))/10000.0);
		//															(int), 강제형변환 해서 소수점을 버리게 하는 방법도 있다 !
		
	} // main() method end

} // public class end
