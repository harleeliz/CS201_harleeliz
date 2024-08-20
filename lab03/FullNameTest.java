/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class FullNameTest {
    public static void main(String[] args) {
        FullName a1 = new FullName("John", "Quincy", "Public");
        FullName a2 = new FullName("Jane", "Smith");
        FullName a3 = new FullName("", "G.", "Rogers");
        FullName a4 = new FullName("Fred", "August", "");
        FullName a5 = new FullName("", "Ann", "");
        FullName a6 = new FullName("", "", "");

        System.out.println("Test Case 1 - getInitials\n");
        System.out.println("EXPECTED RESULT: JQP");
        System.out.println("YOUR RESULT    : " + a1.getInitials());
        System.out.println("PASSED=" + a1.getInitials().equals("JQP"));

        System.out.println("EXPECTED RESULT: J*S");
        System.out.println("YOUR RESULT    : " + a2.getInitials());
        System.out.println("PASSED=" + a2.getInitials().equals("J*S"));

        System.out.println("EXPECTED RESULT: MGR");
        System.out.println("YOUR RESULT    : " + a3.getInitials());
        System.out.println("PASSED=" + a3.getInitials().equals("MGR"));

        System.out.println("EXPECTED RESULT: FAM");
        System.out.println("YOUR RESULT    : " + a4.getInitials());
        System.out.println("PASSED=" + a4.getInitials().equals("FAM"));

        System.out.println("EXPECTED RESULT: MAM");
        System.out.println("YOUR RESULT    : " + a5.getInitials());
        System.out.println("PASSED=" + a5.getInitials().equals("MAM"));

        System.out.println("EXPECTED RESULT: M*M");
        System.out.println("YOUR RESULT    : " + a6.getInitials());
        System.out.println("PASSED=" + a6.getInitials().equals("M*M"));


        System.out.println("\nTest Case 2 - getUserid\n");
        System.out.println("EXPECTED RESULT: jpubli");
        System.out.println("YOUR RESULT    : " + a1.getUserId(6));
        System.out.println("PASSED=" + a1.getUserId(6).equals("jpubli"));


        /* This case and the following return a false output
        The Method String getUserId() method works for all test cases except for 8 and 9.
        * In test 8, the expected last name is smit instead of smith (h is missing),
        * In test 9, the expected last name is rog instead of rogers (ers is missing),
        * In order match the expected result, is necessary an If to modify the method for both cases individually. */
        System.out.println("EXPECTED RESULT: jsmit1");
        System.out.println("YOUR RESULT    : " + a2.getUserId(6));
        System.out.println("PASSED=" + a2.getUserId(6).equals("jsmit1"));

        System.out.println("EXPECTED RESULT: mrog1234");
        System.out.println("YOUR RESULT    : " + a3.getUserId(8));
        System.out.println("PASSED=" + a3.getUserId(8).equals("mrog1234"));

        System.out.println("EXPECTED RESULT: fmissi");
        System.out.println("YOUR RESULT    : " + a4.getUserId(6));
        System.out.println("PASSED=" + a4.getUserId(6).equals("fmissi"));

        System.out.println("EXPECTED RESULT: mmissi");
        System.out.println("YOUR RESULT    : " + a5.getUserId(6));
        System.out.println("PASSED=" + a5.getUserId(6).equals("mmissi"));

    }

}


