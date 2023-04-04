package interface_;

public class Ex4_0404_interface {

	public static void main(String[] args) {
		/*
		 * 3. 서로 상속관계가 없는 클래스 간에 인터페이스를 통한 상속관계를 부여한다 !!
		 */
		
		Ex4_0404_interface ex4 = new Ex4_0404_interface(); // noRelationShip() 은 static 키워드가 없다 !! > 인스턴스 생성 이후 사용 가능!!!!
		ex4.noRelationShip();							   // 만약 static 키워드가 있다면 !! (public class의 클래스명).메서드명() 하면됨!!
		
		System.out.println("-----------------------------------------");
		
		ex4.hasRelationShip();

	} // main() method end
	
	public void noRelationShip() {
//		NoteBookPc notebook = new NoteBookPc();
//		notebook.charge();
//		SmartPhone smartphone = new SmartPhone();
//		smartphone.charge();
		
		// 두개의 인스턴스를 하나의 배열로 관리해야 할 경우
		// NoteBookPc와 SmartPhone의 공통 타입은 Object타입 밖에 없다 !!
		Object[] objArr = {new NoteBookPc(),new SmartPhone()};
		// 상위클래스인 Object에 값을 넣는다???!! >> UPCASTING!!
		
		// 반복문을 사용하여 배열 크기만큼 반복
		for(int i=0;i<objArr.length;i++) {
//			objArr[i].charge();
			// Err! The method charge() is undefined for the type Object
			// >> 참조영역 축소로 인한 Object 타입으로 charge() 메서드 호출이 불가능해졌다 !!!
			// >>> 해결: 다운캐스팅!
			// 			> instanceof 연산자를 통하여, NoteBookPc와 SmartPhone 타입 판별
			if(objArr[i] instanceof NoteBookPc) {
				// Object > NoteBookPc 타입으로 다운캐스팅 후 charge() 메서드 호출
				NoteBookPc notebook = (NoteBookPc)objArr[i];
				notebook.charge();
			}else if(objArr[i] instanceof SmartPhone) {
				// Object > SmartPhone 타입으로 다운캐스팅 후 charge() 메서드 호출
				SmartPhone smartphone = (SmartPhone)objArr[i];
				smartphone.charge();
			}// ie end
		}// for end
		
	}// noRelationShip() method end
	
	public void hasRelationShip() {
		// 인터페이스를 통해 공통된 멤버를 갖는 상속관계를 부여할 경우,
		// 해당 인터페이스 타입으로 다운캐스팅 할 필요가 없어진다 !!!!
		// 업캐스팅된 상태 그대로 멤버에 접근 가능 ! > 다형형으로 인한 코드 절약
		
//		Chargeable c = new NoteBookPc2();  // NoteBookPc2 > Chargeable, UPCASTING!!
//		Chargeable c2 = new SmartPhone2(); // SmartPhone2 > Chargeable, UPCASTING!!
		
		// 위는 조금 번거롭고 ~~ 하나로 관리하는 방법!!
		
		// Chargeable 타입 배열로 두 클래스의 인스턴스를 모두 관리 가능!
		Chargeable[] chargeableArr = {new NoteBookPc2(), new SmartPhone2()};
		
		// 업캐스팅 후에도 공통메서드 charge() 메서드 호출이 가능하므로, 별도의 다운캐스팅 없이 접근이 가능하다!
		for(int i=0;i<chargeableArr.length;i++) {
			chargeableArr[i].charge();
		}// for end
		
	}//hasRelationShip() method end

}// public class end

// Object 클래스 외에 공통 슈퍼클래스가 없는 NoteBookPc와 SmartPhone의
// 공통 인터페이스 Chargeable 인터페이스 정의
interface Chargeable{
	// 두 클래스에서 공통으로 사용할 충전(charge()) 기능을 추상메서드로 정의!
	public abstract void charge();
}// Chargeable interface end

// 기존 Pc 클래스를 상속받고 있는 상태에서,
// 추가로 인터페이스를 구현해야하는 경우 ! > 상속코드 뒤에 구현코드를 기술.
// >> implements Chargeable 코드 추가
// >> 아무 관계 없던 두 클래스에 동일한 부모 인터페이스가 추가되어, 서로 상속관계에 묶이게 된다.

class NoteBookPc2 extends Pc implements Chargeable{
	@Override
	public void charge() {
		System.out.println("노트북 충전중 ....");	
	}
} //NoteBookPc2 class end

class SmartPhone2 extends HandPhone implements Chargeable{
	@Override
	public void charge() {
		System.out.println("스마트폰 충전중 ....");
	}
}// SmartPhone2  class end


////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 서로다른 class를 상속받는 NoteBookPc와 SmartPhone은
// 메서드명이 같은 charge() 메서드를 가지고 있다 !

class Pc{}

class NoteBookPc extends Pc{
	public void charge() {
		System.out.println("노트북 충전중...");
	}
}// NoteBookPc class end

class HandPhone {}

class SmartPhone extends HandPhone{
	public void charge() {
		System.out.println("스마트폰 충전중 ...");
	}
}// SmartPhone class end
