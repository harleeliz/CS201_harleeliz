/* Lab Exercises No.5
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */
public class VectorMath {
	public static void main(String[] args) {
		int [] v1 = { 1, 3, 5};
		int [] v2 = { -1, -3, -5};
		int [] v3 = { 1, 2, 3, 4};
		int [] v4 = { 1, 1, 1, 1};
		System.out.println(vectorToString(v1)+"+"+vectorToString(v2)+"="+vectorToString(add(v1, v2)));
		System.out.println(vectorToString(v1)+"+"+vectorToString(v3)+"="+vectorToString(add(v1, v3)));
		System.out.println(vectorToString(v2)+"+"+vectorToString(v3)+"="+vectorToString(add(v2, v3)));		
		System.out.println(vectorToString(v3)+"+"+vectorToString(v4)+"="+vectorToString(add(v3, v4)));
		System.out.println(vectorToString(v1)+"."+vectorToString(v2)+"="+dotProduct(v1, v2));
		System.out.println(vectorToString(v1)+"."+vectorToString(v3)+"="+dotProduct(v1, v3));
		System.out.println(vectorToString(v2)+"."+vectorToString(v3)+"="+dotProduct(v2, v3));		
		System.out.println(vectorToString(v3)+"."+vectorToString(v4)+"="+dotProduct(v3, v4));
	}

	// Converts an integer array to a nicely formatted string
	public static String vectorToString(int[] vector) {
		if (vector == null || vector.length == 0) {
			return "<>"; // Return "<>" for null or empty vectors
		}

		StringBuilder sb = new StringBuilder("<");
		for (int i = 0; i < vector.length; i++) {
			sb.append(vector[i]);
			if (i < vector.length - 1) {
				sb.append(",");
			}
		}
		sb.append(">");
		return sb.toString();
	}

	// Performs vector addition and returns the result as an integer array
	public static int[] add(int[] vector1, int[] vector2) {
		if (vector1.length != vector2.length) {
			return null; // Return null if vectors have different lengths
		}

		int[] result = new int[vector1.length];
		for (int i = 0; i < vector1.length; i++) {
			result[i] = vector1[i] + vector2[i];
		}
		return result;
	}

	// Calculates the dot product of two vectors and returns the result as an integer
	public static int dotProduct(int[] vector1, int[] vector2) {
		if (vector1.length != vector2.length) {
			return 0; // Return 0 if vectors have different lengths
		}

		int product = 0;
		for (int i = 0; i < vector1.length; i++) {
			product += vector1[i] * vector2[i];
		}
		return product;
	}
}