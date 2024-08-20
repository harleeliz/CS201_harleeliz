/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.text.DecimalFormat;

public class ExpDecayPartII {
	// static constants
	private static final double DEFAULT_LAMBDA = 0.05;
	private static final double DEFAULT_N0 = 100;
	private static final int SHORT_PERIOD = 5, MIDDLE_PERIOD = 25, LONG_PERIOD = 50;
	private static final DecimalFormat NUMBER_FORMAT = new DecimalFormat("##0.000000");

	// instance variables
	private double lambda; // decay constant
	private double n0;     // initial quantity

	// default constructor
	public ExpDecayPartII() {
		setLambda(DEFAULT_LAMBDA); // good practice to call "sets" here
		setN0(DEFAULT_N0);
	}

	// non-default constructor
	public ExpDecayPartII(double newLambda, double newN0) {
		setLambda(newLambda); // good practice to call "sets" here
		setN0(newN0);
	}

	// accessor methods
	public double getLambda() {
		return lambda;
	}

	public double getN0() {
		return n0;
	}

	// mutator methods
	public void setLambda(double newLambda) {
		if (newLambda >= 0.0) {
			lambda = newLambda;
		} else {
			lambda = DEFAULT_LAMBDA; // Set to the default value if the argument is incorrect
		}
	}

	public void setN0(double newN0) {
		if (newN0 >= 0.0) {
			n0 = newN0;
		} else {
			n0 = DEFAULT_N0; // Set to the default value if the argument is incorrect
		}
	}

	public double futureQuantity(int time) {
		// Check if N0 is 10,000 or more and increase lambda by 10% if true
		if (n0 >= 10000) {
			double adjustedLambda = lambda * 1.1;
			return n0 * Math.pow(Math.E, (-1 * adjustedLambda * time));
		} else {
			return n0 * Math.pow(Math.E, (-1 * lambda * time));
		}
	}

	public String toString() {
		return "Initial Quantity: " + NUMBER_FORMAT.format(n0) +
				"  Lambda: " + NUMBER_FORMAT.format(lambda);
	}

	public String getTable() {
		String temp = NUMBER_FORMAT.format(lambda) + ";" + NUMBER_FORMAT.format(n0) + ";" + SHORT_PERIOD + ";"
				+ NUMBER_FORMAT.format(futureQuantity(SHORT_PERIOD)) + "\n";
		temp += NUMBER_FORMAT.format(lambda) + ";" + NUMBER_FORMAT.format(n0) + ";" + MIDDLE_PERIOD + ";"
				+ NUMBER_FORMAT.format(futureQuantity(MIDDLE_PERIOD)) + "\n";
		temp += NUMBER_FORMAT.format(lambda) + ";" + NUMBER_FORMAT.format(n0) + ";" + LONG_PERIOD + ";"
				+ NUMBER_FORMAT.format(futureQuantity(LONG_PERIOD)) + "\n";
		return temp;
	}
}
