import java.text.DecimalFormat;
public class Zoning {
    // Class Constants
    DecimalFormat twoDec = new DecimalFormat("#.##");
    public static final String ZONING_R1 = "R1";
    public static final String ZONING_R2 = "R2";
    public static final String ZONING_R3 = "R3";
    public static final String ZONING_R4 = "R4";
    public static final String ZONING_R5 = "R5";

    private static final double DEFAULT_LENGTH = 125.0;
    private static final double DEFAULT_WIDTH = 25.0;

    // Instance Attributes
    private double length;
    private double width;
    private double lotArea;

    // Constructors
    public Zoning() {
        this.length = DEFAULT_LENGTH;
        this.width = DEFAULT_WIDTH;
        calculateLotArea();
    }

    public Zoning(double length, double width) {
        setLength(length);
        setWidth(width);
        calculateLotArea();
    }

    // Accessors
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getLotArea() {
        return lotArea;
    }

    // Mutators
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
            calculateLotArea();
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
            calculateLotArea();
        }
    }

    // Helper method to calculate lot area
    private void calculateLotArea() {
        this.lotArea = length * width;
    }

    // Method to compute height limit based on zoning rules
    public double heightLimit() {
        if (lotArea <= 2000.0) {
            return 25.0;
        } else if (lotArea <= 2500.0) {
            return 25.0 + Double.parseDouble(twoDec.format((0.02) * (lotArea - 2000.0)));
        } else if (lotArea <= 3500.0) {
            return 35.0 + 0.01 * (lotArea - 2500.0);
        } else if (lotArea <= 5000.0) {
            return 45.0 + 0.005 * (lotArea - 3500.0);
        } else {
            return 52.5 + 0.0025 * (lotArea - 5000.0);
        }
    }

    // Method to compute unit count limit based on zoning rules
    public int unitCountLimit() {
        if (lotArea <= 2000.0) {
            return 1;
        } else if (lotArea <= 2500.0) {
            return 2;
        } else if (lotArea <= 3500.0) {
            return 2;
        } else if (lotArea <= 5000.0) {
            return 3;
        } else {
            return 4;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Length:" + length + " Width:" + width;
    }

}