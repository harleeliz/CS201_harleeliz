/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class FindDuplicates {
    private String file;

    public FindDuplicates(String file) {
        this.file = file;
    }

    public String getDuplicates() {
        StringBuilder duplicates = new StringBuilder();

        try {
            File file1 = new File(file);

            if (file1.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file1));
                String line;
                HashMap<String, StringBuilder> recordMap = new HashMap<>();
                HashMap<String, ArrayList<Integer>> numbers = new HashMap<>();

                int lineNumber = 0;

                while ((line = reader.readLine()) != null) {
                    lineNumber++;
                    String[] parts = line.split(" ");
                    String key = parts[0];

                    if (!key.isEmpty()) {
                        if (recordMap.containsKey(key)) {
                            numbers.get(key).add(lineNumber);
                            if (numbers.get(key).size() == 1) {
                                int firstline = numbers.get(key).get(0);
                                duplicates.delete(duplicates.lastIndexOf(firstline + " "), duplicates.length());
                            }
                            duplicates.append(lineNumber).append(" ").append(line).append("\n");
                        } else {
                            ArrayList<Integer> lineno = new ArrayList<>();
                            lineno.add(lineNumber);
                            numbers.put(key, lineno);
                            recordMap.put(key, new StringBuilder(lineNumber + " " + line));
                        }
                    }
                }
                reader.close();
            } else {
                System.out.println("you entered wrong file " + file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return duplicates.toString();
    }

    @Override
    public String toString() {
        return "errors : " + file;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("enter the file name (if you want to stop, enter 'end'): ");
            String filePath = scanner.nextLine();

            if (filePath.equalsIgnoreCase("end")) {
                break;
            }

            FindDuplicates findDuplicates = new FindDuplicates(filePath);
            System.out.println("Here are the results of duplicate records in " + filePath + ":");
            String duplicates = findDuplicates.getDuplicates();
            System.out.println(duplicates);
        }

        scanner.close();
    }
}
