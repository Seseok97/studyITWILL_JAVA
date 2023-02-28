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
		 *  
		 *  
		 *  
		 *  
		 *  /0228 이어서
		 *  > public 접근제한자를 사용하여 정의(누구나 접근 가능)
		 *  1. Getter: 내부 멤버변수의 값을 외부로 리턴하는 메서드
		 *  	>> getXXX() 형식의 메서드 이름을 사용하여 정의
		 *  	>> 이 때, XXX 는 접근할 멤버변수의 이름을 사용한다.
		 *  	ex) 멤버변수 num 에 접근하는 Getter메서드 이름: getNum() 
		 *  	>> 매개변수(Parameter)는 없고, 리턴값만 있는 메서드이다.
		 *  	ex) public int getNum() {}
		 *  
		 *  2. Setter: 외부로부터 값을 전달받아 내부 멤버변수에 저장하는 메서드
		 *  	>> setXXX() 형식의 메서드 이름을 사용하여 정의
		 *  	>> 이 때, XXX는 접근할 멤버변수의 이름을 사용한다.
		 *  	ex) 멤버변수 num 에 접근하는 Setter메서드 이름: setNum() 
		 * 		>> 매개변수(Parameter)만 있고, 리턴값은 없는 메서드이다.
		 * 		ex) public void setNum(int n) {}
		 * 
		 * 
		 */
		
		person p = new person();
		//멤버변수 값을 변경하기 위해 참조변수를 통해 멤버변수에 접근 !
		// > 하지만 ! 멤버변수의 접근제한자가 private이므로 외부클래스에서 접근 불가 !!
		
//		p.name="홍길동"; // err, The field person.name is not visible
		p.age = 30; // ok
		
		
//		System.out.println("이름: "+p.getName()); // 아직 안됨
		
		//Setter 설정 후
		p.setName("홍길동");
		System.out.println("이름: "+p.getName());
		p.setBd(881122);
		System.out.println("생년월일: "+p.getBd());
		
		//왜 필요하냐?
		p.setName("양세석");
		System.out.println("이름: "+p.getName());
		p.setBd(971226);
		System.out.println("생년월일: "+p.getBd());
		// 접근제한자 private는 외부 클래스에 접근이 불가능하다.
		// 코드 노출을 줄일수 있다 !
		// Alt+shift+S >> R // Gettet/Settet 생성 단축키
		

		

	}

}
