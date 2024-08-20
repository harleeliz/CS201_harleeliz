/* Lab Exercises No.3
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 */

public class PersonRetirementClient {
    public static void main(String[] args) {

        //These lines just print text about 3C - Using a User Defined Class – PersonRetirement
        System.out.println("3C - Using a User Defined Class – PersonRetirement");
        System.out.println("PersonRetirementClient-Problem Solutions:");
        System.out.println("All output is one to a line");
        System.out.println();

        //Creation of  a PersonRetirement object with ID "A0001990" and birth year 1972.
        PersonRetirement person = new PersonRetirement("A0001990", 1972);

        //Print the output the person start year
        System.out.println("Start Year: " + person.getStartYear());
        //Print the output the years to retirement
        System.out.println("Years to Retirement: " + person.yearsToRetirement());
        //Now the created object changes the birth year to 1971
        person.setBirthYear(1971);
        //Print the output the years to retirement
        System.out.println("Years to Retirement (after changing birth year): " + person.yearsToRetirement());
    }
}