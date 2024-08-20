/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class FootballLeagueTest {
    public static void main(String[] args) {
        testPeewee();
        testMiddle();
        testMax();
    }

    private static void testPeewee() {
        System.out.println("Test Case 1 - age 12, weight 90");
        testFootballLeague(12, 90, "Peewee");

        System.out.println("Test Case 2 - age 12, weight 110");
        testFootballLeague(12, 110, "Peewee");

        System.out.println("Test Case 3 - age 14, weight 99");
        testFootballLeague(14, 99, "Peewee");
    }

    private static void testMiddle() {
        System.out.println("Test Case 4 - age 14, weight 110");
        testFootballLeague(14, 110, "Middle");
    }

    private static void testMax() {
        System.out.println("Test Case 5 - age 15, weight 110");
        testFootballLeague(15, 110, "Max");

        System.out.println("Test Case 6 - age 14, weight 165");
        testFootballLeague(14, 165, "Max");
    }

    private static void testFootballLeague(int age, double weight, String expected) {
        System.out.println(age + " " + weight + ".");
        FootballLeague.main(new String[] { String.valueOf(age), String.valueOf(weight) });
        System.out.println("Expected: " + expected);
        System.out.println();
    }
}
