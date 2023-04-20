package collection_framework;

import java.util.Stack;

public class Ex5_0420_colfrw {

	public static void main(String[] args) {
		/*
		 * Stack(스택)
		 *  > 하나의 상자에 데이터를 아래쪽(Bottom)부터 차례대로 쌓는 구조.
		 *  > 데이터가 한쪽(Top)에서만 삽입과 삿제가 이루어진다.
		 *  	>> First In Last Out(FILO) 또는 Last In First Out(LIFO) 구조
		 *  		: 마지막에 추가된 요소가 가장 먼저 삭제된다.
		 *  > toString() 메서드가 오버라이딩 되어있다.
		 *  > 2개의 스택을 사용하면 웹브라우저의 뒤로/앞으로 기능이나, 응용프로그램의 Redo/Undo 기능이 구현 가능하다.
		 */
		Stack<String> stack = new Stack<String>();
		// push() : 데이터 추가
		stack.push("1 - itwillbs");
		stack.push("2 - naver");
		stack.push("3 - google");
		System.out.println("모든요소 출력: "+ stack);
		// peek() : TOP에 위치한 요소 확인 (제거는 아니다 !)
		System.out.println("맨 위(TOP)요소 출력(peek(), 1회차): "+ stack.peek());
		System.out.println("맨 위(TOP)요소 출력(peek(), 2회차): "+ stack.peek());
		// pop(): Top에 위치한 요소 확인(제거한다 !!)
		System.out.println("맨 위(TOP)요소 꺼내기(pop(), 1회차): "+ stack.pop());
		System.out.println("맨 위(TOP)요소 꺼내기(pop(), 2회차): "+ stack.pop());
		System.out.println("맨 위(TOP)요소 꺼내기(pop(), 3회차): "+ stack.pop());
		System.out.println("맨 위(TOP)요소 꺼내기(pop(), 4회차): "+ stack.pop()); // 예외발생!

		
		
		
		
	}// main() method end

}// public class end
