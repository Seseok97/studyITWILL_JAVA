package enum_type;

public class Test_0412_enum {

	public static void main(String[] args) {
		/*
		 * enum(EnumWeek)과 switch-case문을 활용하여
		 * 
		 * 평일이면 "하 ..."
		 * 금요일이면 "불금!!"
		 * 주말이면 "주말!!" 을 출력하는 코드를 작성해보자.
		 */
		EnumWeek today = EnumWeek.WEDNESDAY; 
		switch(today.ordinal()) {
		case 0: 
		case 1: 
		case 2: 
		case 3: System.out.println("하..."); break;
		case 4: System.out.println("불금!!"); break;
		case 5: 
		case 6: System.out.println("주말!!"); break;
		}

	}// main() method end

}// public class end