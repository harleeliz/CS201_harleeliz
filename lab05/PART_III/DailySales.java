/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class DailySales {
    private int[] sales;
    private int numDays;

    // Default constructor
    public DailySales() {
        this(31); // Default to 31 days
    }

    // Constructor with a specified number of days
    public DailySales(int daysInMonth) {
        if (daysInMonth < 1 || daysInMonth > 31) {
            daysInMonth = 31; // Default to 31 days if the input is invalid
        }
        this.numDays = daysInMonth;
        this.sales = new int[daysInMonth];
    }

    // Add sales to a specific day
    public boolean addSales(int dayNumber, int sales) {
        if (dayNumber < 1 || dayNumber > numDays || sales < 0) {
            return false; // Invalid dayNumber or sales amount
        }
        this.sales[dayNumber - 1] += sales;
        return true;
    }

    // Find the day with the maximum sales
    public int maxDay() {
        int maxSales = 0;
        int maxDay = 1; // Default to the first day

        for (int i = 0; i < numDays; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxDay = i + 1;
            }
        }

        return maxDay;
    }

    // Find the days with sales below 100 units
    public int[] daysBelowGoal() {
        int count = 0;
        for (int i = 0; i < numDays; i++) {
            if (sales[i] < 100) {
                count++;
            }
        }

        int[] belowGoal = new int[count];
        int index = 0;
        for (int i = 0; i < numDays; i++) {
            if (sales[i] < 100) {
                belowGoal[index++] = i + 1;
            }
        }

        return belowGoal;
    }

    // Return a single line with all the daily sales
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numDays; i++) {
            result.append(sales[i]);
            if (i < numDays - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

