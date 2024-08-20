/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class DateTest {
	public static void main(String[] args) {

		System.out.print("Test Case 1 ");
		Date d1=new Date(1, 1, 2001);
		if (!d1.leapYear()) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}	

		System.out.print("Test Case 2 ");
		Date d2=new Date(1, 1, 2004);
		if (d2.leapYear()) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}		

		System.out.print("Test Case 3 ");
		Date d3=new Date(1, 1, 1900);
		if (!d3.leapYear()) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}		

		System.out.print("Test Case 4 ");
		Date d4=new Date(1, 1, 2000);
		if (d4.leapYear()) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		} 
	}
}