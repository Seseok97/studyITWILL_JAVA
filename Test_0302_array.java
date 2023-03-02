package array_;

public class Test_0302_array {

	public static void main(String[] args) {
		
		//학생 이름을 1차원 배열 names에 저장하고,
		//학생 점수를 2차원 배열 scores에 저장하여 다음과 같이 출력하라.
		
		/*			<학생 점수표>
		 * 
		 * 			국어	영어	수학
		 * 홍길동	 80		 70		 80
		 * 이순신	 90		 90		 90
		 * 강감찬	 50		 60		 77
		 * 손영신	 100	 100	 100
		 * 강병수	 80		 80		 60
		 * -----------------------------
		 * 
		 * 학생별 총점을 계산하여 1차원 배열(studentTotal)에 다음과 같이 저장후 출력하시오.
		 * 
		 * <학생별 총점>
		 * 홍길동: 230점 = 0행(0열, 1열, 2열) => studentTotal[0]
		 * 이순신: 270점 = 1행(0열, 1열, 2열) => studentTotal[1]
		 * 강감찬: 187점 = 2행(0열, 1열, 2열) => studentTotal[2]
		 * 손영신: 300점 = 3행(0열, 1열, 2열) => studentTotal[3]
		 * 강병수: 220점 = 4행(0열, 1열, 2열) => studentTotal[4]
		 * 
		 * 총점만 출력 하면 된다.
		 */
		String[] names = {"      ","홍길동","이순신","강감찬","손영신","강병수"};
		String[][] scores = {
				{"국어","영어","수학"},
				{"80","70","80"},
				{"90","90","90"},
				{"50","60","70"},
				{"100","100","100"},
				{"80","80","60"}
		};
		//%3d >> 3 칸 잡아먹는법
		System.out.println("      <학생 점수표>");
		for(int i = 0;i<names.length;i++) {
			System.out.print(names[i]);
			for(int j = 0;j<scores[i].length;j++) {
				System.out.print(scores[i][j]);
//				System.out.printf("%3d",scores[i][j]); // 강사님이랑 똑같이 넣어도 안되는디,,
			}
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		int[] studentTotal = new int[5]; // 5명의 총점을 저장할 배열 생성
		int sum = 0;
		
		for(int i = 1;i<names.length;i++) {
			System.out.print(names[i]);
			for(int j = 0;j<scores[i].length;j++) {
				sum += Integer.parseInt(scores[i][j]);
			}
			System.out.println("의 총합 점수: "+sum);
		}
		
		// 둘 다 못풀었음 !!!!
		// 강사님 코드 참고해서 코드 쳐 보고, 이해하고 넘어가자 !!
		

		
		
		
		

	}//main() method end

}//class end
