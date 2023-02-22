package class_;

public class Ex3_0221_class {
	//main() 메서드는 자바 프로그램의 시작점이다.
	// main() 메서드에서부터 객체를 생성하고 사용할 수 있다 !
	// 단, main() 메서드에서만 가능한 것은 아니고, main()메서드가 호출하는 다른 메서드에서도 사용 가능하다.
	public static void main(String[] args) {
		//정의한 클래스는 설계도에 해당한다 !!!!!!
		// 실제 사용을 위해서는 반드시 실체(객체)를 생성 하여야 한다.
		//
		//<클래스에 대한 인스턴스 생성 기본 문법>
		//클래스명 변수명 = new 클래스명();
		
		//<인스턴스 접근 기본 문법(멤버변수 접근 및 메서드 호출)>
		//참조변수명.멤버변수 또는 참조변수명.메서드()
		
		//Animal 클래스의 인스턴스 생성 과정
		// 1. Animal클래스 타입 참조변수 선언
//		Animal_0221 ani;
		// 2. Animal 클래스 인스턴스 생성 및 주소값(16진수) 저장
//		ani = new Animal_0221();
		
		// 위 두 문장을 한 문장으로 결합
		Animal_0221 ani = new Animal_0221();
		
		//Animal 인스턴스에 접근하여 멤버변수 사용 및 메서드 호출
		// > 인스턴스 접근을 위해서는 반드시 인스턴스 주소가 필요하다 !!
		// >> 인스턴스 주소를 담고 있는 참조변수(ani)를 통하여 접근이 가능하다.
		
		//1. Animal 인스턴스의 멤버변수 name에 접근하는 방법
//		name="알쥐"; // err
		// 참조변수명.멤버변수명
		ani.name = "알쥐";
		//ani 변수에 저장된 주소값을 가지는 인스턴스의 멤버변수 name에 "알쥐" 저장
		System.out.println("이름: "+ani.name);
		ani.age = 2;
		System.out.println("나이: "+ani.age+"살");
		//2. Animal 인스턴스 메서드 cry() 호출
		// > 리턴값,파라미터가 없는 메서드 !!
		ani.cry();
	
//20230222 이어서 !!
		
		
		
		
		
		
		System.out.println("---------------------------------");
		
		//Animal_0221 클래스의 두번째 인스턴스(ani2) 생성
		// 멤버변수 초기화 >> 이름: 냐옹이, 나이 : 2
		// > cry() 메서드 호출
		
		Animal_0221 ani2 = new Animal_0221();
		ani2.name = "야옹이";
		ani2.age = 2;
		System.out.println("이름: "+ani2.name);
		System.out.println("나이: "+ani2.age+"살");
		ani2.cry2();
		
		System.out.println("============================");
		
		//car class의 인스턴스 car 생성 및 멤버변수 초기화 후 출력
		// 제조사: 현대
		// 모델명: 그랜저
		// 배기량: 3000
		
		Car_0221 car = new Car_0221();
		System.out.println(car);
		// Heap메모리 공간에 저장된 주소값 출력
		
		car.company = "현대";
		car.modelName = "그랜저";
		car.cc =3000;
		System.out.println("제조사: "+car.company);
		System.out.println("모델명: "+car.modelName);
		System.out.println("배기량: "+car.cc);
		//메서드 호출
		car.speedUp();
		car.speedDown();
		
		System.out.println("==========================");
		//아래 student class 선언 보고 넘어오기
		
		
		
		
		
//		Student class 인스턴스 생성
		// 이름: 홍길동
		// 번호: 1
		// 과목명: 백엔드 개발자과정
		// >study() 메서드 호출하여 JAVA 문자열 전달
		// >rest() 메서드 호출
		
		Student s1 = new Student();
		s1.name="홍길동";
		s1.id=1;
		s1.className="백엔드 개발자 과정";
		System.out.println("이름: "+s1.name);
		System.out.println("번호: "+s1.id);
		System.out.println("과목명: "+s1.className);
		
//		s1.study(null); // "null과목 공부중!!" 출력
		s1.study("JAVA");
		s1.rest();
		
		System.out.println("--------------------");
		//Student class의 인스턴스 2 생성
		// 자신의 정보를 통하여 메서드 호출
		
		Student myInfo = new Student();
		myInfo.name="양세석";
		myInfo.id=123;
		myInfo.className="백엔드 개발자 과정";
		System.out.println("이름: "+myInfo.name);
		System.out.println("번호: "+myInfo.id);
		System.out.println("과정명: "+myInfo.className);
		
		myInfo.study("JAVA");
		myInfo.rest();
		
		
	
		
	}//main() method end

}//Ex3 class end

//하나의 자바파일 내에 여러개의 클래스를 정의할 수 있다 !!
//단, 파일명과 동일한 클래스 외에는 public 키워드를 붙일수 없다.


//학생(student) 클래스 정의
//속성(멤버변수): 이름(name,String), 번호(id,int), 과정명(className,String)

//기능(메서드): 1)공부(study()) - 리턴값 없음, 매개변수 - 과목명(subjectName,String)
//								> "OOO 과목 공부중!" 출력
//				2)휴실(rest()) - 리턴값 없음, 매개변수 없음
//								> "휴식!" 출력

//public class student{ //The public type student must be defined in its own file, 
//					  //온파일에러, 이 클래스는 Ex3_0221_class의 것이기 때문에 발생하는 에러 
//	
//}

class Student{ //err X
	//멤버변수 선언
	String name;
	int id;
	String className;
	
	//메서드 정의
	public void study(String subjectName) {
		//전달받은 인자값을 사용하여 출력
		System.out.println(subjectName+"과목 공부중!!");
	}//study() method end
	public void rest() {
		System.out.println("휴식!!");
	}//rest() method end
	
}//Student class end
