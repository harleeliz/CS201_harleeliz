/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class TranscriptTest {

    public static void main(String[] args) {
        Transcript t1 = new Transcript(1234);
        Transcript t2 = new Transcript(5678);
        CourseGrade c = new CourseGrade("2007F", "CS100", 'B');
        t1.addCourseGrade(c);
        c.setLetterGrade('A');
        t2.addCourseGrade(c);
        c.setCourseNumber("MATH151");
        t1.addCourseGrade(c);
        c.setLetterGrade('D');
        t2.addCourseGrade(c);
        c.setCourseNumber("CS201");
        t1.addCourseGrade(c);
        c.setLetterGrade('I');
        t2.addCourseGrade(c);
        c.setSemester("2008S");
        c.setCourseNumber("CS330");
        t1.addCourseGrade(c);
        c.setLetterGrade('B');
        t2.addCourseGrade(c);
        c.setCourseNumber("MATH152");
        t1.addCourseGrade(c);
        c.setLetterGrade('A');
        t2.addCourseGrade(c);

        System.out.println(t1);
        System.out.println(t2);

        boolean a1 = (t1.toString().equals("SID=1234 GPA=2.75\n2007F CS100 B\n2007F MATH151 A\n2007F CS201 D\n2008S CS330 I\n2008S MATH152 B\n"));
        boolean a2 = (t2.toString().equals("SID=5678 GPA=3.00\n2007F CS100 A\n2007F MATH151 D\n2007F CS201 I\n2008S CS330 B\n2008S MATH152 A\n"));

        System.out.println(a1);
        System.out.println(a2);
    }

}
