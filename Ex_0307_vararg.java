package variable_arguments;

public class Ex_0307_vararg {

	public static void main(String[] args) {
		/*
		 * 가변형 인자 = 비정형 인자(Variable Arguments, VARARGS)
		 *  > 메서드 파라미터를 하나의 인자만 이용하여 다양하게 전달받는 기능
		 *  > 동일한 타임의 파라미터를 0개 ~ 무한대로 전달받아 배열로 관리.
		 *  >> 전달받는 인자(데이터)의 개수에 따라 자동으로 배열이 생성된다.
		 *  > 메서드 파라미터(매개변수) 선언 시 데이터 타입 뒤에 ... 기호를 표기한다.
		 *  ex) public void add(int...nums){}
		 *  > 가변인자를 사용한 메서드의 대표적인 예 : printf() 메서드.
		 *  >> System.out.printf(String str , Object...objs){}
		 *  > 다른 파라미터와 가변인자를 조합 가능.
		 *  > 주의! 가변 인자는 마지막 파라미터로 단 한번만 지정이 가능하다.
		 *  
		 *  
		 */
		
		// 가변인자를 사용하지 않은 오버로딩 메서드 호출
		NormalArguments na = new NormalArguments();
		na.print("홍길동");
		na.print("홍길동","이순신");
		na.print("홍길동","이순신","강감찬");
//		na.print("홍길동","이순신","강감찬","양세석");
		//Err, The method print(String, String, String) in the type NormalArguments is not applicable for the arguments (String, String, String, String)
		
		// 배열을 파라미터로 사용하는 경우 데이터개수에 제한을 받지 않지만, 배열을 미리 생성해야 한다!!
		String[] strArr = {"홍길동","이순신","강감찬","양세석"};
		na.print(strArr);
		
		System.out.println("=========================================");
		
		VariableArguments va = new VariableArguments();
		//VariableArguments 객체의 print() 메서드를 호출하면, 파라미터로 0~무한대의 문자열 데이터 전달이 가능하다.
		va.print();
		va.print("홍길동");
		va.print("홍길동","홍진호");
		va.print("홍길동","1","2","3","4","5");
	}

}//public class end

class NormalArguments{
	// 가변인자를 사용하지 않은 메서드 오버로딩
	// print() 메서드 오버로딩
	// String 타입 변수 (name)를 통해 이름을 1~3개 전달받아 출력.
	public void print(String name1) {
		System.out.println(name1);
	}
	public void print(String name1,String name2) {
		System.out.println(name1+", "+name2);
	}
	public void print(String name1,String name2,String name3) {
		System.out.println(name1+", "+name2+", "+name3);
	}
	
	//Array 사용
	public void print(String[] names) {
		for(int i=0;i<names.length;i++) {
			if(i == names.length-1) {
				System.out.println(names[i]); //배열 마지막 요소
			}else {
				System.out.print(names[i]+", ");
			}
		}//for end
		System.out.println();
	}//print() method end
	
	
}//Normalarguments class end

class VariableArguments{
	// 가변인자를 사용한 메서드 오버로딩
	// 메서드 정의시 파라미터로 사용할 변수의 데이터타입 뒤에 ... 기호를 붙인다.
	public void print(String...names) {
		//String타입 데이터를 0~무한대로 전달 받을 수 있다.
		// 전달받은 데이터는 자동으로 배열생성 후에 저장된다.(JAVA의 기능임.)
		// >> 가변인자를 사용한 변수 names는 String[] 타입으로 사용된다.
		// >> 따라서, 배열 접근 방법을 활용하여 배열 내의 모든 요소에 접근할 수 있다.
		
		//for 사용
		for(int i = 0;i < names.length;i++) {
			System.out.println(names[i]+" ");
		}
		System.out.println(); // 줄바꿈
	}//print() method end
	//다른 파라미터와 가변인자 조합 가능
	public void print2(int num, String...names) {
		//int 형 데이터와 문자열데이터 여러개를 전달 가능!
		// ex)print2(10,"홍길동","이순신");
	}//print2() method end
	
//	public void exWrong1(String...names, int num) {
//		//Err, 가변인자는 다른 파라미터보다 앞에 올 수 없다!!
//	}
	
//	public void exWrong2(int...nums,String...names) {
//		//Err, 가변인자는 하나만 사용 가능하다!
//	}
	
	
	
	
	
}// VariableArguments class end


