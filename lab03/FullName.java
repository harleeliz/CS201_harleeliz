/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class FullName {

	//Global instance variables declaration
	private String first, middle, last;

	//Global default variables declaration
	private static final String DEFAULT_NAMEPART = "MISSING";

	/* Default Constructor FullName()
	* Sets First, Middle and Last to "MISSING" (the default) */
	public FullName() {
		setFirst(DEFAULT_NAMEPART);
		setMiddle(DEFAULT_NAMEPART);
		setLast(DEFAULT_NAMEPART);
	}

	/*Overloaded constructor 1 FullName (public)  --For the instances without middle name
	 * @param newFirst  initial value for first name
	 * @param newLast   initial value for last name
	 * initial value for Middle "" */
	public FullName(String newFirst, String newLast) {
		setFirst(newFirst);
		setMiddle("");
		setLast(newLast);
	}

	/*Overloaded constructor 2 FullName (public)
	 * @param newFirst  initial value for first name
	 * @param newMiddle initial value for middle name
	 * @param newLast   initial value for last name*/
	public FullName(String newFirst, String newMiddle, String newLast) {
		setFirst(newFirst);
		setMiddle(newMiddle);
		setLast(newLast);
	}

	//accessor method --> returns the first name
	public String getFirst() {
		return first;
	}

	//accessor method --> returns the middle name
	public String getMiddle() {
		return middle;
	}
	//accessor method --> returns the last name
	public String getLast() {
		return last;
	}

	/** Helper method setFirst (public)
	 * @param newFirst new value for first name
	 *  if first is null or its length is less or equal than 0, sets first to "MISSING"
	 *  otherwise, sets first to newFirst value*/
	public void setFirst(String newFirst) {
		if (newFirst == null || newFirst.length() <= 0) {
			first = DEFAULT_NAMEPART;
		} else {
			first = newFirst;
		}
	}

	/** Helper method setMiddle(public)
	 * @param newMiddle new value for middle name
	 *  if middle is null, sets middle to "MISSING"
	 *  otherwise, sets middle to newMiddle value*/
	public void setMiddle(String newMiddle) {
		if (newMiddle == null) {
			middle = DEFAULT_NAMEPART;
		} else {
			middle = newMiddle;
		}
	}

	/** Helper method setLast (public)
	 * @param newLast new value for last name
	 *  if last is null or its length is less or equal than 0, sets last to "MISSING"
	 *  otherwise, sets last to newLast value*/
	public void setLast(String newLast) {
		if (newLast == null || newLast.length() <= 0) {
			last = DEFAULT_NAMEPART;
		} else {
			last = newLast;
		}
	}

	/* Method getInitials()
	* This method first check if the middle name is empty, if that is true it returns the symbol "*"
	* If the if statement is false, it will perform the substring starting from the first character (index 0) and
	ending before the second character (index 1) of the first name, middle name and last name, in other words
	it will only extract the first letter of each name.
	 */
	public String getInitials() {
		if (middle.isEmpty()) {
			middle = "*";
		}
		return first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1);
	}


	/* Method String getUserId()
        This method works for all test cases except for 8 and 9.
        * In test 8, the expected last name is smit instead of smith (h is missing),
        * In test 9, the expected last name is rog instead of rogers (ers is missing),
        * In order match the expected result, is necessary an If to modify the method for both cases individually. */
	public String getUserId(int length) {
		return
				(( first.substring(0,1) + last + "12345678").substring(0,length)).toLowerCase();
	}


	/*Method toString
	 * @return String
	 * returns "last + ", " + first + " " + middle*/
	public String toString() {
		return last + ", " + first + " " + middle;
	}
}


