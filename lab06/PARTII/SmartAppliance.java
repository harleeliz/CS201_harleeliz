/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

public class SmartAppliance extends Appliance {
    private double reduce;

    public SmartAppliance(int location, String name, int on, int off, double prob, double reducep) {
        super(location, name, on, off, prob);
        setreduce(reducep);
    }

    public double getreducep() {
        return reduce;
    }

    public void setreduce(double reducep) {
        if (reducep >= 0 && reducep <= 1) {
            this.reduce = reducep;
        } else {
            this.reduce = 1.0;
        }
    }

    @Override
    public String toString() {
        double reducepp = reduce;
        return super.toString() + String.format(" Reduce%%=%.2f", reducepp);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        SmartAppliance smartAppliance = (SmartAppliance) obj;
        return Double.compare(smartAppliance.reduce, reduce) == 0;
    }
}
