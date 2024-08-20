/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class ExpDecayPartITest {
    public static void main(String[] args) {
        System.out.print("Test Case 1 ");
        ExpDecayPartI value1 = new ExpDecayPartI();
        boolean a1=value1.toString().equals("Initial Quantity: 100.000000  Lambda: 0.050000");
        value1.setLambda(.025);
        value1.setN0(10);
        boolean a2=value1.toString().equals("Initial Quantity: 10.000000  Lambda: 0.025000");
        if (a1 && a2) {
            System.out.println("PASSED");
        }
        else {
            System.out.println("FAILED");
        }

        System.out.print("Test Case 2 ");
        ExpDecayPartI value2 = new ExpDecayPartI();
        boolean a3=Math.abs(value2.futureQuantity(1)-95.1229424500714)<.00000001;
        value2.setLambda(.025);
        value2.setN0(10);
        boolean a4=Math.abs(value2.futureQuantity(1)-9.753099120283327)<.00000001;
        if (a3 && a4) {
            System.out.println("PASSED");
        }
        else {
            System.out.println("FAILED");
        }

        System.out.print("Test Case 3 ");
        ExpDecayPartI value3 = new ExpDecayPartI(.05, 10000);
        boolean a5 = value3.getTable().equals(
                "0.050000;10000.000000;5.000000;7788.007831\n" +
                        "0.050000;10000.000000;25.000000;2865.047969\n" +
                        "0.050000;10000.000000;50.000000;820.849986\n"
        );
        value3.setLambda(.06);
        value3.setN0(8000);
        boolean a6 = value3.getTable().equals(
                "0.060000;8000.000000;5.000000;5926.545765\n" +
                        "0.060000;8000.000000;25.000000;1785.041281\n" +
                        "0.060000;8000.000000;50.000000;398.296547\n"
        );
        if (a5 && a6) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}