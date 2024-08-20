/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.lang.Math;



public class BMI {
	private double weight;
	private double height;
	private static final int default_weight = 175;
	private static final int default_height = 72;
	
	// declare the default condition
	public BMI() {
		this.weight = default_weight;
		this.height = default_height;
	}
	
	// declare private information
	public BMI(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public double getBMI() {
		double a= 703 * (weight / Math.pow(height, 2));
		return Math.round(a * 10.0) / 10.0;

	}
	
	public String getWeightStatus() {
		double bmi = getBMI();
		if (bmi < 18.5) {
			return "Underweight";
		} else if (bmi > 18 && bmi < 25) {
			return "Normal";
		} else if (bmi >= 25 && bmi <30) {
			return "Overweight";
		} else {
			return "Obese";
		}
	}
	
	// getter 
	public double getweight() {
		return weight;
	}
	
	public double getheight() {
		return height;
	}
	
	
	// setter
	public void setWeight(double newweight) {
		if (newweight < 0) {
			System.out.println("you entered wrong weight");
			weight = default_weight;
			return;
		}
		weight = newweight;
	}
	
	public void setHeight(double newheight) {
		if(newheight < 0) {
			System.out.println("you entered wrong height");
			height = default_height;
			return;
			// write the re-enter code  
		}
		height = newheight;
	}
	
	@Override
	public String toString() {
		String weightStr = String.format("%.0f", weight);
		String heightStr = String.format("%.0f", height);
		
	    return "Weight=" + weightStr + " Height=" + heightStr;
	}
	
	}
	


	

	

