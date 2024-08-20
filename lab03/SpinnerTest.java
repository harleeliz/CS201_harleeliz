/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */

public class SpinnerTest {
	public static void main(String[] args) {
		System.out.println("Test Case 1 - Testing Spinner constructor, setArrow, and toString");
		Spinner spinner1 = new Spinner();
		Spinner spinner2 = new Spinner(8);

		boolean a1 = spinner1.getArrow() >= 0 && spinner1.getArrow() < 10 &&
				spinner2.getArrow() >= 0 && spinner2.getArrow() < 8;

		spinner1.setArrow(6);
		spinner2.setArrow(2);

		boolean a2 = spinner1.getArrow() == 6 && spinner2.getArrow() == 2;
		boolean a3 = spinner1.toString().equals("Size=10 Arrow=6") &&
				spinner2.toString().equals("Size=8 Arrow=2");

		if (a1 && a2 && a3) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}

		System.out.println("Test Case 2 - Testing uniform randomness");
		int[] data = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		Spinner spinner3 = new Spinner();

		for (int i = 1; i <= 1000000; i++) {
			spinner3.spin();
			data[spinner3.getArrow()]++;
		}

		boolean a4 = true;
		for (int i = 0; i < 10; i++) {
			if (data[i] < 90000 || data[i] > 110000) {
				a4 = false;
				break;
			}
		}

		if (a4) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}
	}
}
