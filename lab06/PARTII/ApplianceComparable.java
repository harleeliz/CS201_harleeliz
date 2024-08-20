/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

public class ApplianceComparable implements Comparable<ApplianceComparable> {
    protected long applianceID;
    protected String name;
    protected int onWattage, offWattage;
    protected double probabilityOn;

    // Default constructor
    public ApplianceComparable() {
        // Default constructor
    }

    // Parameterized constructor
    public ApplianceComparable(long applianceID, String name, int onWattage, int offWattage, double probabilityOn) {
        setApplianceID(applianceID);
        setName(name);
        setOnWattage(onWattage);
        setOffWattage(offWattage);
        setProbabilityOn(probabilityOn);
    }

    public long getApplianceID() {
        return applianceID;
    }

    public void setApplianceID(long applianceID) {
        this.applianceID = applianceID;
    }


    //Getter method to get the Name
    public String getName() {
        return name;
    }

    //Setter method to set the Name
    public void setName(String name) {
        this.name = name;
    }

    //Getter method to ge the OnWattage
    public int getOnWattage() {
        return onWattage;
    }
    //Setter method to set the onWattage
    public void setOnWattage(int onWattage) {
        this.onWattage = onWattage;
    }
    //Getter method to get the OffWattage
    public int getOffWattage() {
        return offWattage;
    }
    //Setter method to set the offWattage
    public void setOffWattage(int offWattage) {
        this.offWattage = offWattage;
    }
    //Getter method to get the ProbabilityOn
    public double getProbabilityOn() {
        return probabilityOn;
    }
    //Setter method to set the ProbabilityOn
    public void setProbabilityOn(double probabilityOn) {
        this.probabilityOn = probabilityOn;
    }

    // Implementing the compareTo method for sorting
    @Override
    public int compareTo(ApplianceComparable other) {
        int onWattageComparison = Integer.compare(other.onWattage, this.onWattage);
        if (onWattageComparison == 0) {
            // If onWattage is the same, compare offWattage
            return Integer.compare(this.offWattage, other.offWattage);
        }
        return onWattageComparison;
    }

    // Cloning method for creating a copy of the object
    public ApplianceComparable clone() throws CloneNotSupportedException {
        ApplianceComparable copy = new ApplianceComparable(applianceID, name, onWattage, offWattage, probabilityOn);
        return copy;
    }

    // String representation of the object
    @Override
    public String toString() {
        return "Loc=" + applianceID + " Name=" + name + " OnW=" + onWattage + " OffW=" + offWattage + " ProbOn=" + probabilityOn;
    }
}
