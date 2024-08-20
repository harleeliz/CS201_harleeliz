/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class SubwayMathErrorCheckTest {
    public static void main(String[] args) {
        SubwayMathErrorCheck value5 = new SubwayMathErrorCheck(-0.01, 1);
        boolean a1 = value5.toString().equals("Bonus: 15.0% Ride Cost: $1.00");
        value5.setRideCost(-1.5);
        boolean a2 = value5.toString().equals("Bonus: 15.0% Ride Cost: $2.00");

        SubwayMathErrorCheck value6 = new SubwayMathErrorCheck(0.005, -1.5);
        boolean a3 = value6.toString().equals("Bonus: 0.5% Ride Cost: $2.00");
        value6.setBonus(-0.001);
        boolean a4 = value6.toString().equals("Bonus: 15.0% Ride Cost: $2.00");

        SubwayMathErrorCheck value7 = new SubwayMathErrorCheck(-0.01, -1.5);
        boolean a5 = value7.toString().equals("Bonus: 15.0% Ride Cost: $2.00");
        value7.setBonus(0.001);
        value7.setRideCost(1.25);
        boolean a6 = value7.toString().equals("Bonus: 0.1% Ride Cost: $1.25");

        System.out.println("The result of al test are " + (a1 && a2 && a3 && a4 && a5 && a6));
    }
}
