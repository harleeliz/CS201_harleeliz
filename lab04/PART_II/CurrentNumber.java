/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class CurrentNumber {

    int currentNumber;
    private static final int DEFAULT = 0;

    public CurrentNumber ( ) {
        setCurrentNumber ( DEFAULT );
    }

    public CurrentNumber ( int currentNumber ) {
        this.currentNumber = currentNumber;
    }

    public int getCurrentNumber ( ) {
        return currentNumber;
    }

    public void setCurrentNumber ( int currentNumber ) {
        this.currentNumber = currentNumber;
    }

    public int calCurrentNumber ( ) {
        if ( ( Math.abs ( currentNumber ) % 2 ) == 1 ) {
            currentNumber = 3 * currentNumber + 1;
        }
        else {
            currentNumber = -1 * currentNumber;
        }
        return currentNumber;
    }

    @Override
    public String toString ( ) {
        return "CurrentNumber{" +
                "currentNumber=" + currentNumber +
                '}';
    }
}
