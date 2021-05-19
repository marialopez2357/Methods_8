package assignment8_methods;

public class Question8 {

	public static void main(String[] args) {
		
		fib(1);

		
	}
	
		
	public static void fib(int num) {

		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;

		for (int i = 0; i < num; i++) {

			sum = secondNum+firstNum;
			firstNum = secondNum;
			secondNum = sum;
		}
		System.out.println(num + " -> correspondant fibonacci number is: " + sum);

}
}
