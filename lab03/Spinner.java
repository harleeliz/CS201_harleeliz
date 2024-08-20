/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
import java.util.Random;

public class Spinner {

    //Instance global variables declaration
    private int size, arrow;

    //Global default variables declaration
    public static final int DEFAULT_SIZE = 10, DEFAULT_ARROW_LOCATION = 0;

    // Default constructor
    public Spinner() {
        this.size = DEFAULT_SIZE;
        this.arrow = DEFAULT_ARROW_LOCATION;
    }

    // Constructor with user-specified size
    public Spinner(int size) {
        this.size = size;
        this.arrow = DEFAULT_ARROW_LOCATION;
    }

    // Accessor method for getting the arrow location
    public int getArrow() {
        return this.arrow;
    }

    // Accessor method for getting the size of the spinner
    public int getSize() {
        return this.size;
    }

    // Mutator method for setting the arrow location
    public void setArrow(int arrow) {
        if (arrow >= 0 && arrow < size) {
            this.arrow = arrow;
        }
    }

    // Method to spin the spinner randomly
    public void spin() {
        Random random = new Random();
        this.arrow = random.nextInt(this.size);
    }

    /*Method toString
     * @return String
     * returns size and arrow*/
    @Override
    public String toString() {
        return "Size=" + this.size + " Arrow=" + this.arrow;
    }
}
