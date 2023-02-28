package access_modifier;

public class person {
	private String name;
	int age;
	
	// 0228
	private int birthday;
	
	//멤버변수에 대신 접근하도록 Getter/Setter 메서드 정의(public 접근제한자)
	// 1. Getter 정의
	// > 파라미터는 없고, 리턴값만 있는 메서드
	// String 타입 멤버변수 name에 대한 Getter 메서드
	public String getName() {
		// 멤버변수 name의 값을 외부로 리턴
		return name;
	}
	// int 타입 멤버변수 birthday에 대한 Getter 메서드
	public int getBd() {
		return birthday;
	}
	
	// 2. Setter 정의
	// > 파라미터만 있고, 리턴값은 없는 메서드
	// String타입 멤버변수 name에 대한 Setter 메서드
	public void setName(String newName) {
		//외부로부터 전달받은 name의 값(로컬변수 newName)을 멤버변수 name에 저장 !
		name = newName;
	}
	// int타입 멤버변수 birthday에 대한 Getter 메서드
	public void setBd(int Bd) {
		birthday = Bd;
	}
	
}
