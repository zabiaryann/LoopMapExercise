package mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHW {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			do {
				ArrayList<Integer> numbers = new ArrayList<>();

				System.out.println("\nEnter 5 numbers:");
				System.out.println("----------------");

				for (int i = 0; i < 5; i++) {
					System.out.print("Enter number " + (i + 1) + ": ");
					int num = scan.nextInt();
					numbers.add(num);
				}

				// Now calculate the sum, product, largest, and smallest
				int sum = 0;
				int product = 1; // multiplying by zero yields zero
				int smallest = Integer.MAX_VALUE;
				int largest = Integer.MIN_VALUE;

				for (int num : numbers) {
					sum += num;
					product *= num;
					if (num > largest) {
						largest = num;
					}
					if (num < smallest) {
						smallest = num;
					}
				}

				// Display the results
				System.out.println("\nHere is the result:");
				System.out.println("Sum is: " + sum);
				System.out.println("Product is: " + product);
				System.out.println("Largest is: " + largest);
				System.out.println("Smallest is: " + smallest);

				// Ask the user if they want to continue
				System.out.print("\nDo you want to enter another set of numbers? (y/n): ");
			} while (scan.next().equalsIgnoreCase("y"));
		}
	}
}
