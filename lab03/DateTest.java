/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class DateTest {
	public static void main(String[] args) {
		System.out.println("Test Case 1 - check setDay aware of leapYear");
		Date d1 = new Date(2,29,2020);
		System.out.println("EXPECTED RESULT:2/29/2020");
		System.out.println("YOUR RESULT    :"+d1.toString());
		System.out.println("PASSED="+d1.toString().equals("2/29/2020"));

		Date d2 = new Date(2,29,2019);
		System.out.println("EXPECTED RESULT:2/1/2019");
		System.out.println("YOUR RESULT    :"+d2.toString());
		System.out.println("PASSED="+d2.toString().equals("2/1/2019")+"\n");


		System.out.println("Test Case 2 - daysLeftInMonth");
		Date d21 = new Date(2,29,2020);
		System.out.println("EXPECTED RESULT:0");
		System.out.println("YOUR RESULT    :"+d21.daysLeftInMonth());
		System.out.println("PASSED="+(d21.daysLeftInMonth()==0));

		Date d22 = new Date(2,29,2019);
		System.out.println("EXPECTED RESULT:27");
		System.out.println("YOUR RESULT    :"+d22.daysLeftInMonth());
		System.out.println("PASSED="+(d22.daysLeftInMonth()==27));

		Date d23 = new Date();
		System.out.println("EXPECTED RESULT:30");
		System.out.println("YOUR RESULT    :"+d23.daysLeftInMonth());
		System.out.println("PASSED="+(d23.daysLeftInMonth()==30));

		Date d24 = new Date(6,15,2020);
		System.out.println("EXPECTED RESULT:15");
		System.out.println("YOUR RESULT    :"+d24.daysLeftInMonth());
		System.out.println("PASSED="+(d24.daysLeftInMonth()==15)+"\n");


		System.out.println("Test Case 3 - incrementDay");
		Date d31 = new Date(2,28,2020);
		d31.incrementDay();
		System.out.println("EXPECTED RESULT:2/29/2020");
		System.out.println("YOUR RESULT    :"+d31.toString());
		System.out.println("PASSED="+d31.toString().equals("2/29/2020"));

		d31.incrementDay();
		System.out.println("EXPECTED RESULT:3/1/2020");
		System.out.println("YOUR RESULT    :"+d31.toString());
		System.out.println("PASSED="+d31.toString().equals("3/1/2020"));

		Date d32 = new Date(2,29,2019);
		d32.incrementDay();
		System.out.println("EXPECTED RESULT:2/2/2019");
		System.out.println("YOUR RESULT    :"+d32.toString());
		System.out.println("PASSED="+d32.toString().equals("2/2/2019"));

		Date d33 = new Date();
		d33.incrementDay();
		d33.incrementDay();
		d33.incrementDay();
		System.out.println("EXPECTED RESULT:1/4/2000");
		System.out.println("YOUR RESULT    :"+d33.toString());
		System.out.println("PASSED="+d33.toString().equals("1/4/2000"));

		Date d34 = new Date(12,31,2020);
		d34.incrementDay();
		System.out.println("EXPECTED RESULT:1/1/2021");
		System.out.println("YOUR RESULT    :"+d34.toString());
		System.out.println("PASSED="+d34.toString().equals("1/1/2021"));
	}
}