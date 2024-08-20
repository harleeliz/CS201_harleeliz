/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class ThreeDigitsReverse {
    // Instance attribute to store the three-digit number
    private int num;

    // Constant for the default number value
    private static final int DEFAULT_NUMBER = 123;

    // Default constructor
    public ThreeDigitsReverse() {
        setNumber(DEFAULT_NUMBER); // Initialize with the default number
    }

    // Constructor with parameter to set the number
    public ThreeDigitsReverse(int newNum) {
        setNumber(newNum); // Set the number provided as a parameter
    }

    // Getter method to retrieve the current number
    public int getNum() {
        return num;
    }

    // Setter method to set the number with data range checking
    public void setNumber(int newNum) {
        if (newNum >= 100 && newNum <= 999) {
            num = newNum; // Set the number if it's a three-digit number
        } else {
            num = DEFAULT_NUMBER; // Set the default number if the input is out of range
        }
    }

    // Method to determine whether the digits are all even, all odd, or mixed
    public String evenOddMixed() {
        int firstDigit = num / 100;
        int secondDigit = (num / 10) % 10;
        int thirdDigit = num % 10;

        if (firstDigit % 2 == 0 && secondDigit % 2 == 0 && thirdDigit % 2 == 0) {
            return "all even";
        } else if (firstDigit % 2 != 0 && secondDigit % 2 != 0 && thirdDigit % 2 != 0) {
            return "all odd";
        } else {
            return "mixed";
        }
    }

    // Method to reverse the digits of the number
    public String reverseDigits() {
        int firstDigit = num / 100;
        int secondDigit = (num / 10) % 10;
        int thirdDigit = num % 10;

        // Create a string by reversing the digits
        String reversedDigits = String.valueOf(thirdDigit) + String.valueOf(secondDigit) + String.valueOf(firstDigit);

        return reversedDigits;
    }

    // toString method to return a formatted string representation of the object
    @Override
    public String toString() {
        return "number=" + num;
    }
}
