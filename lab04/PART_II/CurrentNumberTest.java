/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class CurrentNumberTest {
    public static void main(String[] args) {
        System.out.println("Test Case 1 - zero");
        CurrentNumber currentNumber1 = new CurrentNumber(0);
        System.out.println("EXPECTED RESULT: 0");
        System.out.println("YOUR RESULT    : " + currentNumber1.getCurrentNumber());
        System.out.println("PASSED=" + (currentNumber1.getCurrentNumber() == 0) + "\n");

        System.out.println("Test Case 2 - positive odd number");
        CurrentNumber currentNumber2 = new CurrentNumber(1);
        System.out.println("EXPECTED RESULT: 4");
        currentNumber2.calCurrentNumber();
        System.out.println("YOUR RESULT    : " + currentNumber2.getCurrentNumber());
        System.out.println("PASSED=" + (currentNumber2.getCurrentNumber() == 4) + "\n");



        System.out.println("Test Case 3 - negative even number");
        CurrentNumber currentNumber3 = new CurrentNumber(2);
        System.out.println("EXPECTED RESULT: -2");
        currentNumber3.calCurrentNumber();
        System.out.println("YOUR RESULT    : " + currentNumber3.getCurrentNumber());
        System.out.println("PASSED=" + (currentNumber3.getCurrentNumber() == -2) + "\n");

        System.out.println("Test Case 4 - negative even number");
        CurrentNumber currentNumber4 = new CurrentNumber(-3);
        System.out.println("EXPECTED RESULT: -8");
        currentNumber4.calCurrentNumber();
        System.out.println("YOUR RESULT    : " + currentNumber4.getCurrentNumber());
        System.out.println("PASSED=" + (currentNumber4.getCurrentNumber() == -8) + "\n");

        System.out.println("Test Case 5 - positive even number");
        CurrentNumber currentNumber5 = new CurrentNumber(-2);
        System.out.println("EXPECTED RESULT: 2");
        currentNumber5.calCurrentNumber();
        System.out.println("YOUR RESULT    : " + currentNumber5.getCurrentNumber());
        System.out.println("PASSED=" + (currentNumber5.getCurrentNumber() == 2) + "\n");
    }
}
