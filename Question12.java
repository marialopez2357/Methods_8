package assignment8_methods;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Say true or false: ");
		boolean q1= sc.nextBoolean();
		System.out.println("Say true or false again: ");
		boolean q2= sc.nextBoolean();
		
		System.out.println(hamletQuote(q1,q2));
		
	}
	public static boolean hamletQuote(boolean q1, boolean q2) {
		
		if(q1==false && q2==false) {
			return false;
		 
			
		}else {
			return true;
		}
		
	}

}
