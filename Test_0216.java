package method_;

public class Test_0216 {

	public static void main(String[] args) {
		// 1. 파라미터도 없고, 리턴값도 없는 메서드 호출 연습.
		// Hello,world 문자열을 10회 출력하는 printHello()메서드 호출
		printHello();
		
		System.out.println("------------------------");
		
		// 구구단 2~9단 출력
		//gugudan();
//		gugudan(); 					// 출력문이 길어 주석처리
		// 원래는 구구단을 만드는 이중for문의 코드가 작성 되어야 하나,
		// 메서드를 생성함으로써 반복되는 코드 작성/사후 관리의 소요를 줄일 수 있다.
		
		System.out.println("===============================");
		
		//2. 파라미터는 없고, 리턴값만 있는 메서드 호출 연습
		// 1~10 정수합을 계산하여 리턴하는 sum()
		int total = sum();
		System.out.println("------");
		System.out.println("1~10의 합은 = "+ total);
		
		System.out.println("------------------------");
		
		System.out.println("오늘의 날씨:"+getWeather());  //흐림
		System.out.println("------");
		String todayWeather = getWeather();
		System.out.println("오늘의 날씨:"+todayWeather); //흐림
		
		System.out.println("------------------------");
				
		
	

		
	}//main() end
	
	public static void printHello() {
		int i =0;
		for(i=1;i<=10;i++) {
			System.out.println(i+": Hello, world!");
		}
	}//printHello() end
	
	public static void gugudan() {
		for(int i=2;i<=9;i++) {
			System.out.println("< "+i+" 단 >");
			for(int j =1;j<=9;j++) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
			System.out.println();
		}
	}//gugudan() end
	
	public static int sum() {
		int s = 0;
		for(int i=1;i<=10;i++) {
			s += i;
			System.out.println("s = "+s);
		}
		return s;
	}//sum() end
	
	public static String getWeather() {
		return "흐림";
	}//getWeather() end
	
	
	
	
	

}//Test_0216 Class end