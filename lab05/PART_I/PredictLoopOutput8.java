/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class PredictLoopOutput8 {

    public static void main (String []args){
        System.out.println("Predict Loop Output-Problem 8:");
        System.out.println("The answer is: ");
        // Initialize variables
        double x = 1;    // Initialize 'x' to 1
        double y = 1;    // Initialize 'y' to 1
        int i = 0;       // Initialize 'i' to 0

        // Perform a while loop as long as 'y' is less than or equal to 1.5
        while (y <= 1.5) {
            x = x / 2;   // Divide 'x' by 2 in each iteration
            y = x + y;   // Update 'y' by adding 'x' to it
            i++;         // Increment 'i' by 1 in each iteration
        }

        // Print the final value of 'i'
        System.out.print(i + " ");
        }
    }


