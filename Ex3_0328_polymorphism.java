package polymorphism;

public class Ex3_0328_polymorphism {

	public static void main(String[] args) {
		/*
		 * 다형성 (polymorhpism)
		 */
		
		Employee emp = new Employee("홍길동", 3000);
		System.out.println("Employee 정보: "+emp.getEmployee());
		emp.salaryCalculation();
		
		System.out.println("------------------------------------------");
		
		Manager man = new Manager("이순신",5000,"IT",8);
		System.out.println("Manager 정보: "+man.getManager());
		man.salaryCalculation();
		
		System.out.println("------------------------------------------");
		Engineer eng = new Engineer("강감찬", 6000, 12);
		System.out.println("Engineer 정보: " + eng.getEngineer());
		eng.salaryCalculation();
		
		System.out.println("------------------------------------------");
		Employee emp2 = new Engineer("양세석", 5000, 10);
		emp2.salaryCalculation();
		
		System.out.println("===========================================");
		
		emp.salaryCalculationAll(emp); //(new Employee("홍길동",3000));
		emp.salaryCalculationAll(man); //(new Manager("이순신",4000,"개발팀",3));
		emp.salaryCalculationAll(eng); //(new Engineer("강감찬",5000,5));
		
	}// main() method end

}// public class end

// Employee class
class Employee{
	String name; // 사원명
	int salary;  // 연봉
	
//	public Employee() {} // 기본생성자
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}// parameter constructor end
	
	public String getEmployee() {
		return name+", "+salary;
	}// method end
	
	// 일반 직원의 연봉 계산(기본연봉 적용)
	public void salaryCalculation() {
		System.out.println("연봉: "+salary);
	}// method end
	
	//==============================================================================================
	// 전 직원의 연봉을 슈퍼클래스인 Employee 클래스에서 모두 계산 !!
	// >> 이때, 다형성이 필요하다 !! (Employee, Manager, Engineer 클래스 모두 처리해야함!)
	//    따라서, 메서드 파라미터로 다형성을 적용한 Employee 타입 필요.
	public void salaryCalculationAll(Employee emp) { // UPCASTING!
		int salaryResult = 0; // 연봉계산결과 저장 변수
		
		// 참조영역의 축소로 인해(업캐스팅), 각 서브클래스 타입 멤버변수가 보이지 않게 된다.
		// >> Employee를 제외한 Manager,Engineer의 경우 다운캐스팅을 통해
		//    다시 서브클래스의 멤버변수에 접근해야 한다 !! 
		//    > ! 주의 ! 단, 무작정 다운캐스팅을 수행하는 경우 오류가 발생한다 !!
		// 		>> 반드시 instanceof 연산자를 통한 타입판별을 거치고, 다운캐스팅을 해야 한다.
		// 		>>> 하위타입부터 판별을 진행해야 한다.
		
		if(emp instanceof Manager) { // emp 는 Manager 타입인가?
			// Employee > Manager 타입으로 다운캐스팅이 가능하다면,
			System.out.println("Employee > Manager 로 다운캐스팅!");
//			Manager man = emp; // Err, 자동형변환 x
			Manager man = (Manager)emp; // 명시적 형변환 ! >> 참조영역 확대
			
			// 업캐스팅으로 인하여 축소된 참조영역이 다운캐스팅을 통하여 확대 되었다 !
			// 다운캐스팅된 Manager 타입 인스턴스를 통해 모든 멤버 접근 가능!
			// 기본 연봉과 관리 인원 수에 따른 인센티브를 더해서 계산!
			salaryResult = man.salary + (man.manageEmployeeCount*10);
			this.name = man.name;
			
		}else if(emp instanceof Engineer) { // emp 는 Engineer 타입인가?
			System.out.println("Employee > Engineer 로 다운캐스팅!"); 
			Engineer eng = (Engineer)emp; // 자동형변환이 불가하기 때문에, 강제형변환 실시!
			// 업캐스팅으로 인하여 축소된 참조영역이 다운캐스팅을 통하여 확대 되었다 !
			// 다운캐스팅된 Engineer 타입 인스턴스를 통해 모든 멤버 접근 가능!
			// 기본 연봉과 자격증 개수에 따른 인센티브를 더해서 계산!
			salaryResult = eng.salary + (eng.numOfCertificate*20);
			this.name = eng.name;
		}else if(emp instanceof Employee) {
			System.out.println("Employee 그대로 사용!");
			salaryResult = salary;
			this.name = emp.name;
		} // if end
		// 하위 타입(서브 클래스)부터 먼저, 순서대로 판별을 진행해야 한다 !!!!
		// Employee가 슈퍼클래스이므로, Manager,Engineer보다 앞서 판별해버리면 항상 true를 반환하고,
		// 구문의 종료가 발생하기 때문 !!(int - long - double 생각하면 됨.)
		
		// 각 직원의 계산된 연봉 출력
		System.out.println(name+"의 연봉: "+ salaryResult+"만원 입니다!");
		
	}

}// Employee class end

//Manager class > extends Employee class
class Manager extends Employee{
	String depart;				// 부서명
	int manageEmployeeCount;	// 관리하는 직원 수
	
	// 슈퍼클래스 기본생성자가 없으므로, 파라미터 생성자를 호출하도록 생성자 정의.
	public Manager(String name, int salary, String depart, int manageEmployeeCount) {
		super(name, salary);
		this.depart = depart;
		this.manageEmployeeCount = manageEmployeeCount;
	}
	
	public String getManager() {
		return getEmployee()+", "+depart+", "+manageEmployeeCount;
	}
	
	// Employee의 연봉 계산 메서드를 오버라이딩 !
	// >> 매니저 연봉 > 기본연봉 + (관리직원 수 *10)
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + (manageEmployeeCount*10);
		System.out.println("연봉: "+salaryResult);
	}


}//Manager class end

// Engineer class > extends Employee
class Engineer extends Employee{
	int numOfCertificate = 4; // 자격증 개수
	
	// 파라미터 생성자
	public Engineer(String name, int salary, int numOfCertificate) {
		super(name, salary);
		this.numOfCertificate = numOfCertificate;
	}// para - con end
	
	public String getEngineer() {
		return getEmployee()+", "+numOfCertificate+"개";
	}

	@Override
	public void salaryCalculation() {
		int salaryResult = salary + (numOfCertificate*20);
		System.out.println("연봉: "+salaryResult);
	}

	
}// Engineer class end


































































