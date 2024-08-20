/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.text.DecimalFormat;
public class Particle {
    private double A, B, C, D;

    public Particle(double A, double B, double C, double D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    public double getD() {
        return D;
    }

    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }

    public void setC(double C) {
        this.C = C;
    }

    public void setD(double D) {
        this.D = D;
    }

    public String toString() {
        return "location(t) = " + A + "t^4+" + B + "t^3+" + C + "t^2+" + D + "t";
    }

    public String getTable(double start, double end, double increment) {
        if (start >= end || increment <= 0) {
            return "getTable invalid arguments";
        }

        StringBuilder table = new StringBuilder();
        double prevLocation = Double.NaN;
        double epsilon = 0.001; // Adjust this threshold as needed
        DecimalFormat decimalFormat = new DecimalFormat("0.000000000000000");
        for (double t = start; t <= end; t += increment) {
            double location = A * Math.pow(t, 4) + B * Math.pow(t, 3) + C * Math.pow(t, 2) + D * t;
            double velocity = 4 * A * Math.pow(t, 3) + 3 * B * Math.pow(t, 2) + 2 * C * t;
            String line = String.format("%.1f;%.3f;%.3f", t, location, velocity);
            if (!Double.isNaN(prevLocation) && Math.abs(location - prevLocation) > 1) {
                line += ";More than 1 unit movement";
            }
            table.append(line).append("\n");
            prevLocation = location;
        }

        return table.toString();
    }
}
