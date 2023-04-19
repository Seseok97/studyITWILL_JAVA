package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex2_0419_colfrw {

	public static void main(String[] args) {
		/*
		 * 반복문을 사용하여 컬렉션의 요소에 반복접근하는 방법 !! (공통방법)
		 * 1. 향상된 for문(forEach문)
		 * 2. Iterator(반복자)
		 * 3. 일반 for문 > List계열만 사용 가능.
		 * 
		 * <향상된 for문>
		 * for(데이터를 꺼내서 저장할 변수 선언:데이터가 저장된 객체){
		 * 		// 데이터가 저장된 변수를 사용하여 요소에 접근
		 * }
		 */
		
		//1. 향상된 for문
		Set set = new HashSet();
		set.add(100);		
		set.add(200);	
		set.add(300);	
		set.add(1);	
		set.add(2);	
		set.add(3);
		
		// Set계열은 인덱스가 없다 ! 일반 for문 사용 불가.
		// 1) 제네릭타입을 지정하지 않는 경우 Object 타입으로 저장.
		for(Object o:set) {
			System.out.print(o+" ");
		}// for end
		
		System.out.println();
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		// 제네릭 타입을 Integer타입으로 지정하는 경우 > Integer타입으로 저장.
		// 변수도 int로 선언해야 한다.
		for(int i:set2) { // AUTO UNBOXING
			System.out.print(i+" ");
		}// for end

		System.out.println("\n=====================================================\n");
		
		/*
		 * <Iterator(반복자)>
		 * 1. 컬렉션 객체(Set || List)의 iterator() 메서드를 호출하여, Iterator타입(구현 클래스)의 객체를 리턴받는다.
		 * 2. while문을 통해 Iterator객체의 hasNext() 메서드가 true일동안 반복.
		 * 3. 반복문 내에서 Iterator 객체의 next() 메서드를 통해 데이터 가져오기!
		 */
		
		Iterator ite = set.iterator(); // Iterator 객체 얻어오기
		while(ite.hasNext()) {				// 다음 요소가 존재할동안 반복
			System.out.print(ite.next()+" "); // 다음 요소를 꺼내어 출력.
		} // while end
		
		System.out.println();
		
		Iterator<Integer> ite2 = set2.iterator();
		while(ite2.hasNext()) {				// 다음 요소가 존재할동안 반복
//			System.out.print(ite2.next()+" "); // 다음 요소를 꺼내어 출력.
			
			int num = ite2.next();
			System.out.println("set 객체에 "+num+"이 존재하는가?"+ite2.hasNext());
		} // while end
		
		
		
	}// main() method end

}// public class end
