package collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex4_0419_colfrw {

	public static void main(String[] args) {
		/*
		 * Map 계열
		 * > 키(Key)와 값(Value)을 한쌍으로 갖는 자료구조.
		 * 	>> 키와 값을 한쌍으로 갖는 Map.Entry타입 객체로 관리된다.
		 * 
		 * > 키는 중복 불가, 값은 중복 가능!
		 * 	>> 키는 Set 타입으로 관리된다.
		 * 
		 * > 대표적인 구현체 클래스 : HashMap, Hashtable, Properties, TreeMap
		 * > toString() 메서드가 오버라이딩 되어있다.
		 * > 전화번호부, 가격표 등 한 쌍의 데이터를 매핑하는 구조에 활용한다.
		 */
		Map map = new HashMap();
		// put(Object key, Object value) : 키(Key)에 해당하는 데이터(Value) 추가
		map.put(1, "자바");
		map.put(2, "JSP");
		map.put(3, "클라우드");
		System.out.println("map 객체의 모든 엔트리 : "+map);
		
		// 키는 중복이 불가능하기때문에, 존재하는 키를 지정할 경우 값을 덮어쓰게 된다.
		// > 제거되는 데이터가 리턴된다.
//		map.put(3, "스프링");
		System.out.println("map 객체의 모든 엔트리(3 교체 전) : "+map);
		System.out.println("3을 키로 갖는 값 추가 : "+map.put(3,"스프링")); // "클라우드"를 출력한다 !
		System.out.println("map 객체의 모든 엔트리(3 교체 후) : "+map);
		
		// 키는 중복이 불가능하지만, 값은 중복이 가능하다.
		System.out.println(
				"4를 키로 갖는 값 추가 : "+map.put(4,"스프링")); // null 출력!!! > 제거되는 데이터가 없기때문!
		System.out.println("map 객체의 모든 엔트리(4 추가) : "+map);
		
		// Object get(Object key) : key에 해당하는 값 리턴 (없을 경우 null)
		System.out.println("정수   2에 해당하는 키의 데이터: "+map.get(2));
		System.out.println("문자열 2에 해당하는 키의 데이터: "+map.get("2"));
		
		// Set keySet() : Map 객체 내의 모든 키(Key) 리턴 > Set타입 객체로 리턴
		Set keySet = map.keySet();
		System.out.println("모든 키: "+keySet);
		
		// Collection values(): Map 객체 내의 모든 값(Value)을 리턴
//		List valueList = (List)map.values(); // Type mismatch: cannot convert from Collection to List
											 // Collection 아래에 List가 있기 때문에 발생! (DOWNCASTING, 예외 발생.)
		// 예외로 인하여 주석처리.
		
		List valueList = new ArrayList(map.values()); // 객체생성 파라미터로 전달.
													  // ArrayList는 List를 상속받고있음. (UPCASTING)
													  // ArrayList는 Collection의 구현체임.(상속받고 있다는 뜻)
													  // >> List에 map.values()를 저장할 수 있다!
		
		// Map객체 크기만큼 반복문을 사용하면서 차례대로 요소 접근 불가!
		// > 대신, keySet(), values() 결과를 사용하여 반복이 가능하다.
//		Iterator ite = map.iterator();  // Map 계열에는 Iterator(반복자) 사용이 불가능하다.
		for(Object o:keySet) {
			System.out.println(map.get(o));
		}// for end
		
		// entrySet() : 키=값을 한 쌍으로 갖는 엔트리 객체를 Set 타입으로 리턴!
		Set entrySet = map.entrySet();
		System.out.println(entrySet);
		
		System.out.println("=======================================================================");
		
		// 제네릭 타입으로 <키의 타입, 값의 타입> 형태 지정
		Map<String, String> map2 = new HashMap<String, String>();
		
		// 전화번호부의 경우 > 전화번호: 키(Key), 이름: 값(Value)
		map2.put("010-1111-1111","A");
		map2.put("010-2222-2222","A"); // 이름(값)은 중복이 가능하다.
		map2.put("010-3333-3333","B");
		map2.put("010-4444-4444","C");
		map2.put("010-4444-4444","D");
		// 키로 사용되는 전화번호가 동일한 경우, 이름을 덮어쓰게 된다. > 제거되는 데이터의 값을 리턴한다.
		System.out.println(map2);
		
		// containsValue() : 특정 값을 탐색
		System.out.println("A라는 이름이 존재합니까? : "+map2.containsValue("A"));
		System.out.println("C라는 이름이 존재합니까? : "+map2.containsValue("C")); // "C"는 키 중복으로 인하여 제거되었다.
		
		// containsKey() : 특정 키를 탐색
		System.out.println("010-1111-1111 전화번호가 존재합니까? : "+map2.containsKey("010-1111-1111"));
		System.out.println("010-4444-4444 전화번호가 존재합니까? : "+map2.containsKey("010-4444-4444"));
		
		
	}// main() method end

}// public class end






























