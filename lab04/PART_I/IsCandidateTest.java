/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class IsCandidateTest {

    public static void main(String[] args) {

        System.out.println("Test Case 1 - all OK 1100 2.5 16");
        IsCandidate candidate1 = new IsCandidate(1100, 2.5, 16);
        System.out.println("EXPECTED RESULT:SatScore: 1100, GPA: 2.5, Age: 16");
        System.out.println("YOUR RESULT    :"+candidate1.toString());
        System.out.println("PASSED="+candidate1.IsACandidate()+"\n");

        System.out.println("Test Case 2 - age not greater that 15");
        IsCandidate candidate2 = new IsCandidate(1100, 2.5, 15);
        System.out.println("EXPECTED RESULT:SatScore: 1100, GPA: 2.5, Age: 15");
        System.out.println("YOUR RESULT    :"+candidate2.toString());
        System.out.println("PASSED="+candidate2.IsACandidate()+"\n");

        System.out.println("Test Case 3 - gpa less than 2.5");
        IsCandidate candidate3 = new IsCandidate(1100, 2.4, 16);
        System.out.println("EXPECTED RESULT:SatScore: 1100, GPA: 2.4, Age: 16");
        System.out.println("YOUR RESULT    :"+candidate3.toString());
        System.out.println("PASSED="+candidate3.IsACandidate()+"\n");

        System.out.println("Test Case 4 - satScore less than 1110");
        IsCandidate candidate4 = new IsCandidate(1009, 2.5, 16);
        System.out.println("EXPECTED RESULT:SatScore: 1009, GPA: 2.5, Age: 16");
        System.out.println("YOUR RESULT    :"+candidate4.toString());
        System.out.println("PASSED="+candidate4.IsACandidate()+"\n");

        System.out.println("Test Case 5 - gpa less than 2.5 AND age not greater than 15");
        IsCandidate candidate5 = new IsCandidate(1100, 2.4, 15);
        System.out.println("EXPECTED RESULT:SatScore: 1100, GPA: 2.4, Age: 15");
        System.out.println("YOUR RESULT    :"+candidate5.toString());
        System.out.println("PASSED="+candidate5.IsACandidate()+"\n");

        System.out.println("Test Case 6 - satScore less than 1110 AND gpa less than 2.5");
        IsCandidate candidate6 = new IsCandidate(1009, 2.4, 16);
        System.out.println("EXPECTED RESULT:SatScore: 1009, GPA: 2.4, Age: 16");
        System.out.println("YOUR RESULT    :"+candidate6.toString());
        System.out.println("PASSED="+candidate6.IsACandidate()+"\n");

    }
}
