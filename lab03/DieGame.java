/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class DieGame {
    public static void main(String[] args) {
        Die d = new Die();
        int sum = 0;
        int oddCount = 0;

        for (int i = 0; i < 3; i++) {
            d.roll();
            sum += d.getSide();
            oddCount += d.getSide() % 2;
        }
        System.out.println("3A - Using a User Defined Class – Die");
        System.out.println("Random output will be generated");
        System.out.println();
        System.out.println("Sum of rolls: " + sum);
        System.out.println("Number of odd rolls: " + oddCount);
    }
}