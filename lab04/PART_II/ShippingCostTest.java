/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class ShippingCostTest {
    public static void main(String[] args) {
        double cost1 = ShippingCost.addShippingCost(300.0, 50.0);
        System.out.println("Test Case 1: New Order Cost: $" + cost1); // Output should be 305.0

        // Test Case 2
        double cost2 = ShippingCost.addShippingCost(300.0, 250.0);
        System.out.println("Test Case 2: New Order Cost: $" + cost2); // Output should be 308.0

        // Test Case 3
        double cost3 = ShippingCost.addShippingCost(300.0, 550.0);
        System.out.println("Test Case 3: New Order Cost: $" + cost3); // Output should be 310.0

        // Test Case 4
        double cost4 = ShippingCost.addShippingCost(499.0, 1001.0);
        System.out.println("Test Case 4: New Order Cost: $" + cost4); // Output should be 511.0

        // Test Case 5
        double cost5 = ShippingCost.addShippingCost(505.0, 50.0);
        System.out.println("Test Case 5: New Order Cost: $" + cost5); // Output should be 505.0

        // Test Case 6
        double cost6 = ShippingCost.addShippingCost(555.0, 250.0);
        System.out.println("Test Case 6: New Order Cost: $" + cost6); // Output should be 555.0

        // Test Case 7
        double cost7 = ShippingCost.addShippingCost(501.0, 550.0);
        System.out.println("Test Case 7: New Order Cost: $" + cost7); // Output should be 501.0

        // Test Case 8
        double cost8 = ShippingCost.addShippingCost(600.0, 1001.0);
        System.out.println("Test Case 8: New Order Cost: $" + cost8); // Output should be 600.0
    }
}
