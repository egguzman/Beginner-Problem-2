package beg_prob2;

import java.util.Scanner;


public class multiple {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		//Ask the user to enter a number. Print whether it is a multiple of 5 or not.
		
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		//checks if the number is multiple of 5
		
		//I USED MODULUS % TO CHECK IF THERE IS A REMAINDER
		if (number % 5 == 0) {
			System.out.println(number + " is a multiple of 5");
			
			
			
		}
		//if not prints not multiple of 5.
		else {
			System.out.println(number + " is not a multiple of 5.");
		}
		
		
		input.close();

	}

}
