
public class Ex4_0201 {

	public static void main(String[] args) {
//		산술연산자(+,-,*,/,%)
//			> 사칙연산 동일
//			> % : 나머지연산자(또는 퍼센트 연산자)
//				>> 나눗셈 결과에 대한 나머지를 계산하는 연산자.
			
		System.out.println(10+2); //12
		System.out.println(10-2); //8
		System.out.println(10*2); //20
		System.out.println(10/2); //5 10나누기2의 몫
		System.out.println(10%2); //0 10나누기2의 나머지
		
		System.out.println("---------------------------------------");
		
		int a = 10, b =2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b); //결과 위와 동일
		
		System.out.println("---------------------------------------");
		
//		연산 결과를 변수에 저장 후 출력
		int c; 
		
		c = a+b;
		System.out.println(a+" + "+b+" = "+c);
		System.out.printf("%d + %d = %d\n",a,b,c);
		c = a-b;
		System.out.println(a+" - "+b+" = "+c);
		System.out.printf("%d - %d = %d\n",a,b,c);
		c = a*b;
		System.out.println(a+" * "+b+" = "+c);
		System.out.printf("%d * %d = %d\n",a,b,c);
		c = a/b;
		System.out.println(a+" / "+b+" = "+c);
		System.out.printf("%d / %d = %d\n",a,b,c);
		c = a%b;
		System.out.println(a+" % "+b+" = "+c);	// 결과 위와 동일
//		System.out.printf("%d % %d = %d\n",a,b,c); //err ,형식지정문자로 인해서 나타나는 문제.
		System.out.printf("%d %% %d = %d\n",a,b,c); // %% 두번 작성하여 해결
		
		
	}

}
