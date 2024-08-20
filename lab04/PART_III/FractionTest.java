/* Lab Exercises No.4
Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

public class FractionTest {
    public static void main(String[] args) {
    // Other methods...
        boolean test1 = testCase1();
        boolean test2 = testCase2();
        boolean test3 = testCase3();


        System.out.println("\nTest Case 1 result: " + test1);
        System.out.println("\nTest Case 2 result: " + test2);
        System.out.println("\nTest Case 3 result: " + test3);

    }

    public static boolean testCase1() {
        System.out.println("Test Case 1 - constructors, toString()");
        Fraction f1 = new Fraction(0, 1);
        Fraction f2 = new Fraction(-2, 4);
        Fraction f3 = new Fraction(3, -8);
        Fraction f4 = new Fraction(-4, -11);
        Fraction f5 = new Fraction(6, 0);
	        
	        // Test Case 1 start 
	 
        System.out.print("zero numerator testing ");
        boolean a1=f1.toString().equals("0/1");
        if (a1) System.out.println("PASSED");
        else System.out.println("FAILED "+f1);
        System.out.print("negative numerator testing ");
        boolean a2=f2.toString().equals("-2/4");
        if (a2) System.out.println("PASSED");
        else System.out.println("FAILED "+f2);
        System.out.print("negative denominator testing ");
        boolean a3=f3.toString().equals("-3/8");
        if (a3) System.out.println("PASSED");
        else System.out.println("FAILED "+f3);
        System.out.print("both negative testing ");
        boolean a4=f4.toString().equals("4/11");
        if (a4) System.out.println("PASSED");
        else System.out.println("FAILED "+f4);
        System.out.print("zero denominator testing ");
        boolean a5=f5.toString().equals("6/1");
        if (a5) System.out.println("PASSED");
        else System.out.println("FAILED "+f5);

	        return a1 && a2 && a3 && a4 && a5;
	        // Update with actual logic
	    }
    
	        // Implement your actual test logic and return accordingly
	       

  // Test Case 2 start 
	    // I changed the values number, to avoid duplication with Test case 1
public static boolean testCase2() {
        System.out.println("\nTest Case 2 - add/subt");
        Fraction f6 = new Fraction(0, 1);
        Fraction f7 = new Fraction(1, 3);
        Fraction f8 = new Fraction(-2, 4);
        Fraction f9 = new Fraction(3, -8);
        Fraction f10 = new Fraction(-4, -11);
        
        System.out.print("Add two positive testing: ");
        boolean a6 = f7.add(f7).toString().equals("6/9");
        if (a6) System.out.println("PASSED");
        else System.out.println("FAILED " + f7.add(f7));
        
        System.out.print("add one positive one negative testing ");
        boolean a7=f7.add(f8).toString().equals("-2/12");
        if (a7) System.out.println("PASSED");
        else System.out.println("FAILED "+f7.add(f8));
        
        System.out.print("add two negative testing ");
        boolean a8=f8.add(f9).toString().equals("-28/32");
        if (a8) System.out.println("PASSED");
        else System.out.println("FAILED "+f8.add(f9));
        
        System.out.print("add to equal zero testing ");
        boolean a9=f7.add(new Fraction(-1,3)).toString().equals("0/9");
        if (a9) System.out.println("PASSED");
        else System.out.println("FAILED "+f7.add(new Fraction(-1,3)));
        
        System.out.print("subt to equal zero testing ");
        boolean a10=f7.subt(f7).toString().equals("0/9");
        if (a10) System.out.println("PASSED");
        else System.out.println("FAILED "+f7.subt(f7));

 
      
        return a7 && a8 && a9 && a10;
}


    
    public static boolean testCase3() {
        System.out.println("\nTest Case 3 - mult/div");
        Fraction f11 = new Fraction(0, 1);
        Fraction f12 = new Fraction(1, 3);
        Fraction f13 = new Fraction(-2, 4);
        Fraction f14 = new Fraction(3, -8);
        Fraction f15 = new Fraction(-4, -11);
        
        System.out.print("mult both positive testing ");
        boolean a11=f12.mult(f12).toString().equals("1/9");
        if (a11) System.out.println("PASSED");
        else System.out.println("FAILED "+f12.mult(f12));
        
        System.out.print("mult one positive one negative testing ");
        boolean a12=f12.mult(f13).toString().equals("-2/12");
        if (a12) System.out.println("PASSED");
        else System.out.println("FAILED "+f12.mult(f13));
        
        System.out.print("mult both negative testing ");
        boolean a13=f13.mult(f14).toString().equals("6/32");
        if (a13) System.out.println("PASSED");
        else System.out.println("FAILED "+f13.mult(f14));
        
        System.out.print("mult one positive one negative testing ");
        boolean a14=f12.mult(new Fraction(-1,3)).toString().equals("-1/9");
        if (a14) System.out.println("PASSED");
        else System.out.println("FAILED "+f12.mult(new Fraction(-1,3)));
        
        System.out.print("div both positive testing ");
        boolean a15=f12.div(f12).toString().equals("3/3");
        if (a15) System.out.println("PASSED");
        else System.out.println("FAILED "+f12.div(f12));
        
        System.out.print("div one positive one negative testing ");
        boolean a16=f12.div(f13).toString().equals("-4/6");
        if (a16) System.out.println("PASSED");
        else System.out.println("FAILED "+f12.div(f13));

        System.out.print("div both negative testing ");
        boolean a17=f13.div(f14).toString().equals("16/12");
        if (a17) System.out.println("PASSED");
        else System.out.println("FAILED "+f13.div(f14));
        System.out.print("div one positive one negative testing ");
        
        boolean a18=f12.div(new Fraction(-1,3)).toString().equals("-3/3");
        if (a18) System.out.println("PASSED");
        else System.out.println("FAILED "+f12.div(new Fraction(-1,3)));
        
        return a11 && a12 && a13 && a14 && a15 && a16 && a17 && a18;

    }
}





