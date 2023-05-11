package thread;

public class Ex3_0510_thread {

	public static void main(String[] args) {
		// Runnable 인터페이스를 구현한 클래스의 인스턴스 생성.
		YourThread yt1 = new YourThread("AA", 100);
		YourThread yt2 = new YourThread("BB", 100);
		YourThread yt3 = new YourThread("CC", 100);
		
//		Runnable r = new YourThread("AA", 100); // UPCASTING을 사용한 표현 가능!
		
		// Runnable 구현체 내부에는 start() 메서드가 없음 !!!
		// > Runnable 인터페이스 내부에 없기때문!!
//		yt1.start(); // > 이렇게 못쓴다는 이야기임.
		
		// Thread 클래스의 인스턴스 생성 시, 생성자 파라미터에 Runnable 구현체를 전달.
		// > Thread객체의 start() 메서드를 통한 간접적인 멀티쓰레딩 수행.
//		Thread t1 = new Thread(yt1);
//		Thread t2 = new Thread(yt2);
//		Thread t3 = new Thread(yt3);
//		
//		t1.start();
//		t2.start();
//		t3.start();
		// ==================================================================================================================
		
		// YourThread 타입의 yt 변수들은 Thread에 생성자를 전달하는 작업 외에 필요가 없다. > 메모리 낭비 !!(stack)
		// > 1회성 변수를 선언하기 보다, 생성자에 인스턴스 직접 전달 가능.
		Thread t1 = new Thread(new YourThread("AA", 100));
		Thread t2 = new Thread(new YourThread("BB", 100));
		Thread t3 = new Thread(new YourThread("CC", 100));
		
		t1.start();
		t2.start();
		t3.start(); // 해당 방식도 Heap 메모리를 차지하게 된다.
		

	}// main() method end

}// public class end

class A{}
// 이미 A 클래스를 상속받은 YourThread 클래스에 멀티쓰레딩을 구현하는 경우.
// > Thread 클래스를 상속받지 못한다. > 다중상속이 불가능하기 때문임.
// > Runnable 인터페이스를 구현(implements) 해야한다.
class YourThread extends A implements Runnable{
	String name;
	int count;
	
	// 파라미터 생성자
	public YourThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	@Override
	public void run() {
		for(int i=1;i<=count;i++) {
			System.out.println(name+" : "+i);
		}// for end	
	}// run() method end
	
}// class end
