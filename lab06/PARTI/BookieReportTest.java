/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTI;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

public class BookieReportTest {
    public static void main(String[] args) throws IOException {
        NumberFormat formatter = NumberFormat.getCurrencyInstance( Locale.US);
        BookieReport br = new BookieReport();

        // Test case 1
        br.readData("Adams.csv");
        br.readData("Brent.csv");
        br.readData("Coughlin.csv");
        br.readData("Davies.csv");
        boolean a1 = br.getReport().equals("Adams profit/(loss) ($3.64) for 6 wins and 7 losses and 3 ties\n" +
                "Brent profit/(loss) ($227.27) for 3 wins and 5 losses and 3 ties\n" +
                "Coughlin profit/(loss) $57.27 for 3 wins and 3 losses and 3 ties\n" +
                "Davies profit/(loss) ($808.59) for 19 wins and 24 losses and 4 ties\n");

        System.out.print(br.getReport());
        boolean a2 = formatter.format(br.getBalance()).equals("$982.22");
        System.out.println(formatter.format(br.getBalance()));
        System.out.println();

        // Test results
        System.out.println("Test 1: " + (a1 && a2 ? "Passed" : "Failed"));

        // Test case 2
        br = new BookieReport();
        br.readData("Adams.csv");
        br.readData("Brent.csv");
        br.readData("Coughlin.csv");
        br.readData("Davies.csv");
        br.readData("Elder.csv");
        br.readData("Flynn.csv");
        br.readData("Grant.csv");
        br.readData("Henry.csv");

        boolean a3 = br.getReport().equals("Adams profit/(loss) ($3.64) for 6 wins and 7 losses and 3 ties\n" +
                "Brent profit/(loss) ($227.27) for 3 wins and 5 losses and 3 ties\n" +
                "Coughlin profit/(loss) $57.27 for 3 wins and 3 losses and 3 ties\n" +
                "Davies profit/(loss) ($808.59) for 19 wins and 24 losses and 4 ties\n" +
                "Elder profit/(loss) $1,340.91 for 17 wins and 13 losses and 3 ties\n" +
                "Flynn profit/(loss) $194.55 for 6 wins and 6 losses and 1 ties\n" +
                "Grant profit/(loss) ($18.18) for 1 wins and 2 losses and 0 ties\n" +
                "Henry profit/(loss) $250.91 for 9 wins and 6 losses and 2 ties\n");
        System.out.print(br.getReport());
        boolean a4 = formatter.format(br.getBalance()).equals("$1,586.36");
        System.out.println(formatter.format(br.getBalance()));

        // Test results
        System.out.println("Test 2: " + (a3 && a4 ? "Passed" : "Failed"));
    }
}
