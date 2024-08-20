/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */


public class StudentAnswerSheet {
    private String name;
    private char[] answers;
    private static char[] key = {'?', '?', '?', '?', '?', '?', '?', '?', '?', '?'};

    public StudentAnswerSheet(String name, char[] answers) {
        this.name = (name != null) ? name : "Noname";
        this.answers = (answers != null && answers.length > 0) ? answers.clone() : new char[]{'?'};
    }

    public String getName() {
        return name;
    }

   /* public static void setKey(char[] answerKey) {
        key = (answerKey != null && answerKey.length > 0) ? answerKey.clone() : new char[]{'?'};
    }*/
    
    public static void setKey(char[] answerKey) {
        if (answerKey == null || answerKey.length == 0) {
            key = new char[]{'?'};
        } else {
            key = answerKey.clone();
        }
    }


    public double getScore() {
        if (key.length != answers.length || key == null) {
            return Double.NEGATIVE_INFINITY;
        }
        
        double score = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i] == key[i])
                score += 1;
            else if (answers[i] != '?' && key[i] != '?')
                score -= 0.25;
        }
        return score;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(name);
        for (char answer : answers) {
            result.append(' ').append(answer);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases here...
        // (code for the test cases provided in the original question)
    }
}
