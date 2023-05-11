package thread;

import javax.swing.JOptionPane;

public class Ex2_2_0510_thread {

	public static void main(String[] args) {
		/*
		 * 싱글쓰레드로 동작하는 프로그램의 경우, 하나의 실행이 완료되어야 다음 동작이 실행된다.
		 * 아래는 입력창에 값을 넣어야만 출력문과 for문이 실행된다!!
		 * 
		 * 
		 */
		
//		String input = JOptionPane.showInputDialog("아무키나 입력하세요!"); // 자바의 GUI 옵션, 구려서 잘 안씀.
//		System.out.println("입력하신 값은 "+ input +"입니다!");
//		
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000); // 1000ms > 1s 
//			} catch (InterruptedException e) { 
//				e.printStackTrace();
//			} // t-c end
//		}// for end

		// 값을 입력하지 않아도 숫자가 줄어들게 만들어 보자.
		
		// ------------------------------------------------------------------------------------------------------------------
		// 멀티쓰레드로 위의 내용을 구현하면, 입력창에 값을 넣지 않아도 for문이 동작하게 된다.
		MultiThread mt = new MultiThread();
		mt.start();
		
		String input = JOptionPane.showInputDialog("아무키나 입력하세요!"); // 자바의 GUI 옵션, 구려서 잘 안씀.
		System.out.println("입력하신 값은 "+ input +"입니다!");
		
		
		

	}// main() method end

}// public class end

class MultiThread extends Thread{

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1000ms > 1s 
			} catch (InterruptedException e) { 
				e.printStackTrace();
			} // t-c end
		}// for end
	}// run() method end
	
}// class end


































