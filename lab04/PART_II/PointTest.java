/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class PointTest {
    public static void main(String[] args) {
        System.out.println("Test Case 1 - quadrant 1");
        Point p1=new Point(1, 1);
        System.out.println("EXPECTED RESULT:1");
        System.out.println("YOUR RESULT    :"+p1.whichQuadrant());
        System.out.println("PASSED="+(p1.whichQuadrant()==1)+"\n");

        System.out.println("Test Case 2 - quadrant 2");
        Point p2=new Point(-1, 1);
        System.out.println("EXPECTED RESULT:2");
        System.out.println("YOUR RESULT    :"+p2.whichQuadrant());
        System.out.println("PASSED="+(p2.whichQuadrant()==2)+"\n");

        System.out.println("Test Case 3 - quadrant 3");
        Point p3=new Point(-1, -1);
        System.out.println("EXPECTED RESULT:3");
        System.out.println("YOUR RESULT    :"+p3.whichQuadrant());
        System.out.println("PASSED="+(p3.whichQuadrant()==3)+"\n");

        System.out.println("Test Case 4 - quadrant 4");
        Point p4=new Point(1, -1);
        System.out.println("EXPECTED RESULT:4");
        System.out.println("YOUR RESULT    :"+p4.whichQuadrant());
        System.out.println("PASSED="+(p4.whichQuadrant()==4)+"\n");

        System.out.println("Test Case 5 - x-axis");
        Point p5=new Point(1, 0);
        System.out.println("EXPECTED RESULT:0");
        System.out.println("YOUR RESULT    :"+p5.whichQuadrant());
        System.out.println("PASSED="+(p5.whichQuadrant()==0)+"\n");

        System.out.println("Test Case 6 - y-axis");
        Point p6=new Point(0, 1);
        System.out.println("EXPECTED RESULT:0");
        System.out.println("YOUR RESULT    :"+p6.whichQuadrant());
        System.out.println("PASSED="+(p6.whichQuadrant()==0)+"\n");

        System.out.println("Test Case 7 - origin");
        Point p7=new Point(0, 0);
        System.out.println("EXPECTED RESULT:0");
        System.out.println("YOUR RESULT    :"+p7.whichQuadrant());
        System.out.println("PASSED="+(p7.whichQuadrant()==0)+"\n");
    }
}