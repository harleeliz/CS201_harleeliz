/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

public class ApplianceSetTest {
    public static void main(String[] args) {
        testAddApplianceBasic();
        testAddApplianceAdvanced();
        testGetCustomerAppliances();
    }

    private static void testAddApplianceBasic() {
        ApplianceSet list = new ApplianceSet(2);
        AppliancePoly o1 = new AppliancePoly(10000001, "Video Game", 200, 0, 0.167);
        SmartAppliancePoly r1 = new SmartAppliancePoly(10000001, "Clothes Washer", 1200, 0, 0.025, 0.25);

        list.addAppliance(o1);
        list.addAppliance(r1);

        System.out.println("Test Case 1 - addAppliance (basic)");
        boolean a1 = list.toString().equals("Count=2\n1 Loc=10000001 Name=Video Game OnW=200 OffW=0 ProbOn=0.167\n2 Loc=10000001 Name=Clothes Washer OnW=1200 OffW=0 ProbOn=0.025 Reduce%=0.25\n");
        System.out.println("Expected Output: " + "Count=2\n1 Loc=10000001 Name=Video Game OnW=200 OffW=0 ProbOn=0.167\n2 Loc=10000001 Name=Clothes Washer OnW=1200 OffW=0 ProbOn=0.025 Reduce%=0.25\n");
        System.out.println("Your Output    : " + list.toString());

        if (a1) {
            System.out.println("Test Case 1 Passed");
        } else {
            System.out.println("Test Case 1 Failed");
        }
        System.out.println();
    }

    private static void testAddApplianceAdvanced() {
        ApplianceSet list = new ApplianceSet(2);
        AppliancePoly o1 = new AppliancePoly(10000001, "Video Game", 200, 0, 0.167);
        SmartAppliancePoly r1 = new SmartAppliancePoly(10000001, "Clothes Washer", 1200, 0, 0.025, 0.25);

        list.addAppliance(o1);
        list.addAppliance(r1);

        AppliancePoly o2 = new AppliancePoly(10000002, "Lighting - 100 Watt", 100, 0, 0.33);
        list.addAppliance(o2);

        System.out.println("Test Case 2 - addAppliance (advanced)");
        boolean a2 = list.toString().equals("Count=3\n1 Loc=10000001 Name=Video Game OnW=200 OffW=0 ProbOn=0.167\n2 Loc=10000001 Name=Clothes Washer OnW=1200 OffW=0 ProbOn=0.025 Reduce%=0.25\n3 Loc=10000002 Name=Lighting - 100 Watt OnW=100 OffW=0 ProbOn=0.33\n");
        System.out.println("Expected Output: " + "Count=3\n1 Loc=10000001 Name=Video Game OnW=200 OffW=0 ProbOn=0.167\n2 Loc=10000001 Name=Clothes Washer OnW=1200 OffW=0 ProbOn=0.025 Reduce%=0.25\n3 Loc=10000002 Name=Lighting - 100 Watt OnW=100 OffW=0 ProbOn=0.33\n");
        System.out.println("Your Output    : " + list.toString());

        list.addAppliance(null);
        System.out.println("add null object, no change");
        boolean a3 = list.toString().equals("Count=3\n1 Loc=10000001 Name=Video Game OnW=200 OffW=0 ProbOn=0.167\n2 Loc=10000001 Name=Clothes Washer OnW=1200 OffW=0 ProbOn=0.025 Reduce%=0.25\n3 Loc=10000002 Name=Lighting - 100 Watt OnW=100 OffW=0 ProbOn=0.33\n");
        System.out.println("Expected Output: " + "Count=3\n1 Loc=10000001 Name=Video Game OnW=200 OffW=0 ProbOn=0.167\n2 Loc=10000001 Name=Clothes Washer OnW=1200 OffW=0 ProbOn=0.025 Reduce%=0.25\n3 Loc=10000002 Name=Lighting - 100 Watt OnW=100 OffW=0 ProbOn=0.33\n");
        System.out.println("Your Output    : " + list.toString());

        o2.setName("computer");
        System.out.println("verify deep copy on last appliance added, no change");
        boolean a4 = list.toString().equals("Count=3\n1 Loc=10000001 Name=Video Game OnW=200 OffW=0 ProbOn=0.167\n2 Loc=10000001 Name=Clothes Washer OnW=1200 OffW=0 ProbOn=0.025 Reduce%=0.25\n3 Loc=10000002 Name=Lighting - 100 Watt OnW=100 OffW=0 ProbOn=0.33\n");
        System.out.println("Expected Output: " + "Count=3\n1 Loc=10000001 Name=Video Game OnW=200 OffW=0 ProbOn=0.167\n2 Loc=10000001 Name=Clothes Washer OnW=1200 OffW=0 ProbOn=0.025 Reduce%=0.25\n3 Loc=10000002 Name=Lighting - 100 Watt OnW=100 OffW=0 ProbOn=0.33\n");
        System.out.println("Your Output    : " + list.toString());

        if (a2 && a3 && a4) {
            System.out.println("Test Case 2 Passed");
        } else {
            System.out.println("Test Case 2 Failed");
        }
        System.out.println();
    }

    private static void testGetCustomerAppliances() {
        ApplianceSet list = new ApplianceSet(2);
        AppliancePoly o1 = new AppliancePoly(10000001, "Video Game", 200, 0, 0.167);
        AppliancePoly o2 = new AppliancePoly(10000002, "Lighting - 100 Watt", 100, 0, 0.33);
        SmartAppliancePoly r1 = new SmartAppliancePoly(10000001, "Clothes Washer", 1200, 0, 0.025, 0.25);

        list.addAppliance(o1);
        list.addAppliance(o2);
        list.addAppliance(r1);

        System.out.println("Test Case 3 - getCustomerAppliances");
        boolean a3 = list.getCustomerAppliances(10000001).equals("Loc=10000001 Name=Video Game OnW=200 OffW=0 ProbOn=0.167\nLoc=10000001 Name=Clothes Washer OnW=1200 OffW=0 ProbOn=0.025 Reduce%=0.25\n");
        System.out.println("Expected Output: " + "Loc=10000001 Name=Video Game OnW=200 OffW=0 ProbOn=0.167\nLoc=10000001 Name=Clothes Washer OnW=1200 OffW=0 ProbOn=0.025 Reduce%=0.25\n");
        System.out.println("Your Output    : " + list.getCustomerAppliances(10000001));

        System.out.println("get customer appliances - location not OK");
        boolean a4 = list.getCustomerAppliances(11111111).equals("");
        System.out.println("Expected Output: " + "");
        System.out.println("Your Output    : " + list.getCustomerAppliances(11111111));

        if (a3 && a4) {
            System.out.println("Test Case 3 Passed");
        } else {
            System.out.println("Test Case 3 Failed");
        }
    }
}
