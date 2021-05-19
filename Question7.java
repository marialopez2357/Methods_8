package assignment8_methods;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
	
		palindrome(1271);

	}
	public static void palindrome(int num) {
		
		int firstNum= num;
		int reverse=0;
		int remind;
		
	//	System.out.println(firstNum);
		
				
		while(num>0) {
			remind=num%10;
			reverse= (reverse*10)+remind;
			num/=10;
		}
	//	System.out.println(reverse);
		
		if(reverse==firstNum) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		}
		
	}

