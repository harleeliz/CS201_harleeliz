/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

public class FederalTaxSSNTest {
    public static void main ( String[] args ) {
        boolean allTestsPassed = true;

        // Test Case 1 - Constructors and toString()
        System.out.println ( "Test Case 1 - Constructors and toString()" );
        // Default constructor
        System.out.println ( "Default constructor testing " );
        FederalTaxSSN p1 = new FederalTaxSSN ( );
        boolean a1 = p1.toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $0.00" );
        if ( a1 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p1 );
            allTestsPassed = false;
        }


        System.out.println ( );
        //non-default construct, both args OK
        System.out.println ( "Parameterized constructor with valid SSN and income testing " );
        FederalTaxSSN p2 = new FederalTaxSSN ( "323-56-0822" , 50000.0 );
        boolean a2 = p2.toString ( ).equals ( "SSN: 323-56-0822 Taxable Income: $50,000.00" );
        if ( a2 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p2 );
            allTestsPassed = false;
        }
        System.out.println ( );
        //non-default construct, both args NOT OK
        System.out.println ( "Parameterized constructor with valid SSN and negative income testing " );
        FederalTaxSSN p3 = new FederalTaxSSN ( "678-11-3432" , -50000.0 );
        boolean a3 = p3.toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $0.00" );
        if ( a3 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p3 );
            allTestsPassed = false;
        }


        System.out.println ( );
        //non-default construct, ssn OK, income<0
        System.out.println ( "Parameterized constructor with valid SSN and negative income testing " );
        FederalTaxSSN p4 = new FederalTaxSSN ( "432-56-0822" , -100.0 );
        boolean a4 = p4.toString ( ).equals ( "SSN: 432-56-0822 Taxable Income: $0.00" );
        if ( a4 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p4 );
            allTestsPassed = false;
        }


        System.out.println ( );
        //non-default construct, ssn null, income OK
        System.out.println ( "Parameterized constructor with null SSN and positive income testing " );
        FederalTaxSSN p5 = new FederalTaxSSN ( null , 1234567.89 );
        boolean a5 = p5.toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $1,234,567.89" );
        if ( a5 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p5 );
            allTestsPassed = false;
        }


        System.out.println ( );
        //non-default construct, ssn too long, income OK
        System.out.println ( "Parameterized constructor with too long SSN and positive income testing " );
        FederalTaxSSN p6 = new FederalTaxSSN ( "123-45-67890" , 1234567.89 );
        boolean a6 = p6.toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $1,234,567.89" );
        if ( a6 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p6 );
            allTestsPassed = false;
        }
        System.out.println ( );
        //non-default construct, ssn too short, income OK
        System.out.println ( "Parameterized constructor with too short SSN and positive income testing " );
        FederalTaxSSN p7 = new FederalTaxSSN ( "123-45-678" , 1234567.89 );
        boolean a7 = p7.toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $1,234,567.89" );
        if ( a7 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p7 );
            allTestsPassed = false;
        }


        System.out.println ( );
        //non-default construct, area too low, income OK
        System.out.println ( "Parameterized constructor with area too low SSN and positive income testing " );
        FederalTaxSSN p8 = new FederalTaxSSN ( "000-45-6789" , 1234567.89 );
        boolean a8 = p8.toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $1,234,567.89" );
        if ( a8 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p8 );
            allTestsPassed = false;
        }
        System.out.println ( );
        //non-default construct, area too high, income OK
        System.out.println ( "Parameterized constructor with area too high SSN and positive income testing " );
        FederalTaxSSN p9 = new FederalTaxSSN ( "650-45-6789" , 1234567.89 );
        boolean a9 = p9.toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $1,234,567.89" );
        if ( a9 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p9 );
            allTestsPassed = false;
        }


        System.out.println ( );
        //non-default construct, group too low, income OK
        System.out.println ( "Parameterized constructor with group too low SSN and positive income testing " );
        FederalTaxSSN p10 = new FederalTaxSSN ( "123-00-6789" , 1234567.89 );
        boolean a10 = p10.toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $1,234,567.89" );
        if ( a10 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p10 );
            allTestsPassed = false;
        }


        System.out.println ( );
        //non-default construct, group too high, income OK
        System.out.println ( "Parameterized constructor with group too high SSN and positive income testing " );
        FederalTaxSSN p11 = new FederalTaxSSN ( "123-AA-6789" , 1234567.89 );
        boolean a11 = p11.toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $1,234,567.89" );
        if ( a11 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p11 );
            allTestsPassed = false;
        }


        System.out.println ( );
        //non-default construct, serial too low, income OK
        System.out.println ( "Parameterized constructor with serial too low SSN and positive income testing " );
        FederalTaxSSN p12 = new FederalTaxSSN ( "123-45-0000" , 1234567.89 );
        boolean a12 = p12.toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $1,234,567.89" );
        if ( a12 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p12 );
            allTestsPassed = false;
        }


        System.out.println ( );
        //non-default construct, serial too high, income OK
        System.out.println ( "Parameterized constructor with serial too high SSN and positive income testing " );
        FederalTaxSSN p13 = new FederalTaxSSN ( "123-45-999A" , 1234567.89 );
        boolean a13 = p13.toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $1,234,567.89" );
        if ( a13 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p13 );
            allTestsPassed = false;
        }


        System.out.println ( );
        System.out.println ( "The result of al test are " + ( a1 && a2 && a3 && a4 && a5 && a6 && a7 && a8 && a9 && a10 && a11 && a12 && a13 ) );

        System.out.println ( );
        // Test Case 2 - taxBracket()
        System.out.println ( "\nTest Case 2 - taxBracket()" );

        // 0 income
        System.out.println ( "0 income testing " );
        FederalTaxSSN p14 = new FederalTaxSSN ( );
        boolean a14 = p14.taxBracket ( ) == 1;
        if ( a14 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p14.taxBracket ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Just below tax bracket 1 upper boundary
        System.out.println ( "Just below tax bracket 1 upper boundary testing " );
        FederalTaxSSN p15 = new FederalTaxSSN ( "123-45-6789" , 53499.99 );
        boolean a15 = p15.taxBracket ( ) == 1;
        if ( a15 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p15.taxBracket ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Just at tax bracket 1 upper boundary
        System.out.println ( "Just at tax bracket 1 upper boundary testing " );
        FederalTaxSSN p16 = new FederalTaxSSN ( "123-45-6789" , 53500.0 );
        boolean a16 = p16.taxBracket ( ) == 1;
        if ( a16 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p16.taxBracket ( ) );
            allTestsPassed = false;
        }
        System.out.println ( );
        // Just above tax bracket 1 upper boundary
        System.out.println ( "Just above tax bracket 1 upper boundary testing " );
        FederalTaxSSN p17 = new FederalTaxSSN ( "123-45-6789" , 53500.01 );
        boolean a17 = p17.taxBracket ( ) == 2;
        if ( a17 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p17.taxBracket ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Middle of tax bracket 2
        System.out.println ( "Middle of tax bracket 2 testing " );
        FederalTaxSSN p18 = new FederalTaxSSN ( "123-45-6789" , 200000.0 );
        boolean a18 = p18.taxBracket ( ) == 2;
        if ( a18 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p18.taxBracket ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Just below tax bracket 2 upper boundary
        System.out.println ( "Just below tax bracket 2 upper boundary testing " );
        FederalTaxSSN p19 = new FederalTaxSSN ( "123-45-6789" , 249999.99 );
        boolean a19 = p19.taxBracket ( ) == 2;
        if ( a19 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p19.taxBracket ( ) );
            allTestsPassed = false;
        }
        System.out.println ( );
        // Just at tax bracket 2 upper boundary
        System.out.println ( "Just at tax bracket 2 upper boundary testing " );
        FederalTaxSSN p20 = new FederalTaxSSN ( "123-45-6789" , 250000.0 );
        boolean a20 = p20.taxBracket ( ) == 2;
        if ( a20 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p20.taxBracket ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Just above tax bracket 2 upper boundary
        System.out.println ( "Just above tax bracket 2 upper boundary testing " );
        FederalTaxSSN p21 = new FederalTaxSSN ( "123-45-6789" , 250000.01 );
        boolean a21 = p21.taxBracket ( ) == 3;
        if ( a21 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p21.taxBracket ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Middle of tax bracket 3
        System.out.println ( "Middle of tax bracket 3 testing " );
        FederalTaxSSN p22 = new FederalTaxSSN ( "123-45-6789" , 300000.0 );
        boolean a22 = p22.taxBracket ( ) == 3;
        if ( a22 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p22.taxBracket ( ) );
            allTestsPassed = false;
        }
        System.out.println ( );
        System.out.println ( "The result of al test are " + ( a14 && a15 && a16 && a17 && a18 && a19 && a20 && a21 && a22 ) );
        System.out.println ( );
        // Test Case 3 - taxPaid()
        System.out.println ( "\nTest Case 3 - taxPaid()" );

        // 0 income
        System.out.println ( "0 income testing " );
        FederalTaxSSN p23 = new FederalTaxSSN ( );
        boolean a23 = p23.taxPaid ( ) == 0;
        if ( a23 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p23.taxPaid ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Just below tax bracket 1 upper boundary
        System.out.println ( "Just below tax bracket 1 upper boundary testing " );
        FederalTaxSSN p24 = new FederalTaxSSN ( "123-45-6789" , 53499.0 );
        boolean a24 = p24.taxPaid ( ) == 8024.85;
        if ( a24 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p24.taxPaid ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Just at tax bracket 1 upper boundary
        System.out.println ( "Just at tax bracket 1 upper boundary testing " );
        FederalTaxSSN p25 = new FederalTaxSSN ( "123-45-6789" , 53500.0 );
        boolean a25 = p25.taxPaid ( ) == 8025.0;
        if ( a25 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p25.taxPaid ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Just above tax bracket 1 upper boundary
        System.out.println ( "Just above tax bracket 1 upper boundary testing " );
        FederalTaxSSN p26 = new FederalTaxSSN ( "123-45-6789" , 53501.0 );
        boolean a26 = p26.taxPaid ( ) == 12107.31;
        if ( a26 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p26.taxPaid ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Middle of tax bracket 2
        System.out.println ( "Middle of tax bracket 2 testing " );
        FederalTaxSSN p27 = new FederalTaxSSN ( "123-45-6789" , 200000.0 );
        boolean a27 = p27.taxPaid ( ) == 57522.0;
        if ( a27 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p27.taxPaid ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Just below tax bracket 2 upper boundary
        System.out.println ( "Just below tax bracket 2 upper boundary testing " );
        FederalTaxSSN p28 = new FederalTaxSSN ( "123-45-6789" , 249999.0 );
        boolean a28 = p28.taxPaid ( ) == 73021.69;
        if ( a28 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p28.taxPaid ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Just at tax bracket 2 upper boundary
        System.out.println ( "Just at tax bracket 2 upper boundary testing " );
        FederalTaxSSN p29 = new FederalTaxSSN ( "123-45-6789" , 250000.0 );
        boolean a29 = p29.taxPaid ( ) == 73022.0;
        if ( a29 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p29.taxPaid ( ) );
            allTestsPassed = false;
        }
        System.out.println ( );
        // Just above tax bracket 2 upper boundary
        System.out.println ( "Just above tax bracket 2 upper boundary testing " );
        FederalTaxSSN p30 = new FederalTaxSSN ( "123-45-6789" , 250001.0 );
        boolean a30 = p30.taxPaid ( ) == 79772.4;
        if ( a30 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p30.taxPaid ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Middle of tax bracket 3
        System.out.println ( "Middle of tax bracket 3 testing " );
        FederalTaxSSN p31 = new FederalTaxSSN ( "123-45-6789" , 300000.0 );
        boolean a31 = p31.taxPaid ( ) == 99572.0;
        if ( a31 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + p31.taxPaid ( ) );
            allTestsPassed = false;
        }
        System.out.println ( );
        System.out.println ( "The result of al test are " + ( a23 && a24 && a25 && a26 && a27 && a28 && a29 && a30 && a31 ) );
        System.out.println ( );


        // Test Case 4 - getHighestTaxObject()
        System.out.println ( "Test Case 4 - getHighestTaxObject()" );

        // No objects yet
        System.out.println ( "No objects yet testing " );
        FederalTaxSSN.resetHighestTaxObject ( ); // Addition of the Reset the highestTaxObject to null, in order to include a null input
        boolean a0 = FederalTaxSSN.getHighestTaxObject ( ) == null;
        if ( a0 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + FederalTaxSSN.getHighestTaxObject ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // Default object
        System.out.println ( "Default object testing " );
        FederalTaxSSN p32 = new FederalTaxSSN ( );
        boolean a32 = FederalTaxSSN.getHighestTaxObject ( ).toString ( ).equals ( "SSN: 001-01-0001 Taxable Income: $0.00" );
        if ( a32 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + FederalTaxSSN.getHighestTaxObject ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // New object larger
        System.out.println ( "New object larger testing " );
        FederalTaxSSN p33 = new FederalTaxSSN ( "323-56-0822" , 50000.0 );
        boolean a33 = FederalTaxSSN.getHighestTaxObject ( ).toString ( ).equals ( "SSN: 323-56-0822 Taxable Income: $50,000.00" );
        if ( a33 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + FederalTaxSSN.getHighestTaxObject ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // New object equal
        System.out.println ( "New object equal testing " );
        FederalTaxSSN p34 = new FederalTaxSSN ( "123-45-6789" , 50000.0 );
        boolean a34 = FederalTaxSSN.getHighestTaxObject ( ).toString ( ).equals ( "SSN: 323-56-0822 Taxable Income: $50,000.00" );
        if ( a34 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + FederalTaxSSN.getHighestTaxObject ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // New object smaller
        System.out.println ( "New object smaller testing " );
        FederalTaxSSN p35 = new FederalTaxSSN ( "111-22-3333" , 49999. );
        boolean a35 = FederalTaxSSN.getHighestTaxObject ( ).toString ( ).equals ( "SSN: 323-56-0822 Taxable Income: $50,000.00" );
        if ( a35 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + FederalTaxSSN.getHighestTaxObject ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        // new object larger
        System.out.println ( "new object larger testing  " );
        FederalTaxSSN p36 = new FederalTaxSSN ( "444-44-4444" , 50001. );
        boolean a36 = FederalTaxSSN.getCount ( ) == 3; // Change the expected count to 3
        if ( a36 ) System.out.println ( "PASSED" );
        else {
            System.out.println ( "FAILED " + FederalTaxSSN.getCount ( ) );
            allTestsPassed = false;
        }


        System.out.println ( );
        System.out.println ( "The result of al test are " + ( a0 && a32 && a32 && a33 && a34 && a35 ) );
    }
}