/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTII;

public class Order {
    private static int nextOrderId = 1;

    private final int orderId;
    private String customerId;
    private String productId;
    protected DateOrder orderDate;
    private int amount;

    public Order ( String customerId , String productId , DateOrder orderDate , int amount ) {
        this.orderId = nextOrderId++;
        this.customerId = ( customerId != null ) ? customerId : "DefaultCustomerID";
        this.productId = ( productId != null ) ? productId : "DefaultProductID";
        this.orderDate = ( orderDate != null ) ? new DateOrder ( orderDate ) : new DateOrder ( 1 , 1 , 2000 );
        this.amount = Math.max ( amount , 0 );
    }

    public void setCustomerId ( String customerId ) {
        this.customerId = ( customerId != null ) ? customerId : "DefaultCustomerID";
    }

    public void setProductId ( String productId ) {
        this.productId = ( productId != null ) ? productId : "DefaultProductID";
    }

    public void setOrderDate ( DateOrder orderDate ) {
        this.orderDate = ( orderDate != null ) ? new DateOrder ( orderDate ) : new DateOrder ( 1 , 1 , 2000 );
    }

    public void setAmount ( int amount ) {
        this.amount = Math.max ( amount , 0 );
    }

    public int getOrderId ( ) {
        return orderId;
    }

    public String getCustomerId ( ) {
        return customerId;
    }

    public String getProductId ( ) {
        return productId;
    }

    public DateOrder getOrderDate ( ) {
        return new DateOrder ( orderDate );
    }

    public int getAmount ( ) {
        return amount;
    }


    @Override
    public String toString ( ) {
        return "O=" + orderId + " C=" + customerId + " P=" + productId + " D=" + orderDate + " A=" + amount;
    }
}
