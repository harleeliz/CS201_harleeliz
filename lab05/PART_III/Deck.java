
/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] cards;
    private int cardcount;

    public Deck() {
        cards = new Card[Card.SUITS.length * Card.KINDS.length];
        cardcount = cards.length;

        // Initialize the deck with cards
        int index = 0;
        for (int i = 0; i < Card.SUITS.length; i++) {
            for (int j = 0; j < Card.KINDS.length; j++) {
                cards[index] = new Card(Card.SUITS[i], Card.KINDS[j]);
                index++;
            }
        }
    }

    public int intgetCount() {
        return cardcount;
    }

    public void shuffle() {
        Random rand = new Random();

        for (int i = cardcount - 1; i > 0; i--) {
            int r = rand.nextInt(i + 1);
            Card temp = cards[r];
            cards[r] = cards[i];
            cards[i] = temp;
        }
    }

    public Card deal() {
        if (cardcount > 0) {
        	cardcount--;
            return cards[cardcount];
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Deck with " + cardcount + " cards";
    }
}
