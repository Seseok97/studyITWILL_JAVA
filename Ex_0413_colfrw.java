package collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex_0413_colfrw {

	public static void main(String[] args) {
		/*
		 * Collection Framework (컬렉션 프레임워크)
		 * 	> 컴퓨터 시스템이서 데이터를 효율적으로 저장, 및 관리하는 방법.
		 * 		>> "자료구조" (Data Structure) 라고 한다.
		 * 		>> 자료구조를 자바에서 구현하여 제공하는 클래스들의 모음 (API)
		 * 
		 * > Set, List, Map 인터페이스 계열로 구분됨.
		 * 		>> Set, List는 공통적으로 Collection 인터페이스를 상속받기 때문에,
		 * 		   제공되는 메서드가 거의 동일하다. 
		 *  
		 * > 각 인터페이스들의 구현체 클래스를 사용하여 데이터를 관리함.
		 * > java.util 패키지에 컬렉션 프레임워크 API들이 제공된다.
		 * > toString() 메서드가 오버라이딩 되어 있다.
		 * > 모든 데이터는 객체 형태로 관리되며,
		 * 	 기본 데이터타입일 경우 Wrapper클래스 타입으로 오토박싱이 일어난다!
		 * 
		 * 1. Set 계열
		 * 	> 저장순서 유지 X (인덱스넘버 X), 데이터중복 허용 X
		 * 		>> 주머니에 공을 무작위로 집어넣는것과 유사한 구조로, 데이터가 저장되는 순서 유지 및 중복이 불가능한 구조로,
		 * 		   매우 효율적인 중복제거 수단으로 사용할 수 있다.
		 *  > 인덱스 사용 하지 않음.
		 *  > 구현체 클래스: HashSet, TreeSet 등
		 */
		
		// HashSet 객체 생성
		HashSet set_ex = new HashSet(); // 기본은 제네릭 들어가는데, 일단 오브젝트로 생성함.
		
		// Set 인터페이스 구현체이기때문에, 주로 업캐스팅을 활용하여 사용하게 된다.
		Set set = new HashSet(); // Set = HashSet > 업캐스팅!!
		
		// Set 계열 메서드 사용.
		// 1. boolean isEmpty() : 컬렉션객체가 비어있는지 여부 리턴
		System.out.println("set 객체가 비어있는가?: "+set.isEmpty());
		
		// 2. int size() : 컬렉션 객체에 저장돤 요소(데이터, 객체) 개수 리턴
		System.out.println("set 객체에 저장된 요소의 개수는?: "+set.size());
		
		
		// 3. boolean add(Object o): 컬렉션 객체에 요소(o, 데이터)를 추가.
		// 파라미터가 Object타입 !! >> 모든 데이터타입 추가 가능
		// 리턴타입이 boolean타입 !! >> true-false를 저장하여 정상작동 여부를 판별할 수 있다. 중복시 추가하지 않기때문에 false를 리턴한다.
		
		set.add("TWO");// String >업캐스팅> Object
		set.add(1); // int >오토박싱> Integer >업캐스팅> Object 	
		set.add(3.14); // double >오토박싱> Double >업캐스팅> Object 
		
		System.out.println("[값 추가 후]");
		System.out.println("set 객체가 비어있는가?: "+set.isEmpty());
		System.out.println("set 객체에 저장된 요소의 개수는?: "+set.size());
		
		// toString() 메서드가 오버라이딩 되어 있기때문에, 출력문에 사용 가능! (생략 가능)
		System.out.println("set 객체의 모든 요소 출력: "+set); // "[1, 3.14, TWO]" 출력됨. >> 순서 정보 저장 X!!!! 인덱스 없음!!
		
		System.out.println("실수 3.14를 추가할수 있는가? : "+set.add(3.14));
		// >> 기존에 3.14가 저장되어있기 때문에, 중복이 불가하여 저장되지 않으며, 
		//	  저장 실패의 의미로 false를 리턴한다.
		System.out.println("set 객체의 모든 요소 출력: "+set); // "[1, 3.14, TWO]" 출력됨. >> 중복 불가능!
		
		// 0419 //
		System.out.println("\n 아래로 0419 수업 \n ");
		
		System.out.println("문자 '4 추가 가능한가?: " +set.add('4'));
		System.out.println("set 객체의 모든 요소 출력: "+set); 
		// 계속 노란줄이 뜬다 !! > 제네릭 지정을 하지 않았기때문에 발생한다. 
		// >> 자바에서는 제네릭을 이용하여 컬렉션에 하나의 데이터타입만 저장하는것을 권장하고 있음!
		set.add(5);
		set.add("육");
		System.out.println("set 객체에 저장된 요소의 개수는?: "+set.size());
		System.out.println("set 객체의 모든 요소 출력: "+set); // [1, 육, 4, 3.14, 5, TWO] > 순서지정 X
		
		System.out.println("-----------------------------------------------------------------------");
		
		// boolean contains(Object o) : 컬렉션 객체 내의 요소 o 포함여부 리턴
		System.out.println("실수 3.14가 존재하는가: "+ set.contains(3.14));
		System.out.println("정수 3이 존재하는가: "+ set.contains(3));
		
		// boolean remove(Object o) : 컬렉션 객체 내의 요소 o 삭제 (결과값을 t/f로 리턴)
		System.out.println("실수 3.14 삭제!: "+set.remove(3.14));
		System.out.println("실수 3.14를 다시 삭제!: "+set.remove(3.14)); // > 이미 삭제되었기때문에 false 리턴.
		
		// void clear() : 컬렉션 요소 초기화
//		set.clear(); // 수업진행을 위하여 주석처리
		System.out.println("set객체의 모든요소 출력!: "+ set);
		
		// Object[] toArray() : 컬렉션을 배열로 변환
		Object[] oArr = set.toArray();
		System.out.println(Arrays.toString(oArr));
		
		System.out.println("==============================================================================");
		
		// Set 또는 List계열 생성 시, 기존 객체 데이터 이전(복사) 가능!
		Set set2 = new HashSet(set);
		
		// >> set 객체를 set2 객체에 전달! >> 요소 전체 복사
		System.out.println("set2 객체의 모든요소 출력!: "+ set2);
		
		set2.remove(5);
		// 복사된 객체의 요소를 삭제하더라도, 다른 객체의 요소에 영향이 없다.
		System.out.println("set객체의 모든요소 출력!: "+ set);
		System.out.println("set2 객체의 모든요소 출력!: "+ set2);	
		
		Set set3 = new HashSet();
		set3.add(10);
		set3.add(5);
		// 객체 생성 후 addAll() 메서드를 통하여 데이터를 한꺼번에 추가할 수 있다.
		set3.addAll(set); // set에 저장된 모든요소를 set3으로 복사.
		System.out.println("set3 객체의 모든요소 출력!: "+ set3);
		// [1, 육, 4, 5, 10, TWO] >> 5가 중복되어 출력되지는 않는다.
		
		System.out.println("==============================================================================");
		
		Set set4 = new HashSet();
		
		// String타입 데이터 저장
//		set4.add("300");
//		set4.add("20");
//		set4.add("200");
//		set4.add("1");
//		set4.add("100");
//		set4.add("10");
//		System.out.println(set4);
		// [1, 100, 200, 300, 20, 10]
		
		// int타입 데이터 저장
		set4.add(300);
		set4.add(20);
		set4.add(200);
		set4.add(1);
		set4.add(100);
		set4.add(10);
		System.out.println(set4);
		// [1, 20, 100, 200, 10, 300] // >> 구별이 가지 않는다 ..!
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		// TreeSet 객체 > 같은 타입만 저장된 Set객체의 정렬이 가능. > 타입이 다르면 예외발생
		// 수치데이터 > 숫자 크기순으로 오름차순 정렬
		// 문자데이터 > 문자 코드값 기준 오름차순 정렬
		// 문자열데이터 > 첫번째문자부터 차례대로 비교
		TreeSet treeSet = new TreeSet(set4);
		System.out.println("treeSet객체의 모든 요소 출력!: "+ treeSet);
		
		System.out.println("--------예외 발생시키기 ----------------------");
		
		Set set5 = new HashSet();
		set5.add("300");
		set5.add(20);
		set5.add(200);
		set5.add(1);
		set5.add(100);
		set5.add(10);
		System.out.println(set5);
		TreeSet treeSet2 = new TreeSet(set5); // ClassCastException 발생!!
		System.out.println("treeSet객체의 모든 요소 출력!: "+ treeSet);
		
		
		
	}// main() method end

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// public class end

































