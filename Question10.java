package assignment8_methods;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		
		isEven(num);

	}

	public static void isEven(int number) {
	
		
		
		if(number%2==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
}
