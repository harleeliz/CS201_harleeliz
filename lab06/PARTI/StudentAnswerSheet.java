
/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTI;

public class StudentAnswerSheet {
    private String name;
    private char[] answers;

    private static char[] key;

    private static final char BLANK = '?';
    private static final String DEFAULT_NAME = "Noname";
    private static final double CORRECT_POINTS = 1.0;
    private static final double BLANK_POINTS = 0.0;
    private static final double WRONG_POINTS = -0.25;

    public StudentAnswerSheet(String n, char[] a) {
        name = (n != null) ? n : DEFAULT_NAME;

        if (a != null && a.length > 0) {
            answers = new char[a.length];
            for (int i = 0; i < a.length; i++) {
                answers[i] = a[i];
            }
        } else {
            answers = new char[] { BLANK };
        }
    }

    public String getName() {
        return name;
    }


    public double getScore() {
        double score = 0;

        if (key != null && answers != null && key.length == answers.length) {
            for (int i = 0; i < key.length; i++) {
                if (answers[i] == key[i]) {
                    score += 1.0; // Correct answer, +1 point
                } else if (answers[i] == '?') {
                    score += 0.0; // Blank answer, 0 points
                } else {
                    score -= 0.25; // Incorrect answer, -0.25 points
                }
            }
        }

        return score;
    }





    public static void setKey(char[] answerKey) {
        if (answerKey != null && answerKey.length > 0) {
            key = new char[answerKey.length];
            for (int i = 0; i < answerKey.length; i++) {
                key[i] = answerKey[i];
            }
        }
    }

    public String toString() {
        StringBuilder temp = new StringBuilder(name);
        for (char answer : answers) {
            temp.append(' ').append(answer);
        }
        return temp.toString();
    }
}
