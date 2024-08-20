/* Lab Exercises No.4
 
Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

public class StudentTest {
	public static void main(String[] args) {
		System.out.print("Test Case 1 ");
		Student s1=new Student();
		boolean a1=s1.toString().equals("Gender:N Room:***");
		Student s2=new Student('M', "A21");
		boolean a2=s2.toString().equals("Gender:M Room:A21");
		Student s3=new Student('F', "Z92");
		boolean a3=s3.toString().equals("Gender:F Room:Z92");
		Student s4=new Student('N', "K53");
		boolean a4=s4.toString().equals("Gender:N Room:K53");
		Student s5=new Student('A', "A36");
		boolean a5=s5.toString().equals("Gender:N Room:A36");
		if (a1 && a2 && a3 && a4 && a5) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}					
		
		
		System.out.print("Test Case 2 ");
		String temp=null;
		Student s6=new Student('M', temp);
		boolean a6=s6.toString().equals("Gender:M Room:***");
		s6.setRoom("A21");
		boolean a7=s6.toString().equals("Gender:M Room:A21");
		s6.setRoom("A20");	
		boolean a8=s6.toString().equals("Gender:M Room:***");
		s6.setRoom("A21");
		boolean a9=s6.toString().equals("Gender:M Room:A21");	
		s6.setRoom("A27");
		boolean a10=s6.toString().equals("Gender:M Room:***");		
		s6.setRoom("A51");
		boolean a11=s6.toString().equals("Gender:M Room:A51");
		s6.setRoom("A50");	
		boolean a12=s6.toString().equals("Gender:M Room:***");
		s6.setRoom("A51");
		boolean a13=s6.toString().equals("Gender:M Room:A51");	
		s6.setRoom("A54");
		boolean a14=s6.toString().equals("Gender:M Room:***");	
		if (a6 && a7 && a8 && a9 && a10 && a11 && a12 && a13 && a14) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}


		System.out.print("Test Case 3 ");
		s6.setRoom("A81");
		boolean a15=s6.toString().equals("Gender:M Room:A81");
		s6.setRoom("A80");	
		boolean a16=s6.toString().equals("Gender:M Room:***");
		s6.setRoom("A81");
		boolean a17=s6.toString().equals("Gender:M Room:A81");	
		s6.setRoom("A83");
		boolean a18=s6.toString().equals("Gender:M Room:***");
		if (a15 && a16 && a17 && a18) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
	}
}