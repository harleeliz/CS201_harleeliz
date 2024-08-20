/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

public class DateOrder {
    private int day,month,year;

    public DateOrder(DateOrder orderDate) {
        this(orderDate.getDay(), orderDate.getMonth(), orderDate.getYear());
    }

    /*Overloaded constructor
     * @param mm   initial value for month
     * @param dd   initial value for day
     * @param yyyy initial value for year
     *             passes parameters to setDate method */
    public DateOrder (int dd, int mm, int yyyy) {
        setDate (dd, mm, yyyy);
    }


        public void setDate (int mm, int dd, int yyyy) {
            setMonth (mm);
            setDay (dd);
            setYear (yyyy);
        }


//Getter for get day
    public int getDay( ) {
        return day;
    }
    //Setter for set day

    public void setDay( int day ) {
        this.day = day;
    }

    //Getter for get month
    public int getMonth( ) {
        return month;
    }
    //Setter for set month
    public void setMonth( int month ) {
        this.month = month;
    }

    //Getter for get year
    public int getYear( ) {
        return year;
    }
    //Setter for set year
    public void setYear( int year ) {
        this.year = year;
    }


    //Method toString represents the class
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

}

