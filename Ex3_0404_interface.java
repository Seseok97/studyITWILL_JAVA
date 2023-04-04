package interface_;

public class Ex3_0404_interface {

	public static void main(String[] args) {
		/*
		 * 인터페이스의 필요성
		 * 1. 구현의 강제를 통하여, 코드의 통일성 향상(=표준화)
		 * 2. 인터페이스를 통한 간접적인 클래스 사용으로, 모듈교체가 용이해진다.
		 * 		> 특정 클래스를 직접 다루는 대신에, 부모 인터페이스 타입으로 클래스를 다루게 되면,
		 * 		  실제 인스턴스가 바뀌더라도 기존 코드를 수정할 필요가 없어진다.
		 * 3. 서로 상속관계가 없는 클래스간의 인터페이스를 통한 상속관계 부여.
		 * 		> 다형성 확장. (하나의 클래스를 통하여 여러 인터페이스 제어 가능.)
		 * 4. 모듈간 독립적 프로그래밍으로 인한 개발 기간 단축.
		 */
		
		/*
		 * 2. 인터페이스를 통한 간접적인 클래스 사용으로 모듈교체가 용이
		 */
		PrinterClient pc = new PrinterClient();
		// PrintClient 인스턴스와 setPrinter() 메서드를 호출하여,
		// 각 프린터기 인스턴스 파라미터로 전달하면 업캐스팅이 일어난다!
		pc.setPrinter(new LaserPrinter()); // LaserPrinter > Printer , UPCASTING!
										   // setPrinter() 메서드 보면 이해 갈것 !!
		pc.print("Hello.java(lp)");
		// >> PrinterClient 인스턴스의 print() 메서드를 호출하면
		//    인스턴스 내의 Printer타입 변수에 저장된 인스턴스의 print() 메서드가 호출된다.
		// 		> 실제 저장된 LaserPrinter 인스턴스의 print() 메서드가 호출된다 !!
		
		// 현재 LaserPrinter를 InkjetPrinter로 교체 시, setPrinter() 메서드에서 InkjetPrinter 인스턴스만 전달하면,
		// 자동으로 출력대상이 변경된다.
		pc.setPrinter(new InkjetPrinter()); // InkhetPrinter > Pritner, UPCASTING
		pc.print("Hello.java(ip)");
		
		pc.setPrinter(new DotPrinter()); // DotPrinter > Pritner, UPCASTING
		pc.print("Hello.java(dp)");
		
		System.out.println("--------------------------------------------");
		
		LaserPrinter lp = new LaserPrinter();
		lp.print("lp.java");
		
		InkjetPrinter ip = new InkjetPrinter();
		ip.print("ip.java");
		
		DotPrinter dp = new DotPrinter();
		dp.print("dp.java");
		
		Printer p = new LaserPrinter(); // UPCASTING
		p.print("p.java(lp)");
		p = new InkjetPrinter();
		p.print("p.java(ip)");
		p = new DotPrinter();
		p.print("p.java(dp)");

	} // main() method end

} // public class end

// 각 프린터를 직접 다루지 않고, 상위타입인 Printer 인터페이스를 다루는 "PrinterClient" 클래스 정의
class PrinterClient{
	// 각각의 프린터 클래스를 다루기 위한 슈퍼클래스 타입에 해당하는
	// Printer 인터페이스 타입 변수 선언
	private Printer printer;

	// Setter 메서드를 통한 Printer타입의 변수 초기화.
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	// Setter end
	
	// 외부로부터 출력할 파일을 전달받아, 실제 프린터에 해당하는 각 인스턴스의
	// print() 메서드를 호출한 뒤, 파일을 전달하여 출력작업 수행
	public void print(String fileName) {
		// Printer타입 변수에 저장돤 각 프린터의 인스턴스를 통해,
		// print() 메서드를 호출하면 !! 해당 프린터의 출력 기능이 사용 가능하게 된다!!
		printer.print(fileName);
	}
	
}//PrinterClient class end

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * 문서 등을 프린터로 출력하기 위한 각 프린터 클래스 정의
 * > 각 프린터의 출력 기능을 갖는 Printer 인터페이스를 정의하고, 각 프린터 클래스에서 상속받아 구현
 */

interface Printer{	// 프린터
	// 프린터의 공통 기능인 출력(print())기능을 추상메서드로 정의
	public abstract void print(String fileName);
} // Printer interface end


class LaserPrinter implements Printer{ // 레이저프린터
	// 파일(String타입 fileName)을 전달받아 출력을 수행하는 print() 메서드 정의
	// >> Printer 인터페이스로부터 상속받아 구현
	@Override
	public void print(String fileName) {
		System.out.println("LaserPrinter로 "+fileName+" 출력하기!");
	} 
	// override end
}// LaserPrinter class end

class InkjetPrinter implements Printer{ // 잉크젯프린터
	@Override
	public void print(String fileName) {
		System.out.println("InkjetPrinter로 "+fileName+" 출력하기!");
	} 
	// override end
}// InkjetPrinter class end

class DotPrinter implements Printer{	// 도트프린터
	@Override
	public void print(String fileName) {
		System.out.println("DotPrinter로 "+fileName+" 출력하기!");
	} 
	// override end
}// DotPrinter class end
