/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTI;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CountThreshold {
    private String filename;
    private double threshold;

    // Default constructor
    public CountThreshold() {
        this.filename = "numbers.txt";
        this.threshold = 0.0;
    }

    // Non-default constructor
    public CountThreshold(String filename, double threshold) {
        if (filename != null) {
            this.filename = filename;
        } else {
            this.filename = "numbers.txt";
        }

        if (threshold >= 0) {
            this.threshold = threshold;
        } else {
            this.threshold = 0.0;
        }
    }

    // Accessors
    public String getFileName() {
        return filename;
    }

    public double getThreshold() {
        return threshold;
    }

    // Mutators
    public void setFileName(String filename) {
        if (filename != null) {
            this.filename = filename;
        }
    }

    public void setThreshold(double threshold) {
        if (threshold >= 0) {
            this.threshold = threshold;
        }
    }

    // getCount method to count numbers greater than the threshold
    public int getCount() {
        int count = 0;

        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (value > threshold) {
                    count++;
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    @Override
    public String toString() {
        return "FileName:" + filename + " Threshold:" + threshold;
    }
}