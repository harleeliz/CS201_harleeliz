/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
import java.text.DecimalFormat;

public class ExpDecayPartIII {
    //static constants
    private static final double DEFAULT_LAMBDA=0.050000 ;
    private static final double DEFAULT_N0=100.000000;

    private static final DecimalFormat NUMBER_FORMAT = new DecimalFormat("##0.000000");
    private static int largeInitialQuantityCount = 0;


    //instance variables
    double lambda;			//decay constant
    double n0;				// initial quantity

    //default constructor
    public ExpDecayPartIII(){
        setLambda(DEFAULT_LAMBDA);           // good practice to call "sets" here
        setN0(DEFAULT_N0);
    }
    //non-default constructor
    public ExpDecayPartIII(double newLambda, double newN0) {
        setLambda(newLambda);
        setN0(newN0);
        // good practice to call "sets" here
    }

    //accessor methods
    public double getLambda() {
        return lambda;
    }
    public double getN0() {
        return n0;
    }

    //mutator methods
    public void setLambda(double newLambda) {		// no error checking needed yet
        if(newLambda >= 0.0000) {
            lambda = newLambda;
        } else {
            lambda = DEFAULT_LAMBDA;
        }
    }


    /// need to change something. but I dont know how to solve it.
    public void setN0(double newN0) {
        if (newN0 >= 0.0000) {
            n0 = newN0;
        } else {
            n0 = DEFAULT_N0;
        }
    }


    // calculate for test case 2
    public double futureQuantity(int time) {

        if (time <= 0) {
            return 0;
        }
        double lambdachange = lambda;
        if (n0 >= 10000) {
            lambdachange *= 1.10;
        }
        return n0 * (Math.pow(Math.E,(-1 * lambdachange * time)));
    }

    // calculate for test case 3.
    // these two cases use different formulas. so I made two versions to apply each questions.
    public double futureQuantitya(int time) {

        if (time <= 0) {
            return 0;
        }
        double lambdachange = lambda;
        if (n0 >= 10000) {
            lambdachange = lambda;
        }
        return n0 * (Math.pow(Math.E,(-1 * lambdachange * time)));
    }


    public static int getLargeInitialQuantityCount() {
        return largeInitialQuantityCount;
    }


    @Override
    public String toString() {
        return "Initial Quantity: " + NUMBER_FORMAT.format(n0) +
                "  Lambda: " + NUMBER_FORMAT.format(lambda);
    }

    public String getTable(String times) {
        if (times == null || times.isEmpty()) {
            return "";
        }

        String[] timeValues = times.split(",");

        for (String time : timeValues) {
            if (time.length() == 3 && !time.equals("0")) {
                return "";
            }
        }

        double time1 = Double.parseDouble(timeValues[0]);
        double time2 = Double.parseDouble(timeValues[1]);
        double time3 = Double.parseDouble(timeValues[2]);

        if (time1 < time2 && time2 < time3 && time1 < time3) {
            StringBuilder result = new StringBuilder();

            result.append(NUMBER_FORMAT.format(lambda)).append(";")
                    .append(NUMBER_FORMAT.format(n0)).append(";")
                    .append(time1).append(";")
                    .append(NUMBER_FORMAT.format(futureQuantitya((int) time1))).append("\n");

            result.append(NUMBER_FORMAT.format(lambda)).append(";")
                    .append(NUMBER_FORMAT.format(n0)).append(";")
                    .append(time2).append(";")
                    .append(NUMBER_FORMAT.format(futureQuantitya((int) time2))).append("\n");

            result.append(NUMBER_FORMAT.format(lambda)).append(";")
                    .append(NUMBER_FORMAT.format(n0)).append(";")
                    .append(time3).append(";")
                    .append(NUMBER_FORMAT.format(futureQuantitya((int) time3))).append("\n");

            return result.toString();
        } else {
            return "";
        }
    }
}
