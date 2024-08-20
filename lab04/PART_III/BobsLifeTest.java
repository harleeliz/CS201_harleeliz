/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class BobsLifeTest {
    public static void main(String[] args) {
        System.out.println("Test Case 1 - constructor, toString");
        BobsLife b1 = new BobsLife("home", 0, 5, 4);
        boolean a1 = b1.toString().equals("Time:0 Location:home Hunger:0 Dollars:5 Fitness:4 (alive and well)");
        System.out.println("valid args - Hunger:0 Dollars:5 Fitness:4");
        System.out.println("Expected Output: " + "Time:0 Location:home Hunger:0 Dollars:5 Fitness:4 (alive and well)");
        System.out.println("Your Output:     " + b1.toString());
        System.out.println("PASSED= " + (b1.toString ( ) ).equals ( "Time:0 Location:home Hunger:0 Dollars:5 Fitness:4 (alive and well)") );

        System.out.println();
        BobsLife b2 = new BobsLife("gym", 4, 10, 8);
        boolean a2 = b2.toString().equals("Time:0 Location:gym Hunger:4 Dollars:10 Fitness:8 (alive and well)");
        System.out.println("valid args - Hunger:4 Dollars:10 Fitness:8");
        System.out.println("Expected Output: " + "Time:0 Location:gym Hunger:4 Dollars:10 Fitness:8 (alive and well)");
        System.out.println("Your Output:     " + b2.toString());
        System.out.println("PASSED= " + (b2.toString ( ) ).equals ( "Time:0 Location:gym Hunger:4 Dollars:10 Fitness:8 (alive and well)") );

        System.out.println();
        BobsLife b3 = new BobsLife("store", 0, 5, 4);
        boolean a3 = b3.toString().equals("Time:0 Location:home Hunger:0 Dollars:5 Fitness:4 (alive and well)");
        System.out.println("invalid location - Hunger:0 Dollars:5 Fitness:4");
        System.out.println("Expected Output: " + "Time:0 Location:home Hunger:0 Dollars:5 Fitness:4 (alive and well)");
        System.out.println("Your Output:     " + b3.toString());
        System.out.println("PASSED= " + (b3.toString ( ) ).equals ( "Time:0 Location:home Hunger:0 Dollars:5 Fitness:4 (alive and well)") );

        System.out.println();
        BobsLife b4 = new BobsLife("home", 10, 5, 4);
        boolean a4 = b4.toString().equals("Time:0 Location:home Hunger:10 Dollars:5 Fitness:4 (alive and well)");
        System.out.println("invalid hunger - Hunger:10 Dollars:5 Fitness:4");
        System.out.println("Expected Output: " + "Time:0 Location:home Hunger:0 Dollars:5 Fitness:4 (alive and well)");
        System.out.println("Your Output:     " + b4.toString());
        System.out.println("PASSED= " + (b4.toString ( ) ).equals ( "Time:0 Location:home Hunger:10 Dollars:5 Fitness:4 (alive and well)") );

        System.out.println();
        BobsLife b5 = new BobsLife("home", -1, 5, 4);
        boolean a5 = b5.toString().equals("Time:0 Location:home Hunger:0 Dollars:5 Fitness:4 (alive and well)");
        System.out.println("invalid hunger - Hunger:-1 Dollars:5 Fitness:4");
        System.out.println("Expected Output: " + "Time:0 Location:home Hunger:0 Dollars:5 Fitness:4 (alive and well)");
        System.out.println("Your Output:     " + b5.toString());
        System.out.println("PASSED= " + (b5.toString ( ) ).equals ( "Time:0 Location:home Hunger:0 Dollars:5 Fitness:4 (alive and well)") );

        System.out.println();
        BobsLife b6 = new BobsLife("home", 0, -1, 4);
        boolean a6 = b6.toString().equals("Time:0 Location:home Hunger:0 Dollars:5 Fitness:4 (alive and well)");
        System.out.println("invalid dollars - Hunger:0 Dollars:-1 Fitness:4");
        System.out.println("Expected Output: " + "Time:0 Location:home Hunger:0 Dollars:0 Fitness:4 (alive and well)");
        System.out.println("Your Output:     " + b6.toString());
        System.out.println("PASSED= " + (b6.toString ( ) ).equals ( "Time:0 Location:home Hunger:0 Dollars:0 Fitness:4 (alive and well)" ));

        System.out.println();
        BobsLife b7 = new BobsLife("home", 0, 5, 0);
        boolean a7 = b7.toString().equals("Time:0 Location:home Hunger:0 Dollars:5 Fitness:0 (alive and well)");
        System.out.println("invalid fitness - Hunger:0 Dollars:5 Fitness:0");
        System.out.println("Expected Output: " + "Time:0 Location:home Hunger:0 Dollars:5 Fitness:0 (alive and well)");
        System.out.println("Your Output:     " + b7.toString());
        System.out.println("PASSED= " + (b7.toString ( ) ).equals ( "Time:0 Location:home Hunger:0 Dollars:5 Fitness:0 (alive and well)"));

        System.out.println();
        System.out.println("Test Case 2 - move (stay alive and out of jail)");
        BobsLife b = new BobsLife("home", 0, 5, 4);
        b.move("home");
        boolean a8 = b.toString().equals("Time:1 Location:home Hunger:0 Dollars:4 Fitness:4 (alive and well)");
        System.out.println("move home");
        System.out.println("Expected Output: " + "Time:1 Location:home Hunger:0 Dollars:4 Fitness:4 (alive and well)");
        System.out.println("Your Output:     " + b.toString());
        System.out.println("PASSED= " + (b.toString ( ) ).equals ( "Time:1 Location:home Hunger:0 Dollars:4 Fitness:4 (alive and well)"));

        System.out.println();
        b.move("work");
        boolean a9 = b.toString().equals("Time:2 Location:work Hunger:2 Dollars:7 Fitness:3 (alive and well)");
        System.out.println("move work");
        System.out.println("Expected Output: " + "Time:2 Location:work Hunger:2 Dollars:7 Fitness:3 (alive and well)");
        System.out.println("Your Output:     " + b.toString());
        System.out.println("PASSED= " + (b.toString ( ) ).equals ( "Time:2 Location:work Hunger:2 Dollars:7 Fitness:3 (alive and well)"));

        System.out.println();
        b.move("gym");
        boolean a10 = b.toString().equals("Time:3 Location:gym Hunger:5 Dollars:5 Fitness:5 (alive and well)");
        System.out.println("move gym");
        System.out.println("Expected Output: " + "Time:3 Location:gym Hunger:5 Dollars:5 Fitness:5 (alive and well)");
        System.out.println("Your Output:     " + b.toString());
        System.out.println("PASSED= " + (b.toString ( ) ).equals ( "Time:3 Location:gym Hunger:5 Dollars:5 Fitness:5 (alive and well)"));

        // Test Case 3 - b1: Bob goes to jail (dollars<0)
        System.out.println();
        System.out.println("Test Case 3 - move (die and/or go to jail)");
        b1 = new BobsLife ( "home" , 0 , 5 , 4 );
        b1.move("home");
        b1.move("home");
        b1.move("home");
        b1.move("home");
        b1.move("home");
        b1.move("home");
        b1.move("home");
        boolean a11 = b1.toString().equals("Time:6 Location:home Hunger:0 Dollars:-1 Fitness:4 (in jail)");
        System.out.println("go to jail (dollars<0)");
        System.out.println("Expected Output: " + "Time:6 Location:home Hunger:0 Dollars:-1 Fitness:4 (in jail)");
        System.out.println("Your Output:     " + b1.toString());
        System.out.println("PASSED= " + (b1.toString ( ) ).equals ( "Time:6 Location:home Hunger:0 Dollars:-1 Fitness:4 (in jail)"));
        System.out.println();
// Test Case 3 - b2: Bob dies of hunger and goes to jail (dollars<0)
        b2 = new BobsLife ( "home" , 0 , 5 , 4 );
        b2.move("gym");
        b2.move("gym");
        b2.move("gym");
        b2.move("gym");
        boolean a12 = b2.toString().equals("Time:3 Location:gym Hunger:9 Dollars:-1 Fitness:10 (deceased)");
        System.out.println("die (hunger>6) AND go to jail (dollars<0)");
        System.out.println("Expected Output: " + "Time:3 Location:gym Hunger:9 Dollars:-1 Fitness:10 (deceased)");
        System.out.println("Your Output:     " + b2.toString());
        System.out.println("PASSED= " + (b2.toString ( ) ).equals ( "Time:3 Location:gym Hunger:9 Dollars:-1 Fitness:10 (deceased)"));
        System.out.println();

// Test Case 3 - b3: Bob dies of fitness (fitness<1)
       b3 = new BobsLife("home", 0, 5, 4);
        b3.move("work");
        b3.move("work");
        b3.move("work");
        b3.move("home");
        b3.move("work");
        b3.move("work");
        boolean a13 = b3.toString().equals("Time:5 Location:work Hunger:5 Dollars:16 Fitness:0 (deceased)");
        System.out.println("die (fitness<1)");
        System.out.println("Expected Output: " + "Time:5 Location:work Hunger:5 Dollars:16 Fitness:0 (deceased)");
        System.out.println("Your Output:     " + b3.toString());
        System.out.println("PASSED= " + (b3.toString ( ) ).equals ( "Time:5 Location:work Hunger:5 Dollars:16 Fitness:0 (deceased)"));
        System.out.println();
// Test Case 3 - b4: Bob dies of hunger (hunger>6)
        b4 = new BobsLife("home", 0, 5, 4);
        b4.move("work");
        b4.move("work");
        b4.move("gym");
        b4.move("home");
        boolean a14 = b4.toString().equals("Time:3 Location:gym Hunger:7 Dollars:9 Fitness:4 (deceased)");
        System.out.println("die (hunger>6)");
        System.out.println("Expected Output: " + "Time:3 Location:gym Hunger:7 Dollars:9 Fitness:4 (deceased)");
        System.out.println("Your Output:     " + b4.toString());
        System.out.println("PASSED= " + (b4.toString ( ) ).equals ( "Time:3 Location:gym Hunger:7 Dollars:9 Fitness:4 (deceased)"));
        System.out.println();
// Check if all test cases passed
        boolean allTestsPassed = a11 && a12 && a13 && a14;
        System.out.println("\nAll test cases passed: " + allTestsPassed);
    }
}
