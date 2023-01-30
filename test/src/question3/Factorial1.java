package question3;

public class Factorial1 {
	/* 문제 3. 재귀함수를 이용한 Factorial 구하기 */
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}

	public static int factorial(int num) {
		if( num == 1 || num == 0 ) {
			return 1;
		}
		
		return num * factorial(num-1);
	}
	
}
