package access_modifier;

public class Ex_0223_acmo {

	public static void main(String[] args) {
		/*
		 *접근제한자(Access Modifier) 
		 * > 클래스, 메서드, 멤버변수 등의 접근 제한용도로 사용하는 키워드
		 * >(넓은) public > protected > default > private(좁음)
		 * 
		 * > defalut 접근제한자는 접근제한자를 생략하여 작성한 코드에 적용된다.
		 * 
		 * 1. private 접근제한자
		 *	> 외부 클래스에서 접근하지 못하며, 자신의 클래스 내에서만 접근 가능.
		 *	> 주로 외부에서 접근하지 못하도록 멤버변수에 적용한다.
		 *	> 자신의 클래스 내에서 private 멤버변수값에 접근하여, 멤버변수의 값을 변경하거나 리턴하는 역할의 메서드를 정의하여 사용한다.
		 *
		 * 2. public 접근제한자
		 * 	> 누구나 접근 가능
		 *  > 주로 외부에서 접근하는 메서드에 적용된다.
		 * 
		 * 
		 * Gettet / Settet 메서드( 요청받기 / 주기)
		 *  > 클래스 내에서 private 접근제한자로 선언된 멤버변수 등에 접근을 위해, 클래스 내에서 제공하는 중개역할의 메서드.
		 *  > 로그인 등의 단계를 걸쳐 권한을 부여하면 된다.
		 * 
		 */
		
		person p = new person();
		//멤버변수 값을 변경하기 위해 참조변수를 통해 멤버변수에 접근 !
		// > 하지만 ! 멤버변수의 접근제한자가 private이므로 외부클래스에서 접근 불가 !!
//		p.name="홍길동"; // err, The field person.name is not visible
		p.age = 30; // ok
		

	}

}
