package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex3_0419_colfrw {

	public static void main(String[] args) {
		/*
		 * 2. List 계열
		 * > 저장데이터의 순서 유지 O, 중복 허용 O
		 * > 저장되는 데이터는 저장 시점에서 자동으로 인덱스가 부여된다.
		 * 	>> 배열과 동일하게 인덱스 번호가 0부터 시작한다.
		 * > 기본적인 메서드 대부분이 Set 계열과 동일하다.(부모가 동일하기 때문.)
		 * 	>> 단, 인덱스를 활용하는 메서드가 많다 !!
		 * > 대표적인 구현체 클래스 > ArrayList, Vertor, LinkedList 등 // 보통 ArrayList 많이 사용
		 * > Collections 클래스의 메서드를 통해 List객체의 부가적인 처리 가능! (sort, shuffle 등)
		 */
		
		List<Integer> list = new ArrayList<Integer>(); // UPCASTING!
		// >> ArrayList 객체에 저장되는 데이터를 정수형으로 고정!
		
		list.add(1);
		list.add(2);
		list.add(3);
//		list.add(3.14); // 제네릭타입 고정으로 인하여 정수 외의 타입은 추가 불가능!
		
		System.out.println("list 객체가 비어있는가?: "+list.isEmpty());
		System.out.println("list 객체에 저장된 요소의 개수는?: "+list.size());
		System.out.println("list 객체에 저장된 모든 요소는?: "+list);
		
		System.out.println("list 객체에 중복데이터 3, 추가 가능한가?: "+list.add(3));
		System.out.println("list 객체에 저장된 모든 요소는?(3 추가됨): "+list);
		
		// Object get(int index) : index에 해당하는 요소 리턴!
		// > 단, 제네릭 타입을 Integer로 지정했으므로, 리턴타입도 Integer이다!
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"번째 인덱스의 요소 : "+list.get(i));
		}// for end
		// 배열과 마찬가지로, 존재하지 않는 인덱스를 지정할 경우 OutOfBounds 예외 발생!
		
		// int indexOf(Object o) : 특정 요소가 위치한 인덱스를 리턴, 앞에서부터 탐색한다!
		System.out.println("정수 3의 인덱스 : "+ list.indexOf(3));
		System.out.println("정수 3의 lastIndexOf() : "+ list.lastIndexOf(3));
		
		// Object remove(Object o) : index에 해당하는 요소 삭제 후 요소 리턴!
		// >> 제네릭 타입에 따라 리턴타입 변함!
		// 주의 !! 요소가 정수타입일 경우 ..!! > 정수데이터를 지정하면 인덱스로 취급된다 !!!!
		//		> Object 타입으로 변환하여 동작을 수행시켜야함!!
//		System.out.println("정수 2 삭제!(오동작) : "+list.remove(3)); // 정수 2 삭제! : 3 > ?? 인덱스 2번의 데이터 정수 3이 삭제된다!!
		// 오동작으로 인한 주석처리
//		System.out.println("정수 2 삭제하고자 하는 경우: "+list.remove((Object)2));
//		System.out.println("list 객체에 저장된 모든 요소는?(2 삭제됨): "+list);
		// 복잡하다 ! 주석처리
		
		// 해당 문제로 인하여, List객체의 요소를 삭제하는 경우 indexOf()로 탐색된 인덱스요소를 삭제하는것이 실수를 줄일수 있다!
		list.remove(list.indexOf(2));
		System.out.println("list 객체에 저장된 모든 요소는?(2 삭제됨): "+list);
		
		// add(int index, Object o) : 특정 인덱스에 해당 요소(o)를 추가!
		// > 기존 데이터는 뒤로 밀려난다.
		list.add(1,5);
		System.out.println("list 객체에 저장된 모든 요소는?(1번 인덱스에 5 add됨): "+list);
		
		// set(int index, Object o) : 특정 인덱스에 해당 요소(o)를 덮어 쓴다!
		list.set(1, 10);
		System.out.println("list 객체에 저장된 모든 요소는?(1번 인덱스에 10 set됨): "+list);
		
		// List subList(int beginIndex, int endIndex)
		// >> beginIndex 부터 endIndex-1 까지 부분 리스트 추출
		List subList = list.subList(0, 3);
		System.out.println("추출된 부분 리스트(0,3): "+subList);
		
		System.out.println("==================================================================================");
		
		// Collections 클래스 활용 (static 메서드 제공)
		List list2 = new ArrayList();
		list2.addAll(list); // list의 모든 요소를 list2에 추가!
		list2.add(20);
		list2.add(80);
		list2.add(1000);
		list2.add(72);
		System.out.println("정렬 전: "+list2); // [1, 10, 3, 3, 20, 80, 1000, 72]
		
		// Collections.sort(List) : List객체 정렬 (같은타입 요소만 가능)
		Collections.sort(list2);
		System.out.println("정렬 후: "+list2); // [1, 3, 3, 10, 20, 72, 80, 1000]
		
		// Collections.shuffle(List) : List객체  무작위 섞기 (다른타입 가능)
		list2.add("헤이");
		Collections.shuffle(list2);
		System.out.println("셔플 후: "+list2); // [3, 1000, 80, 20, 헤이, 3, 1, 10, 72]
		// 셔플은 매번 다른결과 출력됨!!
		
		System.out.println("==================================================================================");
		
		// Arrays 클래스의 static 메서드인 asList() 메서드를 활용하면, 배열을 List객체로 쉽게 변환할 수 있다.
		String[] namesArr= {"A","B","C"};
		List namesList = Arrays.asList(namesArr);
		System.out.println(namesList);
		
		// asList() 메서드의 파라미터로 가변인자가 사용되기 때문에, 데이터를 직접 여러개 전달하여 List로 변환 가능하다.
		List namesList2 = Arrays.asList("AA","BB","CC");
		System.out.println(namesList2);
		
		
		
		
	}// main() method end

	
}// public class end
