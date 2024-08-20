/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class FindLargest {
    public static void main(String[] args) {
        // Check if the number of command-line arguments is not equal to 3
        if (args.length != 3) {
            System.out.println("Please provide exactly three numbers as command-line arguments.");
            return; // Exit the program if the argument count is not 3
        }

        // Parse the arguments as doubles
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        // Assume the first number x is the largest
        double largest = x;

        // Check if y is larger than the current largest
        if (y > largest) {
            largest = y; // If yes, update the largest to y
        }

        // Check if z is larger than the current largest
        if (z > largest) {
            largest = z; // If yes, update the largest to z
        }

        // Print the largest number among the three provided as arguments
        System.out.println(largest);
    }
}

