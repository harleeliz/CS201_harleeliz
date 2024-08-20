/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class PredictLoopOutput5 {

    public static void main(String[] args) {
//Purpose of the code.
        System.out.println("Predict Loop Output-Problem 5:");
        //Message to the user
        System.out.println("The answer is: ");

        /* Start a for loop with 'i' initialized to 2.
        *The loop will run as long as 'i' is less than 10.
        * In each iteration, 'i' is incremented by 2. */
        for (int i = 2; i < 10; i += 2) {
            // Inside the loop, print the current value of 'i' followed by a space.
            System.out.print(i + " ");
        }
}
}
