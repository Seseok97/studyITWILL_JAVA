package overloading_;

public class Ex3_0307_overloading {

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩의 문제점 !
		 * > 동일한 작업을 수행하는 코드들의 중복이 발생한다.
		 * >> 만약, 특정 메서드의 코드를 수정해야 하는 경우, 동일 코드를 여러번 수정해야 하는 불편함이 발생!
		 * >> 코드의 유지보수성이 나쁘다.
		 * 
		 * [해결책]
		 * 오버로딩된 메서드에서 또 다른 오버로딩 된 메서드를 호촐, 반복되는 작업을 대신 처리하도록 한다!
		 * > 메서드 호출 시 자신의 전달받은 파라미터를 다시 전달.
		 * > 클래스 내의 다른 메서드를 호출하여 사용 >> 코드의 재사용
		 */
		
		
		PrintClass pc = new PrintClass();
		pc.print();
		System.out.println("---------------");
		pc.print("홍길동");
		System.out.println("---------------");
		pc.print("홍길동","이순신");
		System.out.println("---------------");
		pc.print("홍길동","이순신","강감찬");

	}

}//public class end

class PrintClass{
	//최대 3명까지의 초대 인원에 대한 이름을 입력받아 출력하는 print() 메서드 정의
	// 단, 입력되지 않은 이름은 "없음" 출력
	// ex) print("a","b","c");
	//		초대멤버: "a b c"
	// ex) print("a");
	//     	초대멤버 "a 없음 없음"
	// ex) print ();
	//		초대멤버 "없음 없음 없음"
	
//	public void print() { // 기본메서드
//		System.out.println("print()메서드 호출됨!");
//		System.out.println("초대 멤버: 없음 없음 없음");
//	}
//	public void print(String name1) {
//		System.out.println("print(String)메서드 호출됨!");
//		System.out.println("초대멤버: " +name1+ " 없음 없음");
//	}
//	public void print(String name1,String name2) {
//		System.out.println("print(String,String)메서드 호출됨!");
//		System.out.println("초대멤버: " +name1+" "+name2+" 없음");
//	}
//	public void print(String name1,String name2,String name3) {
//		System.out.println("print(String,String,String)메서드 호출됨!");
//		System.out.println("초대멤버: " +name1+" "+name2+" "+name3);
//	}
	public void print() { // 기본메서드
		System.out.println("print()메서드 호출됨!");
//		System.out.println("초대 멤버: 없음 없음 없음");
		
		//print(String,String,String) 메서드를 호출하여
		// 없음, 없음, 없음을 대신 출력한다.
		print("없음","없음","없음");
	}
	public void print(String name1) {
		System.out.println("print(String)메서드 호출됨!");
//		System.out.println("초대멤버: " +name1+ " 없음 없음");
		
		print(name1,"없음","없음");
	}
	public void print(String name1,String name2) {
		System.out.println("print(String,String)메서드 호출됨!");
//		System.out.println("초대멤버: " +name1+" "+name2+" 없음");
		
		print(name1,name2,"없음");
	}
	public void print(String name1,String name2,String name3) {
		System.out.println("print(String,String,String)메서드 호출됨!");
		System.out.println("초대멤버: " +name1+" "+name2+" "+name3);
		
		//모든 파라미터를 전달받는 마지막 메서드는 자기 사진을 호출하면 안됨 !!
		// 재귀오류 발생.
	}
	
	
}// PrintCalss class end
