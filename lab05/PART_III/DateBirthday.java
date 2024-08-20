/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateBirthday {
  private int month;
  private int day;
  private int year;
  
  private static final int [] validDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};  
  private static final int DEFAULT_DAY=1, DEFAULT_MONTH=1, DEFAULT_YEAR=2000, DEFAULT_VALUE=0;

  public DateBirthday( )  {
	  month=DEFAULT_MONTH;
	  day=DEFAULT_DAY;
	  year=DEFAULT_YEAR;
  }

  public DateBirthday( int mm, int dd, int yyyy ) {
    setDate( mm, dd, yyyy );
  }

  int getMonth( ) { return month; }
  int getDay( )   { return day; }
  int getYear( )  { return year; }

  private void setMonth( int mm ) {
    month = ( mm >= 1 && mm <= 12 ? mm : DEFAULT_MONTH );
  }

  private void setDay( int dd ) {
    day = ( dd >= 1 && dd <= validDays[month] ? dd : DEFAULT_DAY );
  }

  private void setYear( int yyyy ) {
    year = yyyy;
  }

  public void setDate( int mm, int dd, int yyyy ) {
    setYear(yyyy);
    setMonth( mm );
    setDay( dd );
  }

  public String toString( ) {
    return month + "/" + day + "/" + year;
  }

  public boolean equals( DateBirthday d ) {
    return ( month == d.month && day == d.day  && year == d.year );
  }

  public boolean leapYear() {
    return ((year%4==0) && ((year%100!=0)||(year%400==0))); 
  }

  public String dayOfWeek() {
    String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int year = this.year;
    int month = this.month;
    int day = this.day;

    if (month < 3) {
      month += 12;
      year--;
    }

    int k = year % 100;
    int j = year / 100;

    int dayOfWeek = (day + 13 * (month + 1) / 5 + k + k / 4 + j / 4 - 2 * j) % 7;

    if (dayOfWeek >= 0 && dayOfWeek < 7) {
      return daysOfWeek[dayOfWeek];
    } else {
      return "Invalid Date";
    }
  }


}


