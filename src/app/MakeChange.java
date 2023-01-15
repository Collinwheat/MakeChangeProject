package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the cost of items");
		double cost = input.nextDouble();
		input.nextLine();

		System.out.println("Please enter amount given to the register");
		double amtGiven = input.nextDouble();
		input.nextLine();

		input.close();

		double change = amtGiven - cost;
		
		int numOfDollars = (int) change;
		
		int numOfCents = (int) (100 * (change - numOfDollars));

		System.out.println("Total Change due: " + (change));

		if (change < 0) {
			System.out.println("Insufficient Funds");
		}
		if (change > 0) {
			printDollars(numOfDollars, numOfCents);
			
		}

	}

	public static void printDollars(int dollars, int cents) {
		
		int numOfTwenties = dollars / 20;
		dollars = dollars % 20;
		int numOfTens = dollars / 10;
		dollars = dollars % 10;
		int numOfFives = dollars / 5;
		dollars = dollars % 5;
		int numOfOnes = dollars / 1;
		dollars = dollars % 1;
		int numOfQuarters = cents / 25;
		cents = cents % 25;
		int numOfDimes = cents / 10;
		cents = cents % 10;
		int numOfNickles = cents / 5;
		cents = cents % 5;
		int numOfPennies = cents / 1;
		
		if (numOfTwenties > 0) {
			System.out.println("$20's : " + numOfTwenties);
		}
		if (numOfTens > 0) {
			System.out.println("$10's : " + numOfTens);
		}
		if (numOfFives > 0) {
			System.out.println("$5's : " + numOfFives);
		}
		if (numOfOnes > 0) {
			System.out.println("$1's : " + numOfOnes);
		}
		if (numOfQuarters > 0) {
			System.out.println("Quarters : " + numOfQuarters);
		}
		if (numOfDimes > 0) {
			System.out.println("Dimes : " + numOfDimes);
		}
		if (numOfNickles > 0) {
			System.out.println("Nickles : " + numOfNickles);
		}
		if (numOfPennies > 0) {
			System.out.println("Pennies : " + numOfPennies);
		}
		

	}
	
}
