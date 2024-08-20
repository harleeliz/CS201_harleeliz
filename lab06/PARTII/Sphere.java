/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

public class Sphere extends CircleSolid {
    // Constructors
    public Sphere() {
        super();
    }

    public Sphere(double radius) {
        super(radius);
    }

    // Override method to calculate volume
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + " Sphere";
    }
}

