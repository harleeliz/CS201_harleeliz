package PARTII;

import java.util.Arrays;
class OrderList {
    private static final int DEFAULT_SIZE = 1000;
    private OrderThree[] orders;
    private int size;

    public OrderList() {
        this.orders = new OrderThree[DEFAULT_SIZE];
        this.size = 0;
    }

    public void addOrder(OrderThree order) {
        if (size == orders.length) {
            // Double the size of the array if it's full
            orders = Arrays.copyOf(orders, size * 2);
        }
        orders[size] = order;
        size++;
    }

    public boolean deleteOrder(int deleteOrderID) {
        for (int i = 0; i < size; i++) {
            if (orders[i] != null && orders[i].getOrderID() == deleteOrderID) {
                // Shift the remaining elements to fill the gap
                for (int j = i; j < size - 1; j++) {
                    orders[j] = orders[j + 1];
                }
                orders[size - 1] = null; // Clear the last element
                size--;
                return true;
            }
        }
        return false; // Order not found
    }

    public String getCustomerOrders(String keyCustomerID) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (orders[i] != null && orders[i].getCustomer().equals(keyCustomerID)) {
                result.append(orders[i].toString()).append("\n");
            }
        }
        return result.toString();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (orders[i] != null) {
                result.append(orders[i].toString()).append("\n");
            }
        }
        return result.toString();
    }
}
