/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

class AverageIncomeGender {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner user_input_text = new Scanner(System.in);

        // Create a NumberFormat object for formatting currency values in US locale
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

        // Initialize variables to keep track of total income and counts for males and females
        double total_m_income = 0;
        int m_counter = 0;
        double total_f_income = 0;
        int f_counter = 0;

        System.out.println("2C - Iteration - Write a method or program requiring iteration (AverageIncomeGender)");
        System.out.println();

        // Start an infinite loop to continuously read input until 'X' is entered
        while (true) {
            System.out.print("Enter gender (M/F) and income (or 'X' to exit): ");
            String input = user_input_text.next().toUpperCase();

            // Check if the input is 'X' to exit the loop
            if (input.equals("X")) {
                break;
            } else if (input.equals("M") || input.equals("F")) {
                // If input is 'M' or 'F', read the income value and update the respective total and count
                double income = user_input_text.nextDouble();
                if (input.equals("M")) {
                    total_m_income += income;
                    m_counter++;
                } else {
                    total_f_income += income;
                    f_counter++;
                }
            } else {
                // If the input is neither 'M', 'F', nor 'X', display an error message
                System.out.println("Invalid gender input. Please enter 'M', 'F', or 'X'.");
            }
        }

        // Calculate and display the average male and female incomes (formatted as currency)
        System.out.println("Average Male Income = " + (m_counter > 0 ? currencyFormat.format(total_m_income / m_counter) : "No Male Incomes Entered"));
        System.out.println("Average Female Income = " + (f_counter > 0 ? currencyFormat.format(total_f_income / f_counter) : "No Female Incomes Entered"));

        // Close the Scanner to release resources (move this outside of the while loop)
        user_input_text.close();
    }
}
