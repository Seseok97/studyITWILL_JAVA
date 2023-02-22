package class_;

public class Test3_0222_class {

	public static void main(String[] args) {
		Person2 man = new Person2();
		man.name = "홍길동";
		man.age = 30;
		man.isHungry = true;
		man.showPersonInfo();
		System.out.println("---------------------");
		man.eat("카레");
		System.out.println("---------------------");
		man.showPersonInfo();
		System.out.println("---------------------");
		man.talk();
		System.out.println("---------------------");
		man.showPersonInfo();

	}//main() method end

}// Test_3_0222_class end

/*
 * Person 클래스 정의
 * [멤버변수(인스턴스변수) 선언]
 * -이름(name, String)
 * -나이(age, int)
 * -배고픔(isHungry,boolean)
 * 
 * 메서드 정의
 * - 이름, 나이, 배고픔을 출력하는 showPersonInfo() 메서드
 * (매개변수 X, 리턴값 X)
 * 
 * - 밥먹는 기능을 수행하는 eat() 메서드
 * 	(매개변수: 음식이름(foodName,String), 리턴값 X)
 * 	> "XXX먹기!" 출력
 * 	> 멤버변수  isHungry 의 값을 false로 변경
 * 
 * - 말하기 기능을 수행하는 talk() 메서드
 * (매개변수 없음, 리턴값 없음)
 *  > "말하기!" 출력
 *  > 멤버변수 isHungry의 값을 true로 변경.
 * 
 */

class Person2{
	String name;
	int age;
	boolean isHungry;
	
	public void showPersonInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		if(isHungry) {
			System.out.println("배고파요");
		}else {
			System.out.println("배불러요");
		}	
	}//showPersonInfo() method end
	
	public void eat(String foodName) {
		System.out.println(foodName+"먹기 !!");
		isHungry = false;
	}//eat() method end
	public void talk() {
		System.out.println("말하기 !!");
		isHungry = true;
	}//talk() method end
	
}//Person1 class end