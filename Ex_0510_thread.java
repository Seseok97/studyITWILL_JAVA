package thread;

public class Ex_0510_thread {

	public static void main(String[] args) {
		/*
		 * 프로그램(Program)
		 * > 디스크에 설치되어 있는, 실행되기 전 상태의 소프트웨어.
		 * 
		 * 프로세스(Process)
		 * > 설치된 프로그램을 실행하여 메모리에 로딩된 상태(=실행중인 프로그램)
		 * 
		 * 멀티 태스킹(Multi Tasking)
		 * > 프로세스가 여러개일때, 해당 프로세스들이 동시에 수행되는 것!!
		 * > CPU가 빠른 속도로 프로세스를 번갈아가며 실행 하는것임.
		 * > 동영상을 재생하며 웹페이지 표시, 음악 재생 등을 함께 수행하는 것.
		 * 
		 * 쓰레드(Thread)
		 * > 프로세스 내에서 작업의 최소 단위
		 * > 하나의 프로세스 내에는 최소 한 개의 쓰레드가 동작한다. (한 개의 쓰레드만 존재하는 경우, Single Thread.)
		 * > 동시에 수행가능한 작업은 단 하나뿐이다.
		 * > 하나의 프로세스 내에서 동시에 수행 가능한 작업을 늘리기 위해서는, 멀티 쓰레드(Multi Thread)로 구현해야 한다.
		 * > 메신저 내에서 파일 전송과 동시에 메세지 송수신하는 것.
		 * 
		 */
		
		NoThread nt1 = new NoThread("⭐A작업⭐", 100000);
		NoThread nt2 = new NoThread("👍B작업👍", 50000);
		NoThread nt3 = new NoThread("❤️C작업❤️", 100000);

		nt1.run(); // A작업이 10만회 실행되면
		nt2.run(); // A작업이 종료 된 이후, B작업이 5만회 실행되고,
		nt3.run(); // B작업이 종료되면 C 작업이 실행된다.
		
		// 싱글쓰레드 !!
		
	}// main() method end

}// public class end

class NoThread{
	String name;
	int count;
	
	public NoThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}// const end
	
	public void run() {
		for(int i=1 ; i<=count ; i++) {
			System.out.println(name+" : "+i);
		}// for end
	}// run() method end
	
	
}// NoThread class end



































