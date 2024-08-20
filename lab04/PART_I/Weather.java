/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class Weather {
    // Declare variables
    private int temp;
    // Declare default variables and initial value
    private static final int DEFAULT_TEMP=0;
    // create default constructor
    public Weather() {
        setWeather(DEFAULT_TEMP);              // good practice to call "sets" here
    }
    // create non-default constructor
    public Weather(int newTemp) {
        setWeather(newTemp);              // good practice to call "sets" here
    }
    // Accessor methods
    public int getNewTemp () { return temp;}  // Accessor methods with getters
    //mutator methods
    public void setWeather(int newTemp) { temp = newTemp;}
    // Main calculation
    public void CheckWeather() {
        if (temp > 80) {
            System.out.println("hot");
        }
        else if (temp >=60 && temp <=80){
            System.out.println("pleasant");
        }
        else if (temp <45){
            System.out.println("cold");
        }
        else {
            System.out.println("cool");
        }

    }

public String toString () { return "Current temperature is: " + temp;}

}

