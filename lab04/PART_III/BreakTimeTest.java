/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class BreakTimeTest {
    public static void main(String[] args) {

        BreakTime p1 = new BreakTime(0,0,0);
        boolean a1 = p1.toString().equals("Weeks:0 Days:0 Hours:0");
        System.out.println("Test Case 1 - Default Constructor: " + a1);
        System.out.println("Expected Output: " + "Weeks:0 Days:0 Hours:0");
        System.out.println("Your Output:     " + p1.toString());
        System.out.println("PASSED= " + (p1.toString() ).equals ( "Weeks:0 Days:0 Hours:0") );
        System.out.println();

        BreakTime p2 = new BreakTime(1, 3, 12);
        boolean a2 = p2.toString().equals("Weeks:1 Days:3 Hours:12");
        System.out.println("Test Case 2 - Non-Default Constructor: " + a2);
        System.out.println("Expected Output: " + "Weeks:1 Days:3 Hours:12");
        System.out.println("Your Output:     " + p2.toString());
        System.out.println("PASSED= " + (p2.toString() ).equals ( "Weeks:1 Days:3 Hours:12") );
        System.out.println();

        BreakTime p2a = new BreakTime(-2, 3, 12);
        boolean a2a = p2a.toString().equals("Weeks:0 Days:3 Hours:12");
        System.out.println("Test Case 3 - Non-Default Constructor with Negative Weeks: " + a2a);
        System.out.println("Expected Output: " + "Weeks:0 Days:3 Hours:12");
        System.out.println("Your Output:     " + p2a.toString());
        System.out.println("PASSED= " + (p2a.toString() ).equals ( "Weeks:0 Days:3 Hours:12") );
        System.out.println();

        BreakTime p2b = new BreakTime(1, 8, 12);
        boolean a2b = p2b.toString().equals("Weeks:2 Days:1 Hours:12");
        System.out.println("Test Case 4 - Non-Default Constructor with Excessive Days: " + a2b);
        System.out.println("Expected Output: " + "Weeks:2 Days:1 Hours:12");
        System.out.println("Your Output:     " + p2b.toString());
        System.out.println("PASSED= " + (p2b.toString() ).equals ( "Weeks:2 Days:1 Hours:12") );
        System.out.println();

        BreakTime p2c = new BreakTime(1, 3, 25);
        boolean a2c = p2c.toString().equals("Weeks:1 Days:4 Hours:1");
        System.out.println("Test Case 5 - Non-Default Constructor with Excessive Hours: " + a2c);
        System.out.println("Expected Output: " + "Weeks:1 Days:4 Hours:1");
        System.out.println("Your Output:     " + p2c.toString());
        System.out.println("PASSED= " + (p2c.toString() ).equals ( "Weeks:1 Days:4 Hours:1") );
        System.out.println();

        p2.setDays(-1);
        boolean a2d = p2.toString().equals("Weeks:1 Days:0 Hours:12");
        System.out.println("Test Case 6 - Set Days to Negative: " + a2d);
        System.out.println("Expected Output: " + "Weeks:1 Days:0 Hours:12");
        System.out.println("Your Output:     " + p2.toString());
        System.out.println("PASSED= " + (p2.toString() ).equals ( "Weeks:1 Days:0 Hours:12") );
        System.out.println();

        p2.setHours(-1);
        boolean a2e = p2.toString().equals("Weeks:1 Days:0 Hours:0");
        System.out.println("Test Case 7 - Set Hours to Negative: " + a2e);
        System.out.println("Expected Output: " + "Weeks:1 Days:0 Hours:0");
        System.out.println("Your Output:     " + p2.toString());
        System.out.println("PASSED= " + (p2.toString() ).equals ( "Weeks:1 Days:0 Hours:0") );
        System.out.println();

        boolean test1Passed = a1 && a2 && a2a && a2b && a2c && a2d && a2e;

        BreakTime p3 = new BreakTime(1, 3, 12);
        boolean a3 = (p3.totalWeeks() == 1.5);
        System.out.println("Test Case 8 - Total Weeks: " + a3);


        BreakTime p4 = new BreakTime(0, 2, 6);
        boolean a4 = (p4.totalDays() == 2.25);
        System.out.println("Test Case 9 - Total Days: " + a4);

        BreakTime p5 = new BreakTime(1, 3, 5);
        boolean a5 = (p5.totalHours() == 245);
        System.out.println("Test Case 10 - Total Hours: " + a5);

        boolean a6 = (p3.compareTo(p4) > 0);
        System.out.println("Test Case 11 - CompareTo: " + a6);

        boolean a7 = (p4.compareTo(p5) < 0);
        System.out.println("Test Case 12 - CompareTo: " + a7);

        boolean a8 = (p3.compareTo(p3) == 0);
        System.out.println("Test Case 13 - CompareTo: " + a8);

        boolean test2Passed = a3 && a4 && a5 && a6 && a7 && a8;
        boolean allTestsPassed = test1Passed && test2Passed;

        System.out.println();
        System.out.println("All test cases passed: " + allTestsPassed);
    }
}
