/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class TeamUniqueNameTest {
	public static void main(String[] args) {
		//Test Case 1a - default constructor
		System.out.println("Test Case 1a - default constructor");
		TeamUniqueName a = new TeamUniqueName();
		TeamUniqueName b = new TeamUniqueName();
		System.out.println("Team A:"+a.getName());
		System.out.println("Team B:"+b.getName());
		System.out.println("PASSED="+!a.getName().equals(b.getName())+"\n");

		//Test Case 1b - non-default constructor
		System.out.println("Test Case 1b - non-default constructor");
		TeamUniqueName c = new TeamUniqueName(1,1,"cubs");
		TeamUniqueName d = new TeamUniqueName(2,2,"cubs");
		System.out.println("Team C:"+c.getName());
		System.out.println("Team D:"+d.getName());
		System.out.println("PASSED="+!c.getName().equals(d.getName())+"\n");
	}
}