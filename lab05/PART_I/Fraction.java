
/* Lab Exercises No.5
Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

public class Fraction {

	private int numerator;
	private int denominator;
	private static final int default_numerator = 1;
	private static final int default_denominator = 1;
	
	// input default values. 
	public Fraction() {
		this.numerator = default_numerator;
		this.denominator = default_denominator;
	}
	
    // input values, when new values put this method. 
	public Fraction(int newnumerator, int newdenominator) {
		if (newdenominator != 0) {
		if(newdenominator < 0) {
			this.denominator = Math.abs(newdenominator); 
			this.numerator = newnumerator * -1;
		} else {
			this.denominator = newdenominator;
			this.numerator = newnumerator;
		}
	} else {
		System.out.println("The denenominator could not be zero.");
		this.denominator = default_denominator;
		this.numerator = newnumerator;
	}		
		}
	
	// declare add method
	public Fraction add(Fraction other) {
		int nnu = this.numerator * other.denominator +other.numerator * this.denominator;
		int nde = this.denominator * other.denominator;
		return new Fraction(nnu, nde);
	}
	
	// declare subtract method
	public Fraction subt(Fraction other) {
		int nnu = this.numerator * other.denominator - other.numerator * this.denominator;
		int nde = this.denominator * other.denominator;
		return new Fraction(nnu, nde);
	}
	
	// declare multiply method
	public Fraction mult(Fraction other) {
		int nnu = this.numerator * other.numerator;
		int nde = this.denominator * other.denominator;
		return new Fraction(nnu, nde);
	}
	
	// declare divide method
	public Fraction div(Fraction other) {
		int nnu = this.numerator * other.denominator;
		int nde = this.denominator * other.numerator;
		return new Fraction(nnu, nde);
	}
	
    // getter
	public int getdenominator() {
		return denominator;
	}
	
	public int getnumerator() {
		return numerator;
	}
	
	public int getfraction() {
		return numerator / denominator;
	}
	
	// setter
	public void setdenominator(int newdenominator) {
		if (denominator < 0) {
			System.out.println("convert the value to positive value");;
		} 
		denominator = newdenominator * -1; 
	}
	
	public void setnumerator(int newnumerator) {
		return;	
	}
	
	public void reduce() {
		int result = red(this.numerator, this.denominator);
		this.numerator /= result;
		this.denominator /= result;
	}
	
	private int red(int i, int j) {
		if(j==0)
			return i;
		return red(j, i % j);
	}
	
	public boolean equals(Fraction that) {
		return this.numerator * that.denominator == that.numerator * this.denominator;
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
}	
}

	



	

