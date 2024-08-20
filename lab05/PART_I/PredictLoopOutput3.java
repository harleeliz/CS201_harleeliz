/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class PredictLoopOutput3 {
    public static void main ( String[] args ) {


        /* Declaration of variables */
        double x = 1;
        double y = 1;
        int i = 0;


        //Purpose of the code.
        System.out.println("Predict Loop Output-Problem 3:");
        //Message to the user
        System.out.println("The answer is: ");

        /* Performing do-while loop */
        do {
            y = y / 2; //This line divides the y by 2
            x = x + y; //This line sums x plus y
            i++;  //This line increments the interactions
        } while (x < 1.8); //This line checks if the x is less than 1.8

        //This line just prints the output for the problem
        System.out.print(+i + " ");
    }
}