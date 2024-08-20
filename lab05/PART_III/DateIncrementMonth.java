/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class DateIncrementMonth {
  private int month;
  private int day;
  private int year;

  private static final int[] validDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  private static final int DEFAULT_DAY = 1, DEFAULT_MONTH = 1, DEFAULT_YEAR = 2000;

  public DateIncrementMonth() {
    month = DEFAULT_MONTH;
    day = DEFAULT_DAY;
    year = DEFAULT_YEAR;
  }

  public DateIncrementMonth(int mm, int dd, int yyyy) {
    setDateIncrementMonth(mm, dd, yyyy);
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
    month = (mm >= 1 && mm <= 12 ? mm : DEFAULT_MONTH);
  }

  private void setDay(int dd) {
    day = (dd >= 1 && dd <= validDays[month] ? dd : DEFAULT_DAY);
  }

  private void setYear(int yyyy) {
    year = yyyy;
  }

  public void setDateIncrementMonth(int mm, int dd, int yyyy) {
    setYear(yyyy);
    setMonth(mm);
    setDay(dd);
  }

  public String toString() {
    return month + "/" + day + "/" + year;
  }

  public boolean equals(DateIncrementMonth d) {
    return (month == d.month && day == d.day && year == d.year);
  }

  public boolean leapYear() {
    return ((year%4==0) && ((year%100!=0)||(year%400==0)));
  }

  public void incrementMonth() {
    int newMonth = month + 1;
    int newYear = year;

    if (newMonth > 12) {
      newMonth = 1;
      newYear++;
    }

    int maxDay = validDays[newMonth];
    if (leapYear() && newMonth == 2) {
      maxDay = 29; // February in a leap year
    }

    if (day > maxDay) {
      day = maxDay;
    }

    month = newMonth;
    year = newYear;
  }

  public void incrementMonth(int count) {
    if (count <= 0) {
      return;
    }

    for (int i = 0; i < count; i++) {
      incrementMonth();
    }
  }
}