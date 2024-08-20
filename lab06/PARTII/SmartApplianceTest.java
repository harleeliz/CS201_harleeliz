/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/
package PARTII;

public class SmartApplianceTest {
    public static void main(String[] args) {
        boolean test1 = testApplianceConstructorToString1();
        boolean test2 = testApplianceConstructorArgsNotOK();
        boolean test3 = testApplianceEquals();
        boolean test4 = testSmartApplianceConstructorToString1();
        boolean test5 = testSmartApplianceConstructorArgsNotOK();
        boolean test6 = testSmartApplianceEquals();

        boolean allTestsPassed = test1 && test2 && test3 && test4 && test5 && test6;

        if (allTestsPassed) {
            System.out.println("All tests passed successfully.");
        } else {
            System.out.println("Some tests failed.");
            System.out.println(test1);
            System.out.println(test2);
            System.out.println(test3);
            System.out.println(test4);
            System.out.println(test5);
            System.out.println(test6);
            
        }
    }
    public static boolean testApplianceConstructorToString1() {
        Appliance o1 = new Appliance(10000001, "Video Game", 50, 0, 0.167);
        boolean a1 = o1.toString().equals("Loc=10000001 Name=Video Game OnW=50 OffW=0 ProbOn=0.167");
        System.out.println("Test 1 - Appliance constructor (args OK), toString()");
        System.out.println("Expected Output: Loc=10000001 Name=Video Game OnW=50 OffW=0 ProbOn=0.167");
        System.out.println("Your Output    : " + o1.toString());
        return a1;
    }

    public static boolean testApplianceConstructorArgsNotOK() {
        Appliance o1 = new Appliance(1001, "Video Game", 50, 0, 0.167);
        boolean a1 = o1.toString().equals("Loc=1001 Name=Video Game OnW=50 OffW=0 ProbOn=0.167");
        System.out.println("Test 2 - Appliance constructor - location invalid");
        System.out.println("Expected Output: Loc=1001 Name=Video Game OnW=50 OffW=0 ProbOn=0.167");
        System.out.println("Your Output    : " + o1.toString());

        Appliance o2 = new Appliance(10000001, null, 200, 0, 0.05);
        boolean a2 = o2.toString().equals("Loc=10000001 Name=UNKNOWN OnW=200 OffW=0 ProbOn=0.050");
        System.out.println("Test 3 - Appliance constructor - name invalid");
        System.out.println("Expected Output: Loc=10000001 Name=UNKNOWN OnW=200 OffW=0 ProbOn=0.050");
        System.out.println("Your Output    : " + o2.toString());

        Appliance o3 = new Appliance(12345678, "Video Game", 0, 0, 0.1);
        boolean a3 = o3.toString().equals("Loc=12345678 Name=Video Game OnW=1 OffW=0 ProbOn=0.100");
        System.out.println("Test 4 - Appliance constructor - on watts invalid");
        System.out.println("Expected Output: Loc=12345678 Name=Video Game OnW=1 OffW=0 ProbOn=0.100");
        System.out.println("Your Output    : " + o3.toString());

        Appliance o4 = new Appliance(22222222, "Video Game", 50, -1, 0.167);
        boolean a4 = o4.toString().equals("Loc=22222222 Name=Video Game OnW=50 OffW=0 ProbOn=0.167");
        System.out.println("Test 5 - Appliance constructor - off watts invalid");
        System.out.println("Expected Output: Loc=22222222 Name=Video Game OnW=50 OffW=0 ProbOn=0.167");
        System.out.println("Your Output    : " + o4.toString());

        Appliance o5 = new Appliance(10000001, "hair dryer", 200, 0, 1.1);
        boolean a5 = o5.toString().equals("Loc=10000001 Name=hair dryer OnW=200 OffW=0 ProbOn=0.000");
        System.out.println("Test 6 - Appliance constructor - prob on invalid");
        System.out.println("Expected Output: Loc=10000001 Name=hair dryer OnW=200 OffW=0 ProbOn=0.000");
        System.out.println("Your Output    : " + o5.toString());

        return a1 && a2 && a3 && a4 && a5;
    }

