/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class FindLargestTest {
    public static void main(String[] args) {
        // Test Case 1 - x < y < z
        testFindLargest(new String[]{"1", "2", "3"}, 3.0);

        // Test Case 2 - y < x < z
        testFindLargest(new String[]{"2", "1", "3"}, 3.0);

        // Test Case 3 - x < z < y
        testFindLargest(new String[]{"1", "3", "2"}, 3.0);

        // Test Case 4 - y < z < x
        testFindLargest(new String[]{"3", "1", "2"}, 3.0);

        // Test Case 5 - z < y < x
        testFindLargest(new String[]{"3", "2", "1"}, 3.0);

        // Test Case 6 - z < x < y
        testFindLargest(new String[]{"2", "3", "1"}, 3.0);
    }

    private static void testFindLargest(String[] inputArgs, double expectedOutput) {
        System.out.print("Input: ");
        for (String arg : inputArgs) {
            System.out.print(arg + " ");
        }
        System.out.println();

        FindLargest.main(inputArgs); // Call the FindLargest class's main method

        double result = Double.parseDouble(inputArgs[0]); // Initialize result with the first input
        for (String arg : inputArgs) {
            double num = Double.parseDouble(arg);
            if (num > result) {
                result = num;
            }
        }

        System.out.println("Expected Output: " + expectedOutput);
        System.out.println("Your Output:     " + result);
        System.out.println("PASSED= " + (result == expectedOutput ? "true" : "false"));
        System.out.println();
    }
}
