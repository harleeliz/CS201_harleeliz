/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class IsCandidate {
    private int satScore, youAge;
    private double yourGpa;
    private static final double DEFAULT_GPA=0;
    private static final int DEFAULT_SATSCORE=0, DEFAULT_AGE=0;
    // Default constructor
    public IsCandidate() {
        setSatScore(DEFAULT_SATSCORE);    // good practice to call "sets" here
        setGpa(DEFAULT_GPA);
        setAge(DEFAULT_AGE);
    }
    // non-Default constructor
    public IsCandidate(int NewSatScore, double NewGpa, int NewAge) {
        setSatScore(NewSatScore);
        setGpa(NewGpa);
        setAge(NewAge);
    }
    // Accessor methods
    public int getSatScore () {return satScore;}
    public double getGpa () {return yourGpa;}
    public int getAge()  {return youAge;}
    //mutator methods
    public void setSatScore(int NewSatScore) {
        satScore = NewSatScore;
    }
    public void setGpa(double NewGpa) {
        yourGpa = NewGpa;
    }
    public void setAge(int NewAge) {
        youAge = NewAge;
    }
    // Main calculation
    public boolean IsACandidate() {
        boolean isCandidate;
        if (satScore>=1100 && yourGpa>=2.5 && youAge>15) {
            isCandidate=true;
        }
        else {
            isCandidate=false;
             }
        return isCandidate;
    }
public String toString(){
        return "SatScore: " + satScore + ", GPA: " + yourGpa + ", Age: " + youAge;
    }

}
