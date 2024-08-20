/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

// Define the AppliancePoly class, which is cloneable
class AppliancePoly implements Cloneable {
    // Instance variables to store information about the appliance
    protected long applianceID;        // Unique appliance identifier
    protected String name;             // Name of the appliance
    protected int onWattage, offWattage; // Power consumption when turned on and off
    protected double probabilityOn;    // Probability that the appliance is turned on

    // Default constructor
    public AppliancePoly() {
        // Call the parameterized constructor with default values
        this(0L, "Name", 0, 0, 0.0);
    }

    // Parameterized constructor
    public AppliancePoly(long applianceID, String name, int onWattage, int offWattage, double probabilityOn) {
        // Set the values of the instance variables
        setApplianceID(applianceID);
        setName(name);
        setOnWattage(onWattage);
        setOffWattage(offWattage);
        setProbabilityOn(probabilityOn);
    }

    // Getter method for Appliance ID
    public long getApplianceID() {
        return applianceID;
    }

    // Setter method for Appliance ID
    public void setApplianceID(long applianceID) {
        this.applianceID = applianceID;
    }

    // Getter method for Appliance Name
    public String getName() {
        return name;
    }

    // Setter method for Appliance Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for On Wattage
    public int getOnWattage() {
        return onWattage;
    }

    // Setter method for On Wattage
    public void setOnWattage(int onWattage) {
        this.onWattage = onWattage;
    }

    // Getter method for Off Wattage
    public int getOffWattage() {
        return offWattage;
    }

    // Setter method for Off Wattage
    public void setOffWattage(int offWattage) {
        this.offWattage = offWattage;
    }

    // Getter method for Probability On
    public double getProbabilityOn() {
        return probabilityOn;
    }

    // Setter method for Probability On
    public void setProbabilityOn(double probabilityOn) {
        this.probabilityOn = probabilityOn;
    }

    // Method to clone an AppliancePoly object
    public AppliancePoly clone() throws CloneNotSupportedException {
        return (AppliancePoly) super.clone();
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return "Loc=" + applianceID + " Name=" + name + " OnW=" + onWattage + " OffW=" + offWattage + " ProbOn=" + probabilityOn;
    }
}
