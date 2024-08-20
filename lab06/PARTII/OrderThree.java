package PARTII;

class OrderThree {
    private static int orderCounter = 0;
    private int orderID;
    private String customer;
    private String product;
    private Date date;
    private int amount;

    public OrderThree(String customer, String product, Date date, int amount) {
        this.orderID = ++orderCounter;
        this.customer = customer;
        this.product = product;
        this.date = date;
        this.amount = amount;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getCustomer() {
        return customer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Add getters and setters as needed

    @Override
    public String toString() {
        return "O=" + orderID + " C=" + customer + " P=" + product + " D=" + date.toString() + " A=" + amount;
    }
}
