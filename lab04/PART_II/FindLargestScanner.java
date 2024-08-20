/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.util.Scanner;

public class FindLargestScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Creation a Scanner object for user input

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double x = in.nextDouble(); // Read the first number from the user
        System.out.print("Enter the second number: ");
        double y = in.nextDouble(); // Read the second number from the user
        System.out.print("Enter the third number: ");
        double z = in.nextDouble(); // Read the third number from the user

        double largest = x; // Assume the first number (x) is the largest

        // Check if y is larger than the current largest
        if (y > largest) {
            largest = y; // If yes, update the largest to y
        }

        // Check if z is larger than the current largest
        if (z > largest) {
            largest = z; // If yes, update the largest to z
        }

        // Print the largest number among the three provided by the user
        System.out.println("The largest number is: " + largest);
    }
}
