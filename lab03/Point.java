/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class Point {
	//Instance global variables declaration
	private double x, y;

	//Global default variables declaration
	private static final double DEFAULT_COORDINATE=0;


	// default constructor
	public Point() {
		setX(DEFAULT_COORDINATE);
		setY(DEFAULT_COORDINATE);
	}



	//Overloaded constructor
	public Point(double newX, double newY) {
		setX(newX);
		setY(newY);
	}

	/** Accessor method getX()
	 *  returns the x */
	public double getX() { return x; }

	/** Accessor method getY()
	 *  returns the y */
	public double getY() { return y; }



	/* Mutator method  setX
	  Passes parameter x to newX */
	public void setX(double newX) {
		x=newX;
	}

	/* Mutator method  setY
	  Passes parameter y to newY */
	public void setY(double newY) {
		y=newY;
	}



	public double distanceToOrigin() {
		return Math.sqrt(x*x + y*y); }

	/* Method distanceTo() ---NOT USED IN THE TEST---
	* Point Local scope parameter
	* Constructs and initializes a point with the same location as the specified Point object. */
	public double distanceTo(Point otherPoint) {
		// Initialization and declaration of local scope variables
		double otherX=otherPoint.getX();
		double otherY=otherPoint.getY();
		// @return operation with Math.sqrt
		// x and y, class instance scope
		return Math.sqrt(Math.pow(x-otherX,2) + Math.pow(y-otherY,2));
	}


	/* Method whichQuadrant
	 * @return the number of the quadrant, depending on the test */
	public int whichQuadrant() {
		if (x > 0 && y > 0) {
			return 1;
		} else if (x < 0 && y > 0) {
			return 2;
		} else if (x < 0 && y < 0) {
			return 3;
		} else if (x > 0 && y < 0) {
			return 4;
		} else {
			return 0;
		}
	}

	/* Method toString
	 *  @return String
	 *  returns the values of x and y */
	public String toString() {
		return "("+x+", "+y+")"; }
}