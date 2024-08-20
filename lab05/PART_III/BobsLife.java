/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class BobsLife {
    // Constants for valid locations
    private static final String[] VALID_LOCATIONS = { "home", "work", "gym" };

    // Instance attributes
    private String location;
    private int hunger;
    private int dollars;
    private int fitness;
    int time;
    private String status;

    // Constants for default values
    private static final String DEFAULT_LOCATION = "home";
    private static final int DEFAULT_HUNGER = 0, DEFAULT_DOLLARS = 0, DEFAULT_FITNESS = 0;

    // Constants for status
    private static final String ALIVE_AND_WELL = "alive and well", DECEASED = "deceased", IN_JAIL = "in jail";

    // Constructor with default values
    public BobsLife() {
        this(DEFAULT_LOCATION, DEFAULT_HUNGER, DEFAULT_DOLLARS, DEFAULT_FITNESS);
    }

    // Non-Default Constructor
    public BobsLife(String initialLocation, int initialHunger, int initialDollars, int initialFitness) {
        setLocation(initialLocation);
        setHunger(initialHunger);
        setDollars(initialDollars);
        setFitness(initialFitness);
        this.time = 0;
        this.status = ALIVE_AND_WELL;
    }

    // Private method to check if a location is valid
    private boolean isValidLocation(String newLocation) {
        for (String validLocation : VALID_LOCATIONS) {
            if (validLocation.equals(newLocation)) {
                return true;
            }
        }
        return false;
    }

    // Mutator method for setting location with validation
    private void setLocation(String newLocation) {
        if (isValidLocation(newLocation)) {
            this.location = newLocation;
        } else {
            this.location = DEFAULT_LOCATION;
        }
    }

    // Mutator method for setting hunger with validation
    private void setHunger(int newHunger) {
        this.hunger = (newHunger >= 0) ? newHunger : DEFAULT_HUNGER;
    }

    // Mutator method for setting dollars with validation
    private void setDollars(int newDollars) {
        this.dollars = (newDollars >= 0) ? newDollars : DEFAULT_DOLLARS;
    }

    // Mutator method for setting fitness with validation
    private void setFitness(int newFitness) {
        this.fitness = ( 0 > newFitness ) ? DEFAULT_FITNESS : newFitness;
    }

    // Public method to move Bob to a new location
    public void move(String newLocation) {
        if (!ALIVE_AND_WELL.equals(status)) {
            // Bob is not alive and well, output the current status
            System.out.println(toString());
            return;
        }

        // Verify the new location is valid
        if (isValidLocation(newLocation)) {
            time++;
            location = newLocation;

            // Update characteristics based on move rules
            if ("home".equals(location)) {
                hunger -= 3;
                if (hunger < 0) {
                    hunger = 0;
                }
                dollars -= 1;
            } else if ("work".equals(location)) {
                hunger += 2;
                dollars += 3;
                if (fitness > 0) {
                    fitness -= 1;
                }
            } else if ("gym".equals(location)) {
                hunger += 3;
                dollars -= 2;
                fitness += 2;
            }


            // Check if Bob's status needs to be updated
            if ( 6 < hunger ) {
                status = DECEASED;
            } else if (dollars < 0) {
                status = IN_JAIL;
            } else if (fitness <= 0) {
                status = DECEASED;
            }
        }
    }

    // Public method to get Bob's status
    public String getStatus() {
        return status;
    }

    // Override toString method to provide a formatted output
    @Override
    public String toString() {
        return " Time:" + time +
                " Location:" + location +
                " Hunger:" + hunger +
                " Dollars:" + dollars +
                " Fitness:" + fitness + " (" + status + ")";
    }
}
