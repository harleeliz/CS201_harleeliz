/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */
public class PlayerClient {
    public static void main(String[] args) {

        //These lines just print text about problem 3D - Using a User Defined Class - Player Power Rating
        System.out.println("3D - Using a User Defined Class - Player Power Rating");
        System.out.println("PlayerClient-Problem Solutions:");
        System.out.println("All output is one to a line");
        System.out.println();

        //Creation of object JhonPlayer with time=437 seconds, ghosts=45, fruit=11
        Player JhonPlayer = new Player("John", 11, 45, 437);

        //This line print the output of the powerRating() method
        System.out.println(JhonPlayer.powerRating());

        //Creation of object MaryPlayer with second argument data="15,32,128"
        Player maryPlayer = new Player("Mary", "15,32,128");

        //This line print the output of the object maryPlayer
        System.out.println(maryPlayer);
    }
}
