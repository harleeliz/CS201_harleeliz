/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class PredictLoopOutput1 {
    public static void main(String[] args) {
        //Purpose of the code.
        System.out.println("Predict Loop Output-Problem 1:");
        //Message to the user
        System.out.println("The answer is: ");

        // Use a for loop to iterate from 1 to 9 with a step of 2.
        for (int i = 1; i < 10; i += 2) {
            // Inside the loop, print the current value of 'i' followed by a space.
            System.out.print(i + " ");
        }
    }
}