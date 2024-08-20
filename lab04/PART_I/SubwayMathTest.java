/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class SubwayMathTest {
    public static void main(String[] args) {
        System.out.println("Test Case 1 - default constructor, toString");
        SubwayMath value1 = new SubwayMath();
        System.out.println("EXPECTED RESULT:Bonus: 15.0% Ride Cost: $2.00");
        System.out.println("YOUR RESULT    :"+value1.toString());
        System.out.println("PASSED="+value1.toString().equals("Bonus: 15.0% Ride Cost: $2.00")+"\n");

		System.out.println("Test Case 2 - non-default constructor, set* methods");
		SubwayMath value2 = new SubwayMath(.07, 1.25);
		System.out.println("EXPECTED RESULT:Bonus: 7.0% Ride Cost: $1.25");
		System.out.println("YOUR RESULT    :"+value2.toString());
		System.out.println("PASSED="+value2.toString().equals("Bonus: 7.0% Ride Cost: $1.25"));
		value2.setBonus(.1);
		value2.setRideCost(1.50);
		System.out.println("EXPECTED RESULT:Bonus: 10.0% Ride Cost: $1.50");
		System.out.println("YOUR RESULT    :"+value2.toString());
		System.out.println("PASSED="+value2.toString().equals("Bonus: 10.0% Ride Cost: $1.50")+"\n");

		System.out.println("Test Case 3 - optimalAmount");
		SubwayMath value3 = new SubwayMath();
		System.out.println("EXPECTED RESULT:34.79");
		System.out.println("YOUR RESULT    :"+value3.optimalAmount(20));
		System.out.println("PASSED="+(value3.optimalAmount(20)==34.79));
		value3.setBonus(.1);
		value3.setRideCost(1.50);
		System.out.println("EXPECTED RESULT:27.28");
		System.out.println("YOUR RESULT    :"+value3.optimalAmount(20));
		System.out.println("PASSED="+(value3.optimalAmount(20)==27.28));

		System.out.println("Test Case 4 - optimalAmount(2 arguments)");
		SubwayMath value4 = new SubwayMath();
		System.out.println("EXPECTED RESULT:$17.40,$34.79");
		System.out.println("YOUR RESULT    :"+value4.optimalAmount(10,20));
		System.out.println("PASSED="+(value4.optimalAmount(10,20).equals("$17.40,$34.79")));
		value4.setBonus(.1);
		value4.setRideCost(1.50);
		System.out.println("EXPECTED RESULT:$13.64,$27.28");
		System.out.println("YOUR RESULT    :"+value4.optimalAmount(10,20));
		System.out.println("PASSED="+(value4.optimalAmount(10,20).equals("$13.64,$27.28")));

    }
}