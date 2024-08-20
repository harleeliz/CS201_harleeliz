/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */


//Java standard library and is used to generate random numbers.
import java.util.Random;

public class Die {

    //Instance global variables declaration
    private int sideUp;


    //Global default variables declaration
    private static final int NUM_SIDES = 6, DEFAULT_INITIAL_SIDE = 1;


    // Default Constructor: Sets sideUp to 1 (the default)
    public Die() {
        sideUp = DEFAULT_INITIAL_SIDE;
    }


    /* Method Die
        * @param initialSide  new value for initialSide
        * Perform an if statement to check if isValidSide is true/equal to initialSide, if that is true sideUp  takes the
        value of the parameter. In the other hand, a false will represent that the method throws an IllegalArgumentException.
        * This is done with the throw statement, and it provides a descriptive error message: "Invalid side for the die." */
    public Die(int initialSide) {
        if (isValidSide(initialSide)) {
            sideUp = initialSide;
        } else {
            throw new IllegalArgumentException("Invalid initial side for the die.");
        }
    }

    // Accessor method getSide --> returns sideUp
    public int getSide() {

        return sideUp;
    }


    /* Helper method isValidSide (private)
     * Created to check if a side is valid, this returns true or false */
    private boolean isValidSide(int side) {
        return side >= 1 && side <= NUM_SIDES;
    }

    /* Mutator method  setSide
     * @param newSide   new value for side
     * Perform an if statement to check if isValidSide is true/equal to newSide, if that is true sideUp  takes the
     value of the parameter. In the other hand, a false will represent that the method throws an IllegalArgumentException.
     * This is done with the throw statement, and it provides a descriptive error message: "Invalid side for the die." */
    public void setSide(int newSide) {
        if (isValidSide(newSide)) {
            sideUp = newSide;
        } else {
            throw new IllegalArgumentException("Invalid side for the die.");
        }
    }


    /* Method roll (public)
    * Applies the library random by creating the object rand.
    * Then rand.nextInt(NUM_SIDES) is used to generate a random integer between 0 and NUM_SIDES - 1
    * However it will always change when it's performed*/
    public void roll() {
        Random rand = new Random();
        sideUp = rand.nextInt(NUM_SIDES) + 1;
    }


    /*Method toString
     * @return String
     * returns date Die and sideUp*/
    public String toString() {
        return "Die=" + sideUp;
    }

}
