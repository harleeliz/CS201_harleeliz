/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class TestDeck {
	public static void main(String[] args) {
		System.out.println("This is 1st card drawn\n");
		Deck d = new Deck();
		System.out.println(d);
		Card c = d.deal();
		c.flip();
		System.out.println(c);
		System.out.println(d);
		d.shuffle();
		c = d.deal();
		c.flip();
		System.out.println(c);
		System.out.println(d);	
		
		System.out.println("\nThis is 2nd card drawn\n");
        // Create a new deck for the 2nd card draw
        Deck e = new Deck();
        e.shuffle();
        System.out.println(e);
        Card f = e.deal();
        f.flip();
        System.out.println(f);
        System.out.println(e);
        e.shuffle();
        f = e.deal();
        f.flip();
        System.out.println(f);
        System.out.println(e);
	}
}
