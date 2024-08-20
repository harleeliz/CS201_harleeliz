package Part_III;
/* Lab Exercises No.7
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/

public class GCD {

  // Instance variables to store values for Part_III.GCD calculation
  private static int a;
  private static int b;

  // Default constructor
  public GCD() {
    // Default constructor is empty in this case
  }

  // Getter for variable 'a'
  public static int getA() {
    return a;
  }

  // Setter for variable 'a'
  public static void setA(int a) {
    GCD.a = a;
  }

  // Getter for variable 'b'
  public static int getB() {
    return b;
  }

  // Setter for variable 'b'
  public static void setB(int b) {
    GCD.b = b;
  }

  // Worker method to calculate the greatest common divisor (Part_III.GCD) using Euclidean algorithm
  public static int gcd(int a, int b) {
    GCD.a = a;
    GCD.b = b;

    // Base cases
    if (a == 0) {
      return b;
    }
    if (b == 0) {
      return a;
    }

    // Recursive case
    int remainder = a % b;
    return gcd(b, remainder);
  }

  // Method to provide a String representation of the Part_III.GCD class
  @Override
  public String toString() {
    return "Part_III.GCD{}";
  }
}
