/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class Bounce {
    private double bouncePercentage;
    private static final double DEFAULT_BOUNCE_PERCENTAGE = 0.5;

    // Default Constructor for Bounce
    public Bounce() {
        // Set bouncePercentage to the default value
        setBouncePercentage(DEFAULT_BOUNCE_PERCENTAGE);
    }

    // Overloaded constructor for Bounce
    public Bounce(double bouncePercentage) {
        // Set bouncePercentage using the provided value
        setBouncePercentage(bouncePercentage);
    }

    // Accessor method to get the bouncePercentage value
    public double getBouncePercentage() {
        return bouncePercentage;
    }

    // Mutator method to set the bouncePercentage value with validation
    public void setBouncePercentage(double bouncePercentage) {
        if ( bouncePercentage <= 1 ) {
            if ( bouncePercentage >= 0 ) {
                // Valid bouncePercentage, set it
                this.bouncePercentage = bouncePercentage;
            }
            else {
                // Invalid bouncePercentage, use the default value and display a message
                System.out.println ( "Invalid bounce percentage. Using default value." );
                this.bouncePercentage = DEFAULT_BOUNCE_PERCENTAGE;
            }
        }
        else {
            // Invalid bouncePercentage, use the default value and display a message
            System.out.println ( "Invalid bounce percentage. Using default value." );
            this.bouncePercentage = DEFAULT_BOUNCE_PERCENTAGE;
        }
    }

    @Override
    public String toString() {
        // Format and return the bouncePercentage as a string
        return "Bounce Percentage: " + String.format("%.1f", bouncePercentage);
    }

    public String getTable(int initialHeight, int bounceCount) {
        if ( bounceCount <= 0 ) {
            // Invalid input arguments, return an error message
            return "getTable invalid arguments";
        }
        else if ( initialHeight <= 0 ) {
            // Invalid input arguments, return an error message
            return "getTable invalid arguments";
        }

        StringBuilder table = new StringBuilder();

        for (int i = 0; i <= bounceCount; i++) {
            double height = initialHeight * Math.pow(bouncePercentage, i);
            table.append(i).append(";").append(String.format("%.3f", height));

            if ( height < ( (double) initialHeight / 10 ) ) {
                // Add a note for heights below 1/10th of initial height
                table.append(";Below 1/10th initial height");
            }
            table.append("\n");
        }

        return table.toString();
    }
}
