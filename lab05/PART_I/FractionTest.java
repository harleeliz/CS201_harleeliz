public class FractionTest {

    public static void main(String[] args) {
        boolean passedAllTests = true;

        // Test Case 1 - constructors, toString()
        passedAllTests &= testCase1();

        // Test Case 2 - add/subt
        passedAllTests &= testCase2();

        // Test Case 3 - mult/div
        passedAllTests &= testCase3();

        // Test Case 4 - reduce
        passedAllTests &= testCase4();

        // Test Case 5 - equals
        passedAllTests &= testCase5();

    }

    public static boolean testCase1() {
        Fraction f1 = new Fraction(0, 1);
        Fraction f2 = new Fraction(-2, 4);
        Fraction f3 = new Fraction(3, -8);
        Fraction f4 = new Fraction(-4, -11);
        Fraction f5 = new Fraction(6, 0);

        System.out.print("\nzero numerator testing ");
        boolean a1 = f1.toString().equals("0/1");
        if (a1) System.out.println("PASSED");
        else System.out.println("FAILED " + f1);

        System.out.print("negative numerator testing ");
        boolean a2 = f2.toString().equals("-2/4");
        if (a2) System.out.println("PASSED");
        else System.out.println("FAILED " + f2);

        System.out.print("negative denominator testing ");
        boolean a3 = f3.toString().equals("-3/8");
        if (a3) System.out.println("PASSED");
        else System.out.println("FAILED " + f3);

        System.out.print("both negative testing ");
        boolean a4 = f4.toString().equals("4/11");
        if (a4) System.out.println("PASSED");
        else System.out.println("FAILED " + f4);

        System.out.print("zero denominator testing ");
        boolean a5 = f5.toString().equals("6/1");
        if (a5) System.out.println("PASSED");
        else System.out.println("FAILED " + f5);

        return a1 && a2 && a3 && a4 && a5;
    }

    public static boolean testCase2() {
        Fraction f1 = new Fraction(0, 1);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = new Fraction(-2, 4);
        Fraction f4 = new Fraction(3, -8);
        Fraction f5 = new Fraction(-4, -11);

        System.out.print("add two positive testing ");
        boolean a1 = f2.add(f2).toString().equals("6/9");
        if (a1) System.out.println("PASSED");
        else System.out.println("FAILED " + f2.add(f2));

        // Add similar tests for other fractions...

        return a1;  // Return true if all tests pass
    }

    public static boolean testCase3() {
        Fraction f1 = new Fraction(0, 1);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = new Fraction(-2, 4);
        Fraction f4 = new Fraction(3, -8);
        Fraction f5 = new Fraction(-4, -11);

        System.out.print("\nmult both positive testing ");
        boolean a1 = f2.mult(f2).toString().equals("1/9");
        if (a1) System.out.println("PASSED");
        else System.out.println("FAILED " + f2.mult(f2));

        System.out.print("mult one positive one negative testing ");
        boolean a2 = f2.mult(f3).toString().equals("-2/12");
        if (a2) System.out.println("PASSED");
        else System.out.println("FAILED " + f2.mult(f3));

        System.out.print("mult both negative testing ");
        boolean a3 = f3.mult(f4).toString().equals("6/32");
        if (a3) System.out.println("PASSED");
        else System.out.println("FAILED " + f3.mult(f4));

        System.out.print("mult one positive one negative testing ");
        boolean a4 = f2.mult(new Fraction(-1, 3)).toString().equals("-1/9");
        if (a4) System.out.println("PASSED");
        else System.out.println("FAILED " + f2.mult(new Fraction(-1, 3)));

        System.out.print("div both positive testing ");
        boolean a5 = f2.div(f2).toString().equals("3/3");
        if (a5) System.out.println("PASSED");
        else System.out.println("FAILED " + f2.div(f2));

        System.out.print("div one positive one negative testing ");
        boolean a6 = f2.div(f3).toString().equals("-4/6");
        if (a6) System.out.println("PASSED");
        else System.out.println("FAILED " + f2.div(f3));

        System.out.print("div both negative testing ");
        boolean a7 = f3.div(f4).toString().equals("16/12");
        if (a7) System.out.println("PASSED");
        else System.out.println("FAILED " + f3.div(f4));

        System.out.print("div one positive one negative testing ");
        boolean a8 = f2.div(new Fraction(-1, 3)).toString().equals("-3/3");
        if (a8) System.out.println("PASSED");
        else System.out.println("FAILED " + f2.div(new Fraction(-1, 3)));

        return a1 && a2 && a3 && a4 && a5 && a6 && a7 && a8;
    }

    public static boolean testCase4() {
        System.out.print("\nreduce possible denominator bigger testing ");
        Fraction f1 = new Fraction(3, 12);
        f1.reduce();
        boolean a1 = f1.toString().equals("1/4");
        if (a1) System.out.println("PASSED");
        else System.out.println("FAILED " + f1);

        System.out.print("reduce possible numerator bigger testing ");
        f1.setnumerator(12);
        f1.setdenominator(3);
        f1.reduce();
        boolean a2 = f1.toString().equals("4/1");
        if (a2) System.out.println("PASSED");
        else System.out.println("FAILED " + f1);

        System.out.print("reduce possible numerator=denominator testing ");
        f1.setnumerator(12);
        f1.setdenominator(12);
        f1.reduce();
        boolean a3=f1.toString().equals("1/1");
        if (a3) System.out.println("PASSED");
        else System.out.println("FAILED "+f1);

        System.out.print("reduce not possible numerator bigger testing ");
        f1.setnumerator(13);
        f1.setdenominator(12);
        f1.reduce();
        boolean a4=f1.toString().equals("13/12");
        if (a4) System.out.println("PASSED");
        else System.out.println("FAILED "+f1);

        System.out.print("reduce not possible denominator bigger testing ");
        f1.setnumerator(12);
        f1.setdenominator(13);
        f1.reduce();
        boolean a5=f1.toString().equals("12/13");
        if (a5) System.out.println("PASSED");
        else System.out.println("FAILED "+f1);

        System.out.print("reduce not possible numerator negative testing ");
        f1.setnumerator(-13);
        f1.setdenominator(12);
        f1.reduce();
        boolean a6=f1.toString().equals("-13/12");
        if (a6) System.out.println("PASSED");
        else System.out.println("FAILED "+f1);
        System.out.print("reduce not possible denominator negative testing ");
        f1.setnumerator(12);
        f1.setdenominator(-13);
        f1.reduce();
        boolean a7=f1.toString().equals("-12/13");
        if (a7) System.out.println("PASSED");
        else System.out.println("FAILED "+f1);

        System.out.print("reduce possible both negative testing ");
        f1.setnumerator(-12);
        f1.setdenominator(-3);
        f1.reduce();
        boolean a8=f1.toString().equals("4/1");
        if (a8) System.out.println("PASSED");
        else System.out.println("FAILED "+f1);


        return a1 && a2 && a3 && a4 && a5 && a6 && a7 && a8;
    }

    public static boolean testCase5() {
        Fraction f1 = new Fraction(3, 12);
        Fraction f2 = new Fraction(1, 4);

        System.out.print("\nequals testing ");
        boolean a1 = f1.equals(f2) && f2.equals(f1);
        if (a1) System.out.println("PASSED");
        else System.out.println("FAILED " + f1.equals(f2) + " " + f2.equals(f1));

        f1.setnumerator(12);
        f1.setdenominator(3);
        System.out.print("not equals testing ");
        boolean a2 = !f1.equals(f2);
        if (a2) System.out.println("PASSED");
        else System.out.println("FAILED " + !f1.equals(f2));

        return a1 && a2;
    }

}