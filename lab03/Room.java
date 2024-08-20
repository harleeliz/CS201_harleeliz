/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */

public class Room {
	//Instance global variables declaration
	private double length, width, height;

	//Global default variables declaration
	private static final double DEFAULT_DIMENSION=10, DEFAULT_WINDOW_WIDTH=3, DEFAULT_WINDOW_HEIGHT=6, DEFAULT_DOOR_WIDTH=3, DEFAULT_DOOR_HEIGHT=8;

	// Default Constructor: Sets length, width, height to 10 (the default DEFAULT_DIMENSION)
	public Room() {
		setLength(DEFAULT_DIMENSION);
		setWidth(DEFAULT_DIMENSION);
		setHeight(DEFAULT_DIMENSION);
	}

	/*Overloaded constructor
	 * @param newLength   initial value for length
	 * @param newWidth  initial value for width
	 * @param newHeight initial value for height
	 *             passes parameters to setLength, setWidth and setHeight methods */
	public Room(double newLength, double newWidth, double newHeight) {
		setLength(newLength);
		setWidth(newWidth);
		setHeight(newHeight);
	}

	//accessor method --> returns the length
	public double getLength() { return length; }


	//accessor method --> returns the width
	public double getWidth() { return width; }


	//accessor method --> returns the height
	public double getHeight() { return height; }


	/** Worker method getFloorArea (public) - It is not used
	 *  returns the value of the operation length*width */
	public double getFloorArea() {
		return length*width;
	}


	/* Mutator method  setLength
	 * @param newLength  new value for length.
	 * Use the if statement for test if the value of newLength  is higher than 0
	 * If that it's true length will return the  new value for length
	 * If it's false it will turn the length back to the default value of 10 */
	public void setLength(double newLength) {
		if (newLength>0) {
			length=newLength;
		}
		else {
			length=DEFAULT_DIMENSION;
		}
	}

	/* Mutator method  setWidth
	 * @param newWidth   new value for width.
	 * Use the if statement for test if the value of newWidth is higher than 0
	 * If that it's true width will return the  new value for width
	 * If it's false it will turn the width back to the default value of 10 */
	public void setWidth(double newWidth) {
		if (newWidth>0) {
			width=newWidth;
		}
		else {
			width=DEFAULT_DIMENSION;
		}
	}

	/* Mutator method  setHeight
	 * @param newHeight   new value for height.
	 * Use the if statement for test if the value of newHeight  is higher than 0
	 * If that it's true height. will return the  new value for height.
	 * If it's false it will turn the height. back to the default value of 10 */
	public void setHeight(double newHeight) {
		if (newHeight>0) {
			height=newHeight;
		}
		else {
			height=DEFAULT_DIMENSION;
		}
	}

	//CODE ADDED
	public double getWallArea(int windowCount, int doorCount) {
		double windowArea = windowCount * (DEFAULT_WINDOW_WIDTH * DEFAULT_WINDOW_HEIGHT);
		double doorArea = doorCount * (DEFAULT_DOOR_WIDTH * DEFAULT_DOOR_HEIGHT);
		double totalWallArea = 2 * (length * height + width * height);
		return totalWallArea - (windowArea + doorArea);
	}

	// CODE ADDED
	public double getMoldingLength(int windowCount, int doorCount) {
		double windowPerimeter = windowCount * (2 * (DEFAULT_WINDOW_WIDTH + DEFAULT_WINDOW_HEIGHT));
		double doorPerimeter = doorCount * (2 * (DEFAULT_DOOR_WIDTH + DEFAULT_DOOR_HEIGHT));
		double roomPerimeter =  length + width- DEFAULT_DOOR_WIDTH;
		return 2* roomPerimeter + windowPerimeter + doorPerimeter;
	}


	/*Method toString
	 * @return String
	 * returns length + "x" + width + "x" + height */
	public String toString() {
		return length + "x" + width + "x" + height;
	}

}


