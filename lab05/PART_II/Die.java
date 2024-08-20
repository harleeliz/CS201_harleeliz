/* Lab Exercises No.5

Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

public class Die {
	private int side;
	private static final int SIDE_COUNT=6, DEFAULT_SIDE=1;
	private static int rolls = 0;
	private static int sum = 0;

	public Die() {
		setSide(DEFAULT_SIDE);
	}

	public Die(int newSide) {
		setSide(newSide);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int newSide) {     // OK not to verify argument is correct for now
		side=newSide;
	}

	public void roll() {
		side = (int)(Math.random()*SIDE_COUNT+1);
		rolls++;
		sum += side;
	}
	
    public static String getAverageRoll() {
        if (rolls == 0) {
            return "rolls=0";
        } else {
            double average = (double) sum / rolls;
            return "rolls=" + rolls + " avg=" + String.format("%.1f", average);
        }
    }

	public String toString( ) {
	    return "Die=" + side;
	  }
}