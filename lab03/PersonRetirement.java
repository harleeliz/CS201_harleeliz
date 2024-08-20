/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */

import java.time.Year; //Since we changed the set the current year this Standard Java Library is not being used

public class PersonRetirement {

    //Instance global variables declaration
    private int birthYear;
    private String employeeID;

    //Global default variables declaration
    public static final int AGE_PLUS_SERVICE_LEVEL = 85, DEFAULT_BIRTH_YEAR = 1900;
    public static final String DEFAULT_EMPLOYEE_ID = "A0001920";


    // Default Constructor: Sets birthYear to 1900, employeeID to A0001920 (the default)
    public PersonRetirement() {

        this(DEFAULT_EMPLOYEE_ID, DEFAULT_BIRTH_YEAR);
    }

    // Method PersonRetirement : Non-default constructor
    public PersonRetirement(String employeeID, int birthYear) {
        this.employeeID = employeeID;
        this.birthYear = birthYear;
    }

    // Accessor method for employee ID
    public String getID() {
        return employeeID;
    }

    // Mutator method for employee ID
    public void setID(String employeeID) {
        this.employeeID = employeeID;
    }

    // Accessor method for birth year
    public int getBirthYear() {
        return birthYear;
    }

    // Mutator method for birth year
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /* Accessor Method getStartYear()
    * The substring position was changed from the original values (1, 5) to (4, 8)
    in order to extract the year from the Employee ID
    * We erased the addition of the birthYear because it was irrelevant in the @return value of the method */
    public int getStartYear() {
        return Integer.parseInt(employeeID.substring(4, 8));
    }


    /* Method yearsToRetirement()
    *CurrentYear was changed to 2021 from the previous currentYear = Year.now().getValue(); due to comments on Discord
    * The formula for calculating yearToRetirement was modified.
    * It is included the division by 2, given that either the age and years of service grows by multiples of two.*/
    public double yearsToRetirement() {
        int DEFAULT_CURRENT_YEAR=2021;
        int age = DEFAULT_CURRENT_YEAR - birthYear;
        int yearsOfService = DEFAULT_CURRENT_YEAR - getStartYear();
        double result = AGE_PLUS_SERVICE_LEVEL - (age + yearsOfService);
        //The if statement check If the result is higher than 85, then returns the result
        // If not will divide the result by 2
        if (result > AGE_PLUS_SERVICE_LEVEL) {
            return result;}
        return result/2;
    }

    /*Method toString
     * @return String
     * returns "ID:" + employeeID + " BirthYear:" + birthYear*/
    public String toString() {
        return "ID:" + employeeID + " BirthYear:" + birthYear;
    }
}
