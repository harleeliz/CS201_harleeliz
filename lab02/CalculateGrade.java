/////////////////////////////////////////////////////////////////////
//Lab Exercises No.2
//Accelerated Introduction to Computer Science Fall 2023
//Course CS 201 02
//Student: Harlee Ramos
//Due Date: 09/08/2023
/////////////////////////////////////////////////////////////////////

//PROBLEM 4 STOPWATCH
import java.util.Scanner;
public class CalculateGrade {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        // add your code here
    System.out.println("WELCOME\n");
    System.out.println("This program calculate the weighted grade of the course CS201,02");
    System.out.print("Type student name: ");
    String studentName = input.nextLine();
    System.out.print("Type quiz Nº1 grade: ");
    int quiz1 = input.nextInt();
    System.out.print("Type quiz Nº2 grade: ");
    int quiz2 = input.nextInt();
    System.out.print("Type midterm grade: ");
    int midterm = input.nextInt();
    System.out.print("Type final exam grade: ");
    int finalExam = input.nextInt();
    System.out.print("Type laboratory grade: ");
    int labGrades = input.nextInt();
    double quiz1Weight= 0.10, quiz2Weight= 0.15, midtermWei=0.25, finalExamWei =0.30,labGradesWei=0.20;
    double weightedGrade=(quiz1*quiz1Weight)+(quiz2*quiz2Weight)+(midterm*midtermWei)+(finalExam*finalExamWei)+(labGrades*labGradesWei);
    System.out.println("The weighted average grade of "+studentName+" in CS201 is "+ weightedGrade);
        }
        }