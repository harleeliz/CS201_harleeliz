/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class HiLoGame {
    private Deck1 deck;
    private Card1[] playerAHand;
    private Card1[] playerBHand;
    private int playerAWins;
    private int playerBWins;

    public HiLoGame() {
        deck = new Deck1();
        deck.shuffle();

        playerAHand = new Card1[6];
        playerBHand = new Card1[6];
        playerAWins = 0;
        playerBWins = 0;

        // Deal 6 cards to each player
        for (int i = 0; i < 6; i++) {
            playerAHand[i] = deck.deal();
            playerBHand[i] = deck.deal();
        }
    }

    public void play() {
        for (int i = 0; i < 6; i++) {
            System.out.println("PlayerA card is " + playerAHand[i]);
            char guess = getUserGuess();
            System.out.println("PlayerB card is " + playerBHand[i]);

            int result = playerAHand[i].compareTo(playerBHand[i]);

            if (result < 0 && guess == 'L') {
                System.out.println("PlayerB wins");
                playerBWins++;
            } else if (result > 0 && guess == 'H') {
                System.out.println("PlayerB wins");
                playerBWins++;
            } else if (result == 0) {
                System.out.println("It's a draw");
            } else {
                System.out.println("PlayerA wins");
                playerAWins++;
            }
        }

        System.out.println("PlayerA wins=" + playerAWins + " PlayerB wins=" + playerBWins);
    }

    private char getUserGuess() {
        // Simulate user input for simplicity
        return Math.random() < 0.5 ? 'H' : 'L';
    }

    public static void main(String[] args) {
        HiLoGame game = new HiLoGame();
        game.play();
    }
}

