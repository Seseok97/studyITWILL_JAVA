package string_class;

public class Test_0411_strcls {

	public static void main(String[] args) {
		/*
		 * String 클래스 메서드 연습
		 * ---------------------------------------------
		 * 1. 주민번호를 입력받고, 성별/외국인 판별
		 * - 입력형식: "XXXXXX-XXXXXXX"
		 * - 판별조건
		 * 		뒷자리 첫번째숫자 1, 3 > 남, 2, 4 > 여, 5, 6 > 외국인
		 * 
		 * 
		 */
		String jumin = "012345-100000";
		
		// if
		int n = Integer.parseInt(jumin.substring(7,8));
		if(n == 1 || n == 3){
			System.out.println("남성");
		}else if(n == 2 || n == 4) {
			System.out.println("여성");
		}else if(n == 5 || n == 6) {
			System.out.println("외국인");
		}else{
			System.out.println("잘못된 입력입니다!");
		}
		// i-e-e end
		
		
		// switch - case
		switch (n) {
		case 1: ;
		case 3:System.out.println("case - 남성"); break;
		case 2: ;
		case 4:System.out.println("case - 여성"); break;
		case 5: ;
		case 6:System.out.println("case - 외국인"); break;
		default: System.out.println("case - 잘못된 입력입니다!");
		}// s - c end
		
		String[] juminArr = jumin.split("-");
		int num = Integer.parseInt(juminArr[1].substring(0, 1));
		char num2 = juminArr[1].charAt(0);
		System.out.println(num2);
		//if(num2 == '1') ... 
		
		System.out.println("============================================");
		/*
		 * 2. 문자열에 포함된 내용(주소) 중 실제 주소부분만 추출하여 출력.
		 * 		> 입력형식: "Address: 주소 ...." ex) "Address: 부산광역시 부산진구 동천로109 삼한골든게이트"
		 * 		> 출력형식: "주소..." ex) "부산광역시 부산진구 동천로109 삼한골든게이트" 출력
		 * */
		String address="Address: 부산광역시 부산진구 동천로109 삼한골든게이트";
		String[] addArr = address.split(":");
		System.out.println("split(),trim(): "+addArr[1].trim());
		
		String addSub = address.substring(9);
		System.out.println("substring(): "+addSub);
		
		// "부산광역시" 만 출력
		String[] addArr2 = (addArr[1].trim()).split(" ");
		System.out.println("도시: "+addArr2[0]);
		System.out.println("구: "+addArr2[1]);
		System.out.println("도로명: "+addArr2[2]);
		System.out.println("건물명: "+addArr2[3]);
		addSub = address.substring(9,14);
		System.out.println("substring(): 도시: "+addSub);
		
		
		System.out.println("---------------------------------------------------------");
		/*
		 * 3. 문자열에 포함된 정보를 문자열(구분자)을 기준으로 분리하고, 항목별로 출력
		 * */
		String address2 = 
				"Address: 부산광역시 부산진구 동천로, Floor: 7층, Tel: 051-803-0909";
		
		System.out.println("[1번, 콤마를 기준으로 분리]");
		
		//1. 콤마를 기준으로 분리하기.
		String[] address2Arr = address2.split(",");
		for(int i=0;i<address2Arr.length;i++) {
			System.out.println("addressArr2["+i+"]: "+address2Arr[i]);
		}
		
		System.out.println("[2번, 항목명/항목내용 분리]");
		
		//2. 1번 결과로부터 콜론(:)을 기준으로 항목명과 항목내용을 분리하기
		String[] addressR = address2Arr[0].split(":");
		String[] floorR = address2Arr[1].split(":");
		String[] telNoR = address2Arr[2].split(":");
		
		for(int i=0;i<addressR.length;i++) {
			System.out.println("addressR["+i+"]: "+addressR[i]);
		}
		for(int i=0;i<floorR.length;i++) {
			System.out.println("floorR["+i+"]: "+floorR[i]);
		}
		for(int i=0;i<telNoR.length;i++) {
			System.out.println("telNoR["+i+"]: "+telNoR[i]);
		}
		
		System.out.println("[3번, 출력결과물]");
		
		System.out.println((addressR[1]+floorR[1]+telNoR[1]).trim());
		
		//강사님
		String[] address2ArrT = address2.split(",");
		for(int i=0;i<address2Arr.length;i++) {
			String[] strArr2 =  address2ArrT[i].split(":");
			System.out.print(strArr2[1]);
			
			// 분리된 결과를 별도의 배열에 저장하지 않고, 
			// 1번 인덱스의 데이터를 바로 출력 가능.
			// > 1회성 접근 후 제거해도 무관한 경우 !!
//			System.out.print((address2ArrT[i].split(":")[1]));
		} // for end

		
	}// main() method end

}// public class end



