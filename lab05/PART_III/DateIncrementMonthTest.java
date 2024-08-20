/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class DateIncrementMonthTest {
    public static void main(String[] args) {
        boolean testResult1 = testIncrementMonth();
        boolean testResult2 = testIncrementMonthWithCount();

        if (testResult1 && testResult2) {
            System.out.println("All tests passed.");
        } else {
            System.out.println("Some tests failed.");
        }
    }
    public static boolean testIncrementMonth() {
        System.out.print("leap year month testing ");
        DateIncrementMonth d1 = new DateIncrementMonth(1, 30, 2020);
        d1.incrementMonth();
        boolean a1 = d1.toString().equals("2/29/2020");
        if (a1) System.out.println("PASSED");
        else System.out.println("FAILED " + d1);

        System.out.print("non-leap year month testing ");
        DateIncrementMonth d2 = new DateIncrementMonth(1, 30, 2021);
        d2.incrementMonth();
        boolean a2 = d2.toString().equals("2/28/2021");
        if (a2) System.out.println("PASSED");
        else System.out.println("FAILED " + d2);

        System.out.print("move to new year increment testing ");
        DateIncrementMonth d3 = new DateIncrementMonth(12, 30, 2021);
        d3.incrementMonth();
        boolean a3 = d3.toString().equals("1/30/2022");
        if (a3) System.out.println("PASSED");
        else System.out.println("FAILED " + d3);

        System.out.print("regular month testing ");
        DateIncrementMonth d4 = new DateIncrementMonth(5, 15, 1975);
        d4.incrementMonth();
        boolean a4 = d4.toString().equals("6/15/1975");
        if (a4) System.out.println("PASSED");
        else System.out.println("FAILED " + d4);

        return a1 && a2 && a3 && a4; // Return true if all tests pass
    }

    public static boolean testIncrementMonthWithCount() {
        System.out.print("leap year month testing ");
        DateIncrementMonth d1 = new DateIncrementMonth(10, 30, 2019);
        d1.incrementMonth(4);
        boolean a1 = d1.toString().equals("2/29/2020");
        if (a1) System.out.println("PASSED");
        else System.out.println("FAILED " + d1);

        System.out.print("non-leap year month testing ");
        DateIncrementMonth d2 = new DateIncrementMonth(6, 30, 2021);
        d2.incrementMonth(8);
        boolean a2 = d2.toString().equals("2/28/2022");
        if (a2) System.out.println("PASSED");
        else System.out.println("FAILED " + d2);


        System.out.print("move to new year increment testing ");
        DateIncrementMonth d3 = new DateIncrementMonth(12, 30, 2021);
        d3.incrementMonth(13);
        boolean a3 = d3.toString().equals("1/28/2023");
        if (a3) System.out.println("PASSED");
        else System.out.println("FAILED " + d3);
        System.out.print("negative month count testing ");
        DateIncrementMonth d4 = new DateIncrementMonth(5, 15, 1975);
        d4.incrementMonth(-1);
        boolean a4 = d4.toString().equals("5/15/1975");
        if (a4) System.out.println("PASSED");
        else System.out.println("FAILED " + d4);

        return a1 && a2 && a3 && a4; // Return true if all tests pass
    }
}

