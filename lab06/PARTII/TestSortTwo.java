package PARTII;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;
public class TestSortTwo {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        OrderTwo[] orders = new OrderTwo[10];


        System.out.println("Please, Input the 10 records, following the format of the problem" +
                "\nFormat: O,Orange Inc.,A1,6/25/2004,5" +
                "\nYour input: " );


        for (int i = 0; i < 10; i++) {
            String[] input = scanner.nextLine().split(",");
            String type = input[0].trim();
            String companyID = input[1].trim();
            String productID = input[2].trim();
            String orderDate = input[3].trim();
            int orderAmount = Integer.parseInt(input[4].trim());

            if (type.equals("O")) {
                orders[i] = new OrderTwo(type, companyID, productID, orderDate, orderAmount);
            } else if (type.equals("R")) {
                int period = Integer.parseInt(input[5].trim());
                String endOrderDate = input[6].trim();
                orders[i] = new RepeatedOrderTwo(type, companyID, productID, orderDate, orderAmount, period, endOrderDate);
            }
        }
        Arrays.sort(orders);
        for (OrderTwo order : orders) {
            System.out.println(order);
        }
    }
}
