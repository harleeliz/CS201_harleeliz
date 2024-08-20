/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class ThreeDigitNumber {
	private int num;
	private static final int DEFAULT_NUMBER=123;
	public ThreeDigitNumber() {
		setNumber(DEFAULT_NUMBER);
	}
	public ThreeDigitNumber(int newNum) {
		setNumber(newNum);
	}
		public int getNum() { return num; }
	public String evenOddMixed () {
		int digit1 = num%10;
		int digit2 = (num/10)%10;
		int digit3 = (num/100)%10;

		boolean allEven = digit1 % 2 == 0 && digit2 % 2 == 0 && digit3 % 2 == 0;
		boolean allOdd = digit1 % 2 != 0 && digit2 % 2 != 0 && digit3 % 2 != 0;

		if (allEven) {
			return "all even";
		} else if (allOdd) {
			return "all odd";
		} else {
			return "mixed";
		}

	}
		public void setNumber(int newNum) {
		if (newNum>=100 && newNum<=999) {
			num=newNum;
		}
		else {
			num=DEFAULT_NUMBER;
		}
	}
		public String toString() { return "number="+num; }
}