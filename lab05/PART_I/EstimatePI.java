/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
import java.util.Random;
import java.util.Scanner;

public class EstimatePI {
    // Create a Random object with a seed for generating random numbers
    public static Random myRandomGenerator = new Random(123456789);

    public static void main(String[] args) {
        System.out.println("2e - Write a method or program requiring iteration (EstimatePI)");
        System.out.println();

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of trials: ");
        int numTrials = scanner.nextInt();

        // Call the estimatePI method to calculate an estimate of PI
        double piEstimate = estimatePI(numTrials);
        System.out.println("Estimated value of PI: " + piEstimate);

        // Close the Scanner to release resources
        scanner.close();
    }

    public static double estimatePI(int numTrials) {
        int hits = 0;

        // Perform the specified number of trials
        for (int i = 0; i < numTrials; i++) {
            // Generate random x and y values in the range [-1, 1]
            double x = -1 + 2 * myRandomGenerator.nextDouble();
            double y = -1 + 2 * myRandomGenerator.nextDouble();

            // Check if the generated point is inside the unit circle
            if (x * x + y * y <= 1) {
                hits++; // If inside, increment the count of hits
            }
        }

        // Calculate and return an estimate of PI using the hits and total trials
        return 4.0 * hits / numTrials;
    }
}