

/* Lab Exercises No.4
 
Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

import java.util.Scanner;

public class Labels {
    public static int calculatePages(int numberOfLabels, int numberOfColumns) {
        int labelsPerColumn = 10;
        int totalLabels = numberOfLabels * numberOfColumns;

        int totalPages = totalLabels / labelsPerColumn;
        if (totalLabels % labelsPerColumn != 0) {
            totalPages++;
        }
        return totalPages;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the total number of labels? ");
        int numberOfLabels = scanner.nextInt();

        System.out.print("What is the number of columns? ");
        int numberOfColumns = scanner.nextInt();

        // check the input values
        if (numberOfLabels <= 0 || numberOfColumns <= 0) {
            System.out.println("You entered wrong numbers. Please check!");
        } else {
            int pages = calculatePages(numberOfLabels, numberOfColumns);
            System.out.println("Total pages needed: " + pages);
        }

        scanner.close();
    }

}



	


