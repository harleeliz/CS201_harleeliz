/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class ThreeDigitsReverseTest {
    public static void main(String[] args) {
            System.out.println("Test Case 1 - no zero digits");
            ThreeDigitsReverse p1 = new ThreeDigitsReverse (123);
            System.out.println("EXPECTED RESULT: 321");
            System.out.println("YOUR RESULT    : " + p1.reverseDigits());
            System.out.println("PASSED = " + p1.reverseDigits().equals("321") + "\n");

            System.out.println("Test Case 2 - trailing 0 digit");
            ThreeDigitsReverse p2 = new ThreeDigitsReverse (450);
            System.out.println("EXPECTED RESULT: 054");
            System.out.println("YOUR RESULT    : " + p2.reverseDigits());
            System.out.println("PASSED = " + p2.reverseDigits().equals("054") + "\n");

            System.out.println("Test Case 3 - two trailing zeros");
            ThreeDigitsReverse p3 = new ThreeDigitsReverse (800);
            System.out.println("EXPECTED RESULT: 008");
            System.out.println("YOUR RESULT    : " + p3.reverseDigits());
            System.out.println("PASSED = " + p3.reverseDigits().equals("008") + "\n");

            System.out.println("Test Case 4 - identical digits");
            ThreeDigitsReverse p4 = new ThreeDigitsReverse (777);
            System.out.println("EXPECTED RESULT: 777");
            System.out.println("YOUR RESULT    : " + p4.reverseDigits());
            System.out.println("PASSED = " + p4.reverseDigits().equals("777") + "\n");
        }

}