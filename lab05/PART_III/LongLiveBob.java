/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.util.Scanner;

public class LongLiveBob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read a single line of comma-delimited valid locations
        System.out.print("Enter a comma-delimited sequence of valid locations: ");
        String inputLocations = scanner.nextLine();

        //BobsLife object
        BobsLife bob = new BobsLife("home", 0, 4, 5);

        //Split the input line to get an array of valid locations
        String[] validLocations = inputLocations.split(",");

        int i = 0;
        boolean keepBobAlive = true;

        //Initialize a loop that iterates up to 50 times
        while (( i < 50 ) && keepBobAlive) {
            //Iterate through the array of valid locations
            for (String location : validLocations) {
                //Move Bob to the current location
                bob.move(location.trim());

                //Check Bob's status
                String status = bob.getStatus();

                //If Bob's status is "in jail" or "deceased," break out of the loop
                if ( "deceased".equals ( status ) ) {
                    keepBobAlive = false;
                    break;
                }
                else if ( "in jail".equals ( status ) ) {
                    keepBobAlive = false;
                    break;
                }
            }
            i++;
        }

        // Output Bob's status
        System.out.println(bob.toString());

    }
}