/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.util.Scanner;
public class FingerSticks {
	public static void main(String[] args) {
		int [] human={1,1}, computer={1,1};
		Scanner input = new Scanner(System.in);

		if (Math.random()>.5) {	
			System.out.println("Computer went first");
			System.out.println(computerMove(human, computer));
			System.out.println("humanLeft="+human[0]+" humanRight="+human[1]+" computerLeft="+computer[0]+" computerRight="+computer[1]);			
		}
		
		while ( !gameOver(human, computer)  ) {
			System.out.print("Human turn, which hand of your's (R or L)? ");
			String humanHand = input.next();
			System.out.print("Human turn, which hand of computer's (R or L)? ");
			String computerHand = input.next();
			
			if (humanHand.equals("L")) {
				if (computerHand.equals("L")) {
					computer[0]+=human[0];
					if (computer[0]==5) {
						computer[0]=-1;
					}
					else {
						computer[0]=computer[0]%5;
					}
				}
				else {
					computer[1]+=human[0];
					if (computer[1]==5) {
						computer[1]=-1;
					}
					else {
						computer[1]=computer[1]%5;
					}					
				}
			}
			else {
				if (computerHand.equals("L")) {
					computer[0]+=human[1];
					if (computer[0]==5) {
						computer[0]=-1;
					}
					else {
						computer[0]=computer[0]%5;
					}
				}
				else {
					computer[1]+=human[1];
					if (computer[1]==5) {
						computer[1]=-1;
					}
					else {
						computer[1]=computer[1]%5;
					}					
				}
			}
			System.out.println("humanLeft="+human[0]+" humanRight="+human[1]+" computerLeft="+computer[0]+" computerRight="+computer[1]);			
			if (!gameOver(human, computer) ) {
				System.out.println(computerMove(human, computer));
				System.out.println("humanLeft="+human[0]+" humanRight="+human[1]+" computerLeft="+computer[0]+" computerRight="+computer[1]);			
			}
		}
	}
	
	public static boolean gameOver(int [] h, int [] c) {
		if ( (h[0]==-1 && h[1]==-1) || (c[0]==-1 && c[1]==-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String computerMove(int [] h, int [] c) {
		if (h[0] == -1 && h[1] == -1) {
			return "NO MOVE"; // Game over, no move possible
		}

		// Determine the computer move based on the current hand counts
		if (c[0] >= c[1]) {
			// Computer's left hand has more fingers or equal to the right hand
			if (h[0] != -1) {
				// Human's left hand is not out
				c[0] += h[0];
				h[0] = -1; // Human's left hand is out
				return "Computer Left to Human Left";
			} else if (h[1] != -1) {
				// Human's right hand is not out
				c[0] += h[1];
				h[1] = -1; // Human's right hand is out
				return "Computer Left to Human Right";
			}
		} else {
			// Computer's right hand has more fingers
			if (h[0] != -1) {
				// Human's left hand is not out
				c[1] += h[0];
				h[0] = -1; // Human's left hand is out
				return "Computer Right to Human Left";
			} else if (h[1] != -1) {
				// Human's right hand is not out
				c[1] += h[1];
				h[1] = -1; // Human's right hand is out
				return "Computer Right to Human Right";
			}
		}

		return "NO MOVE"; // Default case if no move is possible

	}

	}
