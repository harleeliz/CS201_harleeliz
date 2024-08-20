/////////////////////////////////////////////////////////////////////
//Lab Exercises No.2
//Accelerated Introduction to Computer Science Fall 2023
//Course CS 201 02
//Student: Harlee Ramos
//Due Date: 09/08/2023
/////////////////////////////////////////////////////////////////////

//PROBLEM 3 TANK SIZE

import java.util.Scanner;
public class tankSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                // add your code here
        System.out.println("WELCOME!");
        System.out.println("\nThis program will help you determine the tank size that you need.");
        System.out.println("\nIn order to determine the size, you should know the radius of the well in inches, " +
                "the depth of the well in feet, and the number of family members.");
        System.out.print("\nInput the radius: ");
        double radius=in.nextDouble();
        System.out.print("Input the depth: ");
        double depth=in.nextDouble();
        System.out.print("Input the quantity of family members: ");
        int familySize=in.nextInt();
        int inch2foot = 12, waterLevel=50, galXperson=60;
        double cubFoots2gal = 7.48, shotPIvalue=3.14159;
        double wellVolume=  (shotPIvalue)*(depth-waterLevel)*(Math.pow((radius/inch2foot),2));
        double wellGallon= wellVolume*cubFoots2gal;
        double famGallon = galXperson*familySize;
        double gallonsNeeded = famGallon - wellGallon;
        System.out.println( "Tank Size Needed = " + gallonsNeeded + " gal.");
            }
    }

