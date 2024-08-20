/////////////////////////////////////////////////////////////////////
//Lab Exercises No.2
//Accelerated Introduction to Computer Science Fall 2023
//Course CS 201 02
//Student: Harlee Ramos
//Due Date: 09/08/2023
/////////////////////////////////////////////////////////////////////

//PROBLEM 1 TRY VARIABLES
import java.util.Scanner;
public class Stopwatch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// add your code here
		System.out.println("WELCOME\n");
		System.out.println("This program will convert an integer format time to hh:mm:ss\n");
		System.out.print("Insert the integer time: ");
		int seconds=in.nextInt();
		int hours, minutes,leftOver;
		int min2second =60;
		int hour2min =60;
		hours =seconds/(min2second*hour2min);
		leftOver = seconds%(min2second*hour2min);
		minutes=leftOver/min2second;
		leftOver = seconds%min2second;
		System.out.println( seconds+" seconds equals " + hours + ":" + minutes + ":" + leftOver);
	}
}
