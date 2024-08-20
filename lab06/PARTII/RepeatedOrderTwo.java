package PARTII;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class RepeatedOrderTwo extends OrderTwo {
    private int period;
    private Date endOrderDate;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public RepeatedOrderTwo(String type, String companyID, String productID, String orderDate, int orderAmount, int period, String endOrderDate) throws ParseException {
        super(type, companyID, productID, orderDate, orderAmount);
        this.period = period;
        this.endOrderDate = dateFormat.parse(endOrderDate);
    }

    @Override
    public String toString() {
        return super.toString() + " Period=" + period + " E=" + dateFormat.format(endOrderDate);
    }
}