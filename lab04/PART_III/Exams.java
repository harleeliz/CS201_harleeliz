/* Lab Exercises No.4
 
Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

import java.util.Scanner;

public class Exams {

    public static double examAverage(double exam1, double exam2, double exam3) {
        double lowerscore = Math.min(exam1, Math.min(exam2, exam3));
        double totalscore = (exam1 + exam2 + exam3) - lowerscore;

        // Calculate the average based on the given conditions
        double average;
        if (lowerscore + 20 <= Math.min(exam1, exam2) || lowerscore + 20 <= Math.min(exam1, exam3) || lowerscore + 20 <= Math.min(exam2, exam3)) {
            average = totalscore / 2;
        } else {
            average = (exam1 + exam2 + exam3) / 3;
        }

        return average;
    }

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("What is your first score? ");
        // Example exam scores
        double exam1 = scanner.nextDouble();
    
    	System.out.println("What is your second score? ");
        double exam2 = scanner.nextDouble();
    	System.out.println("What is your last score? ");
        double exam3 = scanner.nextDouble();

        // Calculate the exam average
        double average = examAverage(exam1, exam2, exam3);

        // Print the average
        System.out.println("Your average score is " + average);
    }
}
