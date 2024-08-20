/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */

public class ThreeIntMath {


    //Instance global variables declaration
    private int x, y, z;

    //Global default variables declaration
    private static final int DEFAULT_VALUE = 0;

    // Default constructor
    public ThreeIntMath ( ) {
        setInts (DEFAULT_VALUE, DEFAULT_VALUE, DEFAULT_VALUE);
    }

    // Overloaded constructor
    public ThreeIntMath ( int i1, int i2, int i3 ) {
        setInts (i1, i2, i3);
    }


    /** Accessor method getInt1()
     *  returns the x */
    public int getInt1 ( ) {
        return x;
    }

    /** Accessor method getInt2()
     *  returns the y */
    public int getInt2 ( ) {
        return y;
    }

    /** Accessor method getInt3()
     *  returns the z */
    public int getInt3 ( ) {
        return z;
    }


    /** Mutator method setInts()
     *  Set the values for x,y and z */
    public void setInts ( int i1, int i2, int i3 ) {
        x = i1;
        y = i2;
        z = i3;
    }


    /** Helper method average (public)
     *  It is not used on the test class, however it returns the value of the sum of (x,y,z) divided by 3*/
    public double average ( ) {
        return ( x + y + z ) / 3.;
    }

    /** Method polynomial (public)
     *  Returns the value of polynomial operation*/
    public double polynomial ( double a ) {
        return x * Math.pow (a, 2) + y * a + z;
    }

    /** Method maximum (public)
     *  Returns de value of the operation*/
    public int maximum ( ) {
        return Math.max (x, Math.max (y, z));
    }


    /** Method quadratic (public)
     *  Returns de value of the operations
     *  The if statement check first if the discriminant > 0, then performs root1 and root2 using the quadratic formula
     and returns them as a space-separated string.
     * If discriminant = 0, then performs, the root and returns it as a string.
     * If discriminant < 0, then performs the operation for realPart and imaginaryPart for both complex roots
     and returns them as a string.*/
    public String quadratic ( ) {
        double discriminant = Math.pow (y, 2) - 4 * x * z;

        if ( discriminant > 0 ) {
            double root1 = ( -y + Math.sqrt (discriminant) ) / ( 2 * x );
            double root2 = ( -y - Math.sqrt (discriminant) ) / ( 2 * x );
            return root1 + " " + root2;
        } else if ( discriminant == 0 ) {
            double root = -y / ( 2 * x );
            return String.valueOf (root);
        } else {
            double realPart = -y / ( 2 * x );
            double imaginaryPart = Math.sqrt (-discriminant) / ( 2 * x );
            return realPart + " + " + imaginaryPart + "i" + " " + realPart + " - " + imaginaryPart + "i";
        }
    }

    /*Method toString
     * @return String
     * returns x,y and z*/
    public String toString ( ) {
        return "Int1=" + x + " Int2=" + y + " Int3=" + z;
    }

}