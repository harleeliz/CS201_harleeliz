/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class DateLeapYear {
	  private int month;
	  private int day;
	  private int year;
	  
	  private static final int DEFAULT_DAY=1, DEFAULT_MONTH=1, DEFAULT_YEAR=2000;

	  public DateLeapYear( )  {
		  month=DEFAULT_MONTH;
		  day=DEFAULT_DAY;
		  year=DEFAULT_YEAR;
	  }

	  public DateLeapYear( int mm, int dd, int yyyy ) {
	    setDateLeapYear( mm, dd, yyyy );
	  }


	  private void setMonth( int mm ) {
	    month = ( mm >= 1 && mm <= 12 ? mm : DEFAULT_MONTH );
	  }



	  private void setYear( int yyyy ) {
	    year = yyyy;
	  }
	  
	     private void setDay(int dd) {
	         int[] validDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	         if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
	             if (dd >= 1 && dd <= 29) {
	                 day = dd;
	             } else {
	                 day = DEFAULT_DAY;
	             }
	         } else if (dd >= 1 && dd <= validDays[month]) {
	             day = dd;
	         } else {
	             day = DEFAULT_DAY;
	         }
	     }


	  public String toString( ) {
	    return month + "/" + day + "/" + year;
	  }

	  public boolean equals( DateLeapYear d ) {
	    return ( month == d.month && day == d.day  && year == d.year );
	  }
	  
	     // getter 
	     public int getMonth() {
	         return month;
	     }
	 
	     public int getDay() {
	         return day;
	     }
	 
	     public int getYear() {
	         return year;
	     }
	 
	     // setter the DateLeapYear
	     public void setDateLeapYear(int mm, int dd, int yyyy) {
	         setYear(yyyy);
	         setMonth(mm);
	         setDay(dd);
	     }
	     

	  public boolean leapYear() {
	    return ((year%4==0) && ((year%100!=0)||(year%400==0))); 
	  }
	  // calculate the day left in month
	     public int daysLeftInMonth() {
	         int dayInMonth;
	         switch (month) {
	             case 4:
	             case 6:
	             case 9:
	             case 11:
	                 dayInMonth = 30;
	                 break;
	             case 2:
	                 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	                     dayInMonth = 29;
	                 } else {
	                     dayInMonth = 28;
	                 }
	                 break;
	             default:
	                 dayInMonth = 31;
	                 break;
	         }
	         return dayInMonth - day;
	     }
	     
	  // declare the increment day function
	  public void incrementDay() {
	         int dayInMonth;
	         switch (month) {
	             case 4:
	             case 6:
	             case 9:
	             case 11:
	                 dayInMonth = 30;
	                 break;
	             case 2:
	                 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	                     dayInMonth = 29;
	                 } else {
	                     dayInMonth = 28;
	                 }
	                 break;
	             default:
	                 dayInMonth = 31;
	                 break;
	         }
	 
	         day++;
	 
	         if (day > dayInMonth) {
	             day = 1;
	             month++;
	 
	             if (month > 12) {
	                 month = 1;
	                 year++;
	             }
	         }
	     }
	  
	}