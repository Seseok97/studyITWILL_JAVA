package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Ex4_0509_lambda {

	public static void main(String[] args) {
		// 람다식 응용
		
		String[] str = {"this","is","java","world"};
		System.out.println(Arrays.toString(str)); // [this, is, java, world]
		
		Arrays.sort(str); // 오름차순 정렬
		System.out.println(Arrays.toString(str)); // [is, java, this, world]
		
		/*
		 * 새로운 정렬 기능을 만들기 위해서는 ? (내림차순 정렬 만들기)
		 * > 내부적으로 Comparator 의 compare() 메서드 사용.
		 * 	 새로운 기능을 만들고, Arryas.sort()에 전달하면 된다.
		 * 		>> 자바에서는 함수만 전달할 방법이 없다. 
		 * 		   따라서, 해당 기능을 가지는 객체를 전달해야 한다.
		 * 		   이때 !! 일회용으로 정렬기능을 가지는 익명의 내부클래스를 생성한다.
		 * 
		 */
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// -1을 곱하여 내림차순으로 정렬한다.
				return o1.compareTo(o2) * -1;
			}// compare() method end
			
		});
		// 내림차순 정렬 후
		System.out.println(Arrays.toString(str)); // [world, this, java, is]
		
		/*
		 * 정렬을 위해 필요했던 기능 > Comparator가 아니고!! compare()!! 이다. > 메서드만 필요한데, 메서드만 들고올 수는 없음.
		 * compare() 메서드만 있으면 되는데, 자바언어 특성으로 인해 익명의 내부클래스를 만들고 객체화하여 전달하고 있다.
		 * 이 부분을 람다식으로 표현하면 좀 더 쉽게 표현이 가능하다.
		 */
		System.out.println("=====================================================");
		// 위의 코드를 람다식으로 표현
		Arrays.sort(str, (String o1, String o2) -> {return o1.compareTo(o2) * -1;});
		// 위의 람다식 코드를 줄이면
		Arrays.sort(str, (o1, o2) -> o1.compareTo(o2) * -1);
		// 내림차순 정렬 후
		System.out.println(Arrays.toString(str));

	}// main() method end

}// public class end




















