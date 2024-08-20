package PARTII;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class OrderTwo implements Comparable<OrderTwo> {
    private String type;
    private String companyID;
    private String productID;
    private Date orderDate;
    private int orderAmount;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public OrderTwo(String type, String companyID, String productID, String orderDate, int orderAmount) throws ParseException {
        this.type = type;
        this.companyID = companyID;
        this.productID = productID;
        this.orderDate = parseDate(orderDate);
        this.orderAmount = orderAmount;
    }

    private static Date parseDate(String dateStr) throws ParseException {
        return dateFormat.parse(dateStr);
    }

    @Override
    public int compareTo(OrderTwo o) {
        if (this.companyID.equals(o.companyID)) {
            return this.orderDate.compareTo(o.orderDate);
        } else {
            return this.companyID.compareTo(o.companyID);
        }
    }

    @Override
    public String toString() {
        return "O=" + orderAmount + " C=" + companyID + " P=" + productID + " D=" + dateFormat.format(orderDate) + " A=" + orderAmount;
    }
}
