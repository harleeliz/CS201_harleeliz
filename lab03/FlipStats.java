/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */

import java.util.Arrays;
import java.util.Random;

public class FlipStats {
    private int[] flips;

    public FlipStats(int[] flips) {
        this.flips = Arrays.copyOf(flips, flips.length);
    }

    public int firstRun(int side, int length) {
        int count = 0;
        for (int i = 0; i < flips.length; i++) {
            if (flips[i] == side) {
                count++;
                if (count == length) {
                    return i - length + 1; // Index of the start of the run
                }
            } else {
                count = 0; // Reset the count if the side doesn't match
            }
        }
        return -1; // Run not found
    }

    public static void main(String[] args) {
        int[] flips1 = new int[100];
        Random rand1 = new Random (123456789);
        for (int i = 0; i < flips1.length; i++) {
            flips1[i] = rand1.nextInt(2);
        }
        FlipStats analyzer1 = new FlipStats(flips1);
        boolean a1 = analyzer1.firstRun(0, 3) == 64;

        int[] flips2 = new int[100];
        Random rand2 = new Random(5555555);
        for (int i = 0; i < flips2.length; i++) {
            flips2[i] = rand2.nextInt(2);
        }
        FlipStats analyzer2 = new FlipStats(flips2);
        boolean a2 = analyzer2.firstRun(1, 5) == -1;

        System.out.println(a1 && a2);

        int[] flips3 = new int[100];
        for (int i = 0; i < flips3.length; i++) {
            flips3[i] = rand1.nextInt(2);
        }
        FlipStats analyzer3 = new FlipStats(flips3);
        int result1 = analyzer3.firstRun(1, 2);
        System.out.println(result1); // Should print 6
    }
}
