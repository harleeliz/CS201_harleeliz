/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

public class Cylinder extends CircleSolid {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

     public void setHeight(double height) {
        while (height <= 0) {
            System.out.println("You entered an invalid height. Height must be a positive value.");
        }
        this.height = height;
    }


    @Override
    public double getVolume() {
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder: Radius=" + getRadius() + " Height=" + getHeight();
    }

    public double getHeight() {
        return height;
    }
}
