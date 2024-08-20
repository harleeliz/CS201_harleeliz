/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
//Use Scanner to read the six real numbers for the points: x1 y1 x2 y2 x3 y3
// test1 = (1,1), (-2,-5), (3,0) result true
// test2 = (2,2), (3,-1), (-3.-2) result false

import java.util.Scanner;

public class CheckRightAngleWithScanner {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Read the coordinates of three points (x1, y1, x2, y2, x3, y3)
            System.out.println("Enter the coordinates of three points (x1 y1 x2 y2 x3 y3):");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();

            // Check if they form a right triangle and print the result
            boolean isRightTriangle = isRightTriangle(x1, y1, x2, y2, x3, y3);
            System.out.println(isRightTriangle);

            scanner.close();
        }
        public static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
            // Calculate the squares of the distances between the points
            double d1 = distanceSquared(x1, y1, x2, y2);
            double d2 = distanceSquared(x1, y1, x3, y3);
            double d3 = distanceSquared(x2, y2, x3, y3);

            // Check if they satisfy the Pythagorean theorem
            return (d1 + d2 == d3) || (d1 + d3 == d2) || (d2 + d3 == d1);
        }
        public static double distanceSquared(double x1, double y1, double x2, double y2) {
            // Calculate the square of the distance between two points
            return Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        }
    }


