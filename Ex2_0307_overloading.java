package overloading_;

public class Ex2_0307_overloading {

	public static void main(String[] args) {
		/*
		 *생성자 오버로딩
		 * > 메서드 오버로딩과 동일 ! 
		 * > 생성자 호출 시 다양한 형태의 파라미터를 전달하여 객체를 다양하게 초기화 하는 목적.
		 * 
		 */
		
		Person p = new Person();// 기본생성자
		p.showPersonInfo();
		Person p1 = new Person("홍길동","000000-0000000");
		p1.showPersonInfo();
		Person p2 = new Person("한국","홍진호","222222-2222222");
		p2.showPersonInfo();

	}

}// public class end

class Person{
	String nation;
	String name;
	String jumin;
	
	//기본 생성자 정의
	 public Person() {
		 System.out.println("Person() 생성자 호출됨!");
	 }
	 // 국가는 자동으로 한국으로 초기화하고,
	 // 파라미터 2개(name, jumin)를 전달받아 초기화하는 생성자 정의
	 public Person(String newName, String newJumin) {
		 System.out.println("Person(String,String) 생성자 호출됨!");
		 nation = "한국";
		 name = newName;
		 jumin = newJumin;
	 }
	 
	 //파라미터 3개 전부 초기화하는 생성자 정의
	 public Person(String newNation, String newName, String newJumin) {
		 System.out.println("Person(String,String,String) 생성자 호출됨!");
		 nation = newNation;
		 name = newName;
		 jumin = newJumin;
	 }//Person() method end
	 
	 //국가명, 이름, 주민번호를 출력하는 showPersonInfo() 메서드 정의
	 public void showPersonInfo() {
		 System.out.println("국가: "+nation);
		 System.out.println("name: "+name);
		 System.out.println("jumin: "+jumin);
	 }//showPersonInfo() method end
	 
}//Person class end
