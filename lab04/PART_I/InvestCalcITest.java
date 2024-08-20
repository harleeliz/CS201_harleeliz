/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class InvestCalcITest {
	public static void main(String[] args) {
		System.out.println("Test Case 1 - default constructor, toString");
		InvestCalcI value1 = new InvestCalcI();
		System.out.println("EXPECTED RESULT:Principal: $0.00 Interest rate: 0.00%");
		System.out.println("YOUR RESULT    :"+value1.toString());
		System.out.println("PASSED="+value1.toString().equals("Principal: $0.00 Interest rate: 0.00%")+"\n");

		System.out.println("Test Case 2 - non-default constructor, set* methods");
		InvestCalcI value2 = new InvestCalcI(.05, 10000);
		System.out.println("EXPECTED RESULT:Principal: $10,000.00 Interest rate: 5.00%");
		System.out.println("YOUR RESULT    :"+value2.toString());
		System.out.println("PASSED="+value2.toString().equals("Principal: $10,000.00 Interest rate: 5.00%"));
		value2.setRate(.075);
		value2.setPrincipal(50000);
		System.out.println("EXPECTED RESULT:Principal: $50,000.00 Interest rate: 7.50%");
		System.out.println("YOUR RESULT    :"+value2.toString());
		System.out.println("PASSED="+value2.toString().equals("Principal: $50,000.00 Interest rate: 7.50%")+"\n");

		System.out.println("Test Case 3 - futureValue");
		InvestCalcI value3 = new InvestCalcI();
		System.out.println("EXPECTED RESULT:0.0");
		System.out.println("YOUR RESULT    :"+value3.futureValue(1));
		System.out.println("PASSED="+(value3.futureValue(1)==0));
		value3.setRate(.05);
		value3.setPrincipal(10000);
		System.out.println("EXPECTED RESULT:10500.0");
		System.out.println("YOUR RESULT    :"+value3.futureValue(1));
		System.out.println("PASSED="+(value3.futureValue(1)==10500));
		System.out.println("EXPECTED RESULT:12762.815625000003");
		System.out.println("YOUR RESULT    :"+value3.futureValue(5));
		System.out.println("PASSED="+(Math.abs(value3.futureValue(5)-12762.815625000003)<.0000001)+"\n");

		System.out.println("Test Case 4 - getTable");
		InvestCalcI value4 = new InvestCalcI(.05, 10000);
		System.out.println("EXPECTED RESULT:\n$10,000.00;5.00%;5;$12,762.82\n$10,000.00;5.00%;10;$16,288.95\n$10,000.00;5.00%;20;$26,532.98\n");
		System.out.println("YOUR RESULT    :\n"+value4.getTable());
		System.out.println("PASSED="+(value4.getTable().equals("$10,000.00;5.00%;5;$12,762.82\n$10,000.00;5.00%;10;$16,288.95\n$10,000.00;5.00%;20;$26,532.98\n")));
		value4.setRate(.06);
		value4.setPrincipal(8000);
		System.out.println("EXPECTED RESULT:\n$8,000.00;6.00%;5;$10,705.80\n$8,000.00;6.00%;10;$14,326.78\n$8,000.00;6.00%;20;$25,657.08\n");
		System.out.println("YOUR RESULT    :\n"+value4.getTable());
		System.out.println("PASSED="+(value4.getTable().equals("$8,000.00;6.00%;5;$10,705.80\n$8,000.00;6.00%;10;$14,326.78\n$8,000.00;6.00%;20;$25,657.08\n")));

	}
}