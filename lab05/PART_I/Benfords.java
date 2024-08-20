/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Benfords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTermsFactorial = getInput("Enter the number of terms for the sequence: ", scanner);
        int numTermsFibonacci = numTermsFactorial; // Use the same number of terms for Fibonacci

        int countFactorial = countFirstDigitOne(numTermsFactorial, "factorial");
        int countFibonacci = countFirstDigitOne(numTermsFibonacci, "Fibonacci");

        double percentageFactorial = (double) countFactorial / numTermsFactorial * 100;
        double percentageFibonacci = (double) countFibonacci / numTermsFibonacci * 100;

        System.out.println("Factorial first digit 1 percentage=" + String.format("%.0f", percentageFactorial) + "%");
        System.out.println("Fibonacci first digit 1 percentage=" + String.format("%.0f", percentageFibonacci) + "%");
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
                  
                }
            } catch (NumberFormatException e) {
                
            }
        }

        return input;
    }

    private static int countFirstDigitOne(int numTerms, String sequenceName) {
        int count = 0;

        for (int i = 1; i <= numTerms; i++) {
            BigInteger term;

            if (sequenceName.equals("factorial")) {
                term = calculateFactorial(i);
            } else {
                term = calculateFibonacci(i);
            }

            if (getFirstDigit(term) == 1) {
                count++;
            }
        }

        return count;
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
}
