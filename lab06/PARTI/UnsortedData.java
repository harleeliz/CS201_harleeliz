/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnsortedData {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputScanner = new Scanner(System.in);
        String fileName;
        int count;
        char repeat;
        int testCaseNumber = 1;

        do {
            System.out.print("Enter the name of the text file: ");
            fileName = inputScanner.nextLine();
            System.out.print("Enter the number of double values to read from the file: ");
            count = inputScanner.nextInt();

            double[] data = readDataFromFile(fileName, count);

            // Display test case header
            System.out.println("Test Case " + testCaseNumber + " - " + fileName);

            // Calculate and display out-of-position count before sorting
            int outOfPositionBefore = countOutOfPositionBeforeSort(data);
            System.out.println("Out-of-position count before sorting: " + outOfPositionBefore);

            // Sort the data using the bubble sort method
            bubbleSort(data);
            // Calculate and display out-of-position count after sorting
            int outOfPositionAfter = countOutOfPositionBeforeSort(data);
            System.out.println("Out-of-position count after sorting: " + outOfPositionAfter);

            System.out.println();

            System.out.print("Do you want to repeat the test case? (Y/N): ");
            inputScanner.nextLine(); // Consume the newline character
            repeat = inputScanner.nextLine().charAt(0);
            testCaseNumber++;
        } while (repeat == 'Y' || repeat == 'y');

        inputScanner.close();
        System.out.println();
    }

    // Method to count out-of-position elements before sorting
    public static int countOutOfPositionBeforeSort(double[] doubleBaseArray) {
        int outOfPositionCount = 0;
        for (int i = 0; i < doubleBaseArray.length; i++) {
            for (int j = i + 1; j < doubleBaseArray.length; j++) {
                if (doubleBaseArray[i] > doubleBaseArray[j]) {
                    outOfPositionCount++;
                }
            }
        }
        return outOfPositionCount;
    }

    // Method to perform the bubble sort
    public static void bubbleSort(double[] numbers) {
        boolean swapNumber = true; // Flag to track if any swaps are made in a pass

        while (swapNumber) { // Continue until no swaps are made in a pass
            swapNumber = false; // Assume no swaps at the beginning of a pass

            for (int i = 0; i < numbers.length - 1; ++i) {
                if (numbers[i] > numbers[i + 1]) {
                    swapNumber = true; // Set the flag to true, indicating a swap is needed
                    double temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp; // Swap the elements
                }
            }
        }
    }

    // Method to read data from a file
    public static double[] readDataFromFile(String fileName, int count) throws FileNotFoundException {
        double[] data = new double[count];
        Scanner fileScanner = new Scanner(new File(fileName));
        int i = 0;

        while (fileScanner.hasNext() && i < count) {
            data[i] = fileScanner.nextDouble();
            i++;
        }

        fileScanner.close();
        return data;
    }
}