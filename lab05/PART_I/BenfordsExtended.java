/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.math.BigInteger;
import java.util.Scanner;

public class BenfordsExtended {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTermsFactorial = getInput("Enter the number of terms for the factorial sequence: ", scanner);
        int numTermsFibonacci = getInput("Enter the number of terms for the Fibonacci sequence: ", scanner);

        int[] observedCountsFactorial = new int[10]; // Initialize counts for digits 0-9
        int[] observedCountsFibonacci = new int[10];

        generateAndCountDigits(numTermsFactorial, observedCountsFactorial, "factorial");
        generateAndCountDigits(numTermsFibonacci, observedCountsFibonacci, "Fibonacci");

        boolean matchFactorial = checkBenfordsLaw(observedCountsFactorial, numTermsFactorial);
        boolean matchFibonacci = checkBenfordsLaw(observedCountsFibonacci, numTermsFibonacci);

        printResult("Factorial", matchFactorial);
        printResult("Fibonacci", matchFibonacci);
    }

    private static int getInput(String message, Scanner scanner) {
        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(message);
                input = Integer.parseInt(scanner.nextLine());

                if (input > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        return input;
    }

    private static void generateAndCountDigits(int numTerms, int[] observedCounts, String sequenceName) {
        for (int i = 1; i <= numTerms; i++) {
            BigInteger term;

            if (sequenceName.equals("factorial")) {
                term = calculateFactorial(i);
            } else {
                term = calculateFibonacci(i);
            }

            int firstDigit = getFirstDigit(term);
            observedCounts[firstDigit]++;
        }
    }

    private static boolean checkBenfordsLaw(int[] observedCounts, int numTerms) {
        double tolerance = 1.0; // 1% tolerance

        for (int d = 1; d <= 9; d++) {
            double observedPercentage = (double) observedCounts[d] / numTerms * 100;
            double predictedPercentage = getPredictedPercentage(d);

            if (Math.abs(observedPercentage - predictedPercentage) > tolerance) {
                return false;
            }
        }

        return true;
    }

    private static void printResult(String sequenceName, boolean match) {
        String result = match ? "matches" : "does not match";
        System.out.println(sequenceName + " first digits " + result + " Benford's Law predictions within the tolerance.");
    }

    private static BigInteger calculateFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }

    private static BigInteger calculateFibonacci(int n) {
        if (n <= 2) {
            return BigInteger.ONE;
        }

        BigInteger fib1 = BigInteger.ONE;
        BigInteger fib2 = BigInteger.ONE;

        for (int i = 3; i <= n; i++) {
            BigInteger temp = fib2;
            fib2 = fib2.add(fib1);
            fib1 = temp;
        }

        return fib2;
    }

    private static int getFirstDigit(BigInteger number) {
        String numberString = number.toString();
        char firstDigitChar = numberString.charAt(0);
        return Character.getNumericValue(firstDigitChar);
    }

    private static double getPredictedPercentage(int digit) {
        // Benford's Law predicted percentages for digits 1-9
        double[] predictedPercentages = { 30.1, 17.6, 12.5, 9.7, 7.9, 6.7, 5.8, 5.1, 4.6 };
        return predictedPercentages[digit - 1];
    }
}
