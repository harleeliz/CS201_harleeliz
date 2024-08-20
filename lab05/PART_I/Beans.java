/* Lab Exercises No.5

Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

import java.util.Scanner;


public class Beans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBeans = 13;
        int playerBeans = 0;
        int computerBeans = 0;

        System.out.println("now, the game is started");
        System.out.println("total beans are " + totalBeans);

        while (totalBeans > 0) {
            // how many beans the player take?
            System.out.print("player choose beans to take (1, 2, 3) ");
            int playerMove = scanner.nextInt();
            if (playerMove < 1 || playerMove > 3 || playerMove > totalBeans) {
                System.out.println("you entered wrong value.");
                continue;
            }
            totalBeans -= playerMove;
            playerBeans += playerMove;

            if (totalBeans == 0) {
                break;
            }

            // how many beans the computer take?
            int computerMove = computerMove(totalBeans, computerBeans);
            System.out.println("computer brings: " + computerMove );
            totalBeans -= computerMove;
            computerBeans += computerMove;
        }

        System.out.println("player's final beans are " + playerBeans );
        System.out.println("computer's final beans are " + computerBeans);

        // Determine the winner
        String winner = (playerBeans % 2 != 0) ? "Player" : "Computer";
        System.out.println("the winner is " + winner);
    }

    public static int computerMove(int pileBeans, int computerBeans) {
        // Implement the computer's move strategy here
        // computer randomly brings the beans 
        return (int) (Math.random() * 3) + 1;
    }
}


