package static_;

public class Ex3_0313_static {

	
	int b = check("인스턴스 변수 b! 로딩순서 4번");
	
	static int a = check("static 변수 a! 로딩순서 1번");
	
	public static int check(String str) {
		System.out.println("check() 호출 " + str);
		return 0; // 의미없음 (리턴이 필요해서 쓰는거)
	}
	
	public static void main(String[] args) {
		/*
		 * static 멤버와 인스턴스 멤버의 메모리 할당 순서
		 * 0. Ex3 클래스가 메모리에 로딩됨.
		 * 1. static 키워드가 선언된 모든 멤버가 메모리에 로딩된다.
		 * 2. static 멤버가 메모리에 로딩될 때
		 * 	  static 변수 a와 c에 check() 메서드 리턴값이 전달되어야 하므로,
		 * 	  static 메서드인 check() 메서드 호출됨 
		 * 	  > 2-1 "static 변수 a" 출력 (static변수 a 로딩됨)
		 * 	  > 2-2 "static 변수 c" 출력 (static변수 c 로딩됨)
		 * 3. main() 메서드 자동으로 호출됨.
		 * 	  > "main() 메서드 호출" 출력 
		 * 4. main() 메서드 내에서 Ex3_0313_static 인스턴스 생성됨.
		 * 5. Ex3_0313_static 인스턴스 생성시 인스턴스변수 b가 메모리에 로딩되며,
		 * 	  인스턴스변수 b가 로딩될때, check() 메서드가 호출됨.
		 * 	  > "인스턴스 변수 b" 출력
		 * 6. Ex3_0313_static 인스턴스 생성 후 main() 메서드의 다른코드 실행
		 * 	  >"Ex3 인스턴스 생성 완료" 출력
		 * 
		 */
		
//		int b = check("인스턴스 변수 b");
		System.out.println("main() 메서드 호출! 로딩순서 3번");
		
		Ex3_0313_static ex = new Ex3_0313_static();
		System.out.println("Ex3 인스턴스 생성 완료! 로딩순서 5번");

	} // main() method end
	
	static int c = check("static변수 c ! 로딩순서 2번");

} // Ex3_0313_static class end
