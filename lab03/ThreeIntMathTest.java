/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */

public class ThreeIntMathTest {
    public static void main(String[] args) {
        System.out.println("Test Case 1 - polynomial");
        ThreeIntMath p1 = new ThreeIntMath(1, 2, 3);
        System.out.println("EXPECTED RESULT: 123.0");
        System.out.println("YOUR RESULT    : " + p1.polynomial(10));
        System.out.println("PASSED=" + (p1.polynomial(10) == 123) + "\n");

        System.out.println("Test Case 2 - maximum");
        ThreeIntMath p2 = new ThreeIntMath(1, 2, 3);
        System.out.println("EXPECTED RESULT: 3");
        System.out.println("YOUR RESULT    : " + p2.maximum());
        System.out.println("PASSED=" + (p2.maximum() == 3));

        ThreeIntMath p3 = new ThreeIntMath(3, 2, 1);
        System.out.println("EXPECTED RESULT: 3");
        System.out.println("YOUR RESULT    : " + p3.maximum());
        System.out.println("PASSED=" + (p3.maximum() == 3));

        ThreeIntMath p4 = new ThreeIntMath(1, 3, 2);
        System.out.println("EXPECTED RESULT: 3");
        System.out.println("YOUR RESULT    : " + p4.maximum());
        System.out.println("PASSED=" + (p4.maximum() == 3) + "\n");



        /* Test case 3 where the quadratic of (1, 2, 1) is required shows an expected result of (-1, -1),
        however this in incorrect given that the correct result is (-1).
        Please refer to this website in order to try the values (1,2,1)
        https://www.calculatorsoup.com/calculators/algebra/quadratic-formula-calculator.php */
        System.out.println("Test Case 3 - quadratic");
        ThreeIntMath p5 = new ThreeIntMath(1, 2, 1);
        System.out.println("EXPECTED RESULT: -1.0");
        System.out.println("YOUR RESULT    : " + p5.quadratic());
        System.out.println("PASSED=" + p5.quadratic().equals("-1.0"));

        ThreeIntMath p6 = new ThreeIntMath(1, 2, -3);
        System.out.println("EXPECTED RESULT: 1.0 -3.0");
        System.out.println("YOUR RESULT    : " + p6.quadratic());
        System.out.println("PASSED=" + p6.quadratic().equals("1.0 -3.0"));

        ThreeIntMath p7 = new ThreeIntMath(1, 0, -1);
        System.out.println("EXPECTED RESULT: 1.0 -1.0");
        System.out.println("YOUR RESULT    : " + p7.quadratic());
        System.out.println("PASSED=" + p7.quadratic().equals("1.0 -1.0"));

        boolean finalResult = (p1.polynomial(10) == 123) &&
                (p2.maximum() == 3) &&
                (p3.maximum() == 3) &&
                (p4.maximum() == 3) &&
                p5.quadratic().equals("-1.0 -1.0") &&
                p6.quadratic().equals("1.0 -3.0") &&
                p7.quadratic().equals("1.0 -1.0");
    }
}
