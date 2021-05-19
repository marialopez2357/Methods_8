package assignment8_methods;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
        System.out.println("Enter your number: ");
       
       int number= sc.nextInt();
       
       sign(number);

	}
	public static void sign(int number) {
	
		if(number>0) {
			System.out.println("1. Your number is positive");
			
		}else if (number<0) {
			System.out.println("-1. Your number is negative");
			
		}else {
			System.out.println("Your number is 0");
		
		}
	}

}
