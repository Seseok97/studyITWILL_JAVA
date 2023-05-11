package thread;

public class Ex2_0510_thread {

	public static void main(String[] args) {
		/*
		 * 멀티쓰레딩(Multi Threading)
		 * > 하나의 프로세스 내에서 두가지 이상의 작업(Thread)를 동시에 처리하는 것.
		 * > 실제로 두 가지 이상의 작업을 동시에 수행하는 것은 아니다.
		 * > CPU가 빠른속도로 여러 작업을 번갈아가며 수행하는 것!!
		 * > Round Robin 방식: 동시에 처리되도록 느껴지게 작업을 수행하는 것.
		 * > Multi Threading으로 처리되는 작업 순서는 고정이 아니라 변동이며, 항상 실행결과가 달라질수 있다!
		 * > 운영체제 스케줄링에 따라 처리되는 순서 및 횟수가 달라지기 때문임.
		 * 
		 * <멀티쓰레딩 구현방법>
		 * 1. Thread 클래스를 상속받는 서브클래스 정의하기.
		 * 		>> 1) 멀티쓰레딩 코드가 포함될 서브클래스에서 Thread 클래스 상속.
		 * 		>> 2) Thread 클래스의 run() 메서드를 오버라이딩 하여, 멀티쓰레딩으로 처리할 코드를 기술.
		 * 		>> 3) 멀티쓰레딩으로 구현된 클래스의 인스턴스 생성
		 * 		>> 4) 생성된 인스턴스의 start() 메서드를 호출하여 멀티쓰레딩 시작.
		 * 2. Runnable 인터페이스를 구현하는 서브클래스를 정의하기.
		 * 3. 멀티쓰레딩으로 처리할 위치의 코드에서 직접 Thread를 구현하는 방법( > 익명구현객체 사용.)
		 * 
		 * 
		 */
		
		// 1. Thread 클래스를 상속받는 서브클래스 정의하기.
		// 멀티쓰레딩 클래스 인스턴스 생성
		MyThread mt1 = new MyThread("⭐A작업⭐", 30);
		MyThread mt2 = new MyThread("👍B작업👍", 30);
		MyThread mt3 = new MyThread("❤️C작업❤️", 30);
		
//		Thread t = new MyThread("⭐A작업⭐", 100000); // UPCASTING을 통한 사용도 가능하다!
		
		// 멀티쓰레딩 코드 실행 (쓰레드 시작)
		// > run() 메서드 직접 호출 시 , 싱글 쓰레딩으로 처리된다.
//		mt1.run();
//		mt2.run();
//		mt3.run(); // 싱글쓰레드로 실행된다 !! 주의 !!
		
		// 반드시 start() 메서드를 사용해야 한다 !!
		mt1.start();
		mt2.start();
		mt3.start();

	}// main() method end

}// public class end


// 멀티쓰레딩을 구현한 서브클래스 정의(Thread 클래스를 상속)
class MyThread extends Thread{
	String name;
	int count;
	
	public MyThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}// const end
	
	// run() 메서드를 오버라이딩 하여, 멀티쓰래딩으로 처리할 코드를 기술.
	@Override
	public void run() {
		for(int i=1 ; i<=count ; i++) {
			System.out.println(name+" : "+i);
		}// for end
	}// run() method end

}// class end



































