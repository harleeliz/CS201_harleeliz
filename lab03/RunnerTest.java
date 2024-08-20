/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class RunnerTest {
	public static void main(String[] args) {
		System.out.println("Test Case 1 - percentageSlower(), identical to world record");
		Runner r1 = new Runner("SameAsWorldRecord", 2, 1, 39);
		System.out.println("EXPECTED RESULT:0%");
		System.out.println("YOUR RESULT    :"+r1.percentageSlower());
		System.out.println("PASSED="+(r1.percentageSlower().equals("0%"))+"\n");

		System.out.println("Test Case 2 - percentageSlower(), double time of world record");
		Runner r2 = new Runner("DoubleWorldRecord", 4, 3, 18);
		System.out.println("EXPECTED RESULT:100%");
		System.out.println("YOUR RESULT    :"+r2.percentageSlower());
		System.out.println("PASSED="+(r2.percentageSlower().equals("100%"))+"\n");

		System.out.println("Test Case 3 - percentageSlower(), 1% faster than world record");
		Runner r3 = new Runner("1%FasterWorldRecord", 2, 0, 26);
		System.out.println("EXPECTED RESULT:-1%");
		System.out.println("YOUR RESULT    :"+r3.percentageSlower());
		System.out.println("PASSED="+(r3.percentageSlower().equals("-1%"))+"\n");

		System.out.println("Test Case 4 - Runner (String n, String data)");
		Runner r4 = new Runner("Bikila", "2:15:16");
		System.out.println("EXPECTED RESULT:Bikila");
		System.out.println("YOUR RESULT    :"+r4.getName());
		System.out.println("EXPECTED RESULT:11%");
		System.out.println("YOUR RESULT    :"+r4.percentageSlower());
		System.out.println("PASSED="+(r4.getName().equals("Bikila") && r4.percentageSlower().equals("11%"))+"\n");

		System.out.println("Test Case 5 - Runner (String n, String data)");
		Runner r5 = new Runner("Kosgei", "2:14:04");
		System.out.println("EXPECTED RESULT:Kosgei");
		System.out.println("YOUR RESULT    :"+r5.getName());
		System.out.println("EXPECTED RESULT:10%");
		System.out.println("YOUR RESULT    :"+r5.percentageSlower());
		System.out.println("PASSED="+(r5.getName().equals("Kosgei") && r5.percentageSlower().equals("10%"))+"\n");

		System.out.println("Test Case 6 - Runner (String n, String data) - null name");
		Runner r6 = new Runner(null, "4:29:54");
		System.out.println("EXPECTED RESULT:No Name Given");
		System.out.println("YOUR RESULT    :"+r6.getName());
		System.out.println("EXPECTED RESULT:122%");
		System.out.println("YOUR RESULT    :"+r6.percentageSlower());
		System.out.println("PASSED="+(r6.getName().equals("No Name Given") && r6.percentageSlower().equals("122%"))+"\n");
	}
}