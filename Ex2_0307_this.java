package this_;


public class Ex2_0307_this {

	public static void main(String[] args) {
		/*
		 * 생성자 this() 
		 * > 자신의 생성자 내에서 자신의 또 다른 생성자를 호출
		 * > 레퍼런스 this 사용과 동일하게 자신의 인스턴스에 접근하여, 다른 오버로딩 생성자를 호출하는 용도로 사용.
		 * > 생성자 오버로딩시, 인스턴스 변수에 대한 초기화 코드가 중복되는데, 초기화 코드 중복을 제거하는 용도로 사용한다.
		 * >> 여러 생성자에서 각각 인스턴스 변수를 중복으로 초기화 하지 않고, 하나의 생성자에서만 초기화 코드를 작성한 뒤,
		 * >> 나머지 생성자에서 해당 초기화 코드를 갖는 생성자를 호출하여, 초기화 할 값만 전달 후 대신 인스턴스 변수 초기화를 수행한다.
		 * 
		 * >>메서드 오버로딩 시, 코드 중복을 제거하기 위하여 하나의 메서드에서만 작업을 수행하고 나머지 메서드는 해당 메서드를 호출하여 데이터를 전달하는 것과 동일하다!
		 * (단, 메서드는 이름()으로 호출하고, 생성자는 this()로 호출하는 차이!)
		 * 
		 * <생성자 this() 호출 기본 문법>
		 * 생성자 내의 첫번째 라인에서
		 * this([데이터]){}
		 */
		
		//기본생성자
		MyDate md = new MyDate();
		System.out.println(md.year);
		
		//MyDate(int)
		MyDate md2 = new MyDate(2023);
		System.out.println(md2.year);
		
		//MyDate(int,int)
		MyDate md3 = new MyDate(2023,3);
		System.out.println(md3.year+"/"+md3.month);
		
		////MyDate(int,int,int)
		MyDate md4 = new MyDate(2023,3,7);
		System.out.println(md4.year+"/"+md4.month+"/"+md4.day);
		
	}

}

class MyDate{
	int year;
	int month;
	int day;
	//기본생성자 정의
	public MyDate() {
		this(1900,1,1); // 타 실행코드보다 무조건 먼저 실행 되어야 한다.
		System.out.println("MyDate() 생성자 호출됨!");
//		System.out.println("MyDate() 생성자 호출됨!"); // this()생성자 컴파일 에러로 인한 주석처리
		//인스턴스변수 초기화 코드가 다른 생성자와 중복된다.
		// > 중복 제거를 위해 3개의 값을 전달 받는 파라미터 생성자를 호출 하여, 초기화에 사용될 데이터를 전달하여 대신 초기화 수행.
		// >> 코드중복 제거 가능!
//		this(1900,1,1);
		//Constructor call must be the first statement in a constructor > this() 생성자 위에 어떤 실행문도 있어서는 안된다.
		
	}
	public MyDate(int year) {
		//MyDate(int,int,int) 생성자를 호출하여
		// 전달받은 연도와 1월1일 값을 전달하여 초기화.
		this(year,1,1);
		System.out.println("MyDate(int year)생성자 호출됨!");
	}
	public MyDate(int year,int month) {
		this(year,month,1);
		System.out.println("MyDate(int year,int month)생성자 호출됨!");
	}
	//모든 인스턴스 변수 데이터를 전달받아 초기화하는 생성자 정의
	public MyDate(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		System.out.println("MyDate(int year,int month,int day)생성자 호출됨!");
	}
	public void showDateInfo() {
		System.out.println();
	}
}// MyDate class end
