package wrapper_class;

import java.util.Arrays;

public class Test5_0406_wrpcls {

	public static void main(String[] args) {
		/*
		 * 문자열을 char[] 배열에 분리하여 저장한 후, 해당 문자열에 대한 간단한 암호화 작업을 실행.
		 * > 문자열을 분리하여 저장한 배열을 encrypt() 메서드에 전달.
		 * > 전달받은 배열의 문자에 대해 아스키코드 값을 3만큼 증가한 문자를 별도의 배열에 저장 후, 문자열로 변환하여 리턴.
		 * ex) 'A'(65) > encrypt() > 'D'(68) 
		 * 		"Hello" > 'H', 'e', 'l', 'l', 'o' 형태로 배열 저장
		 * 	  >encrypt()> 'K', 'h', 'o', 'o', 'r' > "Khoor" 출력
		 * 
		 * 
		 */
		String str = "admin1234";
		// String 타입 문자열을 char타입 배열로 변환 할 때 > toCharArray() 사용.
		System.out.println("원본   데이터: "+str);
		System.out.println("암호화 데이터: "+encrypt(str));
		
		System.out.println("--------------------------------------------");
		
		// 강사님 풀이
		System.out.println("강사님 풀이");
		
		char[] chArr2 = str.toCharArray();
		Test5_0406_wrpcls t = new Test5_0406_wrpcls();
		
		// encryptT() 메서드를 호출하여 배열 chArr2 파라미터값으로 전달하고,
		// 리턴되는 배열을 전달받아 반복문으로 모든문자 출력.
		String encryptResult = t.encryptT(chArr2);
		System.out.println("암호화 전: "+ Arrays.toString(chArr2));
		System.out.println("암호화 후: "+encryptResult);
		
	}// main() method end
	
	public static String encrypt(String str) {// static 없으면 main() 메서드에서 인스턴스 생성해야함!
		// 암호화작업 수행
		// 전달받은 배열 내의 모든 문자값을 +3하여 새 배열에 저장!
		// > 전달받은 배열 크기를 새 배열의 크기로 저장하기.
		
		// 배열선언
		char[] chArr = str.toCharArray();			 // 원본배열
		char[] enArr = new char[str.length()];		 // 암호화배열
		
		// 암호화
			for(int i=0;i<str.length();i++) {
				char newChar =(char)(chArr[i] + 3);	 // 암호화 과정(+3)
				enArr[i] = newChar;					 // 암호화배열에 저장 // newChar은 없어도 되는데, 암호화 / 저장 과정 나누려고 생성!
			}// for end
		
		// 문자열 반환
		String enArrStr = new String(enArr);		 // 암호화배열을 문자열로 변환
		return enArrStr;							 // 문자열 리턴
		
	}// encrypt() method end
	
	
	
	// 강사님 풀이
	public String encryptT(char[] chArr2) {
		char[] enArr2 = new char[chArr2.length];
			for(int i=0;i<chArr2.length;i++) {
				enArr2[i] = (char) (chArr2[i]+3);
			}// for end
			
			// 형태: "0123...";
			//1. String 생성자 : char[]를 문자열로 변환시킴.
//				String str = new String(enArr2);
//				return str;
			
			//2. String.valueOf() 메서드
//				String str = String.valueOf(enArr2);
//				return str;
			
			//3. StringBuilder 활용(입출력클래스)
//				StringBuilder buffer = new StringBuilder();
//				for(char ch : enArr2) { 	      // 배열이 끝날때까지 ch 변수에 하나씩 대입한다.
//					buffer.append(ch);		      // buffer 라는 메모리에 값을 하나씩 채운다.
//				}// for end
//				String enStr = buffer.toString(); // buffer에 있는 요소를 String값으로 enStr 변수에 저장한다.
//				return enStr;					  // enStr 리턴
				

		return Arrays.toString(enArr2);
		// toString() 메서드에 의하여 문자열로 변환된다.
		// 형태: "[ 0, 1, 2, 3 ... ]";
		
	}//encryptT() method end

}// public class end










































