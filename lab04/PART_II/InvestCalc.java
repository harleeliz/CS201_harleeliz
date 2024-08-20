/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class InvestCalc {

    private double rate, //interest rate in decimal
            principal; //amount of investment
    private static final int SHORT_TERM = 5, MIDDLE_TERM = 10, LONG_TERM = 20;
    private static final double DEFAULT_INTEREST=0, DEFAULT_PRINCIPAL=0;
    private static final NumberFormat DOLLAR_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
    private static final DecimalFormat PERCENT_FORMAT = new DecimalFormat("##0.00%");
    //default constructor
    public InvestCalc() {           // default constructor
        setRate(DEFAULT_INTEREST); // good practice to call "sets" here
        setPrincipal(DEFAULT_PRINCIPAL);
    }
    //non-default constructor
    public InvestCalc(double newRate, double newPrincipal) {
        setRate(newRate); // good practice to call "sets" here
        setPrincipal(newPrincipal);
    }
    //accessor methods
    public double getRate() {
        return rate;
    }
    public double getPrincipal() {
        return principal;
    }
    //mutator methods
    public void setRate(double newRate) {

        if(newRate <=0) {

            System.out.println("ERROR: Rate must be greater than 0");
            rate = 0;
        } else {
            rate = newRate; // Error checking for rates lower than 0
        }

    }
    public void setPrincipal(double newPrincipal) {

        if (newPrincipal <=0) {
            System.out.println("ERROR: Principal must be greater than 0");
            principal = 0;
        } else {
            principal = newPrincipal; // Error checking for principal value lower than 0
        }
    }
    public double futureValue(int year) {
        if (principal>=10000) {
            return principal*(Math.pow(1+(rate+0.005), year));
        } else { return principal*(Math.pow(1+rate, year));

        }
    }
    public String toString(){
        return "Principal: " + DOLLAR_FORMAT.format(principal).replace("US$","$") + " Interest rate: " + PERCENT_FORMAT.format(rate);
    }
    public String getTable() {
        String temp=DOLLAR_FORMAT.format(principal).replace("US$","$") +";"+PERCENT_FORMAT.format(rate)+";"+SHORT_TERM+";"+DOLLAR_FORMAT.format(futureValue(SHORT_TERM)).replace("US$","$") +"\n";
        temp=temp+DOLLAR_FORMAT.format(principal).replace("US$","$") +";"+PERCENT_FORMAT.format(rate)+";"+MIDDLE_TERM+";"+DOLLAR_FORMAT.format(futureValue(MIDDLE_TERM)).replace("US$", "$") +"\n";
        temp=temp+DOLLAR_FORMAT.format(principal).replace("US$","$") +";"+PERCENT_FORMAT.format(rate)+";"+LONG_TERM+";"+DOLLAR_FORMAT.format(futureValue(LONG_TERM)).replace("US$", "$") + "\n";
        return temp;
    }
}
