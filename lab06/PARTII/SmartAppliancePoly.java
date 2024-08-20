/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/

package PARTII;

// Import the AppliancePoly class if it's not in the same package or a part of your project.

// This class represents a Smart Appliance that extends the AppliancePoly class.
class SmartAppliancePoly extends AppliancePoly {
    // Private instance variable to store the reduce percentage.
    private double reducePercentage;

    // Default constructor for SmartAppliancePoly.
    public SmartAppliancePoly() {
        // Call the constructor of the parent class (AppliancePoly).
        super();
        // Initialize the reducePercentage to 0.0 by default.
        this.reducePercentage = 0.0;
    }

    // Parameterized constructor for SmartAppliancePoly.
    public SmartAppliancePoly(long applianceID, String name, int onWattage, int offWattage, double probabilityOn, double reducePercentage) {
        // Call the constructor of the parent class (AppliancePoly) with specified parameters.
        super(applianceID, name, onWattage, offWattage, probabilityOn);
        // Set the reducePercentage using the provided value.
        setReducePercentage(reducePercentage);
    }

    // Getter method to retrieve the reduce percentage.
    public double getReducePercentage() {
        return reducePercentage;
    }

    // Setter method to set the reduce percentage.
    public void setReducePercentage(double reducePercentage) {
        this.reducePercentage = reducePercentage;
    }

    // Override the clone method to create a copy of the SmartAppliancePoly object.
    @Override
    public SmartAppliancePoly clone() throws CloneNotSupportedException {
        return (SmartAppliancePoly) super.clone();
    }

    // Override the toString method to provide a string representation of the SmartAppliancePoly object.
    @Override
    public String toString() {
        // Call the parent class's toString method and append the reduce percentage.
        return super.toString() + " Reduce%=" + reducePercentage;
    }
}
