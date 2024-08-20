/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Jun, Harlee Ramos
 */


public class DateIncrementDay {
  private int month;
  private int day;
  private int year;
  
  private static final int [] validDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};  
  private static final int DEFAULT_DAY=1;
  private static final int DEFAULT_MONTH=1; 
  private static final int DEFAULT_YEAR=2000;

  public DateIncrementDay( )  {
	  month=DEFAULT_MONTH;
	  day=DEFAULT_DAY;
	  year=DEFAULT_YEAR;
  }

  public DateIncrementDay( int mm, int dd, int yyyy ) {
    setDate( mm, dd, yyyy );
  }

  int getMonth( ) { return month; }
  int getDay( )   { return day; }
  int getYear( )  { return year; }

  private void setMonth( int mm ) {
    month = ( mm >= 1 && mm <= 12 ? mm : DEFAULT_MONTH );
  }

  private void setDay( int dd ) {
  	int max=validDays[month];
	  if (leapYear() && month==2) {
		  max=29;
	  }
    day = ( dd >= 1 && dd <= max ? dd : DEFAULT_DAY );
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

  public boolean equals( DateIncrementDay d ) {
    return ( month == d.month && day == d.day  && year == d.year );
  }

  public boolean leapYear() {
    return ((year%4==0) && ((year%100!=0)||(year%400==0))); 
  }
  
  public int compareTo(DateIncrementDay that) {
	  if (this.year<that.year) {
	    return -1;
	  }
  	else {
  	  if (this.year>that.year) {
  	     return 1;
  	  }
      else {
        if (this.month<that.month) {
          return -1;
        }
    		else {
    		  if (this.month>that.month) {
    		    return 1;
    		  }
      		else {
		        if (this.day<that.day) {
		          return -1;
		        }
      			else {
      			  if (this.day>that.day) {
      			    return 1;
      			  }
        			else {
        			  return 0;
        			}
      			}
      		}
    		}
      }
		}
  }
  public void incrementMonth() {
	    if (month == 12) {
	        setMonth(1);
	        setYear(year + 1);
	    } else {
	        setMonth(month + 1);
	    }
	    int max = validDays[month];
	    if (leapYear() && month == 2) {
	        max = 29;
	    }
	    if (day > max) {
	        setDay(max);
	    }
	}


    public void incrementYear() {
        year++;
    }


    public void incrementDay() {
        int maxDay = validDays[month];
        if (leapYear() && month == 2) {
            maxDay = 29;
        }
        day = (day % maxDay) + 1;

        if (day == 1) {
            month = (month % 12) + 1;

            if (month == 1) {
                incrementYear();
            }
        }
    }


    public void incrementDays(int numdays) {
    for (int i = 0; i < numdays; i++) {
      incrementDay();
    }
  }

    public String dayOfWeek() {
        String[] dayNames = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        int adjustedMonth = month < 3 ? month + 12 : month;
        int adjustedYear = month < 3 ? year - 1 : year;

        int k = adjustedYear % 100;
        int j = adjustedYear / 100;

        int dayOfWeekCode = (day + (int)Math.floor((13 * (adjustedMonth + 1)) / 5) + k + (int)Math.floor(k / 4) + (int)Math.floor(j / 4) - (2 * j)) % 7;
        if (dayOfWeekCode < 0) {
            dayOfWeekCode += 7;
        }

        return dayNames[dayOfWeekCode];
    }



}