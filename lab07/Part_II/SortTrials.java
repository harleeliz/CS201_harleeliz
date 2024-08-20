package Part_II;
/* Lab Exercises No.7
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos*/

import java.util.*;
public class SortTrials {
	public static void main(String[] args) {
		final int TRIALS=1000;
		final int TRIAL_BASE=1000;
		for (int sortType=1; sortType<=2; sortType++) {  //1=insertionSort  2=binaryInsertionSort
			long[] timings = new long[5];  // 5 different trial size
			for (int i=0; i<=4; i++) {    ///  1000, 2000, 4000, 8000, 160000
				int count=(int)(TRIAL_BASE*Math.pow(2,i));
				for (int j=0; j<TRIALS; j++) {   // 1000 trials of each size with new random ints each time
					Random r = new Random();
					int[] data = new int[count];
					for(int k = 0; k < data.length; k++)
						data[k]= r.nextInt(200001)-100000;   // random int range -100000 to 100000
					long startTime = System.nanoTime();  // start the timer
					if (sortType==1) {
						insertionSort(data);
					}
					else {
						binaryInsertionSort(data);
					}
					long endTime = System.nanoTime();   // end the timer
					if (checkSort(data)) {	
						timings[i]=timings[i]+(endTime-startTime);  // accumulate the time if sort OK
					}
					else {
						timings[i]=-9999999;	// sort not OK
					}
				}
				if (sortType==1) 
					System.out.println("InsertionSort("+count+")="+(timings[i])/TRIALS + " nsec");
				else System.out.println("BinaryInsertionSort("+count+")="+(timings[i])/TRIALS + " nsec");
			}
		}
	}
	
	public static boolean checkSort(int[] data) {
		for (int i=0; i<data.length-1; i++){
			if (data[i]>data[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void insertionSort(int[] data) {

		for (int j = 1; j < data.length; j++) {
			int key = data[j];
			int i = j - 1;

			while (i >= 0 && data[i] > key) {
				data[i + 1] = data[i];
				i--;
			}

			data[i + 1] = key;
		}
	}
	public static void binaryInsertionSort(int[] data) {

		for (int j = 1; j < data.length; j++) {
			int key = data[j];
			int low = 0;
			int high = j - 1;

			while (low <= high) {
				int mid = (low + high) / 2;

				if (key < data[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}

			for (int i = j - 1; i >= low; i--) {
				data[i + 1] = data[i];
			}

			data[low] = key;
		}

	}
}