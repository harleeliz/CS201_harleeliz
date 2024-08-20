package Part_III;/* Lab Exercises No.7
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/


public class RecursionTest {
	public static void main(String[] args) {
		System.out.println("A - Recursion Test for Part_III.Palindrome.java; Part_III.SquareRoot.java; and GDC.java");
		System.out.println();
		// Part_III.Palindrome test
		// Test Case 1 - short non-palindrome
		System.out.print("short non-palindrome testing ");
		boolean a1=Palindrome.isPalindrome("cat");
		if (!a1) System.out.println("PASSED");
		else System.out.println("FAILED "+ "cat");

		// Test Case 2 - short palindrome
		System.out.print("short palindrome testing ");
		boolean a2=Palindrome.isPalindrome("racecar");
		if (a2) System.out.println("PASSED");
		else System.out.println("FAILED "+ "racecar");

		// Test Case 3 - short non-palindrome (different case issue)
		System.out.print("short non-palindrome (different case issue) testing ");
		boolean a3=Palindrome.isPalindrome("Racecar");
		if (!a3) System.out.println("PASSED");
		else System.out.println("FAILED "+ "Racecar");

		// Test Case 4 - long palindrome
		System.out.print("long palindrome testing ");
		boolean a4=Palindrome.isPalindrome("able was I ere I saw elba");
		if (a4) System.out.println("PASSED");
		else System.out.println("FAILED "+ "able was I ere I saw elba");

		// Test Case 5 - even # of chars palindrome
		System.out.print("even # of chars palindrome testing ");
		boolean a5=Palindrome.isPalindrome("abccba");
		if (a5) System.out.println("PASSED");
		else System.out.println("FAILED "+ "abccba");

		// Test Case 6 - odd # of chars palindrome
		System.out.print("odd # of chars palindrome testing ");
		boolean a6=Palindrome.isPalindrome("abcba");
		if (a6) System.out.println("PASSED");
		else System.out.println("FAILED "+ "abcba");
		System.out.println();

		// Part_III.SquareRoot test
		// Test Case 1 - squareRoot(9,.0001)
		System.out.print("squareRoot(9,.0001) testing ");
		boolean b1=SquareRoot.squareRoot(9,.0001)==3.000015360039322;
		if (b1) System.out.println("PASSED");
		else System.out.println("FAILED "+ SquareRoot.squareRoot(9,.0001));

		// Test Case 2 - squareRoot(9,.00000001)
		System.out.print("squareRoot(9,.00000001) testing ");
		boolean b2=SquareRoot.squareRoot(9,.00000001)==3.0000000000393214;
		if (b2) System.out.println("PASSED");
		else System.out.println("FAILED "+ SquareRoot.squareRoot(9,.00000001));

		// Test Case 3 - squareRoot(1,.0001)
		System.out.print("squareRoot(1,.0001) testing ");
		boolean b3=SquareRoot.squareRoot(1,.0001)==1.0000000464611474;
		if (b3) System.out.println("PASSED");
		else System.out.println("FAILED "+ SquareRoot.squareRoot(1,.0001));

		// Test Case 4 - squareRoot(1,.00000001)
		System.out.print("squareRoot(1,.00000001) testing ");
		boolean b4=SquareRoot.squareRoot(1,.00000001)==1.000000000000001;
		if (b4) System.out.println("PASSED");
		else System.out.println("FAILED "+ SquareRoot.squareRoot(1,.00000001));

		// Test Case 5 - squareRoot(117,.0001)
		System.out.print("squareRoot(117,.0001) testing ");
		boolean b5=SquareRoot.squareRoot(117,.0001)==10.81665382725691;
		if (b5) System.out.println("PASSED");
		else System.out.println("FAILED "+ SquareRoot.squareRoot(117,.0001));

		// Test Case 6 - squareRoot(117,.00000001)
		System.out.print("squareRoot(117,.00000001) testing ");
		boolean b6=SquareRoot.squareRoot(117,.00000001)==10.816653826391967;
		if (b6) System.out.println("PASSED");
		else System.out.println("FAILED "+ SquareRoot.squareRoot(117,.00000001));

		// Test Case 7 - squareRoot(10000,.00000001)
		System.out.print("squareRoot(10000,.00000001) testing ");
		boolean b7=SquareRoot.squareRoot(10000,.00000001)==100;
		if (b7) System.out.println("PASSED");
		else System.out.println("FAILED "+ SquareRoot.squareRoot(10000,.00000001));
		System.out.println();
		// Part_III.GCD test
		// Test Case 1 - gcd(12, 9)==3
		System.out.print("gcd(12, 9)==3 testing ");
		boolean c1=GCD.gcd(12, 9)==3;
		if (c1) System.out.println("PASSED");
		else System.out.println("FAILED "+ GCD.gcd(12, 9));

		// Test Case 2 - gcd(9, 12)==3
		System.out.print("gcd(9, 12)==3 testing ");
		boolean c2=GCD.gcd(9, 12)==3;
		if (c2) System.out.println("PASSED");
		else System.out.println("FAILED "+ GCD.gcd(9, 12));

		// Test Case 3 - gcd(1, 25)==1
		System.out.print("gcd(1, 25)==1 testing ");
		boolean c3=GCD.gcd(1, 25)==1;
		if (c3) System.out.println("PASSED");
		else System.out.println("FAILED "+ GCD.gcd(1, 25));

		// Test Case 4 - gcd(25, 1)==1
		System.out.print("gcd(25, 1)==1 testing ");
		boolean c4=GCD.gcd(25, 1)==1;
		if (c4) System.out.println("PASSED");
		else System.out.println("FAILED "+ GCD.gcd(25, 1));

		// Test Case 5 - gcd(115, 115)==115
		System.out.print("gcd(115, 115)==115 testing ");
		boolean c5=GCD.gcd(115, 115)==115;
		if (c5) System.out.println("PASSED");
		else System.out.println("FAILED "+ GCD.gcd(115, 115));

		// Test Case 6 - gcd(54, 24)==6
		System.out.print("gcd(54, 24)==6 testing ");
		boolean c6=GCD.gcd(54, 24)==6;
		if (c6) System.out.println("PASSED");
		else System.out.println("FAILED "+ GCD.gcd(54, 24));

		// Test Case 7 - gcd(2415,3289)==23
		System.out.print("gcd(2415,3289)==23 testing ");
		boolean c7=GCD.gcd(2415,3289)==23;
		if (c7) System.out.println("PASSED");
		else System.out.println("FAILED "+ GCD.gcd(2415,3289));

	}	
}