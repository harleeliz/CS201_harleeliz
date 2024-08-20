/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class InvestCalcIIITest {

    public static void main(String[] args) {
        // Test 1: default constructor
        InvestCalcIII v1 = new InvestCalcIII();
        boolean a1 = v1.toString().equals("Principal: $0.00 Interest rate: 0.00%");

        // Test 2: non-default constructor, both args OK
        InvestCalcIII v2 = new InvestCalcIII(0.05, 10000);
        boolean a2 = v2.toString().equals("Principal: $10,000.00 Interest rate: 5.00%");

        // Test 3: non-default constructor, both args NOT OK
        InvestCalcIII v3 = new InvestCalcIII(1.1, -1000);
        boolean a3 = v3.toString().equals("Principal: $0.00 Interest rate: 0.00%");

        // Test 4: non-default constructor, rate OK, income < 0
        InvestCalcIII v4 = new InvestCalcIII(0.5, -1000);
        boolean a4 = v4.toString().equals("Principal: $0.00 Interest rate: 50.00%");

        // Test 5: non-default constructor, rate < 0, income OK
        InvestCalcIII v5 = new InvestCalcIII(-0.05, 1000);
        boolean a5 = v5.toString().equals("Principal: $1,000.00 Interest rate: 0.00%");

        // Test 6: non-default constructor, rate >= 1, income OK
        InvestCalcIII v6 = new InvestCalcIII(1.01, 1000);
        boolean a6 = v6.toString().equals("Principal: $1,000.00 Interest rate: 0.00%");

        // Test 7: setRate, arg OK
        v6.setRate(0.001);
        boolean a7 = v6.toString().equals("Principal: $1,000.00 Interest rate: 0.10%");

        // Test 8: setRate, rate < 0
        v6.setRate(-0.001);
        boolean a8 = v6.toString().equals("Principal: $1,000.00 Interest rate: 0.00%");

        // Test 9: setRate, rate >= 1
        v6.setRate(1.001);
        boolean a9 = v6.toString().equals("Principal: $1,000.00 Interest rate: 0.00%");

        // Test 10: principal, arg OK
        v4.setPrincipal(222222);
        boolean a10 = v4.toString().equals("Principal: $222,222.00 Interest rate: 50.00%");

        // Test 11: principal, arg < 0
        v4.setPrincipal(-222222);
        boolean a11 = v4.toString().equals("Principal: $0.00 Interest rate: 50.00%");

        boolean result1 = a1 && a2 && a3 && a4 && a5 && a6 && a7 && a8 && a9 && a10 && a11;
        System.out.println("Tests 1-11: " + result1);

        // Test 12: futureValue method
        InvestCalcIII v7 = new InvestCalcIII(0.05, 10000);
        boolean a12_1 = v7.futureValue(-1) == 0;
        boolean a12_2 = v7.futureValue(0) == 10000.00;
        boolean a12_3 = v7.futureValue(1) == 10500.00;
        boolean a12_4 = v7.futureValue(5) == 12762.82;
        boolean a12_5 = v7.futureValue(4) == 12155.06;
        boolean result2 = a12_1 && a12_2 && a12_3 && a12_4 && a12_5;
        System.out.println("Test 12: " + result2);

        // Test 13: getTable method
        InvestCalcIII v8 = new InvestCalcIII(0.05, 10000);
        boolean a13_1 = v8.getTable(null).equals("");
        boolean a13_2 = v8.getTable("01,05,100").equals("");
        boolean a13_3 = v8.getTable("1,05,100").equals("");
        boolean a13_4 = v8.getTable("05,01,10").equals("");
        boolean a13_5 = v8.getTable("05,10,20").equals("$10,000.00;5.00%;5;$12,762.82\n$10,000.00;5.00%;10;$16,288.95\n$10,000.00;5.00%;20;$26,532.98\n");
        boolean result3 = a13_1 && a13_2 && a13_3 && a13_4 && a13_5;
        System.out.println("Test 13: " + result3);

        // Test 14: getLargeInvestmentCount
        boolean a0 = InvestCalcIII.getLargeInvestmentCount() == 0;
        // Test: Default object
        InvestCalcIII obj1 = new InvestCalcIII();
        boolean obj2 = InvestCalcIII.getLargeInvestmentCount() == 0;
        // Test: New object with principal equal to 10,000
        InvestCalcIII obj3 = new InvestCalcIII(0.05, 10000);
        boolean obj4 = InvestCalcIII.getLargeInvestmentCount() == 0;
        // Test: New object with principal less than 10,000
        InvestCalcIII obj5 = new InvestCalcIII(0.05, 9999.99);
        boolean obj6 = InvestCalcIII.getLargeInvestmentCount() == 0;
        // Test: New object with principal greater than 10,000
        InvestCalcIII obj7 = new InvestCalcIII(0.05, 10000.01);
        boolean obj8 = InvestCalcIII.getLargeInvestmentCount() == 1;
        boolean result4 = a0 && obj2 && obj4 && obj6 && obj8;
        System.out.println("Test 13: " + result4);
    }
}
