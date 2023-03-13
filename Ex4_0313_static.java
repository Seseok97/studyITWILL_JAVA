package static_;

public class Ex4_0313_static {

	public static void main(String[] args) {
		/*
		 * 싱글톤 디자인 패턴(Singleton Design Pattern)
		 * - 단 하나의 유일한 인스턴스만을 생성하여 공유하도록 하는 기법
		 * - 외부에서 인스턴스 생성을 하지 못하도록 차단하고, 클래스 내에서 직접 인스턴스를 생성 후 외부로 리턴하는 기법.
		 * - 누구나 단 하나의 인스턴스만을 공유하여 사용해야 한다 !!
		 *  >> 즉, 외부에서 new 를 통한 새 인스턴스 생성을 불가능하게 한다 !
		 *  
		 *  <패턴 규칙>
		 *  1. 외부에서 인스턴스 생성이 불가능 하도록, 생성자에 private 접근제한자를 선언하여 정의한다.
		 *  2. 자신의 클래스에서 직접 인스턴스를 생성하여 참조변수에 저장한다.
		 *  	> 외부에서 인스턴스 생성 없이도 접근 가능하도록 static 키워드 사용
		 *  	> 외부에서 함부로 접근하지 못하도록 private 접근제한자 선언.
		 *  3. 생성된 인스턴스를 외부로 리턴하는  Getter 메서드 정의
		 *      > private 접근제한자로 선언된 멤버변수 instance에 접근하여, 생성된 인스턴스를 리턴하는 용도로 정의한다.
		 *      > 인스턴스 생성 없이 호출해야 하므로, static 키워드 사용
		 */
		
		//SingletonClass class의 instance 생성
//		SingletonClass sc = new SingletonClass();
//		SingletonClass sc2 = new SingletonClass(); // > 이런식으로, 2개 이상의 instance를 만들지 못하게 하기 위함 !!!
		// 에러로 인한 주석처리
		// >> 생성자에 private 접근제한자가 있어, 외부에서 호출이 불가하다 !
		// >>> 외부에 의한 인스턴스 생성이 차단되었다!
		
//		SingletonClass sc
//		= new SingletonClass() // 2단계중 ) 인스턴스는 만들지 못하지만, 참조변수는 만들 수 있다 !!
//		= instance; //err, instance를 어디서 불러와야 하는건지 모른다 !!
		// instance값을 sc에 저장할수 있으면 사용이 가능할것 !!
//		= SingletonClass.instance; // err, static이 없어서 사용을 못함.(클래스명.참조변수명 => static 사용법)
//		= SingletonClass.instance; // static 적용 후. 에러 사라짐
		
		// 클래스 내에서 인스턴스를 생성하여 멤버변수 instance에 주소값을 저장했기 때문에,
		// 해당 변수를 통해 인스턴스의 주소값을 가져올 수 있음 !!
		// >> 이 때, 해당 변수는 static 변수이므로, 클래스명 만으로 접근이 가능하다 !!
		
		//주의 !! SingletonClass로부터 리턴받은 인스턴스를 통해 클래스 내의 
		// Singleton 타입 변수 instance에 접근이 가능하므로, 해당 변수값을 변경할 우려가 있다.
		//예시
//			SingletonClass.instance = null; // instance값이 변경가능하다 !!
//			sc.instance = null;				// instance값이 변경가능하다 !!
		// 외부에서 멤버변수에 함부로 접근하지 못하도록, private 접근 제한자를 붙여 외부접근을 차단해야 한다.
		
		// 아래 SingletonClass 생산자 앞에 private 기입후 에러 발생으로 사용이 불가능해진다 !!
		// 근데 ... 위에도 참고 못하게 되어버림 !!
		// >> getter / setter 활용
		
		// SingletonClass 내에서 싱글톤 디자인 패턴으로 생성된 인스턴스를 변수 instance에 주소값을 저장했으나,
		// private 접근제한자로 인하여 접근이 불가하므로, getInstance() method를 호출하여 주소값을 가져온다.
		// > 이 때, getInstance() 메서드는  static 메서드이므로, 클래스명.메서드명() 형태로 호출이 가능해진다.
		// >> 즉, 인스턴스 생성 없이도 클래스 내의 메서드 호출이 가능해진다 !!
		SingletonClass sc =SingletonClass.getInstance();
		
		// 리턴받은 인스턴스는 참조변수 sc를 통하여 접근이 가능하다.
		sc.str = "싱글톤 패턴으로 생성한 인스턴스의 str";
		
		// SingletonClass 타입 변수 sc2에 인스턴스를 리턴받아 저장 
		SingletonClass sc2 = SingletonClass.getInstance();		
		
		// 리턴받은 인스턴스는 참조변수 sc2 를 통해 접근 가능하다.
		System.out.println("sc.str : "+sc.str);
		System.out.println("sc2.str : "+sc2.str);
		
		// if문을 통해 두 인스턴스 (sc,sc2)가 같은지 비교
		if(sc == sc2) {
			System.out.println("sc와 sc2는 같은 인스턴스!!");
		}else {
			System.out.println("sc와 sc2는 다른 인스턴스!!");
		}
	}//main() method end
	
}// Ex4_0313_static end

class SingletonClass{
	// 별도 파일로 만들어도 된다 !!
	String str; // 임시 확인용 변수 !!
	
	// 기본생성자 정의
//	public SingletonClass() {} 
	
	//1. 외부에서 생성자 호출이 불가능하도록, 생성자에 private 접근제한자 선언
	private SingletonClass() {}
	// >>> new 키워드를 통한 인스턴스 생성이 불가능하다.
	
	//2. 자신의 클래스 내에서 인스턴스를 직접 생성 후 참조변수에 저장
//	SingletonClass instance = new SingletonClass();
	// >> 인스턴스 생성 없이 접근을 해야 하므로, static 키워드가 사용되어야 한다.
//	static SingletonClass instance = new SingletonClass();
	// >> 보안을 위해 private 접근제한자 추가 ! 주의칸 참고
	private static SingletonClass instance = new SingletonClass();
	
	//3. 생성된 인스턴스를 외부로 리턴하는 Getter 메서드 정의
	// > 인스턴스를 저장하는 변수 instance가 private 접근제한자이다 !!
	// >> 접근이 불가능 하지만, 인스턴스를 리턴하는 목적으로 정의.
	// > 인스턴스 생성 없이 접근해야하므로, static 키워드 사용
	
	
//	public SingletonClass getInstance() {
//		return instance;
//	}
	// private 기본생성자에 접근제한자가 걸려있어, 사용이 불가능하다 ..!!
	
	public static SingletonClass getInstance() {
		// SingletonClass >> 이게 데이터타입이다. 그래서 에러 안남 !!
		// static 추가 후 사용가능해짐 !!
		return instance;
	}
	
}