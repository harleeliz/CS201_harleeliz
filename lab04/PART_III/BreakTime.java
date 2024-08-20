/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class BreakTime {
    // Instance attributes
    private int weeks, days, hours;

    // Class constants variables
    private static final int DAYS_IN_A_WEEK = 7, HOURS_IN_A_DAY = 24, DEFAULT_VALUE = 0;

    // Default constructor
    public BreakTime() {
        weeks = DEFAULT_VALUE;
        days = DEFAULT_VALUE;
        hours = DEFAULT_VALUE;
    }

    // Non-default constructor with data validation
    public BreakTime(int weeks, int days, int hours) {
        setWeeks(weeks);
        setDays(days);
        setHours(hours);
    }

    // Getter methods for the Weeks, Hours and Days
    public int getWeeks() {
        return weeks;
    }

    public int getDays() {
        return days;
    }

    public int getHours() {
        return hours;
    }

    // Setter methods with data validation for the Weeks, Hours and Days
    public void setWeeks(int weeks) {
        if (weeks >= DEFAULT_VALUE) {
            this.weeks = weeks;
        }
    }
    public void setDays(int days) {
        if (days >= DEFAULT_VALUE) {
            this.weeks += days / DAYS_IN_A_WEEK;
            this.days = days % DAYS_IN_A_WEEK;
        } else {
            this.days = DEFAULT_VALUE;
        }
    }
    public void setHours(int hours) {
        if (hours >= DEFAULT_VALUE) {
            this.days += hours / HOURS_IN_A_DAY;
            this.hours = hours % HOURS_IN_A_DAY;
        } else {
            this.hours = DEFAULT_VALUE;
        }
    }

    // Calculate total time in real number weeks
    public double totalWeeks() {
        return weeks + (days + hours / (double) HOURS_IN_A_DAY) / (double) DAYS_IN_A_WEEK;
    }

    // Calculate total time in real number days
    public double totalDays() {
        return weeks * DAYS_IN_A_WEEK + days + hours / (double) HOURS_IN_A_DAY;
    }

    // Calculate total time in integer hours
    public int totalHours() {
        return weeks * DAYS_IN_A_WEEK * HOURS_IN_A_DAY + days * HOURS_IN_A_DAY + hours;
    }

    // Compare two BreakTime instances
    public int compareTo(BreakTime duration) {
        double thisTotal = this.totalWeeks();
        double durationTotal = duration.totalWeeks();

        if (thisTotal > durationTotal) {
            return 1;
        } else if (thisTotal < durationTotal) {
            return -1;
        } else {
            return 0;
        }
    }

    // Convert instance variables to String
    @Override
    public String toString() {
        return "Weeks:" + weeks + " Days:" + days + " Hours:" + hours;
    }
}
