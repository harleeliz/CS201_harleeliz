/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class FederalTaxTest {

    public static void main(String[] args) {
        // Testing your code with the provided test cases
        FederalTax p1 = new FederalTax();
        boolean a1 = p1.toString().equals("Taxable Income: $10,000.00");

        FederalTax p2 = new FederalTax(50000.0);
        boolean a2 = p2.toString().equals("Taxable Income: $50,000.00");

        FederalTax p2a = new FederalTax(-50000.0);
        boolean a2a = p2a.toString().equals("Taxable Income: $10,000.00");
        boolean a4b = p1.getIncome() == 10000; // Renamed variable to a4b

        p1.setIncome(25000.9999);
        boolean a3 = p1.toString().equals("Taxable Income: $25,001.00");

        boolean test1 = a1 && a2 && a2a && a4b && a3;

        FederalTax p1b = new FederalTax();
        boolean a1b = p1b.taxBracket() == 1;

        FederalTax p2b = new FederalTax(50000.0);
        boolean a2b = p2b.taxBracket() == 2;

        FederalTax p3b = new FederalTax(22100.0);
        boolean a3b = p3b.taxBracket() == 1;

        FederalTax p4b = new FederalTax(22100.01);
        boolean a4c = p4b.taxBracket() == 2; // Renamed variable to a4c

        FederalTax p5b = new FederalTax(53500.0);
        boolean a5b = p5b.taxBracket() == 2;

        FederalTax p6b = new FederalTax(53500.01);
        boolean a6b = p6b.taxBracket() == 3;

        FederalTax p7b = new FederalTax(115000.0);
        boolean a7b = p7b.taxBracket() == 3;

        FederalTax p8b = new FederalTax(115000.01);
        boolean a8b = p8b.taxBracket() == 4;

        FederalTax p9b = new FederalTax(250000.0);
        boolean a9b = p9b.taxBracket() == 4;

        FederalTax p10b = new FederalTax(250000.01);
        boolean a10b = p10b.taxBracket() == 5;

        boolean test2 = a1b && a2b && a3b && a4c && a5b && a6b && a7b && a8b && a9b && a10b;

        FederalTax p1c = new FederalTax();
        boolean a1c = Math.abs(p1c.taxPaid() - 1500.0) < 0.000001;

        FederalTax p2c = new FederalTax(50000.0);
        boolean a2c = Math.abs(p2c.taxPaid() - 11127.0) < 0.000001;

        FederalTax p3c = new FederalTax(22100.0);
        boolean a3c = Math.abs(p3c.taxPaid() - 3315.0) < 0.000001;

        FederalTax p4c = new FederalTax(22100.01);
        a4c = Math.abs(p4c.taxPaid() - 3315.0027999999998) < 0.000001;

        FederalTax p5c = new FederalTax(53500.0);
        boolean a5c = Math.abs(p5c.taxPaid() - 12107.0) < 0.000001;

        FederalTax p6c = new FederalTax(53500.01);
        boolean a6c = Math.abs(p6c.taxPaid() - 12107.0031) < 0.000001;

        FederalTax p7c = new FederalTax(115000.0);
        boolean a7c = Math.abs(p7c.taxPaid() - 31172.0) < 0.000001;

        FederalTax p8c = new FederalTax(115000.01);
        boolean a8c = Math.abs(p8c.taxPaid() - 31172.003599999996) < 0.000001;

        FederalTax p9c = new FederalTax(250000.0);
        boolean a9c = Math.abs(p9c.taxPaid() - 79772.0) < 0.000001;

        FederalTax p10c = new FederalTax(250000.01);
        boolean a10c = Math.abs(p10c.taxPaid() - 79772.00396) < 0.000001;

        boolean test3 = a1c && a2c && a3c && a4c && a5c && a6c && a7c && a8c && a9c && a10c;

        boolean allTestsPassed = test1 && test2 && test3;

        if (allTestsPassed) {
            System.out.println("All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }
    }
}