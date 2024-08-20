/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.text.DecimalFormat;
public class FederalTax {
    private double taxableIncome;
    // Constructors
    public FederalTax() {
        this.taxableIncome = 10000.0; // Default value
    }
    public FederalTax(double taxableIncome) {
        setIncome(taxableIncome);
    }
    // Setter method to set taxable income
    public void setIncome(double taxableIncome) {
        if (taxableIncome < 0) {
            this.taxableIncome = 10000.0; // Default value
        } else {
            this.taxableIncome = taxableIncome;
        }
    }
    // Getter method to get taxable income
    public double getIncome() {
        return this.taxableIncome;
    }
    // Method to determine tax bracket
    public int taxBracket() {
        if (taxableIncome <= 22100.0) {
            return 1;
        } else if (taxableIncome <= 53500.0) {
            return 2;
        } else if (taxableIncome <= 115000.0) {
            return 3;
        } else if (taxableIncome <= 250000.0) {
            return 4;
        } else {
            return 5;
        }
    }
    // Method to calculate tax paid
    public double taxPaid() {
        int bracket = taxBracket();
        double taxPaid = 0.0;

        switch (bracket) {
            case 1:
                taxPaid = taxableIncome * 0.15;
                break;
            case 2:
                taxPaid = 3315.0 + (taxableIncome - 22100.0) * 0.28;
                break;
            case 3:
                taxPaid = 12107.0 + (taxableIncome - 53500.0) * 0.31;
                break;
            case 4:
                taxPaid = 31172.0 + (taxableIncome - 115000.0) * 0.36;
                break;
            case 5:
                taxPaid = 79772.0 + (taxableIncome - 250000.0) * 0.396;
                break;
        }
        return taxPaid;
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Taxable Income: $" + df.format(taxableIncome);
    }
}
