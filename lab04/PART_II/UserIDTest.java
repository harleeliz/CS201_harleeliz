/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class UserIDTest {

    public static String getUserID(String firstName, String lastName) {
        return UserID.getUserID(firstName, lastName);
    }

    public static void main(String[] args) {
        // Test Case 1
        System.out.println("Test Case 1: " + (UserID.getUserID("Jonas", "Smither").equals("jsmither")));

        // Test Case 2
        System.out.println("Test Case 2: " + (UserID.getUserID("George", "Washingtonr").equals("gwashing")));

        // Test Case 3
        System.out.println("Test Case 3: " + (UserID.getUserID("Pam", "Smith").equals("pamsmith")));

        // Test Case 4
        System.out.println("Test Case 4: " + (UserID.getUserID("Alvira", "Gore").equals("alvigore")));

        // Test Case 5
        System.out.println("Test Case 5: " + (UserID.getUserID("Meg", "Paul").equals("megpaulx")));
        
        // Test Case 6
        System.out.println("Test Case 6: " + (UserID.getUserID("Pa", "Ho").equals("pahoxxxx")));
    }
}
