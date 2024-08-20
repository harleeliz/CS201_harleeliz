
/* Lab Exercises No.5
Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public void purchaseProduct(Product product, double payment) {
        if (products.contains(product)) {
            if (payment >= product.getPrice()) {
                System.out.println("Dispensing " + product.getName() + ".");
                double change = payment - product.getPrice();
                System.out.println("Change: $" + change);
            } else {
                System.out.println("Money is not enough. return: $" + payment);
            }
        } else {
            System.out.println("All sold out");
        }
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product Coke = new Product("Coke", 2.50);
        Product Water = new Product("Water", 3.25);
        Product Pumpkinpie = new Product("Pumpkin Pie", 10.75);

        vendingMachine.addProduct(Coke);
        vendingMachine.addProduct(Water);
        vendingMachine.addProduct(Pumpkinpie);

        System.out.println("Available products:");
        vendingMachine.displayProducts();

        System.out.println("\nLet's go to shopping.");
        System.out.println("Failed to purchase item");
        Product selectedProduct = Water;
        double money = 2.00;
        System.out.println("Selected product: " + selectedProduct.getName());
        System.out.println("Price: $" + money);
        vendingMachine.purchaseProduct(selectedProduct, money);
        
        System.out.println("\nLet's go to shopping.");
        System.out.println("successful purchase of goods");
        Product selectedProduct1 = Pumpkinpie;
        double money1 = 200.00;
        System.out.println("Selected product: " + selectedProduct1.getName());
        System.out.println("Price: $" + money1);
        vendingMachine.purchaseProduct(selectedProduct1, money1);
    }
}
