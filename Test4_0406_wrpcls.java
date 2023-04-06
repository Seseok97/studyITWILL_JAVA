package wrapper_class;

public class Test4_0406_wrpcls {

	public static void main(String[] args) {
		/*
		 * char 타입 배열 chArr에 'A','b','5',' ','#' 문자 5개를 저장
		 * >> 반복문을 활용하여, 각각의 문자에 대한 판별을 수행하여 결과를 출력하라.
		 */
		
		char[] chArr= {'A','b','5',' ','#'};
		
		for(int i=0;i<chArr.length;i++) {
			System.out.println("원본 데이터 chArr["+i+"]: "+chArr[i]);
			
				if(Character.isUpperCase(chArr[i])) {
					System.out.println(chArr[i]+": 대문자 \n");
					
				}else if(Character.isLowerCase(chArr[i])){
					System.out.println(chArr[i]+": 소문자 \n");
					
				}else if(Character.isDigit(chArr[i])) {
					System.out.println(chArr[i]+": 숫자 \n");
					
				}else if(Character.isWhitespace(chArr[i])){
					System.out.println(chArr[i]+": 공백 \n");
					
				}else {
					System.out.println(chArr[i]+": 기타문자 \n");
					
				}// i-eee-e end
		}// for end

	} // main() method end

}// public class end
