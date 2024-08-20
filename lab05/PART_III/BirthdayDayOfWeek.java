/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
import java.time.format.DateTimeParseException;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class BirthdayDayOfWeek {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> dayOfWeekCount = new HashMap<>();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter a birthday (dd/mm/yyyy): ");
			String birthdayStr = scanner.nextLine();

			try {
				// Parse the input string to LocalDate
				LocalDate birthday = LocalDate.parse(birthdayStr, formatter);

				// Calculate the day of the week
				DayOfWeek dayOfWeek = birthday.getDayOfWeek();
				String dayOfWeekStr = dayOfWeek.toString();

				// Update the count in the HashMap
				dayOfWeekCount.put(dayOfWeekStr, dayOfWeekCount.getOrDefault(dayOfWeekStr, 0) + 1);
			} catch (DateTimeParseException e) {
				System.out.println("Invalid date format. Please enter the date in dd/mm/yyyy format.");
				i--; // Decrement the loop counter to retry input
			}
		}

		// Print the counts in the desired order
		String[] daysOfWeek = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
		StringBuilder result = new StringBuilder();
		for (String day : daysOfWeek) {
			result.append(dayOfWeekCount.getOrDefault(day, 0)).append(" ");
		}
		System.out.print(result.toString().trim());
	}
}


/*
Test Case 1
01/01/2020
10/01/2020
10/01/2020
01/01/2020
08/01/2020
10/01/2020
07/01/2020
08/01/2020
04/01/2020
01/01/2020

Output
0150310

Test Case 2
25/12/2020
25/12/2020
25/12/202
25/12/2020
25/12/2020
25/12/2020
25/12/2020
25/12/2020
25/12/2020
25/12/2020

Output
00001000
 */