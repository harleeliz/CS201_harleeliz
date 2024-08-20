/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class AmusementParkRide {

    /**
     * Checks if the person is eligible to ride this roller coaster.
     * @param age: the rider's age in years
     * @param height: the rider's height in inches
     * @param withAdult: whether or not the person is with an adult
     * @return: true if the person is eligible for the ride, otherwise false
     */
    public static boolean checkRider(int age, int height, boolean withAdult) {
    	
    	return (age >= 12 && height >= 41) || withAdult;
    	

    }
	public static void main(String[] args) {
		System.out.print("Test Case 1 - age 12, height 41, adult false ");
		if (AmusementParkRide.checkRider(12,41,false)) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}

		System.out.print("Test Case 2 - age 12, height 41, adult true ");
		if (AmusementParkRide.checkRider(12,41,true)) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}

		
		// why they have !, this means not. should I remove this '!' ?
		System.out.print("Test Case 3 - age 11, height 41, adult false ");
		if (!AmusementParkRide.checkRider(11,41,false)) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}

		System.out.print("Test Case 4 - age 12, height 40, adult false ");
		if (!AmusementParkRide.checkRider(12,40,false)) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}

		System.out.print("Test Case 5 - age 11, height 40, adult false ");
		if (!AmusementParkRide.checkRider(11,40,false)) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
		
		
	
	}
}