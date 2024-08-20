/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class DateLeapYearTest {
    public static void main(String[] args) {
        System.out.println("Test Case 1 - check setDay aware of leapYear");
        System.out.println(testSetDayAwareOfLeapYear());


        System.out.println("\nTest Case 2 - daysLeftInMonth");
        System.out.println(testDaysLeftInMonth());
        DateLeapYear d1 = new DateLeapYear(2, 29, 2020);
        DateLeapYear d2 = new DateLeapYear(2, 29, 2019);
        DateLeapYear d3 = new DateLeapYear();
        DateLeapYear d4 = new DateLeapYear(6, 15, 2020);


        System.out.println("\nTest Case 3 - incrementDay");
        System.out.println(testIncrementDay());
 
    }

    private static boolean testSetDayAwareOfLeapYear() {
        DateLeapYear d1 = new DateLeapYear(2, 29, 2020);
        DateLeapYear d2 = new DateLeapYear(2, 29, 2019);

        return d1.toString().equals("2/29/2020") && d2.toString().equals("2/1/2019");
    }
 

    private static boolean testDaysLeftInMonth() {
        DateLeapYear d1 = new DateLeapYear(2, 29, 2020);
        DateLeapYear d2 = new DateLeapYear(2, 29, 2019);
        DateLeapYear d3 = new DateLeapYear();
        DateLeapYear d4 = new DateLeapYear(6, 15, 2020);

        return d1.daysLeftInMonth() == 0 && d2.daysLeftInMonth() == 27 &&
                d3.daysLeftInMonth() == 30 && d4.daysLeftInMonth() == 15;
    } 

    private static boolean testIncrementDay() {
        DateLeapYear d1 = new DateLeapYear(2, 28, 2020);
        d1.incrementDay();
        boolean a1a = d1.toString().equals("2/29/2020");
        d1.incrementDay();
        boolean a1b = d1.toString().equals("3/1/2020");
        DateLeapYear d2 = new DateLeapYear(2, 29, 2019);
        d2.incrementDay();
        boolean a2 = d2.toString().equals("2/2/2019");
        DateLeapYear d3 = new DateLeapYear();
        d3.incrementDay();
        d3.incrementDay();
        d3.incrementDay();
        boolean a3 = d3.toString().equals("1/4/2000");
        DateLeapYear d4 = new DateLeapYear(12, 31, 2020);
        d4.incrementDay();
        boolean a4 = d4.toString().equals("1/1/2021");

        return a1a && a1b && a2 && a3 && a4;
    }

}
