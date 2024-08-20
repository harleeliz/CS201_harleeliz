/* Lab Exercises No.4
 
Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

public class BMITest {

    public static void main(String[] args) {
        boolean result;

        // Test Case 1 
        result = testCase1();
        System.out.println("Test Case 1 Result: " + (result ? "PASSED" : "FAILED"));

        // Test Case 2 
        result = testCase2();
        System.out.println("Test Case 2 Result: " + (result ? "PASSED" : "FAILED"));

        // Test Case 3 
        result = testCase3();
        System.out.println("Test Case 3 Result: " + (result ? "PASSED" : "FAILED"));

    }

    // Test Case 1 - constructors, mutators, toString()
    private static boolean testCase1() {
        BMI p1 = new BMI();
        boolean a1 = p1.toString().equals("Weight=175 Height=72");
        BMI p2 = new BMI(155, 65);
        boolean a2 = p2.toString().equals("Weight=155 Height=65");
        boolean a3 = !p1.equals(p2);
        boolean a4 = p1.equals(p1);
        p1.setWeight(201);
        p1.setHeight(74);
        boolean a5 = !p2.equals(p1);
        return a1 && a2 && a3 && a4 && a5;
    }

    // Test Case 2 - futureQuantity
    private static boolean testCase2() {
        BMI p1 = new BMI();
        boolean a1 = p1.getBMI() == 23.7;
        BMI p2 = new BMI(155, 65);
        boolean a2 = p2.getBMI() == 25.8;
        BMI p3 = new BMI(201, 74);
        boolean a3 = p3.getBMI() == 25.8;
        BMI p4 = new BMI(197, 68);
        boolean a4 = p4.getBMI() == 30;
        return a1 && a2 && a3 && a4;
    }


    // Test Case 3 - getTable
    private static boolean testCase3() {
        BMI p1 = new BMI(); // normal
        boolean a1 = p1.getWeightStatus().equals("Normal");
        BMI p2 = new BMI(155, 65); // overweight
        boolean a2 = p2.getWeightStatus().equals("Overweight");
        BMI p3 = new BMI(196, 68); // overweight
        boolean a3 = p3.getWeightStatus().equals("Overweight");
        BMI p4 = new BMI(197, 68); //obese
        boolean a4 = p4.getWeightStatus().equals("Obese");
        BMI p5 = new BMI(150, 65); // overweight
        boolean a5 = p5.getWeightStatus().equals("Overweight");
        BMI p6 = new BMI(149, 65); // normal
        boolean a6 = p6.getWeightStatus().equals("Normal");
        BMI p7 = new BMI(125, 69); // normal
        boolean a7 = p7.getWeightStatus().equals("Normal");
        BMI p8 = new BMI(120, 69); // underweight
        boolean a8 = p8.getWeightStatus().equals("Underweight");
        return a1 && a2 && a3 && a4 && a5 && a6 && a7 && a8;
    }

}

