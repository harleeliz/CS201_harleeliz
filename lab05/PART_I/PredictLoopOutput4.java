/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class PredictLoopOutput4 {
    public static void main ( String[] args ) {

        /* Declaration of variables */
    double x = 1;
    double y = 1;
    int i = 0;


        //Purpose of the code.
        System.out.println("Predict Loop Output-Problem 4:");
        //Message to the user
        System.out.println("The answer is: ");

        /* Performing while loop until the value of y is higher or equal than 1.5 */
    while (y >= 1.5) {
        x = x / 2; //This line divides the y by 2
        y = x + y; //This line sums x plus y
        i++;  //This line increments the interactions
    }

        //This line just prints the output for the problem
        System.out.println(i + " ");
}
}
