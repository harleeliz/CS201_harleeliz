/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.util.Scanner; // Import the Scanner class for user input

public class CurrentNumberScanner {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); // Create a Scanner object for user input

    // Provide instructions to the user
    System.out.println("Question 3 – currentNumber\n" +
            "Add statements containing a logical expression that will:\n" +
            "If currentNumber is odd, change currentNumber value so that it is now " +
            "3 times currentNumber, then add 1, otherwise change the sign of currentNumber.");
    System.out.println();

    // Prompt the user to enter a number
    System.out.print("Please insert the number that you want to validate: ");
    int currentNumber = in.nextInt(); // Read an integer from the user

    // Check if the absolute value of currentNumber is odd
    if (Math.abs(currentNumber) % 2 == 1) {
      // If it's odd, update currentNumber as per the given instructions
      currentNumber = 3 * currentNumber + 1;
    } else {
      // If it's even, change the sign of currentNumber
      currentNumber = -1 * currentNumber;
    }

    // Display the final result
    System.out.println("The answer is: " + currentNumber);
  }
}

