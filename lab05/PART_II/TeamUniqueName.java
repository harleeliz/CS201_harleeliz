/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */


public class TeamUniqueName {
	private int wins, losses;
	private String name;
	private static final String DEFAULT_TEAM_NAME = "Default Team";
	private static int teamCounter = 1; // Counter for generating unique team names
	private static final int DEFAULT_WINS_LOSSES = 0;

	// Default constructor
	public TeamUniqueName() {
		setWinsLosses(DEFAULT_WINS_LOSSES, DEFAULT_WINS_LOSSES);
		setName(DEFAULT_TEAM_NAME);
	}

	// Overloaded constructor
	public TeamUniqueName(int w, int l, String n) {
		setWinsLosses(w, l);
		setName(n);
	}

	// Setter method for setting both wins and losses
	public void setWinsLosses(int w, int l) {
		setWins(w);
		setLosses(l);
	}

	// Setter method for wins with validation
	private void setWins(int w) {
		if (w >= 0) {
			wins = w;
		} else {
			wins = DEFAULT_WINS_LOSSES;
		}
	}

	// Setter method for losses with validation
	private void setLosses(int l) {
		if (l >= 0) {
			losses = l;
		} else {
			losses = DEFAULT_WINS_LOSSES;
		}
	}

	// Setter method for the team name with counter
	private void setName(String n) {
		if (n == null) {
			name = DEFAULT_TEAM_NAME;
		} else {
			// Append a counter to the team name
			name = n + "_" + teamCounter++;
		}
	}

	// Getter methods for wins, losses, and name
	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public String getName() {
		return name;
	}

	// Calculate and return winning percentage
	public double getWinningPercentage() {
		double winpct = 0;
		if (wins + losses > 0) {
			winpct = (double) wins / (wins + losses);
		}
		return winpct;
	}

	// Generate a string representation of the team
	public String toString() {
		String temp = name;
		double winpct = getWinningPercentage();
		if (Math.abs(winpct - 0.5) < 0.001) {
			temp = " 500 Team";
		} else if (winpct > 0.5) {
			temp = " Over 500 Team";
		} else {
			temp = " Under 500 Team";
		}
		return " Wins=" + wins + " Losses=" + losses + " PCT=" + winpct + temp;
	}
}