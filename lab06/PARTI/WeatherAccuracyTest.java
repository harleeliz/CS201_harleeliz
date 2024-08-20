/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTI;

public class WeatherAccuracyTest {

    public static void main (String [] args){

        System.out.print("weather1.txt input file testing ");
        WeatherAccuracy f1 = new WeatherAccuracy("weather1.txt", 30);
        boolean a1 = (f1.worstPrediction() == 4 && f1.mostCommonActualTemp() == 62);
        if (a1) System.out.println("PASSED");
        else System.out.println("FAILED worst=" + f1.worstPrediction() + " common=" + f1.mostCommonActualTemp());

        System.out.print("weather2.txt input file testing ");
        WeatherAccuracy f2 = new WeatherAccuracy("weather2.txt", 30);
        boolean a2 = (f2.worstPrediction() == 10 && f2.mostCommonActualTemp() == 64);
        if (a2) System.out.println("PASSED");
        else System.out.println("FAILED worst=" + f2.worstPrediction() + " common=" + f2.mostCommonActualTemp());
    }
}
