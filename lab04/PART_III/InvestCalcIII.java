/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
import java.text.DecimalFormat;

public class InvestCalcIII {
    private static int largeInvestmentCount = 0;
    private double principal;
    private double annualInterestRate;

    // Constructors
    public InvestCalcIII () {
        this(0.0, 0.0);
    }

    public InvestCalcIII (double annualInterestRate, double principal) {
        setRate(annualInterestRate);
        setPrincipal(principal);
    }

    // Accessors
    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return annualInterestRate;
    }

    // Mutators
    public void setPrincipal(double principal) {
        this.principal = Math.max(0, principal);
        checkLargeInvestment();
    }

    public void setRate(double annualInterestRate) {
        if (annualInterestRate >= 0 && annualInterestRate < 1) {
            this.annualInterestRate = annualInterestRate;
        } else {
            this.annualInterestRate = 0;
        }
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00%");
        DecimalFormat principalFormat = new DecimalFormat("$#,##0.00");
        return "Principal: " + principalFormat.format(principal) + " Interest rate: " + df.format(annualInterestRate);
    }

    public double futureValue(int years) {
        if (years < 0) {
            return 0;
        }
        return Math.round(principal * Math.pow(1 + annualInterestRate, years) * 100) / 100.0;
    }

    public String getTable(String years) {
        if (years == null || !years.matches("\\d{2},\\d{2},\\d{2}")) {
            return "";
        }

        String[] yearArray = years.split(",");
        int year1 = Integer.parseInt(yearArray[0]);
        int year2 = Integer.parseInt(yearArray[1]);
        int year3 = Integer.parseInt(yearArray[2]);

        if (year1 >= year2 || year2 >= year3) {
            return "";
        }

        DecimalFormat df = new DecimalFormat("0.00%");
        DecimalFormat principalFormat = new DecimalFormat("$#,##0.00");

        StringBuilder result = new StringBuilder();

        for (int year = year1; year <= year3; year++) {
            if (year == year1 || year == year2 || year == year3) {
                double futureValue = futureValue(year);

                result.append(principalFormat.format(principal));
                result.append(";");
                result.append(df.format(annualInterestRate));
                result.append(";");
                result.append(year);
                result.append(";");
                result.append(principalFormat.format(futureValue));
                result.append("\n");
            }
        }

        return result.toString();
    }

    public static int getLargeInvestmentCount() {
        return largeInvestmentCount;
    }

    // Increment largeInvestmentCount if the principal is over $10,000
    private void checkLargeInvestment() {
        if (principal > 10000) {
            largeInvestmentCount++;
        }
    }

    // Reset largeInvestmentCount to 0
    public static void resetLargeInvestmentCount() {
        largeInvestmentCount = 0;
    }
}