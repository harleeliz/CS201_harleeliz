/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Jun, Harlee Ramos
 */

public class DateIncrementDayTest {
    public static void main(String[] args) {
        boolean incrementTestResult = testIncrementDays();
        boolean dayOfWeekTestResult = testDayOfWeek();

        if (incrementTestResult && dayOfWeekTestResult) {
            System.out.println("All tests passed successfully!");
        } else {
            System.out.println("Some tests failed. Please review the code.");
        }
    }

    public static boolean testIncrementDays() {
        System.out.println("Testing incrementDays:");

        System.out.print("Leap year increment testing: ");
        DateIncrementDay d1 = new DateIncrementDay(2, 29, 2020);
        d1.incrementDays(5);
        boolean a1 = d1.toString().equals("3/5/2020");
        if (a1) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED " + d1);
        }



        System.out.print("Non-leap year increment testing: ");
        DateIncrementDay d2 = new DateIncrementDay(2, 29, 2019);
        d2.incrementDays(5);
        boolean a2 = d2.toString().equals("2/6/2019");
        if (a2) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED " + d2);
        }
        System.out.print("Move to new year increment testing: ");
        DateIncrementDay d3 = new DateIncrementDay(12, 25, 1999);
        d3.incrementDays(67);
        boolean a3 = d3.toString().equals("3/1/2000");
        if (a3) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED " + d3);
        }
        return a1 && a2 && a3;
    }

    public static boolean testDayOfWeek() {
        System.out.println("Testing dayOfWeek:");

        System.out.print("Leap year dayOfWeek testing: ");
        DateIncrementDay d1 = new DateIncrementDay(2, 29, 2020);
        boolean a1 = d1.dayOfWeek().equals("Saturday");
        if (a1) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED " + d1.dayOfWeek());
        }

        System.out.print("Non-leap year dayOfWeek testing: ");
        DateIncrementDay d2 = new DateIncrementDay(2, 29, 2019);
        boolean a2 = d2.dayOfWeek().equals("Friday");
        if (a2) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED " + d2.dayOfWeek());
        }

        System.out.print("Default Date dayOfWeek testing: ");
        DateIncrementDay d3 = new DateIncrementDay();
        boolean a3 = d3.dayOfWeek().equals("Saturday");
        if (a3) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED " + d3.dayOfWeek());
        }

        System.out.print("Random Date dayOfWeek testing: ");
        DateIncrementDay d4 = new DateIncrementDay(6, 15, 2020);
        boolean a4 = d4.dayOfWeek().equals("Monday");
        if (a4) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED " + d4.dayOfWeek());
        }

        return a1 && a2 && a3 && a4;
    }
}
