/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class HouseTest {
	public static void main(String[] args) {
		System.out.println("Test Case 1 - constructors,, mutators, toString");
		House p1=new House();		
		boolean a1=p1.toString().equals("SqFootage=1000 #Bedrooms=1");
		House p2=new House(2000, 3);	
		boolean a2=p2.toString().equals("SqFootage=2000 #Bedrooms=3");
		House p2a=new House(-2000, 3);	
		boolean a2a=p2a.toString().equals("SqFootage=1000 #Bedrooms=3");
		House p2b=new House(2000, 0);	
		boolean a2b=p2b.toString().equals("SqFootage=2000 #Bedrooms=1");
		p2b.setSqFootage(2500);
		boolean a2c=p2b.toString().equals("SqFootage=2500 #Bedrooms=1");
		p2b.setNumBedrooms(4);
		boolean a2d=p2b.toString().equals("SqFootage=2500 #Bedrooms=4");
		if (a1 && a2 && a2a && a2b && a2c && a2d) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}

		System.out.println("Test Case 2 - price");
		House p21=new House();		
		boolean a21=(p21.price()==100000);
		System.out.println(p21.price());
		House p22=new House(2000, 3);
		boolean a22=(p22.price()==300000);	
		System.out.println(p22.price());
		House p23=new House(2500, 4);	
		boolean a23=(p23.price()==500000);
		System.out.println(p23.price());
		if (a21 && a22 && a23) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}	
	}
}