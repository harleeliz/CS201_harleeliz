/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class PredictLoopOutput6 {
    public static void main(String[] args) {
        //Purpose of the code.
     System.out.println("Predict Loop Output-Problem 6:");
        //Message to the user
        System.out.println("The answer is: ");
        // The For loop to iterate from 1 to 9.
        for (int i = 1; i < 10; i++) {
            // Check if 'i' is an odd number by using the modulo operator (%).
            if (i % 2 == 1) {
                // If 'i' is odd, print its value followed by a space.
                System.out.print(i + " ");
            }
        }
}
}