/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class InvestCalcTest1 {
	public static void main(String[] args) {
		System.out.println("Test Case 1 - setPrincipal");
		InvestCalc value61 = new InvestCalc(0,1000);
		System.out.println("EXPECTED RESULT:Principal: $1,000.00 Interest rate: 0.00%");
		System.out.println("YOUR RESULT    :"+value61.toString());
		System.out.println("PASSED="+value61.toString().equals("Principal: $1,000.00 Interest rate: 0.00%")+"\n");
		value61.setPrincipal(-1000);
		System.out.println("EXPECTED RESULT:Principal: $0.00 Interest rate: 0.00%");
		System.out.println("YOUR RESULT    :"+value61.toString());
		System.out.println("PASSED="+value61.toString().equals("Principal: $0.00 Interest rate: 0.00%")+"\n");

		System.out.println("Test Case 2 - setRate");
		InvestCalc value62 = new InvestCalc(0.5,1000);
		System.out.println("EXPECTED RESULT:Principal: $1,000.00 Interest rate: 50.00%");
		System.out.println("YOUR RESULT    :"+value62.toString());
		System.out.println("PASSED="+value62.toString().equals("Principal: $1,000.00 Interest rate: 50.00%")+"\n");
		value62.setRate(-.1);
		System.out.println("EXPECTED RESULT:Principal: $1,000.00 Interest rate: 0.00%");
		System.out.println("YOUR RESULT    :"+value62.toString());
		System.out.println("PASSED="+value62.toString().equals("Principal: $1,000.00 Interest rate: 0.00%")+"\n");

		System.out.println("Test Case 3 - non-default constructor");
		InvestCalc value63 = new InvestCalc(-0.5,-1000);
		System.out.println("EXPECTED RESULT:Principal: $0.00 Interest rate: 0.00%");
		System.out.println("YOUR RESULT    :"+value63.toString());
		System.out.println("PASSED="+value63.toString().equals("Principal: $0.00 Interest rate: 0.00%")+"\n");
		value63.setRate(.001);
		value63.setPrincipal(1000);
		System.out.println("EXPECTED RESULT:Principal: $1,000.00 Interest rate: 0.10%");
		System.out.println("YOUR RESULT    :"+value63.toString());
		System.out.println("PASSED="+value63.toString().equals("Principal: $1,000.00 Interest rate: 0.10%")+"\n");


	}
}