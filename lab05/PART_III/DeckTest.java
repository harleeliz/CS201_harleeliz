
/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class DeckTest {
    public static void main(String[] args) {
        // Create a deck and print the initial state
        Deck deck = new Deck();
        System.out.println("the total cards: " + deck);

        // Shuffle the deck and print the shuffled state
        deck.shuffle();
        System.out.println("the shuffled cards: " + deck);

        // Deal some cards and print the updated state
        int cards1 = 15;
        for (int i = 0; i < cards1; i++) {
            Card extractcard = deck.deal();
            if (extractcard != null) {
                System.out.println("Dealt card: " + extractcard);
            } else {
                System.out.println("the end.");
            }
        }
        System.out.println("the left cards: " + deck);
    }
}
