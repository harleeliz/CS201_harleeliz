/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();
        scanner.close();

        char[] answerKey = readAnswerKeyFromFile(filename);

        if (answerKey == null) {
            System.err.println("Invalid filename: " + filename);
            System.exit(1);
        }

        StudentAnswerSheet.setKey(answerKey);

        ArrayList<StudentAnswerSheet> studentAnswerSheets = new ArrayList<>();

        try {
            Scanner fileScanner = new Scanner(new File(filename));

            // Read and grade each student
            while (fileScanner.hasNextLine()) {
                String studentLine = fileScanner.nextLine();
                String[] studentData = studentLine.split(",");
                String studentName = studentData[0];
                char[] studentAnswers = new char[studentData.length - 1];

                for (int i = 1; i < studentData.length; i++) {
                    studentAnswers[i - 1] = studentData[i].charAt(0);
                }

                StudentAnswerSheet studentSheet = new StudentAnswerSheet(studentName, studentAnswers);
                studentAnswerSheets.add(studentSheet);

                double score = studentSheet.getScore();
                if (!studentName.equals("KEY")) {
                    System.out.println(studentName + " " + studentLine.substring(studentName.length()) + " score=" + score);
                }
            }
            fileScanner.close();

            // Find the highest-scoring students
            double highestScore = Double.NEGATIVE_INFINITY;
            ArrayList<String> bestStudents = new ArrayList<>();

            for (StudentAnswerSheet studentSheet : studentAnswerSheets) {
                if (!studentSheet.getName().equals("KEY")) { // Exclude "KEY"
                    double score = studentSheet.getScore();

                    if (score > highestScore) {
                        highestScore = score;
                        bestStudents.clear();
                        bestStudents.add(studentSheet.getName());
                    } else if (score == highestScore) {
                        bestStudents.add(studentSheet.getName());
                    }
                }
            }

            System.out.print("Best Student(s): ");
            for (String bestStudent : bestStudents) {
                System.out.print(bestStudent + " ");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        }
    }

    private static char[] readAnswerKeyFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String answerKeyLine = reader.readLine();
            if (answerKeyLine != null) {
                String[] answerKeyData = answerKeyLine.split(",");
                char[] answerKey = new char[answerKeyData.length - 1];

                for (int i = 1; i < answerKeyData.length; i++) {
                    answerKey[i - 1] = answerKeyData[i].charAt(0);
                }

                return answerKey;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
 