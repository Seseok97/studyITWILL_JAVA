package variable_arguments;

public class Test_0307_vararg {

	public static void main(String[] args) {
		/*
		 * 정수를 0~무한대로 전달받아 출력하는 print() 메서드를 가지는
		 * VariableArgumentsTest 클래스 정의
		 * 단, 정수를 0개 전달할 경우, "전달받은 정수 없음!" 출력
		 * 1개 이상의 경우, 전달받은 정수를 출력한다.
		 */
		VariableArgumentsTest va = new VariableArgumentsTest();
		va.print();
		va.print(1);
		va.print(1,2,3,4,5);
		

	}//main() method end

}// public class end

class VariableArgumentsTest{
	public void print(int...nums) {
		if(nums.length==0) {								//0개
			System.out.println("전달받은 정수 없음!");
		}else {
			for(int i = 0;i<nums.length;i++) {				//1개~무한대
				if(i == nums.length-1) {
					System.out.print(nums[i]+"\n");			//배열의 마지막 요소
				}else {
					System.out.print(nums[i]+", ");
				}
				
			}//for end
		}
	}//print() method end
}
