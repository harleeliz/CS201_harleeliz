package Part_III;/* Lab Exercises No.7
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/

public class SquareRoot {

    // Static variables to store the current estimate, tolerance, and the input value for the square root calculation.
    private static double estimate;
    private static double tolerance;
    private static double a;

    // Default constructor for the Part_III.SquareRoot class.
    public SquareRoot() {
    }

    // Getter method for the estimate variable.
    public static double getEstimate() {
        return estimate;
    }

    // Setter method for the estimate variable.
    public static void setEstimate(double estimate) {
        SquareRoot.estimate = estimate;
    }

    // Getter method for the tolerance variable.
    public static double getTolerance() {
        return tolerance;
    }

    // Setter method for the tolerance variable.
    public static void setTolerance(double tolerance) {
        SquareRoot.tolerance = tolerance;
    }

    // Getter method for the input value 'a'.
    public static double getA() {
        return a;
    }

    // Setter method for the input value 'a'.
    public static void setA(double a) {
        SquareRoot.a = a;
    }

    // Public method to calculate the square root of 'a' with a specified tolerance.
    public static double squareRoot(double a, double tolerance) {
        SquareRoot.a = a;
        // Initial call to the worker method with the initial estimate set to half of 'a'.
        return squareRootWorker(a, a / 2, tolerance);
    }

    // Private worker method that implements the Newton-Raphson method to refine the square root estimate.
    private static double squareRootWorker(double a, double estimate, double tolerance) {
        SquareRoot.estimate = estimate;
        SquareRoot.tolerance = tolerance;
        // Calculate the next estimate using the Newton-Raphson formula.
        double nextEstimate = 0.5 * (estimate + a / estimate);

        // Check if the square of the next estimate is close enough to 'a' within the specified tolerance.
        if (Math.abs(nextEstimate * nextEstimate - a) < tolerance) {
            return nextEstimate; // Return the current estimate if the condition is met.
        } else {
            // Recursive call to continue refining the estimate if the condition is not met.
            return squareRootWorker(a, nextEstimate, tolerance);
        }
    }

    // Override the toString method to provide a String representation of the Part_III.SquareRoot class.
    @Override
    public String toString() {
        return "Part_III.SquareRoot{}";
    }
}
