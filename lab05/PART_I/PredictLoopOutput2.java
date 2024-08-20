/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
class PredictLoopOutput2 {
    public static void main (String [] args) {
        //Purpose of the code.
        System.out.println("Predict Loop Output-Problem 2:");
        //Message to the user
        System.out.println("The answer is: ");
        // Use a for loop to iterate from 1 to 9 (inclusive).
        for (int i = 1; i < 10; i++) {
            // Check if the current value of 'i' is even (divisible by 2).
            if (i % 2 == 0) {
                // If 'i' is even, print its value followed by a space.
                System.out.print(i + " ");
            }
    }
}
}
