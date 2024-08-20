/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTI;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BookieReport {
    private double balance;           // Represents the bookie's balance.
    private String report;            // Represents the bookie's report.
    private final double DEFAULT_BALANCE = 0;  // Default balance value.
    private final String DEFAULT_REPORT = "";  // Default report value.
    private static NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);

    public BookieReport() {
        setBalance(DEFAULT_BALANCE);  // Initialize balance with the default value.
        setReport(DEFAULT_REPORT);    // Initialize report with the default value.
    }

    public void setBalance(double balance) {
        this.balance = balance;  // Set the bookie's balance to the provided value.
    }

    public void setReport(String report) {
        this.report = report;  // Set the report to the provided value.
    }

    public double getBalance() {
        return balance;  // Get the bookie's current balance.
    }

    public String getReport() {
        return report;  // Get the bookie's current report.
    }

    public void readData(String fileName) throws IOException {
        File input = new File(fileName);  // Create a file object for the input file.
        Scanner in = new Scanner(input);  // Create a scanner to read from the file.
        String player = fileName.substring(0, fileName.length() - 4);  // Extract player name from the file name.

        double playerBalance = 0;  // Initialize the player's balance.
        int wins = 0;              // Initialize the number of wins.
        int losses = 0;            // Initialize the number of losses.
        int ties = 0;              // Initialize the number of ties.

        while (in.hasNextLine()) {
            String line = in.nextLine();  // Read a line from the input file.
            String[] data = line.split(",");  // Split the line into an array of values.
            int homeScore = Integer.parseInt(data[7]);
            int awayScore = Integer.parseInt(data[8]);
            String teamBetOn = data[9];
            int amountBet = Integer.parseInt(data[10]);
            int homeOdds = Integer.parseInt(data[3]);
            int awayOdds = Integer.parseInt(data[6]);

            double outcome = 0;
            if (homeScore - awayScore > homeOdds) {
                if (teamBetOn.equals(data[1])) {
                    outcome = amountBet;  // Calculate the outcome if the home team wins.
                    wins++;
                } else if (teamBetOn.equals(data[4])) {
                    outcome = -amountBet;  // Calculate the outcome if the away team wins.
                    losses++;
                }
            } else if (homeScore - awayScore < -awayOdds) {
                if (teamBetOn.equals(data[1])) {
                    outcome = -amountBet;  // Calculate the outcome if the home team loses.
                    losses++;
                } else if (teamBetOn.equals(data[4])) {
                    outcome = amountBet;  // Calculate the outcome if the away team loses.
                    wins++;
                }
            } else {
                outcome = 0;  // Calculate the outcome as 0 in case of a tie.
                ties++;
            }
            playerBalance += outcome;  // Update the player's balance.
        }

        String resultString = formatter.format(playerBalance);  // Format the player's balance as a currency string.
        if (playerBalance < 0) {
            resultString = "(" + resultString.substring(1) + ")";  // Format negative balances with parentheses.
        }
        report += player + " profit/(loss) " + resultString + " for " + wins + " wins and " + losses + " losses and " + ties + " ties\n";  // Update the bookie's report.
        balance += playerBalance;  // Update the bookie's balance.
    }
}
