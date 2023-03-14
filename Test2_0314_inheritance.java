package inheritance;

public class Test2_0314_inheritance {

	public static void main(String[] args) {
		//코드의 재사용성 실습
		Manager m = new Manager();
		m.name="홍길동";
		m.salary=3000;
		m.depart="IT";
		System.out.println(m.getEmployee());
		System.out.println(m.getManager());
	}//main() method end
}// public class end

/*
 * 직원(Employee) class
 * 멤버변수
 * - 직원이름 (name, String)
 * - 연봉	  (salary, int)
 * 
 *  멤버메서드
 *  - 직원 정보를 문자열로 결합하여 리턴하는 getEmployee() 메서드 정의
 *  	(파라미터 없고, 리턴값 있음)
 *  	> 직원이름과 연봉을 문자열로 결합하여 리턴시켜라.
 *  	> ex) 홍길동, 3000
 * 
 * Employee class를 상속받는 Manager class 정의
 * - 이름, 연봉, 부서명(depart, String) 멤버변수
 * - 이름, 연봉, 부서명을 문자열로 결합하여 리턴하는 getManager() 메서드 정의
 * 
 */
class Employee{
	String name;
	int salary;
	
	public String getEmployee() {
		return name+", "+salary;
	}
}// Employee class end
class Manager extends Employee{
//	String name;
//	int salary;
	// 멤버변수는 상속받았음 !
	String depart;
	
	public String getManager() {
		return getEmployee()+", "+depart;
		//Super class의 getEmployee() 메서드 재활용
		// > 해당 메서드의 리턴값과 부서명을 결합하여 다시 리턴 !
	}
}// Manager class end