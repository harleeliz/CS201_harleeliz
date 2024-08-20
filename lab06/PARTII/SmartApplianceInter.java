/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

// This class represents a Smart Appliance that extends the ApplianceInter class.
class SmartApplianceInter extends ApplianceInter {
    private double reducePercentage;

    // Default constructor for SmartApplianceInter.
    public SmartApplianceInter() {
        // Call the constructor of the parent class (ApplianceInter).
        super();
        // Initialize the reducePercentage to 0.0 by default.
        this.reducePercentage = 0.0;
    }

    // Parameterized constructor for SmartApplianceInter.
    public SmartApplianceInter(long applianceID, String name, int onWattage, int offWattage, double probabilityOn, double reducePercentage) {
        // Call the constructor of the parent class (ApplianceInter) with specified parameters.
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

    // Override the clone method to create a copy of the SmartApplianceInter object.
    @Override
    public SmartApplianceInter clone() throws CloneNotSupportedException {
        return (SmartApplianceInter) super.clone();
    }

    // Override the toString method to provide a string representation of the SmartApplianceInter object.
    @Override
    public String toString() {
        // Call the parent class's toString method and append the reduce percentage.
        return super.toString() + " Reduce%=" + reducePercentage;
    }
}