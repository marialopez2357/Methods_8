package assignment8_methods;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		
     Scanner sc= new Scanner(System.in);

      System.out.println("Is the room available? " );
      boolean available= sc.nextBoolean();
      
      System.out.println("Choose a date to rent the room:");
      int month= sc.nextInt();
      int day= sc.nextInt();
      int year= sc.nextInt();
      
      System.out.println("Will I be able to rent it?: " + simpleRoomBook(available, month, day, year));
	}
	public static boolean simpleRoomBook(boolean available, int month, int day, int year) {
		
	
		boolean flag = available;
		
		if (year == 2018 && month == 7 && (day <= 8 && day >= 1) || available == false) {
			flag = false;
		}
		return flag;
	}
}
