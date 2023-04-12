package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_0412_scanner {

	public static void main(String[] args) {
		/*
		 * Scanner
		 * > 화면, 파일, 문자열과같은 입력소스로부터 문자데이터를 읽어오는데 사용되는 클래스.
		 * > 여러 형태의 생성자를 오버로딩하여 지원하므로, 다양한 입력소스로부터 데이터를 읽을 수 있다.
		 * 	 (Ex) scanner(String source) scanner(file source) 등)
		 * 
		 * > 정규표현식(Regular expression)을 이용한 라인단위의 검색을 지원한다.
		 * > nextXXX() 메서드를 통해 입력받은 문자를 다시 변환하는 수고를 덜어준다.
		 * 	 (Ex) nextInt() : int, nextLine() : String 등)
		 * > Scanner 사용을 위해서는 java.util.Scanner를 import 해야한다.
		 * 
		 * <Scanner 설정 문법>
		 * Scanner 변수명 = new Scanner(); // 입력받을 시, System.in 활용
		 */
		Scanner scan = new Scanner(System.in); // System.in >> 키보드로 입력받는 경우
		// >> 키보드로 입력받은 값으로 인스턴스를 생성하라.
		
//		String input = "";
//		
//		do {
//			System.out.println("원하는 값을 입력하세요. 프로그램을 종료하려면 Q를 입력하세요. : ");
//			// 입력한 값을 라인단위로 읽어온다.
////			input = scan.next();
//			// 공백을 허용하지 않을때 사용한다.
//			// >> 1 1 을 넣으면 공백을 구분자(Delimiter)로 생각하여, 앞의 1만 입력받아 input에 대입한다.
//			
//			input = scan.nextLine();
//			// 라인 전체를 문자열로 인식한다.
//			// >> "1 1"을 넣으면 "1 1"을 출력!
//			
//			System.out.println("입력하신 값은 "+input+"입니다.");
//		}while(!input.equals("Q")); // Q와 같지 않으면 계속된다.
//		System.out.println("프로그램을 종료합니다.");
		
		System.out.println("============================================================================");
		
//		System.out.println("정수를 입력하세요: ");
//		int num = scan.nextInt();
//		// 정수가 아닌 값을 입력하면 InputMismatchException 예외가 발생한다.
//		System.out.println(num);
		
//		System.out.println("실수를 입력하세요: ");
//		double dnum = scan.nextDouble();
//		// 실수가 아닌 값을 입력하면 InputMismatchException 예외가 발생한다.
//		// 정수를 입력하는 경우, 실수로 인식한다. (1 입력 >> 1.0 출력)
//		System.out.println(dnum);
		
//		System.out.println("true 또는 false를 입력하세요 : ");
//		boolean b = scan.nextBoolean();
//		// true/false가 아닌 값을 입력하면(대소문자 상관X) InputMismatchException 예외가 발생한다.
//		System.out.println(b);
		
		try {
			boolean b = scan.nextBoolean();
			if(b == true) {
				System.out.println(b+"입력!");
			}else {
				System.out.println(b+"입력!!!");
			}
		} catch (InputMismatchException e) {
			System.out.println("true 또는 flase를 입력해주세요.");
//			e.printStackTrace(); // 그 에러뜨면 빨간글씨 줄줄나오는게 이거임.
								 // 지우면 안뜸 !!!!
		}// t - c end
			
		
		
		

	}// main() method end

}// public class end
































