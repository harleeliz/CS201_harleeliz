package PARTI;

/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */


import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Hiring {
	public static void main(String[] args) throws IOException {
		// Read data from the "data.txt" file
		String[][] data = readDataFromFile("data.txt");

		// Check if data was successfully read from the file
		if (data != null) {
			int initialCount = data.length; // Count of initial applicants

			// Call and display the results for the analysis methods
			int count1 = analyzeAndPrintResults(data, "Factor_1");
			int count2 = analyzeAndPrintResults(data, "Factor_2");
			int count3 = analyzeAndPrintResults(data, "Factor_3");
			int count4 = analyzeAndPrintResults(data, "Factor_4");
			int count5 = analyzeAndPrintResults(data, "Factor_5"); // New "Factor 5"

			int finalCount = count4; // Count of remaining applicants after analysis

			// Output the counts
			System.out.println("\nTotal number of applicants: " + initialCount);
			System.out.println("Factor 1 - Applicants that have an overall GPA above 80: " + count1);
			System.out.println("Factor 2 - Applicants that have no grade below 65: " + count2);
			System.out.println("Factor 3 - Applicants that have at least 4 grades above 85: " + count3);
			System.out.println("Factor 4 - Applicants that have a core CS courses average above 85: " + count4);
			System.out.println("Factor 5 - Applicants with grades above 85 in Data Structure, Software Engineering, and Algorithms: " + count5); // New Factor 5
			System.out.println("");
			System.out.println("Out of: " + initialCount + " applicants, Factor 5 is recommended for evaluating all applicants.");
			// Format the percentage to two decimal places
			DecimalFormat df = new DecimalFormat("0.00");
			double percentage = ((double)count5 / initialCount) * 100;
			System.out.println("A total of " + count5 + " applicants are considered, which represents " + df.format(percentage) + " percent of al applicants");
			System.out.println("");
			System.out.println("Disclaimer!");
			System.out.println("There is no gender, age, nationality, religion or other qualitative possible\nbias on this selection, as the data analyzed is just numbers.");
		}
	}

	// Read data from the "data.txt" file
	public static String[][] readDataFromFile(String filename) {
		List<String[]> dataList = new ArrayList<>();

		try {
			File file = new File(filename);
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] values = line.split(",");
				dataList.add(values);
			}

			scanner.close();
		} catch (IOException e) {
			System.err.println("An error occurred while reading data from the file: " + e.getMessage());
			return null;
		}

		return dataList.toArray(new String[0][]);
	}

	// Print the list of applicants and return the count
	public static int printApplicants(String[][] applicants) {
		for (String[] applicant : applicants) {
			System.out.println(String.join(", ", applicant));
		}
		return applicants.length;
	}

	// Analyze applicants and print the results, returning the count
	public static int analyzeAndPrintResults(String[][] data, String methodDescription) {
		String[][] result = null;
		int count = 0;

		switch (methodDescription) {
			case "Factor_1":
				result = analyze_applicant1(data);
				break;
			case "Factor_2":
				result = analyze_applicant2(data);
				break;
			case "Factor_3":
				result = analyze_applicant3(data);
				break;
			case "Factor_4":
				result = analyze_applicant4(data);
				break;
			case "Factor_5":
				result = analyzeHighGradesApplicants(data); // New "Factor 5"
				break;
		}

		if (result != null) {
			System.out.println(methodDescription);
			count = printApplicants(result);
		}

		return count;
	}

	// analyze_applicant1 returns applicants that have an overall GPA above 80.
	public static String[][] analyze_applicant1(String[][] data) {
		List<String[]> selectedApplicants = new ArrayList<>();

		for (String[] applicant : data) {
			double overallGPA = Double.parseDouble(applicant[applicant.length - 1]);
			if (overallGPA > 80) {
				selectedApplicants.add(applicant);
			}
		}
		return selectedApplicants.toArray(new String[0][]);
	}

	// analyze_applicant2 returns applicants that have no grade below 65.
	public static String[][] analyze_applicant2(String[][] data) {
		List<String[]> selectedApplicants = new ArrayList<>();

		for (String[] applicant : data) {
			boolean hasLowGrade = false;
			for (int i = 0; i < applicant.length - 1; i++) {
				int grade = Integer.parseInt(applicant[i]);
				if (grade < 65) {
					hasLowGrade = true;
					break;
				}
			}

			if (!hasLowGrade) {
				selectedApplicants.add(applicant);
			}
		}

		return selectedApplicants.toArray(new String[0][]);
	}

	// analyze_applicant3 returns applicants that have at least 4 grades above 85.
	public static String[][] analyze_applicant3(String[][] data) {
		List<String[]> selectedApplicants = new ArrayList<>();

		for (String[] applicant : data) {
			int highGradesCount = 0;
			for (int i = 0; i < applicant.length - 1; i++) {
				int grade = Integer.parseInt(applicant[i]);
				if (grade > 85) {
					highGradesCount++;
					if (highGradesCount >= 4) {
						selectedApplicants.add(applicant);
						break;
					}
				}
			}
		}

		return selectedApplicants.toArray(new String[0][]);
	}

	// analyze_applicant4 returns applicants that have a core CS courses average above 85.
	public static String[][] analyze_applicant4(String[][] data) {
		List<String[]> selectedApplicants = new ArrayList<>();

		for (String[] applicant : data) {
			int sumCoreGrades = 0;
			for (int i = 0; i < 5; i++) { // Only the first 5 columns are core CS courses
				int grade = Integer.parseInt(applicant[i]);
				sumCoreGrades += grade;
			}

			double averageCoreGrade = (double) sumCoreGrades / 5;
			if (averageCoreGrade > 85.0) {
				selectedApplicants.add(applicant);
			}
		}

		return selectedApplicants.toArray(new String[0][]);
	}
	// Analyze and print the applicants with high grades in Data Structure, Software Engineering, and Algorithms
	public static String[][] analyzeHighGradesApplicants(String[][] data) {
		List<String[]> selectedApplicants = new ArrayList<>();

		for (String[] applicant : data) {
			int dataStructureGrade = Integer.parseInt(applicant[0]);
			int softwareEngineeringGrade = Integer.parseInt(applicant[1]);
			int algorithmsGrade = Integer.parseInt(applicant[2]);

			if (dataStructureGrade > 85 && softwareEngineeringGrade > 85 && algorithmsGrade > 85) {
				selectedApplicants.add(applicant);
			}
		}

		return selectedApplicants.toArray(new String[0][]);
	}
}
