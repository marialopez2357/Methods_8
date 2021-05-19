package assignment8_methods;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the amount of water you have used:");
		double amount= sc.nextDouble();
		System.out.println("According to the amount of used water: " + amount + "L  -> your bill is: " + WaterTax(amount) + "$");
		
	}
	public static double WaterTax(double amount) {
		
		double bill=0;
		if(amount<=50) {
			bill= amount*0.60;
		}else if(amount>50 && amount<=100) {
			bill=amount*0.90;
		}else if(amount>100 && amount<=150) {
			bill= (amount*0.90)+50;
		}else if(amount>150) {
			bill= (amount*0.90)+100;
		}
		return bill;
	}

}
