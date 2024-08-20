/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class ThreeDigitNumberTest {
	public static void main(String[] args) {
		System.out.println("Test Case 1 - middle digit even");
		ThreeDigitNumber p1=new ThreeDigitNumber(123);	
		System.out.println("EXPECTED RESULT:mixed");
		System.out.println("YOUR RESULT    :"+p1.evenOddMixed());
		System.out.println("PASSED="+(p1.evenOddMixed().equals("mixed"))+"\n");

		System.out.println("Test Case 2 - all three digits even");
		ThreeDigitNumber p2=new ThreeDigitNumber(240);	
		System.out.println("EXPECTED RESULT:all even");
		System.out.println("YOUR RESULT    :"+p2.evenOddMixed());
		System.out.println("PASSED="+(p2.evenOddMixed().equals("all even"))+"\n");
		
		System.out.println("Test Case 3 - all three digits odd");
		ThreeDigitNumber p3=new ThreeDigitNumber(135);	
		System.out.println("EXPECTED RESULT:all odd");
		System.out.println("YOUR RESULT    :"+p3.evenOddMixed());
		System.out.println("PASSED="+(p3.evenOddMixed().equals("all odd"))+"\n");		

		System.out.println("Test Case 4 - first digit even");
		ThreeDigitNumber p4=new ThreeDigitNumber(213);	
		System.out.println("EXPECTED RESULT:mixed");
		System.out.println("YOUR RESULT    :"+p4.evenOddMixed());
		System.out.println("PASSED="+(p4.evenOddMixed().equals("mixed"))+"\n");

		System.out.println("Test Case 5 - last digit even");
		ThreeDigitNumber p5=new ThreeDigitNumber(312);	
		System.out.println("EXPECTED RESULT:mixed");
		System.out.println("YOUR RESULT    :"+p5.evenOddMixed());
		System.out.println("PASSED="+(p5.evenOddMixed().equals("mixed"))+"\n");

		System.out.println("Test Case 6 - middle and last digits even");
		ThreeDigitNumber p6=new ThreeDigitNumber(124);	
		System.out.println("EXPECTED RESULT:mixed");
		System.out.println("YOUR RESULT    :"+p6.evenOddMixed());
		System.out.println("PASSED="+(p6.evenOddMixed().equals("mixed"))+"\n");			

		System.out.println("Test Case 7 - first and last digits even");
		ThreeDigitNumber p7=new ThreeDigitNumber(214);	
		System.out.println("EXPECTED RESULT:mixed");
		System.out.println("YOUR RESULT    :"+p7.evenOddMixed());
		System.out.println("PASSED="+(p7.evenOddMixed().equals("mixed"))+"\n");			
	
		System.out.println("Test Case 8 - first and middle digits even");
		ThreeDigitNumber p8=new ThreeDigitNumber(241);	
		System.out.println("EXPECTED RESULT:mixed");
		System.out.println("YOUR RESULT    :"+p8.evenOddMixed());
		System.out.println("PASSED="+(p8.evenOddMixed().equals("mixed"))+"\n");	

	}
}