package assignment8_methods;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Is the drink available at the store?");
		boolean available= sc.nextBoolean();
		System.out.println("Is it a gift?");
		boolean gift= sc.nextBoolean();
		System.out.println("How much from first ingredient?");
	    int ingr1= sc.nextInt();
	    System.out.println("And the second one?");
	    int ingr2= sc.nextInt();
	    System.out.println("What about the third one?");
	    int ingr3= sc.nextInt();
	    System.out.println("I got my drink: " + getThunderBlazz(available, gift, ingr1, ingr2, ingr3));
	}
	
	public static boolean getThunderBlazz(boolean available, boolean gift, int ingr1, int ingr2,int ingr3) {
		
		if((available || gift) == true) {
			
			return true;
			
		}else if((ingr1==1 && ingr2==2 && ingr3==3) || (ingr1==3 && ingr2==1 && ingr3==2)){
			
			return true;
		}else {
			return false;
		}
		
	}

}
