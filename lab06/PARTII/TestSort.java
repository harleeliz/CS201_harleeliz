/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */


package PARTII;
import java.util.Arrays;
import java.util.Scanner;
public class TestSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and create Appliance or SmartAppliance objects and store them in an array
        ApplianceInter[] appliances = new ApplianceInter[5];

        System.out.println("Please, Input the 5 records, following the format of the problem" +
                "\nFormat: location,name,onWattage,offWattage,probaibilityOn" +
                "\nOR " +
                "location,name,onWattage,offWattage,probaibilityOn,reducePercentage\n" +
                "Example of the format: 10000001,Video Game,200,0,0.167\n" +
                "Your input: " );

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            long applianceID = Long.parseLong(parts[0]);
            String name = parts[1];
            int onWattage = Integer.parseInt(parts[2]);
            int offWattage = Integer.parseInt(parts[3]);
            double probabilityOn = Double.parseDouble(parts[4]);

            if (parts.length == 5) {
                appliances[i] = new ApplianceInter(applianceID, name, onWattage, offWattage, probabilityOn);
            } else if (parts.length == 6) {
                double reducePercentage = Double.parseDouble(parts[5]);
                appliances[i] = new SmartApplianceInter(applianceID, name, onWattage, offWattage, probabilityOn, reducePercentage);
            }
        }
        // Sort the array using Arrays.sort() based on your custom comparison logic
        Arrays.sort(appliances);

        // Output the sorted appliances
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " " + appliances[i]);
        }
    }
}