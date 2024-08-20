/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class DieTest {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die(3);

        boolean a1 = d1.getSide() >= 1 && d1.getSide() <= 6 && d2.getSide() == 3;
        d1.setSide(6);
        d2.setSide(2);
        boolean a2 = d1.getSide() == 6 && d2.getSide() == 2;
        boolean a3 = d1.toString().equals("Die=6") && d2.toString().equals("Die=2");

        int[] data = {0, 0, 0, 0, 0, 0};
        Die d3 = new Die();
        for (int i = 1; i <= 1000000; i++) {
            d3.roll();
            data[d3.getSide() - 1]++;
        }
        boolean a4 = true;
        for (int i = 0; i < 6; i++) {
            if (data[i] < 133333 || data[i] > 199999) {
                a4 = false;
            }
        }
        System.out.println("Test Case 1 - DieTest");
        System.out.println(a1 && a2 && a3);
        System.out.println(a4);
    }
}
