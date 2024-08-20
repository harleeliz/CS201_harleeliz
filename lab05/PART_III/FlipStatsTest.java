/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
import java.util.Random;

public class FlipStatsTest {
    public static void main(String[] args) {
        // Test 1
        int[] flips1 = new int[100];
        Random rand1 = new Random(123456789);
        for (int i = 0; i < flips1.length; i++) {
            flips1[i] = rand1.nextInt(2);
        }
        FlipStats analyzer1 = new FlipStats(flips1);
        int result1 = analyzer1.firstRun(0, 3);
        System.out.println("result1 = " + result1);

        // Test 2
        int[] flips2 = new int[100];
        Random rand2 = new Random(5555555);
        for (int i = 0; i < flips2.length; i++) {
            flips2[i] = rand2.nextInt(2);
        }

        FlipStats analyzer2 = new FlipStats(flips2);
        int result2 = analyzer2.firstRun(1, 2);
        System.out.println("result2 = " + result2);

        boolean a1 = result1 == 64;
        boolean a2 = result2 == 12;

        if (a1 && a2) {
            System.out.println("All tests passed.");
        } else {
            System.out.println("Some tests failed.");
        }
    }
}
