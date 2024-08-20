/* Lab Exercises No.6
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
package PARTI;

import java.util.*;
import java.io.*;
public class WeatherAccuracy {
	private int count;		
	private int [] predict2, predict1, actual;

	public WeatherAccuracy(String filename, int numberOfDays) {
		count = numberOfDays;
		predict2 = new int[count];
		predict1 = new int[count];
		actual = new int[count];

		try {
			Scanner scanner = new Scanner(new File(filename));
			int day = 0;

			while (scanner.hasNextLine() && day < count) {
				predict2[day] = scanner.nextInt();
				predict1[day] = scanner.nextInt();
				actual[day] = scanner.nextInt();
				day++;
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public int worstPrediction() {
		int worstDay = 0;
		int worstError = Integer.MIN_VALUE;

		for (int day = 0; day < count; day++) {
			int error = Math.abs(predict2[day] + predict1[day] - actual[day]);
			if (error > worstError) {
				worstError = error;
				worstDay = day + 1;
			}
		}

		return worstDay;
	}
	public int mostCommonActualTemp() {
		HashMap<Integer, Integer> tempCount = new HashMap<>();

		for (int day = 0; day < count; day++) {
			int temp = actual[day];
			tempCount.put(temp, tempCount.getOrDefault(temp, 0) + 1);
		}

		int mostCommonTemp = 0;
		int maxCount = 0;

		for (Map.Entry<Integer, Integer> entry : tempCount.entrySet()) {
			if (entry.getValue() > maxCount) {
				mostCommonTemp = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		return mostCommonTemp;
	}
}