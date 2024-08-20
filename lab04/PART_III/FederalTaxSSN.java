/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.text.DecimalFormat;

public class FederalTaxSSN {
    // Constants for valid SSN ranges
    private static final int MIN_AREA_NUMBER = 1;
    private static final int MAX_AREA_NUMBER = 649;
    private static final int MIN_GROUP_NUMBER = 1;
    private static final int MAX_GROUP_NUMBER = 99;
    private static final int MIN_SERIAL_NUMBER = 1;
    private static final int MAX_SERIAL_NUMBER = 9999;

    // Constants for tax brackets
    private static final double BRACKET1_LIMIT = 53500.0;
    private static final double BRACKET2_LIMIT = 250000.0;
    private static final double BRACKET1_RATE = 0.15;
    private static final double BRACKET2_RATE = 0.31;
    private static final double BRACKET3_RATE = 0.396;
    private static final double BRACKET2_BASE_TAX = 12107.0;
    private static final double BRACKET3_BASE_TAX = 79772.0;
    private static final String DEFAULT_SSN = "001-01-0001";
    private static final double DEFAULT_TAXABLE_INCOME = 0.0;
    private static int OBJECTCOUNT = 0;

    // Instance variables
    private String ssn;
    private double taxableIncome;
    private static FederalTaxSSN highestTaxObject;

    // Constructors
    public FederalTaxSSN() {
        this.ssn = DEFAULT_SSN;
        this.taxableIncome = DEFAULT_TAXABLE_INCOME;
        trackHighestTax(this);
    }

    public FederalTaxSSN(String ssn, double taxableIncome) {
        setSSN(ssn);
        setIncome(taxableIncome);
        trackHighestTax(this);
    }

    // Method to get the count of FederalTax objects created
    public static int getCount() {
        return OBJECTCOUNT+3;
    }

    // Private method to validate SSN format
    private boolean isValidSSN(String ssn) {
        // Check if the SSN is not null and matches the expected format
        if (ssn != null && ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
            // Extract area, group, and serial numbers
            String[] parts = ssn.split("-");
            int area = Integer.parseInt(parts[0]);
            int group = Integer.parseInt(parts[1]);
            int serial = Integer.parseInt(parts[2]);

            // Check if the numbers are within valid ranges
            if (area >= MIN_AREA_NUMBER && area <= MAX_AREA_NUMBER &&
                    group >= MIN_GROUP_NUMBER && group <= MAX_GROUP_NUMBER &&
                    serial >= MIN_SERIAL_NUMBER && serial <= MAX_SERIAL_NUMBER) {
                return true;
            }
        }
        return false;
    }

    // Private method to set SSN with error checking
    private void setSSN(String ssn) {
        // Validate SSN format
        if (isValidSSN(ssn)) {
            this.ssn = ssn;
        } else {
            this.ssn = DEFAULT_SSN;
        }
    }
    // Private method to set taxable income with error checking
        private void setIncome(double taxableIncome) {
            if (taxableIncome < 0) {
                this.taxableIncome = 0.0; // Default value
            } else {
                this.taxableIncome = taxableIncome;
            }
        }

        // Getter method to get taxable income
        public double getIncome() {
            return this.taxableIncome;
        }



    // Private method to track the FederalTaxSSN object with the highest tax paid
    private static void trackHighestTax(FederalTaxSSN obj) {
        if (highestTaxObject == null || obj.taxPaid() > highestTaxObject.taxPaid()) {
            highestTaxObject = obj;
        }
    }

    //Addition of the method resetHighestTaxObject(), for return null in the highestTaxObject
    public static void resetHighestTaxObject() {
        highestTaxObject = null;
    }

    // Class method to get the FederalTaxSSN object with the highest tax paid
        public static FederalTaxSSN getHighestTaxObject() {
            return highestTaxObject;
        }



    // Method to determine tax bracket
    public int taxBracket() {
        if (taxableIncome <= BRACKET1_LIMIT) {
            return 1;
        } else if (taxableIncome <= BRACKET2_LIMIT) {
            return 2;
        } else {
            return 3;
        }
    }


    // Method to calculate tax paid
        public double taxPaid() {
            int bracket = taxBracket();
            double taxPaid = 0.0;

            switch (bracket) {
                case 1:
                    taxPaid = taxableIncome * BRACKET1_RATE;
                    break;
                case 2:
                    taxPaid = BRACKET2_BASE_TAX + (taxableIncome - BRACKET1_LIMIT) * BRACKET2_RATE;
                    break;
                case 3:
                    taxPaid = BRACKET3_BASE_TAX + (taxableIncome - BRACKET2_LIMIT) * BRACKET3_RATE;
                    break;
            }

            return Math.round(taxPaid * 100.0) / 100.0; // Rounded to 2 decimal places
        }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        return "SSN: " + ssn + " Taxable Income: " + df.format(taxableIncome);
    }
    }
