package assignment8_methods;


import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter your value:");
    int value= sc.nextInt();
    System.out.println("next 3 numbers are: ");
        
    next3(value);
    
	}
	public static void next3(int value) {
	
		for(int i=0; i<3; i++) {
		value++;				;
		System.out.print(value +  " ");
		}
	}
	

}
