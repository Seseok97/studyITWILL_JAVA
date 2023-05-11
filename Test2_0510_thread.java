package thread;

public class Test2_0510_thread {

	public static void main(String[] args) {

		 // 메세지 전송과 파일 전송을 동시에 수행할 경우!
		 // 1. 싱글쓰레드로 구현한 경우.
		SendMessage sm = new SendMessage("Hello", 100);
		FileTransfer ft = new FileTransfer("a.java", 1000);
		
		// 파일전송을 먼저 시작한 후, 메세지 전송을 가정
//		ft.run(); // 파일 전송이 끝나야
//		sm.run(); // 메세지 전송이 시작된다.
		
		 // --------------------------------------------------------------------------------
		SendMessageMultiThread smmt = new SendMessageMultiThread("Hello!", 100);
		FileTransferMultiThread ftmt = new FileTransferMultiThread("b.java", 100);
		
		ReceiveMessageMultiThread rmmt = new ReceiveMessageMultiThread("반갑습니다.", 100);
		
		ftmt.start();
		smmt.start();
		
//		rmmt.start(); // The method start() is undefined for the type ReceiveMessageMultiThread
					  // Runnable 구현체는 start() 메서드 호출이 불가능하다.
					  // > start() 메서드는 Thread 클래스에 존재하는 메서드이기 때문이다.
					  // Thread 인스턴스에 Runnable 구현체를 전달하고, 대신 start()를 호출해야 한다.
		Thread t = new Thread(rmmt);
		t.start();


	}// main() method end

}// public class end


/*
 * --------------------------------------------------------------------------------
 *  메세지 전송 클래스
 *  1. 싱글 쓰레드로 구현
 *  > class명 : SendMessage
 *  > 멤버변수 : 메세지(msg, String), 카운트(count, int)
 *  > 파라미터 생성자(String, int)
 *  > run() 메서드 : 리턴 X, 파라미터 X, count만큼 msg 출력.
 */

class SendMessage{
	String msg; // 메세지 저장 변수
	int count; // 카운트 저장 변수
	
	// 파라미터 생성자
	public SendMessage(String msg, int count) {
		super();
		this.msg = msg;
		this.count = count;
	}// const end
	
	public void run() {
		// count 횟수만큼 msg 문자열을 화면에 출력하는 반복문 작성.
		for(int i=1;i<=count;i++) {
			System.out.println("메세지 전송 - "+i+" : "+msg);
		}// for end
	}// run() method end
	
}//SendMessage class end

/*
 *  메세지 전송 클래스
 *  2. 멀티 쓰레드로 구현
 *  > class명 : SendMessage
 *  > 멤버변수 : 메세지(msg, String), 카운트(count, int)
 *  > 파라미터 생성자(String, int)
 *  > run() 메서드 오버라이딩
 */
class SendMessageMultiThread extends Thread{
	String msg;
	int count;
	
	public SendMessageMultiThread(String msg, int count) {
		super();
		this.msg = msg;
		this.count = count;
	}// const end
	
	@Override
	public void run() {
		for(int i=1;i<=count;i++) {
			System.out.println("메세지 전송 - "+i+" : "+msg);
			
			try {
				Thread.sleep(500); // 0.5s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}// tc end
		}// for end
	}// run() method end

} // class end



/*
 *  파일 전송 클래스
 *  1. 싱글쓰레드 구현
 *  > class명: FileTransfer
 *  > 멤버변수 : 파일명(fileName, String), 카운트(count, int)
 *  > 파라미터 생성자(String, int)
 *  > run() 메서드 : 리턴X, 파라미터 X, count만큼 fileName 문자열 출력
 */

class FileTransfer{
	String fileName;
	int count;
	
	// 파라미터 생성자
	public FileTransfer(String fileName, int count) {
		super();
		this.fileName = fileName;
		this.count = count;
	} // const end
	
	public void run() {
		// count 횟수만큼 fileName 문자열을 화면에 출력하는 반복문 작성.
		for(int i=1;i<=count;i++) {
			System.out.println("파일 전송 - "+i+" : "+fileName);
		}// for end
	}// run() method end

}// FileTransfer class end

/*
 *  파일 전송 클래스
 *  2. 멀티 쓰레드로 구현
 *  > class명 : FileTransfer
 *  > 멤버변수 : 파일명(fileName, String), 카운트(count, int)
 *  > 파라미터 생성자(String, int)
 *  > run() 메서드 오버라이딩
 */
class FileTransferMultiThread extends Thread{
	String fileName;
	int count;
	
	public FileTransferMultiThread(String fileName, int count) {
		super();
		this.fileName = fileName;
		this.count = count;
	}// const end
	
	@Override
	public void run() {
		for(int i=1;i<=count;i++) {
			System.out.println("파일 전송 - "+i+" : "+fileName);
			
			try {
				Thread.sleep(500); // 0.5s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}// tc end
		}// for end
	}// run() method end

} // class end

//=============================================================================================================
/*
 * 메세지 수신 클래스
 * > 멀티쓰레드로 구현!
 * > class 명: ReceiveMessageMultiThread
 * 	>> 단, Thread 클래스를 상속받지 않고, Runnable 인터페이스로 구현.
 * 	>> Object 클래스를 상속받는다.
 * > 멤버변수 : 메세지(msg, String), 카운트(count, int)
 * > 파라미터 생성자(String, int)
 * > run() 메서드 오버라이딩
 * 
 */

class ReceiveMessageMultiThread extends Object implements Runnable{
	String msg;
	int count;
	
	// 파라미터 생성자
	public ReceiveMessageMultiThread(String msg, int count) {
		super();
		this.msg = msg;
		this.count = count;
	}// const end
	
	@Override
	public void run() {
		for(int i=1;i<=count;i++) {
			System.out.println("메세지 수신 - "+i+" : "+msg);
			
			try {
				Thread.sleep(500); // 0.5s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}// tc end
		}// for end
	}// run() method end
	
	
	
}// class end





































