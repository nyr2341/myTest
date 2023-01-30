package question4;

public class Factorial2 {
	/* --------------------------------------
	 *  문제 4. 3번 문제의 Stack Overflow 해결하기 
	 * 
	 *  자바에서는 꼬리재귀를 지원하지 않는 듯 하네요...
	 * --------------------------------------
	 */
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}

	/* 꼬리재귀 구현, Stack Overflow 미해결 */
	public static int factorial(int num) {
		if( num == 1 || num == 0 ) {
			return 1;
		}
		
		return factorial(num, num-1);
	}
	
	public static int factorial(int result, int num) {
		if( num == 1 ) {
			return result;
		}
		
		return factorial(result * num, num-1);
	}
	/* End */
	
}
