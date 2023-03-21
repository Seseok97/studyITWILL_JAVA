package overriding;

public class Test_0321_overriding {

	public static void main(String[] args) {
		Car c = new Car();
		c.speedUp();

	}

}// public class end


/*
 * Car 클래스 정의
 * > 멤버변수: speed(현재속력, int), maxSpeed(최대속력, int)
 * 
 * > 메서드
 * 		speedUp()	: "자동차 속도 증가!" 출력 (리턴타입, 파라미터 없음)
 * 		speedDown() : "자동차 속도 감소!" 출력 (리턴타입, 파라미터 없음)
 * 		addFuel()	: "자동차 연료 주입!" 출력 (리턴타입, 파라미터 없음.)
 */

class Car{
	int speed;
	int maxSpeed;
	
	public void speedUp() {
		System.out.println("자동차 속도 증가!");
	}
	public void speedDown() {
		System.out.println("자동차 속도 감소!");
	}
	public void addFuel() {
		System.out.println("자동차 연료 주입!");
	}
	
}// Car class end

class ElectricCar extends Car{
	int batteryCapacity;

	@Override
	public void speedUp() {
		System.out.println("ElectricCar 전기모터의 힘으로 속도 증가!");;
	}

	@Override
	public void speedDown() {
		System.out.println("ElectricCar 속력 감소하면서 전기배터리 충전!");
	}

	@Override
	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
	}
	
	
}// ElectricCar class end

class DieselCar extends Car{
	int cc;

	@Override
	public void speedUp() {
		System.out.println("DieselCar 디젤엔진의 힘으로 속도 증가!");;
	}

	@Override
	public void speedDown() {
		System.out.println("디젤자동차 속도 감소!");
	}

	@Override
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 주입!");
	}
	
}// DieselCar class end

