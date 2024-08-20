/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class PlayerTest {
    public static void main(String[] args) {
        System.out.println("Test Case 1 - Testing non-default constructor 1 and toString");
        Player p1 = new Player("Bob Smith", 3, 9, 258);
        System.out.println("EXPECTED RESULT: Name:Bob Smith Fruits:3 Ghosts:9 Time:258");
        System.out.println("YOUR RESULT    : " + p1.toString());
        System.out.println("PASSED=" + p1.toString().equals("Name:Bob Smith Fruits:3 Ghosts:9 Time:258") + "\n");

        System.out.println("Test Case 2 - Testing non-default constructor 2 and toString");
        Player p2 = new Player("Mary Smith", "112,12,812");
        System.out.println("EXPECTED RESULT: Name:Mary Smith Fruits:112 Ghosts:12 Time:812");
        System.out.println("YOUR RESULT    : " + p2.toString());
        System.out.println("PASSED=" + p2.toString().equals("Name:Mary Smith Fruits:112 Ghosts:12 Time:812") + "\n");

        System.out.println("Test Case 3 - Testing powerRating");
        Player p3 = new Player("Bob Smith", 3, 9, 258);
        System.out.println("EXPECTED RESULT: 0.29069767441860467");
        System.out.println("YOUR RESULT    : " + p3.powerRating());
        System.out.println("PASSED=" + (p3.powerRating() == 0.29069767441860467));

        Player p4 = new Player("Mary Smith", "112,12,812");
        System.out.println("EXPECTED RESULT: 1.4532019704433496");
        System.out.println("YOUR RESULT    : " + p4.powerRating());
        System.out.println("PASSED=" + (p4.powerRating() == 1.4532019704433496) + "\n");

        boolean result = p1.toString().equals("Name:Bob Smith Fruits:3 Ghosts:9 Time:258")
                && p2.toString().equals("Name:Mary Smith Fruits:112 Ghosts:12 Time:812")
                && p3.powerRating() == 0.29069767441860467
                && p4.powerRating() == 1.4532019704433496;

        System.out.println("All test cases passed: " + result);
    }
}

