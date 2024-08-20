/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTIII;

import java.io.*;
import java.util.*;


public class LeaderBoard {
    private List<Integer> scores;
    private int maxLength;

    // Default constructor - default length 5
    public LeaderBoard() {
        this.maxLength = 5;
        this.scores = new ArrayList<>();
    }

    // Non-default constructor
    public LeaderBoard(int length, String filename) {
        if (length > 0) {
            this.maxLength = length;
        } else {
            this.maxLength = 5;
        }
        this.scores = new ArrayList<>();
        loadFromFile(filename);
    }

    // Method to insert a new score and maintain the list in decreasing order
    public void insertNewScore(int score) {
        scores.add(score);
        Collections.sort(scores, Collections.reverseOrder());

        if (scores.size() > maxLength) {
            scores.remove(scores.size() - 1);
        }
    }

    // Method to save scores to a file
    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (int score : scores) {
                writer.println(score);
            }
        } catch (IOException e) {
            System.err.println("Error saving to the file: " + e.getMessage());
        }
    }

    // Method to load scores from a file
    private void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int score = Integer.parseInt(line);
                    insertNewScore(score); // Insert scores in the order they appear in the file
                } catch (NumberFormatException e) {
                    System.err.println("Error parsing score from file: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading from the file: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < scores.size(); i++) {
            sb.append(scores.get(i));
            if (i < scores.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

