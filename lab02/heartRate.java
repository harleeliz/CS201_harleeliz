/////////////////////////////////////////////////////////////////////
//Lab Exercises No.2
//Accelerated Introduction to Computer Science Fall 2023
//Course CS 201 02
//Student: Harlee Ramos
//Due Date: 09/08/2023
/////////////////////////////////////////////////////////////////////

//PROBLEM 5 HEART RATE CALCULATOR
import java.util.Scanner;

public class heartRate {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        // add your code here
        System.out.println("WELCOME\n");
        System.out.println("Based on your age, this program will calculate your predicted target heart rate range.");
        System.out.print("Type your age: ");
        int userAge = input.nextInt();
        final double lowLidiff=0.6, upperLidiff=0.75;
        double lowthr, highthr;
        lowthr = lowLidiff*(220-userAge);
        highthr = upperLidiff*(220-userAge);
        System.out.println( "THRZ: " + lowthr + " - " + highthr + " BPM");
}
}
