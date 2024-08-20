/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
import java.text.NumberFormat;

public class Runner {
    //Instance global variables declaration
  private String name;
  private int marathonTimeSeconds;
  private static final int WORLD_RECORD_TIME_SECONDS = (2 * 3600) + (1 * 60) + 39;
  // World record time in seconds
  // WORLD_RECORD_TIME_SECONDS=// add expression to convert the record hours and minutes and seconds to seconds;
  private static final String DEFAULT_NAME="No Name Given";

  public Runner (String n, int h, int m, int s){
    setName(n);
    setTime(h, m, s);
  }

  public void setName(String newName){
    if (newName!=null) {
	  name=newName;
	}
	else {
	  name=DEFAULT_NAME;
	}
  }

  public void setTime (int newH, int newM, int newS){
    if (newH>=0 && newM>=0 && newS>=0) {
        marathonTimeSeconds= (newH * 3600) + (newM * 60) + newS; // add expression to convert the h and m and s to seconds
	}
  }

  public String getName() { return name; }

  public int getSeconds() { return marathonTimeSeconds; }

  public String percentageSlower (){
  // ADD CODE HERE TO CALCULATE THE PERCENTAGE SLOWER THAN THE WORLD RECORD
  // return the percentage slower as a percent formatted String
      double percentage = ((double) (marathonTimeSeconds - WORLD_RECORD_TIME_SECONDS) / WORLD_RECORD_TIME_SECONDS) * 100;
      return NumberFormat.getInstance().format(Math.round(percentage)) + "%";

  }

  public Runner (String n, String data){
      setName(n);
  // ADD CODE HERE TO INITIALIZE the object attributes by using the first String argument as the player name,
  // and by parsing the second colon-delimited String argument (hh:mm:ss) into 3 integers hours, minutes, seconds
      String[] timeParts = data.split(":");
      if (timeParts.length == 3) {
          int hours = Integer.parseInt(timeParts[0]);
          int minutes = Integer.parseInt(timeParts[1]);
          int seconds = Integer.parseInt(timeParts[2]);
          setTime(hours, minutes, seconds);
      }
  }


    /*Method toString
     * @return String
     * returns name , marathonTimeSeconds */
    @Override
    public String toString ( ) {
        return "Runner{" +
                "name='" + name + '\'' +
                ", marathonTimeSeconds=" + marathonTimeSeconds +
                '}';
    }
}