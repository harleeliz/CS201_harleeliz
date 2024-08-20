/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class PredictLoopOutput7 {
    public static void main (String []args){
        //Purpose of the code.
        System.out.println("Predict Loop Output-Problem 7:");
        //Message to the user
        System.out.println("The answer is: ");

        // Initialize two double variables, x and y, both with an initial value of 1.
        double x = 1;
        double y = 1;
        int i = 0; // Initialize an integer variable i with an initial value of 0.
        // Start a do-while loop that continues until the value of 'x' is less than 1.75.
        do {
            y = y / 2;// Divide the value of 'y' by 2.
            x = x + y;// Add the current value of 'y' to 'x'.
            i++;// Increment the value of 'i' by 1 in each iteration.
        } while (x < 1.75); // The loop condition checks if 'x' is less than 1.75.

        // Print the final value of 'i' after the loop exits.
        System.out.print(i + " ");
    }
}

