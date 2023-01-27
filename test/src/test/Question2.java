package test;

public class Question2 {
	/* 문제 2. 체이닝 메소드 */
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(4).add(5).subtract(3).out();
		System.out.println(result);
	}
	
}

class Calculator {
	private int num;
	
	public Calculator() {
		this.num = 0;
	}
	
	public Calculator add(int num) {
		this.num += num;
		return this;
	}
	
	public Calculator subtract(int num) {
		this.num -= num;
		return this;
	}
	
	public int out() {
		return this.num;
	}
	
}