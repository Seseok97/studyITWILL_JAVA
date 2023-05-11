package thread;

public class Ex4_0510_thread {

	public static void main(String[] args) {
		/*
		 * 멀티쓰레딩 구현 코드의 변형
		 * > 실제 프로그래밍 과정에서 더 많이 사용하는 방식.
		 * > Thread 또는 Runnable 구현체를 별도로 정의하지 않고,
		 * 	 Thread 클래스의 생성자에 Runnable 인터페이스 구현 객체 생성 코드를
		 * 	 바로 작성한다.
		 * 	 >> Runnable 인터페이스의 임시 구현객체 형태를 Thread 생성자에 전달.
		 * 
		 * <기본 문법>
		 * Thread t = new Thread(임시 객체);
		 * 
		 * Thread t = new Thread(new Runnable() { // 이름이 없기때문에, Runnable 인터페이스의 이름을 빌린다.
		 * 		@Override
		 * 		public void run() {
		 *			// 멀티쓰레딩으로 구현할 코드를 기술 
		 * 		}
		 * });
		 * t.start();
		 *					// >> 보통 이렇게 쓴다고 한다.
		 *-----------------------------------------------------------------------------------------------------------
		 * 위 코드를 압축하여, Thread 객체도 임시 객체 형태로 정의할 경우
		 * Thread 인스턴스 생성 코드 마지막에 .start() 메서드 호출 연결
		 * new Thread(new Runnable(){
		 * 		@Override
		 * 		public void run() {
		 *			// 멀티쓰레딩으로 구현할 코드를 기술 
		 * 		} 		
		 * }).start(); // 꾸역꾸역 줄인것.
		 *
		 */
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// 멀티쓰레딩으로 처리할 코드를 기술.
				for(int i=1;i<=100;i++) {
					System.out.println(i+": A작업!");
				}// for end
			}// run() method end
		}); // t end
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// 멀티쓰레딩으로 처리할 코드를 기술.
				for(int i=1;i<=100;i++) {
					System.out.println(i+": B작업!");
				}// for end
			}// run() method end
		}); // t2 end
		
//		t1.start();
//		t2.start();
		
		// ===============================================================
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// 멀티쓰레딩으로 처리할 코드를 기술.
				for(int i=1;i<=100;i++) {
					System.out.println(i+": A작업!");
				}// for end
			}// run() method end
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// 멀티쓰레딩으로 처리할 코드를 기술.
				for(int i=1;i<=100;i++) {
					System.out.println(i+": B작업!");
				}// for end
			}// run() method end
		}).start();
		

	}// main() method end

} // public class end















































