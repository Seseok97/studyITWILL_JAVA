package overloading_;

public class Test2_0307_overloading {

	public static void main(String[] args) {

		MyDate md = new MyDate();
		md.Calender();
		MyDate md2 = new MyDate();
		md2.Calender(1997);
		MyDate md3 = new MyDate();
		md3.Calender(1997,12);
		MyDate md4 = new MyDate();
		md4.Calender(1997,12,26);

	}

}//public class end

/*
 * 날짜를 관리하는 MyDate 클래스 정의
 * - 멤버변수: 연도(year, int), 월(month, int), 일(day, int)
 * - 생성자
 * 		1) 기본 생성자: 2023년 3월 7일로 초기화
 * 		2-1) 연도를 받아 초기화, 3월 7일로 초기화
 * 		2-2) 연도, 월을 받아 초기화, 7일로 초기화
 * 		2-3) 연도, 월, 일을 받아 초기화
 * 
 */

class MyDate{
	int year;
	int month;
	int day;
	public void Calender() {
		year = 2023;
		month = 3;
		day = 7;
		System.out.printf("%d년 %d월 %d일\n",year,month,day);	
	}
	public void Calender(int newYear) {
		year = newYear;
		month = 3;
		day = 7;
		System.out.printf("%d년 %d월 %d일\n",year,month,day);	
	}
	public void Calender(int newYear,int newMonth) {
		year = newYear;
		month = newMonth;
		day = 7;
		System.out.printf("%d년 %d월 %d일\n",year,month,day);	
	}
	public void Calender(int newYear,int newMonth, int newDay) {
		year = newYear;
		month = newMonth;
		day = newDay;
		System.out.printf("%d년 %d월 %d일\n",year,month,day);	
	}
}
