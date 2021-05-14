package main;

import java.util.Scanner;

public class Converter {
	
	private static void getQuantity(int unitName){
		Scanner q = new Scanner(System.in);
		double userInput = q.nextDouble();
		
		if(userInput >= 0) {
			switch (unitName) {
			case 1:
				double convertedUnit1 = userInput/16;
				System.out.println(userInput + " Tablespoon(s) is equivalent to " + convertedUnit1 + " Cup(s)/n");
				break;
			case 2:
				double convertedUnit2 = userInput/8;
				System.out.println(userInput + " Cups(s) is equivalent to " + convertedUnit2 + " Ounce(s)/n");
				break;
			case 3:
				double convertedUnit3 = userInput/3.281;
				System.out.println(userInput + " Feet is equivalent to " + convertedUnit3 + " Meter(s)/n");
				break;
			case 4:
				double convertedUnit4 = userInput*1.609;
				System.out.println(userInput + " Mile(s) is equivalent to " + convertedUnit4 + " Kilometer(s)/n");
				break;
	
			default:
				System.out.println("Please try again");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int menuSelection = 0;
		
		while (menuSelection != 5) {
			System.out.println("1) Tablespoons to Cups\n"
					+ "2) Cups to Ounces\n"
					+ "3) Feet to Meters\n"
					+ "4) Miles to Kilometers\n"
					+ "5) Quit");
			System.out.print("Choose one of the options: ");
			
			Scanner scanner = new Scanner(System.in);
			
			
			switch (scanner.nextInt()) {
				case 1:
					System.out.println("How many Tablespoons would you like to convert?");
					getQuantity(1);
					break;
				case 2:
					System.out.println("How many Tablespoons would you like to convert?");
					getQuantity(2);
					break;
				case 3:
					System.out.println("How many Tablespoons would you like to convert?");
					getQuantity(3);
					break;
				case 4:
					System.out.println("How many Tablespoons would you like to convert?");
					getQuantity(4);
					break;
				case 5:
					System.out.println("Thank you and goodbye!");
					break;
				default:
					System.out.println("Please select one of the 5 options");
					break;
			}
		}
	}
}
