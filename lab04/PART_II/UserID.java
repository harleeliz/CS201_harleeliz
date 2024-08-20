/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */


class UserID {

    public static String getUserID(String firstName, String lastName) {
        String userID = "";

        if (lastName.length() >= 7) {
            userID = firstName.substring(0, 1) + lastName.substring(0, 7);
        } else if (lastName.length() < 7 && (firstName.length() + lastName.length() >= 8)) {
            userID = firstName.substring(0, 8 - lastName.length()) + lastName;
        } else {
            userID = firstName.substring(0, firstName.length()) + lastName.substring(0, lastName.length()) + "xxxxxxxx";
            userID = userID.substring(0, 8);
        }

        return userID.toLowerCase(); // write down the userid by small letter. 
    }
}
