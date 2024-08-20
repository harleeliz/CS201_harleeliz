/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class House {
    // Constants to define pricing multipliers
    private static final int DEFAULT_SQ_FOOTAGE = 1000;
    private static final int DEFAULT_NUM_BEDROOMS = 1;
    private static final double MULTIPLIER_2_OR_LESS = 1.0;
    private static final double MULTIPLIER_3_BEDROOMS = 1.5;
    private static final double MULTIPLIER_MORE_THAN_3 = 2.0;

    // Instance attributes for a House object
    private int sqFootage;      // Square footage of the house
    private int numBedrooms;    // Number of bedrooms in the house

    // Constructors
    public House() {
        // Default constructor, initializes a house with default values
        setSqFootage(DEFAULT_SQ_FOOTAGE);
        setNumBedrooms(DEFAULT_NUM_BEDROOMS);
    }

    public House(int sqFootage, int numBedrooms) {
        // Constructor with parameters, allows customization of square footage and bedrooms
        setSqFootage(sqFootage);
        setNumBedrooms(numBedrooms);
    }

    // Getter and setter methods with data range checking
    public int getSqFootage() {
        return sqFootage;
    }

    public void setSqFootage(int sqFootage) {
        // Set square footage if it's greater than 0; otherwise, use the default value
        if (sqFootage > 0) {
            this.sqFootage = sqFootage;
        } else {
            this.sqFootage = DEFAULT_SQ_FOOTAGE;
        }
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        // Set the number of bedrooms if it's greater than 0; otherwise, use the default value
        if (numBedrooms > 0) {
            this.numBedrooms = numBedrooms;
        } else {
            this.numBedrooms = DEFAULT_NUM_BEDROOMS;
        }
    }

    // Method to calculate and return the estimated price based on square footage and bedrooms
    public double price() {
        double multiplier;
        if (numBedrooms <= 2) {
            multiplier = MULTIPLIER_2_OR_LESS;
        } else if (numBedrooms == 3) {
            multiplier = MULTIPLIER_3_BEDROOMS;
        } else {
            multiplier = MULTIPLIER_MORE_THAN_3;
        }

        // Calculate the estimated price using the provided formula
        return sqFootage * multiplier * 100;
    }

    // toString method to return a formatted string representation of a House object
    @Override
    public String toString() {
        return "SqFootage=" + sqFootage + " #Bedrooms=" + numBedrooms;
    }
}
