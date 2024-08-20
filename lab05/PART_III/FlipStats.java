/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
import java.util.Arrays;

public class FlipStats {
    private int[] flips; // Array to store the sequence of coin flips

    // Constructor that initializes the flips array with a deep copy of the input array
    public FlipStats(int[] flips) {
        this.flips = Arrays.copyOf(flips, flips.length);
    }

    // Method to find the index of the start of the first run of a given side and length
    public int firstRun(int side, int length) {
        int count = 0; // Counter to keep track of the current run length
        for (int i = 0; i < flips.length; i++) {
            if (flips[i] != side) {
                count = 0; // Reset the count if the side doesn't match
            } else { // If the current flip matches the desired side
                count++; // Increment the run length
                if (count == length) {
                    return i - length + 1; // Return the index of the start of the run
                }
            }
        }
        return -1; // Return -1 if the run is not found
    }
}
