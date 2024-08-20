
/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTIII;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TempStats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0, countBig = 0;
        double sum = 0, average;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("How many temperatures do you have to enter? ");
                count = in.nextInt();
                if (count > 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                in.nextLine(); // Clear the input buffer
            }
        }

        double temps[] = new double[count];

        for (int i = 0; i < count; i++) {
            boolean validTemperature = false;
            int j = i + 1;

            while (!validTemperature) {
                try {
                    System.out.print("Enter temp #" + j + ": ");
                    temps[i] = in.nextDouble();
                    sum = sum + temps[i];
                    validTemperature = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid temperature.");
                    in.nextLine(); // Clear the input buffer
                }
            }
        }

        average = sum / count;
        System.out.println("\nThe average temp is: " + average);

        for (int i = 0; i < count; i++) {
            if (temps[i] > average) {
                countBig++;
            }
        }

        System.out.println("There are " + countBig + " temps larger than the average.");
    }
}
