package assignment8_methods;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		cube();

	}
	public static void cube() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num1=sc.nextInt();
		
		int cubed= num1*num1*num1;
		System.out.println("This is your cubed value of:" + num1 + "=" + cubed);
	}

}
