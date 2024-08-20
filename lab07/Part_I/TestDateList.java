package Part_I;

/* Lab Exercises No.7
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class TestDateList {
    public static void main(String[] args) {
        DateList collection = new DateList(10);
        collection.insert(new Date(7, 4, 2017));
        collection.insert(new Date(1, 1, 2016));
        collection.insert(new Date(12, 7, 2017));
        collection.insert(new Date(7, 4, 2016));
        collection.insert(new Date(7, 4, 2017));

        System.out.println("DateList - Insert 5 Dates, Maintain Sorted Order Testing");

        String expectedOutput = "1/1/2016\n7/4/2016\n7/4/2017\n7/4/2017\n12/7/2017\n";
        String actualOutput = collection.toString();

        if (expectedOutput.equals(actualOutput)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Expected Output:\n" + expectedOutput);
            System.out.println("Actual Output:\n" + actualOutput);
        }
    }
}
