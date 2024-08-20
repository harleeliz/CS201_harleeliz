/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class BounceTest {
    public static void main(String[] args) {

        System.out.println("Test Case 1 - Constructors and toString");
        testDefaultConstructor();
        testConstructorGoodArgument();
        testConstructorBadArgument();

        System.out.println("\nTest Case 2 - setBouncePercentage and getTable");
        testPercentageTable();

        System.out.println("\nTest Case 3 - getTable with Invalid Arguments");
        testInvalidArguments();
    }

    // Test Case 1 - Constructors and toString
    public static void testDefaultConstructor() {
        Bounce p1 = new Bounce();

        System.out.println("EXPECTED RESULT: Bounce Percentage: 0.5");
        System.out.println("YOUR RESULT    : " + p1.toString());
        System.out.println("PASSED = " + p1.toString().equals("Bounce Percentage: 0.5"));
        System.out.println();
    }


    public static void testConstructorGoodArgument() {
        Bounce p1 = new Bounce(0.5);

        System.out.println("EXPECTED RESULT: Bounce Percentage: 0.5");
        System.out.println("YOUR RESULT    : " + p1.toString());
        System.out.println("PASSED = " + p1.toString().equals("Bounce Percentage: 0.5"));
        System.out.println();
    }


    public static void testConstructorBadArgument() {
        Bounce p1 = new Bounce(-1);

        System.out.println("EXPECTED RESULT: Bounce Percentage: 0.5");
        System.out.println("YOUR RESULT    : " + p1.toString());
        System.out.println("PASSED = " + p1.toString().equals("Bounce Percentage: 0.5"));
        System.out.println();
    }

    // Test Case 2 - setBouncePercentage and getTable
    public static void testPercentageTable() {
        Bounce p2 = new Bounce();
        p2.setBouncePercentage(0.8);

        System.out.println("EXPECTED RESULT: Bounce Percentage: 0.8");
        System.out.println("YOUR RESULT    : " + p2.toString());
        System.out.println("PASSED = " + p2.toString().equals("Bounce Percentage: 0.8"));
        System.out.println();
        String expectedTable = "0;100.000\n1;80.000\n2;64.000\n3;51.200\n4;40.960\n5;32.768\n";


        String actualTable = p2.getTable(100, 5);

        System.out.println("EXPECTED RESULT: " + expectedTable);
        System.out.println("YOUR RESULT    : " + actualTable);
        System.out.println("PASSED = " + actualTable.equals(expectedTable));
        System.out.println();
    }


    // Test Case 3 - getTable with Invalid Arguments
    public static void testInvalidArguments() {
        Bounce p3 = new Bounce();
        String expectedErrorMsg = "getTable invalid arguments";

        String result1 = p3.getTable(100, 0);
        System.out.println("EXPECTED RESULT: " + expectedErrorMsg);
        System.out.println("YOUR RESULT    : " + result1);
        System.out.println("PASSED = " + result1.equals(expectedErrorMsg));
        System.out.println();

        p3.setBouncePercentage(0.8);
        String result2 = p3.getTable(0, 5);

        System.out.println("EXPECTED RESULT: " + expectedErrorMsg);
        System.out.println("YOUR RESULT    : " + result2);
        System.out.println("PASSED = " + result2.equals(expectedErrorMsg));
    }
}