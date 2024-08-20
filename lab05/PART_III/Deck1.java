/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
import java.util.Random;
public class Deck1 {
 private static Random rand = new Random(123456789); 
 private Card1 [] cards;
 private int count;
 
 public Deck1( ) {
  cards=new Card1[Card1.SUITS.length*Card1.KINDS.length];
  count=0;
  for (int i=0; i<Card1.SUITS.length; i++) {
   for (int j=0; j<Card1.KINDS.length; j++) {
    cards[count]=new Card1(Card1.SUITS[i], Card1.KINDS[j]);
    count++;
   }
  }
 }
 
 public int getCount() { return count; }
 
 public void shuffle( ) {
        for (int i = 0; i < count; i++){ 
            int r = i + rand.nextInt(count - i); 
             Card1 temp = cards[r];
             cards[r] = cards[i]; 
             cards[i] = temp; 
        } 
    }
 
 public Card1 deal() {
  if (count>0) {
   Card1 temp=cards[count-1];
   cards[count-1]=null;
   count--;
   return temp;
  }
  else 
   return null;
 }
 
 public String toString() {
  return "deck with "+count+ " cards";
 }
}
