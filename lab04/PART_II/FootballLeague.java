/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.util.Scanner;


public class FootballLeague {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your age? ");

        int age = in.nextInt();
        System.out.println("What is your weight? ");
        double weight = in.nextDouble();
        // add your code here

        if(age <= 12 | weight <= 100) {
            System.out.println("Peewee");
        } else if ( age >= 15 | weight >= 150) {
            System.out.println("Max");
        } else {
            System.out.println("Middle");
        }

    }
}