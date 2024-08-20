/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class InvestCalcTest2 {
	public static void main(String[] args) {
		System.out.print("Test Case 1 ");
		InvestCalc value1 = new InvestCalc(.07, 9999);
		boolean a1=value1.toString().equals("Principal: $9,999.00 Interest rate: 7.00%");
		boolean a2=(value1.futureValue(1)==10698.93);
		if (a1 && a2) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}	
		
		System.out.print("Test Case 2 ");
		InvestCalc value2 = new InvestCalc(.07, 10000);
		boolean a3=value2.toString().equals("Principal: $10,000.00 Interest rate: 7.00%");
		boolean a4=(value2.futureValue(1)==10750.0);
		if (a3 && a4) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}			
		
		System.out.print("Test Case 3 ");
		InvestCalc value3 = new InvestCalc(.07, 100000);
		boolean a5=value3.toString().equals("Principal: $100,000.00 Interest rate: 7.00%");
		boolean a6=(value3.futureValue(1)==107500.0);
		if (a5 && a6) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
	}
}