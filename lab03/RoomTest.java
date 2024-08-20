/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class RoomTest {
	public static void main(String[] args) {
		System.out.println("Test Case 1 - default room, getWallArea");
		Room a1 = new Room();
		System.out.println("EXPECTED RESULT:376.0");
		System.out.println("YOUR RESULT    :"+a1.getWallArea(0,1));
		System.out.println("PASSED="+(a1.getWallArea(0,1)==376));
		System.out.println("EXPECTED RESULT:358.0");
		System.out.println("YOUR RESULT    :"+a1.getWallArea(1,1));
		System.out.println("PASSED="+(a1.getWallArea(1,1)==358));
		System.out.println("EXPECTED RESULT:340.0");
		System.out.println("YOUR RESULT    :"+a1.getWallArea(2,1));
		System.out.println("PASSED="+(a1.getWallArea(2,1)==340));
		System.out.println("EXPECTED RESULT:316.0");
		System.out.println("YOUR RESULT    :"+a1.getWallArea(2,2));
		System.out.println("PASSED="+(a1.getWallArea(2,2)==316)+"\n");	

		System.out.println("Test Case 2 - non-default room, getWallArea");
		Room a2 = new Room(12,15,10);
		System.out.println("EXPECTED RESULT:516.0");
		System.out.println("YOUR RESULT    :"+a2.getWallArea(0,1));
		System.out.println("PASSED="+(a2.getWallArea(0,1)==516));
		System.out.println("EXPECTED RESULT:498.0");
		System.out.println("YOUR RESULT    :"+a2.getWallArea(1,1));
		System.out.println("PASSED="+(a2.getWallArea(1,1)==498));
		System.out.println("EXPECTED RESULT:480.0");
		System.out.println("YOUR RESULT    :"+a2.getWallArea(2,1));
		System.out.println("PASSED="+(a2.getWallArea(2,1)==480));
		System.out.println("EXPECTED RESULT:456.0");
		System.out.println("YOUR RESULT    :"+a2.getWallArea(2,2));
		System.out.println("PASSED="+(a2.getWallArea(2,2)==456)+"\n");	

		System.out.println("Test Case 3 - default room, getMoldingLength");
		Room a3 = new Room();
		System.out.println("EXPECTED RESULT:56.0");
		System.out.println("YOUR RESULT    :"+a3.getMoldingLength(0,1));
		System.out.println("PASSED="+(a3.getMoldingLength(0,1)==56));
		System.out.println("EXPECTED RESULT:74.0");
		System.out.println("YOUR RESULT    :"+a3.getMoldingLength(1,1));
		System.out.println("PASSED="+(a3.getMoldingLength(1,1)==74));
		System.out.println("EXPECTED RESULT:92.0");
		System.out.println("YOUR RESULT    :"+a3.getMoldingLength(2,1));
		System.out.println("PASSED="+(a3.getMoldingLength(2,1)==92));
		System.out.println("EXPECTED RESULT:108.0");
		System.out.println("YOUR RESULT    :"+a3.getMoldingLength(2,2));
		System.out.println("PASSED="+(a3.getMoldingLength(2,2)==108)+"\n");			

		System.out.println("Test Case 4 - non-default room, getMoldingLength");
		Room a4 = new Room(12,15,10);
		System.out.println("EXPECTED RESULT:70.0");
		System.out.println("YOUR RESULT    :"+a4.getMoldingLength(0,1));
		System.out.println("PASSED="+(a4.getMoldingLength(0,1)==70));
		System.out.println("EXPECTED RESULT:88.0");
		System.out.println("YOUR RESULT    :"+a4.getMoldingLength(1,1));
		System.out.println("PASSED="+(a4.getMoldingLength(1,1)==88));
		System.out.println("EXPECTED RESULT:106.0");
		System.out.println("YOUR RESULT    :"+a4.getMoldingLength(2,1));
		System.out.println("PASSED="+(a4.getMoldingLength(2,1)==106));
		System.out.println("EXPECTED RESULT:122.0");
		System.out.println("YOUR RESULT    :"+a4.getMoldingLength(2,2));
		System.out.println("PASSED="+(a4.getMoldingLength(2,2)==122)+"\n");

}
}