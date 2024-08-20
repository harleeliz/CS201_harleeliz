/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
import java.util.Scanner;

public class CharacterRemove {
    public static void main(String[] args) {


        System.out.print("2d - Write a method or program requiring iteration (CharacterRemove)");
        System.out.println();


        // Create a Scanner object to read user input from the console
        Scanner user_input_text = new Scanner(System.in);

        // Prompt the user to enter a line of text and store it in a variable
        System.out.print("Enter a line of text: ");
        String user_text = user_input_text.nextLine();

        // Prompt the user to enter a character to remove and store it in a variable
        System.out.print("Enter a character to remove: ");
        char characterToRemove = user_input_text.next().charAt(0);

        // Call the removeCharacter function to remove the specified character
        String result = removeCharacter(user_text, characterToRemove);

        // Print the modified text without the specified character
        System.out.println(result);

        // Close the Scanner object to release resources
        user_input_text.close();
    }

    // This function takes a text and a character to remove as input
    // It creates a new StringBuilder to build the result
    // It iterates through the input text and appends characters that are not equal to the character to remove
    // Finally, it returns the modified text as a String
    public static String removeCharacter(String text, char characterToRemove) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Check if the current character is not equal to the character to remove
            if (currentChar != characterToRemove) {
                // Append the current character to the result
                result.append(currentChar);
            }
        }

        // Convert the StringBuilder to a String and return it
        return result.toString();
    }
}
