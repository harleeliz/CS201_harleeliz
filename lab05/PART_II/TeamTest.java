/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class TeamTest {
	public static void main(String[] args) {
		Team a = new Team();
		boolean a1 = (Team.getMaxWinningPercentage() == 0);
		System.out.println(Team.getMaxWinningPercentage());

		Team b = new Team(5, 5, "Team b");
		boolean a2 = (Team.getMaxWinningPercentage() == 0.5);
		System.out.println(Team.getMaxWinningPercentage());

		Team c = new Team(6, 5, "Team c");
		boolean a3 = (Team.getMaxWinningPercentage() == 0.5454545454545454);
		System.out.println(Team.getMaxWinningPercentage());

		Team d = new Team(5, 6, "Team d");
		boolean a4 = (Team.getMaxWinningPercentage() == 0.5454545454545454);
		System.out.println(Team.getMaxWinningPercentage());

		boolean testResult = a1 && a2 && a3 && a4;
		System.out.println("Test Result: " + testResult);
	}
}