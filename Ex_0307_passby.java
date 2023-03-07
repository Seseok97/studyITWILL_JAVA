package pass_by;

public class Ex_0307_passby {

	public static void main(String[] args) {
		/*
		 * 메서드 호출시 값 전달 방식에 따른 차이
		 * = 메서드 파라미터로 기본 데이터타입과 참조 데이터타입의 전달 시 차이점
		 * > 메서드 호출 시, 값을 전달 할 경우 값의 복사가 일어남.
		 * 
		 * 1. Pass by value(값에 의한 전달)
		 *  > 메서드 호출 시, 기본 데이터타입 데이터를 전달하는 경우
		 *  > 실제 값(실제 데이터)을 복사하여 전달한다.
		 *  >> 호출된 메서드 내에서 전달받은 값(복사한 데이터)을 변경해도 원본 데이터에는 아무런 이상이 없다.
		 *  
		 *  2. Pass by reference(참조에 의한 전달)
		 *  > 메서드 호출 시, 참조 데이터타입 데이터를 전달하는 경우
		 *  > 실제 값이 있는 공간의 주소값(참조값) 을 복사해서 전달한다.
		 *  >> 호출된 메서드 내에서 전달받은 값(복사한 주소값)에 접근하여 해당 주소에 있는 데이터를 변경하는 경우
		 *     원본 데이터도 동일한 주소값을 가지기 때문에, 변경된 결과에 영향을 받는다.
		 *     
		 *  도서관에서 사전을 빌린다.
		 *  1 의 경우 > 사전의 사본을 빌린것. 훼손해도 원본은 손상이 없다.
		 *  2 의 경우 > 사전의 원본을 빌린것. 훼손하면 ..
		 *  
		 */
		
		Money m = new Money();
		PassByTest pbt = new PassByTest();
		
		//1. 메서드 파라미터로 기본데이터타입 변수 값을 전달할 경우(복사값)
			System.out.println("changePrimitiveType() 메서드 호출 전 money = "+m.money);
		
		//Money 인스턴스의 멤버변수 money값을 메서드에 전달
		// 이때, 기본 데이터타입이므로 실제 값을 복사하여 전달된다.
			pbt.changePrimitiveType(m.money); // money애 저장된 값(10000)이 복사되었다.
		
			System.out.println("changePrimitiveType() 메서드 호출 후 money = "+m.money);
		//호출된 메서드에서 전달받은 데이터를 변경하더라도, 원본 데이터에는 아무런 영향이 없다.
		
			System.out.println("========================================================");
		
		//2. 메서드 파라미터로 참조 데이터타입 변수 값을 전달할 경우
			System.out.println("changeReferenceType() 메서드 호출 전 money = "+ m.money);
		
		//Money 인스턴스의 주소가 저장된 참조변수 값을 메서드에 전달
		// 이 때, 참조 데이터타입(Money)이므로, 주소값을 복사하여 전달.
			pbt.changeReferenceType(m);
		
			System.out.println("changeReferenceType() 메서드 호출 후 money = "+ m.money);
		// 호출된 메서드에서 전달받은(복사된) "주소값"에 접근하여 인스턴스 내의 데이터를 변경하는 경우,
		// 원본 데이터도 동일한 주소값을 참조하게 되므로, 변경된 값은 원본 데이터에도 영향을 주게 된다
		// >> 즉, 동일한 주소값을 참조하므로 어느 한 쪽에서 객체 데이터를 변경하는 경우, 같은 주소를 참조하는 모든 값이 한번에 영향을 받게 된다.

	}//main() method end

}//public class end

class PassByTest{
	public void changePrimitiveType(int money) {		//PrimitiveType : 기본형 데이터타입
		// 기본데이터타입 데이터(복사 값)을 전달 받았다 ! (복사된 값)
		// 전달받은 기본데이터타입의 데이터를 변경!!
		money -= 5000;
		System.out.println("changePrimitiveType() 메서드의 money = "+ money);
	}//changePrimitiveType() method end
	
	public void changeReferenceType(Money m) {			//ReferenceType : 참조형 데이터타입
		// 참조형 데이터타입의 데이터를 전달 받았다. >> 원본 값을 가져 온 것임.
		// 전달받은 주소 값에 해당하는 인스턴스에 접근하여, 인스턴스 내의 멤버변수(실제 값)을 변경
		// > 참조변수명.멤버변수 를 통하여 접근 가능
		m.money -= 5000;
		System.out.println("changeReferenceType() 메서드의 money = "+ m.money);
		
	}//changeReferenceType() method end
	
}//PassByTest class end

class Money{
	int money = 10000;
}//Money class end
