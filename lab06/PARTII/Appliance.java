/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

public class Appliance {
    private int location;
    private String name;
    private int on;
    private int off;
    private double prob;

    public Appliance(int location, String name, int on, int off, double prob) {
        if (validloca(location)) {
            this.location = location;
        } else {
            // Handle the invalid location (set a default value, log an error, etc.)
            this.location = location; // You can set any default value you prefer
        }

        this.name = (name != null && !name.isEmpty()) ? name : "UNKNOWN";
        this.on = (on >= 1) ? on : 1;
        this.off = (off >= 0) ? off : 0;
        this.prob = (prob >= 0 && prob <= 1) ? prob : 0.0;
    }


    private boolean validloca(int location) {
        return (location >= 10_000_000 && location <= 99_999_999);
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        if (validloca(location)) {
            this.location = location;
        } else {
            throw new IllegalArgumentException("you entered wrong value");
        }
    }

    @Override
    public String toString() {
        return String.format("Loc=%d Name=%s OnW=%d OffW=%d ProbOn=%.3f", location, name, on, off, prob);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Appliance appliance = (Appliance) obj;
        return location == appliance.location && Double.compare(appliance.prob, prob) == 0
                && on == appliance.on && off == appliance.off
                && name.equals(appliance.name);
    }
}
