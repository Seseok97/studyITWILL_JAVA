package thread;

import java.time.LocalTime;

public class Ex5_0511_thread {

	public static void main(String[] args) {
		/*
		 * 쓰레드의 우선순위
		 *  > 스케줄러가 어떤 쓰레드를 실행하는데 있어서 우선순위에 따라서 실행.
		 *  > 단, 절대적인 수치가 아니다 !! 확률적으로 실행비중을 높여주는 것.
		 *  > Thread 객체의 getPriority() : 우선순위 조회
		 *  > setPriority() : 우선순위 설정!
		 *  	>> 우선순위는 1~10 범위의 정수 사용.
		 *  	>> 자주 사용되는 우선순위값을 Thread 클래스의 상수로 제공한다.
		 *  		> MAX_PRIORITY : 10(높음)
		 *  		> NORM_PRIORITY : 5 (보통) > 디폴트
		 *  		> MIN_PRIORITY : 1 (낮음)
		 *  
		 * 쓰레드를 일시정지 하는 방법
		 * > Thread 클래스의 static 메서드인 sleep() 메서드를 호출!
		 * > Waiting Pool으로 이동한다.
		 * > sleep() 메서드 파라미터로 ms, ns 단위의 시간을 설정하면, 해당 시간 이후 다시 실행대기 상태로 변경된다.
		 * > 단, 타이머 동작중 interrupt() 메서드가 호출되는 경우 ! 강제로 깨운다 !!
		 * > sleep() 메서드 호출 시, try-catch 블록처리가 필수임.
		 * > 특정 쓰레드의 실행시간에 대한 간격을 설정하거나, 우선순위에 따라 실행되지 못하는 쓰레드에게 실행권한을
		 * 	 부여하기 위해, 특정 쓰레드를을 잠시 정지시킬 목적으로 사용한다.
		 * 
		 * > 지정된 시간에 정확히 복귀하지 못한다 !! > 상태 저장 - 지원교환에 시간이 필요해서 그렇다. 약간 딜레이 발생
		 * 
		 * <기본 문법>
		 * try{
		 * 		Thread.sleep(밀리초)
		 * }catch(InterruptedException e){
		 * 		// interrupt() 메서드가 호출 될 때(메서드가 깨어날때!)
		 *  	// 실행될 작업 기술 ...
		 * }
		 * 
		 * 
		 */
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=100;i++) {
					System.out.println("***");
					
					// 출력물 실행 후 현재 쓰레드를 0.1초간 재워보자.
					try {
						Thread.sleep(100); // 0.1초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}// tc end
				}// for end
				
			}// run() method end
		});// t1 end
		
		new Thread(new Runnable() {
			@Override
			public void run() {

			} // 이렇게 표현도 가능하다 ~
		}).start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=100;i++) {
					System.out.println("OOO");
					
					// 출력물 실행 후 현재 쓰레드를 0.1초간 재워보자.
					try {
						Thread.sleep(100); // 0.1초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}// tc end
				}// for end
				
			}// run() method end
		});// t2 end
		
		System.out.println("t1 쓰레드의 우선순위: "+t1.getPriority());
		System.out.println("t2 쓰레드의 우선순위: "+t2.getPriority());
		
		t1.setPriority(Thread.MIN_PRIORITY); // 우선순위 1
		t2.setPriority(Thread.MAX_PRIORITY); // 우선순위 10
		
		System.out.println("t1 쓰레드의 우선순위 변경!: "+t1.getPriority());
		System.out.println("t2 쓰레드의 우선순위 변경!: "+t2.getPriority());
		
//		t1.start();
//		t2.start();
		
		for(int i=1;i<=10;i++) {
			// 현재 시각정보 가져오기
			LocalTime now = LocalTime.now();
			System.out.println(now);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}// t-c end

		}// for end

	}// main() method end

}// public class end








































