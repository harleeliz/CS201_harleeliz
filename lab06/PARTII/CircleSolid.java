/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;
//CircleSolid abstract class
public abstract class CircleSolid {
 protected double radius;

 // Default constructor
 public CircleSolid() {
     this.radius = 1.0;
 }

 // Non-default constructor
 public CircleSolid(double radius) {
     setRadius(radius);
 }

 // Setter for radius with argument error checking
 public void setRadius(double radius) {
	    while (radius <= 0) {
	        System.out.println("you entered wrong value");
	    }
	    this.radius = radius;
	}


 // Getter for radius
 public double getRadius() {
     return radius;
 }

 // Abstract method for getting volume
 public abstract double getVolume();

 // Method to calculate circumference
 public double getCircumference() {
     return 2 * Math.PI * radius;
 }

 // Method to calculate area
 public double getArea() {
     return Math.PI * radius * radius;
 }

 // toString method
 @Override
 public String toString() {
     return "CircleSolid: Radius=" + radius;
 }
}
