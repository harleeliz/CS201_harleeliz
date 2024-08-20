/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class TriangleTest {
    public static void main(String[] args) {
        System.out.println("Test Case 1 - The triangle(3,4,5) is a right triangle? ");
        Triangle t1 = new Triangle(3, 4, 5);
        boolean t1IsRightTriangle = t1.rightTriangle();
        System.out.println("t1 is " + (t1IsRightTriangle ? "a right triangle" : "not a right triangle"));
        System.out.println();

        System.out.println("Test Case 2 - The triangle(4,5,3) is a right triangle? ");
        Triangle t2 = new Triangle(4, 5, 3);
        boolean t2IsRightTriangle = t2.rightTriangle();
        System.out.println("t2 is " + (t2IsRightTriangle ? "a right triangle" : "not a right triangle"));
        System.out.println();

        System.out.println("Test Case 3 - The triangle(5,3,4) is a right triangle? ");
        Triangle t3 = new Triangle(5, 3, 4);
        boolean t3IsRightTriangle = t3.rightTriangle();
        System.out.println("t3 is " + (t3IsRightTriangle ? "a right triangle" : "not a right triangle"));
        System.out.println();

        System.out.println("Test Case 4 - The triangle(   ) is a right triangle? ");
        Triangle t4 = new Triangle();
        boolean t4IsRightTriangle = t4.rightTriangle();
        System.out.println("t4 is " + (t4IsRightTriangle ? "a right triangle" : "not a right triangle"));
        System.out.println();

        System.out.println("Test Case 5 - The triangle(2,3,Math.sqrt(13)) is a right triangle? ");
        Triangle t5 = new Triangle(2, 3, Math.sqrt(13));
        boolean t5IsRightTriangle = t5.rightTriangle();
        System.out.println("t5 is " + (t5IsRightTriangle ? "a right triangle" : "not a right triangle"));
    }
}
