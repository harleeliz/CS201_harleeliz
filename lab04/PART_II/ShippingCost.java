/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class ShippingCost {
	public static double addShippingCost (double orderCost, double shippingDistance) {
		double additionalShippingCost = 0.0;

		if (orderCost <= 500.0) {
			if (shippingDistance <= 100.0) {
				additionalShippingCost = 5.0;
			} else if (shippingDistance <= 500.0) {
				additionalShippingCost = 8.0;
			} else if (shippingDistance < 1000.0) {
				additionalShippingCost = 10.0;
			} else {
				additionalShippingCost = 12.0;
			}
		}
		return orderCost + additionalShippingCost;
	}
}