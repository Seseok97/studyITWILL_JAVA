package class_;

public class Ex_0222_class {

	public static void main(String[] args) {
		Person p1 =new Person();
		p1.name="홍길동";
		p1.age=40;
//		System.out.println("이름: "+p1.name);
//		System.out.println("나이: "+p1.age);
		// 위 코드는 아래 코드와 같은 값을 출력한다.
		p1.print();
		
		Person p2 = new Person();
		p2.name ="양세석";
		p2.age = 27;
		p2.print();
		

	}//main() method end

}//Ex_0222_class end

//사람()Person 클래스 정의
class Person {
	//멤버변수 선언
	String name;
	int age;
	
	//메서드 정의
	// 자신의 인스턴스에 저장된 이름, 나이를 출력하는 print() 메서드 정의
	// > 매게변수 없음, 리턴값 없음
	public void print() {
		// 클래스 내의 메서드에서 자신의 클래스 멤버변수에 자유롭게 접근 가능
		//  >> 변수명만으로 메모리에 저장된 자신의 인스턴스 내의 멤버변수 값을 사용할 수 있다 !!!!!
		//  >> 단, 동일한 코드라 하더라도 인스턴스에 따라 결과값은 달라진다.
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
}
