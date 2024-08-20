/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class Transcript {
    private int studentID;
    private CourseGrade[] courseGrades;
    private int courseCount;

    public Transcript(int studentID) {
        this.studentID = studentID;
        this.courseGrades = new CourseGrade[100]; // Maximum 100 courses
        this.courseCount = 0;
    }

    public boolean addCourseGrade(CourseGrade courseGrade) {
        if (courseCount < 100) {
            courseGrades[courseCount] = courseGrade.clone();
            courseCount++;
            return true;
        } else {
            return false;
        }
    }

    public CourseGrade[] getCourseGrades(String semester) {
        CourseGrade[] result = new CourseGrade[courseCount];
        int resultCount = 0;

        for (int i = 0; i < courseCount; i++) {
            if (courseGrades[i].getSemester().equals(semester)) {
                result[resultCount] = courseGrades[i];
                resultCount++;
            }
        }

        // Resize the result array to fit the actual number of course grades
        CourseGrade[] trimmedResult = new CourseGrade[resultCount];
        System.arraycopy(result, 0, trimmedResult, 0, resultCount);

        return trimmedResult;
    }

    public double getGPA() {
        double totalGradePoints = 0.0;
        int totalCreditHours = 0;

        for (int i = 0; i < courseCount; i++) {
            CourseGrade courseGrade = courseGrades[i];
            if (courseGrade.getLetterGrade() != 'I') {
                totalCreditHours += 3; // Assuming all courses are 3 credit hours
                switch (courseGrade.getLetterGrade()) {
                    case 'A':
                        totalGradePoints += 4.0 * 3;
                        break;
                    case 'B':
                        totalGradePoints += 3.0 * 3;
                        break;
                    case 'C':
                        totalGradePoints += 2.0 * 3;
                        break;
                    case 'D':
                        totalGradePoints += 1.0 * 3;
                        break;
                    default:
                        // 'E' (F) grade, no grade points
                        break;
                }
            }
        }

        if (totalCreditHours == 0) {
            return 0.0;
        }

        return totalGradePoints / totalCreditHours;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("SID=").append(studentID).append(" GPA=").append(String.format("%.2f", getGPA())).append("\n");

        for (int i = 0; i < courseCount; i++) {
            result.append(courseGrades[i]).append("\n");
        }

        return result.toString();
    }
}
