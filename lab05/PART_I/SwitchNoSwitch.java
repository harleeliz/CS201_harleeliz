/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.util.*;

public class SwitchNoSwitch {
	public static Random myRandomGenerator = new Random(123456789);

	public static void main(String[] args) {
		// Test Case 1 - 100 trials
		System.out.println("Test Case 1 - 100 trials");
		int testCase1Trials = 100;
		runMontyHallSimulation(testCase1Trials);

		// Test Case 2 - 10,000,000 trials
		System.out.println("\nTest Case 2 - 10,000,000 trials");
		int testCase2Trials = 10000000;
		runMontyHallSimulation(testCase2Trials);
	}
	public static void runMontyHallSimulation(int trials) {
		int switchWins = 0;
		int noSwitchWins = 0;

		for (int i = 0; i < trials; i++) {
			// Simulate a single Monty Hall trial without switching
			int winningDoor = myRandomGenerator.nextInt(3) + 1;
			int playerChoice = myRandomGenerator.nextInt(3) + 1;
			int revealedDoor = revealGoat(winningDoor, playerChoice);

			if (playerChoice == winningDoor) {
				noSwitchWins++;
			}

			// Simulate a single Monty Hall trial with switching
			int newChoice = switchDoor(playerChoice, revealedDoor);

			if (newChoice == winningDoor) {
				switchWins++;
			}
		}

		double switchWinPercentage = (double) switchWins / trials * 100;
		double noSwitchWinPercentage = (double) noSwitchWins / trials * 100;

		System.out.println("Switching strategy win percentage: " + switchWinPercentage + "%");
		System.out.println("Not switching strategy win percentage: " + noSwitchWinPercentage + "%");
	}
	public static int revealGoat(int winningDoor, int playerChoice) {
		int revealedDoor;
		do {
			revealedDoor = myRandomGenerator.nextInt(3) + 1;
		} while (revealedDoor == winningDoor || revealedDoor == playerChoice);

		return revealedDoor;
	}
	public static int switchDoor(int playerChoice, int revealedDoor) {
		int newChoice;
		do {
			newChoice = myRandomGenerator.nextInt(3) + 1;
		} while (newChoice == playerChoice || newChoice == revealedDoor);
		return newChoice;
	}
}