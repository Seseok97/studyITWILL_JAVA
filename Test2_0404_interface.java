package interface_;

public class Test2_0404_interface {

	public static void main(String[] args) {
		
		BumbleBee bb = new BumbleBee();
		bb.fight();
		bb.transform(bb.MODE_NORMAL);
		bb.transform(Transformable.MODE_CAR);
		bb.transform(3);
		bb.speak();
		

	}// main() method end

}// public class end

/*
 * 전투 기능을 갖는 Fightable 인터페이스 >> interface 객체에는 ~able과 같은 기능을 많이 붙임.
 * > fight() 메서드: 파라미터x, 리턴x
 * 
 * 변신 기능을 갖는 Transformable 인터페이스
 * > MODE_CAR=1, MODE_AIRPLANE=2, MODE_NORMAL=3
 * > transform() 메서드 : 파라미터 o(mode, int), 리턴x
 * 
 * Robot 인터페이스 정의
 * > Fightable 인터페이스, Transformable 인터페이스 상속
 * > 말하기 기능(speak())
 * 
 * Robot 인터페이스를 구현하는 BumbleBee 클래스 정의
 * > fight() 메서드 오버라이딩 > "로켓발사!" 출력
 * > trnasform() 메서드 오버라이딩 > mode값에 따라 다른형태로 변신
 * 									> MODE_NORMAL	> "로봇모드로 변신" 출력
 * 									> MODE_CAR		> "자동차 모드로 변신" 출력
 * 									> MODE_AIRPLANE > "비행기 모드로 변신" 출력
 * > speak() 메서드 오버라이딩 > "라디오로 말하기" 출력
 */

interface Fightable{
	void fight();
}// Fightable interface end

interface Transformable{
	int MODE_NORMAL 	= 1;
	int MODE_CAR 		= 2;
	int MODE_AIRPLANE 	= 3;
	void transform(int mode);
}// Transformable interface end

interface Robot extends Fightable, Transformable{
	void speak();
} //Robot interface end

class BumbleBee implements Robot{

	@Override
	public void fight() {
		System.out.println("로켓발사!");
	}
	@Override
	public void transform(int mode) {
		if(mode == Transformable.MODE_NORMAL) {
			System.out.println("기본 모드(로봇)로 변신!");
		}else if(mode == Transformable.MODE_CAR) {
			System.out.println("자동차로 변신!");
		}else if(mode == Transformable.MODE_AIRPLANE) {
			System.out.println("비행기로 변신!");
		} // iee end
	}
	@Override
	public void speak() {
		System.out.println("라디오로 말하기!");
	}
	// Override end
	
} //BumbleBee class end
