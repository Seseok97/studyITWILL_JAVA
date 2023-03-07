package overloading_;

public class Test_0307_overloading {

	public static void main(String[] args) {
		Calculator result = new Calculator();
		result.add(10, 20);
		result.add(10, 20, 30);
		result.add(10, 20, 30, 40);
		
		result.cal('+', 10, 20);
		result.cal('+', 10, 20, 30);
		result.cal('+', 10, 20, 30, 40);
		
		result.cal('-', 100, 10);
		result.cal('-', 100, 10, 20);
		result.cal('-', 100, 10, 20, 30);
		
		System.out.println("====================================");
		
		PrintOverloading po = new PrintOverloading();
		
		po.print(1);
		po.print(3.14);
		po.print("홍길동");
		po.print();// 줄바꿈
		System.out.println("ln check");

	}//main() method end

}//public class end

/*
 *계산시(Calculator) class 정의
 * - 정수를 전달받아 덧셈만 수행하는 add() 메서드 정의
 * 1. 정수 2개, 덧셈
 * 2. 정수 3개, 덧셈
 * 3. 정수 4개, 덧셈
 * -----------------------------------------------------
 * - 연산자에 해당하는 연산을 수행하는 cal() 메서드 정의
 * 1. c.cal('+',10,20) // 10 + 20 = 30 출력
 * 2. c.cal('+',10,20,30) // 10 + 20 + 30 = 60 출력
 * 3. c.cal('+',10,20,30,40) // 10 + 20 + 30 + 40 = 100 출력
 * 
 * 4. c.cal('-',100,10) // 100 - 10 = 90 출력
 * 5. c.cal('-',100,10,20) // 100 - 10 - 20 = 70 출력
 * 6. c.cal('-',100,10,20,30) // 100 - 10 - 20 - 30 = 40 출력
 * */

class Calculator{
	//add()
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	public void add(int num1, int num2, int num3, int num4) {
		System.out.println(num1+num2+num3+num4);
	}
	//cal()
	public void cal(char op, int num1, int num2) {
		if(op == '+') {
			System.out.println(num1 +" "+ op +" "+ num2 +" = "+ (num1+num2));
		}
		if(op == '-') {
			System.out.println(num1 +" "+ op +" "+ num2 +" = "+ (num1-num2));
		}
	}//cal() method end
	public void cal(char op, int num1, int num2, int num3) {
		if(op == '+') {
			System.out.println(num1 +" "+ op +" "+ num2 +" "+ op +" "+ num3 +" = "+ (num1+num2+num3));
		}
		if(op == '-') {
			System.out.println(num1 +" "+ op +" "+ num2 +" "+ op +" "+ num3 +" = "+ (num1-num2-num3));
		}
	}//cal() method end
	public void cal(char op, int num1, int num2, int num3, int num4) {
		if(op == '+') {
			System.out.println(num1 +" "+ op +" "+ num2 +" "+ op +" "+ num3 +" "+ op +" "+ num4 +" = "+ (num1+num2+num3+num4));
		}
		if(op == '-') {
			System.out.println(num1 +" "+ op +" "+ num2 +" "+ op +" "+ num3 +" "+ op +" "+ num4 +" = "+ (num1-num2-num3-num4));
		}
		//printf()가 더 직관적이고 나을것같음!
		
	}//cal() method end
}//Calculator class end

class PrintOverloading{
	int i;
	double d;
	String str;
	
	public void print(int newI) {
		i = newI;
		System.out.println(i);
	}
	public void print(double newD) {
		d = newD;
		System.out.println(d);
	}
	public void print(String newStr) {
		str = newStr;
		System.out.println(str);
	}
	public void print() {
		System.out.println();
	}
}//PrintOverloading class end

class ExPrintOverloading{
	public void print(int  data) {
		System.out.println(data);
	}
	public void print(double data) {
		System.out.println(data);
	}
	public void print(String data) {
		System.out.println(data);
	}
	public void print() {
		System.out.println();
	}
}//ExPrintOverloading class end

