package assignment8_methods;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
  plus();
	}
	public static void plus() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		 
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		int sum= num1+num2;
		System.out.println("Your result is: " + sum);
	}

}
