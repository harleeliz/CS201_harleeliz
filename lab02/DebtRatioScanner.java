/////////////////////////////////////////////////////////////////////
//Lab Exercises No.2
//Accelerated Introduction to Computer Science Fall 2023
//Course CS 201 02
//Student: Harlee Ramos
//Due Date: 09/08/2023
/////////////////////////////////////////////////////////////////////

//PROBLEM 2 DEBT RATIO
import java.util.Scanner;
public class DebtRatioScanner {
	public static void main(String[] args) {

		// add your code here
		Scanner input = new Scanner(System.in);
		double ratioDebt1= 0.36, ratioDebt2= 0.42, highLimit, lowLimit;

		System.out.println("BANK ABC MORTGAGE CALCULATOR");
		System.out.println("WELCOME\n");
		System.out.println("This application will determine the recommended limits for your new mortgage payments");
		System.out.print("Insert the income amount: ");
		double income = input.nextDouble();

		System.out.print("Insert the total of other monthly debts amount: ");
		double otherMonthlyDebt = input.nextDouble();

		lowLimit = ratioDebt1* income  - otherMonthlyDebt;
		highLimit = ratioDebt2* income  - otherMonthlyDebt;

		System.out.println("The lower limit is: $" + lowLimit);  //formatted output not required
		System.out.println("The upper limit is: $" + highLimit);  //formatted output not required
	}
}




