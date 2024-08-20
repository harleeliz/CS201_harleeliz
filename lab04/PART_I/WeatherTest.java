/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class WeatherTest {
    public static void main(String[] args) {

        System.out.println("Test Case 1 - greater than 80");
        Weather newWeather1 = new Weather(81);
        System.out.println(newWeather1.toString());
        newWeather1.CheckWeather();
        System.out.println("");
        System.out.println("Test Case 2 - equal to 80");
        Weather newWeather2 = new Weather(80);
        System.out.println(newWeather2.toString());
        newWeather2.CheckWeather();
        System.out.println("");
        System.out.println("Test Case 3 - equal to 60");
        Weather newWeather3 = new Weather(60);
        System.out.println(newWeather3.toString());
        newWeather3.CheckWeather();
        System.out.println("");
        System.out.println("Test Case 4 - less than 60, greater than 44");
        Weather newWeather4 = new Weather(59);
        System.out.println(newWeather4.toString());
        newWeather4.CheckWeather();
        System.out.println("");
        System.out.println("Test Case 5 - equal to 45");
        Weather newWeather5 = new Weather(45);
        System.out.println(newWeather5.toString());
        newWeather5.CheckWeather();
        System.out.println("");
        System.out.println("Test Case 6 - less than 45");
        Weather newWeather6 = new Weather(44);
        System.out.println(newWeather6.toString());
        newWeather6.CheckWeather();
    }
}
