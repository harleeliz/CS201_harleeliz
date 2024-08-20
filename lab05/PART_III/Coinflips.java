/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.util.*;

public class Coinflips {
	public static void main(String[] args) {

		// This line is the name of the program
		System.out.println("Question 2 – Coinflips");

		while (true) {
			// Prompt the user to input a series of coin flips.
			System.out.print("\nInput the series of coin flips:");
			Scanner user_input_text = new Scanner(System.in);
			String data = user_input_text.next();
			char[] d = new char[data.length()];

			// Store the input as an array of characters.
			for (int i = 0; i < data.length(); i++) {
				d[i] = data.charAt(i);
			}

			// Call the function to find the longest head run and print the result.
			System.out.println(longestHeadRun(d));

			// Ask the user if they want to continue.
			System.out.print("\n Do you want to continue (Y/N)? ");
			char choice = user_input_text.next().charAt(0);

			// If the user's choice is not 'Y' or 'y', exit the loop, using break.
			if (choice != 'Y' && choice != 'y') {
				break;
			}
		}
	}

	// Function to find the length of the longest consecutive 'H' run.
	public static int longestHeadRun(char[] data) {
		int longestRun = 0;
		int currentRun = 0;

		// Loop through the array of coin flips.
		for (char flip : data) {
			if (flip == 'H') {
				// If the flip is 'H', increment the current run count.
				currentRun++;
			} else {
				// If it's not 'H', reset the current run.
				currentRun = 0;
			}

			// Update the longest run if the current run is longer.
			if (currentRun > longestRun) {
				longestRun = currentRun;
			}
		}
		// Return the length of the longest 'H' run.
		return longestRun;
	}
}
