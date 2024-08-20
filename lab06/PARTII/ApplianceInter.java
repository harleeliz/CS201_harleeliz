/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

// Define the ApplianceInter class, which is cloneable and Comparable
class ApplianceInter implements Cloneable, Comparable<ApplianceInter> {
    protected long applianceID;
    protected String name;
    protected int onWattage, offWattage;
    protected double probabilityOn;

    // Default constructor
    public ApplianceInter() {
        // Call the parameterized constructor with default values
        this(0L, "Name", 0, 0, 0.0);
    }

    // Parameterized constructor
    public ApplianceInter(long applianceID, String name, int onWattage, int offWattage, double probabilityOn) {
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

    // Method to clone an ApplianceInter object
    public ApplianceInter clone() throws CloneNotSupportedException {
        return (ApplianceInter) super.clone();
    }

    // Implement compareTo for custom sorting
    @Override
    public int compareTo(ApplianceInter other) {
        int onWattageComparison = Integer.compare(other.onWattage, this.onWattage);
        if (onWattageComparison == 0) {
            return Integer.compare(this.offWattage, other.offWattage);
        }
        return onWattageComparison;
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return "Loc=" + applianceID + " Name=" + name + " OnW=" + onWattage + " OffW=" + offWattage + " ProbOn=" + probabilityOn;
    }
}