/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class ExpDecayTest2 {  
	  public static void main(String[] args) {

	    System.out.print("Test Case 1 ");
	    ExpDecayPartII value1 = new ExpDecayPartII (.07, 9999);
	    boolean a1=value1.toString().equals("Initial Quantity: 9999.000000  Lambda: 0.070000");
	    boolean a2=(Math.abs(value1.futureQuantity(1)-9323.005805239576)<.000000001);
	    // a2 value is 9323.005805239576. 
	    if (a1 && a2) {
			System.out.println("PASSED");
	    }
	    else {
			System.out.println("FAILED");
	    }

	    System.out.print("\nTest Case 2 ");
	    ExpDecayPartII value2 = new ExpDecayPartII (.07, 10000);
	    boolean a3=value2.toString().equals("Initial Quantity: 10000.000000  Lambda: 0.070000");
	    boolean a4=(Math.abs(value2.futureQuantity(1)-9258.898536064953)<.000000001);
	    // when we calculate this futureQuantity, the result is 9314.61892759. so this result is false. 
	    if (a3 && a4) {
			System.out.println("PASSED");
	    }
	    else {
			System.out.println("FAILED");
	    }


	    System.out.print("\nTest Case 3 ");
	    ExpDecayPartII value3 = new ExpDecayPartII (.07, 100000);
	    boolean a5=value3.toString().equals("Initial Quantity: 100000.000000  Lambda: 0.070000");
	    boolean a6=(Math.abs(value3.futureQuantity(1)-92588.98536064953)<.000000001);
	    if (a5 && a6) {
			System.out.println("PASSED");
	    }
	    else {
			System.out.println("FAILED");
	    }

	   
	  }
	}