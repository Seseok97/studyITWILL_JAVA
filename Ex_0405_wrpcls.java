package wrapper_class;

public class Ex_0405_wrpcls {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 * > 기본 데이터타입을 객체형태로 관리해주는 클래스의 모음
		 * 	>> java.lang 패키지에 위치
		 * > 기본 데이터타입과 1:1로 대응하는 8개의 클래스를 제공한다 !
		 * 	>> Byte, Short, Integer*, Long, Float, Double, Character*, Boolean
		 * > Wrapper 클래스에서 제공하는 상수와 메서드 등을 활용하여, 기본 데이터타입 데이터를 다양하게 처리할 수 있다 !!
		 * 
		 */
		
		System.out.println("\n[Byte타입]");
		System.out.println(" byte 타입 메모리크기 (bit): "+ Byte.SIZE);
		System.out.println(" byte 타입 메모리크기 (byte): "+ Byte.BYTES);
		System.out.println(" byte 타입 최소값: "+ Byte.MIN_VALUE);
		System.out.println(" byte 타입 최대값: "+ Byte.MAX_VALUE);
		
		System.out.println("\n[Short타입]");
		System.out.println(" Short 타입 메모리크기 (bit): "+ Short.SIZE);
		System.out.println(" Short 타입 메모리크기 (byte): "+ Short.BYTES);
		System.out.println(" Short 타입 최소값: "+ Short.MIN_VALUE);
		System.out.println(" Short 타입 최대값: "+ Short.MAX_VALUE);
		
		System.out.println("\n[Int타입]");
		System.out.println(" Int 타입 메모리크기 (bit): "+ Integer.SIZE);
		System.out.println(" Int 타입 메모리크기 (byte): "+ Integer.BYTES);
		System.out.println(" Int 타입 최소값: "+ Integer.MIN_VALUE);
		System.out.println(" Int 타입 최대값: "+ Integer.MAX_VALUE);
		
		System.out.println("\n[Long타입]");
		System.out.println(" Long 타입 메모리크기 (bit): "+ Long.SIZE);
		System.out.println(" Long 타입 메모리크기 (byte): "+ Long.BYTES);
		System.out.println(" Long 타입 최소값: "+ Long.MIN_VALUE);
		System.out.println(" Long 타입 최대값: "+ Long.MAX_VALUE);
		
		System.out.println("\n[Float타입]");
		System.out.println(" Float 타입 메모리크기 (bit): "+ Float.SIZE);
		System.out.println(" Float 타입 메모리크기 (byte): "+ Float.BYTES);
		System.out.println(" Float 타입 최소값: "+ Float.MIN_VALUE);
		System.out.println(" Float 타입 최대값: "+ Float.MAX_VALUE);
		
		System.out.println("\n[Double타입]");
		System.out.println(" Double 타입 메모리크기 (bit): "+ Double.SIZE);
		System.out.println(" Double 타입 메모리크기 (byte): "+ Double.BYTES);
		System.out.println(" Double 타입 최소값: "+ Double.MIN_VALUE);
		System.out.println(" Double 타입 최대값: "+ Double.MAX_VALUE);
		
		System.out.println("\n[Char타입]");
		System.out.println(" Char 타입 메모리크기 (bit): "+ Character.SIZE);
		System.out.println(" Char 타입 메모리크기 (byte): "+ Character.BYTES);
		System.out.println(" Char 타입 최소값: "+ (int)Character.MIN_VALUE);
		System.out.println(" Char 타입 최대값: "+ (int)Character.MAX_VALUE);
		

	}// main() method end

}// public class end

