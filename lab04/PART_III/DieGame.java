/* Lab Exercises No.4
 
Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

import java.util.Arrays;

public class DieGame {
    public static void main(String[] args) {
        Die dieA1 = new Die();
        Die dieA2 = new Die();
        Die dieB1 = new Die();
        Die dieB2 = new Die();

        // dice for A and B
        dieA1.roll();
        dieA2.roll();
        dieB1.roll();
        dieB2.roll();

        // show the die values in a decreasing order 
        int[] Adice = {Math.max(dieA1.getSide(), dieA2.getSide()), Math.min(dieA1.getSide(), dieA2.getSide())};
        int[] Bdice = {Math.max(dieB1.getSide(), dieB2.getSide()), Math.min(dieB1.getSide(), dieB2.getSide())};

        // Arrange the values in a decreasing order
        Arrays.sort(Adice);
        Arrays.sort(Bdice);

        // game results for A and B 
        System.out.println(Adice[0] + " " + Adice[1]);
        System.out.println(Bdice[0] + " " + Bdice[1]);

        // calculate the scores
        int Ascore = 0, Bscore = 0;
        for (int i = 0; i < 2; i++) {
            if (Adice[i] > Bdice[i])
                Ascore++;
            else if (Adice[i] < Bdice[i])
                Bscore++;
        }

        // last print. 
        System.out.println(Ascore + " " + Bscore);
        System.out.println("\nPlayer A points are " + Ascore+ " points");
        System.out.println("Player B points are " + Bscore + " points");
    }
}
