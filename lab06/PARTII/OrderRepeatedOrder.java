/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

class RepeatedOrder extends Order {
    private int period;
    private DateOrder endDate;

    public RepeatedOrder ( String customerId ,String productId ,DateOrder orderDate ,int amount ,int period ,DateOrder endDate ) {
        super ( customerId ,productId ,orderDate ,amount );
        this.period = Math.max ( period ,0 );
        this.endDate = ( endDate != null ) ? new DateOrder ( endDate ) : new DateOrder ( orderDate );
    }

    public void setPeriod ( int period ) {
        this.period = Math.max ( period ,0 );
    }

    public void setEndDate ( DateOrder endDate ) {
        this.endDate = ( endDate != null ) ? new DateOrder ( endDate ) : new DateOrder ( orderDate );
    }

    public int getPeriod ( ) {
        return period;
    }

    public DateOrder getEndDate ( ) {
        return new DateOrder ( endDate );
    }

    @Override
    public String toString ( ) {
        return super.toString ( ) + " Period=" + period + " E=" + endDate;
    }
}