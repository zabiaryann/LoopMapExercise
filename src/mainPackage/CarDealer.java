package mainPackage;

import java.util.HashMap;
import java.util.Scanner;

public class CarDealer {

	public static void main(String[] args) {

		/* You are a car dealer. Create a hash map of vehicles.
		 * The model is the Key, the make is the Value.
		 * Ask the customer what car (model) they are looking for. Use the Hash Map 
		 * to determine 
		 * if you have that vehicle, and what make it is.
		 * (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over 
		 * here...")*/

		//creating hash map vehicles.

		HashMap<String, String> vehicles = new HashMap<>();
		vehicles.put("Oultander", "Mitsubishi");
		vehicles.put("Lx570", "Lexus");
		vehicles.put("MDX", "Honda");
		vehicles.put("Explorer", "Ford");
		vehicles.put("I335", "BMW");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Our Car Dealership!");

		do {
			System.out.print("\nWhat car model are you looking for?"
					+ " (Type 'exit' to quit): ");
			String model = scanner.nextLine();

			if (model.equalsIgnoreCase("exit")) {
				System.out.println("Thank you for visiting our car dealership!");
				break;
			}

			String make = vehicles.get(model);

			if (make != null) {
				System.out.println("Yay!, you're looking for a " + model + 
						"? Our " + make + " selection is right over here...");
			} else {
				System.out.println("I'm sorry, we don't have information on "
						+ "that model.");
			}

			System.out.print("Do you want to search for another car? (y/n): ");
			String response = scanner.nextLine();
			if (!response.equalsIgnoreCase("y")) {
				System.out.println("Thank you for visiting our car dealership!");
				break;
			}
		} while (true);

		scanner.close();



	}

}
