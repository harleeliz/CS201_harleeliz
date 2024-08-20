/* Lab Exercises No.4

Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

public class ExpDecayPartIIITest {

    public static void main(String[] args) {
        boolean result;

        // Test Case 1 - constructors, mutators, toString()
        result = testCase1();
        System.out.println("Test Case 1 Result: " + (result ? "PASSED" : "FAILED"));

        // Test Case 2 - futureQuantity
        result = testCase2();
        System.out.println("Test Case 2 Result: " + (result ? "PASSED" : "FAILED"));

        // Test Case 3 - getTable
        result = testCase3();
        System.out.println("Test Case 3 Result: " + (result ? "PASSED" : "FAILED"));

        // Test Case 4 - getLargeInitialQuantityCount
        result = testCase4();
        System.out.println("Test Case 4 Result: " + (result ? "PASSED" : "FAILED"));
    }

    // Test Case 1 - constructors, mutators, toString()
    private static boolean testCase1() {
        ExpDecayPartIII v1 = new ExpDecayPartIII ();
        boolean a1 = v1.toString().equals("Initial Quantity: 100.000000  Lambda: 0.050000");

        ExpDecayPartIII v2 = new ExpDecayPartIII (0.005, 10000);
        boolean a2 = v2.toString().equals("Initial Quantity: 10000.000000  Lambda: 0.005000");

        ExpDecayPartIII v3 = new ExpDecayPartIII (-0.05, -100);
        boolean a3 = v3.toString().equals("Initial Quantity: 100.000000  Lambda: 0.050000");

        ExpDecayPartIII v4 = new ExpDecayPartIII (0.075, -1);
        boolean a4 = v4.toString().equals("Initial Quantity: 100.000000  Lambda: 0.075000");

        ExpDecayPartIII v5 = new ExpDecayPartIII (-0.075, 1);
        boolean a5 = v5.toString().equals("Initial Quantity: 1.000000  Lambda: 0.050000");

        ExpDecayPartIII v6 = new ExpDecayPartIII ();
        v6.setN0(999);
        boolean a6 = v6.toString().equals("Initial Quantity: 999.000000  Lambda: 0.050000");

        ExpDecayPartIII v7 = new ExpDecayPartIII (0.11, 900);
        v7.setN0(-999);
        boolean a7 = v7.toString().equals("Initial Quantity: 100.000000  Lambda: 0.110000");

        ExpDecayPartIII v8 = new ExpDecayPartIII ();
        v8.setLambda(0.09999);
        boolean a8 = v8.toString().equals("Initial Quantity: 100.000000  Lambda: 0.099990");

        ExpDecayPartIII v9 = new ExpDecayPartIII (0.11, 900);
        v9.setLambda(-0.99);
        boolean a9 = v9.toString().equals("Initial Quantity: 900.000000  Lambda: 0.050000");

        return a1 && a2 && a3 && a4 && a5 && a6 && a7 && a8 && a9;
    }

    // Test Case 2 - futureQuantity
    private static boolean testCase2() {
        ExpDecayPartIII v1 = new ExpDecayPartIII ();
        boolean a1 = v1.futureQuantity(-1) == 0.0;

        ExpDecayPartIII v2 = new ExpDecayPartIII ();
        boolean a2 = v2.futureQuantity(0) == 0.0;

        ExpDecayPartIII v3 = new ExpDecayPartIII ();
        boolean a3 = Math.abs(v3.futureQuantity(1) - 95.1229424500714) < 0.00000001;

        ExpDecayPartIII v4 = new ExpDecayPartIII ();
        boolean a4 = Math.abs(v4.futureQuantity(10) - 60.653065971263345) < 0.00000001;

        return a1 && a2 && a3 && a4;
    }

    // Test Case 3 - getTable
    private static boolean testCase3() {
        ExpDecayPartIII v1 = new ExpDecayPartIII (0.05, 10000);
        boolean a1 = v1.getTable(null).equals("");
        System.out.println("\nnull argument");
        System.out.println("Expected Output:"+"");
        System.out.println("Your Output :"+v1.getTable(null));



        boolean a2 = v1.getTable("01,05,100").equals("");
        System.out.println(v1.getTable("01,05,100"));
        System.out.println("\nwrong length argument");
        System.out.println("Expected Output:"+"");
        System.out.println("Your Output :"+v1.getTable("01,05,100"));


        boolean a3 = v1.getTable("1,05,100").equals("");
        System.out.println("\ncommas wrong");
        System.out.println("Expected Output:"+"");
        System.out.println("Your Output :"+v1.getTable("01,05,100"));


        boolean a4 = v1.getTable("05,01,10").equals("");
        System.out.println("\nnot increasing times");
        System.out.println("Expected Output:"+"");
        System.out.println("Your Output :"+v1.getTable("05,01,10"));



        boolean a5 = v1.getTable("05,10,20").equals("0.050000;10000.000000;5.0;7788.007831\n0.050000;10000.000000;10.0;6065.306597\n0.050000;10000.000000;20.0;3678.794412\n");
        System.out.println("\nargument OK");
        System.out.println("Expected Output:"+"");
        System.out.println("Your Output :"+v1.getTable("05,10,20"));


        return a1 && a2 && a3 && a4 && a5;
    }

    // Test Case 4 - getLargeInitialQuantityCount
    private static boolean testCase4() {
        boolean a0 = ExpDecayPartIII.getLargeInitialQuantityCount() == 0;

        // default object
        ExpDecayPartIII v1 = new ExpDecayPartIII ();
        boolean a1 = ExpDecayPartIII.getLargeInitialQuantityCount() == 0;

        // new object = 100
        ExpDecayPartIII v2 = new ExpDecayPartIII (0.05, 100);
        boolean a2 = ExpDecayPartIII.getLargeInitialQuantityCount() == 0;

        // new object < 100
        ExpDecayPartIII v3 = new ExpDecayPartIII (0.05, 99.999);
        boolean a3 = ExpDecayPartIII.getLargeInitialQuantityCount() == 0;

        // new object > 100
        ExpDecayPartIII v4 = new ExpDecayPartIII (0.05, 100.01);
        boolean a4 = ExpDecayPartIII.getLargeInitialQuantityCount() == 1;

        v4.setN0(100);
        boolean a5 = ExpDecayPartIII.getLargeInitialQuantityCount() == 1;

        v4.setN0(1000);
        boolean a6 = ExpDecayPartIII.getLargeInitialQuantityCount() == 2;


        return a0 && a1 && a2 && a3 && a4 && a5 && a6;
    }
}