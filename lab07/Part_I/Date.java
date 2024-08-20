package Part_I;

/* Lab Exercises No.7
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class Date implements Comparable<Date> {
    private int month;
    private int day;
    private int year;

    private static final int[] validDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int DEFAULT_DAY = 1, DEFAULT_MONTH = 1, DEFAULT_YEAR = 2000;

    public Date() {
        setDate(DEFAULT_MONTH, DEFAULT_DAY, DEFAULT_YEAR);
    }

    public Date(int mm, int dd, int yyyy) {
        setDate(mm, dd, yyyy);
    }

    int getMonth() {
        return month;
    }

    int getDay() {
        return day;
    }

    int getYear() {
        return year;
    }

    private void setMonth(int mm) {
        month = (mm >= 1 && mm <= 12) ? mm : DEFAULT_MONTH;
    }

    private void setDay(int dd) {
        int maxDays = validDays[month];
        if (leapYear() && month == 2) {
            maxDays = 28;
        }
        day = (dd >= 1 && dd <= maxDays) ? dd : DEFAULT_DAY;
    }

    private void setYear(int yyyy) {
        year = yyyy;
    }

    public void setDate(int mm, int dd, int yyyy) {
        setYear(yyyy);
        setMonth(mm);
        setDay(dd);
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public boolean equals(Date d) {
        return month == d.month && day == d.day && year == d.year;
    }

    public boolean leapYear() {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    @Override
    public int compareTo(Date otherDate) {
        if (this.year != otherDate.year) {
            return Integer.compare(this.year, otherDate.year);
        } else if (this.month != otherDate.month) {
            return Integer.compare(this.month, otherDate.month);
        } else {
            return Integer.compare(this.day, otherDate.day);
        }
    }
}
