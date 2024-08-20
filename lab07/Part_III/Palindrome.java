package Part_III;/* Lab Exercises No.7
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/


public class Palindrome {

  private static String data;

  // Default constructor
  public Palindrome() {
  }

  // Getter method to retrieve the data
  public static String getData() {
    return data;
  }

  // Setter method to set the data
  public static void setData(String data) {
    Palindrome.data = data;
  }

  // Method to check if a given string is a palindrome
  public static boolean isPalindrome(String data) {
    Palindrome.data = data;

    // Base case: an empty string or a string with one character is always a palindrome
    if (data.length() <= 1) {
      return true;
    } else {
      // Check if the first and last characters are the same
      char firstChar = data.charAt(0);
      char lastChar = data.charAt(data.length() - 1);

      // If they are the same, check if the substring excluding the first and last characters is a palindrome
      if (firstChar == lastChar) {
        String middle = data.substring(1, data.length() - 1);
        return isPalindrome(middle);
      } else {
        // If the first and last characters are not the same, it's not a palindrome
        return false;
      }
    }
  }

  // Method to provide a String representation of the Part_III.Palindrome class
  @Override
  public String toString() {
    return "Part_III.Palindrome{}";
  }
}
