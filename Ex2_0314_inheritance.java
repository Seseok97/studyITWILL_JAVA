package inheritance;

public class Ex2_0314_inheritance {

	public static void main(String[] args) {
		/*
		 * 상속의 장점
		 * 1. 코드의 재사용성이 증가한다.
		 * 2. 코드의 유지보수가 용이해진다.
		 * 
		 * 
		 */
		Point3D p = new Point3D();
		p.print3D();
				
	}
}// public class end

//2차원 좌표 (x,y)를 관리하는 Point2D 클래스

class Point2D{
	int x = 10; // x좌표
	int y = 20; // y좌표
	
	//2차원 좌표값을 출력하는 print2D() 메서드 정의
	public void print2D() {
//		System.out.print("x 좌표= " + x + ", y 좌표= " + y);
		//Super class의 메서드를 수정하게 되면, Sub class인 Point3D 클래스에서 수정내용에 대한 적용을 받을 수 있다.
		//예시
		System.out.print(x+" , "+y);
	}
}

//3차원 좌표 (x,y,z)를 관리하는 Point3D 클래스
class Point3D extends Point2D{
	//int x,y 를 재선언할 필요가 사라진다.
	int x;
	int y;
	// 상속받은 값이 초기화되어있다 !
	int z = 30; // z 좌표
	
	//3차원 좌표값을 출력하는 print3D() 메서드 정의
	public void print3D() {
//		System.out.println("x 좌표= " + x + ", y 좌표= " + y + ", z 좌표= "+ z);
		//x좌표, y좌표는 Superclass인 Point2D 클래스의
		// print2D() 메서드가 출력하므로, 해당 메서드를 호출해서 출력하고,
		// 자신의 클래스 멤버인 z좌표만 별도로 출력하면 !!
		// 코드의 재사용이 가능하다!
		print2D();
		System.out.println(" , z 좌표= "+z);
	}
}
