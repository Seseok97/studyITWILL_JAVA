package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class Ex6_0420_colfrw {

	public static void main(String[] args) {
		/*
		 * Queue (큐)
		 * > 한 쪽에서 삽입, 반대쪽에서 삭제가 일어나는 구조.
		 * > First In, First Out(FIFO), Last In, Last Out(LILO) 구조.
		 * 		>> 먼저 추가된 요소가 가장 먼저 삭제된다.
		 * > Queue 인터페이스 !! > 직접 다루지는 않고, 상속받아 구현한 LinkedList 클래스 사용
		 * 		>> LinkedList 클래스는 List와 Queue 인터페이스를 모두 구현한 구현체이다.
		 * > 은행의 번호표, 온라인게임의 대기열에서 사용된다.
		 */
		
		Queue<String> q = new LinkedList<String>();
		
		//offer() : 데이터 추가.
		q.offer("1 - JAVA");
		q.offer("2 - JSP");
		q.offer("3 - DB");
		System.out.println("모든 Queue요소 출력 : "+ q);
		
		// peek() : 출구의 요소 확인 (제거하지 않음.)
		System.out.println("가장먼저 추가된 요소 확인 1회차 (peek()): "+q.peek());
		System.out.println("가장먼저 추가된 요소 확인 2회차 (peek()): "+q.peek());
		
		// poll() : 출구의 요소 꺼내기 (제거된다.)
		System.out.println("가장먼저 추가된 요소 꺼내기 1회차 (poll()): "+q.poll());
		System.out.println("가장먼저 추가된 요소 꺼내기 2회차 (poll()): "+q.poll());
		System.out.println("가장먼저 추가된 요소 꺼내기 3회차 (poll()): "+q.poll());
		System.out.println("가장먼저 추가된 요소 꺼내기 4회차 (poll()): "+q.poll()); // > null을 출력한다!
	}// main() method end

}// public class end

