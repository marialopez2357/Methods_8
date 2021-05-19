package assignment8_methods;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	     
        
	     System.out.println("Enter your buy price: " );
	      int buyPrice= sc.nextInt();
	     System.out.println("Enter your sell price: ");
	      int sellPrice= sc.nextInt();
	      
	      System.out.println(c_profits(buyPrice,sellPrice));
  
	}
	public static String c_profits(int buyPrice, int sellPrice) {
		
		String profitCalculator;
		
		if(buyPrice<sellPrice) {
			profitCalculator="profit";
			
		}else if(sellPrice<buyPrice) {
		profitCalculator="loss";
		
	    }else {
		profitCalculator="no loss";
	    }
		
		return profitCalculator;
	}
	
   
}
