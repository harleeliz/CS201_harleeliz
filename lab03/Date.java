/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */

public class Date {
    //Instance global variables declaration
    private int day, month, year;

    //Global default variables declaration
    private static final int DEFAULT_YEAR = 2000, DEFAULT_MONTH = 1, DEFAULT_DAY = 1;
    // Default Constructor: Sets month to 1, day to 1 and year to 2000 (the defaults)
    public Date() {
        setDate(DEFAULT_MONTH, DEFAULT_DAY, DEFAULT_YEAR);
    }

    /*Overloaded constructor
     * @param mm   initial value for month
     * @param dd   initial value for day
     * @param yyyy initial value for year
     *             passes parameters to setDate method */

    public Date(int mm, int dd, int yyyy) {
        setDate(mm, dd, yyyy);
    }

    //accessor method --> returns the month
    public int getMonth() {
        return month;
    }


    //accessor method --> returns the day
    public int getDay() {
        return day;
    }

    //accessor method --> returns the year
    public int getYear() {
        return year;
    }

    /* Mutator method  setDate
     * @param mm   new value for month
     * @param dd   new value for day
     * @param yyyy new value for year
     * Passes parameters to setMonth, setDay, and setYear for validation and setting */

    public void setDate(int mm, int dd, int yyyy) {
        setYear(yyyy);
        setMonth(mm);
        setDay(dd);
    }

    /** Helper method setDay (private)
     * @param dd new value for day
     *  if dd is legal day for current month, sets day to dd
     *  otherwise, sets day to 1 */
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

    /* Helper method setMonth (private)
     * @param mm new value for month
     * if mm is between 1 and 12, sets month to mm
     * otherwise, sets month to 1 */
    private void setMonth(int mm) {
        if (mm >= 1 && mm <= 12) {
            month = mm;
        } else {
            month = DEFAULT_MONTH;
        }
    }

    /* Method setYear (private)
     * @param yyyy new value for year
     * sets year to yyyy */
    private void setYear(int yyyy) {
        year = yyyy;
    }

    /** Method daysLeftInMonth
     * @return Integer number of day in a month
     * Case 4,6,9,11 represent months with 30 days
     * Case 2 represent February, the if statement check with modulus that the reminder = 0
     * Default case, it for the 31 days months, same as Case 1,3,5,7,8,10 and 12
     */
    public int daysLeftInMonth() {
        int dayInMonth;
        switch (month) {
            case 4,6,9,11 :
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

    /* Method incrementDay
     Integer number of day increment */
    public void incrementDay() {
        int dayInMonth;
        switch (month) {
            case 4,6,9, 11:
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
    /*Method toString
     * @return String
     * returns date in mm/dd/yyyy format*/
    public String toString () {
        return month + "/" + day + "/" + year;
    }

}


