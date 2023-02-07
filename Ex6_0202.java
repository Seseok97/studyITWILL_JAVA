
public class Ex6_0202 {

	public static void main(String[] args) {
		// 증감연산자 (++,--)
//			> 단항연산자. 수치데이터타입의 피연산자 앞||뒤에 붙어서 값을 1씩 증가||감소 시키는 연산자.
//			> 다른 연산과 결합하여 사용될 때, 위치에 따라 결과가 다름.
		
		// 1. 선행연산자(전위연산자)
//			> 피연산자 앞에 위치하여 값을 1씩 증가 || 감소시킨다.
//			> 다른 연산과 결합하여 사용되는 경우, 먼저 값을 1 증가 || 감소하여 다른 연산에 반영한다.
//			ex) ++a. --a
		// 2. 후행연산자(후위연산자)
//			> 피연산자 뒤에 위치하여 값을 1씩 증가 || 감소시킨다.
//			> 다른 연산과 결합하여 사용되는 경우, 다른 연산을 먼저 실행하고, 값을 1 증가 || 감소 시킨다.
//			ex) a++. a--
		
			//정수 a의 값을 1만큼 증가시키는 방법.
			byte a = 10;
			
			//일반적인 산술연산자와 대입연산자의 경우
			a = (byte)(a+1);
			//확장대입연산자의 경우
			a += 1;
			//증감연산자의 경우
			a++;
			System.out.println(a); //13
			
			System.out.println("==============================");
			
			int b = 5;
			b++; // b=6
			++b; // b=7
			b--; // b=6
			--b; // b=5
			
			//증감연산자의 위치에 따른 연산 과정의 차이. >> 다른 연산자와 결합하여 사용할 때 주의점 !!
			int x1 = 5;
			int y1 = ++x1; //전위 >> 변수 x1의 값을 먼저 1만큼 증가시킨 후 대입. y1 = 6
			System.out.println(x1+","+y1); // 6,6
			
			int x2 = 5;
			int y2 = x2++; //후위 >> 변수 x2의 값을 먼저 y2에 대입하고 x2의 값을 1 증가시킴.. y2 = 5
			System.out.println(x2+","+y2); // 6,5
			
			System.out.println("-------------------------");
			x2 = 5;
			System.out.println(++x2); // 6 >> 값이 먼저 증가된 x2의 값이 출력
			System.out.println(x2++); // 6 >> x2의 값이 먼저 출력되고 , 이후 x2의 값은 1이 더해짐.
			System.out.println(x2);   // 7
			
			System.out.println("-------------------------");
			
			char ch = 'A';
			System.out.println(ch + 1); // 66 char >> int로 변환하여 정수출력.
			System.out.println(ch); 	// A ch의 값을 변경하거나 하지는 않았기 때문에 값은 그대로.
			
			System.out.println(ch++); // A >> 대입이 선행됨.
			System.out.println(ch);	  // B >> 그래서 이후에 변함.
			
			System.out.println(++ch); // C >> 증감연산이 선행됨.
			System.out.println(ch);	  // C >> 그래서 이후에 변화 없음.
			
			System.out.println("-------------------------");
			
			int x3 = 10;
			int y3 = 20;
			int z3 = ++x3 + y3--; // z3 = (1+x3)+(y3), y3의 증감연산은 다음 연산에서 반영됨.
			
			System.out.println(x3); // 11
			System.out.println(y3); // 19 >> y3의 증감연산(y3--)이 반영된 모습
			System.out.println(z3); // 31
			
		
		

	}

}
