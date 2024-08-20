/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.text.DecimalFormat;

public class ExpDecayPartI{
	// static constants
	private static final double DEFAULT_LAMBDA = 0.050000;
	private static final double DEFAULT_N0 = 100.000000;
	private static final DecimalFormat NUMBER_FORMAT = new DecimalFormat("0.000000");

	// instance variables
	private double lambda; // decay constant
	private double n0;     // initial quantity

	// default constructor
	public ExpDecayPartI() {
		setLambda(DEFAULT_LAMBDA);
		setN0(DEFAULT_N0);
	}

	// non-default constructor
	public ExpDecayPartI(double newLambda, double newN0) {
		setLambda(newLambda);
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
			lambda = DEFAULT_LAMBDA;
		}
	}

	public void setN0(double newN0) {
		if (newN0 >= 0.0) {
			n0 = newN0;
		} else {
			n0 = DEFAULT_N0;
		}
	}

	public double futureQuantity(int time) {
		if (time <= 0) {
			return 0.0;
		}
		return n0 * Math.exp(-lambda * time);
	}

	@Override
	public String toString() {
		return "Initial Quantity: " + NUMBER_FORMAT.format(n0) + "  Lambda: " + NUMBER_FORMAT.format(lambda);
	}

	public String getTable() {
		StringBuilder result = new StringBuilder();
		double[] times = { 5.0, 25.0, 50.0 };

		for (double time : times) {
			result.append(NUMBER_FORMAT.format(lambda)).append(";")
					.append(NUMBER_FORMAT.format(n0)).append(";")
					.append(NUMBER_FORMAT.format(time)).append(";")
					.append(NUMBER_FORMAT.format(futureQuantity((int) time))).append("\n");
		}

		return result.toString();
	}
}
