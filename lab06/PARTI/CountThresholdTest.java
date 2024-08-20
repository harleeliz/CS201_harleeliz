/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTI;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CountThresholdTest {
    public static void main (String[] args) {
        CountThreshold f1 = new CountThreshold();
        boolean a1 = f1.toString().equals("FileName:numbers.txt Threshold:0.0");

        CountThreshold f2 = new CountThreshold("in.txt", 100);
        boolean a2 = f2.toString().equals("FileName:in.txt Threshold:100.0");

        CountThreshold f3 = new CountThreshold(null, -1);
        boolean a3 = f3.toString().equals("FileName:numbers.txt Threshold:0.0");

        System.out.println("Test Case 1: " + (a1 && a2 && a3));

        CountThreshold f4 = new CountThreshold("numbers.txt", 10);
        boolean a4 = f4.getCount() == 48;

        f4.setThreshold(30);
        boolean a5 = f4.getCount() == 19;

        System.out.println("Test Case 2: " + (a4 && a5));
    }
}