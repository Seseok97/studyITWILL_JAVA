package enum_type;

public class Ex3_0412_enum {

	public static void main(String[] args) {
		Month now = Month.FEBRUARY;
		System.out.println(now+", "+now.getMonthKor());

	}// main() method end

}// public class end

enum Month{
	// 생성자를 사용하면, 상수에 따른 값을 결합할 수 있다!
	JANUARY("1월"), FEBRUARY("2월"), MARCH("3월"); // 영어 달 이름과 한국어 달 이름 결합.
	
	private String monthKor;

	Month(String monthKor) { // 달 이름을 문자열로 전달받아 초기화
		this.monthKor = monthKor;
	}
	
	// getter / setter
	public String getMonthKor() {
		return monthKor;
	}
	public void setMonthKor(String monthKor) {
		this.monthKor = monthKor;
	}
	// getter / setter end
	
}// Month enum end

