    public static boolean testApplianceEquals() {
        Appliance o1 = new Appliance(22222222, "Video Game", 50, 0, 0.167);
        Appliance o2 = new Appliance(22222222, "Video Game", 50, 0, 0.167);
        boolean a12 = o1.equals(o2);
        System.out.println("Test 7 - Appliance - equals TRUE");
        System.out.println("Expected Output: true");
        System.out.println("Your Output    : " + a12);
              
        boolean a21 = o2.equals(o1);
        System.out.println("Test 8 - Appliance - reverse equals TRUE");
        System.out.println("Expected Output: true");
        System.out.println("Your Output    : " + a21);
        
        Appliance o3 = new Appliance(123456781, "Video Game", 50, 0, 0.167);
        boolean a13 = o1.equals(o3);
        System.out.println("Test 9 - Appliance - equals FALSE name");
        System.out.println("Expected Output: false");
        System.out.println("Your Output    : " + a13);

        Appliance o4 = new Appliance(22222222, "Video Game", 51, 0, 0.167);
        boolean a14 = o1.equals(o4);
        System.out.println("Test 10 - Appliance - equals FALSE on watt");
        System.out.println("Expected Output: false");
        System.out.println("Your Output    : " + a14);

        Appliance o5 = new Appliance(22222222, "Video Game", 50, 1, 0.167);
        boolean a15 = o1.equals(o5);
        System.out.println("Test 11 - Appliance - equals FALSE off watt");
        System.out.println("Expected Output: false");
        System.out.println("Your Output    : " + a15);

        Appliance o6 = new Appliance(123456781, "Video Game", 50, 0, 0.166);
        boolean a16 = o1.equals(o6);
        System.out.println("Test 12 - Appliance - equals FALSE prob on");
        System.out.println("Expected Output: false");
        System.out.println("Your Output    : " + a16);

        return a12 && a21 && !a13 && !a14 && !a15 && !a16;
    }

    public static boolean testSmartApplianceConstructorToString1() {
        SmartAppliance o1 = new SmartAppliance(10000001, "Video Game", 50, 0, 0.167, 0.25);
        boolean a1 = o1.toString().equals("Loc=10000001 Name=Video Game OnW=50 OffW=0 ProbOn=0.167 Reduce%=0.25");
        System.out.println("Test 13 - SmartAppliance constructor (args OK), toString()");
        System.out.println("Expected Output: Loc=10000001 Name=Video Game OnW=50 OffW=0 ProbOn=0.167 Reduce%=0.25");
        System.out.println("Your Output    : " + o1.toString());
        return a1;
    }

    public static boolean testSmartApplianceConstructorArgsNotOK() {
        SmartAppliance o1 = new SmartAppliance(10011001, "Video Game", 50, 0, 0.167, -0.1);
        boolean a1 = o1.toString().equals("Loc=10011001 Name=Video Game OnW=50 OffW=0 ProbOn=0.167 Reduce%=1.00");
        System.out.println("Test 14 - SmartAppliance constructor - reduce percentage negative");
        System.out.println("Expected Output: Loc=10011001 Name=Video Game OnW=50 OffW=0 ProbOn=0.167 Reduce%=1.00");
        System.out.println("Your Output    : " + o1.toString());

        SmartAppliance o2 = new SmartAppliance(10000001, "Washer", 200, 0, 0.05, 1.1);
        boolean a2 = o2.toString().equals("Loc=10000001 Name=Washer OnW=200 OffW=0 ProbOn=0.050 Reduce%=1.00");
        System.out.println("Test 15 - SmartAppliance constructor - reduce percentage >1");
        System.out.println("Expected Output: Loc=10000001 Name=Washer OnW=200 OffW=0 ProbOn=0.050 Reduce%=1.00");
        System.out.println("Your Output    : " + o2.toString());

        return a1 && a2;
    }

    public static boolean testSmartApplianceEquals() {
        SmartAppliance o1 = new SmartAppliance(22222222, "Video Game", 50, 0, 0.167, 0.5);
        SmartAppliance o2 = new SmartAppliance(22222222, "Video Game", 50, 0, 0.167, 0.5);
        boolean a12 = o1.equals(o2);
        System.out.println("Test 16 - SmartAppliance - equals TRUE");
        System.out.println("Expected Output: true");
        System.out.println("Your Output    : " + a12);

        boolean a21 = o2.equals(o1);
        System.out.println("Test 17 - SmartAppliance - reverse equals TRUE");
        System.out.println("Expected Output: true");
        System.out.println("Your Output    : " + a21);
        
        SmartAppliance o3 = new SmartAppliance(22222222, "Video Game", 50, 0, 0.167, 0.51);
        boolean a13 = o1.equals(o3);
        System.out.println("Test 18 - SmartAppliance - equals FALSE reducePercent");
        System.out.println("Expected Output: false");
        System.out.println("Your Output    : " + a13);
        
        Appliance o4 = new SmartAppliance(2222222, "Video Game", 50, 0, 0.167, 0.51);
        boolean a34 = o3.equals(o4);
        System.out.println("Test 19 - SmartAppliance to Appliance - equals FALSE");
        System.out.println("Expected Output: false");
        System.out.println("Your Output    : " + a34);

        boolean a43 = o4.equals(o3);
        System.out.println("Test 20 - Appliance to SmartAppliance - equals TRUE");
        System.out.println("Expected Output: true");
        System.out.println("Your Output    : " + a21);


        return a12 && a21 && !a13 && !a34 && !a43;
        
        
        
    }
}