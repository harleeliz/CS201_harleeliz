/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class Player {
    // Instance global variables declaration
    private String name;
    private int fruitsEaten;
    private int ghostsEaten;
    private int timeInSeconds;

    // Global default variables declaration
    private static final String DEFAULT_NAME = "NAME";
    private static final int DEFAULT_VALUE = 0;
    private static final int FRUIT_MULTIPLIER = 10;
    private static final int GHOST_MULTIPLIER = 5;

    // Default Constructor Player set the name to name.  fruitsEaten, ghostsEaten and timeInSeconds = 0 (the defaults).
    public Player() {
        setName(DEFAULT_NAME);
        setFruitsEaten(DEFAULT_VALUE);
        setGhostsEaten(DEFAULT_VALUE);
        setTimeInSeconds(DEFAULT_VALUE);
    }

    /* Overloaded constructor Player (public)
     * @param name          new value for name
     * @param fruitsEaten   new value for fruitsEaten
     * @param ghostsEaten   new value for ghostsEaten
     * @param timeInSeconds new value for timeInSeconds */

    public Player(String name, int fruitsEaten, int ghostsEaten, int timeInSeconds) {
        setName(name);
        setFruitsEaten(fruitsEaten);
        setGhostsEaten(ghostsEaten);
        setTimeInSeconds(timeInSeconds);
    }


    /* Constructor Player (public)
     * @param name          new value for name
     * @param data
     */
    public Player(String name, String data) {
        setName(name);
        String[] parts = data.split(",");
        setFruitsEaten(Integer.parseInt(parts[0]));
        setGhostsEaten(Integer.parseInt(parts[1]));
        setTimeInSeconds(Integer.parseInt(parts[2]));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFruitsEaten() {
        return fruitsEaten;
    }

    public void setFruitsEaten(int fruitsEaten) {
        this.fruitsEaten = fruitsEaten;
    }

    public int getGhostsEaten() {
        return ghostsEaten;
    }

    public void setGhostsEaten(int ghostsEaten) {
        this.ghostsEaten = ghostsEaten;
    }

    public int getTimeInSeconds() {
        return timeInSeconds;
    }

    public void setTimeInSeconds(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    /* Method powerRating() (public)
     * @returns the value for the power rating operation */
    public double powerRating() {
        return (FRUIT_MULTIPLIER * fruitsEaten + GHOST_MULTIPLIER * ghostsEaten) / (double) timeInSeconds;
    }

    /* Method toString
     * @return String
     * returns Name (String text), Fruits (integer number), Ghosts (integer number) and Time (integer number) */
    @Override
    public String toString() {
        return "Name:" + name + " Fruits:" + fruitsEaten + " Ghosts:" + ghostsEaten + " Time:" + timeInSeconds;
    }
}
