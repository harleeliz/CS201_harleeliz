/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.util.Locale;
import java.text.*;

public class InvestCalc {
	// Instance variables
	private double rate;        // Interest rate in decimal
	private double principal;   // Amount of investment

	private static final int SHORT_TERM = 5;
	private static final int MIDDLE_TERM = 10;
	private static final int LONG_TERM = 20;
	private static final double DEFAULT_INTEREST = 0;
	private static final double DEFAULT_PRINCIPAL = 0;
	private static final NumberFormat DOLLAR_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
	private static final DecimalFormat PERCENT_FORMAT = new DecimalFormat("##0.00%");

	// Default constructor
	public InvestCalc() {
		setRate(DEFAULT_INTEREST);
		setPrincipal(DEFAULT_PRINCIPAL);
	}
	// Non-default constructor
	public InvestCalc(double newRate, double newPrincipal) {
		setRate(newRate);
		setPrincipal(newPrincipal);
	}
	// Accessor methods
	public double getRate() {
		return rate;
	}
	public double getPrincipal() {
		return principal;
	}
	// Mutator methods
	public void setRate(double newRate) {
		rate = newRate;
	}
	public void setPrincipal(double newPrincipal) {
		principal = newPrincipal;
	}
	public double futureValue(int year) {
		return principal * (Math.pow(1 + rate, year));
	}
	public String toString() {
		return "Principal: " + DOLLAR_FORMAT.format(principal) +
				" Interest rate: " + PERCENT_FORMAT.format(rate);
	}
	public String getTable(int start, int end, int increment) {
		if (start <= 0 || end <= 0 || increment <= 0 || start > end) {
			return "getTable invalid arguments";
		}
		StringBuilder table = new StringBuilder();
		for (int year = start; year <= end; year += increment) {
			double futureValue = futureValue(year);
			String line = DOLLAR_FORMAT.format(principal) + ";" + PERCENT_FORMAT.format(rate) + ";" +
					year + ";" + DOLLAR_FORMAT.format(futureValue) + "\n";
			table.append(line);
		}
		return table.toString();
	}
	public static void main(String[] args) {
		InvestCalc value1 = new InvestCalc(0.05, 10000);
		InvestCalc value2 = new InvestCalc(0.06, 8000);
		boolean a1 = value1.getTable(2, 10, 2).equals("$10,000.00;5.00%;2;$11,025.00\n$10,000.00;5.00%;4;$12,155.06\n$10,000.00;5.00%;6;$13,400.96\n$10,000.00;5.00%;8;$14,774.55\n$10,000.00;5.00%;10;$16,288.95\n");
		boolean a2 = value2.getTable(1, 7, 3).equals("$8,000.00;6.00%;1;$8,480.00\n$8,000.00;6.00%;4;$10,099.82\n$8,000.00;6.00%;7;$12,029.04\n");
		boolean result1 = a1 && a2;

		InvestCalc value3 = new InvestCalc(0.05, 10000);
		InvestCalc value4 = new InvestCalc(0.06, 8000);
		boolean a3 = value3.getTable(10, 8, 2).equals("getTable invalid arguments");
		boolean a4 = value4.getTable(1, 8, 2).equals("getTable invalid arguments");
		boolean result2 = a3 || a4;

		System.out.println("Test Result 1: " + result1);
		System.out.println("Test Result 2: " + result2);

	}
}