/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class SpinnerGame {
    public static void main ( String[] args ) {

        // Create a default object called Spinner
        Spinner spinner = new Spinner ();
        int sum = 0;
        int evenCount = 0;

        // This For Spin the Spinner three times
        for (int i = 0; i < 3; i++) {
            spinner.spin ();
            int value = spinner.getArrow ();
            // Add the value to the sum
            sum += value;

            if ( value % 2 == 0 ) {
                // Check if the spun number is even
                evenCount++;
            }
        }


        //Print the sum and even count
        System.out.println ( "Sum: " + sum );
        System.out.println ( "Even Count: " + evenCount );
    }
}
