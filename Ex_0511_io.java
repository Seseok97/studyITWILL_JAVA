package io;

import java.io.IOException;
import java.io.InputStream;

public class Ex_0511_io {

	public static void main(String[] args) {
		/*
		 * 자바 I/O(Input / Output)
		 * > java.io 패키지에 있는 클래스들의 모음!
		 * > 자바에서 각종 입출력을 담당.
		 * > Node(노드) : 자바에서 입출력을 수행하는 대상.
		 * 		>> 입력 노드 : 키보드, 마우스, 파일, 네트워크, DB 등
		 * 		>> 출력 노드 : 모니터, 스피커, 파일, 네트워크, DB 등
		 * 
		 * > Stream(스트림) : 입력, 또는 출력 데이터가 한 방향으로 끊임없이 전송되는 것!
		 * 		>> 출발지 노드 -> 도착지 노드
		 * 
		 * > 자바에서는 다양한 입출력장치와 무관하고 일관성있게 프로그램을 구현할 수 있도록, 
		 * 	 일종의 가상 통로인 스트림을 제공한다.
		 * 
		 * [입력 스트림과 출력 스트림]
		 * 1. 입력 스트림 : 자바에서 데이터가 입력될때 처리하는 스트림
		 * 		>> ex) 어떤 동영상을 재생하기 위해, 동영상 파일에서 자료를 읽을 때 사용.
		 * 		>> FileInputStream, FileReader, BufferedInputStream, BufferReader 등!!
		 * 
		 * 2. 출력 스트림 : 자바에서 데이터가 출력될 때 처리하는 스트림.
		 * 		>> ex) 편집화면에 사용자가 쓴 글을 파일에 저장할때 사용.
		 * 		>> FileOutputStream, FileWriter, BufferedOutputStream, BufferWriter 등!!
		 * 
		 * > 스트림은 단방향 통신만 가능하기 때문에, 입력과 출력을 동시에 수행하려면 입력을 위한 입력 스트림과
		 * 	 출력을 위한 출력 스트림, 2개의 스트림이 필요하다.
		 * 
		 * [바이트 단위 스트림과 문자 단위 스트림]
		 * 1. byte 기반 스트림
		 * 		>> 그림, 사진, 영상 등 바이너리(Binary) 데이터를 입출력
		 * 		>> InputStream, OutputStream을 최상위 클래스로 두고, 
		 * 		>> XXXInputStream, XXXOutputStream 클래스가 하위 클래스로 존재한다.
		 * 
		 * 2. char 기반 스트립
		 * 		>> 문자 데이터(텍스트)를 입출력.
		 * 		>> Reader, Writer 를 최상위 클래스로 두고,
		 * 		>> XXXReader, XXXWriter 클래스가 하위 클래스로 존재한다.
		 * 
		 * [기반 스트림과 보조 스트림]
		 * 1. 기반 스트림
		 * 		>> 읽어들일 곳(소스) 이나, 써야할 곳(대상)에서 직접 읽고 쓸수 있으며,
		 * 			입출력대상이 직접 연결되어 생성되는 스트림.
		 * 		>> FileInputStream, FileOutputStream, FileReader, FileWriter 등
		 * 
		 * 2. 보조 스트림
		 * 		>> 직접 읽고 쓰는 기능은 없고, 항상 다른 스트림을 포함하여 생성된다.
		 * 		>> 스트림의 기능을 향상시키거나 새로운 기능을 추가할 수 있다.
		 * 		>> InputStreamReader, OutputStreamReader, BufferedInputStream, BufferedOutputStream 등!
		 * 
		 * 
		 * > 표준 입출력 : 컴퓨터에서 기본적으로 사용하는 입출력.
		 * 		>> 프로그램이 시작될 때 생성되어, 따로 만들 필요가 없음.
		 * 		>> 표준 입력장치 : 키보드
		 * 		>> 표준 출력장치 : 모니터
		 * 
		 * > 표준 입출력을 담당하는 클래스 : System
		 * 		>> System.in : 표준 입력을 담당 (키보드에서 입력받기 가능)
		 * 		>> System.out : 표준 출력을 담당(모니터로 출력 가능)
		 * 		>> System.err : 모니터에 에러정보 출력 > 잘 안씀
		 */
		
		
		/*
		 * 바이트 스트림(Input Stream)
		 * > 키보드로부터 데이터를 입력받아 처리하는 방법.
		 * > 1byte 단위로 입력데이터를 처리!
		 * > read() 메서드를 사용하여, 1byte 만큼의 데이터를 가져올 수 있다.
		 * > 아무리 많은 데이터가 입력되어도 read() 메서드는 한번에 1byte만 처리된다.
		 * 		>> 더 많은 데이터나 더 큰 단위 처리가 불가능하다.
		 * 		>> 영문이나 숫자 등의 데이터를 1글자만 처리할 수 있다.
		 * 		>> 한글이나 한자 등, 2byte(char 단위) 문자들은 처리가 불가능하다.
		 * 		>> 읽어온 데이터가 int형이기 때문에, 문자로 변환하는 등의 후속작업이 필요하다.
		 * 
		 * > 가장 저수준의 입력방법이다!
		 */
//		InputStream is = null;
//		// finally 블록에서의 사용을 위해 try문 위쪽에 선언.
//		try {
//			System.out.println("Input Data");
//			// System.in 코드에 의해 키보드로부터 데이터 입력이 가능해진다.
//			// 입력스트림 객체를 InputStream 타입 변수에 저장(연결)
//			is = System.in;
//			int n = is.read(); // 입력스트립 데이터중 ibyte 만큼의 데이터를 읽어 변수에 저장.
//			System.out.println("입력데이터 : "+n); // 읽어온 1byte만큼의 데이터 출력.
////			System.out.println(is.read());
//			
//			System.out.println("입력데이터를 문자로 변환 : "+(char)n);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if(is != null) { // is cannot be resolved to a variable >> try일때 실행되는 로컬변수, finally에 와서는 없는 상태임.
//				try {
//					is.close();
//				}catch(IOException e) {
//					e.printStackTrace();
//				}// t-c end
//				
//			}// if end
//			// > close() 메서드를 통한 자원 반환
//			// if(is != null){ try {is.close();} catch(IOExecption e) {} }
//			
//		}// t-c-f end
		
		// ============================================================================================================================================
		
		/*
		 * try - with resources 구문을 사용하여, 자원반환(close())을 자동으로 수행.
		 * > 기본적으로 자원을 사용하는 객체(Connection, InputStream 등)는 사용 후, close() 메서드를 호출하여 사용중인 자원을 반환해야 한다.
		 * > 자원이 반환되지 않으면 ? 반복적인 자원요청으로 인한 자원 고갈 !! > 다른 사용자의 작업요청 수행 불가.
		 * > 예외발생 여부와 관계없이 ! finally 블록 내에서 자원반환 코드 기술.
		 * > try - with resources 구문은 try문에서 반환할 자원을 갖는 객체를 생성하고, try - catch 블록작업이 끝나면 자바가 알아서 자원을 반환한다.
		 * 
		 * <기본 문법>
		 * try(자원을 반환할 객체 생성 및 변수에 저장){
		 * 		// 제어 동작 수행
		 * }catch(예외종류 e){
		 * 		// 예외 처리 동작
		 * }
		 * 
		 */
		
		// try문의 소괄호 내부에 예외처리가 필요한 객체의 생성코드 작성
//		try(InputStream is2 = System.in){
//			System.out.println("데이터를 입력하세요.");
//			int n2 = is2.read();
//			System.out.println("입력데이터 : "+n2);
//			System.out.println("입력데이터 문자로 변환! : "+(char)n2);
//		}catch(IOException e){
//			e.printStackTrace();
//		} // t-c end
		
		//============================================================================================================================================================================
		// 반복문을 사용하여 1byte 씩 여러번 반복하여 입력 처리하기.
		System.out.println("데이터를 입력하세요. (취소 시 Ctrl+Z)"); // -1 출력
		
		try(InputStream is = System.in){
			int n = is.read();
			
			// 반복문을 사용, 더이상 읽어올 데이터가 없을때(-1)까지 입력을 처리.
			while(n != -1) {
				// 읽어들인 1byte 데이터를 화면에 출력
				System.out.println("입력데이터 : "+n);
				System.out.println("입력데이터 문자로 변환! : "+(char)n);
				// 다음 입력데이터 1byte 가져오기
				n = is.read();
			}// while end
			
		}catch(IOException e) {
			
		}// t-c end
		System.out.println("입력작업 종료.");
		
		
		

	}// main() method end

}// public class end


































