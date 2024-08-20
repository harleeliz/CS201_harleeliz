/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */


public class ExpDecayTest1 {
	public static void main(String[] args) {

		System.out.print("Test Case 1 ");
		ExpDecayPartII value1 = new ExpDecayPartII(-.01,1);
		boolean a1=value1.toString().equals("Initial Quantity: 1.000000  Lambda: 0.050000");
		value1.setN0(-1.5);
		boolean a2=value1.toString().equals("Initial Quantity: 100.000000  Lambda: 0.050000");
		if (a1 && a2) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}

		System.out.print("Test Case 2 ");
		ExpDecayPartII value2 = new ExpDecayPartII(0.005,-1.5);
		boolean a3=value2.toString().equals("Initial Quantity: 100.000000  Lambda: 0.005000");
		value2.setLambda(-.001);
		boolean a4=value2.toString().equals("Initial Quantity: 100.000000  Lambda: 0.050000");
		if (a3 && a4) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}

		System.out.print("Test Case 3 ");
		ExpDecayPartII value3 = new ExpDecayPartII(-0.01,-1.5);
		boolean a5=value3.toString().equals("Initial Quantity: 100.000000  Lambda: 0.050000");
		value3.setLambda(.001);
		value3.setN0(1.25);
		boolean a6=value3.toString().equals("Initial Quantity: 1.250000  Lambda: 0.001000");
		if (a5 && a6) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
	}
}