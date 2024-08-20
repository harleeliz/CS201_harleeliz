/////////////////////////////////////////////////////////////////////
//Lab Exercises No.2
//Accelerated Introduction to Computer Science Fall 2023
//Course CS 201 02
//Student: Harlee Ramos
//Due Date: 09/08/2023
/////////////////////////////////////////////////////////////////////

//Questions problems
public class overflowexa {
    public static void main(String[] args) {
    byte result = Byte.MAX_VALUE;
    result++;

    double value1=Math.pow(1.9,12);
    double value2 =3.99;
    double result2=value1*value2;

        System.out.println("This part of the program will perform a matematical operation with precision issues");
        System.out.println("The answer is: "+result2);

        System.out.println("This part of the program will increment +1 to the maximum value of the data type byte");
    System.out.println("The answer is: "+result);


}
}
